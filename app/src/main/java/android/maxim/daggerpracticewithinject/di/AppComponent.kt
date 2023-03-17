package android.maxim.daggerpracticewithinject.di

import android.maxim.daggerpracticewithinject.activity.MainActivity
import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {

    fun injectMainActivity(mainActivity: MainActivity)

}
