package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4492c;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4624r;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.t */
public final class C4543t extends C4548y {

    /* renamed from: i */
    public final C4548y f8473i = new C4532i();

    /* renamed from: s */
    public static C4623q m8362s(C4623q qVar) {
        String str = qVar.f8691a;
        if (str.charAt(0) == '0') {
            C4623q qVar2 = new C4623q(str.substring(1), (byte[]) null, qVar.f8693c, C4484a.UPC_A);
            Map<C4624r, Object> map = qVar.f8695e;
            if (map != null) {
                qVar2.mo16282a(map);
            }
            return qVar2;
        }
        throw C4614h.m8506a();
    }

    /* renamed from: a */
    public C4623q mo16152a(C4492c cVar, Map<C4577e, ?> map) {
        return m8362s(this.f8473i.mo16152a(cVar, map));
    }

    /* renamed from: b */
    public C4623q mo16153b(C4492c cVar) {
        return m8362s(this.f8473i.mo16153b(cVar));
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        return m8362s(this.f8473i.mo16159d(i, aVar, map));
    }

    /* renamed from: m */
    public int mo16164m(C4657a aVar, int[] iArr, StringBuilder sb) {
        return this.f8473i.mo16164m(aVar, iArr, sb);
    }

    /* renamed from: n */
    public C4623q mo16206n(int i, C4657a aVar, int[] iArr, Map<C4577e, ?> map) {
        return m8362s(this.f8473i.mo16206n(i, aVar, iArr, map));
    }

    /* renamed from: q */
    public C4484a mo16165q() {
        return C4484a.UPC_A;
    }
}
