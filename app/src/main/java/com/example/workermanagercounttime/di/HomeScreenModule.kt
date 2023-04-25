package com.example.workermanagercounttime.di

import com.example.workermanagercounttime.data.repositories.DownloadImageRepository
import com.example.workermanagercounttime.data.repositories.WorkerDownloadImageRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class HomeScreenModule {

    @Binds
    @Singleton
    abstract fun downloadImageRepository(
        workerDownloadImageRepository: WorkerDownloadImageRepository
    ): DownloadImageRepository



}