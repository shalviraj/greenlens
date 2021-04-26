package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p005b.p273o.C4915n0;

public class UpgradeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT != 24) {
            C4915n0.m9030d(context);
        }
    }
}
