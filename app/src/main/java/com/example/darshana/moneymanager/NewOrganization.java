package com.example.darshana.moneymanager;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import adapters.AdapterNewOrganization;
import entities.EntityNewOrganization;

public class NewOrganization extends AppCompatActivity {

    FloatingActionButton addnewOrgSAveFAB;
    ListView listViewNewOrg;
    List<EntityNewOrganization> entityNewOrganizationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(NewOrganization.this,"Loading ",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.new_org);

        addnewOrgSAveFAB  = (FloatingActionButton) findViewById(R.id.addnewOrgSAveFAB);
        listViewNewOrg = (ListView) findViewById(R.id.listViewNewOrg);
        entityNewOrganizationList = new ArrayList<>();

        NewOrganization.this.entityNewOrganizationList.add(new EntityNewOrganization(R.mipmap.ic_launcher_round));

        listViewNewOrg.setAdapter(new AdapterNewOrganization(NewOrganization.this,this.entityNewOrganizationList));
    }
}
