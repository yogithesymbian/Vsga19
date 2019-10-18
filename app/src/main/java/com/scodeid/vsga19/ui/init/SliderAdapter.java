package com.scodeid.vsga19.ui.init;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.scodeid.vsga19.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_image = {
            R.drawable.ic_logo_splash_1,
            R.drawable.ic_logo_splash_2,
            R.drawable.ic_logo_splash_3
    };
    public String[] slide_heading = {
            "View 1",
            "View 2",
            "View 3"
    };
    public String[] slide_desc = {
            "Lorem 1 ipsum dolor sit amet, consectetur adipisicing elit. Architecto blanditiis consequatur cupiditate ducimus eaque eligendi eos eum impedit ipsam molestiae, quaerat rem tempore! Adipisci dolores eos ex quaerat velit. Vitae?",
            "Lorem 2 ipsum dolor sit amet, consectetur adipisicing elit. Architecto blanditiis consequatur cupiditate ducimus eaque eligendi eos eum impedit ipsam molestiae, quaerat rem tempore! Adipisci dolores eos ex quaerat velit. Vitae?",
            "Lorem 3 ipsum dolor sit amet, consectetur adipisicing elit. Architecto blanditiis consequatur cupiditate ducimus eaque eligendi eos eum impedit ipsam molestiae, quaerat rem tempore! Adipisci dolores eos ex quaerat velit. Vitae?"
    };


    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        // inflate the layout
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        //init for the component layout
        ImageView imageViewSlider = view.findViewById(R.id.img_header);
        TextView textViewHeading = view.findViewById(R.id.txt_header);
        TextView textViewDesc = view.findViewById(R.id.txt_desc);

        imageViewSlider.setImageResource(slide_image[position]);
        textViewHeading.setText(slide_heading[position]);
        textViewDesc.setText(slide_desc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
