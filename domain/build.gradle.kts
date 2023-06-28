plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = AndroidConfig.javaVersion
    targetCompatibility = AndroidConfig.javaVersion
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)

}