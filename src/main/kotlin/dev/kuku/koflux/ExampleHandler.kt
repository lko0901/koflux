package dev.kuku.koflux

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyAndAwait

@Component
class ExampleHandler {

    @FlowPreview
    suspend fun exampleHello(request:ServerRequest):ServerResponse = ServerResponse.ok().bodyAndAwait(hello())

    fun hello(): Flow<String> = flow {
        emit("hello")
    }
}