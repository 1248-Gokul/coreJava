package com.chainsys.webapp.first;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		out.println("<html><head><title>HelloWorld</title></head><body>");
		  			out.println("<h1> <br><center>");
		  			out.println("<br>  <div class = \"main\">\r\n"
		  	                + "    <marquee class=\"marq\" bgcolor = \"pink\" direction = \"right\" loop=\"\" >\r\n"
		  	                + "        <div class=\"geek1\">Gokul</div>\r\n"
		  	                + "        <div class=\"geek2\">request is input stream and response the output Stream</div>\r\n"
		  	                + "    </marquee>\r\n"
		  	                + "    </div>"+"<img src=\"D:\\gokul3159.jpg\" width=\"240px\" height=\"300px\"/>");
		  			out.println(" <br></center></h1></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
