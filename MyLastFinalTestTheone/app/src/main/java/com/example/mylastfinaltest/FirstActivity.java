package com.example.mylastfinaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

//        InstrumentsDetails FirstInstrument = new InstrumentsDetails("Piano" , R.drawable.piano_image);
//        InstrumentsDetails SecondInstrument = new InstrumentsDetails("Guitar" ,R.drawable.guitar_image);
//        InstrumentsDetails ThirdInstrument = new InstrumentsDetails("Oud" , R.drawable.oud_image);
//        InstrumentsDetails FourthInstrument = new InstrumentsDetails("Violin" ,R.drawable.violin_image);
//
//
//
//        instrumentsDetailsArrayList.add(FirstInstrument);
//        instrumentsDetailsArrayList.add(SecondInstrument);
//        instrumentsDetailsArrayList.add(ThirdInstrument);
//        instrumentsDetailsArrayList.add(FourthInstrument);
//
//
//        InstrumentAdapter instrumentAdapter = new InstrumentAdapter(this , 0 , instrumentsDetailsArrayList);


        HorizontalScrollView ScrollView = findViewById(R.id.Scrollviewid);

        CardView pianoone = findViewById(R.id.piano_card);
        CardView oudone = findViewById(R.id.oud_card);
        CardView guitarone = findViewById(R.id.guitar_card);
        CardView violinone = findViewById(R.id.violin_card);


        pianoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pianointent = new Intent(FirstActivity.this , Pianodetails.class);
                startActivity(pianointent);
            }
        });

        oudone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oudintent = new Intent(FirstActivity.this , Ouddetails.class);
                startActivity(oudintent);
            }
        });


        guitarone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent guitarintent = new Intent(FirstActivity.this , Guitardetails.class);
                startActivity(guitarintent);
            }
        });

        violinone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent violinintent = new Intent(FirstActivity.this , Violindetails.class);
                startActivity(violinintent);
            }
        });
    }
}