package com.vas.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Uncaught exception for rest service.
 */
@Provider
public class UncaughtException extends Throwable implements ExceptionMapper<Throwable> {
    /**
     * Method return status "500" and string description
     * in content-type: application/json.
     */
    @Override
    public Response toResponse(Throwable exception) {
        return Response.status(500).entity("Wrong message request. Please check and try again !!")
                .type("appilaction/json").build();
    }
}