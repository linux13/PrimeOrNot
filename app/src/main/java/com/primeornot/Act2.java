package com.primeornot;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act2 extends AppCompatActivity {
    Button button;
    ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        android.support.v7.app.ActionBar actionbar = getSupportActionBar();
        if(actionbar!=null) {
            actionbar.setHomeButtonEnabled(true);
            actionbar.setDisplayHomeAsUpEnabled(true);
        }


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


    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
}
        public boolean onOptionsItemSelected(MenuItem item){
               int id=item.getItemId();
               if(id==R.id.about){
                   Toast.makeText(this, "Pressed about", Toast.LENGTH_SHORT).show();
                   //return  true;

               }

           else  if(id==R.id.logout){
                Toast.makeText(this, "Pressed logout", Toast.LENGTH_SHORT).show();
                //return  true;

            }
            else if(id==R.id.test){

                   Toast.makeText(this, "Pressed test", Toast.LENGTH_SHORT).show();
               }
               else if(id==android.R.id.home){
                   Intent intent=new Intent(Act2.this,Act1.class);
                   startActivity(intent);

               }


                return  true;
        }

}
