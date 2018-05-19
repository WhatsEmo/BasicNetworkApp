package com.example.whatsemo.basicnetworkapp;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;


public class NewsFeedAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<NewsFeedItem> dataList;

    public NewsFeedAdapter(List<NewsFeedItem> dataList) {
        this.dataList = dataList;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        if (holder instanceof  UserViewHolder) {
            ((UserViewHolder) holder).onBind(dataList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
