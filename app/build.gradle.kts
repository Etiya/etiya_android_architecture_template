plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-platform-android")
}

android {
    namespace = "com.etiya.template"
    compileSdk = libs.versions.compileSdkVersion.get().toInt()

    defaultConfig {
        applicationId = "com.etiya.template"
        minSdk = libs.versions.minSdkVersion.get().toInt()
        targetSdk = libs.versions.targetSdkVersion.get().toInt()
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testHandleProfiling = true
        manifestPlaceholders["appAuthRedirectScheme"] = "app"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    kapt {
        correctErrorTypes = true
    }

    buildTypes {
        release {
            buildConfigField("boolean", "DEBUG", "false")
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
        debug {
            testCoverage
        }
    }

    buildFeatures {
        buildConfig = true
    }

    flavorDimensions += "version"
    productFlavors {
        create("production") {
            dimension = "version"
            resValue ("string", "app_name", "TemplateApp")
            buildConfigField ("String", "API_URL", "\"https://{baseURL}.com/api/\"")
        }
        create("development") {
            dimension = "version"
            resValue ("string", "app_name", "TemplateAppDev")
            buildConfigField ("String", "API_URL", "\"https://{baseURL_dev}.com/api/\"")
        }

    }

    applicationVariants.all {
        val variant = this
        variant.outputs.map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }
            .forEach { output ->
                val outputFileName = "TemplateApp${variant.versionName}.apk"
                println("OutputFileName: $outputFileName")
                output.outputFileName = outputFileName
            }
    }

    lint {
        abortOnError = false
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }

}

dependencies {
    implementation(platform(libs.compose.bom))
    androidTestImplementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose)
    implementation (libs.navigation.compose)
    implementation (libs.navigation.fragment)
    implementation (libs.navigation.ui.ktx)
    implementation (libs.core.ktx)
    implementation (libs.kotlinx.coroutines.android)

    implementation (libs.constraintlayout.compose)
    implementation (libs.appcompat)
    implementation (libs.android.material)
    implementation (libs.coil.compose)

    implementation (libs.room.runtime)
    implementation (libs.room.ktx)

    kapt (libs.room.compiler)
    implementation (libs.bundles.network)
    implementation (libs.bundles.test)

    implementation (libs.hilt.android.v)
    implementation (libs.hilt.android.testing)
    kapt (libs.hilt.compiler)
    kapt (libs.hilt.ext.compiler)
    implementation (libs.hilt.gradlePlugin)
}