package com.scodeid.vsga19;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

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
}
