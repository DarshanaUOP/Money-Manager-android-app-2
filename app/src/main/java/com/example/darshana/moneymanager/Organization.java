package com.example.darshana.moneymanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import adapters.AdapterOrganization;
import entities.EntityOrganization;

public class Organization extends AppCompatActivity {

    FloatingActionButton btnAddNewOrg;
    ListView listViewOrg;
    List<EntityOrganization> orgList;

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

        listViewOrg = (ListView) findViewById(R.id.listViewOrg);
        orgList = new ArrayList<EntityOrganization>();

        try {
            Organization.this.orgList.add(new EntityOrganization(R.mipmap.ic_launcher_round,"gotoZero","ANGO"));
            Organization.this.orgList.add(new EntityOrganization(R.mipmap.ic_launcher_round,"PLC","ANGO"));
            Organization.this.orgList.add(new EntityOrganization(R.mipmap.ic_launcher_round,"SL","ANGO"));
            Organization.this.orgList.add(new EntityOrganization(R.mipmap.ic_launcher_round,"G0","ANGO"));
            Organization.this.orgList.add(new EntityOrganization(R.mipmap.ic_launcher_round,"java","ANGO"));
        }catch (Exception e){
            showMassages("Error on loading : " + e.getMessage());
        }

        this.listViewOrg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showMassages("Title : " + orgList.get(position).getOrgName());
            }
        });

        Organization.this.listViewOrg.setAdapter(new AdapterOrganization(Organization.this,this.orgList));


    }

    void showMassages(String massage){
        Toast.makeText(Organization.this,massage,Toast.LENGTH_SHORT).show();
    }

}
