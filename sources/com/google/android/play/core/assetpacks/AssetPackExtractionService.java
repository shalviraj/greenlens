package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p005b.p096l.p097a.p151d.p152a.p154b.C3484d1;
import p005b.p096l.p097a.p151d.p152a.p154b.C3559y;

public class AssetPackExtractionService extends Service {

    /* renamed from: g */
    public C3559y f11399g;

    public final IBinder onBind(Intent intent) {
        return this.f11399g;
    }

    public final void onCreate() {
        super.onCreate();
        this.f11399g = C3484d1.m6662h(getApplicationContext()).f6363z.mo14735a();
    }
}
