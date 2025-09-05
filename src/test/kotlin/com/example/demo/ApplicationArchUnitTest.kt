package com.example.demo

import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.modulith.core.ApplicationModules

class ApplicationArchUnitTest {

    @Test
    fun `should verify app modules`() {
        val appModules = ApplicationModules.of(ExampleModulithApplication::class.java)
        appModules.verify()

        LOG.info("Application modules: {}", appModules)
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(ApplicationArchUnitTest::class.java)
    }
}
