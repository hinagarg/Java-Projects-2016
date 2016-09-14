package com.training.servlet;

import java.io.IOException;
//import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.training.entity.PaymentStatus;
//import com.training.models.StatusFinder;
import com.training.models.ValidateBean;

/**
 * Servlet implementation class ValidateLoginServlet
 */
public class ValidateLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  String passWord = request.getParameter("passWord");
	  String userName = request.getParameter("userName");
	  
	  ValidateBean service = new ValidateBean();
	  
	  Boolean result = service.getValidateLogin(userName, passWord);
	  
	  if(result == true){
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
	    
	    dispatcher.forward(request, response);
	  }
	  
	  else if(result == false){
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("Failure.jsp");
      
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
