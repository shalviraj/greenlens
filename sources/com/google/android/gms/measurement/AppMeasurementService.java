package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.RecentlyNonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;
import p005b.p096l.p097a.p113c.p145h.p147b.C3197h8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3205i5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3219j8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3220j9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3230k8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3241l8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3269o3;
import p005b.p096l.p097a.p113c.p145h.p147b.C3281p4;

public final class AppMeasurementService extends Service implements C3230k8 {

    /* renamed from: g */
    public C3241l8<AppMeasurementService> f11363g;

    /* renamed from: a */
    public final boolean mo14382a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: b */
    public final void mo14383b(@RecentlyNonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* renamed from: c */
    public final void mo14384c(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final C3241l8<AppMeasurementService> mo18925d() {
        if (this.f11363g == null) {
            this.f11363g = new C3241l8<>(this);
        }
        return this.f11363g;
    }

    @RecentlyNonNull
    @MainThread
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        C3241l8<AppMeasurementService> d = mo18925d();
        Objects.requireNonNull(d);
        if (intent == null) {
            d.mo14397c().f5799f.mo14414a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C3205i5(C3220j9.m6113t(d.f5715a));
        }
        d.mo14397c().f5802i.mo14415b("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        C3281p4.m6272h(mo18925d().f5715a, (C2775ec) null, (Long) null).mo14329d().f5807n.mo14414a("Local AppMeasurementService is starting up");
    }

    @MainThread
    public void onDestroy() {
        C3281p4.m6272h(mo18925d().f5715a, (C2775ec) null, (Long) null).mo14329d().f5807n.mo14414a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@RecentlyNonNull Intent intent) {
        mo18925d().mo14396b(intent);
    }

    @MainThread
    public int onStartCommand(@RecentlyNonNull Intent intent, int i, int i2) {
        C3241l8<AppMeasurementService> d = mo18925d();
        C3269o3 d2 = C3281p4.m6272h(d.f5715a, (C2775ec) null, (Long) null).mo14329d();
        if (intent == null) {
            d2.f5802i.mo14414a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        d2.f5807n.mo14416c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        C3197h8 h8Var = new C3197h8(d, i2, d2, intent);
        C3220j9 t = C3220j9.m6113t(d.f5715a);
        t.mo14331f().mo14420q(new C3219j8(t, h8Var));
        return 2;
    }

    @MainThread
    public boolean onUnbind(@RecentlyNonNull Intent intent) {
        mo18925d().mo14395a(intent);
        return true;
    }
}
