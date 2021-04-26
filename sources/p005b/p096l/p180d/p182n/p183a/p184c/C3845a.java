package p005b.p096l.p180d.p182n.p183a.p184c;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C2790g0;
import p005b.p096l.p180d.C3814a;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p182n.p183a.C3843b;
import p005b.p096l.p180d.p182n.p183a.C3851d;
import p005b.p096l.p180d.p182n.p183a.C3852e;
import p005b.p096l.p180d.p190p.C3953e;
import p005b.p096l.p180d.p190p.C3955g;
import p005b.p096l.p180d.p211t.C4222d;

/* renamed from: b.l.d.n.a.c.a */
public final /* synthetic */ class C3845a implements C3955g {

    /* renamed from: a */
    public static final C3955g f7068a = new C3845a();

    /* renamed from: a */
    public final Object mo15340a(C3953e eVar) {
        C3825d dVar = (C3825d) eVar.mo15457a(C3825d.class);
        Context context = (Context) eVar.mo15457a(Context.class);
        C4222d dVar2 = (C4222d) eVar.mo15457a(C4222d.class);
        Objects.requireNonNull(dVar, "null reference");
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(dVar2, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (C3843b.f7065c == null) {
            synchronized (C3843b.class) {
                if (C3843b.f7065c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.mo15350i()) {
                        dVar2.mo15483b(C3814a.class, C3851d.f7084g, C3852e.f7085a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.mo15348h());
                    }
                    C3843b.f7065c = new C3843b(C2790g0.m4765c(context, (String) null, (String) null, (String) null, bundle).f4741d);
                }
            }
        }
        return C3843b.f7065c;
    }
}
