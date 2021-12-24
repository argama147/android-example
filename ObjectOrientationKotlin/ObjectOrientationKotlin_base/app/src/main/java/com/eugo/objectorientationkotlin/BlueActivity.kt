package com.eugo.objectorientationkotlin

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class BlueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.layout).setBackgroundColor(Color.BLUE)
        findViewById<View>(R.id.button).setOnClickListener {
            // 別のActivityに遷移する時の処理イメージ
//            val intent = Intent(this, YellowActivity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
//            startActivity(intent)
        }
    }
}