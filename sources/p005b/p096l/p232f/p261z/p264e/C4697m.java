package p005b.p096l.p232f.p261z.p264e;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.f.z.e.m */
public final class C4697m extends C4687c {
    /* renamed from: a */
    public void mo16371a(C4692h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo16385d()) {
                break;
            }
            char b = hVar.mo16383b();
            hVar.f8923f++;
            mo16373c(b, sb);
            if (sb.length() % 3 == 0) {
                C4687c.m8622f(hVar, sb);
                if (C1960d.m2866x0(hVar.f8918a, hVar.f8923f, 3) != 3) {
                    hVar.f8924g = 0;
                    break;
                }
            }
        }
        mo16375e(hVar, sb);
    }

    /* renamed from: c */
    public int mo16373c(char c, StringBuilder sb) {
        char c2;
        int i;
        if (c == 13) {
            c2 = 0;
        } else if (c == ' ') {
            c2 = 3;
        } else if (c == '*') {
            sb.append(1);
            return 1;
        } else if (c != '>') {
            if (c >= '0' && c <= '9') {
                i = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                C1960d.m2794f0(c);
                throw null;
            } else {
                i = (c - 'A') + 14;
            }
            c2 = (char) i;
        } else {
            c2 = 2;
        }
        sb.append(c2);
        return 1;
    }

    /* renamed from: d */
    public int mo16374d() {
        return 3;
    }

    /* renamed from: e */
    public void mo16375e(C4692h hVar, StringBuilder sb) {
        hVar.mo16386e();
        int a = hVar.f8925h.f8933b - hVar.mo16382a();
        hVar.f8923f -= sb.length();
        if (hVar.mo16384c() > 1 || a > 1 || hVar.mo16384c() != a) {
            hVar.f8922e.append(254);
        }
        if (hVar.f8924g < 0) {
            hVar.f8924g = 0;
        }
    }
}
