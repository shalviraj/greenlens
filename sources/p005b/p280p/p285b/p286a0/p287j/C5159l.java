package p005b.p280p.p285b.p286a0.p287j;

import p435n.C8044h;

/* renamed from: b.p.b.a0.j.l */
public final class C5159l {

    /* renamed from: d */
    public static final C8044h f10060d = C8044h.m14839k(":status");

    /* renamed from: e */
    public static final C8044h f10061e = C8044h.m14839k(":method");

    /* renamed from: f */
    public static final C8044h f10062f = C8044h.m14839k(":path");

    /* renamed from: g */
    public static final C8044h f10063g = C8044h.m14839k(":scheme");

    /* renamed from: h */
    public static final C8044h f10064h = C8044h.m14839k(":authority");

    /* renamed from: i */
    public static final C8044h f10065i = C8044h.m14839k(":host");

    /* renamed from: j */
    public static final C8044h f10066j = C8044h.m14839k(":version");

    /* renamed from: a */
    public final C8044h f10067a;

    /* renamed from: b */
    public final C8044h f10068b;

    /* renamed from: c */
    public final int f10069c;

    public C5159l(String str, String str2) {
        this(C8044h.m14839k(str), C8044h.m14839k(str2));
    }

    public C5159l(C8044h hVar, String str) {
        this(hVar, C8044h.m14839k(str));
    }

    public C5159l(C8044h hVar, C8044h hVar2) {
        this.f10067a = hVar;
        this.f10068b = hVar2;
        this.f10069c = hVar.mo25959l() + 32 + hVar2.mo25959l();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5159l)) {
            return false;
        }
        C5159l lVar = (C5159l) obj;
        return this.f10067a.equals(lVar.f10067a) && this.f10068b.equals(lVar.f10068b);
    }

    public int hashCode() {
        return this.f10068b.hashCode() + ((this.f10067a.hashCode() + 527) * 31);
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f10067a.mo25968z(), this.f10068b.mo25968z()});
    }
}
