package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules

class ApplicationArchUnitTest {

    @Test
    fun `should verify app modules`() {
        val appModules = ApplicationModules.of(DemoApplication::class.java)
        appModules.verify()
    }
}
