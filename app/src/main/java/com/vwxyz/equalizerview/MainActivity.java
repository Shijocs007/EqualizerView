package com.vwxyz.equalizerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Equalizer equalizer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equalizer = (Equalizer) findViewById(R.id.equalizer);
        equalizer.animateBars();
    }
}
