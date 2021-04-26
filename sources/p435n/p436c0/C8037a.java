package p435n.p436c0;

import androidx.exifinterface.media.ExifInterface;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7685a;
import p435n.C8040e;
import p435n.C8054q;
import p435n.C8061v;

/* renamed from: n.c0.a */
public final class C8037a {

    /* renamed from: a */
    public static final byte[] f16135a;

    static {
        C6888i.m12438e("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(C7685a.f15210a);
        C6888i.m12437d(bytes, "(this as java.lang.String).getBytes(charset)");
        f16135a = bytes;
    }

    /* renamed from: a */
    public static final boolean m14744a(C8061v vVar, int i, byte[] bArr, int i2, int i3) {
        C6888i.m12438e(vVar, "segment");
        C6888i.m12438e(bArr, "bytes");
        int i4 = vVar.f16185c;
        byte[] bArr2 = vVar.f16183a;
        while (i2 < i3) {
            if (i == i4) {
                vVar = vVar.f16188f;
                C6888i.m12436c(vVar);
                byte[] bArr3 = vVar.f16183a;
                int i5 = vVar.f16184b;
                bArr2 = bArr3;
                i = i5;
                i4 = vVar.f16185c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: b */
    public static final String m14745b(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (eVar.mo25891N(j2) == ((byte) 13)) {
                String o0 = eVar.mo25921o0(j2);
                eVar.skip(2);
                return o0;
            }
        }
        String o02 = eVar.mo25921o0(j);
        eVar.skip(1);
        return o02;
    }

    /* renamed from: c */
    public static final int m14746c(C8040e eVar, C8054q qVar, boolean z) {
        int i;
        int i2;
        int i3;
        C8061v vVar;
        int i4;
        C8040e eVar2 = eVar;
        C8054q qVar2 = qVar;
        C6888i.m12438e(eVar2, "$this$selectPrefix");
        C6888i.m12438e(qVar2, "options");
        C8061v vVar2 = eVar2.f16139g;
        if (vVar2 != null) {
            byte[] bArr = vVar2.f16183a;
            int i5 = vVar2.f16184b;
            int i6 = vVar2.f16185c;
            int[] iArr = qVar2.f16167h;
            C8061v vVar3 = vVar2;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (vVar3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = (i10 * -1) + i11;
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & ExifInterface.MARKER) != iArr[i11]) {
                            return i7;
                        }
                        boolean z2 = i15 == i13;
                        if (i14 == i6) {
                            C6888i.m12436c(vVar3);
                            C8061v vVar4 = vVar3.f16188f;
                            C6888i.m12436c(vVar4);
                            i4 = vVar4.f16184b;
                            byte[] bArr2 = vVar4.f16183a;
                            i3 = vVar4.f16185c;
                            if (vVar4 != vVar2) {
                                byte[] bArr3 = bArr2;
                                vVar = vVar4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                vVar = null;
                            }
                        } else {
                            C8061v vVar5 = vVar3;
                            i3 = i6;
                            i4 = i14;
                            vVar = vVar5;
                        }
                        if (z2) {
                            i2 = iArr[i15];
                            i = i4;
                            i6 = i3;
                            vVar3 = vVar;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        vVar3 = vVar;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & ExifInterface.MARKER;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == iArr[i11]) {
                            i2 = iArr[i11 + i10];
                            if (i == i6) {
                                vVar3 = vVar3.f16188f;
                                C6888i.m12436c(vVar3);
                                i = vVar3.f16184b;
                                bArr = vVar3.f16183a;
                                i6 = vVar3.f16185c;
                                if (vVar3 == vVar2) {
                                    vVar3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }
}
