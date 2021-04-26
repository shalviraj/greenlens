package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.yi */
public final class C2625yi extends C2141ej {

    /* renamed from: a */
    public C2409pi f4499a = null;

    /* renamed from: b */
    public C2433qi f4500b = null;

    /* renamed from: c */
    public C2191gj f4501c = null;

    /* renamed from: d */
    public final C2601xi f4502d;

    /* renamed from: e */
    public final Context f4503e;

    /* renamed from: f */
    public final String f4504f;

    /* renamed from: g */
    public C2649zi f4505g;

    public C2625yi(Context context, String str, C2601xi xiVar) {
        C2386oj ojVar;
        C2386oj ojVar2;
        this.f4503e = context.getApplicationContext();
        C0823f.m376j(str);
        this.f4504f = str;
        this.f4502d = xiVar;
        String w1 = C1960d.m2863w1("firebear.secureToken");
        if (TextUtils.isEmpty(w1)) {
            Map<String, C2386oj> map = C2410pj.f4205a;
            synchronized (map) {
                ojVar2 = map.get(str);
            }
            if (ojVar2 == null) {
                w1 = "https://".concat("securetoken.googleapis.com/v1");
            } else {
                throw null;
            }
        } else {
            String valueOf = String.valueOf(w1);
            Log.e("LocalClient", valueOf.length() != 0 ? "Found hermetic configuration for secureToken URL: ".concat(valueOf) : new String("Found hermetic configuration for secureToken URL: "));
        }
        if (this.f4501c == null) {
            this.f4501c = new C2191gj(w1, mo13119u());
        }
        String w12 = C1960d.m2863w1("firebear.identityToolkit");
        if (TextUtils.isEmpty(w12)) {
            w12 = C2410pj.m4011a(str);
        } else {
            String valueOf2 = String.valueOf(w12);
            Log.e("LocalClient", valueOf2.length() != 0 ? "Found hermetic configuration for identityToolkit URL: ".concat(valueOf2) : new String("Found hermetic configuration for identityToolkit URL: "));
        }
        if (this.f4499a == null) {
            this.f4499a = new C2409pi(w12, mo13119u());
        }
        String w13 = C1960d.m2863w1("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(w13)) {
            Map<String, C2386oj> map2 = C2410pj.f4205a;
            synchronized (map2) {
                ojVar = map2.get(str);
            }
            if (ojVar == null) {
                w13 = "https://".concat("identitytoolkit.googleapis.com/v2/accounts");
            } else {
                throw null;
            }
        } else {
            String valueOf3 = String.valueOf(w13);
            Log.e("LocalClient", valueOf3.length() != 0 ? "Found hermetic configuration for identityToolkitV2 URL: ".concat(valueOf3) : new String("Found hermetic configuration for identityToolkitV2 URL: "));
        }
        if (this.f4500b == null) {
            this.f4500b = new C2433qi(w13, mo13119u());
        }
        Map<String, WeakReference<C2625yi>> map3 = C2410pj.f4206b;
        synchronized (map3) {
            map3.put(str, new WeakReference(this));
        }
    }

    /* renamed from: a */
    public final void mo12593a(C2092ck ckVar, C2116dj<C2363nk> djVar) {
        C2191gj gjVar = this.f4501c;
        C1960d.m2835p1(gjVar.mo12706a("/token", this.f4504f), ckVar, djVar, C2363nk.class, gjVar.f3921b);
    }

    /* renamed from: b */
    public final void mo12594b(C2436ql qlVar, C2116dj<C2460rl> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/verifyCustomToken", this.f4504f), qlVar, djVar, C2460rl.class, piVar.f3921b);
    }

    /* renamed from: c */
    public final void mo12595c(Context context, C2364nl nlVar, C2116dj<C2412pl> djVar) {
        Objects.requireNonNull(nlVar, "null reference");
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/verifyAssertion", this.f4504f), nlVar, djVar, C2412pl.class, piVar.f3921b);
    }

    /* renamed from: d */
    public final void mo12596d(C2168fl flVar, C2116dj<C2193gl> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/signupNewUser", this.f4504f), flVar, djVar, C2193gl.class, piVar.f3921b);
    }

    /* renamed from: e */
    public final void mo12597e(Context context, C2532ul ulVar, C2116dj<C2556vl> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/verifyPassword", this.f4504f), ulVar, djVar, C2556vl.class, piVar.f3921b);
    }

    /* renamed from: f */
    public final void mo12598f(C2603xk xkVar, C2116dj<C2627yk> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/resetPassword", this.f4504f), xkVar, djVar, C2627yk.class, piVar.f3921b);
    }

    /* renamed from: g */
    public final void mo12599g(C2117dk dkVar, C2116dj<C2142ek> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/getAccountInfo", this.f4504f), dkVar, djVar, C2142ek.class, piVar.f3921b);
    }

    /* renamed from: h */
    public final void mo12600h(C2118dl dlVar, C2116dj<C2143el> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/setAccountInfo", this.f4504f), dlVar, djVar, C2143el.class, piVar.f3921b);
    }

    /* renamed from: i */
    public final void mo12601i(C2482sj sjVar, C2116dj<C2506tj> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/createAuthUri", this.f4504f), sjVar, djVar, C2506tj.class, piVar.f3921b);
    }

    /* renamed from: j */
    public final void mo12602j(C2291kk kkVar, C2116dj<C2315lk> djVar) {
        if (kkVar.f4026k != null) {
            mo13119u().f4536e = kkVar.f4026k.f7094n;
        }
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/getOobConfirmationCode", this.f4504f), kkVar, djVar, C2315lk.class, piVar.f3921b);
    }

    /* renamed from: k */
    public final void mo12603k(C2043al alVar, C2116dj<C2093cl> djVar) {
        if (!TextUtils.isEmpty(alVar.f3607j)) {
            mo13119u().f4536e = alVar.f3607j;
        }
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/sendVerificationCode", this.f4504f), alVar, djVar, C2093cl.class, piVar.f3921b);
    }

    /* renamed from: l */
    public final void mo12604l(Context context, C2580wl wlVar, C2116dj<C2604xl> djVar) {
        Objects.requireNonNull(wlVar, "null reference");
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/verifyPhoneNumber", this.f4504f), wlVar, djVar, C2604xl.class, piVar.f3921b);
    }

    /* renamed from: m */
    public final void mo12605m(C2554vj vjVar, C2116dj<Void> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/deleteAccount", this.f4504f), vjVar, djVar, Void.class, piVar.f3921b);
    }

    /* renamed from: n */
    public final void mo12606n(@Nullable String str, C2116dj<Void> djVar) {
        C2649zi u = mo13119u();
        Objects.requireNonNull(u);
        u.f4535d = !TextUtils.isEmpty(str);
        ((C2038ag) djVar).f3597a.mo13141g();
    }

    /* renamed from: o */
    public final void mo12607o(C2578wj wjVar, C2116dj<C2602xj> djVar) {
        C2409pi piVar = this.f4499a;
        C1960d.m2835p1(piVar.mo12706a("/emailLinkSignin", this.f4504f), wjVar, djVar, C2602xj.class, piVar.f3921b);
    }

    /* renamed from: p */
    public final void mo12608p(C2218hl hlVar, C2116dj<C2243il> djVar) {
        if (!TextUtils.isEmpty(hlVar.f3926j)) {
            mo13119u().f4536e = hlVar.f3926j;
        }
        C2433qi qiVar = this.f4500b;
        C1960d.m2835p1(qiVar.mo12706a("/mfaEnrollment:start", this.f4504f), hlVar, djVar, C2243il.class, qiVar.f3921b);
    }

    /* renamed from: q */
    public final void mo12609q(Context context, C2626yj yjVar, C2116dj<C2650zj> djVar) {
        Objects.requireNonNull(yjVar, "null reference");
        C2433qi qiVar = this.f4500b;
        C1960d.m2835p1(qiVar.mo12706a("/mfaEnrollment:finalize", this.f4504f), yjVar, djVar, C2650zj.class, qiVar.f3921b);
    }

    /* renamed from: r */
    public final void mo12610r(C2628yl ylVar, C2116dj<C2652zl> djVar) {
        C2433qi qiVar = this.f4500b;
        C1960d.m2835p1(qiVar.mo12706a("/mfaEnrollment:withdraw", this.f4504f), ylVar, djVar, C2652zl.class, qiVar.f3921b);
    }

    /* renamed from: s */
    public final void mo12611s(C2268jl jlVar, C2116dj<C2292kl> djVar) {
        if (!TextUtils.isEmpty(jlVar.f3969j)) {
            mo13119u().f4536e = jlVar.f3969j;
        }
        C2433qi qiVar = this.f4500b;
        C1960d.m2835p1(qiVar.mo12706a("/mfaSignIn:start", this.f4504f), jlVar, djVar, C2292kl.class, qiVar.f3921b);
    }

    /* renamed from: t */
    public final void mo12612t(Context context, C2042ak akVar, C2116dj<C2067bk> djVar) {
        C2433qi qiVar = this.f4500b;
        C1960d.m2835p1(qiVar.mo12706a("/mfaSignIn:finalize", this.f4504f), akVar, djVar, C2067bk.class, qiVar.f3921b);
    }

    @NonNull
    /* renamed from: u */
    public final C2649zi mo13119u() {
        if (this.f4505g == null) {
            this.f4505g = new C2649zi(this.f4503e, this.f4502d.mo13113a());
        }
        return this.f4505g;
    }
}
