package day07.继承测试;

class Shape {
    void draw() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }
}
public class TestShape{
    public static void main(String[] args) {
        //继承 重写 父类的引用指向子类对象
        Shape circle = new Circle();
        circle.draw();
    }
}

