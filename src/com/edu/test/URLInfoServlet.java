package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Request ������� Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>��û ��İ� �������� ����</h3>");
		out.print("Request URI : " + req.getRequestURI() + "<br/>"); //��û���� ��� ù°���� �ι�° ������ URI
		out.print("Request URL : " + req.getRequestURL() + "<br/>"); //��û URL
		out.print("Context Path : " + req.getContextPath() + "<br/>"); //�� ���ø����̼��� ���
		out.print("Request Protocl : " + req.getProtocol() + "<br/>"); //�������� ����
		out.print("Servlet Path : " + req.getServletPath() + "<br/>"); //�� ���ø����̼� ���� ���� ���
		out.print("</body></html>");

		out.close();
		
	}
	
}
