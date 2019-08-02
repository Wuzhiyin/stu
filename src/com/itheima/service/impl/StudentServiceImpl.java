package com.itheima.service.impl;

import com.itheima.dao.StudentDao;
import com.itheima.dao.impl.StudentDaoImpl;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;

import java.sql.SQLException;
import java.util.List;

/**
 * 这是学生业务实现
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAll() throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findAll();
    }
}
