plugins {
    kotlin("js") apply false
}

val String.v: String get() = rootProject.extra["$this.version"] as String

allprojects {
    repositories {
        jcenter()
        mavenLocal()
    }
}
