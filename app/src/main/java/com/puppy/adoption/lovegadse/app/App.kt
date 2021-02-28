package com.puppy.adoption.lovegadse.app

import android.app.Application
import com.puppy.adoption.lovegadse.app.data.DependenciesHolder
import com.puppy.adoption.lovegadse.app.data.DependenciesHolderImpl

class App: Application() {
    // used to obtain dependencies
    lateinit var dependenciesHolder: DependenciesHolder

    override fun onCreate() {
        super.onCreate()
        dependenciesHolder = DependenciesHolderImpl()
    }
}