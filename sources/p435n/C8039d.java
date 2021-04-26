package p435n;

import java.io.IOException;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.d */
public final class C8039d implements C8030a0 {

    /* renamed from: g */
    public final /* synthetic */ C8031b f16137g;

    /* renamed from: h */
    public final /* synthetic */ C8030a0 f16138h;

    public C8039d(C8031b bVar, C8030a0 a0Var) {
        this.f16137g = bVar;
        this.f16138h = a0Var;
    }

    /* renamed from: T */
    public long mo17031T(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "sink");
        C8031b bVar = this.f16137g;
        bVar.mo25869h();
        try {
            long T = this.f16138h.mo17031T(eVar, j);
            if (!bVar.mo25870i()) {
                return T;
            }
            throw bVar.mo17036j((IOException) null);
        } catch (IOException e) {
            e = e;
            if (bVar.mo25870i()) {
                e = bVar.mo17036j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.mo25870i();
        }
    }

    public void close() {
        C8031b bVar = this.f16137g;
        bVar.mo25869h();
        try {
            this.f16138h.close();
            if (bVar.mo25870i()) {
                throw bVar.mo17036j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (bVar.mo25870i()) {
                e = bVar.mo17036j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.mo25870i();
        }
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f16137g;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("AsyncTimeout.source(");
        u.append(this.f16138h);
        u.append(')');
        return u.toString();
    }
}
