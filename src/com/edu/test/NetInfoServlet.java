package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8"); //�ѱ�ó��
		
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request ������� Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>ServletRequest : ��Ʈ��ũ ���� ��û ����</h3>");
		out.print("Request Scheme : " + req.getScheme() + "<br/>"); //Ŭ���̾�Ʈ ��������
		out.print("Server Name : " + req.getServerName() + "<br/>"); //���� ȣ��Ʈ �̸� - ������ ip
		out.print("Server Address : " + req.getLocalAddr() + "<br/>"); //���� ip
		out.print("Server Port : " + req.getServerPort() + "<br/>"); //���� ��Ʈ
		out.print("Client Address : " + req.getRemoteAddr() + "<br/>"); //Ŭ���̾�Ʈ ip
		out.print("Client Host : " + req.getRemoteHost() + "<br/>"); //Ŭ���̾�Ʈ ȣ��Ʈ �̸� - ������ ip
		out.print("Client Port : " + req.getRemotePort() + "<br/>"); //Ŭ���̾�Ʈ ��Ʈ
		out.print("</body></html>");
		out.close();	
		
	}
}

/*
�������� ���¿��� ��û ��
http://localhost:8080/Servlet_JSP/netInfo
�� �����ϸ� ����� ���������� ���� ����
http://IP:8080/Servlet_JSP/netInfo
�� ��û�ؾ� Ȯ���� �� ����
*/