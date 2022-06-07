package com.chen.demo.comfig;


import ch.qos.logback.core.db.DBHelper;
import com.chen.demo.bean.Car;
import com.chen.demo.bean.Person;
import com.chen.demo.bean.Pet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//任何容器中的组件都可以加
//返回全类名，注意在主函数中，不要重复获取组件？？
@Import({Person.class,DBHelper.class})// 给容器中自动创建出这两个类型的组件 ---bean中必须有无参构造
//单实例 full模式  true - 组件之间互相依赖
//false - lite模式，组件之间不依赖，启动快
@Configuration(proxyBeanMethods=false)//代理对象-默认是true
@ImportResource("classpath:bean.xml")//将spring配置文件重新解析
@EnableConfigurationProperties(Car.class)//必须在配置类（容器中）
//开启属性配置绑定功能-把组件自动注入到容器中 不写@Component了
public class Myconfig {

    @ConditionalOnBean(name = "tom")//当容器中有tom组件时才会注册这个组件
    @Bean
    public Person person01(){
        return new Person("xiaoming",18);
    }
    //No qualifying bean of type 'xxx' available
    @Bean
    public Pet tom(){
        return new Pet("Tom");
    }



}
