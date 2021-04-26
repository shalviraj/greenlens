package p005b.p096l.p232f.p237c0;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.a */
public final class C4493a extends C4541r {

    /* renamed from: d */
    public static final char[] f8362d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    public static final int[] f8363e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    public static final char[] f8364f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    public final StringBuilder f8365a = new StringBuilder(20);

    /* renamed from: b */
    public int[] f8366b = new int[80];

    /* renamed from: c */
    public int f8367c = 0;

    /* renamed from: i */
    public static boolean m8252i(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        C4657a aVar2 = aVar;
        Map<C4577e, ?> map2 = map;
        Arrays.fill(this.f8366b, 0);
        this.f8367c = 0;
        int h = aVar2.mo16325h(0);
        int i2 = aVar2.f8786h;
        if (h < i2) {
            int i3 = 0;
            boolean z = true;
            while (h < i2) {
                if (aVar2.mo16323f(h) != z) {
                    i3++;
                } else {
                    mo16160j(i3);
                    z = !z;
                    i3 = 1;
                }
                h++;
            }
            mo16160j(i3);
            int i4 = 1;
            while (i4 < this.f8367c) {
                int k = mo16161k(i4);
                if (k != -1 && m8252i(f8364f, f8362d[k])) {
                    int i5 = 0;
                    for (int i6 = i4; i6 < i4 + 7; i6++) {
                        i5 += this.f8366b[i6];
                    }
                    if (i4 == 1 || this.f8366b[i4 - 1] >= i5 / 2) {
                        this.f8365a.setLength(0);
                        int i7 = i4;
                        while (true) {
                            int k2 = mo16161k(i7);
                            if (k2 != -1) {
                                this.f8365a.append((char) k2);
                                i7 += 8;
                                if ((this.f8365a.length() <= 1 || !m8252i(f8364f, f8362d[k2])) && i7 < this.f8367c) {
                                    int i8 = i;
                                }
                            } else {
                                throw C4619m.f8685i;
                            }
                        }
                        int i9 = i7 - 1;
                        int i10 = this.f8366b[i9];
                        int i11 = 0;
                        for (int i12 = -8; i12 < -1; i12++) {
                            i11 += this.f8366b[i7 + i12];
                        }
                        if (i7 >= this.f8367c || i10 >= i11 / 2) {
                            int[] iArr = {0, 0, 0, 0};
                            int[] iArr2 = {0, 0, 0, 0};
                            int length = this.f8365a.length() - 1;
                            int i13 = i4;
                            int i14 = 0;
                            while (true) {
                                int i15 = f8363e[this.f8365a.charAt(i14)];
                                for (int i16 = 6; i16 >= 0; i16--) {
                                    int i17 = (i16 & 1) + ((i15 & 1) << 1);
                                    iArr[i17] = iArr[i17] + this.f8366b[i13 + i16];
                                    iArr2[i17] = iArr2[i17] + 1;
                                    i15 >>= 1;
                                }
                                if (i14 >= length) {
                                    break;
                                }
                                i13 += 8;
                                i14++;
                            }
                            float[] fArr = new float[4];
                            float[] fArr2 = new float[4];
                            int i18 = 0;
                            for (int i19 = 2; i18 < i19; i19 = 2) {
                                fArr2[i18] = 0.0f;
                                int i20 = i18 + 2;
                                fArr2[i20] = ((((float) iArr[i20]) / ((float) iArr2[i20])) + (((float) iArr[i18]) / ((float) iArr2[i18]))) / 2.0f;
                                fArr[i18] = fArr2[i20];
                                fArr[i20] = ((((float) iArr[i20]) * 2.0f) + 1.5f) / ((float) iArr2[i20]);
                                i18++;
                            }
                            int i21 = i4;
                            int i22 = 0;
                            loop8:
                            while (true) {
                                int i23 = f8363e[this.f8365a.charAt(i22)];
                                int i24 = 6;
                                while (i24 >= 0) {
                                    int i25 = (i24 & 1) + ((i23 & 1) << 1);
                                    float f = (float) this.f8366b[i21 + i24];
                                    if (f >= fArr2[i25] && f <= fArr[i25]) {
                                        i23 >>= 1;
                                        i24--;
                                    }
                                }
                                if (i22 < length) {
                                    i21 += 8;
                                    i22++;
                                } else {
                                    for (int i26 = 0; i26 < this.f8365a.length(); i26++) {
                                        StringBuilder sb = this.f8365a;
                                        sb.setCharAt(i26, f8362d[sb.charAt(i26)]);
                                    }
                                    char charAt = this.f8365a.charAt(0);
                                    char[] cArr = f8364f;
                                    if (m8252i(cArr, charAt)) {
                                        StringBuilder sb2 = this.f8365a;
                                        if (!m8252i(cArr, sb2.charAt(sb2.length() - 1))) {
                                            throw C4619m.f8685i;
                                        } else if (this.f8365a.length() > 3) {
                                            if (map2 == null || !map2.containsKey(C4577e.RETURN_CODABAR_START_END)) {
                                                StringBuilder sb3 = this.f8365a;
                                                sb3.deleteCharAt(sb3.length() - 1);
                                                this.f8365a.deleteCharAt(0);
                                            }
                                            int i27 = 0;
                                            for (int i28 = 0; i28 < i4; i28++) {
                                                i27 += this.f8366b[i28];
                                            }
                                            float f2 = (float) i27;
                                            while (i4 < i9) {
                                                i27 += this.f8366b[i4];
                                                i4++;
                                            }
                                            float f3 = (float) i;
                                            return new C4623q(this.f8365a.toString(), (byte[]) null, new C4625s[]{new C4625s(f2, f3), new C4625s((float) i27, f3)}, C4484a.CODABAR);
                                        } else {
                                            throw C4619m.f8685i;
                                        }
                                    } else {
                                        throw C4619m.f8685i;
                                    }
                                }
                            }
                            throw C4619m.f8685i;
                        }
                        throw C4619m.f8685i;
                    }
                }
                int i29 = i;
                i4 += 2;
            }
            throw C4619m.f8685i;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: j */
    public final void mo16160j(int i) {
        int[] iArr = this.f8366b;
        int i2 = this.f8367c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f8367c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f8366b = iArr2;
        }
    }

    /* renamed from: k */
    public final int mo16161k(int i) {
        int i2 = i + 7;
        if (i2 >= this.f8367c) {
            return -1;
        }
        int[] iArr = this.f8366b;
        int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f8363e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }
}
