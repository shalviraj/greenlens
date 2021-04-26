package p005b.p096l.p232f.p250w.p251d;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.badge.BadgeDrawable;
import java.util.Arrays;
import java.util.List;
import p005b.p040g.p041a.p042e.p043f.C0866h;
import p005b.p040g.p041a.p046h.C0893n;
import p005b.p096l.p097a.p113c.p142g.p143f.C3088l;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.C4622p;
import p005b.p096l.p232f.p250w.C4629a;
import p005b.p096l.p232f.p258y.C4658b;
import p005b.p096l.p232f.p258y.C4661e;
import p005b.p096l.p232f.p258y.p260l.C4668a;
import p005b.p096l.p232f.p258y.p260l.C4670c;
import p005b.p096l.p232f.p258y.p260l.C4672e;
import p005b.p265m.p266a.C4719j;
import p005b.p265m.p266a.p267t.C4748i;
import p005b.p265m.p266a.p267t.C4750k;

/* renamed from: b.l.f.w.d.a */
public final class C4632a {

    /* renamed from: b */
    public static final String[] f8713b = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    public static final String[] f8714c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", C0866h.f730g, C4748i.f9096b, C4719j.f9003k, C4750k.f9100b, C3088l.f5219a, "m", C0893n.f779k, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    public static final String[] f8715d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    public static final String[] f8716e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    public static final String[] f8717f = {"CTRL_PS", " ", "0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    public C4629a f8718a;

    /* renamed from: b.l.f.w.d.a$a */
    public enum C4633a {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: b */
    public static int m8537b(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public C4661e mo16289a(C4629a aVar) {
        int i;
        C4668a aVar2;
        String str;
        C4629a aVar3 = aVar;
        this.f8718a = aVar3;
        C4658b bVar = aVar3.f8835a;
        boolean z = aVar3.f8710c;
        int i2 = aVar3.f8712e;
        int i3 = (z ? 11 : 14) + (i2 << 2);
        int[] iArr = new int[i3];
        int i4 = ((z ? 88 : 112) + (i2 << 4)) * i2;
        boolean[] zArr = new boolean[i4];
        int i5 = 2;
        if (z) {
            for (int i6 = 0; i6 < i3; i6++) {
                iArr[i6] = i6;
            }
        } else {
            int i7 = i3 / 2;
            int i8 = ((((i7 - 1) / 15) * 2) + (i3 + 1)) / 2;
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = (i9 / 15) + i9;
                iArr[(i7 - i9) - 1] = (i8 - i10) - 1;
                iArr[i7 + i9] = i10 + i8 + 1;
            }
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i = 12;
            if (i11 >= i2) {
                break;
            }
            int i13 = (i2 - i11) << i5;
            if (z) {
                i = 9;
            }
            int i14 = i13 + i;
            int i15 = i11 << 1;
            int i16 = (i3 - 1) - i15;
            int i17 = 0;
            while (i17 < i14) {
                int i18 = i17 << 1;
                int i19 = 0;
                while (i19 < i5) {
                    int i20 = i15 + i19;
                    int i21 = i15 + i17;
                    zArr[i12 + i18 + i19] = bVar.mo16333b(iArr[i20], iArr[i21]);
                    int i22 = i16 - i19;
                    zArr[(i14 * 2) + i12 + i18 + i19] = bVar.mo16333b(iArr[i21], iArr[i22]);
                    int i23 = i16 - i17;
                    zArr[(i14 * 4) + i12 + i18 + i19] = bVar.mo16333b(iArr[i22], iArr[i23]);
                    zArr[(i14 * 6) + i12 + i18 + i19] = bVar.mo16333b(iArr[i23], iArr[i20]);
                    i19++;
                    z = z;
                    i2 = i2;
                    i5 = 2;
                }
                int i24 = i2;
                boolean z2 = z;
                i17++;
                i5 = 2;
            }
            boolean z3 = z;
            i12 += i14 << 3;
            i11++;
            i2 = i2;
            i5 = 2;
        }
        C4629a aVar4 = this.f8718a;
        int i25 = aVar4.f8712e;
        int i26 = 8;
        if (i25 <= 2) {
            aVar2 = C4668a.f8861j;
            i = 6;
        } else if (i25 <= 8) {
            aVar2 = C4668a.f8865n;
            i = 8;
        } else if (i25 <= 22) {
            i = 10;
            aVar2 = C4668a.f8860i;
        } else {
            aVar2 = C4668a.f8859h;
        }
        int i27 = aVar4.f8711d;
        int i28 = i4 / i;
        if (i28 >= i27) {
            int i29 = i4 % i;
            int[] iArr2 = new int[i28];
            int i30 = 0;
            while (i30 < i28) {
                iArr2[i30] = m8537b(zArr, i29, i);
                i30++;
                i29 += i;
            }
            try {
                new C4670c(aVar2).mo16363a(iArr2, i28 - i27);
                int i31 = 1;
                int i32 = (1 << i) - 1;
                int i33 = 0;
                int i34 = 0;
                while (i33 < i27) {
                    int i35 = iArr2[i33];
                    if (i35 == 0 || i35 == i32) {
                        throw C4614h.m8506a();
                    }
                    if (i35 == i31 || i35 == i32 - 1) {
                        i34++;
                    }
                    i33++;
                    i31 = 1;
                }
                int i36 = (i27 * i) - i34;
                boolean[] zArr2 = new boolean[i36];
                int i37 = 0;
                for (int i38 = 0; i38 < i27; i38++) {
                    int i39 = iArr2[i38];
                    int i40 = 1;
                    if (i39 == 1 || i39 == i32 - 1) {
                        Arrays.fill(zArr2, i37, (i37 + i) - 1, i39 > 1);
                        i37 = (i - 1) + i37;
                    } else {
                        int i41 = i - 1;
                        while (i41 >= 0) {
                            int i42 = i37 + 1;
                            zArr2[i37] = ((i40 << i41) & i39) != 0;
                            i41--;
                            i37 = i42;
                            i40 = 1;
                        }
                    }
                }
                int i43 = (i36 + 7) / 8;
                byte[] bArr = new byte[i43];
                for (int i44 = 0; i44 < i43; i44++) {
                    int i45 = i44 << 3;
                    int i46 = i36 - i45;
                    bArr[i44] = (byte) (i46 >= 8 ? m8537b(zArr2, i45, 8) : m8537b(zArr2, i45, i46) << (8 - i46));
                }
                C4633a aVar5 = C4633a.UPPER;
                StringBuilder sb = new StringBuilder(20);
                C4633a aVar6 = aVar5;
                C4633a aVar7 = aVar6;
                int i47 = 0;
                while (i47 < i36) {
                    C4633a aVar8 = C4633a.BINARY;
                    if (aVar6 == aVar8) {
                        if (i36 - i47 < 5) {
                            break;
                        }
                        int b = m8537b(zArr2, i47, 5);
                        i47 += 5;
                        if (b == 0) {
                            if (i36 - i47 < 11) {
                                break;
                            }
                            b = m8537b(zArr2, i47, 11) + 31;
                            i47 += 11;
                        }
                        int i48 = 0;
                        while (true) {
                            if (i48 >= b) {
                                break;
                            } else if (i36 - i47 < i26) {
                                i47 = i36;
                                break;
                            } else {
                                sb.append((char) m8537b(zArr2, i47, i26));
                                i47 += 8;
                                i48++;
                            }
                        }
                        aVar6 = aVar7;
                    } else {
                        C4633a aVar9 = C4633a.DIGIT;
                        int i49 = aVar6 == aVar9 ? 4 : 5;
                        if (i36 - i47 < i49) {
                            break;
                        }
                        int b2 = m8537b(zArr2, i47, i49);
                        i47 += i49;
                        int ordinal = aVar6.ordinal();
                        if (ordinal == 0) {
                            str = f8713b[b2];
                        } else if (ordinal == 1) {
                            str = f8714c[b2];
                        } else if (ordinal == 2) {
                            str = f8715d[b2];
                        } else if (ordinal == 3) {
                            str = f8717f[b2];
                        } else if (ordinal == 4) {
                            str = f8716e[b2];
                        } else {
                            throw new IllegalStateException("Bad table");
                        }
                        if (str.startsWith("CTRL_")) {
                            char charAt = str.charAt(5);
                            if (charAt != 'B') {
                                if (charAt != 'D') {
                                    aVar8 = charAt != 'P' ? charAt != 'L' ? charAt != 'M' ? aVar5 : C4633a.MIXED : C4633a.LOWER : C4633a.PUNCT;
                                } else {
                                    aVar8 = aVar9;
                                }
                            }
                            if (str.charAt(6) == 'L') {
                                aVar6 = aVar8;
                            } else {
                                aVar7 = aVar6;
                                aVar6 = aVar8;
                                i26 = 8;
                            }
                        } else {
                            sb.append(str);
                            aVar6 = aVar7;
                        }
                    }
                    aVar7 = aVar6;
                    i26 = 8;
                }
                C4661e eVar = new C4661e(bArr, sb.toString(), (List<byte[]>) null, (String) null);
                eVar.f8827b = i36;
                return eVar;
            } catch (C4672e e) {
                throw (C4622p.f8689g ? new C4614h(e) : C4614h.f8678i);
            }
        } else {
            throw C4614h.m8506a();
        }
    }
}
