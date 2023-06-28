plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id("org.jlleitschuh.gradle.ktlint")
    id("io.gitlab.arturbosch.detekt")
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    namespace = AndroidConfig.applicationId
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = AndroidConfig.applicationId
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName

        testInstrumentationRunner= "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = AndroidConfig.javaVersion
        targetCompatibility = AndroidConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = AndroidConfig.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = AndroidConfig.kotlinCompilerExtension
    }
    packagingOptions {
        resources {
            pickFirsts.add("META-INF/io.netty.versions.properties")
            pickFirsts.add("META-INF/INDEX.LIST")
        }
    }
}

dependencies {
    implementation(project(Modules.domain))
    implementation(project(Modules.data))
    implementation(project(Modules.core))
    implementation(project(Modules.commonTheme))
    implementation(project(Modules.commonComposables))
    implementation(project(Modules.featureFarm))
    implementation(project(Modules.featureDetections))
    implementation(project(Modules.featureAuthentication))
    implementation(project(Modules.featureCalender))
    implementation(project(Modules.featurePayments))
    implementation(project(Modules.featureAlerts))

    implementation(platform(libs.compose.bom))
    implementation(libs.android.coreKtx)
    implementation(libs.android.appCompat)
    implementation(libs.android.material)
    implementation(libs.accompanist.navigation)
    implementation(libs.accompanist.swiperefresh)
    implementation(libs.accompanist.animation)
    implementation(libs.bundles.compose)
    implementation(libs.bundles.accompanist)




}