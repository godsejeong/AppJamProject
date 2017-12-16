package com.example.pc.appjamproject.java.controller.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.pc.appjamproject.R;
import com.example.pc.appjamproject.java.controller.Data.Data;
import com.example.pc.appjamproject.java.controller.adapter.MainAdatper;
import com.example.pc.appjamproject.java.controller.adapter.OnlineAdapter;
import com.example.pc.appjamproject.java.controller.adapter.RecyclerAdapter;
import com.example.pc.appjamproject.java.controller.utils.RecyclerClickListenerUtil;

import java.util.ArrayList;

/**
 * Created by pc on 2017-12-17.
 */

public class MainActivity extends AppCompatActivity{
    private TextView userName = null;
    private TextView userDescription = null;
    private TextView profile_Fix = null;
    private TextView writeText = null;

    private RecyclerView drawbleList = null;
    private RecyclerView onlineList = null;

    private DrawerLayout drawer = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        RecyclerView rcv = (RecyclerView) findViewById(R.id.mainRcv);
        init();
        setLitener();
        setRecyclerView();
        ArrayList<Data> items = new ArrayList<>();

        items.add(new Data("안녕하세요","나재민","2017-12-17 08:30:22:272Z"));

        rcv.setAdapter(new MainAdatper(items,R.layout.posts_item));
        rcv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rcv.setItemAnimator(new DefaultItemAnimator());
    }

    private void setLitener() {
        profile_Fix.setOnClickListener(view -> {

        });

        writeText.setOnClickListener(view -> {

        });

    }

    private void init(){
        userName = findViewById(R.id.userName);
        userDescription = findViewById(R.id.userName);
        profile_Fix = findViewById(R.id.profile_fix);
        drawbleList = findViewById(R.id.drawerList);
        onlineList = findViewById(R.id.onlineList);
        writeText = findViewById(R.id.wrText);
        drawer = findViewById(R.id.mainDrawer);
    }
    private void setRecyclerView(){
        /*채널 관련*/
        drawbleList.setHasFixedSize(true);
        drawbleList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getApplicationContext());
        drawbleList.setAdapter(recyclerAdapter);
        setDrawableListClickListener();

        /* 온라인 관련 */
        onlineList.setHasFixedSize(true);
        onlineList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        OnlineAdapter onlineAdapter = new OnlineAdapter(getApplicationContext());
        onlineList.setAdapter(onlineAdapter);
    }

    private void setDrawableListClickListener() {
        drawbleList.addOnItemTouchListener(new RecyclerClickListenerUtil(getApplicationContext(), drawbleList, new RecyclerClickListenerUtil.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (position != 0){
                    drawer.closeDrawer(Gravity.LEFT) ;
                    //이곳에서 채널을 변경함
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}
