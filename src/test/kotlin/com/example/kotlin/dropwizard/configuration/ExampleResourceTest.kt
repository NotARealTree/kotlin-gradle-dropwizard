package com.example.kotlin.dropwizard.configuration

import com.example.kotlin.dropwizard.resource.ExampleResource
import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

class ExampleResourceTest {
    @Test
    fun testPing() {
        val configuration = ExampleConfiguration()
        val resource = ExampleResource(configuration)
        assertThat(resource.ping()).isEqualTo("Server running with instance default")
    }
}