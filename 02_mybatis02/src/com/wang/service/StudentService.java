package com.wang.service;

import com.wang.domain.Student;

/**
 * Author 北京动力节点
 */
public interface StudentService {

    public Student getById(String id);

    public void save(Student s);

}
