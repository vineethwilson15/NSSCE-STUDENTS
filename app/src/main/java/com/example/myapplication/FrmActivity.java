package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import androidx.browser.customtabs.CustomTabsIntent;

public class FrmActivity extends Activity {
    Button b,b2,b3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        b = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://app.ktu.edu.in/login.jsp";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(FrmActivity.this, Uri.parse(url));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://ktu.edu.in/eu/core/announcements.htm";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(FrmActivity.this, Uri.parse(url));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://nssce.etlab.in/user/login";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(FrmActivity.this, Uri.parse(url));
            }
        });

    }


}