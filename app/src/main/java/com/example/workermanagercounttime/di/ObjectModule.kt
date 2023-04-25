package com.example.workermanagercounttime.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ObjectModule {
    @Provides
    @Singleton
    fun getContext(@ApplicationContext context: Context): Context{
        return context
    }
}