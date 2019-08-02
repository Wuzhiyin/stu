package com.itheima.servlet;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * 负责查询所有的学生信息.然后呈现到list.jsp页面上.
 *
 */
@WebServlet(name = "StudentListServlet",urlPatterns = "/studentList")
public class StudentListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            StudentService service = new StudentServiceImpl();
            List <Student> list = service.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }


}
