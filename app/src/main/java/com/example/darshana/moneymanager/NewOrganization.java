package com.example.darshana.moneymanager;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewOrganization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(NewOrganization.this,"Loading ",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.new_org);
    }
}
