buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("com.android.tools.build:gradle:4.2.0")
    }
}

group = "com.abysl"
version = "1.0"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.github.com/Dominaezzz/matrix-kt") {
            credentials {
                username = System.getenv("GITHUB_USER") // Your GitHub username.
                password = System.getenv("GITHUB_TOKEN") // A GitHub token with `read:packages`.
            }
        }
    }
}