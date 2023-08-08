package com.example.hackathon.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.example.hackathon.R;

public class Splash extends AppCompatActivity {
ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        AnimationSet mAnimationSet = new AnimationSet(false);

        logo = findViewById(R.id.logo);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        mAnimationSet.addAnimation(fadeInAnimation);
        logo.startAnimation(mAnimationSet);

        MediaPlayer eMediaPlayer= new MediaPlayer();
        eMediaPlayer=MediaPlayer.create(this, R.raw.team_sound);
        eMediaPlayer.start();


    }

    private void mainAction() {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
              Intent intent = new Intent(getApplicationContext(),MainActivity.class);
              startActivity(intent);
            }
        }, 5000);
    }

    @Override
    public void onResume(){
        super.onResume();
        mainAction();


    }
}