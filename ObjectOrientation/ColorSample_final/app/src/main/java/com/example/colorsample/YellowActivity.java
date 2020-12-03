package com.example.colorsample;

import android.graphics.Color;

public class YellowActivity extends ColorActivity {

    @Override
    protected int getMyColor() {
        return Color.YELLOW;
    }

    @Override
    Class getNextClass() {
        return RedActivity.class;
    }
}
