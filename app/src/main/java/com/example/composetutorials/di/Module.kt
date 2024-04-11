package com.example.composetutorials.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier


@InstallIn(SingletonComponent::class)
@Module
object Module{
//    @Provides
//    fun provideContext() : Application = provideContext()


    @HelloWorld
    @Provides
    fun provideNameString () : String = "Hello World"

    @HelloKartik
    @Provides
    fun provideNameKartikString () : String = "Hello Kartik"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class HelloWorld

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class HelloKartik