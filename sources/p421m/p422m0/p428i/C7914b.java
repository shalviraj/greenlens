package p421m.p422m0.p428i;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7850h0;
import p421m.C8010q;
import p421m.C8022y;
import p421m.C8025z;
import p421m.p422m0.C7867c;
import p421m.p422m0.p426g.C7894i;
import p421m.p422m0.p427h.C7906d;
import p421m.p422m0.p427h.C7907e;
import p421m.p422m0.p427h.C7912j;
import p435n.C8030a0;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8049l;
import p435n.C8064y;

/* renamed from: m.m0.i.b */
public final class C7914b implements C7906d {

    /* renamed from: a */
    public int f15777a;

    /* renamed from: b */
    public final C7913a f15778b;

    /* renamed from: c */
    public C8022y f15779c;

    /* renamed from: d */
    public final C7831c0 f15780d;

    /* renamed from: e */
    public final C7894i f15781e;

    /* renamed from: f */
    public final C8043g f15782f;

    /* renamed from: g */
    public final C8042f f15783g;

    /* renamed from: m.m0.i.b$a */
    public abstract class C7915a implements C8030a0 {

        /* renamed from: g */
        public final C8049l f15784g;

        /* renamed from: h */
        public boolean f15785h;

        public C7915a() {
            this.f15784g = new C8049l(C7914b.this.f15782f.mo17035f());
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "sink");
            try {
                return C7914b.this.f15782f.mo17031T(eVar, j);
            } catch (IOException e) {
                C7914b.this.f15781e.mo25642l();
                mo25672d();
                throw e;
            }
        }

        /* renamed from: d */
        public final void mo25672d() {
            C7914b bVar = C7914b.this;
            int i = bVar.f15777a;
            if (i != 6) {
                if (i == 5) {
                    C7914b.m14410i(bVar, this.f15784g);
                    C7914b.this.f15777a = 6;
                    return;
                }
                StringBuilder u = C0843a.m460u("state: ");
                u.append(C7914b.this.f15777a);
                throw new IllegalStateException(u.toString());
            }
        }

        /* renamed from: f */
        public C8034b0 mo17035f() {
            return this.f15784g;
        }
    }

    /* renamed from: m.m0.i.b$b */
    public final class C7916b implements C8064y {

        /* renamed from: g */
        public final C8049l f15787g;

        /* renamed from: h */
        public boolean f15788h;

        public C7916b() {
            this.f15787g = new C8049l(C7914b.this.f15783g.mo17028f());
        }

        public synchronized void close() {
            if (!this.f15788h) {
                this.f15788h = true;
                C7914b.this.f15783g.mo25905e0("0\r\n\r\n");
                C7914b.m14410i(C7914b.this, this.f15787g);
                C7914b.this.f15777a = 3;
            }
        }

        /* renamed from: f */
        public C8034b0 mo17028f() {
            return this.f15787g;
        }

        public synchronized void flush() {
            if (!this.f15788h) {
                C7914b.this.f15783g.flush();
            }
        }

        /* renamed from: j */
        public void mo17030j(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "source");
            if (!(!this.f15788h)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C7914b.this.f15783g.mo25920o(j);
                C7914b.this.f15783g.mo25905e0("\r\n");
                C7914b.this.f15783g.mo17030j(eVar, j);
                C7914b.this.f15783g.mo25905e0("\r\n");
            }
        }
    }

    /* renamed from: m.m0.i.b$c */
    public final class C7917c extends C7915a {

        /* renamed from: j */
        public long f15790j = -1;

        /* renamed from: k */
        public boolean f15791k = true;

        /* renamed from: l */
        public final C8025z f15792l;

        /* renamed from: m */
        public final /* synthetic */ C7914b f15793m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7917c(C7914b bVar, C8025z zVar) {
            super();
            C6888i.m12438e(zVar, "url");
            this.f15793m = bVar;
            this.f15792l = zVar;
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j).toString());
            } else if (!(!this.f15785h)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f15791k) {
                return -1;
            } else {
                long j2 = this.f15790j;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        this.f15793m.f15782f.mo25944y();
                    }
                    try {
                        this.f15790j = this.f15793m.f15782f.mo25911i0();
                        String y = this.f15793m.f15782f.mo25944y();
                        if (y != null) {
                            String obj = C7694h.m13921L(y).toString();
                            if (this.f15790j >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || C7694h.m13910A(obj, ";", false, 2)) {
                                    if (this.f15790j == 0) {
                                        this.f15791k = false;
                                        C7914b bVar = this.f15793m;
                                        bVar.f15779c = bVar.f15778b.mo25668a();
                                        C7831c0 c0Var = this.f15793m.f15780d;
                                        C6888i.m12436c(c0Var);
                                        C8010q qVar = c0Var.f15469p;
                                        C8025z zVar = this.f15792l;
                                        C8022y yVar = this.f15793m.f15779c;
                                        C6888i.m12436c(yVar);
                                        C7907e.m14394d(qVar, zVar, yVar);
                                        mo25672d();
                                    }
                                    if (!this.f15791k) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f15790j + obj + '\"');
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long T = super.mo17031T(eVar, Math.min(j, this.f15790j));
                if (T != -1) {
                    this.f15790j -= T;
                    return T;
                }
                this.f15793m.f15781e.mo25642l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo25672d();
                throw protocolException;
            }
        }

        public void close() {
            if (!this.f15785h) {
                if (this.f15791k && !C7867c.m14287h(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f15793m.f15781e.mo25642l();
                    mo25672d();
                }
                this.f15785h = true;
            }
        }
    }

    /* renamed from: m.m0.i.b$d */
    public final class C7918d extends C7915a {

        /* renamed from: j */
        public long f15794j;

        public C7918d(long j) {
            super();
            this.f15794j = j;
            if (j == 0) {
                mo25672d();
            }
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j).toString());
            } else if (!this.f15785h) {
                long j2 = this.f15794j;
                if (j2 == 0) {
                    return -1;
                }
                long T = super.mo17031T(eVar, Math.min(j2, j));
                if (T != -1) {
                    long j3 = this.f15794j - T;
                    this.f15794j = j3;
                    if (j3 == 0) {
                        mo25672d();
                    }
                    return T;
                }
                C7914b.this.f15781e.mo25642l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo25672d();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f15785h) {
                if (this.f15794j != 0 && !C7867c.m14287h(this, 100, TimeUnit.MILLISECONDS)) {
                    C7914b.this.f15781e.mo25642l();
                    mo25672d();
                }
                this.f15785h = true;
            }
        }
    }

    /* renamed from: m.m0.i.b$e */
    public final class C7919e implements C8064y {

        /* renamed from: g */
        public final C8049l f15796g;

        /* renamed from: h */
        public boolean f15797h;

        public C7919e() {
            this.f15796g = new C8049l(C7914b.this.f15783g.mo17028f());
        }

        public void close() {
            if (!this.f15797h) {
                this.f15797h = true;
                C7914b.m14410i(C7914b.this, this.f15796g);
                C7914b.this.f15777a = 3;
            }
        }

        /* renamed from: f */
        public C8034b0 mo17028f() {
            return this.f15796g;
        }

        public void flush() {
            if (!this.f15797h) {
                C7914b.this.f15783g.flush();
            }
        }

        /* renamed from: j */
        public void mo17030j(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "source");
            if (!this.f15797h) {
                C7867c.m14282c(eVar.f16140h, 0, j);
                C7914b.this.f15783g.mo17030j(eVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: m.m0.i.b$f */
    public final class C7920f extends C7915a {

        /* renamed from: j */
        public boolean f15799j;

        public C7920f(C7914b bVar) {
            super();
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j).toString());
            } else if (!(!this.f15785h)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f15799j) {
                return -1;
            } else {
                long T = super.mo17031T(eVar, j);
                if (T != -1) {
                    return T;
                }
                this.f15799j = true;
                mo25672d();
                return -1;
            }
        }

        public void close() {
            if (!this.f15785h) {
                if (!this.f15799j) {
                    mo25672d();
                }
                this.f15785h = true;
            }
        }
    }

    public C7914b(C7831c0 c0Var, C7894i iVar, C8043g gVar, C8042f fVar) {
        C6888i.m12438e(iVar, "connection");
        C6888i.m12438e(gVar, "source");
        C6888i.m12438e(fVar, "sink");
        this.f15780d = c0Var;
        this.f15781e = iVar;
        this.f15782f = gVar;
        this.f15783g = fVar;
        this.f15778b = new C7913a(gVar);
    }

    /* renamed from: i */
    public static final void m14410i(C7914b bVar, C8049l lVar) {
        Objects.requireNonNull(bVar);
        C8034b0 b0Var = lVar.f16152e;
        C8034b0 b0Var2 = C8034b0.f16129d;
        C6888i.m12438e(b0Var2, "delegate");
        lVar.f16152e = b0Var2;
        b0Var.mo25873a();
        b0Var.mo25874b();
    }

    /* renamed from: a */
    public void mo25653a() {
        this.f15783g.flush();
    }

    /* renamed from: b */
    public void mo25654b(C7839e0 e0Var) {
        C6888i.m12438e(e0Var, "request");
        Proxy.Type type = this.f15781e.f15729q.f15605b.type();
        C6888i.m12437d(type, "connection.route().proxy.type()");
        C6888i.m12438e(e0Var, "request");
        C6888i.m12438e(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(e0Var.f15529c);
        sb.append(' ');
        C8025z zVar = e0Var.f15528b;
        if (!zVar.f16102a && type == Proxy.Type.HTTP) {
            sb.append(zVar);
        } else {
            C6888i.m12438e(zVar, "url");
            String b = zVar.mo25852b();
            String d = zVar.mo25854d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        mo25671k(e0Var.f15530d, sb2);
    }

    /* renamed from: c */
    public void mo25655c() {
        this.f15783g.flush();
    }

    public void cancel() {
        Socket socket = this.f15781e.f15714b;
        if (socket != null) {
            C7867c.m14284e(socket);
        }
    }

    /* renamed from: d */
    public long mo25657d(C7850h0 h0Var) {
        C6888i.m12438e(h0Var, "response");
        if (!C7907e.m14391a(h0Var)) {
            return 0;
        }
        if (C7694h.m13928f("chunked", C7850h0.m14257d(h0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return -1;
        }
        return C7867c.m14290k(h0Var);
    }

    /* renamed from: e */
    public C8030a0 mo25658e(C7850h0 h0Var) {
        C6888i.m12438e(h0Var, "response");
        if (!C7907e.m14391a(h0Var)) {
            return mo25670j(0);
        }
        boolean z = true;
        if (C7694h.m13928f("chunked", C7850h0.m14257d(h0Var, "Transfer-Encoding", (String) null, 2), true)) {
            C8025z zVar = h0Var.f15549g.f15528b;
            if (this.f15777a != 4) {
                z = false;
            }
            if (z) {
                this.f15777a = 5;
                return new C7917c(this, zVar);
            }
            StringBuilder u = C0843a.m460u("state: ");
            u.append(this.f15777a);
            throw new IllegalStateException(u.toString().toString());
        }
        long k = C7867c.m14290k(h0Var);
        if (k != -1) {
            return mo25670j(k);
        }
        if (this.f15777a != 4) {
            z = false;
        }
        if (z) {
            this.f15777a = 5;
            this.f15781e.mo25642l();
            return new C7920f(this);
        }
        StringBuilder u2 = C0843a.m460u("state: ");
        u2.append(this.f15777a);
        throw new IllegalStateException(u2.toString().toString());
    }

    /* renamed from: f */
    public C8064y mo25659f(C7839e0 e0Var, long j) {
        C6888i.m12438e(e0Var, "request");
        boolean z = true;
        if (C7694h.m13928f("chunked", e0Var.mo25533b("Transfer-Encoding"), true)) {
            if (this.f15777a != 1) {
                z = false;
            }
            if (z) {
                this.f15777a = 2;
                return new C7916b();
            }
            StringBuilder u = C0843a.m460u("state: ");
            u.append(this.f15777a);
            throw new IllegalStateException(u.toString().toString());
        } else if (j != -1) {
            if (this.f15777a != 1) {
                z = false;
            }
            if (z) {
                this.f15777a = 2;
                return new C7919e();
            }
            StringBuilder u2 = C0843a.m460u("state: ");
            u2.append(this.f15777a);
            throw new IllegalStateException(u2.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: g */
    public C7850h0.C7851a mo25660g(boolean z) {
        int i = this.f15777a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C7912j a = C7912j.m14407a(this.f15778b.mo25669b());
                C7850h0.C7851a aVar = new C7850h0.C7851a();
                aVar.mo25563f(a.f15772a);
                aVar.f15564c = a.f15773b;
                aVar.mo25562e(a.f15774c);
                aVar.mo25561d(this.f15778b.mo25668a());
                if (z && a.f15773b == 100) {
                    return null;
                }
                if (a.f15773b == 100) {
                    this.f15777a = 3;
                    return aVar;
                }
                this.f15777a = 4;
                return aVar;
            } catch (EOFException e) {
                throw new IOException(C0843a.m451l("unexpected end of stream on ", this.f15781e.f15729q.f15604a.f15435a.mo25857f()), e);
            }
        } else {
            StringBuilder u = C0843a.m460u("state: ");
            u.append(this.f15777a);
            throw new IllegalStateException(u.toString().toString());
        }
    }

    /* renamed from: h */
    public C7894i mo25661h() {
        return this.f15781e;
    }

    /* renamed from: j */
    public final C8030a0 mo25670j(long j) {
        if (this.f15777a == 4) {
            this.f15777a = 5;
            return new C7918d(j);
        }
        StringBuilder u = C0843a.m460u("state: ");
        u.append(this.f15777a);
        throw new IllegalStateException(u.toString().toString());
    }

    /* renamed from: k */
    public final void mo25671k(C8022y yVar, String str) {
        C6888i.m12438e(yVar, "headers");
        C6888i.m12438e(str, "requestLine");
        if (this.f15777a == 0) {
            this.f15783g.mo25905e0(str).mo25905e0("\r\n");
            int size = yVar.size();
            for (int i = 0; i < size; i++) {
                this.f15783g.mo25905e0(yVar.mo25840l(i)).mo25905e0(": ").mo25905e0(yVar.mo25842q(i)).mo25905e0("\r\n");
            }
            this.f15783g.mo25905e0("\r\n");
            this.f15777a = 1;
            return;
        }
        StringBuilder u = C0843a.m460u("state: ");
        u.append(this.f15777a);
        throw new IllegalStateException(u.toString().toString());
    }
}
