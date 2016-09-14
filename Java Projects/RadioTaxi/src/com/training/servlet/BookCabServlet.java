package com.training.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.training.daos.CabAvailabilityDao;
import com.training.domain.Cab;
//import com.training.domain.TaxiUser;
//import com.training.models.ValidateUserBean;

/**
 * Servlet implementation class BookCabServlet
 */
public class BookCabServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookCabServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  
	  log.debug("Inside Servlet BookCabServlet");
	  CabAvailabilityDao dao = new CabAvailabilityDao();
	  HttpSession session = request.getSession();
	  log.debug("Is it New Session" + session.isNew());
    log.debug("Session Id" + session.getId());
    session.setAttribute("Error", "Session has ended.  Please login.");
	  String pickUpLocation = request.getParameter("pickUpLocation");
	  String dropLocation = request.getParameter("dropLocation");
 
  
	  List<Cab> cab = dao.find(pickUpLocation, dropLocation);
	  
  
  //String user = (String) session.getAttribute(name);
 
  
	  if(cab.size() != 0){
   
    session.setAttribute("cab", cab);
    session.setAttribute("isUser", "true");
    RequestDispatcher dispatcher = request.getRequestDispatcher("CabAvailability.jsp");
    
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
