package com.miss.aplikasiku;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{


    //todo 1 deklarasikan

    Button bagaskara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bagaskara = findViewById(R.id.bagaskara);

        bagaskara.setOnClickListener(this);
    }
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apa kalian ingin Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Main3Activity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bagaskara:
                //kasih alamat untuk perpidahan activity
                Intent pindah_activity = new Intent(Main3Activity.this, Main4Activity.class);
                //untuk perpindahan activity
                startActivity(pindah_activity);
                break;


        }

    }
}
