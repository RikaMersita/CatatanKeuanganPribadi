package com.rikamersita.catatankeuanganpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.rikamersita.catatankeuanganpribadi.ui.home.HomeFragment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SubMenuPemasukanActivity extends AppCompatActivity {

    EditText tanggal, jumlah, keterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_pemasukan);

        getSupportActionBar().hide();

        tanggal = (EditText) findViewById(R.id.et_tanggal);
        jumlah = (EditText) findViewById(R.id.et_jumlah);
        keterangan = (EditText) findViewById(R.id.et_keterangan);
    }

    public void menu(View view) {
        Intent menuu = new Intent(this,MenuUtamaActivity.class);
        startActivity(menuu);
    }

    public void simpanmasuk(View view) {
        String tgl = tanggal.getText().toString();
        String jml = jumlah.getText().toString();
        String ket = keterangan.getText().toString();
        Intent simpanmasuk = new Intent(this, HomeFragment.class);

        simpanmasuk.putExtra("tanggal",tgl);
        simpanmasuk.putExtra("jumlah",jml);
        simpanmasuk.putExtra("keterangan",ket);
        startActivity(simpanmasuk);
    }
}