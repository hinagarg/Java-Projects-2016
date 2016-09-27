/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class ContactAddress {
  
  private Address contactAddress;
  private String contactPhone;
  private String contactEmail;
  /**
   * 
   */
  public ContactAddress() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param contactAddress
   * @param contactPhone
   * @param contactEmail
   */
  public ContactAddress(Address contactAddress, String contactPhone, String contactEmail) {
  super();
  this.contactAddress = contactAddress;
  this.contactPhone = contactPhone;
  this.contactEmail = contactEmail;
  }
  /**
   * @return the contactAddress
   */
  public Address getContactAddress() {
  return contactAddress;
  }
  /**
   * @param contactAddress the contactAddress to set
   */
  public void setContactAddress(Address contactAddress) {
  this.contactAddress = contactAddress;
  }
  /**
   * @return the contactPhone
   */
  public String getContactPhone() {
  return contactPhone;
  }
  /**
   * @param contactPhone the contactPhone to set
   */
  public void setContactPhone(String contactPhone) {
  this.contactPhone = contactPhone;
  }
  /**
   * @return the contactEmail
   */
  public String getContactEmail() {
  return contactEmail;
  }
  /**
   * @param contactEmail the contactEmail to set
   */
  public void setContactEmail(String contactEmail) {
  this.contactEmail = contactEmail;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "ContactAddress [contactAddress=" + contactAddress + ", contactPhone=" + contactPhone + ", contactEmail="
      + contactEmail + "]";
  }
  
  
  
}
