package com.wang.service.impl;

import com.wang.dao.StudentDao;
import com.wang.domain.Student;
import com.wang.service.StudentService;
import com.wang.util.SqlSessionUtil;

import java.util.List;

/**
 * Author 北京动力节点
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {

        Student s = studentDao.getById(id);

        return s;
    }

    @Override
    public void save(Student s) {

        studentDao.save(s);

    }

    @Override
    public List<Student> getAll() {

        List<Student> sList = studentDao.getAll();

        return sList;
    }
}
