rootProject.name = "demo"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

include("module-a")
include("module-b")
