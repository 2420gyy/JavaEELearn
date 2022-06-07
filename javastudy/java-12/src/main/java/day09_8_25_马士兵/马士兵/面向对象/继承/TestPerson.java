package day09_8_25_马士兵.马士兵.面向对象.继承;

public class TestPerson {
    public static void main(String[] args) {


        Student student = new Student("学生小明", false, 12, 89.9);

        student.say();

        System.out.println(student.toString());

    }
}
