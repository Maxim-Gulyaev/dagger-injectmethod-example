package android.maxim.daggerpracticewithinject.app

import android.app.Application
import android.maxim.daggerpracticewithinject.di.AppComponent
import android.maxim.daggerpracticewithinject.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}