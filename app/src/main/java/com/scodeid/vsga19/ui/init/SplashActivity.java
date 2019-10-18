package com.scodeid.vsga19.ui.init;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.scodeid.vsga19.R;
import com.scodeid.vsga19.ui.home.MainActivity;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //only run in api >= 19 device
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).hide();
        }
        //setFLag this act FULLSCREEN
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        // initialize delay
        int delayMiles = 3000;
        // create Thread Handler with runnable object
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // intent activity | move activity
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                this.finish();
            }
            // anonymous function
            private void finish() {
                //TODO
            }
        }, delayMiles);
    }
}
