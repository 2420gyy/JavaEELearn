import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IdUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addInitBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        //sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();//这里看着简单，但是自己不会
        //select * from mybatis.blog WHERE title = ? and author = ?
        map.put("title", "java");//select * from mybatis.blog WHERE title = ?
        map.put("author", "狂神说");//where 可以匹配和去除and，不用会错
        //hashmap 为什么是这个，接口中的方法，传的是这个？？
        //blog用的是list类型，
        //类中——————一串东西，
        //接口中------- List<Blog> queryBlogIf(Map map);
        //想写更多查询，使用重载，添加更多值？？？不能重载？？？？
        List<Blog> blogs = mapper.queryBlogIf(map);//这里也是。。。！！！！！
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        HashMap map2 = new HashMap();
        map2.put("title", "java");//select * from mybatis.blog WHERE title = ?
        map2.put("views", 9999);//当第一个满足时就直接结束，
        List<Blog> blogs2 = mapper.queryBlogChoose(map2);
        for (Blog blog : blogs2) {
            System.out.println(blog);
        }

        HashMap map3 = new HashMap();
        map3.put("title", "java2");//智能去逗号
        map3.put("author", "狂神说");//上面和这个必须有一个
        map3.put("id", "46da052d02134ec4987153c7a5ee2d36");//update mybatis.blog where id = ?   报错！！！！
        mapper.updataBlog(map3);

        sqlSession.close();

    }

    @Test
    public void queryBlogIf2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title", "java2");

        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void seBlogByForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        map.put("ids", ids);
        List<Blog> blogs = mapper.seBlogbyforeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
