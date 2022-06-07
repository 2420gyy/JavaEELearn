package com.bjpower.service;

import com.bjpower.dao.StudentDao;
import com.bjpower.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StduentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public List<Student> selectStudents() {
        return studentDao.selectStudents();
    }
}
