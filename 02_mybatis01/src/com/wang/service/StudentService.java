package com.wang.service;

import com.wang.domain.Student;

public interface StudentService {
    public Student getById(String id);

    public void save(Student s);

}
