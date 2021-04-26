package p435n;

import java.io.OutputStream;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.r */
public final class C8056r implements C8064y {

    /* renamed from: g */
    public final OutputStream f16168g;

    /* renamed from: h */
    public final C8034b0 f16169h;

    public C8056r(OutputStream outputStream, C8034b0 b0Var) {
        C6888i.m12438e(outputStream, "out");
        C6888i.m12438e(b0Var, "timeout");
        this.f16168g = outputStream;
        this.f16169h = b0Var;
    }

    public void close() {
        this.f16168g.close();
    }

    /* renamed from: f */
    public C8034b0 mo17028f() {
        return this.f16169h;
    }

    public void flush() {
        this.f16168g.flush();
    }

    /* renamed from: j */
    public void mo17030j(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "source");
        C5266a.m9848N(eVar.f16140h, 0, j);
        while (j > 0) {
            this.f16169h.mo25878f();
            C8061v vVar = eVar.f16139g;
            C6888i.m12436c(vVar);
            int min = (int) Math.min(j, (long) (vVar.f16185c - vVar.f16184b));
            this.f16168g.write(vVar.f16183a, vVar.f16184b, min);
            int i = vVar.f16184b + min;
            vVar.f16184b = i;
            long j2 = (long) min;
            j -= j2;
            eVar.f16140h -= j2;
            if (i == vVar.f16185c) {
                eVar.f16139g = vVar.mo25996a();
                C8062w.m14927a(vVar);
            }
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("sink(");
        u.append(this.f16168g);
        u.append(')');
        return u.toString();
    }
}
