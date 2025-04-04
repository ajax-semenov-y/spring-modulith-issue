package com.example.demo

import org.springframework.modulith.core.ApplicationModuleDetectionStrategy

class ExplicitlyAnnotatedApplicationModuleDetectionStrategy(
    private val delegate: ApplicationModuleDetectionStrategy = ApplicationModuleDetectionStrategy.explicitlyAnnotated()
) : ApplicationModuleDetectionStrategy by delegate
