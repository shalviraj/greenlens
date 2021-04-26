package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.b0 */
public final class C4496b0 extends C4549z {
    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (aVar == C4484a.UPC_E) {
            return super.mo16167a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo16166d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = C0843a.m444e(str, C4548y.m8376r(C4494a0.m8256s(str)));
            } catch (C4614h e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C4548y.m8372j(C4494a0.m8256s(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C4614h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        C4542s.m8358c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = C4494a0.f8369k[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b = C4542s.m8357b(zArr, 0, C4548y.f8483d, true) + 0;
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                b += C4542s.m8357b(zArr, b, C4548y.f8487h[digit2], false);
            }
            C4542s.m8357b(zArr, b, C4548y.f8485f, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
