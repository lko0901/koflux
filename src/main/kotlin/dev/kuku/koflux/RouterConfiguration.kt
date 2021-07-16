package dev.kuku.koflux

import kotlinx.coroutines.FlowPreview
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class RouterConfiguration(private val exampleHandler:ExampleHandler) {

    @Bean
    @FlowPreview
    fun exampleRouter() = coRouter {
        GET("/hello", exampleHandler::exampleHello)
    }
}