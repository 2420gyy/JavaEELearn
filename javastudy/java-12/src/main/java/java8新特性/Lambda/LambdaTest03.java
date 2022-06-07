package java8新特性.Lambda;

public class LambdaTest03 {
    public static void main(String[] args) {
        goStudent((name,age)->{
            return name+"的年龄是:"+age;
        });
        goOrder( name -> {
            System.out.println(name);
                }
        );
        // 替换为lambda即为上面的写法
        goOrder(new OrderService() {
            @Override
            public void show(String name) {
                System.out.println(name);
            }
        });

    }
    public static void goStudent(StudentService studentService){
        studentService.show("张三",22);
    }
    public static void goOrder(OrderService orderService){
        orderService.show("李四");
    }
}
