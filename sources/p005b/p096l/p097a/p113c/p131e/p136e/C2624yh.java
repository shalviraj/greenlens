package p005b.p096l.p097a.p113c.p131e.p136e;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Callable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1760e;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1783d;
import p005b.p096l.p180d.C3836j;

/* renamed from: b.l.a.c.e.e.yh */
public final class C2624yh implements Callable<C2287kg<C2481si>> {

    /* renamed from: a */
    public final C2481si f4497a;

    /* renamed from: b */
    public final Context f4498b;

    public C2624yh(C2481si siVar, Context context) {
        this.f4497a = siVar;
        this.f4498b = context;
    }

    public final Object call() {
        Object obj = C1760e.f3107c;
        int b = C1760e.f3108d.mo12004b(this.f4498b, 12451000);
        Context context = this.f4498b;
        String str = this.f4497a.f4290h;
        C0823f.m376j(str);
        C2481si siVar = new C2481si(str);
        siVar.f4075g = true;
        C1770a<C2481si> aVar = C2505ti.f4314c;
        C3836j jVar = new C3836j();
        C0823f.m380l(jVar, "StatusExceptionMapper must not be null.");
        return new C2287kg(new C2359ng(context, aVar, siVar, new C1783d.C1784a(jVar, (Account) null, Looper.getMainLooper())));
    }
}
