package com.wang.Dao;

import com.wang.domain.Student;

public interface StudentDao {
    public Student getById(String id);

    public void save(Student s);

}
