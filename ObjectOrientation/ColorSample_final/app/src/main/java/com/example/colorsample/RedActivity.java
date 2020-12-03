package com.example.colorsample;

import android.graphics.Color;

public class RedActivity extends ColorActivity {

    @Override
    protected int getMyColor() {
        return Color.RED;
    }

    @Override
    Class getNextClass() {
        return BlueActivity.class;
    }
}
