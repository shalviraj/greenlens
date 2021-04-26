package p005b.p040g.p041a.p047i.p048b;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.C0853d;
import p005b.p040g.p041a.p042e.C0856c;
import p005b.p040g.p041a.p042e.C0857d;
import p005b.p040g.p041a.p044f.C0869a;
import p005b.p040g.p041a.p047i.C0907a;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4465k;
import p005b.p280p.p285b.C5223d;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.C5252r;
import p005b.p280p.p285b.C5255t;

/* renamed from: b.g.a.i.b.c */
public abstract class C0910c<T, U extends C0851b> implements C0907a<T, U>, Object<T, U> {

    /* renamed from: a */
    public final Map<String, String> f813a;

    /* renamed from: b */
    public final C5245o f814b;

    /* renamed from: c */
    public final C5252r f815c;

    /* renamed from: d */
    public final C4332b0<T> f816d;

    /* renamed from: e */
    public final C0908a<U> f817e;

    /* renamed from: f */
    public final C4465k f818f;

    /* renamed from: g */
    public final C0857d f819g;

    /* renamed from: h */
    public C0869a<T, U> f820h = null;

    public C0910c(C5245o oVar, C5252r rVar, C4465k kVar, C4332b0<T> b0Var, C0908a<U> aVar) {
        HashMap hashMap = new HashMap();
        C0857d b = C0857d.m561b();
        this.f814b = oVar;
        this.f815c = rVar;
        this.f818f = kVar;
        this.f816d = b0Var;
        this.f813a = hashMap;
        this.f819g = b;
        this.f817e = aVar;
    }

    /* renamed from: a */
    public C0907a<T, U> mo10748a(Map<String, Object> map) {
        C0857d dVar = this.f819g;
        Objects.requireNonNull(dVar);
        if (map != null) {
            for (String next : map.keySet()) {
                if (map.get(next) != null) {
                    dVar.f719a.put(next, map.get(next));
                }
            }
        }
        return this;
    }

    /* renamed from: b */
    public abstract C5255t mo10749b();

    /* JADX WARNING: type inference failed for: r3v0, types: [b.g.a.i.b.c, b.p.b.e] */
    /* renamed from: c */
    public void mo10750c(C0869a<T, U> aVar) {
        this.f820h = aVar;
        try {
            new C5223d(this.f815c, mo10749b()).mo17131a(this);
        } catch (C0853d e) {
            Objects.requireNonNull(this.f817e);
            aVar.mo10713b(new C0856c("Error parsing the request body", (C0851b) e));
        }
    }
}
