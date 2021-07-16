package dev.kuku.koflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KofluxApplication

fun main(args: Array<String>) {
    runApplication<KofluxApplication>(*args)
}
