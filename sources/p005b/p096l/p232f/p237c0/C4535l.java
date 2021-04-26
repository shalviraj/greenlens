package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.l */
public final class C4535l extends C4549z {
    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (aVar == C4484a.EAN_8) {
            return super.mo16167a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo16166d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = C0843a.m444e(str, C4548y.m8376r(str));
            } catch (C4614h e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C4548y.m8372j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C4614h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        C4542s.m8358c(str);
        boolean[] zArr = new boolean[67];
        int b = C4542s.m8357b(zArr, 0, C4548y.f8483d, true) + 0;
        for (int i = 0; i <= 3; i++) {
            b += C4542s.m8357b(zArr, b, C4548y.f8486g[Character.digit(str.charAt(i), 10)], false);
        }
        int b2 = C4542s.m8357b(zArr, b, C4548y.f8484e, false) + b;
        for (int i2 = 4; i2 <= 7; i2++) {
            b2 += C4542s.m8357b(zArr, b2, C4548y.f8486g[Character.digit(str.charAt(i2), 10)], true);
        }
        C4542s.m8357b(zArr, b2, C4548y.f8483d, true);
        return zArr;
    }
}
