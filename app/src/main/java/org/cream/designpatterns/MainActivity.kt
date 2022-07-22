package org.cream.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Singleton.printMsg("싱글톤 객체 생성 없이 바로 호출")

        val singleton1 = Singleton
        val singleton2 = Singleton

        Log.d("TEST" , "singleton1: $singleton1")
        Log.d("TEST" , "singleton2: $singleton2")

        val companionsingleton1 = CompanionSingleton.getInstance(this)
        val companionsingleton2 = CompanionSingleton.getInstance(this)

        Log.d("TEST" , "companionsingleton1: $companionsingleton1")
        Log.d("TEST" , "companionsingleton2: $companionsingleton2")


        companionsingleton1.printMsg("컴페니언 싱글톤 호출")
        CompanionSingleton.getInstance(this).printMsg("컴페니언 싱글톤 호출")

    }
}