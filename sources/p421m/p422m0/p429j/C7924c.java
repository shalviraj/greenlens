package p421m.p422m0.p429j;

import p298d.p344x.p346c.C6888i;
import p435n.C8044h;

/* renamed from: m.m0.j.c */
public final class C7924c {

    /* renamed from: d */
    public static final C8044h f15809d;

    /* renamed from: e */
    public static final C8044h f15810e;

    /* renamed from: f */
    public static final C8044h f15811f;

    /* renamed from: g */
    public static final C8044h f15812g;

    /* renamed from: h */
    public static final C8044h f15813h;

    /* renamed from: i */
    public static final C8044h f15814i;

    /* renamed from: a */
    public final int f15815a;

    /* renamed from: b */
    public final C8044h f15816b;

    /* renamed from: c */
    public final C8044h f15817c;

    static {
        C8044h.C8045a aVar = C8044h.f16143k;
        f15809d = aVar.mo25970b(":");
        f15810e = aVar.mo25970b(":status");
        f15811f = aVar.mo25970b(":method");
        f15812g = aVar.mo25970b(":path");
        f15813h = aVar.mo25970b(":scheme");
        f15814i = aVar.mo25970b(":authority");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7924c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            java.lang.String r0 = "value"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            n.h$a r0 = p435n.C8044h.f16143k
            n.h r2 = r0.mo25970b(r2)
            n.h r3 = r0.mo25970b(r3)
            r1.<init>((p435n.C8044h) r2, (p435n.C8044h) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7924c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7924c(C8044h hVar, String str) {
        this(hVar, C8044h.f16143k.mo25970b(str));
        C6888i.m12438e(hVar, "name");
        C6888i.m12438e(str, "value");
    }

    public C7924c(C8044h hVar, C8044h hVar2) {
        C6888i.m12438e(hVar, "name");
        C6888i.m12438e(hVar2, "value");
        this.f15816b = hVar;
        this.f15817c = hVar2;
        this.f15815a = hVar.mo25959l() + 32 + hVar2.mo25959l();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7924c)) {
            return false;
        }
        C7924c cVar = (C7924c) obj;
        return C6888i.m12434a(this.f15816b, cVar.f15816b) && C6888i.m12434a(this.f15817c, cVar.f15817c);
    }

    public int hashCode() {
        C8044h hVar = this.f15816b;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C8044h hVar2 = this.f15817c;
        if (hVar2 != null) {
            i = hVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f15816b.mo25968z() + ": " + this.f15817c.mo25968z();
    }
}
