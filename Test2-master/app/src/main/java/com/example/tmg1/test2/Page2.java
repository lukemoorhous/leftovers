package com.example.tmg1.test2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
//import android.widget.TextView;
import android.widget.*;
//import android.view.*;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Button button1 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(new android.view.View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                goHome();
            }
        });
    }

    private void goHome()
    {

        Intent intent = new Intent(this, Page1.class);
        startActivity(intent);
    }

}
