package com.example.pc.appjamproject.java.controller.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.appjamproject.R;

import java.util.ArrayList;

/**
 * Created by Bong on 2017-07-30.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private View view = null;
    private Context context = null;
    private ArrayList<String> List = new ArrayList<>();

    public RecyclerAdapter(Context context) {
        this.context = context;

        List.add("#전교");
        List.add("#교실");
        List.add("#방과후");
        List.add("#테스트");
    }


    public RecyclerAdapter(Context context, ArrayList<String> List) {
        this.context = context;
        this.List = List;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.navigation_item, null);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (position == 0) {
            holder.text.setText("게시글");
            holder.text.setTextColor(Color.parseColor("#000000"));
        } else {
            holder.text.setText(List.get(position - 1));
        }
    }


    @Override
    public int getItemCount() {
        //return super.getItemCount();
        return List.size() + 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.testTv);
        }
    }
}
