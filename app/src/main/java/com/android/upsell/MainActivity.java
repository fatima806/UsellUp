package com.android.upsell;

import android.os.Bundle;

import com.android.upsell.adapter.ArrivalsAdapter;
import com.android.upsell.adapter.CategoryAdapter;
import com.android.upsell.adapter.HeadersAdapter;
import com.android.upsell.adapter.TopAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
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
        binding.headersRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        binding.headersRv.setAdapter(new HeadersAdapter());

        binding.mainCategoryRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        binding.mainCategoryRv.setAdapter(new CategoryAdapter());

        binding.arrivalsRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        binding.arrivalsRv.setAdapter(new ArrivalsAdapter());

        binding.topRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        binding.topRv.setAdapter(new TopAdapter());

    }

}