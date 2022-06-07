package OnJava8.P07封装;

/**
 * @author chenchen
 * @date 2021-11-07 12:06
 */
public class Foo extends Bar{

    public void chomp(){
        run();
    }

    /**
     * 在其他包中
     * Bar bar = new Bar();
     * bar.run();
     * // bar.fly();
     * 在一个具有包访问权限的类中定义一个 public 的构造器并不能真的使这个构造器成为 public，在声明的时候就应该标记为编译时错误。
     * @param args
     */

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.chomp();
        foo.fly();
    }
}
