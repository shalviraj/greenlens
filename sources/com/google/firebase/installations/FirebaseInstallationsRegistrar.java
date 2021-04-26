package com.google.firebase.installations;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p181a0.C3822h;
import p005b.p096l.p180d.p190p.C3948d;
import p005b.p096l.p180d.p190p.C3953e;
import p005b.p096l.p180d.p190p.C3956h;
import p005b.p096l.p180d.p190p.C3967r;
import p005b.p096l.p180d.p212u.C4228f;
import p005b.p096l.p180d.p216x.C4288d;
import p005b.p096l.p180d.p216x.C4290e;
import p005b.p096l.p180d.p216x.C4293g;

@Keep
public class FirebaseInstallationsRegistrar implements C3956h {
    public static /* synthetic */ C4290e lambda$getComponents$0(C3953e eVar) {
        return new C4288d((C3825d) eVar.mo15457a(C3825d.class), eVar.mo15465c(C3822h.class), eVar.mo15465c(C4228f.class));
    }

    public List<C3948d<?>> getComponents() {
        C3948d.C3950b<C4290e> a = C3948d.m7321a(C4290e.class);
        a.mo15461a(new C3967r(C3825d.class, 1, 0));
        a.mo15461a(new C3967r(C4228f.class, 0, 1));
        a.mo15461a(new C3967r(C3822h.class, 0, 1));
        a.mo15463c(C4293g.f7963a);
        return Arrays.asList(new C3948d[]{a.mo15462b(), C1960d.m2707E("fire-installations", "16.3.5")});
    }
}
