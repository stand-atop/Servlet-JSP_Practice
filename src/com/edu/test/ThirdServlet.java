package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// �ѱ�ó��
@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		resp.setContentType("text/html;charset=UTF-8"); //HttpServletResponse�� setContentType()�޼ҵ� - �ѱ�ó���� �������� ����� ������
		PrintWriter out = resp.getWriter();
		out.print("<h1>���������</h1>"); //����Ÿ�� text/html, ���ڼ� 8859_1(�ѱ�ó������X)
		out.close();
		
	}
}
