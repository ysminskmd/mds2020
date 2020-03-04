package com.mds2020

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyReceiver : BroadcastReceiver() {

    private val ACTION = "com.mds2020.service.action"

    override fun onReceive(context: Context, intent: Intent) {
        context.startService(Intent(
            context, MyIntentService::class.java).putExtras(intent))
    }
}
