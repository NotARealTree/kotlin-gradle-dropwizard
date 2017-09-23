package com.example.kotlin.dropwizard

import com.example.kotlin.dropwizard.configuration.ExampleConfiguration
import com.example.kotlin.dropwizard.healthchecks.ExampleHealthCheck
import com.example.kotlin.dropwizard.resource.ExampleResource
import io.dropwizard.Application
import io.dropwizard.setup.Environment

class ExampleServer: Application<ExampleConfiguration>() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            ExampleServer().run(*args)
        }
    }

    override fun run(configuration: ExampleConfiguration?, environment: Environment?) {
        if (configuration == null) {
            throw IllegalStateException("Configuration file is not present, terminating.")
        }
        val resource = ExampleResource(configuration)
        val healthCheck = ExampleHealthCheck()
        environment?.jersey()?.register(resource)
        environment?.healthChecks()?.register("Universe health check", healthCheck)
    }
}