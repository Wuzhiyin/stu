package com.itheima.dao.impl;

import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import com.itheima.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 这是StudentDao的实现.针对前面定义的规范,作出具体的实现.
 */
public class StudentDaoImpl implements StudentDao {
    /**
     * 查询所有的学生
     * @return
     */
    @Override
    public List<Student> findAll() throws SQLException {

        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select * from stu";
        List<Student> list = runner.query(sql,new BeanListHandler<Student>(Student.class));
        return null;
    }
}
