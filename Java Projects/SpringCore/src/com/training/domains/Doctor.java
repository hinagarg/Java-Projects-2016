/**
 * 
 */
package com.training.domains;
import java.util.HashMap;
import java.util.List;
import java.util.logging.*;
/**
 * @author hgarg1
 *
 */
public class Doctor {
  
  public static final Logger log = Logger.getLogger("doctor");
  private int doctorCode;
  private String doctorName;
  private String specialization;
  private Patient patient;
  
  private List<Patient> patientList;
  HashMap<String, String> supportStaff;
  /**
   * @return the patient
   */
  public Patient getPatient() {
  return patient;
  }
  /**
   * @param patient the patient to set
   */
  public void setPatient(Patient patient) {
  this.patient = patient;
  }
  /**
   * 
   */
  public Doctor() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param doctorCode
   * @param doctorName
   * @param specialization
   */
  public Doctor(int doctorCode, String doctorName, String specialization) {
  super();
  this.doctorCode = doctorCode;
  this.doctorName = doctorName;
  this.specialization = specialization;
  }
  /**
   * @return the doctorCode
   */
  public int getDoctorCode() {
  return doctorCode;
  }
  /**
   * @param doctorCode the doctorCode to set
   */
  public void setDoctorCode(int doctorCode) {
  this.doctorCode = doctorCode;
  }
  /**
   * @return the doctorName
   */
  public String getDoctorName() {
  return doctorName;
  }
  /**
   * @param doctorName the doctorName to set
   */
  public void setDoctorName(String doctorName) {
  this.doctorName = doctorName;
  }
  /**
   * @return the specialization
   */
  public String getSpecialization() {
  return specialization;
  }
  /**
   * @param specialization the specialization to set
   */
  public void setSpecialization(String specialization) {
  this.specialization = specialization;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", specialization=" + specialization + "]";
  }
  public List<Patient> getPatientList() {
  return patientList;
  }
  public void setPatientList(List<Patient> patientList) {
  this.patientList = patientList;
  }
 
  
  

}
