/**
 * 
 */
package com.training.tags;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;


/**
 * @author hgarg1
 *
 */
public class GreetingTag extends TagSupport {
  
  private String message;
  private static Logger log = Logger.getLogger("mylogger");

  /**
   * 
   */
  public GreetingTag() {
  super();
  // TODO Auto-generated constructor stub
  
  log.info("Greeting Tag initialized");
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.message = message;
    log.info("Setter Method Called");
  }

  /* (non-Javadoc)
   * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
   */
  @Override
  public int doStartTag() throws JspException { //IOException
  // TODO Auto-generated method stub
    JspWriter out = pageContext.getOut();
    try{
    if(message!=null)
    {
      out.println(message);
      
    }
    
    else{
      
      out.println("Welcome To Tag Programming");
    }
    
    
  }

  
  catch (Exception e){
    
    e.printStackTrace();
  }
    return Tag.SKIP_BODY;

  }

}
