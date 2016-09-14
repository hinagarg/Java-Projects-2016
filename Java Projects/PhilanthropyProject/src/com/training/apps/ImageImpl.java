/**
 * 
 */
package com.training.apps;

import java.util.List;

import com.training.daos.ImageDAO;
import com.training.entity.Image;

/**
 * @author hgarg1
 *
 */
public class ImageImpl {

  /**
   * @param args
   */
  public static void main(String[] args) {
  
  ImageDAO<Image> dao = new ImageDAO<Image>();
  int key = 2;
  switch(key){
  
  case 1:
    int rowAdded = dao.addImage(new Image(101, "img1.txt", "img2.txt", "img3.txt"));
    System.out.println("Rows[s] Added :=" + rowAdded);
    break;
    
    
  case 2:
    List<Image> imageList;
    imageList = dao.getImageList();
    System.out.println("Rows[s] Found :=" + imageList);
    break;
  
    
    default:
      break;
  }

  }

}
