package com.example.aarya.guardresourcemanager.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aarya.guardresourcemanager.R;
import com.example.aarya.guardresourcemanager.rest.ApiClient;
import com.example.aarya.guardresourcemanager.rest.ApiInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
