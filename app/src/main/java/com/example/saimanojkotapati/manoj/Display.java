package com.example.saimanojkotapati.manoj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends AppCompatActivity {
    TextView receive;
    Bundle bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView textview = (TextView) findViewById(R.id.name1);
        TextView textvie = (TextView) findViewById(R.id.name2);
        TextView textvi = (TextView) findViewById(R.id.name3);
        TextView textv = (TextView) findViewById(R.id.name4);
        TextView text = (TextView) findViewById(R.id.name5);
        bb=getIntent().getExtras();
        textview.setText(bb.getString("name"));
        textvie.setText(bb.getString("name1"));
        textvi.setText(bb.getString("name2"));
        textv.setText(bb.getString("name3"));
        text.setText(bb.getString("name4"));

        final Button button = findViewById(R.id.pop);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();}
        });



    }
}
