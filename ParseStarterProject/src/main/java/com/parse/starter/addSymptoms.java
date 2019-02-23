package com.parse.starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class addSymptoms extends AppCompatActivity {

    public void goToSymptoms(View view){
        Log.i("addSymptoms","Coming Here");

        startActivity(new Intent(addSymptoms.this,ListActivity.class));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_symptoms);
        Intent intent=getIntent();
        Toast.makeText(this,intent.getStringExtra("Symptom"),Toast.LENGTH_LONG).show();
    }
}
