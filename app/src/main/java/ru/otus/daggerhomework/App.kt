package ru.otus.daggerhomework

import android.app.Application
import ru.otus.daggerhomework.component.ApplicationComponent
import ru.otus.daggerhomework.component.DaggerApplicationComponent


class App :Application() {
    private lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerApplicationComponent.builder()
            .context(this)
            .build()
    }

    fun getAppComponent():ApplicationComponent{
        return appComponent
    }

}