package com.example.checkversion_apilevel_android;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button runcode;
    private Button clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        runcode = findViewById(R.id.runcode_btn);
        clear = findViewById(R.id.clearcode_btn);

        runcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int apiLevel = Build.VERSION.SDK_INT;
                displayMessage("Api Level is :- "+apiLevel);
                if(apiLevel>=Build.VERSION_CODES.LOLLIPOP){
                    displayMessage("working on Lollipop or later");
                }
                else {
                    displayMessage("working on pre-Lollipop version");
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });
    }

    private void displayMessage(String message){
        textView.append(message+"\n");
    }
}
