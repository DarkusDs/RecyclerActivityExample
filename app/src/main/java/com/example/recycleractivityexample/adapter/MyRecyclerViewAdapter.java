package com.example.recycleractivityexample.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleractivityexample.model.Item;
import com.example.recycleractivityexample.model.MyRecyclerViewHolder;


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder>{
    List<Item> itemList;
    Context mContext;

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
