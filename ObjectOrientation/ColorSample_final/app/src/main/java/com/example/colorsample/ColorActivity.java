package com.example.colorsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

abstract public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.layout).setBackgroundColor(getMyColor());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorActivity.this, getNextClass());
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
    }

    /**
     * 自Activityの色を取得する
     * @return 自Activityの色
     */
    abstract protected int getMyColor();

    /**
     * 次に遷移するActivity Classを取得する
     * @return 次に遷移するActivity Class
     */
    abstract Class getNextClass();
}
