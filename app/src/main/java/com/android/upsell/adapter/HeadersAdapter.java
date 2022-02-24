package com.android.upsell.adapter;

import static com.android.upsell.Util.DIFF_CALLBACK;
import static com.android.upsell.Util.HEADERS_ITEMS_COUNT;
import static com.android.upsell.Util.INT_DIFF_CALLBACK;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.android.upsell.R;

public class HeadersAdapter extends ListAdapter<Integer, HeadersAdapter.ViewHolder> {
    Context context;
    public HeadersAdapter() {
        super(INT_DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_item, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.header_name.setText(context.getString(getItem(position)));

    }

    @Override
    public int getItemCount() {
        return HEADERS_ITEMS_COUNT;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView header_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            header_name = itemView.findViewById(R.id.header_name);

        }
    }
}


