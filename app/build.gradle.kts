plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.curvilina001"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.curvilina001"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    implementation ("androidx.appcompat:appcompat:1.6.0")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("androidx.core:core-ktx:1.8.0")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    //teste de conexão
    implementation("androidx.compose.ui:ui:1.6.6")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.6")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.activity:activity-compose:1.10.0")
    implementation("androidx.compose.runtime:runtime-livedata:1.7.0")
    implementation("androidx.compose.material:material-icons-extended:1.6.6")
    implementation("androidx.compose.material:material-icons-core:1.6.6")
    implementation("androidx.compose.foundation:foundation:1.6.6")
    implementation("androidx.compose.foundation:foundation-layout:1.6.6")
    implementation("androidx.compose.animation:animation:1.6.6")
    implementation("androidx.compose.animation:animation-core:1.6.6")
    implementation("androidx.compose.ui:ui-util:1.6.6")
    implementation("androidx.compose.ui:ui-graphics:1.6.6")
    implementation("androidx.compose.ui:ui-geometry:1.6.6")
    implementation("androidx.compose.ui:ui-unit:1.6.6")
    implementation("androidx.compose.ui:ui-text:1.6.6")
    implementation("androidx.compose.ui:ui-tooling-data:1.6.6")
    implementation("androidx.compose.ui:ui-test-manifest:1.6.6")
    implementation("androidx.compose.runtime:runtime-saveable:1.7.0")
    implementation("androidx.compose.runtime:runtime:1.7.0")
    implementation("androidx.core:core:1.15.0")
    implementation("androidx.activity:activity:1.10.0")
    implementation("androidx.annotation:annotation-experimental:1.4.1")
    implementation("com.google.android.material:material:1.11.0")
        // ... outras dependências


}