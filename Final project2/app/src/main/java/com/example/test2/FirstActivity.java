package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class FirstActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView ;

    MusicFragment musicFragment = new MusicFragment();
    InstituteFragment instituteFragment = new InstituteFragment();
    EventsFragment eventsFragment = new EventsFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        bottomNavigationView = findViewById(R.id.bottom_navigation);


        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.person:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                        return true;

                    case  R.id.event:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,eventsFragment).commit();
                        return true;

                    case  R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,instituteFragment).commit();
                        return true;

                    case  R.id.music:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,musicFragment).commit();
                        return true;




                }

                return false;
            }
        });

    }
}