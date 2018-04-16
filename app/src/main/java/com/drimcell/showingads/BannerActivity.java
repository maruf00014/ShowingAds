package com.drimcell.showingads;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Maruf on 15-Apr-18.
 */

public class BannerActivity extends AppCompatActivity {
    private AdView madView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banner_activity_layout);

        madView = findViewById(R.id.BannerAddView);
        AdRequest adRequest = new AdRequest.Builder().build();

         madView.loadAd(adRequest);
    }

}
