package com.cartridryan14.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.cartridryan14.kumpulandoa.Model.ModelDoa;

public class DetailActivity extends AppCompatActivity {

    TextView doaTitle, doaSubtitle, doaSurah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        doaTitle = (TextView) findViewById(R.id.doaTitle);
        doaSurah = (TextView) findViewById(R.id.doaSurah);
        doaSubtitle = (TextView) findViewById(R.id.doaSubtitle);


        ModelDoa doa = (ModelDoa) getIntent().getSerializableExtra("id_doa");

        doaTitle.setText(doa.getDoaTitle());
        doaSurah.setText(doa.getDoaSurah());
        doaSubtitle.setText(doa.getDoaSubtitle());

    }
}