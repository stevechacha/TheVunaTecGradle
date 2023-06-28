@file:Suppress("UnstableApiUsage")
pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        google()
        maven { url = uri("https://jitpack.io") }

    }
}
rootProject.name = "TheVunaTec"
include (":app")



include(":feature:farm")
include(":feature:authentication")
include(":feature:calender")
include(":feature:payments")
include(":feature:detections")
include(":feature:alerts")
include(":common:theme")
include(":common:composables")
include(":data")
include(":domain")
include(":core")
include(":feature:farmer-auth")
include(":feature:buyer-auth")
