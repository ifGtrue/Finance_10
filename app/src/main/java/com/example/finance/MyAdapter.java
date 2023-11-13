package com.example.finance;



import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<Item> items;

    public MyAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item1,parent,false)) {
        };
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TextView title = holder.itemView.findViewById(R.id.title);
        TextView money = holder.itemView.findViewById(R.id.money);
        TextView date = holder.itemView.findViewById(R.id.date);
        ImageView arrow = holder.itemView.findViewById(R.id.arrow_card);
        Bitmap bitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.arrow_down);

        title.setText(this.items.get(position).getTitle());
        money.setText(String.format("+"+this.items.get(position).getMoney()+" RUB"));
        date.setText(this.items.get(position).getDate());

    }


    
    @Override
    public int getItemCount() {
        return this.items.size();
    }

}