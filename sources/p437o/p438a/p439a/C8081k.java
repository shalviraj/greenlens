package p437o.p438a.p439a;

/* renamed from: o.a.a.k */
public final class C8081k {

    /* renamed from: a */
    public C8080j f16238a;

    /* renamed from: b */
    public C8080j f16239b;

    /* renamed from: a */
    public synchronized void mo26021a(C8080j jVar) {
        C8080j jVar2 = this.f16239b;
        if (jVar2 != null) {
            jVar2.f16237c = jVar;
            this.f16239b = jVar;
        } else if (this.f16238a == null) {
            this.f16239b = jVar;
            this.f16238a = jVar;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }

    /* renamed from: b */
    public synchronized C8080j mo26022b() {
        C8080j jVar;
        jVar = this.f16238a;
        if (jVar != null) {
            C8080j jVar2 = jVar.f16237c;
            this.f16238a = jVar2;
            if (jVar2 == null) {
                this.f16239b = null;
            }
        }
        return jVar;
    }
}
