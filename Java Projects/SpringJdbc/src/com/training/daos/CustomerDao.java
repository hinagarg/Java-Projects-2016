/**
 * 
 */
package com.training.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.training.entity.Customer;
import com.training.ifaces.MyDao;

/**
 * @author hgarg1
 *
 */

@Component("dao")
public class CustomerDao implements MyDao<Customer> {
  
  @Autowired
  BeanPropertyRowMapper<Customer> mapper;
  
  @Autowired
  private JdbcTemplate template;
  
  @Override
  public int add(Customer object) {
  // TODO Auto-generated method stub
  
  String sql = "insert into Customer values(? , ?, ? ,?)";
  
  int rowInserted = template.update(sql, object.getCustomerNumber(), object.getCustomerName(), object.getEmail(), object.getPhoneNumber());
  return rowInserted;
  }
  
  public Customer find(long key){
  
    String sql = "select * from customer where customerNUmber = ?";
  
    Customer cust = template.queryForObject(sql, mapper, key);
  
    return cust;
  }

  @Override
    public List<Customer> findAll() {
        
    
    String sql = "select * from customer";
    
    List<Customer> custList = template.query(sql, mapper);
    
    return custList;
    }

}
