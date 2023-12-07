package com.gmail.orlandroyd.contactskmp

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.platform.LocalContext
import core.presentation.ImagePickerFactory
import di.AppModule

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true,
                appModule = AppModule(LocalContext.current.applicationContext),
                imagePicker = ImagePickerFactory().createPicker()
            )
        }
    }
}