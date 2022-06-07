package OnJava8.P07封装;

/**
 * @author chenchen
 * @date 2021-11-07 12:05
 */
public class Bar {
    public Bar() {
        System.out.println("bar constructor;");
    }
    public void run(){
        System.out.println("run 方法");
    }
    protected void fly(){
        System.out.println("fly 方法");
    }

}
