package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8"); //한글처리
		
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>ServletRequest : 네트워크 관련 요청 정보</h3>");
		out.print("Request Scheme : " + req.getScheme() + "<br/>"); //클라이언트 프로토콜
		out.print("Server Name : " + req.getServerName() + "<br/>"); //서버 호스트 이름 - 없으면 ip
		out.print("Server Address : " + req.getLocalAddr() + "<br/>"); //서버 ip
		out.print("Server Port : " + req.getServerPort() + "<br/>"); //서버 포트
		out.print("Client Address : " + req.getRemoteAddr() + "<br/>"); //클라이언트 ip
		out.print("Client Host : " + req.getRemoteHost() + "<br/>"); //클라이언트 호스트 이름 - 없으면 ip
		out.print("Client Port : " + req.getRemotePort() + "<br/>"); //클라이언트 포트
		out.print("</body></html>");
		out.close();	
		
	}
}

/*
오프라인 상태에서 요청 시
http://localhost:8080/Servlet_JSP/netInfo
로 접속하면 제대로 정보추출이 되지 않음
http://IP:8080/Servlet_JSP/netInfo
로 요청해야 확인할 수 있음
*/