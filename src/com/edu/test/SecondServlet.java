package com.edu.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second") //서블릿 실행을 위한 uri를 "/second"로 설정
public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("SecondServlet!!");
		//init() 메소드를 재정의하지 않아 GenericServlet 클래스의 init()메소드 실행
		//-> 이후 service() 메소드를 재정의하지 않아서 HttpServlet 클래스의 service(ServletRequest, ServletResponse) 메소드가 실행
		//-> service(ServletRequest, ServletResponse)로 인해 HttpServlet 클래스의 service(HttpServletRequest, HttpServletResponse) 메소드 호출
		//-> service(HttpServletRequest, HttpServletResponse)가 SecondeServlet 클래스의 doGet() 메소드를 호출
	}
}
