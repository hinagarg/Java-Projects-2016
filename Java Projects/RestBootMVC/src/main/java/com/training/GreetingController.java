/**
 * 
 */
package com.training;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.domains.TestReport;

/**
 * @author hgarg1
 *
 */

@RestController
public class GreetingController {
  
  HashMap<String, TestReport> reports;
  
  @PostConstruct
  public void inint(){
  
    reports = new HashMap<String, TestReport>();
    
    reports.put("Sep1601", new TestReport(101, "Ramesh", "Blood", "B+"));
    reports.put("Sep1602", new TestReport(102, "Rajest", "Sugar", "A+"));
    reports.put("Sep1603", new TestReport(103, "Ram", "Test", "C+"));
    
  }
  
  @RequestMapping("/")
  public String welcome()
  {
  
    return "Welcome to Rest";
  }
  
  
  
  
  @RequestMapping("/findAll")
  public Map<String,TestReport> getReports(){
  
    return reports;
  }
}
