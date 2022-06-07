package day08.config;

import day08.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("day08")
@PropertySource("classpath:user.properties")
public class iocConfig2 {
    @Value("${user.userName}")
    private String name;

//  用于整合第三方的bean对象，第三方组件，且只需要实例化一次的bean对象
    @Bean
    public AccountDao accountDao(){
        //System.out.println(name);
        return new AccountDao();
    }
    public void test(){
        System.out.println("配置类的普通方法。。");
    }
}
