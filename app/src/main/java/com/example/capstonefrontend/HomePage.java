package com.example.capstonefrontend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

    }
}