package com.bjpower.dao;

import com.bjpower.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    //增加
    int addStudent(Student student);
    //查询
//    void selectStudent(int id);
    List<Student> selectStudents();


//    //删除
//    int deleteStudentById(int id);
//
//    //修改
//    int updateStudent(Student student);
}
