package p435n;

import java.io.IOException;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.c */
public final class C8036c implements C8064y {

    /* renamed from: g */
    public final /* synthetic */ C8031b f16133g;

    /* renamed from: h */
    public final /* synthetic */ C8064y f16134h;

    public C8036c(C8031b bVar, C8064y yVar) {
        this.f16133g = bVar;
        this.f16134h = yVar;
    }

    public void close() {
        C8031b bVar = this.f16133g;
        bVar.mo25869h();
        try {
            this.f16134h.close();
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
    public C8034b0 mo17028f() {
        return this.f16133g;
    }

    public void flush() {
        C8031b bVar = this.f16133g;
        bVar.mo25869h();
        try {
            this.f16134h.flush();
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

    /* renamed from: j */
    public void mo17030j(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "source");
        C5266a.m9848N(eVar.f16140h, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C8061v vVar = eVar.f16139g;
                while (true) {
                    C6888i.m12436c(vVar);
                    if (j2 >= ((long) 65536)) {
                        break;
                    }
                    j2 += (long) (vVar.f16185c - vVar.f16184b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    vVar = vVar.f16188f;
                }
                C8031b bVar = this.f16133g;
                bVar.mo25869h();
                try {
                    this.f16134h.mo17030j(eVar, j2);
                    if (!bVar.mo25870i()) {
                        j -= j2;
                    } else {
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
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("AsyncTimeout.sink(");
        u.append(this.f16134h);
        u.append(')');
        return u.toString();
    }
}
