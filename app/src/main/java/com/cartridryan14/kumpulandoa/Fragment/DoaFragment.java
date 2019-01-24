package com.cartridryan14.kumpulandoa.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cartridryan14.kumpulandoa.Adapter.AdapterDoa;
import com.cartridryan14.kumpulandoa.Model.ModelDoa;
import com.cartridryan14.kumpulandoa.R;

import java.util.ArrayList;
import java.util.List;

public class DoaFragment extends Fragment {

    public List<ModelDoa> doa = new ArrayList<>();
    private RecyclerView recyclerView ;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_doa, container, false);

        recyclerView = view.findViewById(R.id.recylcerview); //doa

        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);


        AdapterDoa adapter = new AdapterDoa(doa);
        recyclerView.setAdapter(adapter);

        doaCollection();

        return  view;

    }

    private void doaCollection() {
        doa.add(new ModelDoa(
                "Doa Sebelum Makan",
                "Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka",
                "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ"));
        doa.add(new ModelDoa(
                "Doa Sesudah Makan",
                "Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam",
                "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ"));
        doa.add(new ModelDoa(
                "Doa Sesudah  Minum",
                "Segala puji bagi Allah yang telah menjadikan air ini (minuman) segar dan menggiatkan dengan rahmat-Nya dan tidak menjadikan air ini (minuman) asin lagi pahit karena dosa-dosa kami",
                "اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَا"));
        doa.add(new ModelDoa(
                "Doa Ketika Makan Lupa Membaca Doa",
                "Dengan menyebut nama Allah pada awal dan akhirnya",
                "بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ"));

        doa.add(new ModelDoa(
                "Doa Sebelum Tidur",
                "Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati",
                "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ"));
        doa.add(new ModelDoa(
                "Doa Ketika Mendapat Mimpi Baik",
                "Segala puji bagi Allah yang telah memberi hajatku",
                "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ"));
        doa.add(new ModelDoa(
                "Doa Masuk Kamar Mandi Atau Toilet",
                "Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan setan perempuan",
                "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ"));
        doa.add(new ModelDoa(
                "Doa Bangun Tidur",
                "Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan",
                "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ"));

        doa.add(new ModelDoa(
                "Doa Melepas Pakaian",
                "Dengan nama Allah yang tiada Tuhan selain-Nya",
                "بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُو"));
        doa.add(new ModelDoa(
                "Doa Sebelum Belajar",
                "Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman",
                "يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا"));

    }


}