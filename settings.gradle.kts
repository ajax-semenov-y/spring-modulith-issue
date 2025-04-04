rootProject.name = "demo"

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://repo.spring.io/snapshot")
        }
        mavenCentral()
        google()
    }
}

include("module-a")
include("module-b")
