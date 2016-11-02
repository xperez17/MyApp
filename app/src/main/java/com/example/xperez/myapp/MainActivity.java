package com.example.xperez.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public Button log1;
    public Button create;

    public void one(){
        log1 = (Button)findViewById(R.id.log1);
        log1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Intent x = new Intent(MainActivity.this, LogInPage.class);

                startActivity(x);

            }
        });
    }



             @Override
             protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.login_sign_up);
             one();



                            }



public class MainActivity extends AppCompatActivity {
    private class onClickLitsenter implements View.OnClickListener {

    public void two() {
        create = (Button) findViewById(R.id.create);
        create.setOnClickListener(new view.onClickLitsenter(){
        @Override
        public void onClick(View v) {



            Intent y = new Intent(MainActivity.this, SignUp.class);
            startActivity(y);
        }
        });
    }






        @Override
        protected void onCreate2 (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.login_sign_up);
            two();


        }
    }
}