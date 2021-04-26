package p005b.p096l.p180d.p213v;

/* renamed from: b.l.d.v.j */
public final /* synthetic */ class C4249j implements Runnable {

    /* renamed from: g */
    public final C4245h f7866g;

    public C4249j(C4245h hVar) {
        this.f7866g = hVar;
    }

    public final void run() {
        C4245h hVar = this.f7866g;
        synchronized (hVar) {
            if (hVar.f7856a == 1) {
                hVar.mo15832a(1, "Timed out while binding");
            }
        }
    }
}
