package com.example.xperez.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity3 extends AppCompatActivity{
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);


         Button home2 = (Button) findViewById(R.id.home2);
         home2.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {

                Intent xx = new Intent(MainActivity3.this, HomePage.class);
                startActivity(xx);
            }
        } );
    }
}
