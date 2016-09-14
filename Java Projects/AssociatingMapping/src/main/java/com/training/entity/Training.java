/**
 * 
 */
package com.training.entity;

import java.util.Set;

/**
 * @author hgarg1
 *
 */
public class Training {
  
  /**
   * @param trainingCode
   * @param trainerName
   * @param particpants
   * 
   
   */
  
  private int trainingCode;
  private String trainerName;
  
  private Set<Participant> particpants;
  public Training(int trainingCode, String trainerName, Set<Participant> particpants) {
  super();
  this.trainingCode = trainingCode;
  this.trainerName = trainerName;
  this.particpants = particpants;
  }

  /**
   * 
   */
  public Training() {
  super();
  // TODO Auto-generated constructor stub
  }

  /**
   * @return the trainingCode
   */
  public int getTrainingCode() {
  return trainingCode;
  }

  /**
   * @param trainingCode the trainingCode to set
   */
  public void setTrainingCode(int trainingCode) {
  this.trainingCode = trainingCode;
  }

  /**
   * @return the trainerName
   */
  public String getTrainerName() {
  return trainerName;
  }

  /**
   * @param trainerName the trainerName to set
   */
  public void setTrainerName(String trainerName) {
  this.trainerName = trainerName;
  }

  /**
   * @return the particpants
   */
  public Set<Participant> getParticpants() {
  return particpants;
  }

  /**
   * @param particpants the particpants to set
   */
  public void setParticpants(Set<Participant> particpants) {
  this.particpants = particpants;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Training [trainingCode=" + trainingCode + ", trainerName=" + trainerName + ", particpants=" + particpants
      + "]";
  }
  
  
  
}
