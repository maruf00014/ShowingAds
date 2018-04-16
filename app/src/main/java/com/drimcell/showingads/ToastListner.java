package com.drimcell.showingads;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;

/**
 * Created by Maruf on 16-Apr-18.
 */

public class ToastListner extends AdListener {

    private Context context ;

    @Override
    public void onAdClicked() {
        super.onAdClicked();
        Toast.makeText(context,"AdClicked",Toast.LENGTH_SHORT).show();
    }
}
