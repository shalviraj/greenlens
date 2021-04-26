package p435n;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.i */
public final class C8046i implements C8064y {

    /* renamed from: g */
    public boolean f16147g;

    /* renamed from: h */
    public final C8042f f16148h;

    /* renamed from: i */
    public final Deflater f16149i;

    public C8046i(C8064y yVar, Deflater deflater) {
        C6888i.m12438e(yVar, "sink");
        C6888i.m12438e(deflater, "deflater");
        C8042f G = C5266a.m9806G(yVar);
        C6888i.m12438e(G, "sink");
        C6888i.m12438e(deflater, "deflater");
        this.f16148h = G;
        this.f16149i = deflater;
    }

    public void close() {
        if (!this.f16147g) {
            Throwable th = null;
            try {
                this.f16149i.finish();
                mo25971d(false);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f16149i.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f16148h.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f16147g = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @IgnoreJRERequirement
    /* renamed from: d */
    public final void mo25971d(boolean z) {
        C8061v r0;
        C8040e c = this.f16148h.mo25901c();
        while (true) {
            r0 = c.mo25927r0(1);
            Deflater deflater = this.f16149i;
            byte[] bArr = r0.f16183a;
            int i = r0.f16185c;
            int i2 = 8192 - i;
            int deflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (deflate > 0) {
                r0.f16185c += deflate;
                c.f16140h += (long) deflate;
                this.f16148h.mo25894Q();
            } else if (this.f16149i.needsInput()) {
                break;
            }
        }
        if (r0.f16184b == r0.f16185c) {
            c.f16139g = r0.mo25996a();
            C8062w.m14927a(r0);
        }
    }

    /* renamed from: f */
    public C8034b0 mo17028f() {
        return this.f16148h.mo17028f();
    }

    public void flush() {
        mo25971d(true);
        this.f16148h.flush();
    }

    /* renamed from: j */
    public void mo17030j(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "source");
        C5266a.m9848N(eVar.f16140h, 0, j);
        while (j > 0) {
            C8061v vVar = eVar.f16139g;
            C6888i.m12436c(vVar);
            int min = (int) Math.min(j, (long) (vVar.f16185c - vVar.f16184b));
            this.f16149i.setInput(vVar.f16183a, vVar.f16184b, min);
            mo25971d(false);
            long j2 = (long) min;
            eVar.f16140h -= j2;
            int i = vVar.f16184b + min;
            vVar.f16184b = i;
            if (i == vVar.f16185c) {
                eVar.f16139g = vVar.mo25996a();
                C8062w.m14927a(vVar);
            }
            j -= j2;
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("DeflaterSink(");
        u.append(this.f16148h);
        u.append(')');
        return u.toString();
    }
}
