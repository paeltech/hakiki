package com.fuat.hakiki.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.fuat.hakiki.MainActivity;
import com.fuat.hakiki.R;

@SuppressLint("ValidFragment")
public class PinFragment extends Fragment {

    private EditText edtPin;
    private Button btnVerify;

    private MainActivity activity;

    public PinFragment(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pin, container, false);

        findViews(view);
        setEvents();

        return view;
    }

    private void findViews(View view) {
        edtPin = view.findViewById(R.id.edtPin_PinFrg);
        btnVerify = view.findViewById(R.id.btnVerify_PinFrg);
    }

    private void setEvents() {
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
