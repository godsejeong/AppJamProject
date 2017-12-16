package com.example.pc.appjamproject.java.controller.adapter;

import android.content.Context;
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

public class OnlineAdapter extends RecyclerView.Adapter<OnlineAdapter.ViewHolder> {

    private View view = null;
    private Context context = null;
    private ArrayList<String> List = new ArrayList<>();

    public OnlineAdapter(Context context) {
        this.context = context;

        List.add("이태윤");
        List.add("배현빈");
        List.add("봉하영");
        List.add("나재민");
        List.add("이건호");
        List.add("임소영");

    }


    public OnlineAdapter(Context context, ArrayList<String> List) {
        this.context = context;
        this.List = List;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.online_item, null);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

            holder.text.setText(List.get(position));

    }


    @Override
    public int getItemCount() {
        //return super.getItemCount();
        return List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.testTv);
        }

    }
}
