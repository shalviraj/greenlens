package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import p005b.p273o.C4857i2;
import p005b.p273o.C4957r3;

public class SyncService extends Service {
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C4957r3.C4958a aVar = new C4957r3.C4958a(this);
        Long l = C4957r3.f9567a;
        C4857i2.m8928E(this);
        Thread thread = new Thread(aVar, "OS_SYNCSRV_BG_SYNC");
        C4957r3.f9569c = thread;
        thread.start();
        return 1;
    }
}
