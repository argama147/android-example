package com.eugo.objectorientationkotlin

import android.graphics.Color

class YellowActivity : ColorActivity() {
    override val myColor: Int
        get() = Color.YELLOW
    override val nextClass: Class<*>
        get() = RedActivity::class.java
}