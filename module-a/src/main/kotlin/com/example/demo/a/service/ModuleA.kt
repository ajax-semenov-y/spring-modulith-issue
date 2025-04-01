package com.example.demo.a.service

import org.springframework.modulith.NamedInterface

/**
 * This is module-a API
 */
@NamedInterface
class ModuleA {

    fun doSomething(): String = "hello"

    fun doSomethingElse(): String = "world"

}
