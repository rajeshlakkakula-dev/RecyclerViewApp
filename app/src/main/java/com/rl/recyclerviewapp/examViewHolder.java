package com.rl.recyclerviewapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class examViewHolder extends RecyclerView.ViewHolder {


    TextView studentName;
    TextView examDate;
    TextView examMessage;
    View view;

    public examViewHolder(View itemView) {
        super(itemView);

        studentName = itemView.findViewById(R.id.tv_name);
        examDate = itemView.findViewById(R.id.tv_date);
        examMessage = itemView.findViewById(R.id.tv_message);

        view = itemView;


    }


}
