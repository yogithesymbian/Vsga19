package com.scodeid.vsga19.ui.home;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.scodeid.vsga19.ui.PuzzleActivity;
import com.scodeid.vsga19.R;

public class MainActivity extends AppCompatActivity {
    // declares variable ke view layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // actionBar
        getSupportActionBar().hide();

        final Button btn = findViewById(R.id.btn_move_intent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // move activity
                Intent intent = new Intent(MainActivity.this, PuzzleActivity.class);
                startActivity(intent);
            }
        });
    }

    // callBack onBack
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
