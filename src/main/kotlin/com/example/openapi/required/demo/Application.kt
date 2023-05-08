package com.example.openapi.required.demo

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DemoController {
    @PostMapping("/resource")
    fun createResource(@RequestBody resource: Resource) = Unit
}

data class Resource(
    val foo: String,
    val bar: Boolean,
    val baz: Any
)

@Configuration
@OpenAPIDefinition(info = Info(title = "Demo Application", version = "0.0.1"))
open class OpenApiConfiguration

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
