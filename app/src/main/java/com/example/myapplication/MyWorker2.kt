package com.example.myapplication

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker2(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        Log.d("RRR","Started worker 2!");
        Thread.sleep(6000);
        Log.d("RRR","Finished worker 2")
        return Result.success();
    }
}