package com.example.smartsystem_pitb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Start code for button fragment_home
        FragmentManager fragmentManager = getSupportFragmentManager();
        Button btnhome = findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, HomeFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
//        End code for button fragment_home

//        Start code for button fragment_group
        Button btngroup = findViewById(R.id.btngroup);
        btngroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, GroupFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("none")
                        .commit();
            }
        });

//        End code for button fragment_group

//        Start code for button fragment_setting
        Button btnsetting = findViewById(R.id.btnsetting);
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, SettingFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

//        End code for button fragment_setting

    }

}