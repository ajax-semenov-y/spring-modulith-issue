package com.example.demo.b.service

import com.example.demo.a.service.ModuleA
import org.springframework.modulith.NamedInterface

/**
 * This is module-b API
 */
@NamedInterface
class ModuleB {

    private val moduleA: ModuleA = ModuleA()

    fun doSomething(): String = moduleA.doSomething() + "hello"

    fun doSomethingElse(): String = "world"
}
