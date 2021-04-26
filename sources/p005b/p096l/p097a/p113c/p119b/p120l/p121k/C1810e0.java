package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p148i.C3412e;

/* renamed from: b.l.a.c.b.l.k.e0 */
public final class C1810e0 implements GoogleApiClient.C5470b, GoogleApiClient.C5471c {

    /* renamed from: a */
    public final /* synthetic */ C1876x f3166a;

    public C1810e0(C1876x xVar, C1873w wVar) {
        this.f3166a = xVar;
    }

    /* renamed from: g */
    public final void mo12086g(int i) {
    }

    /* renamed from: k */
    public final void mo12087k(Bundle bundle) {
        C1876x xVar = this.f3166a;
        if (xVar.f3337r.f3419h) {
            xVar.f3321b.lock();
            try {
                C1876x xVar2 = this.f3166a;
                C3412e eVar = xVar2.f3330k;
                if (eVar == null) {
                    xVar2.f3321b.unlock();
                } else {
                    eVar.mo14654l(new C1802c0(this.f3166a));
                }
            } finally {
                this.f3166a.f3321b.unlock();
            }
        } else {
            xVar.f3330k.mo14654l(new C1802c0(this.f3166a));
        }
    }

    /* renamed from: n */
    public final void mo12088n(@NonNull C1754b bVar) {
        this.f3166a.f3321b.lock();
        try {
            if (this.f3166a.f3331l && !bVar.mo11985V()) {
                this.f3166a.mo12173i();
                this.f3166a.mo12171f();
            } else {
                this.f3166a.mo12178p(bVar);
            }
        } finally {
            this.f3166a.f3321b.unlock();
        }
    }
}
