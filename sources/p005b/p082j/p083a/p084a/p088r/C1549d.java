package p005b.p082j.p083a.p084a.p088r;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1520f;
import p005b.p082j.p083a.p084a.C1521g;
import p005b.p082j.p083a.p084a.C1524i;

/* renamed from: b.j.a.a.r.d */
public final class C1549d extends C1524i {

    /* renamed from: c */
    public final C1549d f2503c;

    /* renamed from: d */
    public C1547b f2504d;

    /* renamed from: e */
    public C1549d f2505e;

    /* renamed from: f */
    public String f2506f;

    /* renamed from: g */
    public int f2507g;

    /* renamed from: h */
    public int f2508h;

    public C1549d(C1549d dVar, C1547b bVar, int i, int i2, int i3) {
        this.f2503c = dVar;
        this.f2504d = bVar;
        this.f2384a = i;
        this.f2507g = i2;
        this.f2508h = i3;
        this.f2385b = -1;
    }

    /* renamed from: a */
    public String mo11503a() {
        return this.f2506f;
    }

    /* renamed from: f */
    public C1549d mo11570f() {
        return this.f2503c;
    }

    /* renamed from: g */
    public C1549d mo11571g(int i, int i2) {
        C1549d dVar = this.f2505e;
        if (dVar == null) {
            C1547b bVar = this.f2504d;
            dVar = new C1549d(this, bVar == null ? null : bVar.mo11565a(), 1, i, i2);
            this.f2505e = dVar;
        } else {
            dVar.mo11573i(1, i, i2);
        }
        return dVar;
    }

    /* renamed from: h */
    public C1549d mo11572h(int i, int i2) {
        C1549d dVar = this.f2505e;
        if (dVar == null) {
            C1547b bVar = this.f2504d;
            C1549d dVar2 = new C1549d(this, bVar == null ? null : bVar.mo11565a(), 2, i, i2);
            this.f2505e = dVar2;
            return dVar2;
        }
        dVar.mo11573i(2, i, i2);
        return dVar;
    }

    /* renamed from: i */
    public void mo11573i(int i, int i2, int i3) {
        this.f2384a = i;
        this.f2385b = -1;
        this.f2507g = i2;
        this.f2508h = i3;
        this.f2506f = null;
        C1547b bVar = this.f2504d;
        if (bVar != null) {
            bVar.f2494b = null;
            bVar.f2495c = null;
            bVar.f2496d = null;
        }
    }

    /* renamed from: j */
    public void mo11574j(String str) {
        this.f2506f = str;
        C1547b bVar = this.f2504d;
        if (bVar != null && bVar.mo11566b(str)) {
            Object obj = bVar.f2493a;
            throw new C1520f(obj instanceof C1521g ? (C1521g) obj : null, C0843a.m452m("Duplicate field '", str, "'"));
        }
    }
}
