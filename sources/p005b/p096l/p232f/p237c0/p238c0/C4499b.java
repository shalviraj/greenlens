package p005b.p096l.p232f.p237c0.p238c0;

/* renamed from: b.l.f.c0.c0.b */
public class C4499b {

    /* renamed from: a */
    public final int f8382a;

    /* renamed from: b */
    public final int f8383b;

    public C4499b(int i, int i2) {
        this.f8382a = i;
        this.f8383b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4499b)) {
            return false;
        }
        C4499b bVar = (C4499b) obj;
        return this.f8382a == bVar.f8382a && this.f8383b == bVar.f8383b;
    }

    public final int hashCode() {
        return this.f8382a ^ this.f8383b;
    }

    public final String toString() {
        return this.f8382a + "(" + this.f8383b + ')';
    }
}
