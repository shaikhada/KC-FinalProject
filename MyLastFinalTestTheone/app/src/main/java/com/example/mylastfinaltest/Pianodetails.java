package com.example.mylastfinaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

public class Pianodetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pianodetails);


        TextView firstone = findViewById(R.id.firstpianotxtview);
        ImageView returnimageview = findViewById(R.id.return_imageview);
        HorizontalScrollView pianoscrollview = findViewById(R.id.Scrollviewid);
        CardView firstcardView = findViewById(R.id.piano_first_card);
        CardView secondcardview = findViewById(R.id.piano_second_card);
        CardView thirdcardview = findViewById(R.id.piano_third_card);
        CardView forthcardview = findViewById(R.id.piano_forth_card);
        HorizontalScrollView horizontalScrollView2 = findViewById(R.id.Scrollviewid2);
        CardView first_music_card = findViewById(R.id.pianomusic_first_card);
        CardView second_music_card = findViewById(R.id.pianomusic_second_card);
        CardView third_music_card = findViewById(R.id.pianomusic_third_card);
        CardView forth_music_card = findViewById(R.id.pianomusic_forth_card);



        firstcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thefirstcardview = new Intent(Pianodetails.this , FirstPianoVideo.class);
                startActivity(thefirstcardview);
            }
        });

        secondcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thesecondcardview = new Intent(Pianodetails.this ,SecondPianoVideo.class);
                startActivity(thesecondcardview);
            }
        });

        thirdcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thethirdcardview = new Intent(Pianodetails.this , ThirdPianoVideo.class);
                startActivity(thethirdcardview);
            }
        });


        forthcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theforthcardview = new Intent(Pianodetails.this , ForthPianoVideo.class);
                startActivity(theforthcardview);
            }
        });




        first_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first_music_cardview = new Intent(Pianodetails.this , FirstPianoMusic.class);
                startActivity(first_music_cardview);
            }
        });


        second_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second_music_cardview = new Intent(Pianodetails.this , SecondPianoMusic.class);
                startActivity(second_music_cardview);
            }
        });


        third_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent third_music_cardview = new Intent(Pianodetails.this , ThirdPianoMuisc.class);
                startActivity(third_music_cardview);
            }
        });

        forth_music_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forth_music_cardview = new Intent(Pianodetails.this , ForthPianoMusic.class);
                startActivity(forth_music_cardview);
            }
        });


        returnimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnintent = new Intent(Pianodetails.this , FirstActivity.class);
                startActivity(returnintent);
            }
        });
    }
}