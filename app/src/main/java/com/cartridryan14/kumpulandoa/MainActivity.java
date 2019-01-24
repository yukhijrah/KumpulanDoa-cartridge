package com.cartridryan14.kumpulandoa;

import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.cartridryan14.kumpulandoa.Adapter.ContainerAdapter;
import com.cartridryan14.kumpulandoa.Fragment.DoaFragment;
import com.cartridryan14.kumpulandoa.Fragment.HomeFragment;
import com.cartridryan14.kumpulandoa.Fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    // public List<ModelDoa> doa = new ArrayList<>();

    public ContainerAdapter adapter;

    private ViewPager vpMain ;
    private Button btnHome, btnDoa,btnProfile;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting object(view) untuk view pager
        vpMain = (ViewPager) findViewById(R.id.view_pager_main);
        btnHome = (Button) findViewById(R.id.btn_home);
        btnDoa = (Button) findViewById(R.id.btn_doa);
        btnProfile= (Button) findViewById(R.id.btn_profile);

        setContainerPrepared(); //untuk paggil method prepaireing containeer
        onButtonClicked(); //supaya buttonnya bisa di clik

    }

    private void setContainerPrepared() {
        adapter = new ContainerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), getString(R.string.btn_home));
        adapter.addFragment(new DoaFragment(), getString(R.string.btn_doa));
        adapter.addFragment(new ProfileFragment(), getString(R.string.btn_profile));

        //adapter.addFragment(new HomeFragment(), "Home"); dapet dari umair
        //adapter.addFragment(new DoaFragment(), "Doa");
        //adapter.addFragment(new HomeFragment(), "Home");

        vpMain.setAdapter(adapter);
    }

    private void onButtonClicked(){
        //Ini untuk handle clik padabutton home
        btnHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vpMain.setCurrentItem(0);

            }
        });

        //Ini untuk handle clik padabutton doa
        btnDoa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vpMain.setCurrentItem(1);
            }
        });

        //Ini untuk handle clik padabutton profile
        btnProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                vpMain.setCurrentItem(2);
            }
        });
    }
}