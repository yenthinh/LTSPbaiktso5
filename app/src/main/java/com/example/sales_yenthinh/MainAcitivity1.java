package com.example.sales_yenthinh;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;

import android.view.View;

import android.webkit.WebView;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainAcitivity1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("THÊM SẢN PHẨM");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}

