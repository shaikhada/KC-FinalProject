package com.example.test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView login = findViewById(R.id.log_in);
        ImageView gif = findViewById(R.id.gif_photo);
        EditText a = findViewById(R.id.Name);
        EditText b = findViewById(R.id.Email);
        EditText c = findViewById(R.id.password);
        Button Next = findViewById(R.id.Nextbutton);


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = (a.getText().toString());
                String Email = (b.getText().toString());
                String password = (c.getText().toString());


                if(Name.isEmpty() || Email.isEmpty() || password.isEmpty())
                    Toast.makeText(MainActivity.this, "Complete the required info", Toast.LENGTH_SHORT).show();
                return;
            }
        });


    }
}