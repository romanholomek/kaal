import org.gradle.api.JavaVersion


object Android {
    const val applicationId = "cz.eman.kaal.sample"
    const val groupId = "cz.eman.kaal"

    const val minSdk = 21
    const val targetSdk = 29
    const val compileSdk = 29
    const val buildTools = "29.0.3"

    const val versionCode = 1
    const val versionName = "1"

    const val encoding = "UTF-8"
    const val testInstrumentRunner = "androidx.test.runner.AndroidJUnitRunner"
    val sourceCompatibilityJava = JavaVersion.VERSION_1_8
    val targetCompatibilityJava = JavaVersion.VERSION_1_8
}

object Dependencies {

    object GradlePlugins {
        const val encoding = "UTF-8"
        const val gradle = Versions.gradle

        const val androidGradle = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
        const val bintrayGradle = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintrayGradle}"
        const val safeArgs =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationComponent}"
    }

    object Kotlin {
        const val stdlibJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object AndroidX {

        const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val supportFragment = "androidx.fragment:fragment:${Versions.fragment}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val liveDataKtx =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.archLifecycle}"
        const val lifecycleRuntime =
            "androidx.lifecycle:lifecycle-runtime:${Versions.archLifecycle}"
        const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:${Versions.archLifecycle}"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.archLifecycle}"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationComponent}"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationComponent}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val bindingCompiler =
            "androidx.databinding:databinding-compiler:${Versions.gradleBuildTools}"
        const val printHelper = "androidx.print:print:${Versions.xprint}"
    }

    object Google {
        const val materialDesign = "com.google.android.material:material:${Versions.material}"
    }

    object Koin {
        const val scope = "org.koin:koin-androidx-scope:${Versions.koin}" // Koin Android Scope feature
        const val android = "org.koin:koin-android:${Versions.koin}"
        const val viewModel =
            "org.koin:koin-androidx-viewmodel:${Versions.koin}" // Koin Android ViewModel feature
    }

    /* =============================  TEST ================================ */
    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val kotlinTest = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlinTest}"
        const val mockkUnit = "io.mockk:mockk:${Versions.mockk}"
        const val mockkInstrument = "io.mockk:mockk-android:${Versions.mockk}"
    }

    object Tools {
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        const val timberKtx = "cz.eman.logger:timber-ktx:${Versions.timberKtx}"
    }

    /* =============================  OTHERS ================================ */
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"

}
