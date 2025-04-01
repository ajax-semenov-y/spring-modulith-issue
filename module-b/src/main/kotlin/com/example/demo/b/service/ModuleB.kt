package com.example.demo.b.service

import org.springframework.modulith.NamedInterface

/**
 * This is module-b API
 */
@NamedInterface
class ModuleB {

    fun doSomething(): String = "hello"

    fun doSomethingElse(): String = "world"
}
