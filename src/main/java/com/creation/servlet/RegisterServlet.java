package com.creation.servlet;

import java.io.IOException;

import javax.persistence.Index;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;

import com.creation.conn.HibernateUtil;
import com.creation.dao.EmpDao;
import com.creation.entity.Emp;



@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		String department = req.getParameter("department");
		String salary = req.getParameter("salary");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Emp emp = new Emp(name, department, salary , email, password);
		System.out.println(emp);
		
		EmpDao dao = new EmpDao(HibernateUtil.getSessionFactory());
		
		boolean f= dao.saveEmp(emp);
		
		HttpSession session = req.getSession();
		
		if (f) {
			session.setAttribute("msg", "Employee Registered Successfully");
			System.out.println("Employee Registered Successfully");
		}else {
			session.setAttribute("msg", "Something went wrong on server");

			System.out.println("Something went wrong on server");
		}
		
		resp.sendRedirect("index.jsp");
	}
	
}
