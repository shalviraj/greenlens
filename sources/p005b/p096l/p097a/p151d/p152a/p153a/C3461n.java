package p005b.p096l.p097a.p151d.p152a.p153a;

import android.os.Bundle;
import p005b.p096l.p097a.p151d.p152a.p157d.C3570a;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.a.n */
public final class C3461n extends C3460m<Void> {
    public C3461n(C3463p pVar, C3647n<Void> nVar) {
        super(pVar, new C3584f("OnCompleteUpdateCallback"), nVar);
    }

    /* renamed from: y0 */
    public final void mo14740y0(Bundle bundle) {
        this.f6261c.f6266a.mo14905b();
        this.f6259a.mo14884b(4, "onCompleteUpdate", new Object[0]);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f6260b.mo14928a(new C3570a(bundle.getInt("error.code", -2)));
        } else {
            this.f6260b.mo14929b(null);
        }
    }
}
