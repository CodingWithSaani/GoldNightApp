package com.tutorials180.goldnightapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tutorials180.goldnightapp.GoldCampusSLVScreens.CSSVL;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void callCSSVL(View view)
    {
        startActivity(new Intent(this, CSSVL.class));
        finish();
    }


}
