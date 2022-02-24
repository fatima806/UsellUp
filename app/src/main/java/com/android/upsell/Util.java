package com.android.upsell;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Util {

    public static final int HEADERS_ITEMS_COUNT = 4;
    public static final int ARRIVALS_ITEMS_COUNT = 6;
    public static final int CATEGORIES_ITEMS_COUNT = 3;
    public static final int TOPS_ITEMS_COUNT = 4;

    public static ArrayList<Integer> footer = new ArrayList<Integer>(Arrays.asList(R.string.footer0, R.string.footer1, R.string.footer2, R.string.footer3));
    public static ArrayList<Integer> headers = new ArrayList<Integer>(Arrays.asList(R.string.header_til0, R.string.header_til1, R.string.header_til3, R.string.header_til4));


    public static final DiffUtil.ItemCallback<String> DIFF_CALLBACK = new DiffUtil.ItemCallback<String>() {
        @Override
        public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {

            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
            return oldItem.equals(newItem);
        }
    };
    public static final DiffUtil.ItemCallback<Integer> INT_DIFF_CALLBACK = new DiffUtil.ItemCallback<Integer>() {
        @Override
        public boolean areItemsTheSame(@NonNull Integer oldItem, @NonNull Integer newItem) {

            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Integer oldItem, @NonNull Integer newItem) {
            return oldItem.equals(newItem);
        }
    };
}
