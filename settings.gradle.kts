pluginManagement {
    plugins {
        fun String.v() = extra["$this.version"].toString()
        kotlin("js") version "kotlin".v()
    }
}

rootProject.name = "myproject"

include(
    "app",
    "nodejs"
)
