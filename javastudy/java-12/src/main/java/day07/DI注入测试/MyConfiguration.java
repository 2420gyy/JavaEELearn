package day07.DI注入测试;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenchen
 * @date 2021-11-13 9:59
 */
@Configuration
public class MyConfiguration {

    @Bean
    public SvcA svcA(){
        return new SvcA();
    }

}
