package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    boolean help = true;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button show = findViewById(R.id.showBTN);

        TextView nameText = findViewById(R.id.nameID);
        String text = getIntent().getStringExtra("name");

        TextView ageText = findViewById(R.id.ageID);
        String text2 = getIntent().getStringExtra("age");

        TextView addressText = findViewById(R.id.addressID);
        String text3 = getIntent().getStringExtra("address");

        nameText.setText(text);
        ageText.setText(text2);
        addressText.setText(text3);




            show.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView phoneNumber = findViewById(R.id.phoneNumberID);
                    String text4 = getIntent().getStringExtra("phone");

                    if(help == true){
                        phoneNumber.setText(text4);

                        show.setText("Hide phone number");
                        help = false;
                    }
                    else{
                        phoneNumber.setText(" ");

                        show.setText("Show phone number");
                        help = true;
                    }



                }
            });



    }
}