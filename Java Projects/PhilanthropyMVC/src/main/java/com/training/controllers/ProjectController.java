/**
 * 
 */
package com.training.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.ProjectDaoImpl;
import com.training.domain.Project;



/**
 * @author hgarg1
 *
 */
@Controller
@RequestMapping("/addProject")
@Import(Project.class)
public class ProjectController {
  
  
  @Autowired
  public ModelAndView mdlView;
  
  @Autowired
  private Project project;
  
  @Autowired
  private ProjectDaoImpl projectDao;
  
  /*@RequestMapping(method = RequestMethod.GET)
  public ModelAndView initForm(){
  
  mdlView.setViewName("AddProject");
  
  mdlView.addObject("command", project);
  
  return mdlView;
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public String onSubmit(@ModelAttribute("projectAdded") Project project, Model mdl)
  {
    
    try{
        Object rowAdded = projectDao.add(project);
        mdl.addAttribute("rowAdded",rowAdded);
    }
    catch(DuplicateKeyException e)
    {
      throw e;
    }
    return "Show";
  }*/
  
  @RequestMapping(method = RequestMethod.GET)
  public ModelAndView getProjects()  
  {
  
    List<Project> projectList = projectDao.findAll();
    
    mdlView.setViewName("ShowAllProjects");
    
    mdlView.addObject("projectList", projectList);
    
    return mdlView;
  }
}
