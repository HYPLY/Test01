package com.wang.Dao.impl;

import com.wang.Dao.StudentDao;
import com.wang.domain.Student;

import com.wang.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {
    public Student getById(String Id){
        SqlSession session= SqlSessionUtil.getSession();
        session.selectOne("test1.getById",Id);
        return null;
    }

    @Override
    public void save(Student s) {
        SqlSession session=SqlSessionUtil.getSession();
        session.insert("test1.sqve",s);

    }
}
