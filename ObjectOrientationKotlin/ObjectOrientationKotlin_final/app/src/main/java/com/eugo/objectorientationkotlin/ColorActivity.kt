package com.eugo.objectorientationkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.layout).setBackgroundColor(myColor)
        findViewById<View>(R.id.button).setOnClickListener {
            val intent = Intent(this@ColorActivity, nextClass)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }

    /**
     * 自Activityの色を取得する
     * @return 自Activityの色
     */
    protected abstract val myColor: Int

    /**
     * 次に遷移するActivity Classを取得する
     * @return 次に遷移するActivity Class
     */
    abstract val nextClass: Class<*>?
}