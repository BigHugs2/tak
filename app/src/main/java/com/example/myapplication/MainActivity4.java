package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{

    Button button4, button5;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.textView2);
        button4 = findViewById(R.id.button4);
        textView2 = findViewById(R.id.textView2);

        button5 = findViewById(R.id.button);
        button5.setOnClickListener(this);

        Intent back = getIntent();

        String street = back.getStringExtra("street");
        textView2.setText(street);
        String home = back.getStringExtra("home");
        textView2.setText(home);
        String flat = back.getStringExtra("flat");
        textView2.setText(flat);
        String street1 = back.getStringExtra("street1");
        textView2.setText(street1);
        String home1 = back.getStringExtra("home1");
        textView2.setText(home1);
        String flat1 = back.getStringExtra("flat1");
        textView2.setText(flat1);


        textView2.setText("Откуда: " + street + ", " + home + ", " + flat + "\n " + "Куда: " + street1 + ", " + home1 + ", " + flat1);

        button4.setOnClickListener(view -> {

            Toast toast = Toast.makeText(this, "Вы заказали такси!",Toast.LENGTH_LONG);
            toast.show();
        });
    }
    @Override
    public void onClick(View v) {
        Intent main1 = new Intent(this, MainActivity.class);
        startActivity(main1);
    }
}