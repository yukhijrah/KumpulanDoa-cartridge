package com.cartridryan14.kumpulandoa.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.cartridryan14.kumpulandoa.R;

public class HolderHome extends RecyclerView.ViewHolder {
    public TextView jadwalSholat, waktuSholat ;

    public HolderHome(View itemView) {
        super(itemView);

        jadwalSholat = (TextView) itemView.findViewById(R.id.jdwl_sholat);
        waktuSholat = (TextView) itemView.findViewById(R.id.wkt_sholat);
    }
}
