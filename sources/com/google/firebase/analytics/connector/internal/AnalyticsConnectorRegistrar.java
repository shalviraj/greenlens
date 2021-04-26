package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p182n.p183a.C3840a;
import p005b.p096l.p180d.p182n.p183a.p184c.C3845a;
import p005b.p096l.p180d.p190p.C3948d;
import p005b.p096l.p180d.p190p.C3956h;
import p005b.p096l.p180d.p190p.C3967r;
import p005b.p096l.p180d.p211t.C4222d;

@Keep
public class AnalyticsConnectorRegistrar implements C3956h {
    public static final /* synthetic */ int zza = 0;

    @RecentlyNonNull
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C3948d<?>> getComponents() {
        C3948d.C3950b<C3840a> a = C3948d.m7321a(C3840a.class);
        a.mo15461a(new C3967r(C3825d.class, 1, 0));
        a.mo15461a(new C3967r(Context.class, 1, 0));
        a.mo15461a(new C3967r(C4222d.class, 1, 0));
        a.mo15463c(C3845a.f7068a);
        a.mo15464d(2);
        return Arrays.asList(new C3948d[]{a.mo15462b(), C1960d.m2707E("fire-analytics", "18.0.3")});
    }
}
