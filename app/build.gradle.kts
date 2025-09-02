
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.gms.google.services)
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.22"
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.fooddeliveryapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.fooddeliveryapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
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
        kotlinCompilerExtensionVersion = "1.5.14"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    // Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation("androidx.compose.material:material-icons-extended:1.6.7")

    // Hilt - Use consistent versions (2.51.1 is the latest stable as of now)
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-android-compiler:2.51.1") // Consistent version
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    // Remove the duplicate: kapt(libs.androidx.hilt.compiler)

    // Coil
    implementation("io.coil-kt:coil-compose:2.6.0")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")

    // Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

    // Accompanist Pager
    implementation ("com.google.accompanist:accompanist-pager:0.32.0")
    implementation ("com.google.accompanist:accompanist-pager-indicators:0.32.0")

    // Payment gateway
    implementation ("com.razorpay:checkout:1.6.40")

    // Custom bottom nav bar
    implementation ("com.canopas.compose-animated-navigationbar:bottombar:1.0.1")

    // Lottie
    implementation ("com.airbnb.android:lottie-compose:6.4.0")

    // System UI Controller
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")

    // Splash Screen
    implementation("androidx.core:core-splashscreen:1.0.1")
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}