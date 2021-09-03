package com.wang.service.impl;

import com.wang.Dao.StudentDao;
import com.wang.Dao.impl.StudentDaoImpl;
import com.wang.domain.Student;
import com.wang.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao=new StudentDaoImpl();


    @Override
    public Student getById(String id) {
        Student s=studentDao.getById(id);
        return null;
    }

    @Override
    public void save(Student s) {

    }
}
