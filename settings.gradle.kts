rootProject.name = "demo"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

include("subdomains")
include("subdomains:module-a")
include("subdomains:module-b")
