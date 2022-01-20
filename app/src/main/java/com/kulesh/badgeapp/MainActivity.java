package com.kulesh.badgeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.nex3z.notificationbadge.NotificationBadge;


public class MainActivity extends AppCompatActivity {
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void setNotificationBadge(View view) {
        NotificationBadge badge=findViewById(R.id.badge);
        badge.setAnimationDuration(500);
        i++;
        badge.setNumber(i,true);
    }

    public void setAnimation(View view) {
        Button button=findViewById(R.id.anibutton);
        Animation animation1= AnimationUtils.loadAnimation(this,R.anim.animation1);
        animation1.setDuration(1000);
        button.startAnimation(animation1);
    }
}