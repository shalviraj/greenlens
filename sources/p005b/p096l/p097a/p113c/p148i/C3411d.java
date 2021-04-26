package p005b.p096l.p097a.p113c.p148i;

import androidx.core.app.NotificationCompat;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p148i.p149b.C3398a;

/* renamed from: b.l.a.c.i.d */
public final class C3411d {

    /* renamed from: a */
    public static final C1770a.C1780g<C3398a> f6178a;

    /* renamed from: b */
    public static final C1770a.C1780g<C3398a> f6179b;

    /* renamed from: c */
    public static final C1770a.C1771a<C3398a, C3397a> f6180c;

    /* renamed from: d */
    public static final C1770a.C1771a<C3398a, Object> f6181d;

    /* renamed from: e */
    public static final C1770a<C3397a> f6182e;

    static {
        C1770a.C1780g<C3398a> gVar = new C1770a.C1780g<>();
        f6178a = gVar;
        C1770a.C1780g<C3398a> gVar2 = new C1770a.C1780g<>();
        f6179b = gVar2;
        C3410c cVar = new C3410c();
        f6180c = cVar;
        C3413f fVar = new C3413f();
        f6181d = fVar;
        C0823f.m374i("profile", "scopeUri must not be null or empty");
        C0823f.m374i(NotificationCompat.CATEGORY_EMAIL, "scopeUri must not be null or empty");
        f6182e = new C1770a<>("SignIn.API", cVar, gVar);
        C0823f.m380l(fVar, "Cannot construct an Api with a null ClientBuilder");
        C0823f.m380l(gVar2, "Cannot construct an Api with a null ClientKey");
    }
}
