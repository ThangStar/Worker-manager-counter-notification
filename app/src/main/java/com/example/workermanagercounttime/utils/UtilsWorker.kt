package com.example.workermanagercounttime.utils

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.workermanagercounttime.R

fun makeStatusNotification(title: String, message: String, context: Context) {
    val CHANNEL_ID = "CHANEL_ID"
    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O){
        val name = "WORKER_NOTIFICATION"
        val description = "DESCRIPTION"
        val importance = NotificationManager.IMPORTANCE_HIGH
        val channel = NotificationChannel(CHANNEL_ID, name, importance)
        channel.description = description

        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
    val builder = NotificationCompat.Builder(context, CHANNEL_ID)
        .setContentTitle(title)
        .setContentText(message)
        .setPriority(NotificationCompat.PRIORITY_HIGH)
        .setSmallIcon(R.drawable.ic_launcher_background)
    NotificationManagerCompat.from(context).notify(1, builder.build())
}
