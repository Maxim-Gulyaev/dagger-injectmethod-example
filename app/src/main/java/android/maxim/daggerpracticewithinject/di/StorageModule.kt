package android.maxim.daggerpracticewithinject.di

import android.maxim.daggerpracticewithinject.data.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    @DataBaseHelper
    fun provideDataBaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }

    @Provides
    @SomethingStorage
    fun provideSomethingStorage(): DatabaseHelper {
        return DatabaseHelper()
    }

}