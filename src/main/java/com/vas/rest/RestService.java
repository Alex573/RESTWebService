package com.vas.rest;

import com.vas.model.ModelArray;
import com.vas.sorted.SortArrFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Rest service to handle requests type sorted
 * host ../rect/sorted/...
 */
@Path("/sorted")
public class RestService {
    /**
     * Sort array, content-type: application/json, request type:POST,
     * in model example:{"descending":false, "array":[ 9, 7, 3, 15 ]  }
     * or {"array":[ 9, 7, 3, 15 ] sort ascending,
     * .sortType("Quick") - sorting type selection Quick or Shell
     */
    @POST
    @Path("/array")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sortedArray(ModelArray modelArray) {
        new SortArrFactory()
                .sortType("Quick")
                .sortStart(modelArray.isDescending(), modelArray.getArray());
        return Response.status(201).entity(modelArray.getArray()).build();
    }
}
