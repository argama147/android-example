package com.example.colorsample;

import android.graphics.Color;

public class BlueActivity extends ColorActivity {

    @Override
    protected int getMyColor() {
        return Color.BLUE;
    }

    @Override
    Class getNextClass() {
        return YellowActivity.class;
    }
}
