package day11_9_30尚硅谷java高级._04java集合.Map;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //放到主目录下面
        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        properties.load(fileInputStream);//加载配置文件
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(username+password);


    }
}
