package com.bjpower.service;

import com.bjpower.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    int addStudent(Student student);

    List<Student> selectStudents();
}
