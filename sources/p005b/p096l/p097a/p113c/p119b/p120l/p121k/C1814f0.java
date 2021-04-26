package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.util.Log;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1946t;
import p005b.p096l.p097a.p113c.p148i.p149b.C3409l;

/* renamed from: b.l.a.c.b.l.k.f0 */
public final class C1814f0 extends C1849o0 {

    /* renamed from: b */
    public final /* synthetic */ C1876x f3173b;

    /* renamed from: c */
    public final /* synthetic */ C3409l f3174c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1814f0(C1843m0 m0Var, C1876x xVar, C3409l lVar) {
        super(m0Var);
        this.f3173b = xVar;
        this.f3174c = lVar;
    }

    /* renamed from: a */
    public final void mo12043a() {
        C1876x xVar = this.f3173b;
        C3409l lVar = this.f3174c;
        boolean z = false;
        if (xVar.mo12177n(0)) {
            C1754b bVar = lVar.f6176h;
            if (bVar.mo11986W()) {
                C1946t tVar = lVar.f6177i;
                C1754b bVar2 = tVar.f3493i;
                if (!bVar2.mo11986W()) {
                    String valueOf = String.valueOf(bVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GACConnecting", sb.toString(), new Exception());
                    xVar.mo12178p(bVar2);
                    return;
                }
                xVar.f3333n = true;
                xVar.f3334o = tVar.mo12276V();
                xVar.f3335p = tVar.f3494j;
                xVar.f3336q = tVar.f3495k;
            } else {
                if (xVar.f3331l && !bVar.mo11985V()) {
                    z = true;
                }
                if (z) {
                    xVar.mo12173i();
                } else {
                    xVar.mo12178p(bVar);
                    return;
                }
            }
            xVar.mo12171f();
        }
    }
}
