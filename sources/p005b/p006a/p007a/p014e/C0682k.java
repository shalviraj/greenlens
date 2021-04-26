package p005b.p006a.p007a.p014e;

import p005b.p006a.p007a.p015f.C0688a;
import p005b.p096l.p097a.p151d.p152a.p163i.C3635b;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.e.k */
public final class C0682k implements C3635b {

    /* renamed from: a */
    public final /* synthetic */ C0684m f382a;

    public C0682k(C0684m mVar) {
        this.f382a = mVar;
    }

    /* renamed from: b */
    public final void mo10469b(Exception exc) {
        String str;
        C0688a aVar = C0688a.f391b;
        C0688a.m183a("App Review Failed", this.f382a.f386c);
        Object[] objArr = new Object[2];
        if (exc == null || (str = exc.getLocalizedMessage()) == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(this.f382a.f386c);
        C8091a.f16272d.mo26044b("In-App Review Failed: %s. App Sessions = %d", objArr);
    }
}
