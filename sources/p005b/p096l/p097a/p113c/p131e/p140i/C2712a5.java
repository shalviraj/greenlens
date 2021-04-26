package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.a5 */
public final class C2712a5 {

    /* renamed from: a */
    public final Object f4609a;

    /* renamed from: b */
    public final int f4610b;

    public C2712a5(Object obj, int i) {
        this.f4609a = obj;
        this.f4610b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2712a5)) {
            return false;
        }
        C2712a5 a5Var = (C2712a5) obj;
        return this.f4609a == a5Var.f4609a && this.f4610b == a5Var.f4610b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f4609a) * 65535) + this.f4610b;
    }
}
