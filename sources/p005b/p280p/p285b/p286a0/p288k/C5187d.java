package p005b.p280p.p285b.p286a0.p288k;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p285b.C5242n;
import p005b.p280p.p285b.C5252r;
import p005b.p280p.p285b.C5255t;
import p005b.p280p.p285b.C5260w;
import p005b.p280p.p285b.C5263x;
import p005b.p280p.p285b.p286a0.C5123b;
import p005b.p280p.p285b.p286a0.C5134i;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p435n.C8030a0;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8049l;
import p435n.C8064y;

/* renamed from: b.p.b.a0.k.d */
public final class C5187d implements C5203i {

    /* renamed from: a */
    public final C5211p f10136a;

    /* renamed from: b */
    public final C8043g f10137b;

    /* renamed from: c */
    public final C8042f f10138c;

    /* renamed from: d */
    public C5199g f10139d;

    /* renamed from: e */
    public int f10140e = 0;

    /* renamed from: b.p.b.a0.k.d$b */
    public abstract class C5189b implements C8030a0 {

        /* renamed from: g */
        public final C8049l f10141g;

        /* renamed from: h */
        public boolean f10142h;

        public C5189b(C5188a aVar) {
            this.f10141g = new C8049l(C5187d.this.f10137b.mo17035f());
        }

        /* renamed from: d */
        public final void mo17084d() {
            C5187d dVar = C5187d.this;
            if (dVar.f10140e == 5) {
                C5187d.m9594h(dVar, this.f10141g);
                C5187d dVar2 = C5187d.this;
                dVar2.f10140e = 6;
                C5211p pVar = dVar2.f10136a;
                if (pVar != null) {
                    pVar.mo17116h(dVar2);
                    return;
                }
                return;
            }
            StringBuilder u = C0843a.m460u("state: ");
            u.append(C5187d.this.f10140e);
            throw new IllegalStateException(u.toString());
        }

        /* renamed from: e */
        public final void mo17085e() {
            C5187d dVar = C5187d.this;
            if (dVar.f10140e != 6) {
                dVar.f10140e = 6;
                C5211p pVar = dVar.f10136a;
                if (pVar != null) {
                    pVar.mo17114f();
                    C5187d dVar2 = C5187d.this;
                    dVar2.f10136a.mo17116h(dVar2);
                }
            }
        }

        /* renamed from: f */
        public C8034b0 mo17035f() {
            return this.f10141g;
        }
    }

    /* renamed from: b.p.b.a0.k.d$c */
    public final class C5190c implements C8064y {

        /* renamed from: g */
        public final C8049l f10144g;

        /* renamed from: h */
        public boolean f10145h;

        public C5190c(C5188a aVar) {
            this.f10144g = new C8049l(C5187d.this.f10138c.mo17028f());
        }

        public synchronized void close() {
            if (!this.f10145h) {
                this.f10145h = true;
                C5187d.this.f10138c.mo25905e0("0\r\n\r\n");
                C5187d.m9594h(C5187d.this, this.f10144g);
                C5187d.this.f10140e = 3;
            }
        }

        /* renamed from: f */
        public C8034b0 mo17028f() {
            return this.f10144g;
        }

        public synchronized void flush() {
            if (!this.f10145h) {
                C5187d.this.f10138c.flush();
            }
        }

        /* renamed from: j */
        public void mo17030j(C8040e eVar, long j) {
            if (this.f10145h) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C5187d.this.f10138c.mo25920o(j);
                C5187d.this.f10138c.mo25905e0("\r\n");
                C5187d.this.f10138c.mo17030j(eVar, j);
                C5187d.this.f10138c.mo25905e0("\r\n");
            }
        }
    }

    /* renamed from: b.p.b.a0.k.d$d */
    public class C5191d extends C5189b {

        /* renamed from: j */
        public long f10147j = -1;

        /* renamed from: k */
        public boolean f10148k = true;

        /* renamed from: l */
        public final C5199g f10149l;

        public C5191d(C5199g gVar) {
            super((C5188a) null);
            this.f10149l = gVar;
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j));
            } else if (this.f10142h) {
                throw new IllegalStateException("closed");
            } else if (!this.f10148k) {
                return -1;
            } else {
                long j2 = this.f10147j;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        C5187d.this.f10137b.mo25944y();
                    }
                    try {
                        this.f10147j = C5187d.this.f10137b.mo25911i0();
                        String trim = C5187d.this.f10137b.mo25944y().trim();
                        if (this.f10147j < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f10147j + trim + "\"");
                        }
                        if (this.f10147j == 0) {
                            this.f10148k = false;
                            this.f10149l.mo17091f(C5187d.this.mo17081j());
                            mo17084d();
                        }
                        if (!this.f10148k) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long T = C5187d.this.f10137b.mo17031T(eVar, Math.min(j, this.f10147j));
                if (T != -1) {
                    this.f10147j -= T;
                    return T;
                }
                mo17085e();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f10142h) {
                if (this.f10148k && !C5134i.m9460e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo17085e();
                }
                this.f10142h = true;
            }
        }
    }

    /* renamed from: b.p.b.a0.k.d$e */
    public final class C5192e implements C8064y {

        /* renamed from: g */
        public final C8049l f10151g;

        /* renamed from: h */
        public boolean f10152h;

        /* renamed from: i */
        public long f10153i;

        public C5192e(long j, C5188a aVar) {
            this.f10151g = new C8049l(C5187d.this.f10138c.mo17028f());
            this.f10153i = j;
        }

        public void close() {
            if (!this.f10152h) {
                this.f10152h = true;
                if (this.f10153i <= 0) {
                    C5187d.m9594h(C5187d.this, this.f10151g);
                    C5187d.this.f10140e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        /* renamed from: f */
        public C8034b0 mo17028f() {
            return this.f10151g;
        }

        public void flush() {
            if (!this.f10152h) {
                C5187d.this.f10138c.flush();
            }
        }

        /* renamed from: j */
        public void mo17030j(C8040e eVar, long j) {
            if (!this.f10152h) {
                C5134i.m9456a(eVar.f16140h, 0, j);
                if (j <= this.f10153i) {
                    C5187d.this.f10138c.mo17030j(eVar, j);
                    this.f10153i -= j;
                    return;
                }
                StringBuilder u = C0843a.m460u("expected ");
                u.append(this.f10153i);
                u.append(" bytes but received ");
                u.append(j);
                throw new ProtocolException(u.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: b.p.b.a0.k.d$f */
    public class C5193f extends C5189b {

        /* renamed from: j */
        public long f10155j;

        public C5193f(long j) {
            super((C5188a) null);
            this.f10155j = j;
            if (j == 0) {
                mo17084d();
            }
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j));
            } else if (!this.f10142h) {
                long j2 = this.f10155j;
                if (j2 == 0) {
                    return -1;
                }
                long T = C5187d.this.f10137b.mo17031T(eVar, Math.min(j2, j));
                if (T != -1) {
                    long j3 = this.f10155j - T;
                    this.f10155j = j3;
                    if (j3 == 0) {
                        mo17084d();
                    }
                    return T;
                }
                mo17085e();
                throw new ProtocolException("unexpected end of stream");
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f10142h) {
                if (this.f10155j != 0 && !C5134i.m9460e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo17085e();
                }
                this.f10142h = true;
            }
        }
    }

    /* renamed from: b.p.b.a0.k.d$g */
    public class C5194g extends C5189b {

        /* renamed from: j */
        public boolean f10157j;

        public C5194g(C5188a aVar) {
            super((C5188a) null);
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j));
            } else if (this.f10142h) {
                throw new IllegalStateException("closed");
            } else if (this.f10157j) {
                return -1;
            } else {
                long T = C5187d.this.f10137b.mo17031T(eVar, j);
                if (T != -1) {
                    return T;
                }
                this.f10157j = true;
                mo17084d();
                return -1;
            }
        }

        public void close() {
            if (!this.f10142h) {
                if (!this.f10157j) {
                    mo17085e();
                }
                this.f10142h = true;
            }
        }
    }

    public C5187d(C5211p pVar, C8043g gVar, C8042f fVar) {
        this.f10136a = pVar;
        this.f10137b = gVar;
        this.f10138c = fVar;
    }

    /* renamed from: h */
    public static void m9594h(C5187d dVar, C8049l lVar) {
        Objects.requireNonNull(dVar);
        C8034b0 b0Var = lVar.f16152e;
        C8034b0 b0Var2 = C8034b0.f16129d;
        C6888i.m12438e(b0Var2, "delegate");
        lVar.f16152e = b0Var2;
        b0Var.mo25873a();
        b0Var.mo25874b();
    }

    /* renamed from: a */
    public void mo17073a() {
        this.f10138c.flush();
    }

    /* renamed from: b */
    public C8064y mo17074b(C5255t tVar, long j) {
        if ("chunked".equalsIgnoreCase(tVar.f10481c.mo17153a("Transfer-Encoding"))) {
            if (this.f10140e == 1) {
                this.f10140e = 2;
                return new C5190c((C5188a) null);
            }
            StringBuilder u = C0843a.m460u("state: ");
            u.append(this.f10140e);
            throw new IllegalStateException(u.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f10140e == 1) {
            this.f10140e = 2;
            return new C5192e(j, (C5188a) null);
        } else {
            StringBuilder u2 = C0843a.m460u("state: ");
            u2.append(this.f10140e);
            throw new IllegalStateException(u2.toString());
        }
    }

    /* renamed from: c */
    public void mo17075c(C5255t tVar) {
        this.f10139d.mo17097m();
        Proxy.Type type = this.f10139d.f10182b.mo17109a().f10236a.f10518b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(tVar.f10480b);
        sb.append(' ');
        if (!tVar.mo17191b() && type == Proxy.Type.HTTP) {
            sb.append(tVar.f10479a);
        } else {
            sb.append(C4805c3.m8819r(tVar.f10479a));
        }
        sb.append(" HTTP/1.1");
        mo17083l(tVar.f10481c, sb.toString());
    }

    /* renamed from: d */
    public void mo17076d(C5199g gVar) {
        this.f10139d = gVar;
    }

    /* renamed from: e */
    public void mo17077e(C5207l lVar) {
        if (this.f10140e == 1) {
            this.f10140e = 3;
            C8042f fVar = this.f10138c;
            C8040e eVar = new C8040e();
            C8040e eVar2 = lVar.f10213i;
            eVar2.mo25946z(eVar, 0, eVar2.f16140h);
            fVar.mo17030j(eVar, eVar.f16140h);
            return;
        }
        StringBuilder u = C0843a.m460u("state: ");
        u.append(this.f10140e);
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: f */
    public C5260w.C5262b mo17078f() {
        return mo17082k();
    }

    /* renamed from: g */
    public C5263x mo17079g(C5260w wVar) {
        C8030a0 a0Var;
        if (!C5199g.m9624b(wVar)) {
            a0Var = mo17080i(0);
        } else {
            String a = wVar.f10500f.mo17153a("Transfer-Encoding");
            if (a == null) {
                a = null;
            }
            if ("chunked".equalsIgnoreCase(a)) {
                C5199g gVar = this.f10139d;
                if (this.f10140e == 4) {
                    this.f10140e = 5;
                    a0Var = new C5191d(gVar);
                } else {
                    StringBuilder u = C0843a.m460u("state: ");
                    u.append(this.f10140e);
                    throw new IllegalStateException(u.toString());
                }
            } else {
                Comparator<String> comparator = C5204j.f10205a;
                long a2 = C5204j.m9650a(wVar.f10500f);
                if (a2 != -1) {
                    a0Var = mo17080i(a2);
                } else if (this.f10140e == 4) {
                    C5211p pVar = this.f10136a;
                    if (pVar != null) {
                        this.f10140e = 5;
                        pVar.mo17114f();
                        a0Var = new C5194g((C5188a) null);
                    } else {
                        throw new IllegalStateException("streamAllocation == null");
                    }
                } else {
                    StringBuilder u2 = C0843a.m460u("state: ");
                    u2.append(this.f10140e);
                    throw new IllegalStateException(u2.toString());
                }
            }
        }
        return new C5206k(wVar.f10500f, C5266a.m9812H(a0Var));
    }

    /* renamed from: i */
    public C8030a0 mo17080i(long j) {
        if (this.f10140e == 4) {
            this.f10140e = 5;
            return new C5193f(j);
        }
        StringBuilder u = C0843a.m460u("state: ");
        u.append(this.f10140e);
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: j */
    public C5242n mo17081j() {
        C5242n.C5244b bVar = new C5242n.C5244b();
        while (true) {
            String y = this.f10137b.mo25944y();
            if (y.length() == 0) {
                return bVar.mo17161c();
            }
            Objects.requireNonNull((C5252r.C5253a) C5123b.f9930b);
            int indexOf = y.indexOf(":", 1);
            if (indexOf != -1) {
                bVar.mo17160b(y.substring(0, indexOf), y.substring(indexOf + 1));
            } else {
                if (y.startsWith(":")) {
                    y = y.substring(1);
                }
                bVar.f10418a.add("");
                bVar.f10418a.add(y.trim());
            }
        }
    }

    /* renamed from: k */
    public C5260w.C5262b mo17082k() {
        C5210o a;
        C5260w.C5262b bVar;
        int i = this.f10140e;
        if (i == 1 || i == 3) {
            do {
                try {
                    a = C5210o.m9664a(this.f10137b.mo25944y());
                    bVar = new C5260w.C5262b();
                    bVar.f10507b = a.f10225a;
                    bVar.f10508c = a.f10226b;
                    bVar.f10509d = a.f10227c;
                    bVar.mo17206d(mo17081j());
                } catch (EOFException e) {
                    StringBuilder u = C0843a.m460u("unexpected end of stream on ");
                    u.append(this.f10136a);
                    IOException iOException = new IOException(u.toString());
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a.f10226b == 100);
            this.f10140e = 4;
            return bVar;
        }
        StringBuilder u2 = C0843a.m460u("state: ");
        u2.append(this.f10140e);
        throw new IllegalStateException(u2.toString());
    }

    /* renamed from: l */
    public void mo17083l(C5242n nVar, String str) {
        if (this.f10140e == 0) {
            this.f10138c.mo25905e0(str).mo25905e0("\r\n");
            int d = nVar.mo17156d();
            for (int i = 0; i < d; i++) {
                this.f10138c.mo25905e0(nVar.mo17154b(i)).mo25905e0(": ").mo25905e0(nVar.mo17157e(i)).mo25905e0("\r\n");
            }
            this.f10138c.mo25905e0("\r\n");
            this.f10140e = 1;
            return;
        }
        StringBuilder u = C0843a.m460u("state: ");
        u.append(this.f10140e);
        throw new IllegalStateException(u.toString());
    }
}
