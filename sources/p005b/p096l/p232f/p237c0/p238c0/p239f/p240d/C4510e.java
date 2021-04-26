package p005b.p096l.p232f.p237c0.p238c0.p239f.p240d;

import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.c0.f.d.e */
public final class C4510e extends C4514i {

    /* renamed from: c */
    public final String f8414c;

    /* renamed from: d */
    public final String f8415d;

    public C4510e(C4657a aVar, String str, String str2) {
        super(aVar);
        this.f8414c = str2;
        this.f8415d = str;
    }

    /* renamed from: a */
    public String mo16191a() {
        if (this.f8416a.f8786h == 84) {
            StringBuilder sb = new StringBuilder();
            mo16192b(sb, 8);
            mo16194f(sb, 48, 20);
            int d = C4525s.m8308d(this.f8417b.f8438a, 68, 16);
            if (d != 38400) {
                sb.append('(');
                sb.append(this.f8414c);
                sb.append(')');
                int i = d % 32;
                int i2 = d / 32;
                int i3 = (i2 % 12) + 1;
                int i4 = i2 / 12;
                if (i4 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i4);
                if (i3 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i3);
                if (i / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i);
            }
            return sb.toString();
        }
        throw C4619m.f8685i;
    }

    /* renamed from: d */
    public void mo16189d(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f8415d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* renamed from: e */
    public int mo16190e(int i) {
        return i % 100000;
    }
}
