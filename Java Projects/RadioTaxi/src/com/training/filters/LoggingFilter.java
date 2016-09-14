package com.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoggingFilter
 */
public class LoggingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
	 /*HttpServletRequest request1 = (HttpServletRequest) request;
   HttpServletResponse response1 = (HttpServletResponse) response;
 
   HttpSession session = request1.getSession(false);
   String loginURI = request1.getContextPath() + "/index.jsp";
   log.debug("in filter" + loginURI);
   log.debug("session values is" + session);
   //System.out.println("user logged in:  " + session.getAttribute("isUserLoggedIn"));
   //boolean loggedIn = session != null  && session.getAttribute("isUserLoggedIn") != null;
   
   boolean loginRequest = request1.getRequestURI().equals(loginURI);
   //System.out.println(loggedIn);
   log.debug(loginRequest);
  if ((session != null  && session.getAttribute("isUserLoggedIn") != null) || loginRequest) {
      
      System.out.println("session value :  " + session);
      //System.out.println("user logged in:  " + session.getAttribute("isUserLoggedIn"));
      log.debug("in-if");
      log.debug(request1.getRequestURI());
      log.debug(((HttpServletRequest) request).getRequestURI());
      chain.doFilter(request1, response1);
  } else {
    System.out.println("in-else");
      response1.sendRedirect(loginURI);
  }*/
	  chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
