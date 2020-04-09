package com.example.darshana.moneymanager;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Organization extends AppCompatActivity {

    FloatingActionButton btnAddNewOrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.organization);

        //components
        btnAddNewOrg = (FloatingActionButton)findViewById(R.id.btnAddNewOrg);

        btnAddNewOrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
