package com.rl.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<examViewHolder> {


    List<examData> list = Collections.emptyList();
    Context context;
    ClickListener listener;

    public CustomAdapter(List<examData> list, Context context, ClickListener listener) {
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public examViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View customView = inflater.inflate(R.layout.student_card, parent, false);


        examViewHolder viewHolder = new examViewHolder(customView);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(examViewHolder holder, int position) {

        final int index = holder.getAdapterPosition();

        holder.studentName.setText(list.get(position).name);
        holder.examDate.setText(list.get(position).date);
        holder.examMessage.setText(list.get(position).message);

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(index);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
