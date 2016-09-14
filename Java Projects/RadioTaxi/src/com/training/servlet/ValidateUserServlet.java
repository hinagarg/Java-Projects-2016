package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.training.domain.TaxiUser;
import com.training.models.ValidateUserBean;

/**
 * Servlet implementation class ValidateUserServlet
 */
public class ValidateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
	 log.debug("Inside ValidateUserServlet");
	 HttpSession session = request.getSession();
	 log.debug("Is it New Session" + session.isNew());
   log.debug("Session Id" + session.getId());
	 String password = request.getParameter("password");
   String email = request.getParameter("email");
   String city = request.getParameter("city");
  
   
   ValidateUserBean service = new ValidateUserBean();
   log.debug("servelt" + email);
   TaxiUser result = service.validate(email, password, city);
   
   //String user = (String) session.getAttribute(name);
  
   System.out.println(result);
   if(result.getName() != null ){
     
     session.setAttribute("isUserLoggedIn","true");
     log.debug("in-servlet-true");
     session.setAttribute("name",result.getName());
     session.setAttribute("telephone",result.getTelephone());
     
     //response.sendRedirect(request.getContextPath() + "/Booking.jsp");
     RequestDispatcher dispatcher = request.getRequestDispatcher("Booking.jsp");
     
     dispatcher.forward(request, response);
   }
   
   else {
     
     log.debug("in-servlet-false");
     
     RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
     
     dispatcher.forward(request, response);
   }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
