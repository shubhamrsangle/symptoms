package com.parse.starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Emergency extends AppCompatActivity {
    public static ArrayList<String> SymList =new ArrayList<String>();
    public static Map<String, String> Id = new HashMap<String, String>();
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    CheckBox s1,s2,s3,s4,s5,s6,s7,s8;

    public void selectSpecialist(View view){

        switch (view.getId()) {
            case R.id.spec1:
                if (s1.isChecked())
                    Toast.makeText(getApplicationContext(), "spec1", Toast.LENGTH_LONG).show();
                break;
            case R.id.spec2:
                if (s2.isChecked())
                    Toast.makeText(getApplicationContext(), "spec2", Toast.LENGTH_LONG).show();
                break;
            case R.id.spec3:
                if (s3.isChecked())
                    Toast.makeText(getApplicationContext(), "spec3", Toast.LENGTH_LONG).show();
                break;
            case R.id.spec4:
                if (s4.isChecked())
                    Toast.makeText(getApplicationContext(), "spec4", Toast.LENGTH_LONG).show();
                break;
            case R.id.spec5:
                if (s5.isChecked())
                    Toast.makeText(getApplicationContext(), "spec5", Toast.LENGTH_LONG).show();
                break;
            case R.id.spec6:
                if (s6.isChecked())
                    Toast.makeText(getApplicationContext(), "spec6", Toast.LENGTH_LONG).show();
                break;
            case R.id.spec7:
                if (s7.isChecked())
                    Toast.makeText(getApplicationContext(), "spec7", Toast.LENGTH_LONG).show();
                break;
            case R.id.spec8:
                if (s8.isChecked())
                    Toast.makeText(getApplicationContext(), "spec8", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(getApplicationContext(), "No Option Selected", Toast.LENGTH_LONG).show();
                break;


        }

    }



    public void knowSpecialist(View view)
    {
    //Taking Gender input from Radio Button
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        int selectedId = radioSexGroup.getCheckedRadioButtonId();
        radioSexButton = (RadioButton) findViewById(selectedId);
        String gender= (String) radioSexButton.getText();

    // Taking Age Input from EditText

        String age;

        EditText editText=(EditText)findViewById(R.id.ageVal);

        age=String.valueOf(editText.getText());
        Toast.makeText(this,age,Toast.LENGTH_LONG).show();

       // Clearing all selected symptoms after coming back
        SymList.clear();
        Id.clear();
        Log.i("All","symlist cleared");
        Intent intent=new Intent(Emergency.this, addSymptoms.class);
        intent.putExtra("Gender",gender);
        startActivity(intent);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        //Selecting specialist

        s1 = (CheckBox) findViewById(R.id.spec1);
        s2 = (CheckBox) findViewById(R.id.spec2);
        s3 = (CheckBox) findViewById(R.id.spec3);
        s4 = (CheckBox) findViewById(R.id.spec4);
        s5 = (CheckBox) findViewById(R.id.spec5);
        s6 = (CheckBox) findViewById(R.id.spec6);
        s7 = (CheckBox) findViewById(R.id.spec7);
        s8 = (CheckBox) findViewById(R.id.spec8);




    }
}
