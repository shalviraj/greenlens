package com.google.firebase.crashlytics;

import java.util.Arrays;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p182n.p183a.C3840a;
import p005b.p096l.p180d.p190p.C3948d;
import p005b.p096l.p180d.p190p.C3956h;
import p005b.p096l.p180d.p190p.C3967r;
import p005b.p096l.p180d.p191q.C3977b;
import p005b.p096l.p180d.p191q.C3980e;
import p005b.p096l.p180d.p191q.p192f.C3981a;
import p005b.p096l.p180d.p216x.C4290e;

public class CrashlyticsRegistrar implements C3956h {
    public List<C3948d<?>> getComponents() {
        C3948d.C3950b<C3980e> a = C3948d.m7321a(C3980e.class);
        a.mo15461a(new C3967r(C3825d.class, 1, 0));
        a.mo15461a(new C3967r(C4290e.class, 1, 0));
        a.mo15461a(new C3967r(C3840a.class, 0, 0));
        a.mo15461a(new C3967r(C3981a.class, 0, 0));
        a.mo15463c(new C3977b(this));
        a.mo15464d(2);
        return Arrays.asList(new C3948d[]{a.mo15462b(), C1960d.m2707E("fire-cls", "17.4.1")});
    }
}
