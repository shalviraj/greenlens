package p437o.p438a.p439a;

/* renamed from: o.a.a.a */
public class C8066a implements Runnable, C8082l {

    /* renamed from: g */
    public final C8081k f16197g = new C8081k();

    /* renamed from: h */
    public final C8068c f16198h;

    public C8066a(C8068c cVar) {
        this.f16198h = cVar;
    }

    /* renamed from: a */
    public void mo26001a(C8088q qVar, Object obj) {
        this.f16197g.mo26021a(C8080j.m14968a(qVar, obj));
        this.f16198h.f16214j.execute(this);
    }

    public void run() {
        C8080j b = this.f16197g.mo26022b();
        if (b != null) {
            this.f16198h.mo26004c(b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
