/**
 * 
 */
package com.training.controllers;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.dao.ServiceRequestDao;


import com.training.entity.ServiceRequest;

/**
 * @author hgarg1
 *
 */
@Controller
@RequestMapping("/addServiceRequest")
@Import(ServiceRequest.class)
public class ServiceRequestController {
  
  private static final Logger log = Logger.getRootLogger();     
  
  @Autowired
  public ModelAndView mdlView;
  
  @Autowired
  public ServiceRequest serviceRequest;
  
  @Autowired
  private ServiceRequestDao serviceRequestDao;
  
  @ModelAttribute("allRequestTypes")
  public List<String> serviceRequestTypes() 
  {
      ArrayList<String> categories = new ArrayList<String>();
      categories.add("Technical");
      categories.add("Payment Related");
      categories.add("Special Offers");
      return categories;
      
  }
  
  @RequestMapping(method = RequestMethod.GET)
  public ModelAndView initForm(){
  
    mdlView.setViewName("AddRequest");
  
    mdlView.addObject("command", serviceRequest);
  
    return mdlView;
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public String onSubmit(@ModelAttribute("ServiceRequestAdded") ServiceRequest serviceRequest, Model mdl)
  {
  
    int rowAdded = serviceRequestDao.add(serviceRequest);
    mdl.addAttribute("rowAdded",rowAdded);
    return "Show";
  }
  
  @RequestMapping(value = "showAll", method = RequestMethod.GET)
  public String findAllCustomers(Model model)
  {
  
    List<ServiceRequest> serviceRequestList = serviceRequestDao.findAll();
    
    model.addAttribute("serviceRequestList", serviceRequestList);
    
    return "ViewRequest";
  }
  
}
