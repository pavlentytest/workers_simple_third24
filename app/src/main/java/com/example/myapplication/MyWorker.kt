package com.example.myapplication

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        Log.d("RRR","Started worker 1!");
        Thread.sleep(3000);
        Log.d("RRR","Finished worker 1")

       // val result = inputData.getString("key1")
        val data: Data = Data.Builder().putString("key2","Hello from worker1!").build()
        return Result.success(data);
    }
}