package com.edu.test;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet("/addInfo") web.xml mapping ����
public class AdditionalInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Request ������� Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>�߰����� ��û ����</h3>");
		out.print("Request Method : " + req.getMethod() + "<br/>");  //��û���
		out.print("Path Info : " + req.getPathInfo() + "<br/>"); //
		out.print("Path Translated : " + req.getPathTranslated() + "<br/>");
		out.print("Query String : " + req.getQueryString() + "<br/>"); //url���� ?��ȣ ������ �ִ� ���ڿ� ��ü�� ����
		out.print("Content Length : " + req.getContentLength() + "<br/>");
			/* 
			     ��û���� ��ü�� �ִ� �������� ���� ����
			     �ּ� �ٿ� URL�� �Է��ϸ� GET������� ��û.
			   GET����� ��û�� �����ϴ� �����͸� ��û������ ����� ���Խ�Ŵ.
			     �� GET����� ��û������ ��ü���� �ƹ��� �����͵� ����
			   	getContentLength() -1 ��ȯ
			   	getContentType() null ��ȯ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      			   
			 */
		out.print("Content Type : " + req.getContentType() + "<br/>"); //��û���� ��ü�� �ִ� �������� ����Ÿ���� ����
		out.print("</body></html>");

		out.close();
		
	}
}
