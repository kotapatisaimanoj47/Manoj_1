package com.example.saimanojkotapati.manoj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final Button buttoo =findViewById(R.id.lol);
        buttoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edittext=(EditText)findViewById(R.id.name);
                EditText edittex=(EditText)findViewById(R.id.email);
                EditText editte=(EditText)findViewById(R.id.dob);
                EditText editt=(EditText)findViewById(R.id.addr);
                EditText edit=(EditText)findViewById(R.id.phone);
                Intent intent=new Intent(getApplicationContext(),Display.class);
                intent.putExtra ( "name", edittext.getText().toString() );
                intent.putExtra ( "name1", edittex.getText().toString() );
                intent.putExtra ( "name2", editte.getText().toString() );
                intent.putExtra ( "name3", editt.getText().toString() );
                intent.putExtra ( "name4", edit.getText().toString() );
                startActivity(intent);

            }
        });

    }

}
