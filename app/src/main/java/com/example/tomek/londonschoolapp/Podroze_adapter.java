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
import android.widget.LinearLayout;
import android.widget.TextView;

public class Podroze_adapter extends PagerAdapter {
    private int[] image_resources = {R.drawable.auto,R.drawable.bilet,R.drawable.pociag,R.drawable.rower,R.drawable.tramwaj};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public Podroze_adapter(Context ctx)
    {
        this.ctx = ctx;
    }
    @Override
    public int getCount() {

        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==object);

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup parent, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.activity_podroze_adapter,parent,false);
        ImageView imageView =(ImageView) item_view.findViewById(R.id.image_view2);
        TextView textView = (TextView) item_view.findViewById(R.id.image_count2);
        imageView.setImageResource(image_resources[position]);
        textView.setText("Image : "+position);
        parent.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
