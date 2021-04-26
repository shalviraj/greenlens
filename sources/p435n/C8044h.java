package p435n;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7685a;
import p435n.p436c0.C8038b;

/* renamed from: n.h */
public class C8044h implements Serializable, Comparable<C8044h> {

    /* renamed from: j */
    public static final C8044h f16142j = new C8044h(new byte[0]);

    /* renamed from: k */
    public static final C8045a f16143k = new C8045a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public transient int f16144g;

    /* renamed from: h */
    public transient String f16145h;

    /* renamed from: i */
    public final byte[] f16146i;

    /* renamed from: n.h$a */
    public static final class C8045a {
        public C8045a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: c */
        public static C8044h m14853c(C8045a aVar, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            C6888i.m12438e(bArr, "$this$toByteString");
            C5266a.m9848N((long) bArr.length, (long) i, (long) i2);
            int i4 = i2 + i;
            C6888i.m12438e(bArr, "$this$copyOfRangeImpl");
            C5266a.m9966i0(i4, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i4);
            C6888i.m12437d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return new C8044h(copyOfRange);
        }

        /* renamed from: a */
        public final C8044h mo25969a(String str) {
            C6888i.m12438e(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (C8038b.m14747a(str.charAt(i2 + 1)) + (C8038b.m14747a(str.charAt(i2)) << 4));
                }
                return new C8044h(bArr);
            }
            throw new IllegalArgumentException(C0843a.m451l("Unexpected hex string: ", str).toString());
        }

        /* renamed from: b */
        public final C8044h mo25970b(String str) {
            C6888i.m12438e(str, "$this$encodeUtf8");
            C6888i.m12438e(str, "$this$asUtf8ToByteArray");
            byte[] bytes = str.getBytes(C7685a.f15210a);
            C6888i.m12437d(bytes, "(this as java.lang.String).getBytes(charset)");
            C8044h hVar = new C8044h(bytes);
            hVar.f16145h = str;
            return hVar;
        }
    }

    public C8044h(byte[] bArr) {
        C6888i.m12438e(bArr, "data");
        this.f16146i = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        r5 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dc, code lost:
        r6 = null;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p435n.C8044h m14838e(java.lang.String r15) {
        /*
            java.lang.String r0 = "$this$decodeBase64"
            p298d.p344x.p346c.C6888i.m12438e(r15, r0)
            byte[] r0 = p435n.C8029a.f16121a
            java.lang.String r0 = "$this$decodeBase64ToArray"
            p298d.p344x.p346c.C6888i.m12438e(r15, r0)
            int r0 = r15.length()
        L_0x0010:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L_0x002f
            int r5 = r0 + -1
            char r6 = r15.charAt(r5)
            r7 = 61
            if (r6 == r7) goto L_0x002d
            if (r6 == r4) goto L_0x002d
            if (r6 == r3) goto L_0x002d
            if (r6 == r2) goto L_0x002d
            if (r6 == r1) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = r5
            goto L_0x0010
        L_0x002f:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r5 = (int) r5
            byte[] r6 = new byte[r5]
            r7 = 0
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x003d:
            r11 = 0
            if (r7 >= r0) goto L_0x00a8
            char r12 = r15.charAt(r7)
            r13 = 90
            r14 = 65
            if (r14 <= r12) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            if (r13 < r12) goto L_0x0050
            int r12 = r12 + -65
            goto L_0x0088
        L_0x0050:
            r13 = 122(0x7a, float:1.71E-43)
            r14 = 97
            if (r14 <= r12) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            if (r13 < r12) goto L_0x005c
            int r12 = r12 + -71
            goto L_0x0088
        L_0x005c:
            r13 = 57
            r14 = 48
            if (r14 <= r12) goto L_0x0063
            goto L_0x0068
        L_0x0063:
            if (r13 < r12) goto L_0x0068
            int r12 = r12 + 4
            goto L_0x0088
        L_0x0068:
            r13 = 43
            if (r12 == r13) goto L_0x0086
            r13 = 45
            if (r12 != r13) goto L_0x0071
            goto L_0x0086
        L_0x0071:
            r13 = 47
            if (r12 == r13) goto L_0x0083
            r13 = 95
            if (r12 != r13) goto L_0x007a
            goto L_0x0083
        L_0x007a:
            if (r12 == r4) goto L_0x00a5
            if (r12 == r3) goto L_0x00a5
            if (r12 == r2) goto L_0x00a5
            if (r12 != r1) goto L_0x00dc
            goto L_0x00a5
        L_0x0083:
            r12 = 63
            goto L_0x0088
        L_0x0086:
            r12 = 62
        L_0x0088:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r8 = r8 + 1
            int r11 = r8 % 4
            if (r11 != 0) goto L_0x00a5
            int r11 = r10 + 1
            int r12 = r9 >> 16
            byte r12 = (byte) r12
            r6[r10] = r12
            int r10 = r11 + 1
            int r12 = r9 >> 8
            byte r12 = (byte) r12
            r6[r11] = r12
            int r11 = r10 + 1
            byte r12 = (byte) r9
            r6[r10] = r12
            r10 = r11
        L_0x00a5:
            int r7 = r7 + 1
            goto L_0x003d
        L_0x00a8:
            int r8 = r8 % 4
            r15 = 1
            if (r8 == r15) goto L_0x00dc
            r15 = 2
            if (r8 == r15) goto L_0x00c5
            r15 = 3
            if (r8 == r15) goto L_0x00b4
            goto L_0x00cf
        L_0x00b4:
            int r15 = r9 << 6
            int r0 = r10 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r6[r10] = r1
            int r10 = r0 + 1
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r6[r0] = r15
            goto L_0x00cf
        L_0x00c5:
            int r15 = r9 << 12
            int r0 = r10 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r6[r10] = r15
            r10 = r0
        L_0x00cf:
            if (r10 != r5) goto L_0x00d2
            goto L_0x00dd
        L_0x00d2:
            byte[] r6 = java.util.Arrays.copyOf(r6, r10)
            java.lang.String r15 = "java.util.Arrays.copyOf(this, newSize)"
            p298d.p344x.p346c.C6888i.m12437d(r6, r15)
            goto L_0x00dd
        L_0x00dc:
            r6 = r11
        L_0x00dd:
            if (r6 == 0) goto L_0x00e4
            n.h r11 = new n.h
            r11.<init>(r6)
        L_0x00e4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8044h.m14838e(java.lang.String):n.h");
    }

    /* renamed from: k */
    public static final C8044h m14839k(String str) {
        C6888i.m12438e(str, "$this$encodeUtf8");
        C6888i.m12438e(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C7685a.f15210a);
        C6888i.m12437d(bytes, "(this as java.lang.String).getBytes(charset)");
        C8044h hVar = new C8044h(bytes);
        hVar.f16145h = str;
        return hVar;
    }

    /* renamed from: t */
    public static final C8044h m14840t(byte... bArr) {
        C6888i.m12438e(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C8044h(copyOf);
    }

    /* renamed from: A */
    public void mo25953A(C8040e eVar, int i, int i2) {
        C6888i.m12438e(eVar, "buffer");
        C6888i.m12438e(this, "$this$commonWrite");
        C6888i.m12438e(eVar, "buffer");
        eVar.mo25938u0(this.f16146i, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r6 < r7) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 < r1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            n.h r9 = (p435n.C8044h) r9
            java.lang.String r0 = "other"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            int r0 = r8.mo25959l()
            int r1 = r9.mo25959l()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            r5 = -1
            if (r4 >= r2) goto L_0x002c
            byte r6 = r8.mo25962s(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.mo25962s(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0029
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 >= r7) goto L_0x0033
            goto L_0x0031
        L_0x002c:
            if (r0 != r1) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            if (r0 >= r1) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8044h.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public String mo25955d() {
        byte[] bArr = this.f16146i;
        byte[] bArr2 = C8029a.f16121a;
        byte[] bArr3 = C8029a.f16121a;
        C6888i.m12438e(bArr, "$this$encodeBase64");
        C6888i.m12438e(bArr3, "map");
        byte[] bArr4 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr4[i2] = bArr3[(b & ExifInterface.MARKER) >> 2];
            int i7 = i6 + 1;
            bArr4[i6] = bArr3[((b & 3) << 4) | ((b2 & ExifInterface.MARKER) >> 4)];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b2 & 15) << 2) | ((b3 & ExifInterface.MARKER) >> 6)];
            i2 = i8 + 1;
            bArr4[i8] = bArr3[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr4[i2] = bArr3[(b4 & ExifInterface.MARKER) >> 2];
            int i10 = i9 + 1;
            bArr4[i9] = bArr3[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr4[i10] = b5;
            bArr4[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr4[i2] = bArr3[(b6 & ExifInterface.MARKER) >> 2];
            int i13 = i12 + 1;
            bArr4[i12] = bArr3[((b6 & 3) << 4) | ((b7 & ExifInterface.MARKER) >> 4)];
            bArr4[i13] = bArr3[(b7 & 15) << 2];
            bArr4[i13 + 1] = (byte) 61;
        }
        C6888i.m12438e(bArr4, "$this$toUtf8String");
        return new String(bArr4, C7685a.f15210a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8044h) {
            C8044h hVar = (C8044h) obj;
            int l = hVar.mo25959l();
            byte[] bArr = this.f16146i;
            if (l == bArr.length && hVar.mo25965w(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f16144g;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f16146i);
        this.f16144g = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public C8044h mo25958i(String str) {
        C6888i.m12438e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f16146i, 0, mo25959l());
        byte[] digest = instance.digest();
        C6888i.m12437d(digest, "digestBytes");
        return new C8044h(digest);
    }

    /* renamed from: l */
    public int mo25959l() {
        return this.f16146i.length;
    }

    /* renamed from: p */
    public String mo25960p() {
        byte[] bArr = this.f16146i;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = C8038b.f16136a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: q */
    public byte[] mo25961q() {
        return this.f16146i;
    }

    /* renamed from: s */
    public byte mo25962s(int i) {
        return this.f16146i[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0125, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0163, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0176, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0187, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0196, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01ac, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01b4, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01bb, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01f0, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01f3, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e8, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00fb, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x010a, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x011c, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f16146i
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02c2
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0014:
            r6 = 64
            if (r3 >= r2) goto L_0x01f4
            byte r7 = r1[r3]
            r8 = 10
            r9 = 13
            r10 = 159(0x9f, float:2.23E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 31
            r14 = 65533(0xfffd, float:9.1831E-41)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r7 < 0) goto L_0x007f
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0031
            goto L_0x01f4
        L_0x0031:
            if (r7 == r8) goto L_0x0043
            if (r7 == r9) goto L_0x0043
            if (r7 < 0) goto L_0x0039
            if (r12 >= r7) goto L_0x003e
        L_0x0039:
            if (r11 <= r7) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            if (r10 < r7) goto L_0x0040
        L_0x003e:
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x01f3
        L_0x0043:
            if (r7 != r14) goto L_0x0047
            goto L_0x01f3
        L_0x0047:
            if (r7 >= r15) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 2
        L_0x004c:
            int r5 = r5 + r4
            int r3 = r3 + 1
        L_0x004f:
            r4 = r16
            if (r3 >= r2) goto L_0x0014
            byte r7 = r1[r3]
            if (r7 < 0) goto L_0x0014
            int r7 = r3 + 1
            byte r3 = r1[r3]
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0061
            goto L_0x01f4
        L_0x0061:
            if (r3 == r8) goto L_0x0073
            if (r3 == r9) goto L_0x0073
            if (r3 < 0) goto L_0x0069
            if (r12 >= r3) goto L_0x006e
        L_0x0069:
            if (r11 <= r3) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            if (r10 < r3) goto L_0x0070
        L_0x006e:
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 != 0) goto L_0x01f3
        L_0x0073:
            if (r3 != r14) goto L_0x0077
            goto L_0x01f3
        L_0x0077:
            if (r3 >= r15) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 2
        L_0x007c:
            int r5 = r5 + r3
            r3 = r7
            goto L_0x004f
        L_0x007f:
            int r14 = r7 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x00da
            int r7 = r3 + 1
            if (r2 > r7) goto L_0x008e
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x008e:
            byte r14 = r1[r3]
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0098
            r15 = 1
            goto L_0x0099
        L_0x0098:
            r15 = 0
        L_0x0099:
            if (r15 != 0) goto L_0x009f
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x009f:
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r14 = r14 << 6
            r7 = r7 ^ r14
            if (r7 >= r13) goto L_0x00aa
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00aa:
            int r13 = r4 + 1
            if (r4 != r6) goto L_0x00b0
            goto L_0x01f4
        L_0x00b0:
            if (r7 == r8) goto L_0x00c2
            if (r7 == r9) goto L_0x00c2
            if (r7 < 0) goto L_0x00b8
            if (r12 >= r7) goto L_0x00bd
        L_0x00b8:
            if (r11 <= r7) goto L_0x00bb
            goto L_0x00bf
        L_0x00bb:
            if (r10 < r7) goto L_0x00bf
        L_0x00bd:
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            if (r4 != 0) goto L_0x01f3
        L_0x00c2:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x00c9
            goto L_0x01f3
        L_0x00c9:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x00d1
            r4 = 1
            r16 = r4
            goto L_0x00d3
        L_0x00d1:
            r16 = 2
        L_0x00d3:
            int r5 = r5 + r16
            int r3 = r3 + 2
            r4 = r13
            goto L_0x0014
        L_0x00da:
            int r10 = r7 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r15) goto L_0x015b
            int r7 = r3 + 2
            if (r2 > r7) goto L_0x00ec
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00ec:
            byte r10 = r1[r3]
            int r14 = r3 + 1
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x00f8
            r15 = 1
            goto L_0x00f9
        L_0x00f8:
            r15 = 0
        L_0x00f9:
            if (r15 != 0) goto L_0x00ff
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00ff:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0107
            r13 = 1
            goto L_0x0108
        L_0x0107:
            r13 = 0
        L_0x0108:
            if (r13 != 0) goto L_0x010e
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x010e:
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r13
            int r13 = r14 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L_0x0120
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0120:
            if (r11 <= r7) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            if (r12 < r7) goto L_0x0129
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0129:
            int r10 = r4 + 1
            if (r4 != r6) goto L_0x012f
            goto L_0x01f4
        L_0x012f:
            if (r7 == r8) goto L_0x0147
            if (r7 == r9) goto L_0x0147
            if (r7 < 0) goto L_0x0139
            r4 = 31
            if (r4 >= r7) goto L_0x0142
        L_0x0139:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x0144
        L_0x0142:
            r4 = 1
            goto L_0x0145
        L_0x0144:
            r4 = 0
        L_0x0145:
            if (r4 != 0) goto L_0x01f3
        L_0x0147:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x014e
            goto L_0x01f3
        L_0x014e:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x0154
            r13 = 1
            goto L_0x0155
        L_0x0154:
            r13 = 2
        L_0x0155:
            int r5 = r5 + r13
            int r3 = r3 + 3
            r4 = r10
            goto L_0x0014
        L_0x015b:
            int r7 = r7 >> 3
            if (r7 != r15) goto L_0x01f0
            int r7 = r3 + 3
            if (r2 > r7) goto L_0x0167
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0167:
            byte r9 = r1[r3]
            int r10 = r3 + 1
            byte r10 = r1[r10]
            r14 = r10 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L_0x0173
            r14 = 1
            goto L_0x0174
        L_0x0173:
            r14 = 0
        L_0x0174:
            if (r14 != 0) goto L_0x017a
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x017a:
            int r14 = r3 + 2
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0184
            r15 = 1
            goto L_0x0185
        L_0x0184:
            r15 = 0
        L_0x0185:
            if (r15 != 0) goto L_0x018b
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x018b:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0193
            r13 = 1
            goto L_0x0194
        L_0x0193:
            r13 = 0
        L_0x0194:
            if (r13 != 0) goto L_0x019a
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x019a:
            r13 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r13
            int r13 = r14 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            int r9 = r9 << 18
            r7 = r7 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r9) goto L_0x01af
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01af:
            if (r11 <= r7) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            if (r12 < r7) goto L_0x01b7
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01b7:
            r9 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r9) goto L_0x01be
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01be:
            int r9 = r4 + 1
            if (r4 != r6) goto L_0x01c3
            goto L_0x01f4
        L_0x01c3:
            if (r7 == r8) goto L_0x01dd
            r4 = 13
            if (r7 == r4) goto L_0x01dd
            if (r7 < 0) goto L_0x01cf
            r4 = 31
            if (r4 >= r7) goto L_0x01d8
        L_0x01cf:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x01d4
            goto L_0x01da
        L_0x01d4:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x01da
        L_0x01d8:
            r4 = 1
            goto L_0x01db
        L_0x01da:
            r4 = 0
        L_0x01db:
            if (r4 != 0) goto L_0x01f3
        L_0x01dd:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x01e3
            goto L_0x01f3
        L_0x01e3:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x01e9
            r13 = 1
            goto L_0x01ea
        L_0x01e9:
            r13 = 2
        L_0x01ea:
            int r5 = r5 + r13
            int r3 = r3 + 4
            r4 = r9
            goto L_0x0014
        L_0x01f0:
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01f3:
            r5 = -1
        L_0x01f4:
            r1 = 93
            java.lang.String r2 = "[size="
            r3 = -1
            if (r5 != r3) goto L_0x026c
            byte[] r3 = r0.f16146i
            int r3 = r3.length
            if (r3 > r6) goto L_0x020f
            java.lang.String r2 = "[hex="
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            java.lang.String r3 = r17.mo25960p()
            r2.append(r3)
            goto L_0x02bb
        L_0x020f:
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            byte[] r2 = r0.f16146i
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r2 = " hex="
            r1.append(r2)
            byte[] r2 = r0.f16146i
            int r3 = r2.length
            if (r6 > r3) goto L_0x0225
            r3 = 1
            goto L_0x0226
        L_0x0225:
            r3 = 0
        L_0x0226:
            if (r3 == 0) goto L_0x024d
            int r3 = r2.length
            if (r6 != r3) goto L_0x022d
            r3 = r0
            goto L_0x0245
        L_0x022d:
            n.h r3 = new n.h
            java.lang.String r4 = "$this$copyOfRangeImpl"
            p298d.p344x.p346c.C6888i.m12438e(r2, r4)
            int r4 = r2.length
            p005b.p291q.p292a.C5266a.m9966i0(r6, r4)
            r4 = 0
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r4, r6)
            java.lang.String r4 = "java.util.Arrays.copyOfR…this, fromIndex, toIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r4)
            r3.<init>(r2)
        L_0x0245:
            java.lang.String r2 = r3.mo25960p()
            r1.append(r2)
            goto L_0x02ab
        L_0x024d:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            byte[] r2 = r0.f16146i
            int r2 = r2.length
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x026c:
            java.lang.String r3 = r17.mo25968z()
            r4 = 0
            java.lang.String r6 = r3.substring(r4, r5)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            r9 = 4
            java.lang.String r6 = p298d.p415c0.C7694h.m13944v(r6, r7, r8, r4, r9)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = p298d.p415c0.C7694h.m13944v(r6, r7, r8, r4, r9)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r4 = p298d.p415c0.C7694h.m13944v(r6, r7, r8, r4, r9)
            int r3 = r3.length()
            if (r5 >= r3) goto L_0x02b5
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            byte[] r2 = r0.f16146i
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r2 = " text="
            r1.append(r2)
            r1.append(r4)
        L_0x02ab:
            java.lang.String r2 = "…]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x02c2
        L_0x02b5:
            java.lang.String r2 = "[text="
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m464y(r2, r4)
        L_0x02bb:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x02c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8044h.toString():java.lang.String");
    }

    /* renamed from: v */
    public boolean mo25964v(int i, C8044h hVar, int i2, int i3) {
        C6888i.m12438e(hVar, "other");
        return hVar.mo25965w(i2, this.f16146i, i, i3);
    }

    /* renamed from: w */
    public boolean mo25965w(int i, byte[] bArr, int i2, int i3) {
        C6888i.m12438e(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f16146i;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C5266a.m10037u(bArr2, i, bArr, i2, i3);
        }
    }

    /* renamed from: x */
    public C8044h mo25966x() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.f16146i;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C8044h(copyOf);
            }
        }
    }

    /* renamed from: y */
    public byte[] mo25967y() {
        byte[] bArr = this.f16146i;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: z */
    public String mo25968z() {
        String str = this.f16145h;
        if (str != null) {
            return str;
        }
        byte[] q = mo25961q();
        C6888i.m12438e(q, "$this$toUtf8String");
        String str2 = new String(q, C7685a.f15210a);
        this.f16145h = str2;
        return str2;
    }
}
