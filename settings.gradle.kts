pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "terminus"

include(":common")
include(":android");
include(":desktop")
include(":web")
include(":server")
