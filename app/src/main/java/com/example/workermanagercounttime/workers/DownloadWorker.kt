package com.example.workermanagercounttime.workers

import android.app.Notification
import android.content.Context
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.WorkerParameters
import com.example.workermanagercounttime.R
import com.example.workermanagercounttime.utils.makeStatusNotification
import kotlinx.coroutines.delay

private const val TAG = "WORKER_PROGRESS"
class DownloadWorker(appContext: Context, params: WorkerParameters) :
    CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        return try {
            repeat(5){
                delay(1000)

                //get data from work request to worker
                val uri = inputData.getString("URI")
                makeStatusNotification("DOWNLOAD", "Step $it Download ${uri}..", context = applicationContext)
            }
            Result.retry()
        } catch (e: Exception) {
            Log.d(TAG, "ERROR: ${e.message}")
            Result.failure()
        }
    }

}