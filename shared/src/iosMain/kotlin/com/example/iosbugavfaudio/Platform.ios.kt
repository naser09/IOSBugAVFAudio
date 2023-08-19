package com.example.iosbugavfaudio

import androidx.compose.ui.window.ComposeUIViewController
import platform.AVFAudio.AVSpeechSynthesizer
import platform.AVFAudio.AVSpeechUtterance
import platform.UIKit.UIDevice
import platform.UIKit.UIViewController

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()
actual fun speak(string: String){
    val tts = AVSpeechSynthesizer()
    val utterance = AVSpeechUtterance(string = string)
    tts.speakUtterance(utterance)
}
fun UiApp():UIViewController = ComposeUIViewController {
    App()
}