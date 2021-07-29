package com.abysl.terminus.mobile


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
