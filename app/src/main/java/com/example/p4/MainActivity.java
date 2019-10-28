package com.example.p4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button6;
    private Button drivers;
    private Button mass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button6 = (Button) findViewById(R.id.button6);
        drivers = (Button) findViewById(R.id.drivers);
        mass = (Button) findViewById(R.id.mass);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openconstructors();
            }
        });

        drivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendrivers();
            }
        });
        /*length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlenconv();
            }
        });
        mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmassconv();
            }
        });*/
    }

    public void openconstructors() {
        Intent intent = new Intent(this,constructors.class);
        startActivity(intent);
    }

    public void opendrivers() {
        Intent intent = new Intent(this,drivers.class);
        startActivity(intent);
    }


}


