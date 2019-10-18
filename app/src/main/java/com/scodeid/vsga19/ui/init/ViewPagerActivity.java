package com.scodeid.vsga19.ui.init;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.scodeid.vsga19.R;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.vp_slider);
        linearLayout = findViewById(R.id.linear_dot);

    }
}
