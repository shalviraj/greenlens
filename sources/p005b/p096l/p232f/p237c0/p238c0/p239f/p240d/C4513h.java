package p005b.p096l.p232f.p237c0.p238c0.p239f.p240d;

import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.c0.f.d.h */
public abstract class C4513h extends C4515j {
    public C4513h(C4657a aVar) {
        super(aVar);
    }

    /* renamed from: b */
    public final void mo16192b(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo16193c(sb, i, length);
    }

    /* renamed from: c */
    public final void mo16193c(StringBuilder sb, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            int c = this.f8417b.mo16198c((i4 * 10) + i, 10);
            if (c / 100 == 0) {
                sb.append('0');
            }
            if (c / 10 == 0) {
                sb.append('0');
            }
            sb.append(c);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 13; i6++) {
            int charAt = sb.charAt(i6 + i2) - '0';
            if ((i6 & 1) == 0) {
                charAt *= 3;
            }
            i5 += charAt;
        }
        int i7 = 10 - (i5 % 10);
        if (i7 != 10) {
            i3 = i7;
        }
        sb.append(i3);
    }
}
