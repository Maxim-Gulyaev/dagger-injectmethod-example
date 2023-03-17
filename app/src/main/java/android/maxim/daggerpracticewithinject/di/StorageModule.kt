package android.maxim.daggerpracticewithinject.di

import android.maxim.daggerpracticewithinject.data.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDataBaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }

}