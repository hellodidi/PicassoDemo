package com.example.i.picassodemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private GridView gview;
    private List<Pic> list_pic;
    private myAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gview = (GridView)findViewById(R.id.gview);
        list_pic = new ArrayList<>();
        myAdapter = new myAdapter(list_pic,this);
        gview.setAdapter(myAdapter);
        for(int i=0;i<imageids.length;i++){
            list_pic.add(new Pic(imageids[i]));
        }

    }

    private int[] imageids = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
                                 R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,
                                 R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,
                                 R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,
                                 R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,
                                 R.drawable.z,R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd};

}
