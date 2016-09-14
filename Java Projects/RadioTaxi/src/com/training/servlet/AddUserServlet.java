package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.training.daos.ValidateUser;
import com.training.domain.TaxiUser;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	 HttpSession session = request.getSession();
	 log.debug("Inside servlet AddUserServlet");
	 TaxiUser user = (TaxiUser)request.getAttribute("user");
	 log.debug(user);
	 ValidateUser dao = new ValidateUser();
   
   int rowAdded = dao.add(user);
   
   if(rowAdded == 1){
     request.setAttribute("rowAdded", rowAdded);
   
     RequestDispatcher dispatcher = request.getRequestDispatcher("UserAdded.jsp");
   
     dispatcher.forward(request, response);
   }
   
   else{
     
     session.setAttribute("message", "This user already exist. Try a different Email Id.");
     RequestDispatcher dispatcher = request.getRequestDispatcher("NewUser.jsp");
     
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
