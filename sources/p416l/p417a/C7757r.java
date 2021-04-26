package p416l.p417a;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: l.a.r */
public final class C7757r {

    /* renamed from: a */
    public final Object f15309a;

    /* renamed from: b */
    public final C6862l<Throwable, C6777r> f15310b;

    public C7757r(Object obj, C6862l<? super Throwable, C6777r> lVar) {
        this.f15309a = obj;
        this.f15310b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7757r)) {
            return false;
        }
        C7757r rVar = (C7757r) obj;
        return C6888i.m12434a(this.f15309a, rVar.f15309a) && C6888i.m12434a(this.f15310b, rVar.f15310b);
    }

    public int hashCode() {
        Object obj = this.f15309a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        C6862l<Throwable, C6777r> lVar = this.f15310b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CompletedWithCancellation(result=");
        u.append(this.f15309a);
        u.append(", onCancellation=");
        u.append(this.f15310b);
        u.append(")");
        return u.toString();
    }
}
