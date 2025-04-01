package com.example.demo.c.service

import org.springframework.modulith.NamedInterface

/**
 * This is module-c API
 */
@NamedInterface
class ModuleC {

    fun hello(): String = "root"
}
