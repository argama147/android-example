package com.eugo.objectorientationkotlin

import android.graphics.Color

class RedActivity : ColorActivity() {
    override val myColor: Int
        get() = Color.RED
    override val nextClass: Class<*>
        get() = BlueActivity::class.java
}