package com.rikamersita.catatankeuanganpribadi.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.rikamersita.catatankeuanganpribadi.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
           // TextView tanggal, jumlah, keterangan;


            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
/*
                tanggal = (TextView) textView.findViewById(R.id.tv_tanggal);
                jumlah = (TextView) textView.findViewById(R.id.tv_jumlah);
                keterangan = (TextView) textView.findViewById(R.id.tv_keterangan);

                String tgl = getActivity().getIntent().getExtras().getString("tanggal");
                String jml = getActivity().getIntent().getExtras().getString("jumlah");
                String ket = getActivity().getIntent().getExtras().getString("keterangan");


 */


            }

        });
        return root;
    }
}