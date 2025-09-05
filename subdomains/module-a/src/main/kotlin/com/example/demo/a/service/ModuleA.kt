package com.example.demo.a.service

import org.springframework.modulith.NamedInterface

/**
 * This is module-a API
 */
@NamedInterface
class ModuleA {

    /**
     * This is hehe field
     */
    val hehe: String? = null

    /**
     * This is doSomething doc
     */
    fun doSomething(): String = "hello"

    fun doSomethingElse(): String = "world"

}
