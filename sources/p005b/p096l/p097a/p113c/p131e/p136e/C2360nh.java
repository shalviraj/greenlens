package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1851p;
import p005b.p096l.p180d.p185o.C3854a;
import p005b.p096l.p180d.p185o.p189e0.C3900y;

/* renamed from: b.l.a.c.e.e.nh */
public final class C2360nh extends C2091cj<Void, C3900y> {
    @NonNull

    /* renamed from: p */
    public final C2235id f4096p;

    /* renamed from: q */
    public final String f4097q;

    public C2360nh(String str, C3854a aVar, @Nullable String str2, String str3) {
        super(4);
        C0823f.m374i(str, "email cannot be null or empty");
        this.f4096p = new C2235id(str, aVar, str2);
        this.f4097q = str3;
    }

    /* renamed from: a */
    public final String mo12391a() {
        return this.f4097q;
    }

    /* renamed from: b */
    public final C1851p<C2040ai, Void> mo12392b() {
        C1851p.C1852a a = C1851p.m2499a();
        a.f3274a = new C2312lh(this);
        return a.mo12158a();
    }

    /* renamed from: c */
    public final void mo12393c() {
        mo12472h(null);
    }
}
