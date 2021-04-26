package p298d.p415c0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005b.p291q.p292a.C5266a;
import p298d.p333a0.C6756b;
import p298d.p333a0.C6758d;
import p298d.p333a0.C6759e;
import p298d.p344x.p346c.C6888i;
import p298d.p414b0.C7677q;

/* renamed from: d.c0.h */
public class C7694h extends C7692f {
    /* renamed from: A */
    public static /* synthetic */ boolean m13910A(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13947y(str, str2, z);
    }

    /* renamed from: B */
    public static final String m13911B(CharSequence charSequence, C6758d dVar) {
        C6888i.m12438e(charSequence, "$this$substring");
        C6888i.m12438e(dVar, "range");
        return charSequence.subSequence(dVar.getStart().intValue(), dVar.getEndInclusive().intValue() + 1).toString();
    }

    /* renamed from: C */
    public static final String m13912C(String str, String str2, String str3) {
        C6888i.m12438e(str, "$this$substringAfter");
        C6888i.m12438e(str2, "delimiter");
        C6888i.m12438e(str3, "missingDelimiterValue");
        int l = m13934l(str, str2, 0, false, 6);
        if (l == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + l, str.length());
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: D */
    public static /* synthetic */ String m13913D(String str, String str2, String str3, int i) {
        return m13912C(str, str2, (i & 2) != 0 ? str : null);
    }

    /* renamed from: E */
    public static final String m13914E(String str, char c, String str2) {
        C6888i.m12438e(str, "$this$substringAfterLast");
        C6888i.m12438e(str2, "missingDelimiterValue");
        int o = m13937o(str, c, 0, false, 6);
        if (o == -1) {
            return str2;
        }
        String substring = str.substring(o + 1, str.length());
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: F */
    public static /* synthetic */ String m13915F(String str, char c, String str2, int i) {
        return m13914E(str, c, (i & 2) != 0 ? str : null);
    }

    /* renamed from: G */
    public static String m13916G(String str, char c, String str2, int i) {
        String str3 = (i & 2) != 0 ? str : null;
        C6888i.m12438e(str, "$this$substringBefore");
        C6888i.m12438e(str3, "missingDelimiterValue");
        int k = m13933k(str, c, 0, false, 6);
        if (k == -1) {
            return str3;
        }
        String substring = str.substring(0, k);
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H */
    public static String m13917H(String str, String str2, String str3, int i) {
        String str4 = (i & 2) != 0 ? str : null;
        C6888i.m12438e(str, "$this$substringBefore");
        C6888i.m12438e(str2, "delimiter");
        C6888i.m12438e(str4, "missingDelimiterValue");
        int l = m13934l(str, str2, 0, false, 6);
        if (l == -1) {
            return str4;
        }
        String substring = str.substring(0, l);
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: I */
    public static final Integer m13918I(String str) {
        C6888i.m12438e(str, "$this$toIntOrNull");
        return m13919J(str, 10);
    }

    /* renamed from: J */
    public static final Integer m13919J(String str, int i) {
        int i2;
        int i3;
        C6888i.m12438e(str, "$this$toIntOrNull");
        C5266a.m9854O(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        boolean z = true;
        if (C6888i.m12440g(charAt, 48) >= 0) {
            i2 = 0;
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                i2 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                i2 = 1;
                z = false;
            }
        }
        int i6 = -59652323;
        while (i2 < length) {
            int digit = Character.digit(str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + digit) {
                return null;
            }
            i4 = i3 - digit;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    /* renamed from: K */
    public static final Long m13920K(String str, int i) {
        String str2 = str;
        int i2 = i;
        C6888i.m12438e(str2, "$this$toLongOrNull");
        C5266a.m9854O(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        boolean z = true;
        if (C6888i.m12440g(charAt, 48) >= 0) {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i3 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i3 = 1;
            }
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        long j4 = -256204778801521550L;
        while (i3 < length) {
            int digit = Character.digit(str2.charAt(i3), i2);
            if (digit < 0) {
                return null;
            }
            if (j2 < j4) {
                if (j4 == j3) {
                    j4 = j / ((long) i2);
                    if (j2 < j4) {
                    }
                }
                return null;
            }
            long j5 = j2 * ((long) i2);
            long j6 = (long) digit;
            if (j5 < j + j6) {
                return null;
            }
            j2 = j5 - j6;
            i3++;
            j3 = -256204778801521550L;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    /* renamed from: L */
    public static final CharSequence m13921L(CharSequence charSequence) {
        C6888i.m12438e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean N2 = C5266a.m9851N2(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!N2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!N2) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13922M(java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r14 = r15 & 1
            r15 = 0
            if (r14 == 0) goto L_0x0008
            java.lang.String r14 = "|"
            goto L_0x0009
        L_0x0008:
            r14 = r15
        L_0x0009:
            java.lang.String r0 = "$this$trimMargin"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.lang.String r0 = "marginPrefix"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            java.lang.String r1 = "$this$replaceIndentByMargin"
            p298d.p344x.p346c.C6888i.m12438e(r13, r1)
            java.lang.String r1 = ""
            java.lang.String r2 = "newIndent"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            boolean r0 = m13936n(r14)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = "$this$lines"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.lang.String r0 = "$this$lineSequence"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r2 = "\r"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.lang.String r1 = "$this$splitToSequence"
            p298d.p344x.p346c.C6888i.m12438e(r13, r1)
            java.lang.String r1 = "delimiters"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            java.util.List r0 = p298d.p334t.C6790h.m12344c(r0)
            d.c0.b r1 = new d.c0.b
            d.c0.j r2 = new d.c0.j
            r3 = 0
            r2.<init>(r0, r3)
            r1.<init>(r13, r3, r3, r2)
            d.c0.k r0 = new d.c0.k
            r0.<init>(r13)
            d.b0.h r0 = p298d.p414b0.C7679s.m13898f(r1, r0)
            java.util.List r0 = p298d.p414b0.C7679s.m13901i(r0)
            int r13 = r13.length()
            int r1 = r0.size()
            int r1 = r1 * r3
            int r1 = r1 + r13
            d.c0.g r13 = p298d.p415c0.C7693g.f15229g
            int r2 = p298d.p334t.C6790h.m12364r(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            r5 = r3
        L_0x007e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00e1
            java.lang.Object r6 = r0.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L_0x00dd
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L_0x0092
            if (r5 != r2) goto L_0x009a
        L_0x0092:
            boolean r5 = m13936n(r6)
            if (r5 == 0) goto L_0x009a
            r6 = r15
            goto L_0x00d6
        L_0x009a:
            int r5 = r6.length()
            r8 = r3
        L_0x009f:
            r9 = -1
            if (r8 >= r5) goto L_0x00b2
            char r10 = r6.charAt(r8)
            boolean r10 = p005b.p291q.p292a.C5266a.m9851N2(r10)
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            int r8 = r8 + 1
            goto L_0x009f
        L_0x00b2:
            r8 = r9
        L_0x00b3:
            if (r8 != r9) goto L_0x00b6
            goto L_0x00cc
        L_0x00b6:
            r5 = 4
            boolean r5 = m13948z(r6, r14, r8, r3, r5)
            if (r5 == 0) goto L_0x00cc
            int r5 = r14.length()
            int r5 = r5 + r8
            java.lang.String r5 = r6.substring(r5)
            java.lang.String r8 = "(this as java.lang.String).substring(startIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r5, r8)
            goto L_0x00cd
        L_0x00cc:
            r5 = r15
        L_0x00cd:
            if (r5 == 0) goto L_0x00d6
            java.lang.Object r5 = r13.invoke(r5)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
        L_0x00d6:
            if (r6 == 0) goto L_0x00db
            r4.add(r6)
        L_0x00db:
            r5 = r7
            goto L_0x007e
        L_0x00dd:
            p298d.p334t.C6790h.m12333T()
            throw r15
        L_0x00e1:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            java.lang.String r6 = "\n"
            r5 = r13
            p298d.p334t.C6790h.m12367u(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            p298d.p344x.p346c.C6888i.m12437d(r13, r14)
            return r13
        L_0x00fd:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "marginPrefix must be non-blank string."
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p415c0.C7694h.m13922M(java.lang.String, java.lang.String, int):java.lang.String");
    }

    /* renamed from: a */
    public static final String m13923a(String str) {
        C6888i.m12438e(str, "$this$capitalize");
        Locale locale = Locale.getDefault();
        C6888i.m12437d(locale, "Locale.getDefault()");
        C6888i.m12438e(str, "$this$capitalize");
        C6888i.m12438e(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String upperCase = substring.toUpperCase(locale);
            C6888i.m12437d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        C6888i.m12437d(substring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final boolean m13924b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C6888i.m12438e(charSequence, "$this$contains");
        C6888i.m12438e(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (m13932j(charSequence, charSequence2, 0, charSequence.length(), z, false, 16) >= 0) {
                return true;
            }
        } else if (m13934l(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m13925c(CharSequence charSequence, char c, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        C6888i.m12438e(charSequence, "$this$contains");
        return m13933k(charSequence, c, 0, z, 2) >= 0;
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m13926d(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13924b(charSequence, charSequence2, z);
    }

    /* renamed from: e */
    public static boolean m13927e(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        C6888i.m12438e(str, "$this$endsWith");
        C6888i.m12438e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m13939q(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: f */
    public static final boolean m13928f(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: g */
    public static final int m13929g(CharSequence charSequence) {
        C6888i.m12438e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: h */
    public static final int m13930h(CharSequence charSequence, String str, int i, boolean z) {
        C6888i.m12438e(charSequence, "$this$indexOf");
        C6888i.m12438e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m13932j(charSequence, str, i, charSequence.length(), z, false, 16);
    }

    /* renamed from: i */
    public static final int m13931i(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C6756b bVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            bVar = new C6758d(i, i2);
        } else {
            int g = m13929g(charSequence);
            if (i > g) {
                i = g;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            bVar = C6759e.m12306b(i, i2);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = bVar.f13658g;
            int i4 = bVar.f13659h;
            int i5 = bVar.f13660i;
            if (i5 >= 0) {
                if (i3 > i4) {
                    return -1;
                }
            } else if (i3 < i4) {
                return -1;
            }
            while (true) {
                if (m13940r(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    return i3;
                }
                if (i3 == i4) {
                    return -1;
                }
                i3 += i5;
            }
        } else {
            int i6 = bVar.f13658g;
            int i7 = bVar.f13659h;
            int i8 = bVar.f13660i;
            if (i8 >= 0) {
                if (i6 > i7) {
                    return -1;
                }
            } else if (i6 < i7) {
                return -1;
            }
            while (true) {
                if (m13939q((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                    return i6;
                }
                if (i6 == i7) {
                    return -1;
                }
                i6 += i8;
            }
        }
    }

    /* renamed from: j */
    public static /* synthetic */ int m13932j(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m13931i(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: k */
    public static int m13933k(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C6888i.m12438e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m13935m(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: l */
    public static /* synthetic */ int m13934l(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m13930h(charSequence, str, i, z);
    }

    /* renamed from: m */
    public static final int m13935m(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C6888i.m12438e(charSequence, "$this$indexOfAny");
        C6888i.m12438e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int g = m13929g(charSequence);
            if (i > g) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (C5266a.m9825J0(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return i;
                }
                if (i == g) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(C5266a.m9906X3(cArr), i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m13936n(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "$this$indices"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            d.a0.d r0 = new d.a0.d
            int r3 = r4.length()
            int r3 = r3 + -1
            r0.<init>(r1, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002b
            goto L_0x0049
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            r3 = r0
            d.a0.c r3 = (p298d.p333a0.C6757c) r3
            boolean r3 = r3.f13662h
            if (r3 == 0) goto L_0x0049
            r3 = r0
            d.t.v r3 = (p298d.p334t.C6804v) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = p005b.p291q.p292a.C5266a.m9851N2(r3)
            if (r3 != 0) goto L_0x002f
            r4 = r1
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            if (r4 == 0) goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p415c0.C7694h.m13936n(java.lang.CharSequence):boolean");
    }

    /* renamed from: o */
    public static int m13937o(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = m13929g(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C6888i.m12438e(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        C6888i.m12438e(charSequence, "$this$lastIndexOfAny");
        C6888i.m12438e(cArr, "chars");
        if (z || !(charSequence instanceof String)) {
            int g = m13929g(charSequence);
            if (i > g) {
                i = g;
            }
            while (i >= 0) {
                char charAt = charSequence.charAt(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= 1) {
                        z2 = false;
                        break;
                    } else if (C5266a.m9825J0(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C5266a.m9906X3(cArr), i);
    }

    /* renamed from: p */
    public static int m13938p(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = m13929g(charSequence);
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        C6888i.m12438e(charSequence, "$this$lastIndexOf");
        C6888i.m12438e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? m13931i(charSequence, str, i3, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    /* renamed from: q */
    public static final boolean m13939q(String str, int i, String str2, int i2, int i3, boolean z) {
        C6888i.m12438e(str, "$this$regionMatches");
        C6888i.m12438e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: r */
    public static final boolean m13940r(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C6888i.m12438e(charSequence, "$this$regionMatchesImpl");
        C6888i.m12438e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C5266a.m9825J0(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public static final String m13941s(String str, CharSequence charSequence) {
        C6888i.m12438e(str, "$this$removePrefix");
        C6888i.m12438e(charSequence, "prefix");
        C6888i.m12438e(str, "$this$startsWith");
        C6888i.m12438e(charSequence, "prefix");
        if (!m13910A(str, (String) charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: t */
    public static final String m13942t(CharSequence charSequence, int i) {
        C6888i.m12438e(charSequence, "$this$repeat");
        int i2 = 1;
        if (i >= 0) {
            if (i != 0) {
                if (i == 1) {
                    return charSequence.toString();
                }
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i);
                        if (1 <= i) {
                            while (true) {
                                sb.append(charSequence);
                                if (i2 == i) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        String sb2 = sb.toString();
                        C6888i.m12437d(sb2, "sb.toString()");
                        return sb2;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i3 = 0; i3 < i; i3++) {
                        cArr[i3] = charAt;
                    }
                    return new String(cArr);
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }

    /* renamed from: u */
    public static String m13943u(String str, char c, char c2, boolean z, int i) {
        String str2;
        String str3;
        if ((i & 4) != 0) {
            z = false;
        }
        C6888i.m12438e(str, "$this$replace");
        if (!z) {
            str3 = str.replace(c, c2);
            str2 = "(this as java.lang.Strin…replace(oldChar, newChar)";
        } else {
            StringBuilder sb = new StringBuilder(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (C5266a.m9825J0(charAt, c, z)) {
                    charAt = c2;
                }
                sb.append(charAt);
            }
            str3 = sb.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        C6888i.m12437d(str3, str2);
        return str3;
    }

    /* renamed from: v */
    public static String m13944v(String str, String str2, String str3, boolean z, int i) {
        int i2 = 0;
        if ((i & 4) != 0) {
            z = false;
        }
        C6888i.m12438e(str, "$this$replace");
        C6888i.m12438e(str2, "oldValue");
        C6888i.m12438e(str3, "newValue");
        int h = m13930h(str, str2, 0, z);
        if (h < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = 1;
        if (length >= 1) {
            i3 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i2, h);
                sb.append(str3);
                i2 = h + length;
                if (h >= str.length() || (h = m13930h(str, str2, h + i3, z)) <= 0) {
                    sb.append(str, i2, str.length());
                    String sb2 = sb.toString();
                    C6888i.m12437d(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i2, h);
                sb.append(str3);
                i2 = h + length;
                break;
            } while ((h = m13930h(str, str2, h + i3, z)) <= 0);
            sb.append(str, i2, str.length());
            String sb22 = sb.toString();
            C6888i.m12437d(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: w */
    public static List m13945w(CharSequence charSequence, char[] cArr, boolean z, int i, int i2) {
        int i3 = 0;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C6888i.m12438e(charSequence, "$this$split");
        C6888i.m12438e(cArr, "delimiters");
        int i4 = 10;
        boolean z2 = true;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            if (i >= 0) {
                int h = m13930h(charSequence, valueOf, 0, z);
                if (h == -1 || i == 1) {
                    return C5266a.m9910Y2(charSequence.toString());
                }
                if (i <= 0) {
                    z2 = false;
                }
                if (z2 && i <= 10) {
                    i4 = i;
                }
                ArrayList arrayList = new ArrayList(i4);
                do {
                    arrayList.add(charSequence.subSequence(i3, h).toString());
                    i3 = valueOf.length() + h;
                    if ((z2 && arrayList.size() == i - 1) || (h = m13930h(charSequence, valueOf, i3, z)) == -1) {
                        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                    }
                    arrayList.add(charSequence.subSequence(i3, h).toString());
                    i3 = valueOf.length() + h;
                    break;
                } while ((h = m13930h(charSequence, valueOf, i3, z)) == -1);
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                return arrayList;
            }
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
        }
        if (i < 0) {
            z2 = false;
        }
        if (z2) {
            C7686b bVar = new C7686b(charSequence, 0, i, new C7695i(cArr, z));
            C6888i.m12438e(bVar, "$this$asIterable");
            C7677q qVar = new C7677q(bVar);
            ArrayList arrayList2 = new ArrayList(C5266a.m9892V(qVar, 10));
            Iterator it = qVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(m13911B(charSequence, (C6758d) it.next()));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    /* renamed from: x */
    public static final boolean m13946x(String str, String str2, int i, boolean z) {
        C6888i.m12438e(str, "$this$startsWith");
        C6888i.m12438e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m13939q(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: y */
    public static final boolean m13947y(String str, String str2, boolean z) {
        C6888i.m12438e(str, "$this$startsWith");
        C6888i.m12438e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m13939q(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m13948z(String str, String str2, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m13946x(str, str2, i, z);
    }
}
