package p416l.p417a;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: l.a.p */
public final class C7751p {

    /* renamed from: a */
    public final Object f15298a;

    /* renamed from: b */
    public final C7712d f15299b;

    /* renamed from: c */
    public final C6862l<Throwable, C6777r> f15300c;

    /* renamed from: d */
    public final Object f15301d;

    /* renamed from: e */
    public final Throwable f15302e;

    public C7751p(Object obj, C7712d dVar, C6862l<? super Throwable, C6777r> lVar, Object obj2, Throwable th) {
        this.f15298a = obj;
        this.f15299b = dVar;
        this.f15300c = lVar;
        this.f15301d = obj2;
        this.f15302e = th;
    }

    public C7751p(Object obj, C7712d dVar, C6862l<Throwable, C6777r> lVar, Object obj2, Throwable th, int i) {
        dVar = (i & 2) != 0 ? null : dVar;
        lVar = (i & 4) != 0 ? null : lVar;
        obj2 = (i & 8) != 0 ? null : obj2;
        th = (i & 16) != 0 ? null : th;
        this.f15298a = obj;
        this.f15299b = dVar;
        this.f15300c = lVar;
        this.f15301d = obj2;
        this.f15302e = th;
    }

    /* renamed from: a */
    public static C7751p m14098a(C7751p pVar, Object obj, C7712d dVar, C6862l lVar, Object obj2, Throwable th, int i) {
        Object obj3 = null;
        Object obj4 = (i & 1) != 0 ? pVar.f15298a : null;
        if ((i & 2) != 0) {
            dVar = pVar.f15299b;
        }
        C7712d dVar2 = dVar;
        C6862l<Throwable, C6777r> lVar2 = (i & 4) != 0 ? pVar.f15300c : null;
        if ((i & 8) != 0) {
            obj3 = pVar.f15301d;
        }
        Object obj5 = obj3;
        if ((i & 16) != 0) {
            th = pVar.f15302e;
        }
        Objects.requireNonNull(pVar);
        return new C7751p(obj4, dVar2, lVar2, obj5, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7751p)) {
            return false;
        }
        C7751p pVar = (C7751p) obj;
        return C6888i.m12434a(this.f15298a, pVar.f15298a) && C6888i.m12434a(this.f15299b, pVar.f15299b) && C6888i.m12434a(this.f15300c, pVar.f15300c) && C6888i.m12434a(this.f15301d, pVar.f15301d) && C6888i.m12434a(this.f15302e, pVar.f15302e);
    }

    public int hashCode() {
        Object obj = this.f15298a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        C7712d dVar = this.f15299b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C6862l<Throwable, C6777r> lVar = this.f15300c;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Object obj2 = this.f15301d;
        int hashCode4 = (hashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.f15302e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CompletedContinuation(result=");
        u.append(this.f15298a);
        u.append(", cancelHandler=");
        u.append(this.f15299b);
        u.append(", onCancellation=");
        u.append(this.f15300c);
        u.append(", idempotentResume=");
        u.append(this.f15301d);
        u.append(", cancelCause=");
        u.append(this.f15302e);
        u.append(")");
        return u.toString();
    }
}
