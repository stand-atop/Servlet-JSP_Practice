package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Request 정보출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		
		Enumeration<String> em = req.getHeaderNames(); //Enumeration : 배열처럼 데이터 그룹으로 구성된 Collection객체, 커서가 있음. 헤더 이름만 모아 반환
		
		while (em.hasMoreElements()) { //hasMoreElements() : Enumeration 객체의 커서 다음에 데이터가 있는지 없는지 판단하여 T/F 반환. 마지막 요소에 F
			String s = em.nextElement(); //nextElement() : 커서 다음에 있는 요소를 반환하고 커서를 다음 요소로 이동시킴
			out.println(s + " : " + req.getHeader(s) + "<br/>"); //헤더 값 추출
		}
		
		out.print("</body></html>");

		out.close();
	}
	
}
