package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {



    String nameContent = " ";

    TextView age = null;
    String ageContent = " ";

    TextView address = null;
    String addressContent = " ";

    TextView phone = null;
    String phoneContent = " ";

    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b2 = findViewById(R.id.showBTN);
        nameContent = getIntent().getStringExtra("name");




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                age = findViewById(R.id.ageInput);
                ageContent = age.getText().toString();

                address = findViewById(R.id.adressInput);
                addressContent = address.getText().toString();

                phone = findViewById(R.id.phoneInput);
                phoneContent = phone.getText().toString();
                Activity3();
            }
        });


    }






    public void Activity3(){
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("name", nameContent);
        intent.putExtra("age", ageContent);
        intent.putExtra("address", addressContent);
        intent.putExtra("phone", phoneContent);

        startActivity(intent);

    }



}