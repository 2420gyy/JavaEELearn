package day07;

public class Test02Private {
    public static void main(String[] args) {
        Person person = new Person("lisi",16);
//        person.setAge(18);
//        person.setName("lisi");
        System.out.println(person.getAge());

        System.out.println(person.toString());
    }
}
