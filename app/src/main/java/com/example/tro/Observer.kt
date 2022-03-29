package com.example.tro

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class Observer:LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun eventer (source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("TAG:", event.toString())
    }
}