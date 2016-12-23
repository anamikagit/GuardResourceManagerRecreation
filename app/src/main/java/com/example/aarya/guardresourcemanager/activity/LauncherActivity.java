package com.example.aarya.guardresourcemanager.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.aarya.guardresourcemanager.R;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

import rx.functions.Action1;

public class LauncherActivity extends AppCompatActivity {
    private static final String TAG = "LauncherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        Long timeBeforeActivityStarts = 2l;

                rx.Observable<Long> observable = rx.Observable.timer(timeBeforeActivityStarts, TimeUnit.SECONDS);
        observable.subscribe(new Action1<Long>() {
            @Override
            public void call(Long aLong) {
                Log.e(TAG, "Launching New Activity");
                Intent intent = new Intent(LauncherActivity.this, GuardHomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
