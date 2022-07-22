package org.cream.designpatterns

import android.content.Context
import android.util.Log

class companionSingleton private constructor(context: Context) {


    companion object {
        private var instance: companionSingleton? = null

        fun getInstance(context: Context): companionSingleton {
            return instance ?: synchronized(this) {
                instance ?: companionSingleton(context).also {
                    instance = it
                }
            }
        }
    }

    fun printMsg(msg: String) {
        Log.d("companionSingleton", "msg: $msg")
    }
}