plugins {
     id("org.jetbrains.kotlin.js")
}

dependencies {
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
    withType<AbstractTestTask>().configureEach {
        testLogging {
            showStandardStreams = true
        }
    }
}


kotlin {
    js {
        browser()
        binaries.executable()
    }
}
