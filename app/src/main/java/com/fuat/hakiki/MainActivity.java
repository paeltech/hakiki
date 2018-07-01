package com.fuat.hakiki;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fuat.hakiki.Fragments.HelpFragment;
import com.fuat.hakiki.Fragments.PinFragment;
import com.fuat.hakiki.Fragments.QrFragment;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutPin;
    private LinearLayout layoutQr;
    private LinearLayout layoutHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setEvents();

    }

    private void findViews() {
        layoutPin = findViewById(R.id.layoutPin);
        layoutQr = findViewById(R.id.layoutQr);
        layoutHelp = findViewById(R.id.layoutHelp);

        getSupportFragmentManager().beginTransaction().replace(R.id.frgMain, new HelpFragment(MainActivity.this)).commit();
    }

    private void setEvents() {
        layoutPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frgMain, new PinFragment(MainActivity.this)).commit();
            }
        });

        layoutQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frgMain, new QrFragment(MainActivity.this)).commit();
            }
        });

        layoutHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frgMain, new HelpFragment(MainActivity.this)).commit();
            }
        });
    }

}
