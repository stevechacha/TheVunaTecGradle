package com.tecvuna.thevunatec

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Project

@Suppress("UnstableApiUsage")
internal fun Project.configureAndroidLibrary(
    extension: LibraryExtension,
) {
    extension.apply {
        defaultConfig {
            targetSdk = 33
        }
    }
}