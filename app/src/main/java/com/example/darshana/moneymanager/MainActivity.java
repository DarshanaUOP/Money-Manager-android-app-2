package com.example.darshana.moneymanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        welcome = (ConstraintLayout) findViewById(R.id.welcomeScreen);

        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent selectOrg = new Intent(MainActivity.this,Organization.class);
                    startActivity(selectOrg);

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"ERROR : " + e.getCause() + '\n'+"Massage + " + e.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "Tap on the screen to start", Toast.LENGTH_LONG).show();
    }
}
