package java8新特性.日期时间API;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class java8TesterWithZoon {
    public static void main(String args[]){
        java8TesterWithZoon java8tester = new java8TesterWithZoon();
        java8tester.testZonedDateTime();
        }

        public void testZonedDateTime(){

            // 获取当前时间日期
            ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
            System.out.println("date1: " + date1);

            ZoneId id = ZoneId.of("Europe/Paris");
            System.out.println("ZoneId: " + id);

            ZoneId currentZone = ZoneId.systemDefault();
            System.out.println("当期时区: " + currentZone);
        }
    }