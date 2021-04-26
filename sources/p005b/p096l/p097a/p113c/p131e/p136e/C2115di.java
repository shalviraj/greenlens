package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3854a;
import p005b.p096l.p180d.p185o.C3861d;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.di */
public final class C2115di extends C2361ni {

    /* renamed from: c */
    public static final C1955a f3729c = new C1955a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a */
    public final C2263jg f3730a;

    /* renamed from: b */
    public final C2362nj f3731b;

    public C2115di(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        C2601xi xiVar = new C2601xi(C2601xi.m4403b());
        C0823f.m376j(str);
        this.f3730a = new C2263jg(new C2625yi(context, str, xiVar));
        this.f3731b = new C2362nj(context);
    }

    /* renamed from: k */
    public static boolean m3218k(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        C1955a aVar = f3729c;
        Log.w(aVar.f3501a, aVar.mo12284c("App hash will not be appended to the request.", new Object[0]));
        return false;
    }

    /* renamed from: D0 */
    public final void mo12527D0(C2428qd qdVar, C2313li liVar) {
        Objects.requireNonNull(qdVar, "null reference");
        Objects.requireNonNull(qdVar.f4231g, "null reference");
        Objects.requireNonNull(liVar, "null reference");
        C2263jg jgVar = this.f3730a;
        C2364nl nlVar = qdVar.f4231g;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        Objects.requireNonNull(nlVar, "null reference");
        nlVar.f4122u = true;
        jgVar.f3964a.mo12595c((Context) null, nlVar, new C2088cg(jgVar, zhVar));
    }

    /* renamed from: M */
    public final void mo12528M(C2620yd ydVar, C2313li liVar) {
        Objects.requireNonNull(liVar, "null reference");
        Objects.requireNonNull(ydVar, "null reference");
        C3938x xVar = ydVar.f4485g;
        Objects.requireNonNull(xVar, "null reference");
        C2263jg jgVar = this.f3730a;
        C2580wl a1 = C1960d.m2775a1(xVar);
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        jgVar.f3964a.mo12604l((Context) null, a1, new C2162ff(jgVar, zhVar));
    }

    /* renamed from: S */
    public final void mo12529S(C2572wd wdVar, C2313li liVar) {
        Objects.requireNonNull(wdVar, "null reference");
        Objects.requireNonNull(wdVar.f4398g, "null reference");
        Objects.requireNonNull(liVar, "null reference");
        C2263jg jgVar = this.f3730a;
        C3861d dVar = wdVar.f4398g;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        Objects.requireNonNull(dVar, "null reference");
        if (dVar.f7111k) {
            jgVar.mo12747e(dVar.f7110j, new C2525ue(jgVar, dVar, zhVar));
            return;
        }
        jgVar.f3964a.mo12607o(new C2578wj(dVar, (String) null), new C2549ve(jgVar, zhVar));
    }

    /* renamed from: Z */
    public final void mo12530Z(@NonNull C2235id idVar, C2313li liVar) {
        Objects.requireNonNull(idVar, "null reference");
        C0823f.m376j(idVar.f3934g);
        Objects.requireNonNull(liVar, "null reference");
        C2263jg jgVar = this.f3730a;
        String str = idVar.f3934g;
        C3854a aVar = idVar.f3935h;
        String str2 = idVar.f3936i;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        C0823f.m376j(str);
        C2291kk kkVar = new C2291kk(aVar.f7095o);
        C0823f.m376j(str);
        kkVar.f4023h = str;
        kkVar.f4026k = aVar;
        kkVar.f4027l = str2;
        jgVar.f3964a.mo12602j(kkVar, new C2037af(zhVar));
    }

    /* renamed from: e1 */
    public final void mo12531e1(C2523uc ucVar, C2313li liVar) {
        Objects.requireNonNull(ucVar, "null reference");
        Objects.requireNonNull(liVar, "null reference");
        C0823f.m376j(ucVar.f4344g);
        C2263jg jgVar = this.f3730a;
        String str = ucVar.f4344g;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        C0823f.m376j(str);
        jgVar.f3964a.mo12593a(new C2092ck(str), new C2087cf(zhVar));
    }

    /* renamed from: h1 */
    public final void mo12532h1(C2035ad adVar, C2313li liVar) {
        Objects.requireNonNull(adVar, "null reference");
        C0823f.m376j(adVar.f3585g);
        Objects.requireNonNull(adVar.f3586h, "null reference");
        Objects.requireNonNull(liVar, "null reference");
        C2263jg jgVar = this.f3730a;
        String str = adVar.f3585g;
        C2364nl nlVar = adVar.f3586h;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        C0823f.m376j(str);
        Objects.requireNonNull(nlVar, "null reference");
        jgVar.mo12747e(str, new C2286kf(jgVar, nlVar, zhVar));
    }

    /* renamed from: u */
    public final void mo12533u(C2331mc mcVar, C2313li liVar) {
        Objects.requireNonNull(mcVar, "null reference");
        C0823f.m376j(mcVar.f4065g);
        C0823f.m376j(mcVar.f4066h);
        Objects.requireNonNull(liVar, "null reference");
        C2263jg jgVar = this.f3730a;
        String str = mcVar.f4065g;
        String str2 = mcVar.f4066h;
        String str3 = mcVar.f4067i;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        C0823f.m376j(str);
        C0823f.m376j(str2);
        jgVar.f3964a.mo12596d(new C2168fl(str, str2, str3), new C2477se(jgVar, zhVar));
    }

    /* renamed from: w */
    public final void mo12534w(C2619yc ycVar, C2313li liVar) {
        Objects.requireNonNull(ycVar, "null reference");
        C0823f.m376j(ycVar.f4482g);
        C0823f.m376j(ycVar.f4483h);
        C0823f.m376j(ycVar.f4484i);
        Objects.requireNonNull(liVar, "null reference");
        C2263jg jgVar = this.f3730a;
        String str = ycVar.f4482g;
        String str2 = ycVar.f4483h;
        String str3 = ycVar.f4484i;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        C0823f.m376j(str);
        C0823f.m376j(str2);
        C0823f.m376j(str3);
        jgVar.mo12747e(str3, new C2187gf(jgVar, str, str2, zhVar));
    }

    /* renamed from: x */
    public final void mo12535x(C2524ud udVar, C2313li liVar) {
        Objects.requireNonNull(udVar, "null reference");
        C0823f.m376j(udVar.f4345g);
        C0823f.m376j(udVar.f4346h);
        Objects.requireNonNull(liVar, "null reference");
        C2263jg jgVar = this.f3730a;
        String str = udVar.f4345g;
        String str2 = udVar.f4346h;
        String str3 = udVar.f4347i;
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        C0823f.m376j(str);
        C0823f.m376j(str2);
        jgVar.f3964a.mo12597e((Context) null, new C2532ul(str, str2, str3), new C2501te(jgVar, zhVar));
    }

    /* renamed from: z */
    public final void mo12536z(C2085cd cdVar, C2313li liVar) {
        Objects.requireNonNull(liVar, "null reference");
        Objects.requireNonNull(cdVar, "null reference");
        C3938x xVar = cdVar.f3660h;
        Objects.requireNonNull(xVar, "null reference");
        String str = cdVar.f3659g;
        C0823f.m376j(str);
        C2263jg jgVar = this.f3730a;
        C2580wl a1 = C1960d.m2775a1(xVar);
        C2648zh zhVar = new C2648zh(liVar, f3729c);
        Objects.requireNonNull(jgVar);
        C0823f.m376j(str);
        jgVar.mo12747e(str, new C2237if(jgVar, a1, zhVar));
    }
}
