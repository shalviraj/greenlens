package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.wm */
public final class C2581wm {

    /* renamed from: a */
    public final Object f4418a;

    /* renamed from: b */
    public final int f4419b;

    public C2581wm(Object obj, int i) {
        this.f4418a = obj;
        this.f4419b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2581wm)) {
            return false;
        }
        C2581wm wmVar = (C2581wm) obj;
        return this.f4418a == wmVar.f4418a && this.f4419b == wmVar.f4419b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f4418a) * 65535) + this.f4419b;
    }
}
