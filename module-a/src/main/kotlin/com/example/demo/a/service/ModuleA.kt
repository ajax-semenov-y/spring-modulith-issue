package com.example.demo.a.service

import org.springframework.modulith.NamedInterface

/**
 * This is module-a API
 */
@ModuleApi
// @NamedInterface("special-api")
class ModuleA {

    fun doSomething(): String = "hello"

    fun doSomethingElse(): String = "world"
}
