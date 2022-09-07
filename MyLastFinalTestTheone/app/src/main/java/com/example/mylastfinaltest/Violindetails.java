package com.example.mylastfinaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

public class Violindetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_violindetails);

        TextView violinone = findViewById(R.id.firstviolintxtview);
        ImageView returnimageview = findViewById(R.id.return_imageview);
        HorizontalScrollView horizontalScrollView = findViewById(R.id.Scrollviewid);
        CardView firstcardview = findViewById(R.id.violin_first_card);
        CardView secondcardview = findViewById(R.id.violin_second_card);
        CardView thirdcardview = findViewById(R.id.violin_third_card);
        CardView forthcardview = findViewById(R.id.violin_forth_card);
        HorizontalScrollView horizontalScrollView2 = findViewById(R.id.Scrollviewid2);
        CardView first_music_card = findViewById(R.id.violinmusic_first_card);
        CardView second_music_card = findViewById(R.id.violinmusic_second_card);
        CardView third_music_card = findViewById(R.id.violinmusic_third_card);



        firstcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thefirstcardview = new Intent(Violindetails.this , FirstViolinVideo.class);
                startActivity(thefirstcardview);
            }
        });

        secondcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thesecondcardview = new Intent(Violindetails.this , SecondViolinVideo.class);
                startActivity(thesecondcardview);
            }
        });

        thirdcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thethirdcardview = new Intent(Violindetails.this , ThirdViolinVideo.class);
                startActivity(thethirdcardview);
            }
        });

        forthcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theforthcardview = new Intent(Violindetails.this , ForthViolinVideo.class);
                startActivity(theforthcardview);
            }
        });

        first_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first_music_cardview = new Intent(Violindetails.this ,FirstViolinMusic.class);
                startActivity(first_music_cardview);
            }
        });


        second_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second_music_cardview = new Intent(Violindetails.this , SecondViolinMusic.class);
                startActivity(second_music_cardview);
            }
        });


        third_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent third_music_cardview = new Intent(Violindetails.this , ThirdViolinMusic.class);
                startActivity(third_music_cardview);
            }
        });


        returnimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnintent = new Intent(Violindetails.this , FirstActivity.class);
                startActivity(returnintent);
            }
        });

    }
}