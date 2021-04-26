package com.onesignal;

import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4840g0;
import p005b.p273o.C4880j;

@RequiresApi(api = 21)
public class GcmIntentJobService extends JobIntentService {

    /* renamed from: n */
    public static final /* synthetic */ int f11490n = 0;

    /* renamed from: d */
    public void mo22334d(@NonNull Intent intent) {
        C4880j jVar = new C4880j();
        jVar.f9421a = (PersistableBundle) intent.getExtras().getParcelable("Bundle:Parcelable:Extras");
        C1960d.m2777b(this, jVar, (C4840g0.C4841a) null);
    }
}
