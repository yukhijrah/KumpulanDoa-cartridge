package com.cartridryan14.kumpulandoa.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cartridryan14.kumpulandoa.Adapter.AdapterHome;
import com.cartridryan14.kumpulandoa.Model.ModelHome;
import com.cartridryan14.kumpulandoa.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public List<ModelHome> home = new ArrayList<>();
    private RecyclerView recyclerView ;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recylcer); //home

        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);


        AdapterHome adapter = new AdapterHome(home);
        recyclerView.setAdapter(adapter);

        homeCollection();

        return  view;
    }


    private void homeCollection() {
        home.add(new ModelHome("Imsak", "4.25 AM"));
        home.add(new ModelHome("Subuh", "4.30 AM"));
        home.add(new ModelHome("Dzuhur", "11.30 AM"));
        home.add(new ModelHome("Ashar", "14.30 PM"));
        home.add(new ModelHome("Maghrib", "17.45 PM"));
        home.add(new ModelHome("Isya ", "19.10 PM"));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}