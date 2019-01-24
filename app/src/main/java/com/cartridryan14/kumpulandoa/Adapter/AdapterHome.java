package com.cartridryan14.kumpulandoa.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.cartridryan14.kumpulandoa.Model.ModelHome;
import com.cartridryan14.kumpulandoa.R;
import com.cartridryan14.kumpulandoa.ViewHolder.HolderHome;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<HolderHome> {

    private List<ModelHome> home;

    public AdapterHome(List<ModelHome> home) {
        this.home = home;
    }

    @Override
    public HolderHome onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HolderHome(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false));
    }

    @Override
    public void onBindViewHolder(HolderHome holder, int position) {
        holder.jadwalSholat.setText(home.get(position).getJadwal());
        holder.waktuSholat.setText(home.get(position).getWaktu());


    }

    @Override
    public int getItemCount() {
        return home.size();
    }
}
