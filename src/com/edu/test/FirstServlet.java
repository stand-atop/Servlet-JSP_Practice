package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet; //언노테이션 지정
import javax.servlet.http.*;

@WebServlet("/hello2")
public class FirstServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() 실행됨! : 서블릿이 최초로 호출되었을 때 한 번만 실행 - 서블릿의 초기화 작업 담당!!");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException{
		System.out.println("service() 실행됨! : 요청이 있을 때마다 매번 실행 - 요청이 있을 때마다 실행되어야 하는 내용 구현!!");
	}
	
}
