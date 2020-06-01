import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
    id("org.jetbrains.dokka")
}

android {
    compileSdkVersion(Android.compileSdk)

    defaultConfig {
        minSdkVersion(Android.minSdk)
        targetSdkVersion(Android.targetSdk)

        versionCode = getGitCommits(projectDir.path)
        versionName = "${project.version}"

        testInstrumentationRunner = Android.testInstrumentRunner

        proguardFile("proguard-rules.pro")
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }

        getByName("release") {
            isMinifyEnabled = true

            proguardFile(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
    }

    compileOptions {
        encoding = Android.encoding
        sourceCompatibility = Android.sourceCompatibilityJava
        targetCompatibility = Android.targetCompatibilityJava
    }

    kotlinOptions {
        this as KotlinJvmOptions
        jvmTarget = "1.8"
    }

    lintOptions {
        lintConfig = rootProject.file("config/lint/lint.xml")
        htmlOutput = File(buildDir, "reports/lint/report-lint.html")
        xmlOutput = File(buildDir, "reports/lint/report-lint.xml")
    }
}

dependencies {
    implementation(project(":sample:addonapp:app:feature:login:login-data"))
    implementation(project(":sample:addonapp:codebase:codebase-infrastructure"))

    implementation(Dependencies.Kotlin.stdlibJdk)
    implementation(Dependencies.Kotlin.coroutinesCore)
    implementation(Dependencies.Kotlin.coroutinesAndroid)

    // Third-party
    implementation(Dependencies.Tools.timberKtx)
    kapt(Dependencies.AndroidX.roomCompiler)
    implementation(Dependencies.AndroidX.roomRuntime)
    implementation(Dependencies.AndroidX.roomKtx)

    // Test
    testImplementation(Dependencies.Test.junit)
    testImplementation(Dependencies.Test.kotlinTest)
    testImplementation(Dependencies.Test.mockkUnit)
    testImplementation(Dependencies.Test.mockkInstrument)
    // testImplementation(Dependencies.Test.testRunner)
}

tasks.getByName<DokkaTask>("dokka") {
    outputFormat = "html"
    outputDirectory = "${rootProject.buildDir}/documentation"
}
