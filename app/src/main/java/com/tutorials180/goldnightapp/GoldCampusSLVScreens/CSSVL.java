package com.tutorials180.goldnightapp.GoldCampusSLVScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tutorials180.goldnightapp.MainActivity;
import com.tutorials180.goldnightapp.R;

public class CSSVL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cssvl);
    }

    public void tellYourName(View view)
    {
        Toast.makeText(this, "Aftab Ali and Sana Younas", Toast.LENGTH_SHORT).show();
    }

    public void tellMeAboutNoOfTicketsSold(View view)
    {
        Toast.makeText(this, "Only 19 tickets are sold yet Sir", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));

        finish();
    }
}
