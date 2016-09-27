/**
 * 
 */
package com.training.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.DonorDaoImpl;
import com.training.domain.Donor;
import com.training.domain.Project;

/**
 * @author hgarg1
 *
 */
@Controller
public class DonorController {
  
  @Autowired
  public ModelAndView mdlView;
  
  @Autowired
  private Donor donor;
  
  @Autowired
  private DonorDaoImpl donorDao;
  
  private ModelAndView selectTag() {  
  ModelAndView mav = new ModelAndView("project-form");  
    
  Map<Long, String > projects = new HashMap<Long, String>();  
  projects.put(101L, "CancerCure");  
 
  mav.addObject("projectsMap", projects);  
  
    
  return mav;  
}  
  
  @RequestMapping(method = RequestMethod.GET)
  public ModelAndView initForm(){
  
  mdlView.setViewName("AddDonor");
  
  mdlView.addObject("command", donor);
  
  return mdlView;
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public String onSubmit(@ModelAttribute("donorAdded") Donor donor, Model mdl)
  {
    
    try{
        Object rowAdded = donorDao.add(donor);
        mdl.addAttribute("rowAdded",rowAdded);
    }
    catch(DuplicateKeyException e)
    {
      throw e;
    }
    return "ShowDonor";
  }

}
