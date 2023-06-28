plugins {
    `kotlin-dsl`
}

group = "com.tecvuna.thevunatec.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {

        register("androidApplication") {
            id = "thevunatec.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidKotlin") {
            id = "thevunatec.jetbrains.kotlin.android"
            implementationClass = "AndroidKotlinConventionPlugin"
        }
        register("androidLibrary") {
            id = "thevunatec.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidCompose") {
            id = "thevunatec.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }
    }

}
