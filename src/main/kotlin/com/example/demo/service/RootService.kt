package com.example.demo.service

import org.springframework.modulith.NamedInterface

/**
 * This is API of root
 */
@NamedInterface
class RootService {

    fun hello(): String = "root"
}
