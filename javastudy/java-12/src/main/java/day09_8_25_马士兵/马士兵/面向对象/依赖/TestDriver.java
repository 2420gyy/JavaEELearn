package day09_8_25_马士兵.马士兵.面向对象.依赖;

public class TestDriver {
    public static void main(String[] args) {
//      依赖关系
        Driver driver = new Driver();
        Car car = new Car();
        //驾驶汽车
        driver.drive(car);
    }
}
