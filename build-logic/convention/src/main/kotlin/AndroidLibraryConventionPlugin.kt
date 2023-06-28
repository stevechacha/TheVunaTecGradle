import com.android.build.gradle.LibraryExtension
import com.tecvuna.thevunatec.configureAndroidCommon
import com.tecvuna.thevunatec.configureAndroidLibrary
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
            }

            extensions.configure<LibraryExtension> {
                configureAndroidCommon(this)
                configureAndroidLibrary(this)
            }
        }
    }
}