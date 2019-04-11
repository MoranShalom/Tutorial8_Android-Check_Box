package com.example.tutorial8_check_box;

//In this Android Checkbox tutorial you will learn how to add a android checkbox in your app,
// do some customization in terms of changing color and style to suit your requirement.

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox male;
    private CheckBox female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        male= (CheckBox) findViewById(R.id.checkBoxMale);
        female= (CheckBox) findViewById(R.id.checkBoxFemale);


        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(male.isChecked()){
                    Toast.makeText(MainActivity.this,
                            "Male checkbox is checked",
                            Toast.LENGTH_SHORT)
                            .show();
                }else{
                    Toast.makeText(MainActivity.this,
                            "Male checkbox is unchecked",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });


        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(female.isChecked()){
                    Toast.makeText(MainActivity.this,
                            "Female checkbox is checked",
                            Toast.LENGTH_SHORT)
                            .show();
                }else{
                    Toast.makeText(MainActivity.this,
                            "Female checkbox is unchecked",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
    }
}
