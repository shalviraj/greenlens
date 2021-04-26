package p005b.p096l.p097a.p151d.p152a.p153a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p157d.C3571b;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;
import p005b.p096l.p097a.p151d.p152a.p163i.C3651r;

/* renamed from: b.l.a.d.a.a.e */
public final class C3452e implements C3449b {

    /* renamed from: a */
    public final C3463p f6242a;

    /* renamed from: b */
    public final C3451d f6243b;

    /* renamed from: c */
    public final Context f6244c;

    public C3452e(C3463p pVar, C3451d dVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f6242a = pVar;
        this.f6243b = dVar;
        this.f6244c = context;
    }

    /* renamed from: a */
    public final C3651r<Void> mo14727a() {
        C3463p pVar = this.f6242a;
        String packageName = this.f6244c.getPackageName();
        if (pVar.f6266a == null) {
            return C3463p.m6615b();
        }
        C3463p.f6264e.mo14884b(4, "completeUpdate(%s)", new Object[]{packageName});
        C3647n nVar = new C3647n();
        pVar.f6266a.mo14904a(new C3459l(pVar, nVar, nVar, packageName));
        return nVar.f6722a;
    }

    /* renamed from: b */
    public final C3651r<C3448a> mo14728b() {
        C3463p pVar = this.f6242a;
        String packageName = this.f6244c.getPackageName();
        if (pVar.f6266a == null) {
            return C3463p.m6615b();
        }
        C3463p.f6264e.mo14884b(4, "requestUpdateInfo(%s)", new Object[]{packageName});
        C3647n nVar = new C3647n();
        pVar.f6266a.mo14904a(new C3458k(pVar, nVar, packageName, nVar));
        return nVar.f6722a;
    }

    /* renamed from: c */
    public final synchronized void mo14729c(C3571b bVar) {
        C3451d dVar = this.f6243b;
        synchronized (dVar) {
            dVar.f6683a.mo14884b(4, "registerListener", new Object[0]);
            C1960d.m2710F(bVar, "Registered Play Core listener should not be null.");
            dVar.f6686d.add(bVar);
            dVar.mo14915b();
        }
    }

    /* renamed from: d */
    public final boolean mo14730d(C3448a aVar, int i, Activity activity, int i2) {
        C3450c c = C3450c.m6594c(i);
        if (!(aVar.mo14720j(c) != null)) {
            return false;
        }
        activity.startIntentSenderForResult(aVar.mo14720j(c).getIntentSender(), i2, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    /* renamed from: e */
    public final synchronized void mo14731e(C3571b bVar) {
        C3451d dVar = this.f6243b;
        synchronized (dVar) {
            dVar.f6683a.mo14884b(4, "unregisterListener", new Object[0]);
            C1960d.m2710F(bVar, "Unregistered Play Core listener should not be null.");
            dVar.f6686d.remove(bVar);
            dVar.mo14915b();
        }
    }
}
