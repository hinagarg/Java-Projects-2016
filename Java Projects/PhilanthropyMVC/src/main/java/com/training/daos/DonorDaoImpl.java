/**
 * 
 */
package com.training.daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.domain.Donor;
import com.training.ifaces.MyDonorDAO;

/**
 * @author hgarg1
 *
 */
@Service
public class DonorDaoImpl implements MyDonorDAO<Donor>{
  
  @Autowired
  HibernateTemplate template;

  public List<Donor> find(Serializable key) {
  
    List<Donor> donorList = new ArrayList<Donor>();
    String hql = "FROM Donor WHERE projectid = "+key;
    donorList = (List<Donor>) template.find(hql);  
    return (List<Donor>) donorList;
  }

  @Override
  public Object add(Donor t) {
  // TODO Auto-generated method stub
  return null;
  }



}
