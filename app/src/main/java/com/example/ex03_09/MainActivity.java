package com.example.ex03_09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ex03_09.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        public void change(View v){
            Random x = new Random();
            int c = x.nextInt(256);
        }});
    }
}
