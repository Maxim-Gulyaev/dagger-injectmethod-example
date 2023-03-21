package android.maxim.daggerpracticewithinject.app

import android.app.Application
import android.maxim.daggerpracticewithinject.di.AppComponent
import android.maxim.daggerpracticewithinject.di.DaggerAppComponent
import android.maxim.daggerpracticewithinject.di.NetworkModule
import android.maxim.daggerpracticewithinject.di.StorageModule

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule())
            .storageModule(StorageModule())
            .build()
    }
}