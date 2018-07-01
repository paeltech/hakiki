package com.fuat.hakiki.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidessence.lib.RichTextView;
import com.fuat.hakiki.MainActivity;
import com.fuat.hakiki.R;

@SuppressLint("ValidFragment")
public class HelpFragment extends Fragment {

    private RichTextView rtxtScratch;
    private RichTextView rtxtScan;
    private RichTextView rtxtVerify;

    private MainActivity activity;

    public HelpFragment(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help, container, false);

        findViews(view);
        setInit();

        return view;
    }

    private void findViews(View view) {
        rtxtScratch = view.findViewById(R.id.rtxtScratch_HelpFrg);
        rtxtScan = view.findViewById(R.id.rtxtScan_HelpFrg);
        rtxtVerify = view.findViewById(R.id.rtxtVerify_HelpFrg);
    }

    private void setInit() {
        rtxtScratch.formatSpan(0, 7, RichTextView.FormatType.BOLD);
        rtxtScratch.colorSpan(0, 7, RichTextView.ColorFormatType.FOREGROUND, getResources().getColor(R.color.colorPrimary));

        rtxtScan.formatSpan(0, 4, RichTextView.FormatType.BOLD);
        rtxtScan.colorSpan(0, 4, RichTextView.ColorFormatType.FOREGROUND, getResources().getColor(R.color.colorPrimary));

        rtxtScan.formatSpan(20, 25, RichTextView.FormatType.BOLD);
        rtxtScan.colorSpan(20, 25, RichTextView.ColorFormatType.FOREGROUND, getResources().getColor(R.color.colorPrimary));

        rtxtVerify.formatSpan(0, 6, RichTextView.FormatType.BOLD);
        rtxtVerify.colorSpan(0, 6, RichTextView.ColorFormatType.FOREGROUND, getResources().getColor(R.color.colorPrimary));
    }
}
