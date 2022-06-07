package java8新特性.Lambda;

/*
标志注解，被该注解修饰的接口只能声明一个抽象方法
 */
@FunctionalInterface
public interface UserService {
    void show();
}
