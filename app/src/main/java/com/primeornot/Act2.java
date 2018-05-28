package com.primeornot;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act2 extends AppCompatActivity {
    Button button;
    ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        button = findViewById(R.id.button);
        progress= new ProgressDialog(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.setTitle("Loading ...");
                progress.show();
            }
        });
    }
}
