package com.restful.java.game;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("score")
public class Score {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
    	
    	
        return "{\r\n" + 
        		"  \"Score\": \"Score1\",\r\n" + 
        		"  \"Score\": \"Score2\"\r\n" + 
        		"}";
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String postIt() {
        return "Win!";
    }
}