package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import p005b.p273o.C4857i2;
import p005b.p273o.C4957r3;

@RequiresApi(api = 21)
public class SyncJobService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        C4957r3.C4959b bVar = new C4957r3.C4959b(this, jobParameters);
        Long l = C4957r3.f9567a;
        C4857i2.m8928E(this);
        Thread thread = new Thread(bVar, "OS_SYNCSRV_BG_SYNC");
        C4957r3.f9569c = thread;
        thread.start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Thread thread = C4957r3.f9569c;
        boolean z = false;
        if (thread != null && thread.isAlive()) {
            C4957r3.f9569c.interrupt();
            z = true;
        }
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        C4857i2.m8933a(kVar, "SyncJobService onStopJob called, system conditions not available reschedule: " + z, (Throwable) null);
        return z;
    }
}
