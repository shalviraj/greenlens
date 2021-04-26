package p005b.p096l.p232f.p261z.p264e;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.f.z.e.a */
public final class C4685a implements C4691g {
    /* renamed from: a */
    public void mo16371a(C4692h hVar) {
        String str = hVar.f8918a;
        int i = hVar.f8923f;
        int length = str.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = str.charAt(i);
                while (true) {
                    if (!C1960d.m2814k0(charAt) || i >= length) {
                        break loop0;
                    }
                    i2++;
                    i++;
                    if (i < length) {
                    }
                }
            }
        }
        if (i2 >= 2) {
            char charAt2 = hVar.f8918a.charAt(hVar.f8923f);
            char charAt3 = hVar.f8918a.charAt(hVar.f8923f + 1);
            if (!C1960d.m2814k0(charAt2) || !C1960d.m2814k0(charAt3)) {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
            hVar.f8922e.append((char) C0843a.m441b(charAt3, -48, (charAt2 - '0') * 10, 130));
            hVar.f8923f += 2;
            return;
        }
        char b = hVar.mo16383b();
        int x0 = C1960d.m2866x0(hVar.f8918a, hVar.f8923f, 0);
        if (x0 != 0) {
            if (x0 == 1) {
                hVar.f8922e.append(230);
                hVar.f8924g = 1;
            } else if (x0 == 2) {
                hVar.f8922e.append(239);
                hVar.f8924g = 2;
            } else if (x0 == 3) {
                hVar.f8922e.append(238);
                hVar.f8924g = 3;
            } else if (x0 == 4) {
                hVar.f8922e.append(240);
                hVar.f8924g = 4;
            } else if (x0 == 5) {
                hVar.f8922e.append(231);
                hVar.f8924g = 5;
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(x0)));
            }
        } else if (C1960d.m2818l0(b)) {
            hVar.f8922e.append(235);
            hVar.f8922e.append((char) ((b - 128) + 1));
            hVar.f8923f++;
        } else {
            hVar.f8922e.append((char) (b + 1));
            hVar.f8923f++;
        }
    }
}
