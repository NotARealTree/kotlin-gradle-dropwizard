package com.example.kotlin.dropwizard.healthchecks

import com.codahale.metrics.health.HealthCheck

class ExampleHealthCheck(): HealthCheck() {
    override fun check(): Result {
        // Check everything is right with the world
        if (1 == 1) {
            return Result.healthy()
        } else {
            return Result.unhealthy("Something seems seriously wrong")
        }
    }
}