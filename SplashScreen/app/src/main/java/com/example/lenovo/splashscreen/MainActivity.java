package com.example.lenovo.splashscreen;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private ImageView iv;
    private ProgressBar p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.texthello);
        iv=(ImageView) findViewById(R.id.logo);
        p=(ProgressBar) findViewById(R.id.prog);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);
        p.startAnimation(myanim);
        final Intent my = new Intent(this,Registration.class);
        Thread timer = new Thread(){
            public  void run()
            {
                try {
                    sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(my);
                    finish();
                }
            }
        };
        timer.start();
    }
}
