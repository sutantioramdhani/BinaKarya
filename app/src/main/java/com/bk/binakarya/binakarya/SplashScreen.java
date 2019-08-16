package com.bk.binakarya.binakarya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.bk.binakarya.binakarya.ChattingPersonal.Login;

public class SplashScreen extends AppCompatActivity {
private int waktu_loading = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent walkthrough=new Intent(SplashScreen.this,Notifikasi.class);
                startActivity(walkthrough);
                finish();

            }
        },waktu_loading);
    }
}
