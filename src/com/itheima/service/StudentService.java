package com.itheima.service;

import com.itheima.domain.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * 这是学生的业务处理规则
 */
public interface StudentService {
    /**
     * 查询所有学生
     * @return List<Student>
     */
    List<Student> findAll() throws SQLException;

}
