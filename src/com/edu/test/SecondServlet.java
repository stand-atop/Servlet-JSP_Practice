package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/second") //���� ������ ���� uri�� "/second"�� ����
public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		System.out.println("SecondServlet!!");
		//init() �޼ҵ带 ���������� �ʾ� GenericServlet Ŭ������ init()�޼ҵ� ����
		//-> ���� service() �޼ҵ带 ���������� �ʾƼ� HttpServlet Ŭ������ service(ServletRequest, ServletResponse) �޼ҵ尡 ����
		//-> service(ServletRequest, ServletResponse)�� ���� HttpServlet Ŭ������ service(HttpServletRequest, HttpServletResponse) �޼ҵ� ȣ��
		//-> service(HttpServletRequest, HttpServletResponse)�� SecondeServlet Ŭ������ doGet() �޼ҵ带 ȣ��
		
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Test</title></head>");
		out.print("<body><h1>Have a nice day!!</h1></body>");
		out.print("</html>");
		out.close();
	}
}
