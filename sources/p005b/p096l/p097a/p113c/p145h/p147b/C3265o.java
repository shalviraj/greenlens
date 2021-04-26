package p005b.p096l.p097a.p113c.p145h.p147b;

import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.o */
public final class C3265o {

    /* renamed from: a */
    public final String f5782a;

    /* renamed from: b */
    public final String f5783b;

    /* renamed from: c */
    public final long f5784c;

    /* renamed from: d */
    public final long f5785d;

    /* renamed from: e */
    public final long f5786e;

    /* renamed from: f */
    public final long f5787f;

    /* renamed from: g */
    public final long f5788g;

    /* renamed from: h */
    public final Long f5789h;

    /* renamed from: i */
    public final Long f5790i;

    /* renamed from: j */
    public final Long f5791j;

    /* renamed from: k */
    public final Boolean f5792k;

    public C3265o(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C0823f.m376j(str);
        C0823f.m376j(str2);
        boolean z = true;
        C0823f.m360b(j6 >= 0);
        C0823f.m360b(j7 >= 0);
        C0823f.m360b(j8 >= 0);
        C0823f.m360b(j9 < 0 ? false : z);
        this.f5782a = str;
        this.f5783b = str2;
        this.f5784c = j6;
        this.f5785d = j7;
        this.f5786e = j8;
        this.f5787f = j4;
        this.f5788g = j9;
        this.f5789h = l;
        this.f5790i = l2;
        this.f5791j = l3;
        this.f5792k = bool;
    }

    /* renamed from: a */
    public final C3265o mo14437a(long j) {
        return new C3265o(this.f5782a, this.f5783b, this.f5784c, this.f5785d, this.f5786e, j, this.f5788g, this.f5789h, this.f5790i, this.f5791j, this.f5792k);
    }

    /* renamed from: b */
    public final C3265o mo14438b(long j, long j2) {
        return new C3265o(this.f5782a, this.f5783b, this.f5784c, this.f5785d, this.f5786e, this.f5787f, j, Long.valueOf(j2), this.f5790i, this.f5791j, this.f5792k);
    }

    /* renamed from: c */
    public final C3265o mo14439c(Long l, Long l2, Boolean bool) {
        return new C3265o(this.f5782a, this.f5783b, this.f5784c, this.f5785d, this.f5786e, this.f5787f, this.f5788g, this.f5789h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
