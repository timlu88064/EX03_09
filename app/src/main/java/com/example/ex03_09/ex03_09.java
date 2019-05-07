package com.example.ex03_09;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class ex03_09 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        /* 加载main.xml Layout */
        setContentView(R.layout.fuck);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(ex03_09.this, MainActivity.class);
            startActivity(intent);
            ex03_09.this.finish();
    }});
    }



}
