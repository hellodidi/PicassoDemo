package com.example.i.picassodemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static com.squareup.picasso.MemoryPolicy.NO_CACHE;
import static com.squareup.picasso.MemoryPolicy.NO_STORE;

/**
 * Created by i on 2017/5/30.
 */

public class myAdapter extends BaseAdapter {
    private List<Pic> list_pic;
    private LayoutInflater inflater;
    private Context context;
    class ItemPics
    {
        TextView picname;
        ImageView pic;
    }
    public myAdapter(List<Pic> list_pic, Context context) {
        this.list_pic = list_pic;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list_pic.size();
    }

    @Override
    public Object getItem(int position) {
        return list_pic.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ItemPics ip;
        if (convertView == null) {
            ip = new ItemPics();
            convertView = inflater.inflate(R.layout.lv_item, null);
            ip.pic = (ImageView) convertView.findViewById(R.id.item_pic);

            convertView.setTag(ip);
        } else {
            ip = (ItemPics) convertView.getTag();
        }
        Picasso.with(context).load(list_pic.get(position).getPicUrl()).fit()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .memoryPolicy(NO_CACHE, NO_STORE)
                .rotate(20, 60, 60)
                .into(ip.pic);

        return convertView;
    }
}
