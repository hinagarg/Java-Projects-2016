package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Image;
import com.training.ifaces.Pimage;
import com.training.utils.MySQLConnection;


public class ImageDAO<T> implements Pimage<T> {
  
  private Connection con = null;
  
  
  /**
   * 
   */
  public ImageDAO() {
  super();
  con = MySQLConnection.getMyOracleConnection();
  }

  @Override
  public String getProjectImageList() {
  
  return null;
  }

  @Override
  public int addImage(Image imgObject) {
  
  int rowAdded = 0;
  
  try{
    
    String sql = "insert into Image values(?,?,?,?)";
    
    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setInt(1,  imgObject.getpCode());
    pstmt.setString(2,  imgObject.getImagePath1());
    pstmt.setString(3,  imgObject.getImagePath2());
    pstmt.setString(4,  imgObject.getImagePath3());
    

      
    rowAdded = pstmt.executeUpdate();
  }
  catch(Exception e){
    e.printStackTrace();
  }
  return rowAdded;
  
  }

  @Override
  public List<Image> getImageList() {
  ArrayList<Image> imgList = new ArrayList<Image>();
  try{
  Statement stmt =con.createStatement();
   
  ResultSet  rs=stmt.executeQuery ("select * from Image");
               
  while(rs.next())
  {

    int code     = rs.getInt("pcode");
    String image1   = rs.getString("img1");
    String image2   = rs.getString("img2");
    String image3   = rs.getString("img3");
    
   
    Image imageObj = new Image(code,image1,image2,image3);
    imgList.add(imageObj);
   }
  }
  
  catch(Exception e){
     e.printStackTrace();
   }
  return imgList;
  }

  

}
