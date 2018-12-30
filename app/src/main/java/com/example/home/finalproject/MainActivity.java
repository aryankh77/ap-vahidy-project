package com.example.home.finalproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int countToEnd=4000;
    AnimationDrawable animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView loading =(ImageView)findViewById(R.id.imageView);
        animation=(AnimationDrawable)loading.getDrawable();
        animation.start();
        new Handler().postDelayed(new Runnable()
        {
            public void run(){
                Intent homeIntent =new Intent(MainActivity.this,registerAndlogin.class);
                startActivity(homeIntent);
                finish();
            }
        },countToEnd);
    }


}
