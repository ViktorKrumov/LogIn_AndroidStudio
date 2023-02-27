package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name = null;

    String nameString = " ";

    //@SuppressLint("MissingInflatedId")
   // @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.b1);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = findViewById(R.id.nameInput);
                nameString = name.getText().toString();
                Activity2();
            }
        });


    }






    public void Activity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", nameString);
        startActivity(intent);

    }



}