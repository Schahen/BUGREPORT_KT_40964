plugins {
    id("org.jetbrains.kotlin.js")
}


kotlin {
    js {
        nodejs()
    }
    sourceSets {
        main {
            kotlin.srcDir("src")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
    kotlinOptions {
        moduleKind = "commonjs"
    }
}


