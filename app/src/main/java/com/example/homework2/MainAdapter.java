package com.example.homework2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<String> editText;

    public MainAdapter() {
        editText = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            editText.add("Туту-лалала " +i );

        }

    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.activity_main_view_holder, parent, false);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.setText(editText.get(position));
    }

    @Override
    public int getItemCount() {
        return editText.size();
    }

    public void newText(String text){
        editText.add(text);
        notifyDataSetChanged();
    }
}
