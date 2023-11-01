package com.example.capstonefrontend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {
 /*
 * The home page should display all of the elders
 * it should also display the temperature, humidity and also the condition of the room
 *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        //Going to use a recycler view to display all of the elders


        //For the bottom navigation bar
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navigation_home) {
                    Intent toHome = new Intent(HomePage.this, MainActivity.class);
                    startActivity(toHome);
                    return true;
                }
                // Add more cases for additional navigation options
                return false;
            }
        });



    }//onCreate method

}