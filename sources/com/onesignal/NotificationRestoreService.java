package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p005b.p273o.C4857i2;
import p005b.p273o.C4915n0;

public class NotificationRestoreService extends IntentService {
    public NotificationRestoreService() {
        super("NotificationRestoreService");
    }

    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            Thread.currentThread().setPriority(10);
            C4857i2.m8928E(this);
            C4915n0.m9028b(this);
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }
}
