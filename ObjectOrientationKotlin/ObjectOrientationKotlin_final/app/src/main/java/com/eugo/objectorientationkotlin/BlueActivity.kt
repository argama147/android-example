package com.eugo.objectorientationkotlin

import android.graphics.Color

class BlueActivity : ColorActivity() {
    override val myColor: Int
        get() = Color.BLUE
    override val nextClass: Class<*>
        get() = YellowActivity::class.java
}