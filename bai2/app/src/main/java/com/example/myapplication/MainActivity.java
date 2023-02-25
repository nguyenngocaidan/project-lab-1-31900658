package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get View
        TextView textView = findViewById(R.id.textView);
        Button btn = findViewById(R.id.btn);
        EditText editText = findViewById(R.id.editText);

        // Listen On Click Event
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // If empty then toast else set TextView
                if(editText.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập thông tin!", Toast.LENGTH_LONG).show();
                } else {
                    textView.setText(editText.getText().toString());
                }
            }
        });

        // Listen On Text Changed Event
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            // Set After Changed
            public void afterTextChanged(Editable editable) {
                // If editText is ON then enable Button else If OFF then disable button
                if(editText.getText().toString().equals("ON")) btn.setEnabled(true);
                else if(editText.getText().toString().equals("OFF")) btn.setEnabled(false);
            }
        });
    }
}