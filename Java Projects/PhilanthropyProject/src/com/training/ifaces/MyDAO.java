/**
 * 
 */
package com.training.ifaces;

import java.util.List;

/**
 * @author hgarg1
 *
 */
public interface MyDAO<T> {

	public int add(T object);
	public int update(long newPhoneNumber, long donorCode);
	public T find(long donorCode);
	public int delete(long donorCode);
	public List<T> findAll();
  public int alterTable();
}
