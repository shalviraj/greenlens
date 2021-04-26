package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.f */
public final class C4529f extends C4542s {
    /* renamed from: f */
    public static void m8319f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (aVar == C4484a.CODE_39) {
            return super.mo16167a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo16166d(String str) {
        String str2;
        int i;
        int i2;
        int length = str.length();
        if (length <= 80) {
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < length2; i4++) {
                        char charAt = str.charAt(i4);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt == '@') {
                                    str2 = "%V";
                                } else if (charAt == '`') {
                                    str2 = "%W";
                                } else if (!(charAt == '-' || charAt == '.')) {
                                    if (charAt <= 26) {
                                        sb.append('$');
                                        i2 = charAt - 1;
                                    } else if (charAt < ' ') {
                                        sb.append('%');
                                        i2 = charAt - 27;
                                    } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                        sb.append('/');
                                        i2 = charAt - '!';
                                    } else {
                                        if (charAt <= '9') {
                                            i = (charAt - '0') + 48;
                                        } else if (charAt <= '?') {
                                            sb.append('%');
                                            i = (charAt - ';') + 70;
                                        } else if (charAt <= 'Z') {
                                            i2 = charAt - 'A';
                                        } else if (charAt <= '_') {
                                            sb.append('%');
                                            i = (charAt - '[') + 75;
                                        } else if (charAt <= 'z') {
                                            sb.append('+');
                                            i2 = charAt - 'a';
                                        } else if (charAt <= 127) {
                                            sb.append('%');
                                            i = (charAt - '{') + 80;
                                        } else {
                                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i4) + "'");
                                        }
                                        charAt = (char) i;
                                    }
                                    i = i2 + 65;
                                    charAt = (char) i;
                                }
                            }
                            sb.append(charAt);
                        } else {
                            str2 = "%U";
                        }
                        sb.append(str2);
                    }
                    str = sb.toString();
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i3++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            m8319f(148, iArr);
            int b = C4542s.m8357b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b2 = C4542s.m8357b(zArr, b, iArr2, false) + b;
            for (int i5 = 0; i5 < length; i5++) {
                m8319f(C4528e.f8446d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
                int b3 = C4542s.m8357b(zArr, b2, iArr, true) + b2;
                b2 = C4542s.m8357b(zArr, b3, iArr2, false) + b3;
            }
            m8319f(148, iArr);
            C4542s.m8357b(zArr, b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
