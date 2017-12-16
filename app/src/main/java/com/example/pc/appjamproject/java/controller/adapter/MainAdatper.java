package com.example.pc.appjamproject.java.controller.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.appjamproject.R;
import com.example.pc.appjamproject.java.controller.Data.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2017-12-17.
 */

public class MainAdatper extends RecyclerView.Adapter<MainAdatper.ViewHolder>{
    private List<Data> list;
    private int Layout;
    public MainAdatper(ArrayList<Data> items, int layout){
        this.list = items;
        this.Layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(Layout,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        Data item = list.get(position);

        viewHolder.contentTv.setText(item.getContent());
        viewHolder.nameTv.setText(item.getProflie());
        viewHolder.dataTv.setText((CharSequence) item.getTime());
        viewHolder.itemView.setTag(item);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView contentTv;
        public TextView nameTv;
        public TextView dataTv;
        public ViewHolder(View itemView){
            super(itemView);

            contentTv = (TextView) itemView.findViewById(R.id.postsContentTv);
            nameTv = (TextView) itemView.findViewById(R.id.postsNameTv);
            dataTv = (TextView) itemView.findViewById(R.id.postsTimeTv);
        }

    }

}
