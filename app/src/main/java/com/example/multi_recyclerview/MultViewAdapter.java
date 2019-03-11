package com.example.multi_recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MultViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<MultipleViewModal> list;

    public MultViewAdapter(List<MultipleViewModal> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
       if(viewType == MultipleViewModal.NAME_ONLY_TYPE){
           View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_text, viewGroup, false);
           return new textViewHolder(view);
       }
       else if(viewType == MultipleViewModal.IMAGE_ONLY_TYPE){
           View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_image, viewGroup, false);
           return new imageViewHolder(view);
       }
       else{
           View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_image_text, viewGroup, false);
           return  new textImageViewHolder(view);
       }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MultipleViewModal model = list.get(i);

        if(viewHolder instanceof textViewHolder){
            ((textViewHolder) viewHolder).textView1.setText(model.getName());
        }
        else if(viewHolder instanceof imageViewHolder){
            ((imageViewHolder) viewHolder).imageView1.setImageResource(model.getImage());
        }
        else{
            ((textImageViewHolder) viewHolder).textView2.setText(model.getName());
            ((textImageViewHolder) viewHolder).imageView2.setImageResource(model.getImage());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }

    class textViewHolder extends RecyclerView.ViewHolder{

        TextView textView1;

        public textViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.multiple_text2);
        }
    }

    class imageViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView1;

        public imageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.multiple_image2);
        }
    }

    class textImageViewHolder extends RecyclerView.ViewHolder{

        TextView textView2;
        ImageView imageView2;

        public textImageViewHolder(@NonNull View itemView) {
            super(itemView);
            textView2 = itemView.findViewById(R.id.multiple_text1);
            imageView2 = itemView.findViewById(R.id.multiple_image1);

        }
    }
}
