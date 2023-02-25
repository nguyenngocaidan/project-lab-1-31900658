package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Button btnToast = (Button) findViewById(R.id.btn_toast);
        Button btnCount = (Button) findViewById(R.id.btn_count);
        TextView tV = (TextView) findViewById(R.id.view_number);

        tV.setText("0");

        btnToast.setOnClickListener(view -> {
            String textShow = tV.getText().toString();
            Toast.makeText(MainActivity.this, textShow, Toast.LENGTH_SHORT).show();
        });

        btnCount.setOnClickListener(view -> {
            int getNum = Integer.parseInt(tV.getText().toString()) + 1;
            tV.setText(String.valueOf(getNum));
        });
    }
}