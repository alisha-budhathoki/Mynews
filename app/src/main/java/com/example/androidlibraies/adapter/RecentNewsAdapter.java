package com.example.androidlibraies.adapter;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.androidlibraies.R;
import com.example.androidlibraies.model.RecentNewsModel;

import java.util.ArrayList;
import java.util.List;

public class RecentNewsAdapter extends RecyclerView.Adapter<RecentNewsAdapter.MyViewHolder> {

    ArrayList<RecentNewsModel> mList;
    Context context;

    public RecentNewsAdapter(Context context, ArrayList<RecentNewsModel> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final RecentNewsModel news = mList.get(position);


    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        ImageView newsHeadline;
        public MyViewHolder(View itemView) {
            super(itemView);
            newsHeadline = itemView.findViewById(R.id.product_name);
        }


    }

}