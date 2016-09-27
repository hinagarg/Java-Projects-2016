/**
 * 
 */
package com.training.ifaces;

import java.io.Serializable;
import java.util.List;

import com.training.domain.Donor;


/**
 * @author hgarg1
 *
 */
public interface MyDonorDAO<T> {
  public Object add(Donor t);
  public List<Donor> find(Serializable s);
}
