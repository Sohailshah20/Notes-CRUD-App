package com.example.`notes CRUD App`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.`notes CRUD App`.ui.theme.MVVM2022Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVM2022Theme {

            }
        }
    }
}

