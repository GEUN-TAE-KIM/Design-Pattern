package org.cream.designpatterns

import android.content.Context
import android.util.Log


class CompanionSingleton private constructor(context: Context) {
    // 일반 object와의 차이점은 생성자의 유무
    companion object {
        // 자기 자신에게 변수를 선언
        private var instance: CompanionSingleton? = null

        // 자기 자신을 가져오기
        // : 반한화는 값을 자기 자신에게 
        fun getInstance(context: Context): CompanionSingleton {
            // 값이 비어있으면 싱크로라이즈가 들어가서 자기 자신을 지칭
            return instance ?: synchronized(this) {
                // 비어 있으면 자기 자신을 자겨옴
                instance ?: CompanionSingleton(context).also {
                    instance = it
                }
            }
        }
    }

    fun printMsg(msg: String) {
        Log.d("companionSingleton", "msg: $msg")
    }
}