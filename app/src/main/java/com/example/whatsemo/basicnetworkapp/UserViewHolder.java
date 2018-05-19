package com.example.whatsemo.basicnetworkapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class UserViewHolder extends BaseViewHolder<NewsFeedItem> {

    private TextView userNameTextView;
    private ImageView userProfilePic;

    public UserViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.user_view_layout, parent, false));
        userNameTextView = itemView.findViewById(R.id.name);
        userProfilePic = itemView.findViewById(R.id.profile_pic);
    }

    @Override
    public void onBind(NewsFeedItem model) {
        userNameTextView.setText(model.getDisplay_name());
    }
}
