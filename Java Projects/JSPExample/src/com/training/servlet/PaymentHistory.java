package com.training.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.PaymentStatus;
import com.training.models.StatusFinder;

/**
 * Servlet implementation class PaymentHistory
 */
public class PaymentHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentHistory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strPhoneNumber = request.getParameter("phoneNumber");
		
		Long key = Long.parseLong(strPhoneNumber);
		
		StatusFinder service = new StatusFinder();
		
		List <PaymentStatus> pmtHist = service.getPaymentHistory(key);
		   request.setAttribute("historyList",pmtHist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("PaymentHistory.jsp");
		
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
