package com.example.demo.b

import org.springframework.modulith.ApplicationModule

@ApplicationModule(
    allowedDependencies = ["module-a::*"]
)
interface PackageInfo
