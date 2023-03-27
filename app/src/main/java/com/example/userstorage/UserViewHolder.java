package com.example.userstorage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView userName, userEmail, userLinja;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        userName = itemView.findViewById(R.id.txtNimi);
        userEmail = itemView.findViewById(R.id.txtEmailLin);
        userLinja = itemView.findViewById(R.id.txtLinja);
    }
}
