package com.example.simplenav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


import com.example.simplenav.databinding.FragmentHomeBinding;
import com.google.android.material.progressindicator.BaseProgressIndicator;


public class Home extends Fragment {
    private ArrayList<Twok> twoks = new ArrayList<>();
    private ViewPager2 viewPager;
    FragmentHomeBinding binding;

    public Home() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("MainActivity",twoks+"twokk");
    //    FragmentHomeBinding home;

        Twok t1 = new Twok("Pippooooo", "Buongiornissimo Caffe!?!");
        Twok t2 = new Twok("Plutooooo", "Saluti da Gubbio");
        Twok t3 = new Twok("Paperino", "Bello questo social");
        Twok t4 = new Twok("Topolino", "stacca stacca!!!");

        twoks.add(t1);
        twoks.add(t2);
        twoks.add(t3);
        twoks.add(t4);



        binding = FragmentHomeBinding.inflate(inflater,container,false);
        viewPager = binding.viewPager2;
        

        Log.d("tag",twoks+"");
        TwokAdapter twokAdapter = new TwokAdapter(getContext(), twoks);
        viewPager.setAdapter(twokAdapter);

/*
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                Log.d("Main", "onPageScrolled");
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Log.d("Main", "onPageSelected");
            }

        });
        */










        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}