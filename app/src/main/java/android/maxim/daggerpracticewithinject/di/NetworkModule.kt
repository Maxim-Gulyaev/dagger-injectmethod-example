package android.maxim.daggerpracticewithinject.di

import android.maxim.daggerpracticewithinject.data.NetworkUtils
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(): NetworkUtils {
        return NetworkUtils()
    }

}