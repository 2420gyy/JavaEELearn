package com.kuang.pojo;

import java.util.List;

public class Teacher {
    private int id;
    private String name;
    //一个老师有多个学生
    private List<Student> students;

    public Teacher(List<Student> students) {
        this.students = students;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
