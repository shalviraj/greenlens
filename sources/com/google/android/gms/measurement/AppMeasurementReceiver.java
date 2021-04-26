package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RecentlyNonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;
import p005b.p096l.p097a.p113c.p145h.p147b.C3182g4;
import p005b.p096l.p097a.p113c.p145h.p147b.C3193h4;
import p005b.p096l.p097a.p113c.p145h.p147b.C3247m3;
import p005b.p096l.p097a.p113c.p145h.p147b.C3269o3;
import p005b.p096l.p097a.p113c.p145h.p147b.C3281p4;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C3182g4 {

    /* renamed from: a */
    public C3193h4 f11362a;

    @MainThread
    public void onReceive(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        String str;
        C3247m3 m3Var;
        if (this.f11362a == null) {
            this.f11362a = new C3193h4(this);
        }
        C3193h4 h4Var = this.f11362a;
        Objects.requireNonNull(h4Var);
        C3269o3 d = C3281p4.m6272h(context, (C2775ec) null, (Long) null).mo14329d();
        if (intent == null) {
            m3Var = d.f5802i;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            d.f5807n.mo14415b("Local receiver got", action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                d.f5807n.mo14414a("Starting wakeful intent.");
                Objects.requireNonNull((AppMeasurementReceiver) h4Var.f5576a);
                WakefulBroadcastReceiver.startWakefulService(context, className);
                return;
            } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                m3Var = d.f5802i;
                str = "Install Referrer Broadcasts are deprecated";
            } else {
                return;
            }
        }
        m3Var.mo14414a(str);
    }
}
