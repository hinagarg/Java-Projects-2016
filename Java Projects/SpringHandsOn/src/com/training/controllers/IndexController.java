/**
 * 
 */
package com.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hgarg1
 *
 */
@Controller
public class IndexController {
  
  @RequestMapping("/")
  public String welcomePage(){
  
    return "index";
  }

}
