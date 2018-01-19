package com.itktechnologies.timerdemo;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000) {
            public void onTick(long milisecondsUntilDone) {
                Log.i ("runnable", "seconds left :" + Long.toString(milisecondsUntilDone));
            }

            public void onFinish() {
                Log.i("runnable", "process finished");

            }

        }.start();

        /* option 1
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.i ("runnable", "1 second has passed");
                handler.postDelayed(this, 1000);

            }
        };

        handler.post(runnable);
        */
    }

}
