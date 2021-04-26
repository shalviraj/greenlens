package p435n;

import java.nio.ByteBuffer;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.t */
public final class C8058t implements C8042f {

    /* renamed from: g */
    public final C8040e f16176g = new C8040e();

    /* renamed from: h */
    public boolean f16177h;

    /* renamed from: i */
    public final C8064y f16178i;

    public C8058t(C8064y yVar) {
        C6888i.m12438e(yVar, "sink");
        this.f16178i = yVar;
    }

    /* renamed from: E */
    public C8042f mo25887E(int i) {
        if (!this.f16177h) {
            this.f16176g.mo25940v0(i);
            mo25894Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: K */
    public C8042f mo25889K(byte[] bArr) {
        C6888i.m12438e(bArr, "source");
        if (!this.f16177h) {
            this.f16176g.mo25936t0(bArr);
            mo25894Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: M */
    public C8042f mo25890M(C8044h hVar) {
        C6888i.m12438e(hVar, "byteString");
        if (!this.f16177h) {
            this.f16176g.mo25933s0(hVar);
            mo25894Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: Q */
    public C8042f mo25894Q() {
        if (!this.f16177h) {
            long q = this.f16176g.mo25924q();
            if (q > 0) {
                this.f16178i.mo17030j(this.f16176g, q);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C8040e mo25900a() {
        return this.f16176g;
    }

    /* renamed from: c */
    public C8040e mo25901c() {
        return this.f16176g;
    }

    public void close() {
        if (!this.f16177h) {
            Throwable th = null;
            try {
                C8040e eVar = this.f16176g;
                long j = eVar.f16140h;
                if (j > 0) {
                    this.f16178i.mo17030j(eVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f16178i.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f16177h = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: e0 */
    public C8042f mo25905e0(String str) {
        C6888i.m12438e(str, "string");
        if (!this.f16177h) {
            this.f16176g.mo25947z0(str);
            return mo25894Q();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: f */
    public C8034b0 mo17028f() {
        return this.f16178i.mo17028f();
    }

    public void flush() {
        if (!this.f16177h) {
            C8040e eVar = this.f16176g;
            long j = eVar.f16140h;
            if (j > 0) {
                this.f16178i.mo17030j(eVar, j);
            }
            this.f16178i.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: h */
    public C8042f mo25908h(byte[] bArr, int i, int i2) {
        C6888i.m12438e(bArr, "source");
        if (!this.f16177h) {
            this.f16176g.mo25938u0(bArr, i, i2);
            mo25894Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f16177h;
    }

    /* renamed from: j */
    public void mo17030j(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "source");
        if (!this.f16177h) {
            this.f16176g.mo17030j(eVar, j);
            mo25894Q();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: m */
    public C8042f mo25916m(String str, int i, int i2) {
        C6888i.m12438e(str, "string");
        if (!this.f16177h) {
            this.f16176g.mo25883A0(str, i, i2);
            mo25894Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: n */
    public long mo25918n(C8030a0 a0Var) {
        C6888i.m12438e(a0Var, "source");
        long j = 0;
        while (true) {
            long T = a0Var.mo17031T(this.f16176g, (long) 8192);
            if (T == -1) {
                return j;
            }
            j += T;
            mo25894Q();
        }
    }

    /* renamed from: o */
    public C8042f mo25920o(long j) {
        if (!this.f16177h) {
            this.f16176g.mo25920o(j);
            return mo25894Q();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: r */
    public C8042f mo25926r(int i) {
        if (!this.f16177h) {
            this.f16176g.mo25945y0(i);
            mo25894Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("buffer(");
        u.append(this.f16178i);
        u.append(')');
        return u.toString();
    }

    /* renamed from: v */
    public C8042f mo25939v(int i) {
        if (!this.f16177h) {
            this.f16176g.mo25943x0(i);
            mo25894Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        C6888i.m12438e(byteBuffer, "source");
        if (!this.f16177h) {
            int write = this.f16176g.write(byteBuffer);
            mo25894Q();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
