package com.example.mylastfinaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

public class Ouddetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ouddetails);


        TextView oudone = findViewById(R.id.firstoudtxtview);
        ImageView returnimageview = findViewById(R.id.return_imageview);
        HorizontalScrollView horizontalScrollView = findViewById(R.id.Scrollviewid);
        CardView firstcardview = findViewById(R.id.oud_first_card);
        CardView secondcardview = findViewById(R.id.oud_second_card);
        CardView thirdcardview = findViewById(R.id.oud_third_card);
        HorizontalScrollView horizontalScrollView12 = findViewById(R.id.Scrollviewid2);
        CardView first_music_card = findViewById(R.id.oudmusic_first_card);
        CardView second_music_card = findViewById(R.id.oudmusic_second_card);
        CardView third_music_card = findViewById(R.id.oudmusic_third_card);



        firstcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thefirstcardview = new Intent(Ouddetails.this , FirstOudVideo.class);
                startActivity(thefirstcardview);
            }
        });



        secondcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thesecondcardview = new Intent(Ouddetails.this , SecondOudVideo.class);
                startActivity(thesecondcardview);
            }
        });



        thirdcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thethirdcardview = new Intent(Ouddetails.this , ThirdOudVideo.class);
                startActivity(thethirdcardview);
            }
        });

        first_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first_music_cardview = new Intent(Ouddetails.this , FirstOudMuisc.class);
                startActivity(first_music_cardview);
            }
        });

        second_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second_music_cardview = new Intent(Ouddetails.this , SecondOudMusic.class);
                startActivity(second_music_cardview);
            }
        });


        third_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent third_music_cardview = new Intent(Ouddetails.this , ThirdOudMusic.class);
                startActivity(third_music_cardview);
            }
        });



        returnimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnintent = new Intent(Ouddetails.this , FirstActivity.class);
                startActivity(returnintent);
            }
        });
    }
}