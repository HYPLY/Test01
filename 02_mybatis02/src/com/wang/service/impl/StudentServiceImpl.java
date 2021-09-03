package com.wang.service.impl;

import com.wang.dao.StudentDao;
import com.wang.dao.impl.StudentDaoImpl;
import com.wang.domain.Student;
import com.wang.service.StudentService;

/**
 * Author 北京动力节点
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public Student getById(String id) {

        Student s = studentDao.getById(id);

        return s;
    }

    @Override
    public void save(Student s) {

        studentDao.save(s);

    }
}
