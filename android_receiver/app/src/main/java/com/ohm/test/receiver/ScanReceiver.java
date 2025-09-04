package com.ohm.test.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ScanReceiver extends BroadcastReceiver {
    private static final String TAG = "OHMScanReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Received intent: " + intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String key : extras.keySet()) {
                Object value = extras.get(key);
                Log.i(TAG, "Extra: " + key + " = " + String.valueOf(value));
            }
        } else {
            Log.i(TAG, "No extras on intent");
        }
    }
}
