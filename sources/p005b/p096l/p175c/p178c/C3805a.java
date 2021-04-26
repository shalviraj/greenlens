package p005b.p096l.p175c.p178c;

import androidx.exifinterface.media.ExifInterface;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p179d.C3812a;

/* renamed from: b.l.c.c.a */
public abstract class C3805a {

    /* renamed from: a */
    public static final C3805a f7015a = new C3808c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b.l.c.c.a$a */
    public static final class C3806a {

        /* renamed from: a */
        public final String f7016a;

        /* renamed from: b */
        public final char[] f7017b;

        /* renamed from: c */
        public final int f7018c;

        /* renamed from: d */
        public final int f7019d;

        /* renamed from: e */
        public final int f7020e;

        /* renamed from: f */
        public final int f7021f;

        /* renamed from: g */
        public final byte[] f7022g;

        public C3806a(String str, char[] cArr) {
            Objects.requireNonNull(str);
            this.f7016a = str;
            Objects.requireNonNull(cArr);
            this.f7017b = cArr;
            try {
                int b = C3812a.m7196b(cArr.length, RoundingMode.UNNECESSARY);
                this.f7019d = b;
                int min = Math.min(8, Integer.lowestOneBit(b));
                try {
                    this.f7020e = 8 / min;
                    this.f7021f = b / min;
                    this.f7018c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        C1960d.m2837q(c < 128, "Non-ASCII character: %s", c);
                        C1960d.m2837q(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f7022g = bArr;
                    boolean[] zArr = new boolean[this.f7020e];
                    for (int i2 = 0; i2 < this.f7021f; i2++) {
                        zArr[C3812a.m7195a(i2 * 8, this.f7019d, RoundingMode.CEILING)] = true;
                    }
                } catch (ArithmeticException e) {
                    StringBuilder u = C0843a.m460u("Illegal alphabet ");
                    u.append(new String(cArr));
                    throw new IllegalArgumentException(u.toString(), e);
                }
            } catch (ArithmeticException e2) {
                StringBuilder u2 = C0843a.m460u("Illegal alphabet length ");
                u2.append(cArr.length);
                throw new IllegalArgumentException(u2.toString(), e2);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3806a) {
                return Arrays.equals(this.f7017b, ((C3806a) obj).f7017b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f7017b);
        }

        public String toString() {
            return this.f7016a;
        }
    }

    /* renamed from: b.l.c.c.a$b */
    public static final class C3807b extends C3809d {

        /* renamed from: d */
        public final char[] f7023d = new char[512];

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3807b(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                b.l.c.c.a$a r0 = new b.l.c.c.a$a
                char[] r6 = r6.toCharArray()
                r0.<init>(r5, r6)
                r5 = 0
                r4.<init>(r0, r5)
                r5 = 512(0x200, float:7.175E-43)
                char[] r5 = new char[r5]
                r4.f7023d = r5
                char[] r5 = r0.f7017b
                int r5 = r5.length
                r6 = 16
                r1 = 0
                if (r5 != r6) goto L_0x001d
                r5 = 1
                goto L_0x001e
            L_0x001d:
                r5 = r1
            L_0x001e:
                p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2849t(r5)
            L_0x0021:
                r5 = 256(0x100, float:3.59E-43)
                if (r1 >= r5) goto L_0x003a
                char[] r5 = r4.f7023d
                int r6 = r1 >>> 4
                char[] r2 = r0.f7017b
                char r6 = r2[r6]
                r5[r1] = r6
                r6 = r1 | 256(0x100, float:3.59E-43)
                r3 = r1 & 15
                char r2 = r2[r3]
                r5[r6] = r2
                int r1 = r1 + 1
                goto L_0x0021
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p178c.C3805a.C3807b.<init>(java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public void mo15323a(Appendable appendable, byte[] bArr, int i, int i2) {
            C1960d.m2869y(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                byte b = bArr[i + i3] & ExifInterface.MARKER;
                appendable.append(this.f7023d[b]);
                appendable.append(this.f7023d[b | 256]);
            }
        }
    }

    /* renamed from: b.l.c.c.a$c */
    public static final class C3808c extends C3809d {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3808c(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
            /*
                r1 = this;
                b.l.c.c.a$a r0 = new b.l.c.c.a$a
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                char[] r2 = r0.f7017b
                int r2 = r2.length
                r3 = 64
                if (r2 != r3) goto L_0x0015
                r2 = 1
                goto L_0x0016
            L_0x0015:
                r2 = 0
            L_0x0016:
                p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2849t(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p178c.C3805a.C3808c.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
        }

        /* renamed from: a */
        public void mo15323a(Appendable appendable, byte[] bArr, int i, int i2) {
            int i3 = i + i2;
            C1960d.m2869y(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                byte b = ((bArr[i] & ExifInterface.MARKER) << 16) | ((bArr[i4] & ExifInterface.MARKER) << 8);
                byte b2 = b | (bArr[i5] & ExifInterface.MARKER);
                appendable.append(this.f7024b.f7017b[b2 >>> 18]);
                appendable.append(this.f7024b.f7017b[(b2 >>> 12) & 63]);
                appendable.append(this.f7024b.f7017b[(b2 >>> 6) & 63]);
                appendable.append(this.f7024b.f7017b[b2 & 63]);
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                mo15327b(appendable, bArr, i, i3 - i);
            }
        }
    }

    /* renamed from: b.l.c.c.a$d */
    public static class C3809d extends C3805a {

        /* renamed from: b */
        public final C3806a f7024b;

        /* renamed from: c */
        public final Character f7025c;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3809d(p005b.p096l.p175c.p178c.C3805a.C3806a r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                java.util.Objects.requireNonNull(r5)
                r4.f7024b = r5
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L_0x0022
                char r2 = r6.charValue()
                byte[] r5 = r5.f7022g
                int r3 = r5.length
                if (r2 >= r3) goto L_0x001c
                byte r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L_0x001c
                r5 = r1
                goto L_0x001d
            L_0x001c:
                r5 = r0
            L_0x001d:
                if (r5 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r5 = r0
                goto L_0x0023
            L_0x0022:
                r5 = r1
            L_0x0023:
                if (r5 == 0) goto L_0x0028
                r4.f7025c = r6
                return
            L_0x0028:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "Padding character %s was already in alphabet"
                java.lang.String r6 = p005b.p096l.p175c.p176a.C3757c.m7060a(r6, r1)
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p175c.p178c.C3805a.C3809d.<init>(b.l.c.c.a$a, java.lang.Character):void");
        }

        /* renamed from: a */
        public void mo15323a(Appendable appendable, byte[] bArr, int i, int i2) {
            C1960d.m2869y(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                mo15327b(appendable, bArr, i + i3, Math.min(this.f7024b.f7021f, i2 - i3));
                i3 += this.f7024b.f7021f;
            }
        }

        /* renamed from: b */
        public void mo15327b(Appendable appendable, byte[] bArr, int i, int i2) {
            C1960d.m2869y(i, i + i2, bArr.length);
            int i3 = 0;
            C1960d.m2849t(i2 <= this.f7024b.f7021f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & ExifInterface.MARKER))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f7024b.f7019d;
            while (i3 < i2 * 8) {
                C3806a aVar = this.f7024b;
                appendable.append(aVar.f7017b[((int) (j >>> (i5 - i3))) & aVar.f7018c]);
                i3 += this.f7024b.f7019d;
            }
            if (this.f7025c != null) {
                while (i3 < this.f7024b.f7021f * 8) {
                    appendable.append(this.f7025c.charValue());
                    i3 += this.f7024b.f7019d;
                }
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3809d)) {
                return false;
            }
            C3809d dVar = (C3809d) obj;
            return this.f7024b.equals(dVar.f7024b) && C1960d.m2725K(this.f7025c, dVar.f7025c);
        }

        public int hashCode() {
            return this.f7024b.hashCode() ^ Arrays.hashCode(new Object[]{this.f7025c});
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f7024b.f7016a);
            if (8 % this.f7024b.f7019d != 0) {
                if (this.f7025c == null) {
                    str = ".omitPadding()";
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f7025c);
                    str = "')";
                }
                sb.append(str);
            }
            return sb.toString();
        }
    }

    static {
        new C3808c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C3809d(new C3806a("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        new C3809d(new C3806a("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        new C3807b("base16()", "0123456789ABCDEF");
    }

    /* renamed from: a */
    public abstract void mo15323a(Appendable appendable, byte[] bArr, int i, int i2);
}
