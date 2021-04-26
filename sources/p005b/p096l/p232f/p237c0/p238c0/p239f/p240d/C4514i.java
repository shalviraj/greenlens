package p005b.p096l.p232f.p237c0.p238c0.p239f.p240d;

import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.c0.f.d.i */
public abstract class C4514i extends C4513h {
    public C4514i(C4657a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public abstract void mo16189d(StringBuilder sb, int i);

    /* renamed from: e */
    public abstract int mo16190e(int i);

    /* renamed from: f */
    public final void mo16194f(StringBuilder sb, int i, int i2) {
        int d = C4525s.m8308d(this.f8417b.f8438a, i, i2);
        mo16189d(sb, d);
        int e = mo16190e(d);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (e / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(e);
    }
}
