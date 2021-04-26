package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.p325w.C6569a;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6621c;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6648l;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6607f;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6608g;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7106j;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7320f;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7382j;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7395r;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7342f;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7368j;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.b.d */
public final class C6536d {

    /* renamed from: b */
    public static final C6537a f12823b = new C6537a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final Set<C6569a.C6570a> f12824c = C5266a.m9891U3(C6569a.C6570a.CLASS);

    /* renamed from: d */
    public static final Set<C6569a.C6570a> f12825d = C6790h.m12327N(C6569a.C6570a.FILE_FACADE, C6569a.C6570a.MULTIFILE_CLASS_PART);

    /* renamed from: e */
    public static final C6607f f12826e = new C6607f(1, 1, 2);

    /* renamed from: f */
    public static final C6607f f12827f = new C6607f(1, 1, 11);

    /* renamed from: g */
    public static final C6607f f12828g = new C6607f(1, 1, 13);

    /* renamed from: a */
    public C7382j f12829a;

    /* renamed from: d.a.a.a.y0.d.b.d$a */
    public static final class C6537a {
        public C6537a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: d.a.a.a.y0.d.b.d$b */
    public static final class C6538b extends C6890k implements C6851a<Collection<? extends C6717d>> {

        /* renamed from: g */
        public static final C6538b f12830g = new C6538b();

        public C6538b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C6798p.f13713g;
        }
    }

    /* renamed from: a */
    public final C7277h mo23634a(C6032c0 c0Var, C6552l lVar) {
        String[] strArr;
        C6768j<C6608g, C6648l> jVar;
        C6888i.m12438e(c0Var, "descriptor");
        C6888i.m12438e(lVar, "kotlinClass");
        String[] g = mo23640g(lVar, f12825d);
        if (g == null || (strArr = lVar.mo23322a().f12875e) == null) {
            return null;
        }
        try {
            C6610h hVar = C6610h.f13014a;
            jVar = C6610h.m11807g(g, strArr);
        } catch (C7106j e) {
            throw new IllegalStateException(C6888i.m12444k("Could not read data from ", lVar.mo23325d()), e);
        } catch (Throwable th) {
            if (mo23636c().f14741c.mo24990e() || lVar.mo23322a().f12872b.mo23724c()) {
                throw th;
            }
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        C6648l lVar2 = (C6648l) jVar.f13682h;
        C6608g gVar = (C6608g) jVar.f13681g;
        return new C7368j(c0Var, lVar2, gVar, lVar.mo23322a().f12872b, new C6541g(lVar, lVar2, gVar, mo23637d(lVar), mo23638e(lVar), mo23635b(lVar)), mo23636c(), C6538b.f12830g);
    }

    /* renamed from: b */
    public final C7342f mo23635b(C6552l lVar) {
        C7342f fVar = C7342f.STABLE;
        if (mo23636c().f14741c.mo24987b()) {
            return fVar;
        }
        C6569a a = lVar.mo23322a();
        boolean z = true;
        if (a.mo23680b(a.f12877g, 64) && !a.mo23680b(a.f12877g, 32)) {
            return C7342f.FIR_UNSTABLE;
        }
        C6569a a2 = lVar.mo23322a();
        if (!a2.mo23680b(a2.f12877g, 16) || a2.mo23680b(a2.f12877g, 32)) {
            z = false;
        }
        return z ? C7342f.IR_UNSTABLE : fVar;
    }

    /* renamed from: c */
    public final C7382j mo23636c() {
        C7382j jVar = this.f12829a;
        if (jVar != null) {
            return jVar;
        }
        C6888i.m12446m("components");
        throw null;
    }

    /* renamed from: d */
    public final C7395r<C6607f> mo23637d(C6552l lVar) {
        if (mo23636c().f14741c.mo24990e() || lVar.mo23322a().f12872b.mo23724c()) {
            return null;
        }
        return new C7395r<>(lVar.mo23322a().f12872b, C6607f.f13005g, lVar.mo23325d(), lVar.mo23323b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23638e(p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l r6) {
        /*
            r5 = this;
            d.a.a.a.y0.j.b.j r0 = r5.mo23636c()
            d.a.a.a.y0.j.b.k r0 = r0.f14741c
            boolean r0 = r0.mo24992g()
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x0029
            d.a.a.a.y0.d.b.w.a r0 = r6.mo23322a()
            int r4 = r0.f12877g
            boolean r0 = r0.mo23680b(r4, r2)
            if (r0 != 0) goto L_0x0056
            d.a.a.a.y0.d.b.w.a r0 = r6.mo23322a()
            d.a.a.a.y0.e.a0.b.f r0 = r0.f12872b
            d.a.a.a.y0.e.a0.b.f r4 = f12826e
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r4)
            if (r0 != 0) goto L_0x0056
        L_0x0029:
            d.a.a.a.y0.j.b.j r0 = r5.mo23636c()
            d.a.a.a.y0.j.b.k r0 = r0.f14741c
            boolean r0 = r0.mo24988c()
            if (r0 != 0) goto L_0x0051
            d.a.a.a.y0.d.b.w.a r0 = r6.mo23322a()
            int r4 = r0.f12877g
            boolean r0 = r0.mo23680b(r4, r2)
            if (r0 == 0) goto L_0x0051
            d.a.a.a.y0.d.b.w.a r6 = r6.mo23322a()
            d.a.a.a.y0.e.a0.b.f r6 = r6.f12872b
            d.a.a.a.y0.e.a0.b.f r0 = f12827f
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r0)
            if (r6 == 0) goto L_0x0051
            r6 = r1
            goto L_0x0052
        L_0x0051:
            r6 = r3
        L_0x0052:
            if (r6 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = r3
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6536d.mo23638e(d.a.a.a.y0.d.b.l):boolean");
    }

    /* renamed from: f */
    public final C7320f mo23639f(C6552l lVar) {
        String[] strArr;
        C6768j<C6608g, C6621c> jVar;
        C6888i.m12438e(lVar, "kotlinClass");
        String[] g = mo23640g(lVar, f12824c);
        if (g == null || (strArr = lVar.mo23322a().f12875e) == null) {
            return null;
        }
        try {
            C6610h hVar = C6610h.f13014a;
            jVar = C6610h.m11806f(g, strArr);
        } catch (C7106j e) {
            throw new IllegalStateException(C6888i.m12444k("Could not read data from ", lVar.mo23325d()), e);
        } catch (Throwable th) {
            if (mo23636c().f14741c.mo24990e() || lVar.mo23322a().f12872b.mo23724c()) {
                throw th;
            }
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        return new C7320f((C6608g) jVar.f13681g, (C6621c) jVar.f13682h, lVar.mo23322a().f12872b, new C6559n(lVar, mo23637d(lVar), mo23638e(lVar), mo23635b(lVar)));
    }

    /* renamed from: g */
    public final String[] mo23640g(C6552l lVar, Set<? extends C6569a.C6570a> set) {
        C6569a a = lVar.mo23322a();
        String[] strArr = a.f12873c;
        if (strArr == null) {
            strArr = a.f12874d;
        }
        if (strArr != null && set.contains(a.f12871a)) {
            return strArr;
        }
        return null;
    }
}
