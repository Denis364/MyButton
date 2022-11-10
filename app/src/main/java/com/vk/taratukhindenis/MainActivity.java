package com.vk.taratukhindenis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonRed = findViewById(R.id.buttonRed);
        Button buttonOrange = findViewById(R.id.buttonOrange);
        Button buttonYellow = findViewById(R.id.buttonYellow);
        Button buttonGreen = findViewById(R.id.buttonGreen);
        Button buttonHeavenly = findViewById(R.id.buttonHeavenly);
        Button buttonBlue = findViewById(R.id.buttonBlue);
        Button buttonViolet = findViewById(R.id.buttonViolet);

        buttonRed.setOnClickListener(this);
        buttonOrange.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);
        buttonHeavenly.setOnClickListener(this);
        buttonBlue.setOnClickListener(this);
        buttonViolet.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent a;
        if (v.getId() == R.id.buttonRed) {
            a = new Intent(this, Red.class);
            startActivity(a);
        }
        if (v.getId() == R.id.buttonOrange) {
            a = new Intent(this, Orange.class);
            startActivity(a);
        }
        if (v.getId() == R.id.buttonYellow) {
            a = new Intent(this, Yellow.class);
            startActivity(a);
        }
        if (v.getId() == R.id.buttonGreen) {
            a = new Intent(this, Green.class);
            startActivity(a);
        }
        if (v.getId() == R.id.buttonHeavenly) {
            a = new Intent(this, Heavenly.class);
            startActivity(a);
        }
        if (v.getId() == R.id.buttonBlue) {
            a = new Intent(this, Blue.class);
            startActivity(a);
        }
        if (v.getId() == R.id.buttonViolet){
            a = new Intent(this, Violet.class);
            startActivity(a);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}