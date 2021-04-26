package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.o */
public final class C4538o extends C4542s {

    /* renamed from: b */
    public static final int[] f8465b = {1, 1, 1, 1};

    /* renamed from: c */
    public static final int[] f8466c = {3, 1, 1};

    /* renamed from: d */
    public static final int[][] f8467d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (aVar == C4484a.ITF) {
            return super.mo16167a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: d */
    public boolean[] mo16166d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            C4542s.m8358c(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b = C4542s.m8357b(zArr, 0, f8465b, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[10];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = f8467d;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                b += C4542s.m8357b(zArr, b, iArr, true);
            }
            C4542s.m8357b(zArr, b, f8466c, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
