package com.example.mylastfinaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

public class Guitardetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitardetails);


                TextView guitarone = findViewById(R.id.firstguitartxtview);
                ImageView returnimageview = findViewById(R.id.return_imageview);
                HorizontalScrollView horizontalScrollView = findViewById(R.id.Scrollviewid);
                CardView firstcardview = findViewById(R.id.guitar_first_card);
                CardView secondcardview = findViewById(R.id.guitar_second_card);
                CardView thirdcardview = findViewById(R.id.guitar_third_card);
                CardView forthcardview = findViewById(R.id.guitar_forth_card);
//                HorizontalScrollView horizontalScrollView2 = findViewById(R.id.Scrollviewid2);
//                CardView first_music_card = findViewById(R.id.guitarmusic_first_card);
//                CardView second_music_card = findViewById(R.id.guitarmusic_second_card);




                firstcardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent thefirstcardview = new Intent(Guitardetails.this , FirstGuitarVideo.class);
                        startActivity(thefirstcardview);
                    }
                });

                secondcardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent thesecondcardview = new Intent(Guitardetails.this , SecondGuitarVideo.class);
                        startActivity(thesecondcardview);
                    }
                });


                thirdcardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent thethirdcardview = new Intent(Guitardetails.this , ThirdGuitarVideo.class);
                        startActivity(thethirdcardview);
                    }
                });


                forthcardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent theforthcardview = new Intent(Guitardetails.this , ForthGuitarVideo.class);
                        startActivity(theforthcardview);
                    }
                });

//                first_music_card.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent first_music_cardview = new Intent(Guitardetails.this , FirstViolinMusic.class);
//                        startActivity(first_music_cardview);
//                    }
//                });

//                second_music_card.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent second_music_cardview = new Intent(Guitardetails.this , SecondGuitarMusic.class);
//                        startActivity(second_music_cardview);
//                    }
//                });


                returnimageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent returnintent = new Intent(Guitardetails.this , FirstActivity.class);
                        startActivity(returnintent);
                    }
                });

            }
        }

