package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final ConstraintlayoutLibraryAccessors laccForConstraintlayoutLibraryAccessors = new ConstraintlayoutLibraryAccessors(owner);
    private final CoreLibraryAccessors laccForCoreLibraryAccessors = new CoreLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final LifecycleLibraryAccessors laccForLifecycleLibraryAccessors = new LifecycleLibraryAccessors(owner);
    private final NavigationLibraryAccessors laccForNavigationLibraryAccessors = new NavigationLibraryAccessors(owner);
    private final OkhttpLibraryAccessors laccForOkhttpLibraryAccessors = new OkhttpLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final TestLibraryAccessors laccForTestLibraryAccessors = new TestLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("appcompat"); }

        /**
         * Creates a dependency provider for gson (com.squareup.retrofit2:converter-gson)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() { return create("gson"); }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() { return create("junit"); }

        /**
         * Creates a dependency provider for okhttp3 (com.squareup.okhttp3:okhttp)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp3() { return create("okhttp3"); }

        /**
         * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetrofit() { return create("retrofit"); }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() { return laccForAndroidLibraryAccessors; }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() { return laccForCoilLibraryAccessors; }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() { return laccForComposeLibraryAccessors; }

    /**
     * Returns the group of libraries at constraintlayout
     */
    public ConstraintlayoutLibraryAccessors getConstraintlayout() { return laccForConstraintlayoutLibraryAccessors; }

    /**
     * Returns the group of libraries at core
     */
    public CoreLibraryAccessors getCore() { return laccForCoreLibraryAccessors; }

    /**
     * Returns the group of libraries at hilt
     */
    public HiltLibraryAccessors getHilt() { return laccForHiltLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() { return laccForKotlinxLibraryAccessors; }

    /**
     * Returns the group of libraries at lifecycle
     */
    public LifecycleLibraryAccessors getLifecycle() { return laccForLifecycleLibraryAccessors; }

    /**
     * Returns the group of libraries at navigation
     */
    public NavigationLibraryAccessors getNavigation() { return laccForNavigationLibraryAccessors; }

    /**
     * Returns the group of libraries at okhttp
     */
    public OkhttpLibraryAccessors getOkhttp() { return laccForOkhttpLibraryAccessors; }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() { return laccForRoomLibraryAccessors; }

    /**
     * Returns the group of libraries at test
     */
    public TestLibraryAccessors getTest() { return laccForTestLibraryAccessors; }

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

    public static class AndroidLibraryAccessors extends SubDependencyFactory {

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("android.material"); }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.coil-kt:coil-compose)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("coil.compose"); }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("compose.bom"); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() { return create("compose.foundation"); }

            /**
             * Creates a dependency provider for icons (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIcons() { return create("compose.icons"); }

            /**
             * Creates a dependency provider for livedata (androidx.compose.runtime:runtime-livedata)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLivedata() { return create("compose.livedata"); }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("compose.material"); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTooling() { return create("compose.tooling"); }

        /**
         * Returns the group of libraries at compose.ui
         */
        public ComposeUiLibraryAccessors getUi() { return laccForComposeUiLibraryAccessors; }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiTestLibraryAccessors laccForComposeUiTestLibraryAccessors = new ComposeUiTestLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.ui"); }

        /**
         * Returns the group of libraries at compose.ui.test
         */
        public ComposeUiTestLibraryAccessors getTest() { return laccForComposeUiTestLibraryAccessors; }

    }

    public static class ComposeUiTestLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (androidx.compose.ui:ui-test)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.ui.test"); }

            /**
             * Creates a dependency provider for junit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() { return create("compose.ui.test.junit4"); }

            /**
             * Creates a dependency provider for manifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getManifest() { return create("compose.ui.test.manifest"); }

    }

    public static class ConstraintlayoutLibraryAccessors extends SubDependencyFactory {

        public ConstraintlayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.constraintlayout:constraintlayout-compose)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("constraintlayout.compose"); }

    }

    public static class CoreLibraryAccessors extends SubDependencyFactory {

        public CoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("core.ktx"); }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory {
        private final HiltAndroidLibraryAccessors laccForHiltAndroidLibraryAccessors = new HiltAndroidLibraryAccessors(owner);
        private final HiltExtLibraryAccessors laccForHiltExtLibraryAccessors = new HiltExtLibraryAccessors(owner);

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-android-compiler)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("hilt.compiler"); }

            /**
             * Creates a dependency provider for gradlePlugin (com.google.dagger:hilt-android-gradle-plugin)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradlePlugin() { return create("hilt.gradlePlugin"); }

        /**
         * Returns the group of libraries at hilt.android
         */
        public HiltAndroidLibraryAccessors getAndroid() { return laccForHiltAndroidLibraryAccessors; }

        /**
         * Returns the group of libraries at hilt.ext
         */
        public HiltExtLibraryAccessors getExt() { return laccForHiltExtLibraryAccessors; }

    }

    public static class HiltAndroidLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public HiltAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("hilt.android"); }

            /**
             * Creates a dependency provider for testing (com.google.dagger:hilt-android-testing)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("hilt.android.testing"); }

    }

    public static class HiltExtLibraryAccessors extends SubDependencyFactory {

        public HiltExtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.hilt:hilt-compiler)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("hilt.ext.compiler"); }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() { return laccForKotlinxCoroutinesLibraryAccessors; }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("kotlinx.coroutines.android"); }

    }

    public static class LifecycleLibraryAccessors extends SubDependencyFactory {
        private final LifecycleLivedataLibraryAccessors laccForLifecycleLivedataLibraryAccessors = new LifecycleLivedataLibraryAccessors(owner);
        private final LifecycleRuntimeLibraryAccessors laccForLifecycleRuntimeLibraryAccessors = new LifecycleRuntimeLibraryAccessors(owner);
        private final LifecycleViewmodelLibraryAccessors laccForLifecycleViewmodelLibraryAccessors = new LifecycleViewmodelLibraryAccessors(owner);

        public LifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for viewModelCompose (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewModelCompose() { return create("lifecycle.viewModelCompose"); }

        /**
         * Returns the group of libraries at lifecycle.livedata
         */
        public LifecycleLivedataLibraryAccessors getLivedata() { return laccForLifecycleLivedataLibraryAccessors; }

        /**
         * Returns the group of libraries at lifecycle.runtime
         */
        public LifecycleRuntimeLibraryAccessors getRuntime() { return laccForLifecycleRuntimeLibraryAccessors; }

        /**
         * Returns the group of libraries at lifecycle.viewmodel
         */
        public LifecycleViewmodelLibraryAccessors getViewmodel() { return laccForLifecycleViewmodelLibraryAccessors; }

    }

    public static class LifecycleLivedataLibraryAccessors extends SubDependencyFactory {

        public LifecycleLivedataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("lifecycle.livedata.ktx"); }

    }

    public static class LifecycleRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public LifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("lifecycle.runtime"); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-runtime-compose)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("lifecycle.runtime.compose"); }

    }

    public static class LifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public LifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("lifecycle.viewmodel.ktx"); }

            /**
             * Creates a dependency provider for savedstate (androidx.lifecycle:lifecycle-viewmodel-savedstate)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSavedstate() { return create("lifecycle.viewmodel.savedstate"); }

    }

    public static class NavigationLibraryAccessors extends SubDependencyFactory {
        private final NavigationUiLibraryAccessors laccForNavigationUiLibraryAccessors = new NavigationUiLibraryAccessors(owner);

        public NavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("navigation.compose"); }

            /**
             * Creates a dependency provider for fragment (androidx.navigation:navigation-fragment-ktx)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFragment() { return create("navigation.fragment"); }

        /**
         * Returns the group of libraries at navigation.ui
         */
        public NavigationUiLibraryAccessors getUi() { return laccForNavigationUiLibraryAccessors; }

    }

    public static class NavigationUiLibraryAccessors extends SubDependencyFactory {

        public NavigationUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.navigation:navigation-ui-ktx)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("navigation.ui.ktx"); }

    }

    public static class OkhttpLibraryAccessors extends SubDependencyFactory {

        public OkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for logging (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() { return create("okhttp.logging"); }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("room.compiler"); }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("room.ktx"); }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("room.runtime"); }

    }

    public static class TestLibraryAccessors extends SubDependencyFactory {
        private final TestEspressoLibraryAccessors laccForTestEspressoLibraryAccessors = new TestEspressoLibraryAccessors(owner);
        private final TestExtLibraryAccessors laccForTestExtLibraryAccessors = new TestExtLibraryAccessors(owner);

        public TestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at test.espresso
         */
        public TestEspressoLibraryAccessors getEspresso() { return laccForTestEspressoLibraryAccessors; }

        /**
         * Returns the group of libraries at test.ext
         */
        public TestExtLibraryAccessors getExt() { return laccForTestExtLibraryAccessors; }

    }

    public static class TestEspressoLibraryAccessors extends SubDependencyFactory {

        public TestEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("test.espresso.core"); }

    }

    public static class TestExtLibraryAccessors extends SubDependencyFactory {

        public TestExtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("test.ext.junit"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final AppcompatVersionAccessors vaccForAppcompatVersionAccessors = new AppcompatVersionAccessors(providers, config);
        private final CoilVersionAccessors vaccForCoilVersionAccessors = new CoilVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final CoreVersionAccessors vaccForCoreVersionAccessors = new CoreVersionAccessors(providers, config);
        private final CoroutineVersionAccessors vaccForCoroutineVersionAccessors = new CoroutineVersionAccessors(providers, config);
        private final EspressoVersionAccessors vaccForEspressoVersionAccessors = new EspressoVersionAccessors(providers, config);
        private final GradleVersionAccessors vaccForGradleVersionAccessors = new GradleVersionAccessors(providers, config);
        private final GsonVersionAccessors vaccForGsonVersionAccessors = new GsonVersionAccessors(providers, config);
        private final HiltVersionAccessors vaccForHiltVersionAccessors = new HiltVersionAccessors(providers, config);
        private final InterceptorVersionAccessors vaccForInterceptorVersionAccessors = new InterceptorVersionAccessors(providers, config);
        private final JunitVersionAccessors vaccForJunitVersionAccessors = new JunitVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        private final LifecycleVersionAccessors vaccForLifecycleVersionAccessors = new LifecycleVersionAccessors(providers, config);
        private final MaterialVersionAccessors vaccForMaterialVersionAccessors = new MaterialVersionAccessors(providers, config);
        private final NavigationVersionAccessors vaccForNavigationVersionAccessors = new NavigationVersionAccessors(providers, config);
        private final OkhttpVersionAccessors vaccForOkhttpVersionAccessors = new OkhttpVersionAccessors(providers, config);
        private final RetrofitVersionAccessors vaccForRetrofitVersionAccessors = new RetrofitVersionAccessors(providers, config);
        private final RoomVersionAccessors vaccForRoomVersionAccessors = new RoomVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: buildToolsVersion (33.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getBuildToolsVersion() { return getVersion("buildToolsVersion"); }

            /**
             * Returns the version associated to this alias: compileSdkVersion (33)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getCompileSdkVersion() { return getVersion("compileSdkVersion"); }

            /**
             * Returns the version associated to this alias: constraintlayout (1.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getConstraintlayout() { return getVersion("constraintlayout"); }

            /**
             * Returns the version associated to this alias: hiltExt (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getHiltExt() { return getVersion("hiltExt"); }

            /**
             * Returns the version associated to this alias: minSdkVersion (26)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getMinSdkVersion() { return getVersion("minSdkVersion"); }

            /**
             * Returns the version associated to this alias: targetSdkVersion (33)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getTargetSdkVersion() { return getVersion("targetSdkVersion"); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.appcompat
         */
        public AppcompatVersionAccessors getAppcompat() { return vaccForAppcompatVersionAccessors; }

        /**
         * Returns the group of versions at versions.coil
         */
        public CoilVersionAccessors getCoil() { return vaccForCoilVersionAccessors; }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() { return vaccForComposeVersionAccessors; }

        /**
         * Returns the group of versions at versions.core
         */
        public CoreVersionAccessors getCore() { return vaccForCoreVersionAccessors; }

        /**
         * Returns the group of versions at versions.coroutine
         */
        public CoroutineVersionAccessors getCoroutine() { return vaccForCoroutineVersionAccessors; }

        /**
         * Returns the group of versions at versions.espresso
         */
        public EspressoVersionAccessors getEspresso() { return vaccForEspressoVersionAccessors; }

        /**
         * Returns the group of versions at versions.gradle
         */
        public GradleVersionAccessors getGradle() { return vaccForGradleVersionAccessors; }

        /**
         * Returns the group of versions at versions.gson
         */
        public GsonVersionAccessors getGson() { return vaccForGsonVersionAccessors; }

        /**
         * Returns the group of versions at versions.hilt
         */
        public HiltVersionAccessors getHilt() { return vaccForHiltVersionAccessors; }

        /**
         * Returns the group of versions at versions.interceptor
         */
        public InterceptorVersionAccessors getInterceptor() { return vaccForInterceptorVersionAccessors; }

        /**
         * Returns the group of versions at versions.junit
         */
        public JunitVersionAccessors getJunit() { return vaccForJunitVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlin
         */
        public KotlinVersionAccessors getKotlin() { return vaccForKotlinVersionAccessors; }

        /**
         * Returns the group of versions at versions.lifecycle
         */
        public LifecycleVersionAccessors getLifecycle() { return vaccForLifecycleVersionAccessors; }

        /**
         * Returns the group of versions at versions.material
         */
        public MaterialVersionAccessors getMaterial() { return vaccForMaterialVersionAccessors; }

        /**
         * Returns the group of versions at versions.navigation
         */
        public NavigationVersionAccessors getNavigation() { return vaccForNavigationVersionAccessors; }

        /**
         * Returns the group of versions at versions.okhttp
         */
        public OkhttpVersionAccessors getOkhttp() { return vaccForOkhttpVersionAccessors; }

        /**
         * Returns the group of versions at versions.retrofit
         */
        public RetrofitVersionAccessors getRetrofit() { return vaccForRetrofitVersionAccessors; }

        /**
         * Returns the group of versions at versions.room
         */
        public RoomVersionAccessors getRoom() { return vaccForRoomVersionAccessors; }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxTestVersionAccessors vaccForAndroidxTestVersionAccessors = new AndroidxTestVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx.test
         */
        public AndroidxTestVersionAccessors getTest() { return vaccForAndroidxTestVersionAccessors; }

    }

    public static class AndroidxTestVersionAccessors extends VersionFactory  {

        public AndroidxTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.test.version (1.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("androidx.test.version"); }

    }

    public static class AppcompatVersionAccessors extends VersionFactory  {

        public AppcompatVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: appcompat.version (1.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("appcompat.version"); }

    }

    public static class CoilVersionAccessors extends VersionFactory  {

        public CoilVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: coil.version (2.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("coil.version"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  {

        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: compose.bom (2023.01.00)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getBom() { return getVersion("compose.bom"); }

            /**
             * Returns the version associated to this alias: compose.version (1.3.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("compose.version"); }

    }

    public static class CoreVersionAccessors extends VersionFactory  {

        private final CoreKtxVersionAccessors vaccForCoreKtxVersionAccessors = new CoreKtxVersionAccessors(providers, config);
        public CoreVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.core.ktx
         */
        public CoreKtxVersionAccessors getKtx() { return vaccForCoreKtxVersionAccessors; }

    }

    public static class CoreKtxVersionAccessors extends VersionFactory  {

        public CoreKtxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: core.ktx.version (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("core.ktx.version"); }

    }

    public static class CoroutineVersionAccessors extends VersionFactory  {

        public CoroutineVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: coroutine.version (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("coroutine.version"); }

    }

    public static class EspressoVersionAccessors extends VersionFactory  {

        public EspressoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: espresso.version (3.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("espresso.version"); }

    }

    public static class GradleVersionAccessors extends VersionFactory  {

        public GradleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gradle.version (7.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("gradle.version"); }

    }

    public static class GsonVersionAccessors extends VersionFactory  {

        public GsonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gson.version (2.8.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("gson.version"); }

    }

    public static class HiltVersionAccessors extends VersionFactory  {

        public HiltVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: hilt.version (2.45)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("hilt.version"); }

    }

    public static class InterceptorVersionAccessors extends VersionFactory  {

        public InterceptorVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: interceptor.version (4.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("interceptor.version"); }

    }

    public static class JunitVersionAccessors extends VersionFactory  {

        public JunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: junit.version (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("junit.version"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  {

        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlin.version (1.7.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("kotlin.version"); }

    }

    public static class LifecycleVersionAccessors extends VersionFactory  {

        public LifecycleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: lifecycle.version (2.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("lifecycle.version"); }

    }

    public static class MaterialVersionAccessors extends VersionFactory  {

        public MaterialVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: material.version (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("material.version"); }

    }

    public static class NavigationVersionAccessors extends VersionFactory  {

        private final NavigationComposeVersionAccessors vaccForNavigationComposeVersionAccessors = new NavigationComposeVersionAccessors(providers, config);
        public NavigationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.navigation.compose
         */
        public NavigationComposeVersionAccessors getCompose() { return vaccForNavigationComposeVersionAccessors; }

    }

    public static class NavigationComposeVersionAccessors extends VersionFactory  {

        public NavigationComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: navigation.compose.version (2.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("navigation.compose.version"); }

    }

    public static class OkhttpVersionAccessors extends VersionFactory  {

        public OkhttpVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: okhttp.version (4.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("okhttp.version"); }

    }

    public static class RetrofitVersionAccessors extends VersionFactory  {

        public RetrofitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: retrofit.version (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("retrofit.version"); }

    }

    public static class RoomVersionAccessors extends VersionFactory  {

        public RoomVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: room.version (2.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("room.version"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for compose which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.compose.ui:ui</li>
             *    <li>androidx.compose.material:material</li>
             *    <li>androidx.compose.material:material-icons-extended</li>
             *    <li>androidx.compose.ui:ui-tooling</li>
             *    <li>androidx.compose.runtime:runtime-livedata</li>
             *    <li>androidx.compose.foundation:foundation</li>
             * </ul>
             * This bundle was declared in catalog libraries.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCompose() { return createBundle("compose"); }

            /**
             * Creates a dependency bundle provider for lifecycle which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-runtime-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-runtime-compose</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-compose</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-savedstate</li>
             * </ul>
             * This bundle was declared in catalog libraries.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getLifecycle() { return createBundle("lifecycle"); }

            /**
             * Creates a dependency bundle provider for network which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.squareup.retrofit2:retrofit</li>
             *    <li>com.squareup.retrofit2:converter-gson</li>
             *    <li>com.squareup.okhttp3:okhttp</li>
             *    <li>com.squareup.okhttp3:logging-interceptor</li>
             * </ul>
             * This bundle was declared in catalog libraries.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getNetwork() { return createBundle("network"); }

            /**
             * Creates a dependency bundle provider for test which is an aggregate for the following dependencies:
             * <ul>
             *    <li>junit:junit</li>
             *    <li>androidx.compose.ui:ui-test</li>
             *    <li>androidx.compose.ui:ui-test-junit4</li>
             *    <li>androidx.compose.ui:ui-test-manifest</li>
             *    <li>androidx.test.espresso:espresso-core</li>
             *    <li>androidx.test.ext:junit</li>
             * </ul>
             * This bundle was declared in catalog libraries.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getTest() { return createBundle("test"); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
