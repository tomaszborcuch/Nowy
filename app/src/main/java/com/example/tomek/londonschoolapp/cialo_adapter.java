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

public class cialo_adapter extends PagerAdapter {
    private int[] image_resources = {R.drawable.glowa,R.drawable.noga,R.drawable.szyja,R.drawable.dlon,R.drawable.ucho,R.drawable.czolo,R.drawable.talia,R.drawable.palec,R.drawable.lokiec,R.drawable.kolano};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public cialo_adapter(Context ctx)
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
        View item_view = layoutInflater.inflate(R.layout.activity_cialo_adapter,parent,false);
        ImageView imageView =(ImageView) item_view.findViewById(R.id.image_view);
        TextView textView = (TextView) item_view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resources[position]);
        parent.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
