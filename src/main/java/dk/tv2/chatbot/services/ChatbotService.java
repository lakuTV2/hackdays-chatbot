package dk.tv2.chatbot.services;


import dk.tv2.chatbot.services.config.ApplicationEnvironment;
import dk.tv2.chatbot.services.model.Configuration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by pean
 */
@Path("/chatbot")
@Produces(MediaType.APPLICATION_JSON)

public class ChatbotService {
    @GET
    @Path("/config")
    public Response getConfig() {
        Configuration configuration = ApplicationEnvironment.getCONFIGURATION();
        return Response.ok().entity(configuration).build();
    }


}
