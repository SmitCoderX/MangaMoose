package com.smitcoderx.mangamoose.utils

import android.app.Application
import timber.log.Timber

class MangaMooseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
       /* Timber.plant(Timber.DebugTree())*/
    }
}