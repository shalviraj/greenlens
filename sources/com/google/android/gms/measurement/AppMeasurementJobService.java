package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RecentlyNonNull;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;
import p005b.p096l.p097a.p113c.p145h.p147b.C3208i8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3219j8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3220j9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3230k8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3241l8;
import p005b.p096l.p097a.p113c.p145h.p147b.C3269o3;
import p005b.p096l.p097a.p113c.p145h.p147b.C3281p4;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C3230k8 {

    /* renamed from: g */
    public C3241l8<AppMeasurementJobService> f11361g;

    /* renamed from: a */
    public final boolean mo14382a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo14383b(@RecentlyNonNull Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: c */
    public final void mo14384c(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: d */
    public final C3241l8<AppMeasurementJobService> mo18917d() {
        if (this.f11361g == null) {
            this.f11361g = new C3241l8<>(this);
        }
        return this.f11361g;
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        C3281p4.m6272h(mo18917d().f5715a, (C2775ec) null, (Long) null).mo14329d().f5807n.mo14414a("Local AppMeasurementService is starting up");
    }

    @MainThread
    public void onDestroy() {
        C3281p4.m6272h(mo18917d().f5715a, (C2775ec) null, (Long) null).mo14329d().f5807n.mo14414a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@RecentlyNonNull Intent intent) {
        mo18917d().mo14396b(intent);
    }

    public boolean onStartJob(@RecentlyNonNull JobParameters jobParameters) {
        C3241l8<AppMeasurementJobService> d = mo18917d();
        C3269o3 d2 = C3281p4.m6272h(d.f5715a, (C2775ec) null, (Long) null).mo14329d();
        String string = jobParameters.getExtras().getString("action");
        d2.f5807n.mo14415b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        C3208i8 i8Var = new C3208i8(d, d2, jobParameters);
        C3220j9 t = C3220j9.m6113t(d.f5715a);
        t.mo14331f().mo14420q(new C3219j8(t, i8Var));
        return true;
    }

    public boolean onStopJob(@RecentlyNonNull JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public boolean onUnbind(@RecentlyNonNull Intent intent) {
        mo18917d().mo14395a(intent);
        return true;
    }
}
