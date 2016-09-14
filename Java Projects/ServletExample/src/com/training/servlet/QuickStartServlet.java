package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuickStartServlet
 */

public class QuickStartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	 private static final Logger log = Logger.getLogger("myLogger");
	 
    public QuickStartServlet() {
        super();
        // TODO Auto-generated constructor stub
        log.info("QuickStart Servlet Initialized");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	  
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("My Frst Servlet");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 style = 'text-align:center;'>Welcome to Servlet Programming</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
