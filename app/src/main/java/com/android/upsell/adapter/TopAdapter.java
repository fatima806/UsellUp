package com.android.upsell.adapter;

import static com.android.upsell.Util.DIFF_CALLBACK;
import static com.android.upsell.Util.TOPS_ITEMS_COUNT;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.android.upsell.R;

public class TopAdapter extends ListAdapter<String, TopAdapter.ViewHolder> {
    Context context;

    public TopAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_item, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userName.setText(context.getString(R.string.user,String.valueOf(position)));
    }

    @Override
    public int getItemCount() {
        return TOPS_ITEMS_COUNT;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView userName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.user_name);

        }
    }
}


