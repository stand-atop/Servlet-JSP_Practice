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
		out.print("<head><title>Request 정보출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("Request URI : " + req.getRequestURI() + "<br/>"); //요청정보 헤더 첫째줄의 두번째 정보인 URI
		out.print("Request URL : " + req.getRequestURL() + "<br/>"); //요청 URL
		out.print("Context Path : " + req.getContextPath() + "<br/>"); //웹 애플리케이션의 경로
		out.print("Request Protocl : " + req.getProtocol() + "<br/>"); //프로토콜 정보
		out.print("Servlet Path : " + req.getServletPath() + "<br/>"); //웹 애플리케이션 기준 서블릿 경로
		out.print("</body></html>");

		out.close();
		
	}
	
}
