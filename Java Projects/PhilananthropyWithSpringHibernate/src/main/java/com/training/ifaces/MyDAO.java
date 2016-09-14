/**
 * 
 */
package com.training.ifaces;

import java.io.Serializable;

import com.training.domain.Project;

/**
 * @author hgarg1
 *
 */
public interface MyDAO<T> {
  public Object add(Project t);
  public Project find(Serializable s);
}
