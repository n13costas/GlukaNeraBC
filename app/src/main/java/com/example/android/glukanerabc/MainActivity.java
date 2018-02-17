package com.example.android.glukanerabc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Intent for Address
    public void showMap(View view) {
        Uri geolocation = Uri.parse("geo:37.9892,23.8458?z=13");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(geolocation);
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    //Intent for Telephone
    public void callTeam(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:" + "2106659220"));
        if (callIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(callIntent);
        }
    }

    //Intent for Website
    public void viewWebpage(View view) {
        Uri webpage = Uri.parse("http://www.gsgn.gr");
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (websiteIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(websiteIntent);
        }
    }

    //Intent for Email
    public void composeEmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto: gysy.gln@gmail.com"));
        startActivity(Intent.createChooser(emailIntent, ""));
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }

}
