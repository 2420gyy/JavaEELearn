package day11_9_30尚硅谷java高级._04java集合.set;

import java.util.Objects;

public class User implements Comparable{
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        //按姓名从小到大
        if(o instanceof User){
            User user = (User)o;
//            return this.name.compareTo(user.name);
            int compare = this.name.compareTo(user.name);
            if(compare!=0){
                return compare;
            }else {
//                年龄从小到大
                return Integer.compare(this.age,user.age);
            }
        }else {
            throw new RuntimeException("输入类型不匹配");
        }
    }
}

