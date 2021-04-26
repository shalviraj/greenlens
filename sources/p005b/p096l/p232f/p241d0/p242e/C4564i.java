package p005b.p096l.p232f.p241d0.p242e;

import java.lang.reflect.Array;
import p005b.p096l.p232f.p241d0.C4551a;

/* renamed from: b.l.f.d0.e.i */
public final class C4564i {

    /* renamed from: a */
    public static final float[][] f8534a;

    static {
        int i;
        int length = C4551a.f8493b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f8534a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C4551a.f8493b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f8534a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
