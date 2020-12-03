package com.example.colorsample;

        import android.content.Intent;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;

        import androidx.appcompat.app.AppCompatActivity;

public class RedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.layout).setBackgroundColor(Color.RED);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RedActivity.this, BlueActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
