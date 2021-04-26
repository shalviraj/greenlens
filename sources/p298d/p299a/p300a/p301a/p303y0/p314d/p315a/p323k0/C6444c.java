package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.k0.c */
public final class C6444c<T> {

    /* renamed from: a */
    public final T f12643a;

    /* renamed from: b */
    public final C6060h f12644b;

    public C6444c(T t, C6060h hVar) {
        this.f12643a = t;
        this.f12644b = hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6444c)) {
            return false;
        }
        C6444c cVar = (C6444c) obj;
        return C6888i.m12434a(this.f12643a, cVar.f12643a) && C6888i.m12434a(this.f12644b, cVar.f12644b);
    }

    public int hashCode() {
        T t = this.f12643a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        C6060h hVar = this.f12644b;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("EnhancementResult(result=");
        u.append(this.f12643a);
        u.append(", enhancementAnnotations=");
        u.append(this.f12644b);
        u.append(')');
        return u.toString();
    }
}
