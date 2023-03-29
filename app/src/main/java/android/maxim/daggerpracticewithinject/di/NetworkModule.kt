package android.maxim.daggerpracticewithinject.di

import android.maxim.daggerpracticewithinject.data.NetworkUtils
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NetworkModule {

    @Provides
    @Named("utils")
    fun provideNetworkUtils(): NetworkUtils {
        return NetworkUtils()
    }

    @Provides
    @Named("something")
    fun provideSomething(): NetworkUtils {
        return NetworkUtils()
    }

}