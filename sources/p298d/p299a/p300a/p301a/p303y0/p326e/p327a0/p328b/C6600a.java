package p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b;

import androidx.exifinterface.media.ExifInterface;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.a0.b.a */
public class C6600a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m11786a(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? 2 : 3)];
        if (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i2 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i2 == 3) {
            objArr[1] = "encode8to7";
        } else if (i2 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i2 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i2 == 10) {
            objArr[1] = "dropMarker";
        } else if (i2 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static byte[] m11787b(String[] strArr) {
        int i;
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] c = m11788c(strArr);
                    C6888i.m12438e(c, "strings");
                    int i2 = 0;
                    for (String length : c) {
                        i2 += length.length();
                    }
                    byte[] bArr = new byte[i2];
                    int length2 = c.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length2) {
                        String str = c[i3];
                        i3++;
                        int length3 = str.length() - 1;
                        if (length3 >= 0) {
                            int i5 = 0;
                            while (true) {
                                int i6 = i5 + 1;
                                i = i4 + 1;
                                bArr[i4] = (byte) str.charAt(i5);
                                if (i5 == length3) {
                                    break;
                                }
                                i5 = i6;
                                i4 = i;
                            }
                            i4 = i;
                        }
                    }
                    return bArr;
                } else if (charAt == 65535) {
                    strArr = m11788c(strArr);
                }
            }
            int i7 = 0;
            for (String length4 : strArr) {
                i7 += length4.length();
            }
            byte[] bArr2 = new byte[i7];
            int i8 = 0;
            for (String str2 : strArr) {
                int length5 = str2.length();
                int i9 = 0;
                while (i9 < length5) {
                    bArr2[i8] = (byte) str2.charAt(i9);
                    i9++;
                    i8++;
                }
            }
            for (int i10 = 0; i10 < i7; i10++) {
                bArr2[i10] = (byte) ((bArr2[i10] + Byte.MAX_VALUE) & 127);
            }
            int i11 = (i7 * 7) / 8;
            byte[] bArr3 = new byte[i11];
            int i12 = 0;
            byte b = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                i12++;
                int i14 = b + 1;
                bArr3[i13] = (byte) (((bArr2[i12] & ExifInterface.MARKER) >>> b) + ((bArr2[i12] & ((1 << i14) - 1)) << (7 - b)));
                if (b == 6) {
                    i12++;
                    b = 0;
                } else {
                    b = i14;
                }
            }
            return bArr3;
        }
        m11786a(7);
        throw null;
    }

    /* renamed from: c */
    public static String[] m11788c(String[] strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
