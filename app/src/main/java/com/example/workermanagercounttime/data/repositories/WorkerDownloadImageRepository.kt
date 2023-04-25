package com.example.workermanagercounttime.data.repositories

import android.content.Context
import android.util.Log
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.workermanagercounttime.workers.DownloadWorker
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

class WorkerDownloadImageRepository @Inject constructor(@ApplicationContext val context: Context): DownloadImageRepository {
    private val workManager = WorkManager.getInstance(context)

    //start if has internet
    private val constraint = Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED)
    override fun startDownload() {
        val workRequest = OneTimeWorkRequestBuilder<DownloadWorker>()
            .setConstraints(constraints = constraint.build())
        workManager.enqueue(workRequest.build())
    }
}

