package com.example.iosbugavfaudio

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
internal fun App() {
    Column {
        Text(Greeting().greet())
        Button(onClick = {
            Greeting().speakCommon("hello from commoon code using compose")
        }){
            Text("Speak")
        }
    }
}