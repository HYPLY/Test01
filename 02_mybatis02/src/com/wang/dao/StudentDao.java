package com.wang.dao;

import com.wang.domain.Student;

/**
 * Author 北京动力节点
 */
public interface StudentDao {

    public Student getById(String id);

    public void save(Student s);

}
