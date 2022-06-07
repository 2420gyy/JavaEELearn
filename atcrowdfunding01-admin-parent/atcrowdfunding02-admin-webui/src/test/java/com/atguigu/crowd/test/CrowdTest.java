package com.atguigu.crowd.test;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.service.api.AdminService;
import mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

// 指定Spring 给Junit 提供的运行器类
@RunWith(SpringJUnit4ClassRunner.class)
// 加载Spring 配置文件的注解
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class CrowdTest {
    @Autowired
    private DataSource dataSource;

    public CrowdTest() {
    }

    @Test
    public void testDataSource() throws SQLException {
        // 1.通过数据源对象获取数据源连接
        //Connection connection = dataSource.getConnection();
        Connection connection = dataSource.getConnection();
        // 2.打印数据库连接
        System.out.println(dataSource.getConnection());//com.mysql.jdbc.JDBC4Connection@15c25153
    }
    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testInsertAdmin() {
//        这里自动提示什么鬼？？ 注意有参构造方法
//        Admin admin = new Admin(null, "tom", "123123", "汤姆", "tom@qq.com", null);
//        int count = adminMapper.insert(admin);
//        System.out.println("插入行数： " + count);
//        System.out.println("##############################################");

        //spring-beans 加入了核心包的子包，不行（版本太高了）

//        没有无参构造方法
        //https://blog.csdn.net/qq_18625571/article/details/107318383
        Admin admin1 = adminMapper.selectByPrimaryKey(1);
//        IO操作，影响性能，上线麻烦，使用日志级别批量控制输出
        System.out.println(admin1.toString());
        System.out.println("##############################################");


//22:26:22.213 [main] INFO com.alibaba.druid.pool.DruidDataSource - {dataSource-1} inited
//Admin{id=1, loginAcct='chenchen', userPswd='123456', userName='陈晨', email='2420191325@qq.com', createTime='2021/4/7'}
//##############################################
//22:26:22.577 [Thread-0] INFO com.alibaba.druid.pool.DruidDataSource - {dataSource-1} closed
    }

    @Test
    public void testLog(){
//        这里传入的Class对象就是当前打印日志的类
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);
        //根据不同的日志级别打印
        logger.debug("Debug level!!!");
        logger.debug("Debug level!!!");
        logger.debug("Debug level!!!");

        logger.info("Info level!!!");
        logger.info("Info level!!!");
        logger.info("Info level!!!");

        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");

        logger.error("Error level!!!");
        logger.error("Error level!!!");
        logger.error("Error level!!!");
    }
    @Autowired
    private AdminService adminService;

    @Test
    public void testTx(){
        Admin admin = new Admin(null, "jerry", "123456", "杰瑞", "jerry@qq.com", null);
        adminService.saveAdmin(admin);
//        没有回滚？？？？
        throw new RuntimeException();
    }
}
