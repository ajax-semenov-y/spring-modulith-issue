package com.example.demo.a.service

import org.springframework.modulith.NamedInterface

@NamedInterface("special-api")
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class ModuleApi
