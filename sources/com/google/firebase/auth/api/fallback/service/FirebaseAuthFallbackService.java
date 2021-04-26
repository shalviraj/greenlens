package com.google.firebase.auth.api.fallback.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import p005b.p096l.p180d.p185o.p186d0.p187a.p188a.C3862a;

public class FirebaseAuthFallbackService extends Service {
    @RecentlyNonNull
    public final synchronized IBinder onBind(@RecentlyNonNull Intent intent) {
        if (!"com.google.firebase.auth.api.gms.service.START".equals(intent.getAction())) {
            return null;
        }
        return new C3862a(this);
    }
}
