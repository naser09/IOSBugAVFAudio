package com.example.iosbugavfaudio

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
    fun speakCommon(string: String){
        speak(string)
    }
}