package com.rikamersita.catatankeuanganpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    public void signup(View view) {
        Intent daftar = new Intent(this,SignUpActivity.class);
        startActivity(daftar);
    }

    public void dashboard(View view) {
        Intent menu = new Intent(this,MenuUtamaActivity.class);
        startActivity(menu);
    }
}