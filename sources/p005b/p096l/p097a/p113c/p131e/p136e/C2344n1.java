package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.exifinterface.media.ExifInterface;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.n1 */
public final class C2344n1 {

    /* renamed from: a */
    public static final C2296l1 f4087a = new C2296l1();

    static {
        if (C2272k1.f3997g && C2272k1.f3996f) {
            int i = C2119dm.f3742a;
        }
    }

    /* renamed from: a */
    public static boolean m3788a(byte[] bArr, int i, int i2) {
        return f4087a.mo12784a(bArr, i, i2);
    }

    /* renamed from: b */
    public static int m3789b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C2320m1(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static int m3790c(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i3 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new C2320m1(i7 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i4 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i8);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new C2320m1(i7, length);
            }
            i8 = i3;
            i7++;
        }
        return i8;
    }

    /* renamed from: d */
    public static String m3791d(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r10 < i4) {
                byte b = bArr[r10];
                if (!C1960d.m2847s1(b)) {
                    break;
                }
                i = r10 + 1;
                cArr[i3] = (char) b;
                i5 = i3 + 1;
            }
            while (r10 < i4) {
                int i6 = r10 + 1;
                byte b2 = bArr[r10];
                if (C1960d.m2847s1(b2)) {
                    int i7 = i3 + 1;
                    cArr[i3] = (char) b2;
                    r10 = i6;
                    while (true) {
                        i3 = i7;
                        if (r10 >= i4) {
                            break;
                        }
                        byte b3 = bArr[r10];
                        if (!C1960d.m2847s1(b3)) {
                            break;
                        }
                        r10++;
                        i7 = i3 + 1;
                        cArr[i3] = (char) b3;
                    }
                } else if (b2 < -32) {
                    if (i6 < i4) {
                        int i8 = i6 + 1;
                        int i9 = i3 + 1;
                        byte b4 = bArr[i6];
                        if (b2 < -62 || C1960d.m2804h2(b4)) {
                            throw C2246j.m3530g();
                        }
                        cArr[i3] = (char) (((b2 & 31) << 6) | (b4 & 63));
                        r10 = i8;
                        i3 = i9;
                    } else {
                        throw C2246j.m3530g();
                    }
                } else if (b2 < -16) {
                    if (i6 < i4 - 1) {
                        int i10 = i6 + 1;
                        int i11 = i10 + 1;
                        int i12 = i3 + 1;
                        byte b5 = bArr[i6];
                        byte b6 = bArr[i10];
                        if (!C1960d.m2804h2(b5)) {
                            if (b2 == -32) {
                                if (b5 >= -96) {
                                    b2 = -32;
                                }
                            }
                            if (b2 == -19) {
                                if (b5 < -96) {
                                    b2 = -19;
                                }
                            }
                            if (!C1960d.m2804h2(b6)) {
                                cArr[i3] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                r10 = i11;
                                i3 = i12;
                            }
                        }
                        throw C2246j.m3530g();
                    }
                    throw C2246j.m3530g();
                } else if (i6 < i4 - 2) {
                    int i13 = i6 + 1;
                    int i14 = i13 + 1;
                    int i15 = i14 + 1;
                    byte b7 = bArr[i6];
                    byte b8 = bArr[i13];
                    byte b9 = bArr[i14];
                    if (!C1960d.m2804h2(b7)) {
                        if ((((b7 + 112) + (b2 << 28)) >> 30) == 0 && !C1960d.m2804h2(b8) && !C1960d.m2804h2(b9)) {
                            byte b10 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                            cArr[i3] = (char) ((b10 >>> 10) + 55232);
                            cArr[i3 + 1] = (char) ((b10 & ExifInterface.MARKER) + 56320);
                            i3 += 2;
                            r10 = i15;
                        }
                    }
                    throw C2246j.m3530g();
                } else {
                    throw C2246j.m3530g();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: e */
    public static /* synthetic */ int m3792e(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b <= -12 && b2 <= -65) {
                    return b ^ (b2 << 8);
                }
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b <= -12 && b3 <= -65 && b4 <= -65) {
                    return ((b3 << 8) ^ b) ^ (b4 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
        return -1;
    }
}
