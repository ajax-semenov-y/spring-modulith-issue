package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.modulith.Modulithic

@SpringBootApplication
@Modulithic
class ExampleModulithApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<ExampleModulithApplication>(*args)
}

