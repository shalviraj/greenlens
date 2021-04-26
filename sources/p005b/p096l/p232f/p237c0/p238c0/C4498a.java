package p005b.p096l.p232f.p237c0.p238c0;

import androidx.appcompat.widget.ActivityChooserView;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.p237c0.C4541r;

/* renamed from: b.l.f.c0.c0.a */
public abstract class C4498a extends C4541r {

    /* renamed from: a */
    public final int[] f8376a = new int[4];

    /* renamed from: b */
    public final int[] f8377b;

    /* renamed from: c */
    public final float[] f8378c;

    /* renamed from: d */
    public final float[] f8379d;

    /* renamed from: e */
    public final int[] f8380e;

    /* renamed from: f */
    public final int[] f8381f;

    public C4498a() {
        int[] iArr = new int[8];
        this.f8377b = iArr;
        this.f8378c = new float[4];
        this.f8379d = new float[4];
        this.f8380e = new int[(iArr.length / 2)];
        this.f8381f = new int[(iArr.length / 2)];
    }

    /* renamed from: i */
    public static void m8265i(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: j */
    public static void m8266j(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: k */
    public static boolean m8267k(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static int m8268l(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C4541r.m8349f(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C4619m.f8685i;
    }
}
