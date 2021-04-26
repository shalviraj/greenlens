package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4840g0;
import p005b.p273o.C4854i;

public class GcmIntentService extends IntentService {
    public GcmIntentService() {
        super("GcmIntentService");
        setIntentRedelivery(true);
    }

    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            C1960d.m2777b(this, new C4854i(extras), (C4840g0.C4841a) null);
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }
}
