package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import p005b.p096l.p097a.p098a.p101f.C1628b;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.C1644k;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1679e;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1684g;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1689l;
import p005b.p096l.p097a.p098a.p101f.p111t.C1742a;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {

    /* renamed from: g */
    public static final /* synthetic */ int f11192g = 0;

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C1644k.m2169b(getApplicationContext());
        C1640h.C1641a a = C1640h.m2161a();
        a.mo11814b(string);
        a.mo11815c(C1742a.m2278b(i));
        if (string2 != null) {
            ((C1628b.C1630b) a).f2863b = Base64.decode(string2, 0);
        }
        C1689l lVar = C1644k.m2168a().f2891d;
        lVar.f2986e.execute(new C1684g(lVar, a.mo11813a(), i2, new C1679e(this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
