package com.example.capstonefrontend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import androidx.appcompat.widget.Toolbar;

import java.util.Arrays;
import java.util.List;

public class HomePage extends AppCompatActivity{
 /*
 * The home page should display all of the elders
 * it should also display the temperature, humidity and also the condition of the room
 *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Toolbar toolbar = findViewById(R.id.toolBarHomePage);
        setSupportActionBar(toolbar);


        //Going to use a recycler view to display all of the elders
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<String> buttonNames = Arrays.asList("Button1", "Button2", "Button3", "Button4");

        HomePageItemAdapter adapter = new HomePageItemAdapter(buttonNames);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);


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