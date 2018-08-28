package com.microservices.chapter06discoveryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Chapter06DiscoveryServerApplication

fun main(args: Array<String>) {
    runApplication<Chapter06DiscoveryServerApplication>(*args)
}
