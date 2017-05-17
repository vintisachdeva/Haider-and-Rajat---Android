package com.bmpl.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //intance var or global var

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Bundle will save the state of Activity
        // so that an activity can be resumed from that state
        super.onCreate(savedInstanceState);//parent functionality
        setContentView(R.layout.activity_main);//join xml file with java file
        //R--> it is a class-- auto-generated class-- android studio generates it
        // for every project--> set id for everything--> layout-->id--> defined within R
        //layout--> layout is a directory


        button = (Button) findViewById(R.id.button1);


        //basic--> anonymous
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked on Button", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
