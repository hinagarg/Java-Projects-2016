/**
 * 
 */
package com.training.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.owlike.genson.Genson;
import com.training.daos.DonorDaoImpl;
import com.training.domain.Donor;

/**
 * @author hgarg1
 *
 */
@RestController
public class DonorRestController {
  
  @Autowired
  DonorDaoImpl donorDao;
  
  @ResponseBody
  @RequestMapping(value = "getDonor/{projectId}", method = RequestMethod.GET, produces = "application/json")
  public String getDonors(@PathVariable long projectId){
    
    List<Donor> donorList = donorDao.find(projectId);
    Genson serializer = new Genson();
    String resp = serializer.serialize(donorList);
    return resp;
  }

}
