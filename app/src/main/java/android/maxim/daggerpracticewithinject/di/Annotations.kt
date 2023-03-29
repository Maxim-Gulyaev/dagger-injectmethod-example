package android.maxim.daggerpracticewithinject.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class DataBaseHelper

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class SomethingStorage