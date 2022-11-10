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

        buttonRed.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent a;
        if (v.getId() == R.id.buttonRed) {
            a = new Intent(this, Red.class);
            startActivity(a);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}