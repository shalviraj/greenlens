package p005b.p082j.p083a.p084a.p088r;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1516c;
import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.C1524i;

/* renamed from: b.j.a.a.r.e */
public class C1550e extends C1524i {

    /* renamed from: c */
    public final C1550e f2509c;

    /* renamed from: d */
    public C1547b f2510d;

    /* renamed from: e */
    public C1550e f2511e;

    /* renamed from: f */
    public String f2512f;

    /* renamed from: g */
    public boolean f2513g;

    public C1550e(int i, C1550e eVar, C1547b bVar) {
        this.f2384a = i;
        this.f2509c = eVar;
        this.f2510d = bVar;
        this.f2385b = -1;
    }

    /* renamed from: a */
    public final String mo11503a() {
        return this.f2512f;
    }

    /* renamed from: f */
    public C1550e mo11575f() {
        return this.f2509c;
    }

    /* renamed from: g */
    public C1550e mo11576g() {
        C1550e eVar = this.f2511e;
        if (eVar == null) {
            C1547b bVar = this.f2510d;
            C1550e eVar2 = new C1550e(1, this, bVar == null ? null : bVar.mo11565a());
            this.f2511e = eVar2;
            return eVar2;
        }
        eVar.mo11578i(1);
        return eVar;
    }

    /* renamed from: h */
    public C1550e mo11577h() {
        C1550e eVar = this.f2511e;
        if (eVar == null) {
            C1547b bVar = this.f2510d;
            C1550e eVar2 = new C1550e(2, this, bVar == null ? null : bVar.mo11565a());
            this.f2511e = eVar2;
            return eVar2;
        }
        eVar.mo11578i(2);
        return eVar;
    }

    /* renamed from: i */
    public C1550e mo11578i(int i) {
        this.f2384a = i;
        this.f2385b = -1;
        this.f2512f = null;
        this.f2513g = false;
        C1547b bVar = this.f2510d;
        if (bVar != null) {
            bVar.f2494b = null;
            bVar.f2495c = null;
            bVar.f2496d = null;
        }
        return this;
    }

    /* renamed from: j */
    public int mo11579j(String str) {
        if (this.f2384a != 2 || this.f2513g) {
            return 4;
        }
        this.f2513g = true;
        this.f2512f = str;
        C1547b bVar = this.f2510d;
        if (bVar != null && bVar.mo11566b(str)) {
            Object obj = bVar.f2493a;
            throw new C1516c(C0843a.m452m("Duplicate field '", str, "'"), obj instanceof C1517d ? (C1517d) obj : null);
        } else if (this.f2385b < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    /* renamed from: k */
    public int mo11580k() {
        int i = this.f2384a;
        if (i == 2) {
            if (!this.f2513g) {
                return 5;
            }
            this.f2513g = false;
            this.f2385b++;
            return 2;
        } else if (i == 1) {
            int i2 = this.f2385b;
            this.f2385b = i2 + 1;
            return i2 < 0 ? 0 : 1;
        } else {
            int i3 = this.f2385b + 1;
            this.f2385b = i3;
            return i3 == 0 ? 0 : 3;
        }
    }
}
