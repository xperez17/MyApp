package com.example.xperez.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_page);

        Button home1 = (Button) findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){

                Intent z = new Intent(MainActivity2.this, HomePage.class);
                startActivity(z);
        }
        } );

       /* Button log1 = (Button) findViewById(R.id.log1);
        log1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent x = new Intent(MainActivity2.this, LogInPage.class);
                startActivity(x);
            }
        });*/


    }
}
