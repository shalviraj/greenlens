package p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.z.n.c */
public class C7294c implements C7295d, C7297f {

    /* renamed from: a */
    public final C6046e f14539a;

    /* renamed from: b */
    public final C6046e f14540b;

    public C7294c(C6046e eVar, C7294c cVar) {
        C6888i.m12438e(eVar, "classDescriptor");
        this.f14539a = eVar;
        this.f14540b = eVar;
    }

    /* renamed from: a */
    public C7452c0 mo23429a() {
        C7489j0 defaultType = this.f14539a.getDefaultType();
        C6888i.m12437d(defaultType, "classDescriptor.defaultType");
        return defaultType;
    }

    /* renamed from: e */
    public final C6046e mo24923e() {
        return this.f14539a;
    }

    public boolean equals(Object obj) {
        C6046e eVar = this.f14539a;
        C6046e eVar2 = null;
        C7294c cVar = obj instanceof C7294c ? (C7294c) obj : null;
        if (cVar != null) {
            eVar2 = cVar.f14539a;
        }
        return C6888i.m12434a(eVar, eVar2);
    }

    public int hashCode() {
        return this.f14539a.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Class{");
        C7489j0 defaultType = this.f14539a.getDefaultType();
        C6888i.m12437d(defaultType, "classDescriptor.defaultType");
        u.append(defaultType);
        u.append('}');
        return u.toString();
    }
}
