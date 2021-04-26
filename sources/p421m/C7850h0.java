package p421m;

import java.io.Closeable;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p421m.C8022y;
import p421m.p422m0.p426g.C7883c;

/* renamed from: m.h0 */
public final class C7850h0 implements Closeable {

    /* renamed from: g */
    public final C7839e0 f15549g;

    /* renamed from: h */
    public final C7835d0 f15550h;

    /* renamed from: i */
    public final String f15551i;

    /* renamed from: j */
    public final int f15552j;

    /* renamed from: k */
    public final C8020x f15553k;

    /* renamed from: l */
    public final C8022y f15554l;

    /* renamed from: m */
    public final C7855j0 f15555m;

    /* renamed from: n */
    public final C7850h0 f15556n;

    /* renamed from: o */
    public final C7850h0 f15557o;

    /* renamed from: p */
    public final C7850h0 f15558p;

    /* renamed from: q */
    public final long f15559q;

    /* renamed from: r */
    public final long f15560r;

    /* renamed from: s */
    public final C7883c f15561s;

    /* renamed from: m.h0$a */
    public static class C7851a {

        /* renamed from: a */
        public C7839e0 f15562a;

        /* renamed from: b */
        public C7835d0 f15563b;

        /* renamed from: c */
        public int f15564c;

        /* renamed from: d */
        public String f15565d;

        /* renamed from: e */
        public C8020x f15566e;

        /* renamed from: f */
        public C8022y.C8023a f15567f;

        /* renamed from: g */
        public C7855j0 f15568g;

        /* renamed from: h */
        public C7850h0 f15569h;

        /* renamed from: i */
        public C7850h0 f15570i;

        /* renamed from: j */
        public C7850h0 f15571j;

        /* renamed from: k */
        public long f15572k;

        /* renamed from: l */
        public long f15573l;

        /* renamed from: m */
        public C7883c f15574m;

        public C7851a() {
            this.f15564c = -1;
            this.f15567f = new C8022y.C8023a();
        }

        public C7851a(C7850h0 h0Var) {
            C6888i.m12438e(h0Var, "response");
            this.f15564c = -1;
            this.f15562a = h0Var.f15549g;
            this.f15563b = h0Var.f15550h;
            this.f15564c = h0Var.f15552j;
            this.f15565d = h0Var.f15551i;
            this.f15566e = h0Var.f15553k;
            this.f15567f = h0Var.f15554l.mo25841n();
            this.f15568g = h0Var.f15555m;
            this.f15569h = h0Var.f15556n;
            this.f15570i = h0Var.f15557o;
            this.f15571j = h0Var.f15558p;
            this.f15572k = h0Var.f15559q;
            this.f15573l = h0Var.f15560r;
            this.f15574m = h0Var.f15561s;
        }

        /* renamed from: a */
        public C7850h0 mo25558a() {
            int i = this.f15564c;
            if (i >= 0) {
                C7839e0 e0Var = this.f15562a;
                if (e0Var != null) {
                    C7835d0 d0Var = this.f15563b;
                    if (d0Var != null) {
                        String str = this.f15565d;
                        if (str != null) {
                            return new C7850h0(e0Var, d0Var, str, i, this.f15566e, this.f15567f.mo25846b(), this.f15568g, this.f15569h, this.f15570i, this.f15571j, this.f15572k, this.f15573l, this.f15574m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder u = C0843a.m460u("code < 0: ");
            u.append(this.f15564c);
            throw new IllegalStateException(u.toString().toString());
        }

        /* renamed from: b */
        public C7851a mo25559b(C7850h0 h0Var) {
            mo25560c("cacheResponse", h0Var);
            this.f15570i = h0Var;
            return this;
        }

        /* renamed from: c */
        public final void mo25560c(String str, C7850h0 h0Var) {
            if (h0Var != null) {
                boolean z = true;
                if (h0Var.f15555m == null) {
                    if (h0Var.f15556n == null) {
                        if (h0Var.f15557o == null) {
                            if (h0Var.f15558p != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(C0843a.m451l(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(C0843a.m451l(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(C0843a.m451l(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(C0843a.m451l(str, ".body != null").toString());
            }
        }

        /* renamed from: d */
        public C7851a mo25561d(C8022y yVar) {
            C6888i.m12438e(yVar, "headers");
            this.f15567f = yVar.mo25841n();
            return this;
        }

        /* renamed from: e */
        public C7851a mo25562e(String str) {
            C6888i.m12438e(str, "message");
            this.f15565d = str;
            return this;
        }

        /* renamed from: f */
        public C7851a mo25563f(C7835d0 d0Var) {
            C6888i.m12438e(d0Var, "protocol");
            this.f15563b = d0Var;
            return this;
        }

        /* renamed from: g */
        public C7851a mo25564g(C7839e0 e0Var) {
            C6888i.m12438e(e0Var, "request");
            this.f15562a = e0Var;
            return this;
        }
    }

    public C7850h0(C7839e0 e0Var, C7835d0 d0Var, String str, int i, C8020x xVar, C8022y yVar, C7855j0 j0Var, C7850h0 h0Var, C7850h0 h0Var2, C7850h0 h0Var3, long j, long j2, C7883c cVar) {
        C6888i.m12438e(e0Var, "request");
        C6888i.m12438e(d0Var, "protocol");
        C6888i.m12438e(str, "message");
        C6888i.m12438e(yVar, "headers");
        this.f15549g = e0Var;
        this.f15550h = d0Var;
        this.f15551i = str;
        this.f15552j = i;
        this.f15553k = xVar;
        this.f15554l = yVar;
        this.f15555m = j0Var;
        this.f15556n = h0Var;
        this.f15557o = h0Var2;
        this.f15558p = h0Var3;
        this.f15559q = j;
        this.f15560r = j2;
        this.f15561s = cVar;
    }

    /* renamed from: d */
    public static String m14257d(C7850h0 h0Var, String str, String str2, int i) {
        int i2 = i & 2;
        Objects.requireNonNull(h0Var);
        C6888i.m12438e(str, "name");
        String e = h0Var.f15554l.mo25836e(str);
        if (e != null) {
            return e;
        }
        return null;
    }

    public void close() {
        C7855j0 j0Var = this.f15555m;
        if (j0Var != null) {
            j0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean isSuccessful() {
        int i = this.f15552j;
        return 200 <= i && 299 >= i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Response{protocol=");
        u.append(this.f15550h);
        u.append(", code=");
        u.append(this.f15552j);
        u.append(", message=");
        u.append(this.f15551i);
        u.append(", url=");
        u.append(this.f15549g.f15528b);
        u.append('}');
        return u.toString();
    }
}
