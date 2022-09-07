package com.example.mylastfinaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class SecondViolinMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_violin_music);

        ImageView returnimageview = findViewById(R.id.Piano_page_return_arrow);
        VideoView videoView = findViewById(R.id.videoView);


        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.second_violin_music_video); //set the path of the video that we need to use in our VideoView
        videoView.start();

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);


        returnimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnintent = new Intent(SecondViolinMusic.this , Violindetails.class);
                startActivity(returnintent);
            }
        });
    }
}