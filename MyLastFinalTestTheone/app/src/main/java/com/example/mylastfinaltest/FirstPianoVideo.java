package com.example.mylastfinaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class FirstPianoVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_piano_video);

        ImageView returnimageview = findViewById(R.id.Piano_page_return_arrow);
        VideoView videoView = findViewById(R.id.videoView);

//casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.first_piano_video); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play


        MediaController mediaController = new MediaController(this);
//link mediaController to videoView
        mediaController.setAnchorView(videoView);
//allow mediaController to control our videoView
        videoView.setMediaController(mediaController);


        returnimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnintent = new Intent(FirstPianoVideo.this , Pianodetails.class);
                startActivity(returnintent);
            }
        });
    }
}