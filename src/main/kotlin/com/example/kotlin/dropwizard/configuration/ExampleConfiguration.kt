package com.example.kotlin.dropwizard.configuration

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration

class ExampleConfiguration : Configuration() {
    @JsonProperty("instance")
    var instance: String = "default"
}