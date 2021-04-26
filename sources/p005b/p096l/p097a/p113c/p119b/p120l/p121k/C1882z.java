package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;

/* renamed from: b.l.a.c.b.l.k.z */
public final class C1882z implements C1889b.C1892c {

    /* renamed from: a */
    public final WeakReference<C1876x> f3358a;

    /* renamed from: b */
    public final C1770a<?> f3359b;

    /* renamed from: c */
    public final boolean f3360c;

    public C1882z(C1876x xVar, C1770a<?> aVar, boolean z) {
        this.f3358a = new WeakReference<>(xVar);
        this.f3359b = aVar;
        this.f3360c = z;
    }

    /* renamed from: a */
    public final void mo12112a(@NonNull C1754b bVar) {
        C1876x xVar = (C1876x) this.f3358a.get();
        if (xVar != null) {
            C0823f.m386o(Looper.myLooper() == xVar.f3320a.f3288m.f3241g, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            xVar.f3321b.lock();
            try {
                if (xVar.mo12177n(0)) {
                    if (!bVar.mo11986W()) {
                        xVar.mo12175l(bVar, this.f3359b, this.f3360c);
                    }
                    if (xVar.mo12170e()) {
                        xVar.mo12171f();
                    }
                }
            } finally {
                xVar.f3321b.unlock();
            }
        }
    }
}
