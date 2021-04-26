package com.google.firebase.iid;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p181a0.C3822h;
import p005b.p096l.p180d.p190p.C3948d;
import p005b.p096l.p180d.p190p.C3956h;
import p005b.p096l.p180d.p190p.C3967r;
import p005b.p096l.p180d.p211t.C4222d;
import p005b.p096l.p180d.p213v.C4266r;
import p005b.p096l.p180d.p213v.C4268s;
import p005b.p096l.p180d.p213v.p214c.C4235a;

@Keep
public final class Registrar implements C3956h {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    public static class C5769a implements C4235a {
        public C5769a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Keep
    public final List<C3948d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C3948d.C3950b<FirebaseInstanceId> a = C3948d.m7321a(cls);
        a.mo15461a(new C3967r(C3825d.class, 1, 0));
        a.mo15461a(new C3967r(C4222d.class, 1, 0));
        a.mo15461a(new C3967r(C3822h.class, 1, 0));
        a.mo15463c(C4268s.f7900a);
        a.mo15464d(1);
        C3948d<FirebaseInstanceId> b = a.mo15462b();
        C3948d.C3950b<C4235a> a2 = C3948d.m7321a(C4235a.class);
        a2.mo15461a(new C3967r(cls, 1, 0));
        a2.mo15463c(C4266r.f7898a);
        return Arrays.asList(new C3948d[]{b, a2.mo15462b(), C1960d.m2707E("fire-iid", "18.0.0")});
    }
}
