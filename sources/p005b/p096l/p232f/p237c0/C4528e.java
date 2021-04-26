package p005b.p096l.p232f.p237c0;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4550d;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.e */
public final class C4528e extends C4541r {

    /* renamed from: d */
    public static final int[] f8446d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    public final boolean f8447a;

    /* renamed from: b */
    public final StringBuilder f8448b = new StringBuilder(20);

    /* renamed from: c */
    public final int[] f8449c = new int[9];

    public C4528e(boolean z) {
        this.f8447a = z;
    }

    /* renamed from: i */
    public static int m8317i(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        char c;
        C4657a aVar2 = aVar;
        int[] iArr = this.f8449c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f8448b;
        sb.setLength(0);
        int i2 = aVar2.f8786h;
        int g = aVar2.mo16324g(0);
        int length = iArr.length;
        boolean z = false;
        int i3 = 0;
        int i4 = g;
        while (g < i2) {
            if (aVar2.mo16323f(g) != z) {
                iArr[i3] = iArr[i3] + 1;
                int i5 = i;
            } else {
                if (i3 != length - 1) {
                    int i6 = i;
                    i3++;
                } else if (m8317i(iArr) != 148 || !aVar2.mo16328j(Math.max(0, i4 - ((g - i4) / 2)), i4, false)) {
                    int i7 = i;
                    i4 += iArr[0] + iArr[1];
                    int i8 = i3 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i8);
                    iArr[i8] = 0;
                    iArr[i3] = 0;
                    i3 = i8;
                } else {
                    int[] iArr2 = {i4, g};
                    int g2 = aVar2.mo16324g(iArr2[1]);
                    int i9 = aVar2.f8786h;
                    while (true) {
                        C4541r.m8350g(aVar2, g2, iArr);
                        int i10 = m8317i(iArr);
                        if (i10 >= 0) {
                            int i11 = 0;
                            while (true) {
                                int[] iArr3 = f8446d;
                                if (i11 < iArr3.length) {
                                    if (iArr3[i11] == i10) {
                                        c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
                                        break;
                                    }
                                    i11++;
                                } else if (i10 == 148) {
                                    c = '*';
                                } else {
                                    throw C4619m.f8685i;
                                }
                            }
                            sb.append(c);
                            int i12 = g2;
                            for (int i13 : iArr) {
                                i12 += i13;
                            }
                            int g3 = aVar2.mo16324g(i12);
                            if (c == '*') {
                                sb.setLength(sb.length() - 1);
                                int i14 = 0;
                                for (int i15 : iArr) {
                                    i14 += i15;
                                }
                                int i16 = (g3 - g2) - i14;
                                if (g3 == i9 || (i16 << 1) >= i14) {
                                    if (this.f8447a) {
                                        int length2 = sb.length() - 1;
                                        int i17 = 0;
                                        for (int i18 = 0; i18 < length2; i18++) {
                                            i17 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f8448b.charAt(i18));
                                        }
                                        if (sb.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i17 % 43)) {
                                            sb.setLength(length2);
                                        } else {
                                            throw C4550d.m8384a();
                                        }
                                    }
                                    if (sb.length() != 0) {
                                        float f = (float) i;
                                        return new C4623q(sb.toString(), (byte[]) null, new C4625s[]{new C4625s(((float) (iArr2[1] + iArr2[0])) / 2.0f, f), new C4625s((((float) i14) / 2.0f) + ((float) g2), f)}, C4484a.CODE_39);
                                    }
                                    throw C4619m.f8685i;
                                }
                                throw C4619m.f8685i;
                            }
                            int i19 = i;
                            g2 = g3;
                        } else {
                            throw C4619m.f8685i;
                        }
                    }
                }
                iArr[i3] = 1;
                z = !z;
            }
            g++;
        }
        throw C4619m.f8685i;
    }
}
