package com.mds2020

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("MyIntentService") {

    private val EXTRA_DATA = "extra_data"

    override fun onHandleIntent(intent: Intent?) {
        val count = intent!!.getIntExtra(EXTRA_DATA, 0)
        for (i in 1..count) {
            Thread.sleep(1000)
            Log.d("MDS_LOG", "i = $i")
        }
    }
}
