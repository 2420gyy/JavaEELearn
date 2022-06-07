package day09_8_25_马士兵.马士兵.面向对象.继承;

public class Student extends Person {
    private double score;


    public Student() {
//        父类没有无参构造则必须显示声明
        super(null,false,0);
    }

    public Student(String name, boolean gender, int age, double score) {
        super(name, gender, age);
        this.score = score;
//        只能访问父类非私有的属性
        this.age = age;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("在子类改写方法");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }
}
