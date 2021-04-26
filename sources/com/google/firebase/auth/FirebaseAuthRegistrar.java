package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.C3937w0;
import p005b.p096l.p180d.p185o.p189e0.C3866b;
import p005b.p096l.p180d.p190p.C3948d;
import p005b.p096l.p180d.p190p.C3956h;
import p005b.p096l.p180d.p190p.C3967r;

@Keep
public class FirebaseAuthRegistrar implements C3956h {
    public static final /* synthetic */ int zza = 0;

    @RecentlyNonNull
    @Keep
    public List<C3948d<?>> getComponents() {
        C3948d.C3950b bVar = new C3948d.C3950b(FirebaseAuth.class, new Class[]{C3866b.class}, (C3948d.C3949a) null);
        bVar.mo15461a(new C3967r(C3825d.class, 1, 0));
        bVar.mo15463c(C3937w0.f7208a);
        bVar.mo15464d(2);
        return Arrays.asList(new C3948d[]{bVar.mo15462b(), C1960d.m2707E("fire-auth", "20.0.4")});
    }
}
