package com.vas.rest;



import com.vas.Model.ModelArray;
import com.vas.sorted.SortedArray;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.Arrays;


@Path("/sorted")
public class RESTservice {

    @POST
    @Path("/array")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sortedArray(ModelArray modelArray){
        new SortedArray().sortType("Merge").sortStart(modelArray.isDescending(), modelArray.getArray());
        System.out.println(Arrays.toString(modelArray.getArray()));
        return Response.status(201).entity(modelArray.getArray()).build();
    }
}
