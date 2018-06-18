package com.example.tomek.londonschoolapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Jedzenie_adapter extends PagerAdapter {
    private int[] image_resources1 = {R.drawable.kolacja,R.drawable.makaron,R.drawable.platki,R.drawable.ziemniaki,R.drawable.zupa};
    private Context ctx;
    private LayoutInflater layoutInflater1;

    public Jedzenie_adapter(Context ctx)
    {
        this.ctx = ctx;
    }
    @Override
    public int getCount() {

        return image_resources1.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==object);

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup parent1, int position) {
        layoutInflater1 = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater1.inflate(R.layout.activity_jedzenie_adapter,parent1,false);
        ImageView imageView =(ImageView) item_view.findViewById(R.id.image_view1);
        TextView textView = (TextView) item_view.findViewById(R.id.image_count1);
        imageView.setImageResource(image_resources1[position]);
        textView.setText("Image : "+position);
        parent1.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
