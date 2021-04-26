package p005b.p096l.p232f.p235b0;

import androidx.exifinterface.media.ExifInterface;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4492c;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4621o;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4624r;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p235b0.p236b.C4489a;
import p005b.p096l.p232f.p235b0.p236b.C4490b;
import p005b.p096l.p232f.p235b0.p236b.C4491c;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.b0.a */
public final class C4488a implements C4621o {

    /* renamed from: b */
    public static final C4625s[] f8355b = new C4625s[0];

    /* renamed from: a */
    public final C4491c f8356a = new C4491c();

    /* renamed from: a */
    public C4623q mo16152a(C4492c cVar, Map<C4577e, ?> map) {
        int i;
        String str;
        StringBuilder sb;
        int i2;
        C4658b a = cVar.mo16156a();
        int i3 = a.f8787g;
        int i4 = a.f8788h;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < a.f8788h; i8++) {
            int i9 = 0;
            while (true) {
                int i10 = a.f8789i;
                if (i9 >= i10) {
                    break;
                }
                int i11 = a.f8790j[(i10 * i8) + i9];
                if (i11 != 0) {
                    if (i8 < i4) {
                        i4 = i8;
                    }
                    if (i8 > i7) {
                        i7 = i8;
                    }
                    int i12 = i9 << 5;
                    if (i12 < i3) {
                        int i13 = 0;
                        while ((i11 << (31 - i13)) == 0) {
                            i13++;
                        }
                        int i14 = i13 + i12;
                        if (i14 < i3) {
                            i3 = i14;
                        }
                    }
                    if (i12 + 31 > i6) {
                        int i15 = 31;
                        while ((i11 >>> i15) == 0) {
                            i15--;
                        }
                        int i16 = i12 + i15;
                        if (i16 > i6) {
                            i6 = i16;
                        }
                    }
                }
                i9++;
            }
        }
        int[] iArr = (i6 < i3 || i7 < i4) ? null : new int[]{i3, i4, (i6 - i3) + 1, (i7 - i4) + 1};
        if (iArr != null) {
            int i17 = iArr[0];
            int i18 = iArr[1];
            int i19 = iArr[2];
            int i20 = iArr[3];
            int i21 = (30 + 31) / 32;
            int[] iArr2 = new int[(i21 * 33)];
            for (int i22 = 0; i22 < 33; i22++) {
                int i23 = (((i20 / 2) + (i22 * i20)) / 33) + i18;
                for (int i24 = 0; i24 < 30; i24++) {
                    if (a.mo16333b((((((i22 & 1) * i19) / 2) + ((i19 / 2) + (i24 * i19))) / 30) + i17, i23)) {
                        int i25 = (i24 / 32) + (i22 * i21);
                        iArr2[i25] = (1 << (i24 & 31)) | iArr2[i25];
                    }
                }
            }
            C4491c cVar2 = this.f8356a;
            Objects.requireNonNull(cVar2);
            byte[] bArr = new byte[144];
            for (int i26 = 0; i26 < 33; i26++) {
                int[] iArr3 = C4489a.f8357a[i26];
                for (int i27 = 0; i27 < 30; i27++) {
                    int i28 = iArr3[i27];
                    if (i28 >= 0) {
                        if (((iArr2[(i27 / 32) + (i26 * i21)] >>> (i27 & 31)) & 1) != 0) {
                            int i29 = i28 / 6;
                            bArr[i29] = (byte) (((byte) (1 << (5 - (i28 % 6)))) | bArr[i29]);
                        }
                    }
                }
            }
            cVar2.mo16155a(bArr, 0, 10, 10, 0);
            byte b = bArr[0] & 15;
            if (b == 2 || b == 3 || b == 4) {
                C4491c cVar3 = cVar2;
                byte[] bArr2 = bArr;
                cVar3.mo16155a(bArr2, 20, 84, 40, 1);
                cVar3.mo16155a(bArr2, 20, 84, 40, 2);
                i = 94;
            } else if (b == 5) {
                C4491c cVar4 = cVar2;
                byte[] bArr3 = bArr;
                cVar4.mo16155a(bArr3, 20, 68, 56, 1);
                cVar4.mo16155a(bArr3, 20, 68, 56, 2);
                i = 78;
            } else {
                throw C4614h.m8506a();
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr, 0, bArr4, 0, 10);
            System.arraycopy(bArr, 20, bArr4, 10, i - 10);
            StringBuilder sb2 = new StringBuilder(144);
            if (b == 2 || b == 3) {
                if (b == 2) {
                    str = new DecimalFormat("0000000000".substring(0, C4490b.m8247a(bArr4, new byte[]{39, 40, 41, ExifInterface.START_CODE, 31, 32}))).format((long) C4490b.m8247a(bArr4, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
                } else {
                    String[] strArr = C4490b.f8358a;
                    str = String.valueOf(new char[]{strArr[0].charAt(C4490b.m8247a(bArr4, new byte[]{39, 40, 41, ExifInterface.START_CODE, 31, 32})), strArr[0].charAt(C4490b.m8247a(bArr4, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(C4490b.m8247a(bArr4, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(C4490b.m8247a(bArr4, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(C4490b.m8247a(bArr4, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(C4490b.m8247a(bArr4, new byte[]{9, 10, 11, 12, 1, 2}))});
                }
                DecimalFormat decimalFormat = new DecimalFormat("000");
                String format = decimalFormat.format((long) C4490b.m8247a(bArr4, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
                String format2 = decimalFormat.format((long) C4490b.m8247a(bArr4, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
                sb2.append(C4490b.m8248b(bArr4, 10, 84));
                if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                    i5 = 9;
                    sb = new StringBuilder();
                } else {
                    sb = new StringBuilder();
                }
                sb.append(str);
                sb.append(29);
                sb.append(format);
                sb.append(29);
                sb.append(format2);
                sb.append(29);
                sb2.insert(i5, sb.toString());
            } else {
                if (b == 4) {
                    i2 = 93;
                } else if (b == 5) {
                    i2 = 77;
                }
                sb2.append(C4490b.m8248b(bArr4, 1, i2));
            }
            String sb3 = sb2.toString();
            String valueOf = String.valueOf(b);
            C4623q qVar = new C4623q(sb3, bArr4, f8355b, C4484a.MAXICODE);
            if (valueOf != null) {
                qVar.mo16283b(C4624r.ERROR_CORRECTION_LEVEL, valueOf);
            }
            return qVar;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: b */
    public C4623q mo16153b(C4492c cVar) {
        return mo16152a(cVar, (Map<C4577e, ?>) null);
    }

    /* renamed from: c */
    public void mo16154c() {
    }
}
