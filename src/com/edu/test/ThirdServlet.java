package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// 한글처리
@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		resp.setContentType("text/html;charset=UTF-8"); //HttpServletResponse의 setContentType()메소드 - 한글처리를 응답정보 헤더에 설정함
		PrintWriter out = resp.getWriter();
		out.print("<h1>졸려어어어어</h1>"); //문서타입 text/html, 문자셋 8859_1(한글처리지원X)
		out.close();
		
	}
}
