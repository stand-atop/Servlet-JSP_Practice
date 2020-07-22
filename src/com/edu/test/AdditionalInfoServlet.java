package com.edu.test;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet("/addInfo") web.xml mapping 지정
public class AdditionalInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Request 정보출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print("Request Method : " + req.getMethod() + "<br/>");  //요청방식
		out.print("Path Info : " + req.getPathInfo() + "<br/>"); //
		out.print("Path Translated : " + req.getPathTranslated() + "<br/>");
		out.print("Query String : " + req.getQueryString() + "<br/>"); //url에서 ?기호 다음에 있는 문자열 전체를 추출
		out.print("Content Length : " + req.getContentLength() + "<br/>");
			/* 
			     요청정보 몸체에 있는 데이터의 길이 추출
			     주소 줄에 URL을 입력하면 GET방식으로 요청.
			   GET방식은 요청시 전달하는 데이터를 요청정보의 헤더에 포함시킴.
			     즉 GET방식은 요청정보의 몸체에는 아무런 데이터도 없음
			   	getContentLength() -1 반환
			   	getContentType() null 반환                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      			   
			 */
		out.print("Content Type : " + req.getContentType() + "<br/>"); //요청정보 몸체에 있는 데이터의 문서타입을 추출
		out.print("</body></html>");

		out.close();
		
	}
}
