import org.gradle.api.JavaVersion

object AndroidConfig {
    const val minSdk = 21
    const val targetSdk = 33
    const val compileSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val applicationId = "com.tecvuna.thevunatec"
    const val kotlinCompilerExtension = "1.4.3"


    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"

}