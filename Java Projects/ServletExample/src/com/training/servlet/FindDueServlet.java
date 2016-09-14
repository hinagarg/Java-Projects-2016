package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.DueCalculator;



/**
 * Servlet implementation class FindDueServlet
 */
public class FindDueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	 public static final Logger log = Logger.getLogger("MyLogger");
    /* (non-Javadoc)
     * @see javax.servlet.GenericServlet#destroy()
     */
	 
	 public FindDueServlet() {
   super();
   // TODO Auto-generated constructor stub
   
   log.info("Servlet Initialized");
}
	 
    @Override
    public void destroy() {
    // TODO Auto-generated method stub
    log.info("servlet destroyed");
    }

    /* (non-Javadoc)
     * @see javax.servlet.GenericServlet#init()
     */
    @Override
    public void init() throws ServletException {
    // TODO Auto-generated method stub
    super.init();
    }

   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strPhoneNumber = request.getParameter("phoneNumber");
		
		Long phoneNumber = Long.parseLong(strPhoneNumber);
		
		DueCalculator calc = new DueCalculator();
		
		Double amountDue = calc.findDue(phoneNumber);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//out.println("<b> PhoneNumber =: <b>" + phoneNumber);
		
		//out.println("<b> Amount Due:= <b>" + amountDue);
		out.println(amountDue);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
