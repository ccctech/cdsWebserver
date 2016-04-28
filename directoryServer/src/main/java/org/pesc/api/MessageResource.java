package org.pesc.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pesc.api.model.Message;
import org.pesc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 4/27/16.
 */
@Component
@WebService
@Path("/messages")
@Api("/messages")
public class MessageResource {

    private static final Log log = LogFactory.getLog(MessageResource.class);

    @Autowired
    private MessageService messageService;


    @GET
    @Path("/{id}")
    @ApiOperation("Return messages that belong to the given id.")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Message> getMessagesForOrganization(@QueryParam("organization_id") @ApiParam(value="The organization id.", required=true) Integer orgID) {

        checkParameter(orgID, "organization_id");

        List<Message> results = messageService.findByOrganizationId(orgID);

        if (results == null) {
            results = new ArrayList<Message>();

        }
        return results;
    }

    private void checkParameter(Object param, String parameterName) {
        if (param == null) {
            throw new WebApplicationException(String.format("The %s parameter is required.", parameterName));
        }
    }

}

