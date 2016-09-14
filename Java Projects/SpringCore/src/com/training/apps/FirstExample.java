/**
 * 
 */
package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;
import com.training.domains.Patient;

/**
 * @author hgarg1
 *
 */
public class FirstExample {

  public static void main(String[] args){
  
  try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");) {
    
    
    Patient patientBean = (Patient) ctx.getBean("patBean1", Patient.class);
    //Patient patientBean2 = (Patient) ctx.getBean("patBean2", Patient.class);
    //Patient patientBean3 = (Patient) ctx.getBean("patBean3", Patient.class);
    
    System.out.println("Bean returned by IOC Container" + patientBean);
    //System.out.println("Bean returned by IOC Container" + patientBean2);
    //System.out.println("Bean returned by IOC Container" + patientBean3);
    
    //System.out.println("Hashcode of patientBean1" + patientBean.hashCode());
    
    //System.out.println(patientBean);
    
    Doctor doctor = ctx.getBean("docBean1", Doctor.class);
    Doctor doctor2 = ctx.getBean("docBean2", Doctor.class);
    Doctor doctor3 = ctx.getBean("docBean3", Doctor.class);
    
    System.out.println("Doctor :=" + doctor);
    System.out.println("Doctor :=" + doctor2.getPatientList());
    System.out.println("Doctor :=" + doctor3);
    
    System.out.println("patient :=" + patientBean);
  }
  catch(Exception e){
    
    e.printStackTrace();
  }
  }
}
