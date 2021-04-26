package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.jg */
public final class C2263jg {

    /* renamed from: a */
    public final C2141ej f3964a;

    public C2263jg(C2141ej ejVar) {
        this.f3964a = ejVar;
    }

    /* renamed from: b */
    public static void m3588b(C2263jg jgVar, C2412pl plVar, C2648zh zhVar, C2116dj djVar) {
        Status status;
        if (plVar.f4210g || !TextUtils.isEmpty(plVar.f4221r)) {
            C3919n0 a = plVar.mo12922a();
            String str = plVar.f4214k;
            String str2 = plVar.f4223t;
            if (plVar.f4210g) {
                status = new Status(17012);
            } else {
                status = C1960d.m2768Y0(plVar.f4221r);
            }
            C2381oe oeVar = new C2381oe(status, a, str, str2);
            Objects.requireNonNull(zhVar);
            try {
                zhVar.f4530a.mo12398O(oeVar);
            } catch (RemoteException e) {
                C1955a aVar = zhVar.f4531b;
                Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending failure result with credential", new Object[0]), e);
            }
        } else {
            jgVar.mo12748f(new C2363nk(plVar.f4212i, plVar.f4211h, Long.valueOf(plVar.f4213j), "Bearer"), plVar.f4216m, plVar.f4215l, Boolean.valueOf(plVar.f4217n), plVar.mo12922a(), zhVar, djVar);
        }
    }

    /* renamed from: c */
    public static void m3589c(C2263jg jgVar, C2648zh zhVar, C2363nk nkVar, C2118dl dlVar, C2116dj djVar) {
        Objects.requireNonNull(zhVar, "null reference");
        jgVar.f3964a.mo12599g(new C2117dk(nkVar.f4104h), new C2573we(jgVar, djVar, zhVar, nkVar, dlVar));
    }

    /* renamed from: d */
    public static void m3590d(C2263jg jgVar, C2648zh zhVar, C2363nk nkVar, C2192gk gkVar, C2118dl dlVar, C2116dj djVar) {
        Objects.requireNonNull(zhVar, "null reference");
        Objects.requireNonNull(nkVar, "null reference");
        Objects.requireNonNull(gkVar, "null reference");
        Objects.requireNonNull(dlVar, "null reference");
        Objects.requireNonNull(djVar, "null reference");
        jgVar.f3964a.mo12600h(dlVar, new C2597xe(jgVar, dlVar, gkVar, zhVar, nkVar, djVar));
    }

    /* renamed from: e */
    public final void mo12747e(String str, C2116dj<C2363nk> djVar) {
        C0823f.m376j(str);
        C2363nk X = C2363nk.m3834X(str);
        if (X.mo12843V()) {
            djVar.mo12389a(X);
            return;
        }
        this.f3964a.mo12593a(new C2092ck(X.f4103g), new C2238ig(djVar));
    }

    /* renamed from: f */
    public final void mo12748f(C2363nk nkVar, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable C3919n0 n0Var, C2648zh zhVar, C2116dj djVar) {
        Objects.requireNonNull(nkVar, "null reference");
        Objects.requireNonNull(djVar, "null reference");
        Objects.requireNonNull(zhVar, "null reference");
        this.f3964a.mo12599g(new C2117dk(nkVar.f4104h), new C2621ye(djVar, str2, str, bool, n0Var, zhVar, nkVar));
    }
}
