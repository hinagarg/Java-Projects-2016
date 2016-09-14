package com.training.entity;

public class Participant {

  
  private long participantCode;
  private String participantName;
  /**
   * 
   */
  public Participant() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param participantCode
   * @param participantName
   */
  public Participant(long participantCode, String participantName) {
  super();
  this.participantCode = participantCode;
  this.participantName = participantName;
  }
  /**
   * @return the participantCode
   */
  public long getParticipantCode() {
  return participantCode;
  }
  /**
   * @param participantCode the participantCode to set
   */
  public void setParticipantCode(long participantCode) {
  this.participantCode = participantCode;
  }
  /**
   * @return the participantName
   */
  public String getParticipantName() {
  return participantName;
  }
  /**
   * @param participantName the participantName to set
   */
  public void setParticipantName(String participantName) {
  this.participantName = participantName;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Participant [participantCode=" + participantCode + ", participantName=" + participantName + "]";
  }
  
  
}
