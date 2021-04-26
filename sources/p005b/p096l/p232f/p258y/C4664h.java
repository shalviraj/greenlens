package p005b.p096l.p232f.p258y;

import p005b.p096l.p232f.C4487b;
import p005b.p096l.p232f.C4616j;
import p005b.p096l.p232f.C4619m;

/* renamed from: b.l.f.y.h */
public final class C4664h extends C4487b {

    /* renamed from: e */
    public static final byte[] f8837e = new byte[0];

    /* renamed from: b */
    public byte[] f8838b = f8837e;

    /* renamed from: c */
    public final int[] f8839c = new int[32];

    /* renamed from: d */
    public C4658b f8840d;

    public C4664h(C4616j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public static int m8587a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = -1;
            int i13 = i11;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = (i2 - iArr[i11]) * (i3 - i11) * i14 * i14;
                if (i15 > i12) {
                    i13 = i11;
                    i12 = i15;
                }
                i11--;
            }
            return i13 << 3;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: b */
    public final void mo16346b(int i) {
        if (this.f8838b.length < i) {
            this.f8838b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f8839c[i2] = 0;
        }
    }
}
