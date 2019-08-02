package com.itheima.dao;

import com.itheima.domain.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * 这是针对学生表的数据访问
 */
public interface StudentDao {
    /**
     * 查询所有学生
     * @return List<Student>
     */
    List<Student> findAll() throws SQLException;
}
