package day07.继承测试;

public class Person {
    private String name;
    private int age;
    public int getAge(){
        return age;
    }

}
class Aa{
    public static void main(String[] args) {
        Person person = new Person();

    }
    public void aa(){
        Person person = new Person();
        int age = person.getAge();
    }
    Person person = new Person();
//    person.getAge();
}


