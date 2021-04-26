package p005b.p096l.p180d.p190p;

/* renamed from: b.l.d.p.q */
public class C3966q {

    /* renamed from: a */
    public final Class<?> f7266a;

    /* renamed from: b */
    public final boolean f7267b;

    public C3966q(Class cls, boolean z, C3964o oVar) {
        this.f7266a = cls;
        this.f7267b = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3966q)) {
            return false;
        }
        C3966q qVar = (C3966q) obj;
        return qVar.f7266a.equals(this.f7266a) && qVar.f7267b == this.f7267b;
    }

    public int hashCode() {
        return ((this.f7266a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7267b).hashCode();
    }
}
