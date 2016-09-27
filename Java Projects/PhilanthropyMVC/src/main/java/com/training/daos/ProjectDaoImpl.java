/**
 * 
 */
package com.training.daos;

import java.io.Serializable;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.domain.Project;
import com.training.ifaces.MyDAO;

/**
 * @author hgarg1
 *
 */
@Service
public class ProjectDaoImpl implements MyDAO<Project>{
  
  @Autowired
  HibernateTemplate template;

  public  Object add(Project Object) {
    Object key = template.save(Object);
    return key;
  }

  public Project find(Serializable key) {
    Project obj = null;
    obj = (Project)template.get(Project.class,key); 
    return obj;
  }
  
  @Override
  public List<Project> findAll() {
       
  List<Project> projList;
  
  projList = (List<Project>) template.loadAll(Project.class);
  
  return projList;
  }



}
