/**
 * 
 */
package com.training.resources;


import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.owlike.genson.Genson;

/**
 * @author hgarg1
 *
 */
@Path("/simple")
public class SimpleResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  
  public String getMessage(){
  
  return "you have succesfully configured";
  }
  
  @Path("/inv")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  
  public String getInfo(){
  
    Invoice inv = new Invoice(101, "Ramesh", 4500);
    
    Genson serializer = new Genson();
    
    String resp = serializer.serialize(inv);
    
    return resp;
  }
  
  HashMap<Integer, String> map = new HashMap<Integer, String>();
  private void init() {
  
  
  
  map.put(101,  "Ramesh");
  map.put(102, "Jerry");
    
  
  }
  
  @Path("/find/{userId}")
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String findUser1(@PathParam("userId") int id)
  {
    
    init();
    return map.get(id);
  
  }
  
  

  @Path("/remove")
  @DELETE
  @Produces(MediaType.TEXT_PLAIN)
  //http://localhost:4040/RestWebService/rest/simple/remove?userId=102
  public String findUser(@QueryParam("userId") int id)
  {
    init();
    return ("removed user " + map.remove(id));
  
  }
  
  @Path("/add")
  @POST
  @Produces(MediaType.TEXT_PLAIN)
  public String addUser(@FormParam("userId") int id, @FormParam("name") String name){
  
    init();
    map.put(id, name);
    
    return map.toString();
  
  }
}
