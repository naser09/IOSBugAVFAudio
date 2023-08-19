package com.example.iosbugavfaudio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform