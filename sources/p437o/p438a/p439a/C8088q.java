package p437o.p438a.p439a;

/* renamed from: o.a.a.q */
public final class C8088q {

    /* renamed from: a */
    public final Object f16258a;

    /* renamed from: b */
    public final C8085o f16259b;

    /* renamed from: c */
    public volatile boolean f16260c = true;

    public C8088q(Object obj, C8085o oVar) {
        this.f16258a = obj;
        this.f16259b = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8088q)) {
            return false;
        }
        C8088q qVar = (C8088q) obj;
        return this.f16258a == qVar.f16258a && this.f16259b.equals(qVar.f16259b);
    }

    public int hashCode() {
        return this.f16259b.f16248f.hashCode() + this.f16258a.hashCode();
    }
}
