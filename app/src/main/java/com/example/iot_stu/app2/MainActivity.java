package com.example.iot_stu.app2;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView ivFan = (ImageView)findViewById(R.id.ivFan);
        CheckBox cbCheck = (CheckBox)findViewById(R.id.cbCheck);

        final AnimationDrawable animationDrawable = (AnimationDrawable)ivFan.getBackground();
        cbCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                   animationDrawable.start();
                }
                else{
                    animationDrawable.stop();
                }
            }
        });
    }
}
