package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    Button button3;
    EditText editText4, editText5, editText6, editText7, editText8, editText9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        editText7 = findViewById(R.id.editText7);
        editText8 = findViewById(R.id.editText8);
        editText9 = findViewById(R.id.editText9);

        button3 = findViewById(R.id.button);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back = new Intent(this, MainActivity4.class);
        back.putExtra("street", editText4.getText().toString());
        back.putExtra("home", editText5.getText().toString());
        back.putExtra("flat", editText6.getText().toString());
        back.putExtra("street1", editText7.getText().toString());
        back.putExtra("home1", editText8.getText().toString());
        back.putExtra("flat1", editText9.getText().toString());
        startActivity(back);
    }
}