package com.android.upsell;


import android.os.Bundle;

import com.android.upsell.adapter.ArrivalsAdapter;
import com.android.upsell.adapter.CategoryAdapter;
import com.android.upsell.adapter.HeadersAdapter;
import com.android.upsell.adapter.SubcategoryAdapter;
import com.android.upsell.adapter.TopAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.upsell.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        HeadersAdapter headersAdapter = new HeadersAdapter();
        binding.headersRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        binding.headersRv.setAdapter(headersAdapter);
        headersAdapter.submitList(Util.headers);

        binding.mainCategoryRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        binding.mainCategoryRv.setAdapter(new CategoryAdapter());

        binding.arrivalsRv.setLayoutManager(new GridLayoutManager(this,3));
        binding.arrivalsRv.setAdapter(new ArrivalsAdapter());

        binding.topRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        binding.topRv.setAdapter(new TopAdapter());

        binding.subcategoryRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        binding.subcategoryRv.setAdapter(new SubcategoryAdapter());

        binding.subRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        binding.subRv.setAdapter(new ArrivalsAdapter());

        binding.footerRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        HeadersAdapter adapter = new HeadersAdapter();
        binding.footerRv.setAdapter(adapter);
        adapter.submitList(Util.footer);





    }

}