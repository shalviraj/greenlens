package p005b.p096l.p232f.p237c0;

import java.util.Arrays;
import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4550d;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4622p;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4624r;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.C4626t;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.y */
public abstract class C4548y extends C4541r {

    /* renamed from: d */
    public static final int[] f8483d = {1, 1, 1};

    /* renamed from: e */
    public static final int[] f8484e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[] f8485f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    public static final int[][] f8486g;

    /* renamed from: h */
    public static final int[][] f8487h;

    /* renamed from: a */
    public final StringBuilder f8488a = new StringBuilder(20);

    /* renamed from: b */
    public final C4547x f8489b = new C4547x();

    /* renamed from: c */
    public final C4536m f8490c = new C4536m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f8486g = iArr;
        int[][] iArr2 = new int[20][];
        f8487h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f8486g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f8487h[i] = iArr4;
        }
    }

    /* renamed from: j */
    public static boolean m8372j(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m8376r(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* renamed from: k */
    public static int m8373k(C4657a aVar, int[] iArr, int i, int[][] iArr2) {
        C4541r.m8350g(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = C4541r.m8349f(iArr, iArr2[i3], 0.7f);
            if (f2 < f) {
                i2 = i3;
                f = f2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: o */
    public static int[] m8374o(C4657a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int i2 = aVar.f8786h;
        int h = z ? aVar.mo16325h(i) : aVar.mo16324g(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = h;
        while (h < i2) {
            if (aVar.mo16323f(h) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C4541r.m8349f(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, h};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3 = i5;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            h++;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: p */
    public static int[] m8375p(C4657a aVar) {
        int[] iArr = new int[f8483d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f8483d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m8374o(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo16328j(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: r */
    public static int m8376r(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C4614h.m8506a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C4614h.m8506a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        return mo16206n(i, aVar, m8375p(aVar), map);
    }

    /* renamed from: i */
    public boolean mo16162i(String str) {
        return m8372j(str);
    }

    /* renamed from: l */
    public int[] mo16163l(C4657a aVar, int i) {
        int[] iArr = f8483d;
        return m8374o(aVar, i, false, iArr, new int[iArr.length]);
    }

    /* renamed from: m */
    public abstract int mo16164m(C4657a aVar, int[] iArr, StringBuilder sb);

    /* renamed from: n */
    public C4623q mo16206n(int i, C4657a aVar, int[] iArr, Map<C4577e, ?> map) {
        int i2;
        boolean z;
        String str = null;
        C4626t tVar = map == null ? null : (C4626t) map.get(C4577e.NEED_RESULT_POINT_CALLBACK);
        if (tVar != null) {
            tVar.mo16288a(new C4625s(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f8488a;
        sb.setLength(0);
        int m = mo16164m(aVar, iArr, sb);
        if (tVar != null) {
            tVar.mo16288a(new C4625s((float) m, (float) i));
        }
        int[] l = mo16163l(aVar, m);
        if (tVar != null) {
            tVar.mo16288a(new C4625s(((float) (l[0] + l[1])) / 2.0f, (float) i));
        }
        int i3 = l[1];
        int i4 = (i3 - l[0]) + i3;
        if (i4 >= aVar.f8786h || !aVar.mo16328j(i3, i4, false)) {
            throw C4619m.f8685i;
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C4614h.m8506a();
        } else if (mo16162i(sb2)) {
            C4484a q = mo16165q();
            float f = (float) i;
            C4623q qVar = new C4623q(sb2, (byte[]) null, new C4625s[]{new C4625s(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C4625s(((float) (l[1] + l[0])) / 2.0f, f)}, q);
            try {
                C4623q a = this.f8489b.mo16208a(i, aVar, l[1]);
                qVar.mo16283b(C4624r.UPC_EAN_EXTENSION, a.f8691a);
                qVar.mo16282a(a.f8695e);
                C4625s[] sVarArr = a.f8693c;
                C4625s[] sVarArr2 = qVar.f8693c;
                if (sVarArr2 == null) {
                    qVar.f8693c = sVarArr;
                } else if (sVarArr != null && sVarArr.length > 0) {
                    C4625s[] sVarArr3 = new C4625s[(sVarArr2.length + sVarArr.length)];
                    System.arraycopy(sVarArr2, 0, sVarArr3, 0, sVarArr2.length);
                    System.arraycopy(sVarArr, 0, sVarArr3, sVarArr2.length, sVarArr.length);
                    qVar.f8693c = sVarArr3;
                }
                i2 = a.f8691a.length();
            } catch (C4622p unused) {
                i2 = 0;
            }
            int[] iArr2 = map == null ? null : (int[]) map.get(C4577e.ALLOWED_EAN_EXTENSIONS);
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        z = true;
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C4619m.f8685i;
                }
            }
            if (q == C4484a.EAN_13 || q == C4484a.UPC_A) {
                C4536m mVar = this.f8490c;
                mVar.mo16202b();
                int parseInt = Integer.parseInt(sb2.substring(0, 3));
                int size = mVar.f8458a.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        int[] iArr3 = mVar.f8458a.get(i6);
                        int i7 = iArr3[0];
                        if (parseInt < i7) {
                            break;
                        }
                        if (iArr3.length != 1) {
                            i7 = iArr3[1];
                        }
                        if (parseInt <= i7) {
                            str = mVar.f8459b.get(i6);
                            break;
                        }
                        i6++;
                    } else {
                        break;
                    }
                }
                if (str != null) {
                    qVar.mo16283b(C4624r.POSSIBLE_COUNTRY, str);
                }
            }
            return qVar;
        } else {
            throw C4550d.m8384a();
        }
    }

    /* renamed from: q */
    public abstract C4484a mo16165q();
}
