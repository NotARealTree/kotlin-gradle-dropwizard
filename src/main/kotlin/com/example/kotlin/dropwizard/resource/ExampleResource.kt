package com.example.kotlin.dropwizard.resource

import com.example.kotlin.dropwizard.configuration.ExampleConfiguration
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/example")
class ExampleResource(val configuration: ExampleConfiguration) {
    @GET
    @Path("/")
    fun ping(): String {
        return "Server running with instance ${configuration.instance}"
    }
}