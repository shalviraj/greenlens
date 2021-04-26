package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4840g0;
import p005b.p273o.C4854i;

public class RestoreJobService extends JobIntentService {
    /* renamed from: d */
    public final void mo22334d(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            C1960d.m2777b(getApplicationContext(), new C4854i(extras), (C4840g0.C4841a) null);
        }
    }
}
