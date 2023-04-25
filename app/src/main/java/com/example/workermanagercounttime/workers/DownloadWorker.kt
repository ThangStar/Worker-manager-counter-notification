package com.example.workermanagercounttime.workers

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.workermanagercounttime.utils.makeStatusNotification
import kotlinx.coroutines.delay

private const val TAG = "WORKER_PROGRESS"
class DownloadWorker(appContext: Context, params: WorkerParameters) :
    CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        try {
            repeat(5){
                delay(1000)
                makeStatusNotification("DOWNLOAD", "Step ${it} Download..", context = applicationContext)

            }
            return Result.success()
        } catch (e: Exception) {
            Log.d(TAG, "ERROR: ${e.message}")
            return Result.failure()
        }
    }
}