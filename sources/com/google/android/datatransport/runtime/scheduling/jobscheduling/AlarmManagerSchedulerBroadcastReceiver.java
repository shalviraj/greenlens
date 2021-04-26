package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import p005b.p096l.p097a.p098a.p101f.C1628b;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.C1644k;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1673a;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1684g;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1689l;
import p005b.p096l.p097a.p098a.p101f.p111t.C1742a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f11191a = 0;

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C1644k.m2169b(context);
        C1640h.C1641a a = C1640h.m2161a();
        a.mo11814b(queryParameter);
        a.mo11815c(C1742a.m2278b(intValue));
        if (queryParameter2 != null) {
            ((C1628b.C1630b) a).f2863b = Base64.decode(queryParameter2, 0);
        }
        C1689l lVar = C1644k.m2168a().f2891d;
        lVar.f2986e.execute(new C1684g(lVar, a.mo11813a(), i, C1673a.f2949g));
    }
}
