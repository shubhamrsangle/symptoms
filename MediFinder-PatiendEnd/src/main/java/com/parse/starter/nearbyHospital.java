package com.parse.starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class nearbyHospital extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //To Receive updated of Locations from Emergency clicked button
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_hospital);
        Intent intent2=getIntent();
        String lat=intent2.getStringExtra("Latitude");
        String lon=intent2.getStringExtra("Longitude");
        Log.i("Latitude nearby",String.valueOf(lat));
        Log.i("Longitude nearby",String.valueOf(lon));
        Toast.makeText(getApplicationContext(),lat, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),lon, Toast.LENGTH_SHORT).show();

    }
}
