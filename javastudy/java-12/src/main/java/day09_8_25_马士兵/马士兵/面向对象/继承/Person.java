package day09_8_25_马士兵.马士兵.面向对象.继承;

//泛化也就是继承
public class Person {
    private String name;
    private boolean gender;
    protected int age;

//    public Person() {
//    }

    public Person(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void move(){
        System.out.println(name+"走路");
    }
    public void say(){
        System.out.println(name+"说话");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
