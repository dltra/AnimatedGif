package com.example.animatedgif;

import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    LinearLayoutCompat layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.llayout);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //touch right side of screen to add a GifImageView
      if(event.getAction()==MotionEvent.ACTION_DOWN){
            GifImageView imageView = new GifImageView(getApplicationContext());
            imageView.setBackgroundResource(R.drawable.animated_gif_juggling);
            layout.addView(imageView);
            imageView.getLayoutParams().height=300;
            imageView.getLayoutParams().width=400;
        }
        return true;
    }
}