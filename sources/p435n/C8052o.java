package p435n;

import java.io.IOException;
import java.io.InputStream;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.o */
public final class C8052o implements C8030a0 {

    /* renamed from: g */
    public final InputStream f16162g;

    /* renamed from: h */
    public final C8034b0 f16163h;

    public C8052o(InputStream inputStream, C8034b0 b0Var) {
        C6888i.m12438e(inputStream, "input");
        C6888i.m12438e(b0Var, "timeout");
        this.f16162g = inputStream;
        this.f16163h = b0Var;
    }

    /* renamed from: T */
    public long mo17031T(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f16163h.mo25878f();
                C8061v r0 = eVar.mo25927r0(1);
                int read = this.f16162g.read(r0.f16183a, r0.f16185c, (int) Math.min(j, (long) (8192 - r0.f16185c)));
                if (read != -1) {
                    r0.f16185c += read;
                    long j2 = (long) read;
                    eVar.f16140h += j2;
                    return j2;
                } else if (r0.f16184b != r0.f16185c) {
                    return -1;
                } else {
                    eVar.f16139g = r0.mo25996a();
                    C8062w.m14927a(r0);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C5266a.m10004o2(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j).toString());
        }
    }

    public void close() {
        this.f16162g.close();
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f16163h;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("source(");
        u.append(this.f16162g);
        u.append(')');
        return u.toString();
    }
}
