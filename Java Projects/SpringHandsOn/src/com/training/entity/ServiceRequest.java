/**
 * 
 */
package com.training.entity;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
/**
 * @author hgarg1
 *
 */
@Component
public class ServiceRequest {

  private long requestId;
  
  @NotEmpty(message = "Description must not be blank.")
  private String description;
  @NotNull
  private long customerId; 
  @NotEmpty(message = "Select a Request Type.")
  private List<String> requestType;
  /**
   * 
   */
  public ServiceRequest() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param requestId
   * @param description
   * @param customerId
   * @param requestType
   */
  public ServiceRequest(long requestId, String description, long customerId, List<String> requestType) {
  super();
  this.requestId = requestId;
  this.description = description;
  this.customerId = customerId;
  this.setRequestType(requestType);
  }
  /**
   * @return the requestId
   */
  public long getRequestId() {
  return requestId;
  }
  /**
   * @param requestId the requestId to set
   */
  public void setRequestId(long requestId) {
  this.requestId = requestId;
  }
  /**
   * @return the description
   */
  public String getDescription() {
  return description;
  }
  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
  this.description = description;
  }
  /**
   * @return the customerId
   */
  public long getCustomerId() {
  return customerId;
  }
  /**
   * @param customerId the customerId to set
   */
  public void setCustomerId(long customerId) {
  this.customerId = customerId;
  }
  public List<String> getRequestType() {
  return requestType;
  }
  public void setRequestType(List<String> requestType) {
  this.requestType = requestType;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "ServiceRequest [requestId=" + requestId + ", description=" + description + ", customerId=" + customerId
      + ", requestType=" + requestType + "]";
  }
  
  
  
  
}
