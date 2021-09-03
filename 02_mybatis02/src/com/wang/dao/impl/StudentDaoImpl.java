package com.wang.dao.impl;

import com.wang.dao.StudentDao;
import com.wang.domain.Student;
import com.wang.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Author 北京动力节点
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getById(String id) {

        SqlSession session = SqlSessionUtil.getSession();

        Student s = session.selectOne("test1.getById", id);

        return s;
    }

    @Override
    public void save(Student s) {

        SqlSession session = SqlSessionUtil.getSession();

        session.insert("test1.save", s);



    }
}




























