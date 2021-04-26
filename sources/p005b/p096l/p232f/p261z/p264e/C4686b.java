package p005b.p096l.p232f.p261z.p264e;

import androidx.core.view.InputDeviceCompat;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.f.z.e.b */
public final class C4686b implements C4691g {
    /* renamed from: a */
    public void mo16371a(C4692h hVar) {
        StringBuilder t = C0843a.m459t(0);
        while (true) {
            if (!hVar.mo16385d()) {
                break;
            }
            t.append(hVar.mo16383b());
            int i = hVar.f8923f + 1;
            hVar.f8923f = i;
            if (C1960d.m2866x0(hVar.f8918a, i, 5) != 5) {
                hVar.f8924g = 0;
                break;
            }
        }
        int length = t.length() - 1;
        int a = hVar.mo16382a() + length + 1;
        hVar.mo16387f(a);
        boolean z = hVar.f8925h.f8933b - a > 0;
        if (hVar.mo16385d() || z) {
            if (length <= 249) {
                t.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                t.setCharAt(0, (char) ((length / 250) + 249));
                t.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = t.length();
        for (int i2 = 0; i2 < length2; i2++) {
            int a2 = (((hVar.mo16382a() + 1) * 149) % 255) + 1 + t.charAt(i2);
            if (a2 > 255) {
                a2 += InputDeviceCompat.SOURCE_ANY;
            }
            hVar.f8922e.append((char) a2);
        }
    }
}
