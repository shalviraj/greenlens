package p005b.p096l.p232f.p237c0;

import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.a0 */
public final class C4494a0 extends C4548y {

    /* renamed from: j */
    public static final int[] f8368j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    public static final int[][] f8369k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    public final int[] f8370i = new int[4];

    /* renamed from: s */
    public static String m8256s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* renamed from: i */
    public boolean mo16162i(String str) {
        return C4548y.m8372j(m8256s(str));
    }

    /* renamed from: l */
    public int[] mo16163l(C4657a aVar, int i) {
        int[] iArr = f8368j;
        return C4548y.m8374o(aVar, i, true, iArr, new int[iArr.length]);
    }

    /* renamed from: m */
    public int mo16164m(C4657a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f8370i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.f8786h;
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int k = C4548y.m8373k(aVar, iArr2, i2, C4548y.f8487h);
            sb.append((char) ((k % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        for (int i6 = 0; i6 <= 1; i6++) {
            for (int i7 = 0; i7 < 10; i7++) {
                if (i3 == f8369k[i6][i7]) {
                    sb.insert(0, (char) (i6 + 48));
                    sb.append((char) (i7 + 48));
                    return i2;
                }
            }
        }
        throw C4619m.f8685i;
    }

    /* renamed from: q */
    public C4484a mo16165q() {
        return C4484a.UPC_E;
    }
}
