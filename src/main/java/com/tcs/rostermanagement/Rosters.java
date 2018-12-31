package com.tcs.rostermanagement;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "rosters" path)
 */
@Path("rosters")
public class Rosters {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
    	
    	
        return "{\r\n" +  
        		"  \"roster_id\": \"roster1\",\r\n" + 
        		"  \"roster_name\": \"rosterName\"\r\n" + 
        		"}";
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String postIt() {
        return "Got it!";
    }
}

