package com.vas.rest;


import com.vas.model.ModelArray;
import com.vas.sorted.SortArrFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


//Rest host: /rest/sorted
@Path("/sorted")
public class RestService {

    @POST
    @Path("/array")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sortedArray(ModelArray modelArray){
        new SortArrFactory().sortType("Merge").sortStart(modelArray.isDescending(), modelArray.getArray());
        return Response.status(201).entity(modelArray.getArray()).build();
    }
}
