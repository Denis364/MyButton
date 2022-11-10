package com.vk.taratukhindenis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Object id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonRed = findViewById(R.id.buttonRed);

        buttonRed.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        Intent a;
        switch (v.getId()){
            case (id.):
                a = new Intent(this, Red.class);
                startActivity(a);
                break;
        }
    }
}