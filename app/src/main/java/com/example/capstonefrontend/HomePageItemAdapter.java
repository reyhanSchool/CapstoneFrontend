package com.example.capstonefrontend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//This will be the adapater for the recyclerView in HomePage
public class HomePageItemAdapter extends RecyclerView.Adapter<HomePageItemAdapter.ItemViewHolder> {
    private List<String> itemNames;

    public HomePageItemAdapter(List<String> itemNames) {
        this.itemNames = itemNames;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_view_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        String itemName = itemNames.get(position % itemNames.size());
        holder.button.setText(itemName);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
    Button button;
        public ItemViewHolder(@NonNull View itemView){
            super(itemView);
            button = itemView.findViewById(R.id.homePageButton);
        }
    }

    public interface onItemClickListener{
        void onItemClick(int position);
    }
}
