package com.abysl.terminus

actual object Platform {
    actual fun getPlatform(): String {
        return "JVM"
    }
}