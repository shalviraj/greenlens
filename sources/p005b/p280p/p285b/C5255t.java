package p005b.p280p.p285b;

import java.io.IOException;
import java.net.URI;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p285b.C5242n;

/* renamed from: b.p.b.t */
public final class C5255t {

    /* renamed from: a */
    public final C5245o f10479a;

    /* renamed from: b */
    public final String f10480b;

    /* renamed from: c */
    public final C5242n f10481c;

    /* renamed from: d */
    public final C5259v f10482d;

    /* renamed from: e */
    public final Object f10483e;

    /* renamed from: f */
    public volatile URI f10484f;

    /* renamed from: g */
    public volatile C5220c f10485g;

    /* renamed from: b.p.b.t$b */
    public static class C5257b {

        /* renamed from: a */
        public C5245o f10486a;

        /* renamed from: b */
        public String f10487b;

        /* renamed from: c */
        public C5242n.C5244b f10488c;

        /* renamed from: d */
        public C5259v f10489d;

        /* renamed from: e */
        public Object f10490e;

        public C5257b() {
            this.f10487b = "GET";
            this.f10488c = new C5242n.C5244b();
        }

        public C5257b(C5255t tVar, C5256a aVar) {
            this.f10486a = tVar.f10479a;
            this.f10487b = tVar.f10480b;
            this.f10489d = tVar.f10482d;
            this.f10490e = tVar.f10483e;
            this.f10488c = tVar.f10481c.mo17155c();
        }

        /* renamed from: a */
        public C5255t mo17195a() {
            if (this.f10486a != null) {
                return new C5255t(this, (C5256a) null);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public C5257b mo17196b(String str, String str2) {
            C5242n.C5244b bVar = this.f10488c;
            bVar.mo17162d(str, str2);
            bVar.mo17163e(str);
            bVar.f10418a.add(str);
            bVar.f10418a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C5257b mo17197c(String str, C5259v vVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (vVar != null && !C4805c3.m8816o(str)) {
                throw new IllegalArgumentException(C0843a.m452m("method ", str, " must not have a request body."));
            } else if (vVar != null || !C4805c3.m8820s(str)) {
                this.f10487b = str;
                this.f10489d = vVar;
                return this;
            } else {
                throw new IllegalArgumentException(C0843a.m452m("method ", str, " must have a request body."));
            }
        }

        /* renamed from: d */
        public C5257b mo17198d(C5245o oVar) {
            if (oVar != null) {
                this.f10486a = oVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    public C5255t(C5257b bVar, C5256a aVar) {
        this.f10479a = bVar.f10486a;
        this.f10480b = bVar.f10487b;
        this.f10481c = bVar.f10488c.mo17161c();
        this.f10482d = bVar.f10489d;
        Object obj = bVar.f10490e;
        this.f10483e = obj == null ? this : obj;
    }

    /* renamed from: a */
    public C5220c mo17190a() {
        C5220c cVar = this.f10485g;
        if (cVar != null) {
            return cVar;
        }
        C5220c a = C5220c.m9687a(this.f10481c);
        this.f10485g = a;
        return a;
    }

    /* renamed from: b */
    public boolean mo17191b() {
        return this.f10479a.f10420a.equals("https");
    }

    /* renamed from: c */
    public C5257b mo17192c() {
        return new C5257b(this, (C5256a) null);
    }

    /* renamed from: d */
    public URI mo17193d() {
        try {
            URI uri = this.f10484f;
            if (uri != null) {
                return uri;
            }
            URI r = this.f10479a.mo17173r();
            this.f10484f = r;
            return r;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Request{method=");
        u.append(this.f10480b);
        u.append(", url=");
        u.append(this.f10479a);
        u.append(", tag=");
        Object obj = this.f10483e;
        if (obj == this) {
            obj = null;
        }
        u.append(obj);
        u.append('}');
        return u.toString();
    }
}
