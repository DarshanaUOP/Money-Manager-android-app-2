package com.example.darshana.moneymanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
//                showMassages("Loading new Intent");
                try{
                    Intent newOrg = new Intent(Organization.this,NewOrganization.class);
                    startActivity(newOrg);
                }catch (Exception e){
                    showMassages("Error : " +e.getMessage());
                }
            }
        });

    }

    void showMassages(String massage){
        Toast.makeText(Organization.this,massage,Toast.LENGTH_SHORT).show();
    }

}
