package com.example.iosbugavfaudio

import android.util.Log

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
actual fun speak(string: String){
    Log.d("Speak","Called $string")
}