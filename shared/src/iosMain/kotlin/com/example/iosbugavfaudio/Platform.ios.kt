package com.example.iosbugavfaudio

import platform.AVFAudio.AVSpeechSynthesizer
import platform.AVFAudio.AVSpeechUtterance
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()
actual fun speak(string: String){
    val tts = AVSpeechSynthesizer()
    val utterance = AVSpeechUtterance(string = string)
    tts.speakUtterance(utterance)
}