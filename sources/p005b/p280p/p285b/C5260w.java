package p005b.p280p.p285b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p285b.C5242n;
import p005b.p280p.p285b.p286a0.p288k.C5204j;

/* renamed from: b.p.b.w */
public final class C5260w {

    /* renamed from: a */
    public final C5255t f10495a;

    /* renamed from: b */
    public final C5254s f10496b;

    /* renamed from: c */
    public final int f10497c;

    /* renamed from: d */
    public final String f10498d;

    /* renamed from: e */
    public final C5241m f10499e;

    /* renamed from: f */
    public final C5242n f10500f;

    /* renamed from: g */
    public final C5263x f10501g;

    /* renamed from: h */
    public C5260w f10502h;

    /* renamed from: i */
    public C5260w f10503i;

    /* renamed from: j */
    public final C5260w f10504j;

    /* renamed from: k */
    public volatile C5220c f10505k;

    /* renamed from: b.p.b.w$b */
    public static class C5262b {

        /* renamed from: a */
        public C5255t f10506a;

        /* renamed from: b */
        public C5254s f10507b;

        /* renamed from: c */
        public int f10508c;

        /* renamed from: d */
        public String f10509d;

        /* renamed from: e */
        public C5241m f10510e;

        /* renamed from: f */
        public C5242n.C5244b f10511f;

        /* renamed from: g */
        public C5263x f10512g;

        /* renamed from: h */
        public C5260w f10513h;

        /* renamed from: i */
        public C5260w f10514i;

        /* renamed from: j */
        public C5260w f10515j;

        public C5262b() {
            this.f10508c = -1;
            this.f10511f = new C5242n.C5244b();
        }

        public C5262b(C5260w wVar, C5261a aVar) {
            this.f10508c = -1;
            this.f10506a = wVar.f10495a;
            this.f10507b = wVar.f10496b;
            this.f10508c = wVar.f10497c;
            this.f10509d = wVar.f10498d;
            this.f10510e = wVar.f10499e;
            this.f10511f = wVar.f10500f.mo17155c();
            this.f10512g = wVar.f10501g;
            this.f10513h = wVar.f10502h;
            this.f10514i = wVar.f10503i;
            this.f10515j = wVar.f10504j;
        }

        /* renamed from: a */
        public C5260w mo17203a() {
            if (this.f10506a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f10507b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f10508c >= 0) {
                return new C5260w(this, (C5261a) null);
            } else {
                StringBuilder u = C0843a.m460u("code < 0: ");
                u.append(this.f10508c);
                throw new IllegalStateException(u.toString());
            }
        }

        /* renamed from: b */
        public C5262b mo17204b(C5260w wVar) {
            if (wVar != null) {
                mo17205c("cacheResponse", wVar);
            }
            this.f10514i = wVar;
            return this;
        }

        /* renamed from: c */
        public final void mo17205c(String str, C5260w wVar) {
            if (wVar.f10501g != null) {
                throw new IllegalArgumentException(C0843a.m451l(str, ".body != null"));
            } else if (wVar.f10502h != null) {
                throw new IllegalArgumentException(C0843a.m451l(str, ".networkResponse != null"));
            } else if (wVar.f10503i != null) {
                throw new IllegalArgumentException(C0843a.m451l(str, ".cacheResponse != null"));
            } else if (wVar.f10504j != null) {
                throw new IllegalArgumentException(C0843a.m451l(str, ".priorResponse != null"));
            }
        }

        /* renamed from: d */
        public C5262b mo17206d(C5242n nVar) {
            this.f10511f = nVar.mo17155c();
            return this;
        }

        /* renamed from: e */
        public C5262b mo17207e(C5260w wVar) {
            if (wVar == null || wVar.f10501g == null) {
                this.f10515j = wVar;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }
    }

    public C5260w(C5262b bVar, C5261a aVar) {
        this.f10495a = bVar.f10506a;
        this.f10496b = bVar.f10507b;
        this.f10497c = bVar.f10508c;
        this.f10498d = bVar.f10509d;
        this.f10499e = bVar.f10510e;
        this.f10500f = bVar.f10511f.mo17161c();
        this.f10501g = bVar.f10512g;
        this.f10502h = bVar.f10513h;
        this.f10503i = bVar.f10514i;
        this.f10504j = bVar.f10515j;
    }

    /* renamed from: a */
    public C5220c mo17199a() {
        C5220c cVar = this.f10505k;
        if (cVar != null) {
            return cVar;
        }
        C5220c a = C5220c.m9687a(this.f10500f);
        this.f10505k = a;
        return a;
    }

    /* renamed from: b */
    public List<C5231g> mo17200b() {
        String str;
        int i = this.f10497c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        C5242n nVar = this.f10500f;
        Comparator<String> comparator = C5204j.f10205a;
        ArrayList arrayList = new ArrayList();
        int d = nVar.mo17156d();
        for (int i2 = 0; i2 < d; i2++) {
            if (str.equalsIgnoreCase(nVar.mo17154b(i2))) {
                String e = nVar.mo17157e(i2);
                int i3 = 0;
                while (i3 < e.length()) {
                    int t = C4805c3.m8821t(e, i3, " ");
                    String trim = e.substring(i3, t).trim();
                    int u = C4805c3.m8822u(e, t);
                    if (!e.regionMatches(true, u, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i4 = u + 7;
                    int t2 = C4805c3.m8821t(e, i4, "\"");
                    String substring = e.substring(i4, t2);
                    i3 = C4805c3.m8822u(e, C4805c3.m8821t(e, t2 + 1, ",") + 1);
                    arrayList.add(new C5231g(trim, substring));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public C5262b mo17201c() {
        return new C5262b(this, (C5261a) null);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Response{protocol=");
        u.append(this.f10496b);
        u.append(", code=");
        u.append(this.f10497c);
        u.append(", message=");
        u.append(this.f10498d);
        u.append(", url=");
        return C0843a.m454o(u, this.f10495a.f10479a.f10428i, '}');
    }
}
