package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.h */
public class C4531h extends C4542s {
    /* renamed from: f */
    public static int m8325f(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    /* renamed from: g */
    public static int m8326g(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (aVar == C4484a.CODE_93) {
            return super.mo16167a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo16166d(String str) {
        String str2;
        int i;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 0) {
                str2 = "bU";
            } else {
                if (charAt <= 26) {
                    sb.append('a');
                    i = (charAt + 'A') - 1;
                } else if (charAt <= 31) {
                    sb.append('b');
                    i = (charAt + 'A') - 27;
                } else {
                    if (!(charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+')) {
                        if (charAt <= ',') {
                            sb.append('c');
                            i = (charAt + 'A') - 33;
                        } else if (charAt > '9') {
                            if (charAt == ':') {
                                str2 = "cZ";
                            } else if (charAt <= '?') {
                                sb.append('b');
                                i = (charAt + 'F') - 59;
                            } else if (charAt == '@') {
                                str2 = "bV";
                            } else if (charAt > 'Z') {
                                if (charAt <= '_') {
                                    sb.append('b');
                                    i = (charAt + 'K') - 91;
                                } else if (charAt == '`') {
                                    str2 = "bW";
                                } else if (charAt <= 'z') {
                                    sb.append('d');
                                    i = (charAt + 'A') - 97;
                                } else if (charAt <= 127) {
                                    sb.append('b');
                                    i = (charAt + 'P') - 123;
                                } else {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                                }
                            }
                        }
                    }
                    sb.append(charAt);
                }
                charAt = (char) i;
                sb.append(charAt);
            }
            sb.append(str2);
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        if (length2 <= 80) {
            boolean[] zArr = new boolean[(((sb2.length() + 2 + 2) * 9) + 1)];
            m8325f(zArr, 0, C4530g.f8452e);
            int i3 = 9;
            for (int i4 = 0; i4 < length2; i4++) {
                m8325f(zArr, i3, C4530g.f8451d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb2.charAt(i4))]);
                i3 += 9;
            }
            int g = m8326g(sb2, 20);
            int[] iArr = C4530g.f8451d;
            m8325f(zArr, i3, iArr[g]);
            int i5 = i3 + 9;
            StringBuilder u = C0843a.m460u(sb2);
            u.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(g));
            m8325f(zArr, i5, iArr[m8326g(u.toString(), 15)]);
            int i6 = i5 + 9;
            m8325f(zArr, i6, C4530g.f8452e);
            zArr[i6 + 9] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length2)));
    }
}
