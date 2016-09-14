/**
 * 
 */
package com.training.ifaces;

import java.util.List;

import com.training.entity.Image;

/**
 * @author hgarg1
 * @param <T>
 *
 */
public interface Pimage<T> {

  public int addImage(Image imgObject);
  public List<Image> getImageList();
  public String getProjectImageList();
  
}
