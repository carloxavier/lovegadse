package com.puppy.adoption.lovegadse.app.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.puppy.adoption.lovegadse.app.App
import com.puppy.adoption.lovegadse.app.ui.components.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dependenciesHolder = (application as App).dependenciesHolder
        setContent {
            Navigation(dependenciesHolder)
        }
    }
}
