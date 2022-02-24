package com.android.upsell.adapter;

import static com.android.upsell.Util.CATEGORIES_ITEMS_COUNT;
import static com.android.upsell.Util.DIFF_CALLBACK;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.android.upsell.R;

public class CategoryAdapter extends ListAdapter<String, CategoryAdapter.ViewHolder> {

    Context context;

    public  CategoryAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryName.setText(context.getString(R.string.main_category,String.valueOf(position)));

    }

    @Override
    public int getItemCount() {
        return CATEGORIES_ITEMS_COUNT;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.category_name);

        }
    }
}
