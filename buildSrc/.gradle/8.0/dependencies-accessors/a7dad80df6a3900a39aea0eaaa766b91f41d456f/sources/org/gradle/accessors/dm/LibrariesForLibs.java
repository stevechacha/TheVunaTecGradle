package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final BiometricLibraryAccessors laccForBiometricLibraryAccessors = new BiometricLibraryAccessors(owner);
    private final CameraLibraryAccessors laccForCameraLibraryAccessors = new CameraLibraryAccessors(owner);
    private final CameraxLibraryAccessors laccForCameraxLibraryAccessors = new CameraxLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final DateLibraryAccessors laccForDateLibraryAccessors = new DateLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final GmsLibraryAccessors laccForGmsLibraryAccessors = new GmsLibraryAccessors(owner);
    private final GsonLibraryAccessors laccForGsonLibraryAccessors = new GsonLibraryAccessors(owner);
    private final KoinLibraryAccessors laccForKoinLibraryAccessors = new KoinLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final LifecycleLibraryAccessors laccForLifecycleLibraryAccessors = new LifecycleLibraryAccessors(owner);
    private final LottieLibraryAccessors laccForLottieLibraryAccessors = new LottieLibraryAccessors(owner);
    private final PagingLibraryAccessors laccForPagingLibraryAccessors = new PagingLibraryAccessors(owner);
    private final ResultLibraryAccessors laccForResultLibraryAccessors = new ResultLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final TestLibraryAccessors laccForTestLibraryAccessors = new TestLibraryAccessors(owner);
    private final ZekoLibraryAccessors laccForZekoLibraryAccessors = new ZekoLibraryAccessors(owner);
    private final ZxingLibraryAccessors laccForZxingLibraryAccessors = new ZxingLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for datastore (androidx.datastore:datastore-preferences)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDatastore() { return create("datastore"); }

        /**
         * Creates a dependency provider for exoplayer (com.google.android.exoplayer:exoplayer)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExoplayer() { return create("exoplayer"); }

        /**
         * Creates a dependency provider for timber (com.jakewharton.timber:timber)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTimber() { return create("timber"); }

    /**
     * Returns the group of libraries at accompanist
     */
    public AccompanistLibraryAccessors getAccompanist() { return laccForAccompanistLibraryAccessors; }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() { return laccForAndroidLibraryAccessors; }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of libraries at biometric
     */
    public BiometricLibraryAccessors getBiometric() { return laccForBiometricLibraryAccessors; }

    /**
     * Returns the group of libraries at camera
     */
    public CameraLibraryAccessors getCamera() { return laccForCameraLibraryAccessors; }

    /**
     * Returns the group of libraries at camerax
     */
    public CameraxLibraryAccessors getCamerax() { return laccForCameraxLibraryAccessors; }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() { return laccForCoilLibraryAccessors; }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() { return laccForComposeLibraryAccessors; }

    /**
     * Returns the group of libraries at date
     */
    public DateLibraryAccessors getDate() { return laccForDateLibraryAccessors; }

    /**
     * Returns the group of libraries at firebase
     */
    public FirebaseLibraryAccessors getFirebase() { return laccForFirebaseLibraryAccessors; }

    /**
     * Returns the group of libraries at gms
     */
    public GmsLibraryAccessors getGms() { return laccForGmsLibraryAccessors; }

    /**
     * Returns the group of libraries at gson
     */
    public GsonLibraryAccessors getGson() { return laccForGsonLibraryAccessors; }

    /**
     * Returns the group of libraries at koin
     */
    public KoinLibraryAccessors getKoin() { return laccForKoinLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() { return laccForKotlinLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() { return laccForKotlinxLibraryAccessors; }

    /**
     * Returns the group of libraries at ktor
     */
    public KtorLibraryAccessors getKtor() { return laccForKtorLibraryAccessors; }

    /**
     * Returns the group of libraries at lifecycle
     */
    public LifecycleLibraryAccessors getLifecycle() { return laccForLifecycleLibraryAccessors; }

    /**
     * Returns the group of libraries at lottie
     */
    public LottieLibraryAccessors getLottie() { return laccForLottieLibraryAccessors; }

    /**
     * Returns the group of libraries at paging
     */
    public PagingLibraryAccessors getPaging() { return laccForPagingLibraryAccessors; }

    /**
     * Returns the group of libraries at result
     */
    public ResultLibraryAccessors getResult() { return laccForResultLibraryAccessors; }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() { return laccForRoomLibraryAccessors; }

    /**
     * Returns the group of libraries at test
     */
    public TestLibraryAccessors getTest() { return laccForTestLibraryAccessors; }

    /**
     * Returns the group of libraries at zeko
     */
    public ZekoLibraryAccessors getZeko() { return laccForZekoLibraryAccessors; }

    /**
     * Returns the group of libraries at zxing
     */
    public ZxingLibraryAccessors getZxing() { return laccForZxingLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animation (com.google.accompanist:accompanist-navigation-animation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnimation() { return create("accompanist.animation"); }

            /**
             * Creates a dependency provider for flowlayout (com.google.accompanist:accompanist-flowlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFlowlayout() { return create("accompanist.flowlayout"); }

            /**
             * Creates a dependency provider for indicator (com.google.accompanist:accompanist-pager-indicators)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIndicator() { return create("accompanist.indicator"); }

            /**
             * Creates a dependency provider for insets (com.google.accompanist:accompanist-insets)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInsets() { return create("accompanist.insets"); }

            /**
             * Creates a dependency provider for material (com.google.accompanist:accompanist-navigation-material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("accompanist.material"); }

            /**
             * Creates a dependency provider for navigation (com.google.accompanist:accompanist-navigation-material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() { return create("accompanist.navigation"); }

            /**
             * Creates a dependency provider for pager (com.google.accompanist:accompanist-pager)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPager() { return create("accompanist.pager"); }

            /**
             * Creates a dependency provider for permission (com.google.accompanist:accompanist-permissions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPermission() { return create("accompanist.permission"); }

            /**
             * Creates a dependency provider for permissions (com.google.accompanist:accompanist-permissions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPermissions() { return create("accompanist.permissions"); }

            /**
             * Creates a dependency provider for swiperefresh (com.google.accompanist:accompanist-swiperefresh)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSwiperefresh() { return create("accompanist.swiperefresh"); }

            /**
             * Creates a dependency provider for systemui (com.google.accompanist:accompanist-systemuicontroller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSystemui() { return create("accompanist.systemui"); }

    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {
        private final AndroidHiltLibraryAccessors laccForAndroidHiltLibraryAccessors = new AndroidHiltLibraryAccessors(owner);
        private final AndroidTestLibraryAccessors laccForAndroidTestLibraryAccessors = new AndroidTestLibraryAccessors(owner);

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appCompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppCompat() { return create("android.appCompat"); }

            /**
             * Creates a dependency provider for coreKtx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoreKtx() { return create("android.coreKtx"); }

            /**
             * Creates a dependency provider for gradlePlugin (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() { return create("android.gradlePlugin"); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("android.material"); }

        /**
         * Returns the group of libraries at android.hilt
         */
        public AndroidHiltLibraryAccessors getHilt() { return laccForAndroidHiltLibraryAccessors; }

        /**
         * Returns the group of libraries at android.test
         */
        public AndroidTestLibraryAccessors getTest() { return laccForAndroidTestLibraryAccessors; }

    }

    public static class AndroidHiltLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidHiltAndroidxLibraryAccessors laccForAndroidHiltAndroidxLibraryAccessors = new AndroidHiltAndroidxLibraryAccessors(owner);
        private final AndroidHiltNavigationLibraryAccessors laccForAndroidHiltNavigationLibraryAccessors = new AndroidHiltNavigationLibraryAccessors(owner);

        public AndroidHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("android.hilt"); }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-android-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("android.hilt.compiler"); }

            /**
             * Creates a dependency provider for testing (com.google.dagger:hilt-android-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("android.hilt.testing"); }

        /**
         * Returns the group of libraries at android.hilt.androidx
         */
        public AndroidHiltAndroidxLibraryAccessors getAndroidx() { return laccForAndroidHiltAndroidxLibraryAccessors; }

        /**
         * Returns the group of libraries at android.hilt.navigation
         */
        public AndroidHiltNavigationLibraryAccessors getNavigation() { return laccForAndroidHiltNavigationLibraryAccessors; }

    }

    public static class AndroidHiltAndroidxLibraryAccessors extends SubDependencyFactory {

        public AndroidHiltAndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.hilt:hilt-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("android.hilt.androidx.compiler"); }

    }

    public static class AndroidHiltNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidHiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.hilt:hilt-navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("android.hilt.navigation.compose"); }

    }

    public static class AndroidTestLibraryAccessors extends SubDependencyFactory {

        public AndroidTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("android.test.compose"); }

            /**
             * Creates a dependency provider for espresso (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEspresso() { return create("android.test.espresso"); }

            /**
             * Creates a dependency provider for idling (androidx.test.espresso:espresso-idling-resource)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIdling() { return create("android.test.idling"); }

            /**
             * Creates a dependency provider for junit4 (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() { return create("android.test.junit4"); }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for splashscreen (androidx.core:core-splashscreen)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSplashscreen() { return create("androidx.splashscreen"); }

    }

    public static class BiometricLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public BiometricLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for biometric (androidx.biometric:biometric)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("biometric"); }

            /**
             * Creates a dependency provider for ktx (androidx.biometric:biometric-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("biometric.ktx"); }

    }

    public static class CameraLibraryAccessors extends SubDependencyFactory {

        public CameraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ext (androidx.camera:camera-extensions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExt() { return create("camera.ext"); }

            /**
             * Creates a dependency provider for video (androidx.camera:camera-video)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVideo() { return create("camera.video"); }

    }

    public static class CameraxLibraryAccessors extends SubDependencyFactory {

        public CameraxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for camera2 (androidx.camera:camera-camera2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCamera2() { return create("camerax.camera2"); }

            /**
             * Creates a dependency provider for core (androidx.camera:camera-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("camerax.core"); }

            /**
             * Creates a dependency provider for lifecycle (androidx.camera:camera-lifecycle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLifecycle() { return create("camerax.lifecycle"); }

            /**
             * Creates a dependency provider for view (androidx.camera:camera-view)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getView() { return create("camerax.view"); }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.coil-kt:coil-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("coil.compose"); }

            /**
             * Creates a dependency provider for gf (io.coil-kt:coil-gif)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGf() { return create("coil.gf"); }

            /**
             * Creates a dependency provider for video (io.coil-kt:coil-video)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVideo() { return create("coil.video"); }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeMaterialLibraryAccessors laccForComposeMaterialLibraryAccessors = new ComposeMaterialLibraryAccessors(owner);
        private final ComposePreviewLibraryAccessors laccForComposePreviewLibraryAccessors = new ComposePreviewLibraryAccessors(owner);
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() { return create("compose.activity"); }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("compose.bom"); }

            /**
             * Creates a dependency provider for compiler (androidx.compose.compiler:compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("compose.compiler"); }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraintlayout() { return create("compose.constraintlayout"); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() { return create("compose.foundation"); }

            /**
             * Creates a dependency provider for materialIcons (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterialIcons() { return create("compose.materialIcons"); }

            /**
             * Creates a dependency provider for runtime (androidx.compose.runtime:runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("compose.runtime"); }

            /**
             * Creates a dependency provider for runtimeLivedata (androidx.compose.runtime:runtime-livedata)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeLivedata() { return create("compose.runtimeLivedata"); }

        /**
         * Returns the group of libraries at compose.material
         */
        public ComposeMaterialLibraryAccessors getMaterial() { return laccForComposeMaterialLibraryAccessors; }

        /**
         * Returns the group of libraries at compose.preview
         */
        public ComposePreviewLibraryAccessors getPreview() { return laccForComposePreviewLibraryAccessors; }

        /**
         * Returns the group of libraries at compose.ui
         */
        public ComposeUiLibraryAccessors getUi() { return laccForComposeUiLibraryAccessors; }

    }

    public static class ComposeMaterialLibraryAccessors extends SubDependencyFactory {

        public ComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for 3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> get3() { return create("compose.material.3"); }

    }

    public static class ComposePreviewLibraryAccessors extends SubDependencyFactory {
        private final ComposePreviewCustomviewLibraryAccessors laccForComposePreviewCustomviewLibraryAccessors = new ComposePreviewCustomviewLibraryAccessors(owner);

        public ComposePreviewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at compose.preview.customview
         */
        public ComposePreviewCustomviewLibraryAccessors getCustomview() { return laccForComposePreviewCustomviewLibraryAccessors; }

    }

    public static class ComposePreviewCustomviewLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposePreviewCustomviewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for customview (androidx.customview:customview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.preview.customview"); }

            /**
             * Creates a dependency provider for poolingcontainer (androidx.customview:customview-poolingcontainer)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPoolingcontainer() { return create("compose.preview.customview.poolingcontainer"); }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiTestLibraryAccessors laccForComposeUiTestLibraryAccessors = new ComposeUiTestLibraryAccessors(owner);
        private final ComposeUiToolingLibraryAccessors laccForComposeUiToolingLibraryAccessors = new ComposeUiToolingLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.ui"); }

            /**
             * Creates a dependency provider for util (androidx.compose.ui:ui-util)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUtil() { return create("compose.ui.util"); }

        /**
         * Returns the group of libraries at compose.ui.test
         */
        public ComposeUiTestLibraryAccessors getTest() { return laccForComposeUiTestLibraryAccessors; }

        /**
         * Returns the group of libraries at compose.ui.tooling
         */
        public ComposeUiToolingLibraryAccessors getTooling() { return laccForComposeUiToolingLibraryAccessors; }

    }

    public static class ComposeUiTestLibraryAccessors extends SubDependencyFactory {

        public ComposeUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("compose.ui.test.junit"); }

            /**
             * Creates a dependency provider for manifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getManifest() { return create("compose.ui.test.manifest"); }

    }

    public static class ComposeUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.ui.tooling"); }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() { return create("compose.ui.tooling.preview"); }

    }

    public static class DateLibraryAccessors extends SubDependencyFactory {
        private final DateSheetLibraryAccessors laccForDateSheetLibraryAccessors = new DateSheetLibraryAccessors(owner);

        public DateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.maxkeppeler.sheets-compose-dialogs:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("date.core"); }

        /**
         * Returns the group of libraries at date.sheet
         */
        public DateSheetLibraryAccessors getSheet() { return laccForDateSheetLibraryAccessors; }

    }

    public static class DateSheetLibraryAccessors extends SubDependencyFactory {

        public DateSheetLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dialog (com.maxkeppeler.sheets-compose-dialogs:calendar)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDialog() { return create("date.sheet.dialog"); }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for analytics (com.google.firebase:firebase-analytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnalytics() { return create("firebase.analytics"); }

            /**
             * Creates a dependency provider for bom (com.google.firebase:firebase-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("firebase.bom"); }

            /**
             * Creates a dependency provider for crashlytics (com.google.firebase:firebase-crashlytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCrashlytics() { return create("firebase.crashlytics"); }

            /**
             * Creates a dependency provider for messaging (com.google.firebase:firebase-messaging-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMessaging() { return create("firebase.messaging"); }

            /**
             * Creates a dependency provider for performance (com.google.firebase:firebase-perf-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPerformance() { return create("firebase.performance"); }

    }

    public static class GmsLibraryAccessors extends SubDependencyFactory {
        private final GmsPlayLibraryAccessors laccForGmsPlayLibraryAccessors = new GmsPlayLibraryAccessors(owner);

        public GmsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at gms.play
         */
        public GmsPlayLibraryAccessors getPlay() { return laccForGmsPlayLibraryAccessors; }

    }

    public static class GmsPlayLibraryAccessors extends SubDependencyFactory {
        private final GmsPlayServicesLibraryAccessors laccForGmsPlayServicesLibraryAccessors = new GmsPlayServicesLibraryAccessors(owner);

        public GmsPlayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at gms.play.services
         */
        public GmsPlayServicesLibraryAccessors getServices() { return laccForGmsPlayServicesLibraryAccessors; }

    }

    public static class GmsPlayServicesLibraryAccessors extends SubDependencyFactory {

        public GmsPlayServicesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for auth (com.google.android.gms:play-services-auth)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAuth() { return create("gms.play.services.auth"); }

    }

    public static class GsonLibraryAccessors extends SubDependencyFactory {

        public GsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.google.code.gson:gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() { return create("gson.gson"); }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory {
        private final KoinAndroidxLibraryAccessors laccForKoinAndroidxLibraryAccessors = new KoinAndroidxLibraryAccessors(owner);

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.insert-koin:koin-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("koin.android"); }

            /**
             * Creates a dependency provider for core (io.insert-koin:koin-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("koin.core"); }

        /**
         * Returns the group of libraries at koin.androidx
         */
        public KoinAndroidxLibraryAccessors getAndroidx() { return laccForKoinAndroidxLibraryAccessors; }

    }

    public static class KoinAndroidxLibraryAccessors extends SubDependencyFactory {

        public KoinAndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.insert-koin:koin-androidx-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("koin.androidx.compose"); }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinCoroutinesLibraryAccessors laccForKotlinCoroutinesLibraryAccessors = new KotlinCoroutinesLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradlePlugin (org.jetbrains.kotlin:kotlin-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() { return create("kotlin.gradlePlugin"); }

        /**
         * Returns the group of libraries at kotlin.coroutines
         */
        public KotlinCoroutinesLibraryAccessors getCoroutines() { return laccForKotlinCoroutinesLibraryAccessors; }

    }

    public static class KotlinCoroutinesLibraryAccessors extends SubDependencyFactory {
        private final KotlinCoroutinesPlayLibraryAccessors laccForKotlinCoroutinesPlayLibraryAccessors = new KotlinCoroutinesPlayLibraryAccessors(owner);

        public KotlinCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("kotlin.coroutines.android"); }

            /**
             * Creates a dependency provider for datetime (org.jetbrains.kotlinx:kotlinx-datetime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatetime() { return create("kotlin.coroutines.datetime"); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() { return create("kotlin.coroutines.test"); }

        /**
         * Returns the group of libraries at kotlin.coroutines.play
         */
        public KotlinCoroutinesPlayLibraryAccessors getPlay() { return laccForKotlinCoroutinesPlayLibraryAccessors; }

    }

    public static class KotlinCoroutinesPlayLibraryAccessors extends SubDependencyFactory {

        public KotlinCoroutinesPlayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for services (org.jetbrains.kotlinx:kotlinx-coroutines-play-services)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServices() { return create("kotlin.coroutines.play.services"); }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() { return laccForKotlinxCoroutinesLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() { return laccForKotlinxSerializationLibraryAccessors; }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("kotlinx.coroutines.core"); }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() { return create("kotlinx.serialization.json"); }

    }

    public static class KtorLibraryAccessors extends SubDependencyFactory {
        private final KtorContentLibraryAccessors laccForKtorContentLibraryAccessors = new KtorContentLibraryAccessors(owner);

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.ktor:ktor-client-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("ktor.android"); }

            /**
             * Creates a dependency provider for auth (io.ktor:ktor-client-auth)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAuth() { return create("ktor.auth"); }

            /**
             * Creates a dependency provider for core (io.ktor:ktor-client-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("ktor.core"); }

            /**
             * Creates a dependency provider for json (io.ktor:ktor-serialization-kotlinx-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() { return create("ktor.json"); }

            /**
             * Creates a dependency provider for logging (io.ktor:ktor-client-logging)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() { return create("ktor.logging"); }

            /**
             * Creates a dependency provider for mock (io.ktor:ktor-client-mock)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMock() { return create("ktor.mock"); }

        /**
         * Returns the group of libraries at ktor.content
         */
        public KtorContentLibraryAccessors getContent() { return laccForKtorContentLibraryAccessors; }

    }

    public static class KtorContentLibraryAccessors extends SubDependencyFactory {

        public KtorContentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for negotiation (io.ktor:ktor-client-content-negotiation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNegotiation() { return create("ktor.content.negotiation"); }

    }

    public static class LifecycleLibraryAccessors extends SubDependencyFactory {
        private final LifecycleViewmodelLibraryAccessors laccForLifecycleViewmodelLibraryAccessors = new LifecycleViewmodelLibraryAccessors(owner);

        public LifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for livedataKtx (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLivedataKtx() { return create("lifecycle.livedataKtx"); }

            /**
             * Creates a dependency provider for runtimeKtx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeKtx() { return create("lifecycle.runtimeKtx"); }

        /**
         * Returns the group of libraries at lifecycle.viewmodel
         */
        public LifecycleViewmodelLibraryAccessors getViewmodel() { return laccForLifecycleViewmodelLibraryAccessors; }

    }

    public static class LifecycleViewmodelLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public LifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for viewmodel (androidx.lifecycle:lifecycle-viewmodel-savedstate)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("lifecycle.viewmodel"); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("lifecycle.viewmodel.compose"); }

    }

    public static class LottieLibraryAccessors extends SubDependencyFactory {

        public LottieLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (com.airbnb.android:lottie-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("lottie.compose"); }

    }

    public static class PagingLibraryAccessors extends SubDependencyFactory {

        public PagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.paging:paging-common-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("paging.common"); }

            /**
             * Creates a dependency provider for compose (androidx.paging:paging-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("paging.compose"); }

    }

    public static class ResultLibraryAccessors extends SubDependencyFactory {

        public ResultLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jvm (com.github.kittinunf.result:result-jvm)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJvm() { return create("result.jvm"); }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("room.compiler"); }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("room.ktx"); }

            /**
             * Creates a dependency provider for paging (androidx.room:room-paging)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() { return create("room.paging"); }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("room.runtime"); }

    }

    public static class TestLibraryAccessors extends SubDependencyFactory {
        private final TestAndroidxLibraryAccessors laccForTestAndroidxLibraryAccessors = new TestAndroidxLibraryAccessors(owner);
        private final TestJunitLibraryAccessors laccForTestJunitLibraryAccessors = new TestJunitLibraryAccessors(owner);

        public TestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit4 (junit:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() { return create("test.junit4"); }

            /**
             * Creates a dependency provider for mockk (io.mockk:mockk)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockk() { return create("test.mockk"); }

            /**
             * Creates a dependency provider for navigation (androidx.navigation:navigation-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() { return create("test.navigation"); }

            /**
             * Creates a dependency provider for robolectric (org.robolectric:robolectric)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRobolectric() { return create("test.robolectric"); }

        /**
         * Returns the group of libraries at test.androidx
         */
        public TestAndroidxLibraryAccessors getAndroidx() { return laccForTestAndroidxLibraryAccessors; }

        /**
         * Returns the group of libraries at test.junit
         */
        public TestJunitLibraryAccessors getJunit() { return laccForTestJunitLibraryAccessors; }

    }

    public static class TestAndroidxLibraryAccessors extends SubDependencyFactory {

        public TestAndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("test.androidx.core"); }

    }

    public static class TestJunitLibraryAccessors extends SubDependencyFactory {

        public TestJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.test.ext:junit-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("test.junit.ktx"); }

    }

    public static class ZekoLibraryAccessors extends SubDependencyFactory {
        private final ZekoQueryLibraryAccessors laccForZekoQueryLibraryAccessors = new ZekoQueryLibraryAccessors(owner);

        public ZekoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at zeko.query
         */
        public ZekoQueryLibraryAccessors getQuery() { return laccForZekoQueryLibraryAccessors; }

    }

    public static class ZekoQueryLibraryAccessors extends SubDependencyFactory {

        public ZekoQueryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for builder (com.github.gissilali:Zeko-SQL-Builder)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBuilder() { return create("zeko.query.builder"); }

    }

    public static class ZxingLibraryAccessors extends SubDependencyFactory {

        public ZxingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.google.zxing:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("zxing.core"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidVersionAccessors vaccForAndroidVersionAccessors = new AndroidVersionAccessors(providers, config);
        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final CoilVersionAccessors vaccForCoilVersionAccessors = new CoilVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final FirebaseVersionAccessors vaccForFirebaseVersionAccessors = new FirebaseVersionAccessors(providers, config);
        private final GmsVersionAccessors vaccForGmsVersionAccessors = new GmsVersionAccessors(providers, config);
        private final HiltVersionAccessors vaccForHiltVersionAccessors = new HiltVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final LottieVersionAccessors vaccForLottieVersionAccessors = new LottieVersionAccessors(providers, config);
        private final PagingVersionAccessors vaccForPagingVersionAccessors = new PagingVersionAccessors(providers, config);
        private final ResultVersionAccessors vaccForResultVersionAccessors = new ResultVersionAccessors(providers, config);
        private final TestVersionAccessors vaccForTestVersionAccessors = new TestVersionAccessors(providers, config);
        private final ZekoVersionAccessors vaccForZekoVersionAccessors = new ZekoVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist (0.25.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAccompanist() { return getVersion("accompanist"); }

            /**
             * Returns the version associated to this alias: appcompat (1.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("appcompat"); }

            /**
             * Returns the version associated to this alias: biometric (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBiometric() { return getVersion("biometric"); }

            /**
             * Returns the version associated to this alias: camerax (1.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCamerax() { return getVersion("camerax"); }

            /**
             * Returns the version associated to this alias: coroutines (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("coroutines"); }

            /**
             * Returns the version associated to this alias: datastore (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatastore() { return getVersion("datastore"); }

            /**
             * Returns the version associated to this alias: date (1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDate() { return getVersion("date"); }

            /**
             * Returns the version associated to this alias: detekt (1.19.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDetekt() { return getVersion("detekt"); }

            /**
             * Returns the version associated to this alias: dokka (1.8.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDokka() { return getVersion("dokka"); }

            /**
             * Returns the version associated to this alias: espresso (3.5.0-alpha07)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEspresso() { return getVersion("espresso"); }

            /**
             * Returns the version associated to this alias: exoplayer (2.18.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getExoplayer() { return getVersion("exoplayer"); }

            /**
             * Returns the version associated to this alias: gradleplugin (8.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradleplugin() { return getVersion("gradleplugin"); }

            /**
             * Returns the version associated to this alias: gson (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: koin (3.1.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoin() { return getVersion("koin"); }

            /**
             * Returns the version associated to this alias: ksp (1.8.10-1.0.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKsp() { return getVersion("ksp"); }

            /**
             * Returns the version associated to this alias: ktlint (11.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtlint() { return getVersion("ktlint"); }

            /**
             * Returns the version associated to this alias: ktor (2.0.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: lifecycle (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("lifecycle"); }

            /**
             * Returns the version associated to this alias: material (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: room (2.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: splash (1.0.0-rc01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSplash() { return getVersion("splash"); }

            /**
             * Returns the version associated to this alias: spotless (6.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSpotless() { return getVersion("spotless"); }

            /**
             * Returns the version associated to this alias: timber (5.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTimber() { return getVersion("timber"); }

            /**
             * Returns the version associated to this alias: zxing (3.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getZxing() { return getVersion("zxing"); }

        /**
         * Returns the group of versions at versions.android
         */
        public AndroidVersionAccessors getAndroid() { return vaccForAndroidVersionAccessors; }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.coil
         */
        public CoilVersionAccessors getCoil() { return vaccForCoilVersionAccessors; }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() { return vaccForComposeVersionAccessors; }

        /**
         * Returns the group of versions at versions.firebase
         */
        public FirebaseVersionAccessors getFirebase() { return vaccForFirebaseVersionAccessors; }

        /**
         * Returns the group of versions at versions.gms
         */
        public GmsVersionAccessors getGms() { return vaccForGmsVersionAccessors; }

        /**
         * Returns the group of versions at versions.hilt
         */
        public HiltVersionAccessors getHilt() { return vaccForHiltVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlin
         */
        public KotlinVersionAccessors getKotlin() { return vaccForKotlinVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() { return vaccForKotlinxVersionAccessors; }

        /**
         * Returns the group of versions at versions.lottie
         */
        public LottieVersionAccessors getLottie() { return vaccForLottieVersionAccessors; }

        /**
         * Returns the group of versions at versions.paging
         */
        public PagingVersionAccessors getPaging() { return vaccForPagingVersionAccessors; }

        /**
         * Returns the group of versions at versions.result
         */
        public ResultVersionAccessors getResult() { return vaccForResultVersionAccessors; }

        /**
         * Returns the group of versions at versions.test
         */
        public TestVersionAccessors getTest() { return vaccForTestVersionAccessors; }

        /**
         * Returns the group of versions at versions.zeko
         */
        public ZekoVersionAccessors getZeko() { return vaccForZekoVersionAccessors; }

    }

    public static class AndroidVersionAccessors extends VersionFactory  {

        private final AndroidTestVersionAccessors vaccForAndroidTestVersionAccessors = new AndroidTestVersionAccessors(providers, config);
        public AndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.android.test
         */
        public AndroidTestVersionAccessors getTest() { return vaccForAndroidTestVersionAccessors; }

    }

    public static class AndroidTestVersionAccessors extends VersionFactory  {

        public AndroidTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: android.test.junit4 (1.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit4() { return getVersion("android.test.junit4"); }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.core (1.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

    }

    public static class CoilVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public CoilVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: coil (2.2.2)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("coil"); }

            /**
             * Returns the version associated to this alias: coil.gf (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGf() { return getVersion("coil.gf"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final ComposePreviewVersionAccessors vaccForComposePreviewVersionAccessors = new ComposePreviewVersionAccessors(providers, config);
        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: compose (1.4.3)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: compose.activity (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("compose.activity"); }

            /**
             * Returns the version associated to this alias: compose.bom (2023.04.01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBom() { return getVersion("compose.bom"); }

            /**
             * Returns the version associated to this alias: compose.compiler (1.4.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompiler() { return getVersion("compose.compiler"); }

            /**
             * Returns the version associated to this alias: compose.constraintlayout (1.0.0-rc02)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getConstraintlayout() { return getVersion("compose.constraintlayout"); }

            /**
             * Returns the version associated to this alias: compose.navigation (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("compose.navigation"); }

        /**
         * Returns the group of versions at versions.compose.preview
         */
        public ComposePreviewVersionAccessors getPreview() { return vaccForComposePreviewVersionAccessors; }

    }

    public static class ComposePreviewVersionAccessors extends VersionFactory  {

        private final ComposePreviewCustomviewVersionAccessors vaccForComposePreviewCustomviewVersionAccessors = new ComposePreviewCustomviewVersionAccessors(providers, config);
        public ComposePreviewVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.compose.preview.customview
         */
        public ComposePreviewCustomviewVersionAccessors getCustomview() { return vaccForComposePreviewCustomviewVersionAccessors; }

    }

    public static class ComposePreviewCustomviewVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public ComposePreviewCustomviewVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: compose.preview.customview (1.2.0-alpha01)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("compose.preview.customview"); }

            /**
             * Returns the version associated to this alias: compose.preview.customview.poolingcontainer (1.0.0-rc01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPoolingcontainer() { return getVersion("compose.preview.customview.poolingcontainer"); }

    }

    public static class FirebaseVersionAccessors extends VersionFactory  {

        public FirebaseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: firebase.bom (30.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBom() { return getVersion("firebase.bom"); }

    }

    public static class GmsVersionAccessors extends VersionFactory  {

        private final GmsPlayVersionAccessors vaccForGmsPlayVersionAccessors = new GmsPlayVersionAccessors(providers, config);
        public GmsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.gms.play
         */
        public GmsPlayVersionAccessors getPlay() { return vaccForGmsPlayVersionAccessors; }

    }

    public static class GmsPlayVersionAccessors extends VersionFactory  {

        private final GmsPlayServicesVersionAccessors vaccForGmsPlayServicesVersionAccessors = new GmsPlayServicesVersionAccessors(providers, config);
        public GmsPlayVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.gms.play.services
         */
        public GmsPlayServicesVersionAccessors getServices() { return vaccForGmsPlayServicesVersionAccessors; }

    }

    public static class GmsPlayServicesVersionAccessors extends VersionFactory  {

        public GmsPlayServicesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gms.play.services.auth (20.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAuth() { return getVersion("gms.play.services.auth"); }

    }

    public static class HiltVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public HiltVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: hilt (2.42)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: hilt.compiler (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompiler() { return getVersion("hilt.compiler"); }

            /**
             * Returns the version associated to this alias: hilt.navigation (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("hilt.navigation"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: kotlin (1.8.10)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlin.datetime (0.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatetime() { return getVersion("kotlin.datetime"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        private final KotlinxCoroutinesVersionAccessors vaccForKotlinxCoroutinesVersionAccessors = new KotlinxCoroutinesVersionAccessors(providers, config);
        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.serialization (1.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSerialization() { return getVersion("kotlinx.serialization"); }

        /**
         * Returns the group of versions at versions.kotlinx.coroutines
         */
        public KotlinxCoroutinesVersionAccessors getCoroutines() { return vaccForKotlinxCoroutinesVersionAccessors; }

    }

    public static class KotlinxCoroutinesVersionAccessors extends VersionFactory  {

        public KotlinxCoroutinesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.coroutines.core (1.3.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("kotlinx.coroutines.core"); }

    }

    public static class LottieVersionAccessors extends VersionFactory  {

        public LottieVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: lottie.compose (5.0.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("lottie.compose"); }

    }

    public static class PagingVersionAccessors extends VersionFactory  {

        public PagingVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: paging.common (3.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCommon() { return getVersion("paging.common"); }

            /**
             * Returns the version associated to this alias: paging.compose (1.0.0-alpha14)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("paging.compose"); }

    }

    public static class ResultVersionAccessors extends VersionFactory  {

        public ResultVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: result.jvm (5.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJvm() { return getVersion("result.jvm"); }

    }

    public static class TestVersionAccessors extends VersionFactory  {

        private final TestAndroidxVersionAccessors vaccForTestAndroidxVersionAccessors = new TestAndroidxVersionAccessors(providers, config);
        private final TestJunitVersionAccessors vaccForTestJunitVersionAccessors = new TestJunitVersionAccessors(providers, config);
        public TestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: test.junit4 (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit4() { return getVersion("test.junit4"); }

            /**
             * Returns the version associated to this alias: test.mockk (1.12.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockk() { return getVersion("test.mockk"); }

            /**
             * Returns the version associated to this alias: test.navigation (2.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("test.navigation"); }

            /**
             * Returns the version associated to this alias: test.robolectric (4.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRobolectric() { return getVersion("test.robolectric"); }

        /**
         * Returns the group of versions at versions.test.androidx
         */
        public TestAndroidxVersionAccessors getAndroidx() { return vaccForTestAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.test.junit
         */
        public TestJunitVersionAccessors getJunit() { return vaccForTestJunitVersionAccessors; }

    }

    public static class TestAndroidxVersionAccessors extends VersionFactory  {

        public TestAndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: test.androidx.core (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("test.androidx.core"); }

    }

    public static class TestJunitVersionAccessors extends VersionFactory  {

        public TestJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: test.junit.ktx (1.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtx() { return getVersion("test.junit.ktx"); }

    }

    public static class ZekoVersionAccessors extends VersionFactory  {

        private final ZekoQueryVersionAccessors vaccForZekoQueryVersionAccessors = new ZekoQueryVersionAccessors(providers, config);
        public ZekoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.zeko.query
         */
        public ZekoQueryVersionAccessors getQuery() { return vaccForZekoQueryVersionAccessors; }

    }

    public static class ZekoQueryVersionAccessors extends VersionFactory  {

        public ZekoQueryVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: zeko.query.builder (1.4.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBuilder() { return getVersion("zeko.query.builder"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final InternalBundleAccessors baccForInternalBundleAccessors = new InternalBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for accompanist which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.accompanist:accompanist-navigation-animation</li>
             *    <li>com.google.accompanist:accompanist-flowlayout</li>
             *    <li>com.google.accompanist:accompanist-pager-indicators</li>
             *    <li>com.google.accompanist:accompanist-permissions</li>
             *    <li>com.google.accompanist:accompanist-navigation-material</li>
             *    <li>com.google.accompanist:accompanist-navigation-material</li>
             *    <li>com.google.accompanist:accompanist-insets</li>
             *    <li>com.google.accompanist:accompanist-pager</li>
             *    <li>com.google.accompanist:accompanist-permissions</li>
             *    <li>com.google.accompanist:accompanist-swiperefresh</li>
             *    <li>com.google.accompanist:accompanist-systemuicontroller</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getAccompanist() { return createBundle("accompanist"); }

            /**
             * Creates a dependency bundle provider for compose which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.compose.foundation:foundation</li>
             *    <li>io.coil-kt:coil-compose</li>
             *    <li>androidx.activity:activity-compose</li>
             *    <li>androidx.compose.compiler:compiler</li>
             *    <li>androidx.compose.runtime:runtime</li>
             *    <li>androidx.compose.material3:material3</li>
             *    <li>androidx.compose.material:material-icons-extended</li>
             *    <li>androidx.compose.runtime:runtime-livedata</li>
             *    <li>androidx.compose.ui:ui</li>
             *    <li>androidx.compose.ui:ui-util</li>
             *    <li>androidx.compose.ui:ui-tooling</li>
             *    <li>androidx.compose.ui:ui-tooling-preview</li>
             *    <li>androidx.paging:paging-compose</li>
             *    <li>androidx.customview:customview</li>
             *    <li>androidx.customview:customview-poolingcontainer</li>
             *    <li>androidx.constraintlayout:constraintlayout-compose</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCompose() { return createBundle("compose"); }

            /**
             * Creates a dependency bundle provider for firebase which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.firebase:firebase-messaging-ktx</li>
             *    <li>com.google.firebase:firebase-crashlytics-ktx</li>
             *    <li>com.google.firebase:firebase-analytics-ktx</li>
             *    <li>com.google.firebase:firebase-perf-ktx</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getFirebase() { return createBundle("firebase"); }

            /**
             * Creates a dependency bundle provider for koin which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.insert-koin:koin-android</li>
             *    <li>io.insert-koin:koin-androidx-compose</li>
             *    <li>io.insert-koin:koin-core</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKoin() { return createBundle("koin"); }

            /**
             * Creates a dependency bundle provider for ktor which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.ktor:ktor-client-core</li>
             *    <li>io.ktor:ktor-client-android</li>
             *    <li>io.ktor:ktor-serialization-kotlinx-json</li>
             *    <li>io.ktor:ktor-client-content-negotiation</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKtor() { return createBundle("ktor"); }

            /**
             * Creates a dependency bundle provider for lifecycle which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.lifecycle:lifecycle-livedata-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-runtime-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-compose</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-savedstate</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getLifecycle() { return createBundle("lifecycle"); }

            /**
             * Creates a dependency bundle provider for room which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.room:room-ktx</li>
             *    <li>androidx.room:room-paging</li>
             *    <li>androidx.room:room-runtime</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRoom() { return createBundle("room"); }

        /**
         * Returns the group of bundles at bundles.internal
         */
        public InternalBundleAccessors getInternal() { return baccForInternalBundleAccessors; }

    }

    public static class InternalBundleAccessors extends BundleFactory {

        public InternalBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for internal.camerax which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.camera:camera-core</li>
             *    <li>androidx.camera:camera-camera2</li>
             *    <li>androidx.camera:camera-video</li>
             *    <li>androidx.camera:camera-lifecycle</li>
             *    <li>androidx.camera:camera-view</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCamerax() { return createBundle("internal.camerax"); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AndroidPluginAccessors paccForAndroidPluginAccessors = new AndroidPluginAccessors(providers, config);
        private final HiltPluginAccessors paccForHiltPluginAccessors = new HiltPluginAccessors(providers, config);
        private final KotlinPluginAccessors paccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);
        private final TomlPluginAccessors paccForTomlPluginAccessors = new TomlPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for detekt to the plugin id 'io.gitlab.arturbosch.detekt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDetekt() { return createPlugin("detekt"); }

            /**
             * Creates a plugin provider for dokka to the plugin id 'org.jetbrains.dokka'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDokka() { return createPlugin("dokka"); }

            /**
             * Creates a plugin provider for jvm to the plugin id 'org.jetbrains.kotlin.jvm'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJvm() { return createPlugin("jvm"); }

            /**
             * Creates a plugin provider for kapt to the plugin id 'org.jetbrains.kotlin.kapt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKapt() { return createPlugin("kapt"); }

            /**
             * Creates a plugin provider for ksp to the plugin id 'com.google.devtools.ksp'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("ksp"); }

            /**
             * Creates a plugin provider for ktlint to the plugin id 'org.jlleitschuh.gradle.ktlint'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKtlint() { return createPlugin("ktlint"); }

            /**
             * Creates a plugin provider for spotless to the plugin id 'com.diffplug.spotless'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSpotless() { return createPlugin("spotless"); }

        /**
         * Returns the group of plugins at plugins.android
         */
        public AndroidPluginAccessors getAndroid() { return paccForAndroidPluginAccessors; }

        /**
         * Returns the group of plugins at plugins.hilt
         */
        public HiltPluginAccessors getHilt() { return paccForHiltPluginAccessors; }

        /**
         * Returns the group of plugins at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() { return paccForKotlinPluginAccessors; }

        /**
         * Returns the group of plugins at plugins.toml
         */
        public TomlPluginAccessors getToml() { return paccForTomlPluginAccessors; }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for android.application to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

            /**
             * Creates a plugin provider for android.library to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary() { return createPlugin("android.library"); }

    }

    public static class HiltPluginAccessors extends PluginFactory {

        public HiltPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for hilt.plugin to the plugin id 'com.google.dagger.hilt.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("hilt.plugin"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.android to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("kotlin.android"); }

            /**
             * Creates a plugin provider for kotlin.kapt to the plugin id 'org.jetbrains.kotlin.kapt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKapt() { return createPlugin("kotlin.kapt"); }

            /**
             * Creates a plugin provider for kotlin.serialization to the plugin id 'org.jetbrains.kotlin.plugin.serialization'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSerialization() { return createPlugin("kotlin.serialization"); }

    }

    public static class TomlPluginAccessors extends PluginFactory {

        public TomlPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for toml.checker to the plugin id 'com.github.ben-manes.versions'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getChecker() { return createPlugin("toml.checker"); }

            /**
             * Creates a plugin provider for toml.updater to the plugin id 'nl.littlerobots.version-catalog-update'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getUpdater() { return createPlugin("toml.updater"); }

    }

}
