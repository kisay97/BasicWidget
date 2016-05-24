package com.estsoft.basicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("----------->", "" + findViewById(R.id.textLabel).isFocusable() + ", " + findViewById(R.id.editText).isFocusable());

        findViewById(R.id.invisibleButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.textLabel).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.goneButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.textLabel).setVisibility(View.GONE);
            }
        });

        findViewById(R.id.visibleButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.textLabel).setVisibility(View.VISIBLE);
            }
        });
    }
}
