package com.example.flipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class MainActivity extends AppCompatActivity {

    AdapterViewFlipper adapterViewFlipper;
    int[]rimgs={R.drawable.vivo1,R.drawable.vivo2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapterViewFlipper=findViewById(R.id.flipper);

        Adapterflipper adapterflipper=new Adapterflipper(MainActivity.this,rimgs);
        adapterViewFlipper.setAdapter(adapterflipper);
        adapterViewFlipper.setAutoStart(true);
        adapterViewFlipper.setFlipInterval(2000);
    }
}
