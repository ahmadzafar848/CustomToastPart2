package com.example.customtoast2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button btnSuccess,btnError,btnWarning,btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSuccess=findViewById(R.id.btnSuccess);
        btnError=findViewById(R.id.btnError);
        btnWarning=findViewById(R.id.btnWarning);
        btnInfo=findViewById(R.id.btnInfo);

        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(MainActivity.this,"Successfully",Toasty.LENGTH_SHORT).show();

            }
        });
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(MainActivity.this,"Error",Toasty.LENGTH_SHORT).show();

            }
        });
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.warning(MainActivity.this,"Warning",Toasty.LENGTH_SHORT).show();

            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.info(MainActivity.this,"Information",Toasty.LENGTH_SHORT).show();
            }
        });
    }
}
//TODO:1.Create a Project
//TODO:2.Design an xml layout with four Buttons
//TODO:3.Go in MainActivity and Define class Button and make refrence variable                       Line No 23
//TODO:4.findview by id of all Buttons                                                               Line No 18-21
//TODO:5.Make clickListenter of all Buttons                                                          Line No 23
//TODO:6.go to this url https://github.com/GrenderG/Toasty
//TODO:7.Copy repository from here and paste in your build.gradle not in module build.gradle under all projects-repositries
//TODO:8.Copy Dependency from that url and paste it in module build.gradle under dependencies and sync this
//TODO:Now inside clickListner of buttons call Toasty. and call methods and give parameters          Line No 26,33,40,47