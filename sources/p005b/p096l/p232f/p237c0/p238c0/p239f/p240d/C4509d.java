package p005b.p096l.p232f.p237c0.p238c0.p239f.p240d;

import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.c0.f.d.d */
public final class C4509d extends C4513h {
    public C4509d(C4657a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public String mo16191a() {
        if (this.f8416a.f8786h >= 48) {
            StringBuilder sb = new StringBuilder();
            mo16192b(sb, 8);
            int c = this.f8417b.mo16198c(48, 2);
            sb.append("(393");
            sb.append(c);
            sb.append(')');
            int c2 = this.f8417b.mo16198c(50, 10);
            if (c2 / 100 == 0) {
                sb.append('0');
            }
            if (c2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(c2);
            sb.append(this.f8417b.mo16197b(60, (String) null).f8427b);
            return sb.toString();
        }
        throw C4619m.f8685i;
    }
}
