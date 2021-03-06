package com.primeornot;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.Arrays;

public class Act1 extends AppCompatActivity {
    EditText ed;
    TextView tx;
    Button bt;
    int[] arr = new int[100005];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        android.support.v7.app.ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setHomeButtonEnabled(true);
            actionbar.setDisplayHomeAsUpEnabled(true);
        }

        ed = (EditText) findViewById(R.id.edit);
        tx = (TextView) findViewById(R.id.txt);
        bt = (Button) findViewById(R.id.btn);
        //

        // prime();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = ed.getText().toString();
                Long n = Long.parseLong(s1);
                BigInteger bg = new BigInteger(String.valueOf(n));
                boolean t = bg.isProbablePrime(1);
                if (t == true) tx.setText(n + " is Prime");
                else tx.setText(n + " is Composite");
            }
        });


    }

    public void prime() {


        int sq = (int) Math.sqrt(100005);

        Arrays.fill(arr, 1);
        arr[1] = arr[0] = 0;
        for (int i = 4; i <= 100005; i += 2) {
            arr[i] = 0;
        }


        for (int i = 3; i <= sq; i += 2) {

            if (arr[i] == 1) {

                for (int j = i * i; j <= 100005; j += i) {
                    //  arr[j] = 0;
                }

            }

        }

    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Toast.makeText(this, "Pressed about", Toast.LENGTH_SHORT).show();
            //return  true;
            onBackPressed();

        }
        return super.onOptionsItemSelected(item);
    }
        @Override
        public void onBackPressed () {
            //super.onBackPressed();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }




