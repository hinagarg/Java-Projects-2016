/**
 * 
 */
package com.training;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * @author hgarg1
 *
 */
public class QuickStart {

  public static void main(String[] args){
  
    try{
      
      MongoClient mongo = new MongoClient("localhost", 27017);
      
      DB db = mongo.getDB("test");
      
      DBCollection collection = db.getCollection("myusers");
      
      BasicDBObject obj = new BasicDBObject();
      
      obj.put("user", "Ramesh");
      
      DBCursor cursor = collection.find(obj);
      
      System.out.println(cursor.count());
      
      while(cursor.hasNext())
        
      {
        
        System.out.println(cursor.next());
      }
    }
    catch(Exception e){
      
      e.printStackTrace();
    }
  }
}
