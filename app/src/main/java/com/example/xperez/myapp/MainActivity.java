package com.example.xperez.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_sign_up);

        Button log1 = (Button) findViewById(R.id.log1);
        log1.setOnClickListener (new View.OnClickListener() {
            @Override
             public void onClick(View v) {

                Intent x = new Intent(MainActivity.this, LogInPage.class);
                startActivity(x);
            }
        });

        Button create = (Button) findViewById(R.id.create);
        create.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent y = new Intent(MainActivity.this, SignUp.class);
                startActivity(y);
             }

        });
    }
}