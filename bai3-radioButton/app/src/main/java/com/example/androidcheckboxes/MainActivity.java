package com.example.androidcheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set icon for action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_round);
        getSupportActionBar().setTitle("Android RadioButtons");
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        // Get all Components
        TextView tv_title = findViewById(R.id.tv_title);
        TextView tv_result = findViewById(R.id.tv_result);
        RadioButton cb_android = findViewById(R.id.cb_android);
        RadioButton cb_ios = findViewById(R.id.cb_ios);
        RadioButton cb_window = findViewById(R.id.cb_window);
        RadioButton cb_rim = findViewById(R.id.cb_rim);
        Button btn = findViewById(R.id.btn);

        // Listen On Click Event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Set arr for check Radio Buttons
                Boolean[] arr = {false, false, false, false};

                // Check condition for Radio Buttons
                if (cb_android.isChecked()) arr[0] = true;
                if (cb_ios.isChecked()) arr[1] = true;
                if (cb_window.isChecked()) arr[2] = true;
                if (cb_rim.isChecked()) arr[3] = true;

                // Apply change to String
                String result = "The following were selected... \n" +
                        "Android: " + arr[0] +
                        "\nIOS: " + arr[1] +
                        "\nWindows: " + arr[2] +
                        "\nRIM: " + arr[3];

                // Show the result
                tv_result.setText(result);
            }
        });
    }
}