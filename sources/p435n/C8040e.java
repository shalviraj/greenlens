package p435n;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7685a;
import p435n.p436c0.C8037a;
import p435n.p436c0.C8038b;

/* renamed from: n.e */
public final class C8040e implements C8043g, C8042f, Cloneable, ByteChannel {

    /* renamed from: g */
    public C8061v f16139g;

    /* renamed from: h */
    public long f16140h;

    /* renamed from: n.e$a */
    public static final class C8041a extends InputStream {

        /* renamed from: g */
        public final /* synthetic */ C8040e f16141g;

        public C8041a(C8040e eVar) {
            this.f16141g = eVar;
        }

        public int available() {
            return (int) Math.min(this.f16141g.f16140h, (long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }

        public void close() {
        }

        public int read() {
            C8040e eVar = this.f16141g;
            if (eVar.f16140h > 0) {
                return eVar.readByte() & ExifInterface.MARKER;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            C6888i.m12438e(bArr, "sink");
            return this.f16141g.read(bArr, i, i2);
        }

        public String toString() {
            return this.f16141g + ".inputStream()";
        }
    }

    /* renamed from: A */
    public byte[] mo25882A() {
        return mo25888G(this.f16140h);
    }

    /* renamed from: A0 */
    public C8040e mo25883A0(String str, int i, int i2) {
        long j;
        long j2;
        char charAt;
        C6888i.m12438e(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C8061v r0 = mo25927r0(1);
                            byte[] bArr = r0.f16183a;
                            int i3 = r0.f16185c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = r0.f16185c;
                                    int i6 = (i3 + i) - i5;
                                    r0.f16185c = i5 + i6;
                                    this.f16140h += (long) i6;
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = r0.f16185c;
                            int i62 = (i3 + i) - i52;
                            r0.f16185c = i52 + i62;
                            this.f16140h += (long) i62;
                        } else {
                            if (charAt2 < 2048) {
                                C8061v r02 = mo25927r0(2);
                                byte[] bArr2 = r02.f16183a;
                                int i7 = r02.f16185c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                r02.f16185c = i7 + 2;
                                j = this.f16140h;
                                j2 = 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                C8061v r03 = mo25927r0(3);
                                byte[] bArr3 = r03.f16183a;
                                int i8 = r03.f16185c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                r03.f16185c = i8 + 3;
                                j = this.f16140h;
                                j2 = 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mo25940v0(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C8061v r04 = mo25927r0(4);
                                    byte[] bArr4 = r04.f16183a;
                                    int i11 = r04.f16185c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    r04.f16185c = i11 + 4;
                                    this.f16140h += 4;
                                    i += 2;
                                }
                            }
                            this.f16140h = j + j2;
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder v = C0843a.m461v("endIndex > string.length: ", i2, " > ");
                v.append(str.length());
                throw new IllegalArgumentException(v.toString().toString());
            }
            throw new IllegalArgumentException(C0843a.m446g("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(C0843a.m444e("beginIndex < 0: ", i).toString());
    }

    /* renamed from: B0 */
    public C8040e mo25884B0(int i) {
        long j;
        long j2;
        String str;
        if (i < 128) {
            mo25940v0(i);
        } else {
            if (i < 2048) {
                C8061v r0 = mo25927r0(2);
                byte[] bArr = r0.f16183a;
                int i2 = r0.f16185c;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                r0.f16185c = i2 + 2;
                j2 = this.f16140h;
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                mo25940v0(63);
            } else if (i < 65536) {
                C8061v r02 = mo25927r0(3);
                byte[] bArr2 = r02.f16183a;
                int i3 = r02.f16185c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                r02.f16185c = i3 + 3;
                j2 = this.f16140h;
                j = 3;
            } else if (i <= 1114111) {
                C8061v r03 = mo25927r0(4);
                byte[] bArr3 = r03.f16183a;
                int i4 = r03.f16185c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                r03.f16185c = i4 + 4;
                j2 = this.f16140h;
                j = 4;
            } else {
                StringBuilder u = C0843a.m460u("Unexpected code point: 0x");
                if (i != 0) {
                    char[] cArr = C8038b.f16136a;
                    int i5 = 0;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i5 < 8 && cArr2[i5] == '0') {
                        i5++;
                    }
                    str = new String(cArr2, i5, 8 - i5);
                } else {
                    str = "0";
                }
                u.append(str);
                throw new IllegalArgumentException(u.toString());
            }
            this.f16140h = j2 + j;
        }
        return this;
    }

    /* renamed from: C */
    public long mo25885C(C8044h hVar) {
        C6888i.m12438e(hVar, "bytes");
        return mo25895S(hVar, 0);
    }

    /* renamed from: D */
    public boolean mo25886D() {
        return this.f16140h == 0;
    }

    /* renamed from: E */
    public /* bridge */ /* synthetic */ C8042f mo25887E(int i) {
        mo25940v0(i);
        return this;
    }

    /* renamed from: G */
    public byte[] mo25888G(long j) {
        int i = 0;
        if (!(j >= 0 && j <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED))) {
            throw new IllegalArgumentException(C0843a.m448i("byteCount: ", j).toString());
        } else if (this.f16140h >= j) {
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            C6888i.m12438e(bArr, "sink");
            while (i < i2) {
                int read = read(bArr, i, i2 - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: K */
    public /* bridge */ /* synthetic */ C8042f mo25889K(byte[] bArr) {
        mo25936t0(bArr);
        return this;
    }

    /* renamed from: M */
    public /* bridge */ /* synthetic */ C8042f mo25890M(C8044h hVar) {
        mo25933s0(hVar);
        return this;
    }

    /* renamed from: N */
    public final byte mo25891N(long j) {
        C5266a.m9848N(this.f16140h, j, 1);
        C8061v vVar = this.f16139g;
        if (vVar != null) {
            long j2 = this.f16140h;
            if (j2 - j < j) {
                while (j2 > j) {
                    vVar = vVar.f16189g;
                    C6888i.m12436c(vVar);
                    j2 -= (long) (vVar.f16185c - vVar.f16184b);
                }
                C6888i.m12436c(vVar);
                return vVar.f16183a[(int) ((((long) vVar.f16184b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                long j4 = ((long) (vVar.f16185c - vVar.f16184b)) + j3;
                if (j4 > j) {
                    C6888i.m12436c(vVar);
                    return vVar.f16183a[(int) ((((long) vVar.f16184b) + j) - j3)];
                }
                vVar = vVar.f16188f;
                C6888i.m12436c(vVar);
                j3 = j4;
            }
        } else {
            C6888i.m12436c((Object) null);
            return null.f16183a[(int) ((((long) null.f16184b) + j) - -1)];
        }
    }

    /* renamed from: O */
    public long mo25892O(byte b, long j, long j2) {
        C8061v vVar;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            long j4 = this.f16140h;
            if (j2 > j4) {
                j2 = j4;
            }
            if (!(j == j2 || (vVar = this.f16139g) == null)) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        vVar = vVar.f16189g;
                        C6888i.m12436c(vVar);
                        j4 -= (long) (vVar.f16185c - vVar.f16184b);
                    }
                    while (j4 < j2) {
                        byte[] bArr = vVar.f16183a;
                        int min = (int) Math.min((long) vVar.f16185c, (((long) vVar.f16184b) + j2) - j4);
                        for (int i = (int) ((((long) vVar.f16184b) + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return ((long) (i - vVar.f16184b)) + j4;
                            }
                        }
                        j4 += (long) (vVar.f16185c - vVar.f16184b);
                        vVar = vVar.f16188f;
                        C6888i.m12436c(vVar);
                        j = j4;
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (vVar.f16185c - vVar.f16184b)) + j3;
                        if (j5 > j) {
                            break;
                        }
                        vVar = vVar.f16188f;
                        C6888i.m12436c(vVar);
                        j3 = j5;
                    }
                    while (j3 < j2) {
                        byte[] bArr2 = vVar.f16183a;
                        int min2 = (int) Math.min((long) vVar.f16185c, (((long) vVar.f16184b) + j2) - j3);
                        for (int i2 = (int) ((((long) vVar.f16184b) + j) - j3); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - vVar.f16184b)) + j3;
                            }
                        }
                        j3 += (long) (vVar.f16185c - vVar.f16184b);
                        vVar = vVar.f16188f;
                        C6888i.m12436c(vVar);
                        j = j3;
                    }
                }
            }
            return -1;
        }
        StringBuilder u = C0843a.m460u("size=");
        u.append(this.f16140h);
        u.append(" fromIndex=");
        u.append(j);
        u.append(" toIndex=");
        u.append(j2);
        throw new IllegalArgumentException(u.toString().toString());
    }

    /* renamed from: P */
    public long mo25893P(C8044h hVar) {
        C6888i.m12438e(hVar, "targetBytes");
        return mo25899Z(hVar, 0);
    }

    /* renamed from: Q */
    public C8042f mo25894Q() {
        return this;
    }

    /* renamed from: S */
    public long mo25895S(C8044h hVar, long j) {
        long j2 = j;
        C6888i.m12438e(hVar, "bytes");
        if (hVar.mo25959l() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                C8061v vVar = this.f16139g;
                if (vVar != null) {
                    long j4 = this.f16140h;
                    if (j4 - j2 < j2) {
                        while (j4 > j2) {
                            vVar = vVar.f16189g;
                            C6888i.m12436c(vVar);
                            j4 -= (long) (vVar.f16185c - vVar.f16184b);
                        }
                        byte[] q = hVar.mo25961q();
                        byte b = q[0];
                        int l = hVar.mo25959l();
                        long j5 = (this.f16140h - ((long) l)) + 1;
                        long j6 = j4;
                        while (j6 < j5) {
                            byte[] bArr = vVar.f16183a;
                            long j7 = j5;
                            int min = (int) Math.min((long) vVar.f16185c, (((long) vVar.f16184b) + j5) - j6);
                            for (int i = (int) ((((long) vVar.f16184b) + j2) - j6); i < min; i++) {
                                if (bArr[i] == b && C8037a.m14744a(vVar, i + 1, q, 1, l)) {
                                    return ((long) (i - vVar.f16184b)) + j6;
                                }
                            }
                            j6 += (long) (vVar.f16185c - vVar.f16184b);
                            vVar = vVar.f16188f;
                            C6888i.m12436c(vVar);
                            j2 = j6;
                            j5 = j7;
                        }
                    } else {
                        while (true) {
                            long j8 = ((long) (vVar.f16185c - vVar.f16184b)) + j3;
                            if (j8 > j2) {
                                break;
                            }
                            vVar = vVar.f16188f;
                            C6888i.m12436c(vVar);
                            j3 = j8;
                        }
                        byte[] q2 = hVar.mo25961q();
                        byte b2 = q2[0];
                        int l2 = hVar.mo25959l();
                        long j9 = (this.f16140h - ((long) l2)) + 1;
                        while (j3 < j9) {
                            byte[] bArr2 = vVar.f16183a;
                            long j10 = j9;
                            int min2 = (int) Math.min((long) vVar.f16185c, (((long) vVar.f16184b) + j9) - j3);
                            for (int i2 = (int) ((((long) vVar.f16184b) + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && C8037a.m14744a(vVar, i2 + 1, q2, 1, l2)) {
                                    return ((long) (i2 - vVar.f16184b)) + j3;
                                }
                            }
                            j3 += (long) (vVar.f16185c - vVar.f16184b);
                            vVar = vVar.f16188f;
                            C6888i.m12436c(vVar);
                            j2 = j3;
                            j9 = j10;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(C0843a.m448i("fromIndex < 0: ", j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: T */
    public long mo17031T(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "sink");
        if (j >= 0) {
            long j2 = this.f16140h;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            eVar.mo17030j(this, j);
            return j;
        }
        throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j).toString());
    }

    /* renamed from: U */
    public String mo25896U(long j) {
        if (j >= 0) {
            long j2 = RecyclerView.FOREVER_NS;
            if (j != RecyclerView.FOREVER_NS) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long O = mo25892O(b, 0, j2);
            if (O != -1) {
                return C8037a.m14745b(this, O);
            }
            if (j2 < this.f16140h && mo25891N(j2 - 1) == ((byte) 13) && mo25891N(j2) == b) {
                return C8037a.m14745b(this, j2);
            }
            C8040e eVar = new C8040e();
            mo25946z(eVar, 0, Math.min((long) 32, this.f16140h));
            StringBuilder u = C0843a.m460u("\\n not found: limit=");
            u.append(Math.min(this.f16140h, j));
            u.append(" content=");
            u.append(eVar.mo25907f0().mo25960p());
            u.append(8230);
            throw new EOFException(u.toString());
        }
        throw new IllegalArgumentException(C0843a.m448i("limit < 0: ", j).toString());
    }

    /* renamed from: V */
    public long mo25897V(C8064y yVar) {
        C6888i.m12438e(yVar, "sink");
        long j = this.f16140h;
        if (j > 0) {
            ((C8056r) yVar).mo17030j(this, j);
        }
        return j;
    }

    /* renamed from: X */
    public C8043g mo25898X() {
        return C5266a.m9812H(new C8057s(this));
    }

    /* renamed from: Z */
    public long mo25899Z(C8044h hVar, long j) {
        int i;
        int i2;
        C6888i.m12438e(hVar, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            C8061v vVar = this.f16139g;
            if (vVar == null) {
                return -1;
            }
            long j3 = this.f16140h;
            if (j3 - j < j) {
                while (j3 > j) {
                    vVar = vVar.f16189g;
                    C6888i.m12436c(vVar);
                    j3 -= (long) (vVar.f16185c - vVar.f16184b);
                }
                if (hVar.mo25959l() == 2) {
                    byte s = hVar.mo25962s(0);
                    byte s2 = hVar.mo25962s(1);
                    while (j3 < this.f16140h) {
                        byte[] bArr = vVar.f16183a;
                        i2 = (int) ((((long) vVar.f16184b) + j) - j3);
                        int i3 = vVar.f16185c;
                        while (i2 < i3) {
                            byte b = bArr[i2];
                            if (!(b == s || b == s2)) {
                                i2++;
                            }
                        }
                        j3 += (long) (vVar.f16185c - vVar.f16184b);
                        vVar = vVar.f16188f;
                        C6888i.m12436c(vVar);
                        j = j3;
                    }
                    return -1;
                }
                byte[] q = hVar.mo25961q();
                while (j3 < this.f16140h) {
                    byte[] bArr2 = vVar.f16183a;
                    int i4 = (int) ((((long) vVar.f16184b) + j) - j3);
                    int i5 = vVar.f16185c;
                    while (i2 < i5) {
                        byte b2 = bArr2[i2];
                        int length = q.length;
                        int i6 = 0;
                        while (i6 < length) {
                            if (b2 != q[i6]) {
                                i6++;
                            }
                        }
                        i4 = i2 + 1;
                    }
                    j3 += (long) (vVar.f16185c - vVar.f16184b);
                    vVar = vVar.f16188f;
                    C6888i.m12436c(vVar);
                    j = j3;
                }
                return -1;
                return ((long) (i2 - vVar.f16184b)) + j3;
            }
            while (true) {
                long j4 = ((long) (vVar.f16185c - vVar.f16184b)) + j2;
                if (j4 > j) {
                    break;
                }
                vVar = vVar.f16188f;
                C6888i.m12436c(vVar);
                j2 = j4;
            }
            if (hVar.mo25959l() == 2) {
                byte s3 = hVar.mo25962s(0);
                byte s4 = hVar.mo25962s(1);
                while (j2 < this.f16140h) {
                    byte[] bArr3 = vVar.f16183a;
                    i = (int) ((((long) vVar.f16184b) + j) - j2);
                    int i7 = vVar.f16185c;
                    while (i < i7) {
                        byte b3 = bArr3[i];
                        if (!(b3 == s3 || b3 == s4)) {
                            i++;
                        }
                    }
                    j2 += (long) (vVar.f16185c - vVar.f16184b);
                    vVar = vVar.f16188f;
                    C6888i.m12436c(vVar);
                    j = j2;
                }
                return -1;
            }
            byte[] q2 = hVar.mo25961q();
            while (j2 < this.f16140h) {
                byte[] bArr4 = vVar.f16183a;
                int i8 = (int) ((((long) vVar.f16184b) + j) - j2);
                int i9 = vVar.f16185c;
                while (i < i9) {
                    byte b4 = bArr4[i];
                    int length2 = q2.length;
                    int i10 = 0;
                    while (i10 < length2) {
                        if (b4 != q2[i10]) {
                            i10++;
                        }
                    }
                    i8 = i + 1;
                }
                j2 += (long) (vVar.f16185c - vVar.f16184b);
                vVar = vVar.f16188f;
                C6888i.m12436c(vVar);
                j = j2;
            }
            return -1;
            return ((long) (i - vVar.f16184b)) + j2;
        }
        throw new IllegalArgumentException(C0843a.m448i("fromIndex < 0: ", j).toString());
    }

    /* renamed from: a */
    public C8040e mo25900a() {
        return this;
    }

    /* renamed from: c */
    public C8040e mo25901c() {
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public C8040e clone() {
        C8040e eVar = new C8040e();
        if (this.f16140h != 0) {
            C8061v vVar = this.f16139g;
            C6888i.m12436c(vVar);
            C8061v c = vVar.mo25998c();
            eVar.f16139g = c;
            c.f16189g = c;
            c.f16188f = c;
            for (C8061v vVar2 = vVar.f16188f; vVar2 != vVar; vVar2 = vVar2.f16188f) {
                C8061v vVar3 = c.f16189g;
                C6888i.m12436c(vVar3);
                C6888i.m12436c(vVar2);
                vVar3.mo25997b(vVar2.mo25998c());
            }
            eVar.f16140h = this.f16140h;
        }
        return eVar;
    }

    /* renamed from: d0 */
    public void mo25904d0(long j) {
        if (this.f16140h < j) {
            throw new EOFException();
        }
    }

    /* renamed from: e0 */
    public /* bridge */ /* synthetic */ C8042f mo25905e0(String str) {
        mo25947z0(str);
        return this;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof p435n.C8040e
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f16140h
            n.e r1 = (p435n.C8040e) r1
            long r6 = r1.f16140h
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            n.v r4 = r0.f16139g
            p298d.p344x.p346c.C6888i.m12436c(r4)
            n.v r1 = r1.f16139g
            p298d.p344x.p346c.C6888i.m12436c(r1)
            int r5 = r4.f16184b
            int r8 = r1.f16184b
            r9 = r6
        L_0x0032:
            long r11 = r0.f16140h
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.f16185c
            int r11 = r11 - r5
            int r12 = r1.f16185c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.f16183a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f16183a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.f16185c
            if (r5 != r13) goto L_0x006b
            n.v r4 = r4.f16188f
            p298d.p344x.p346c.C6888i.m12436c(r4)
            int r5 = r4.f16184b
        L_0x006b:
            int r13 = r1.f16185c
            if (r8 != r13) goto L_0x0076
            n.v r1 = r1.f16188f
            p298d.p344x.p346c.C6888i.m12436c(r1)
            int r8 = r1.f16184b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8040e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return C8034b0.f16129d;
    }

    /* renamed from: f0 */
    public C8044h mo25907f0() {
        return mo25922p(this.f16140h);
    }

    public void flush() {
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C8042f mo25908h(byte[] bArr, int i, int i2) {
        mo25938u0(bArr, i, i2);
        return this;
    }

    /* renamed from: h0 */
    public short mo25909h0() {
        short readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public int hashCode() {
        C8061v vVar = this.f16139g;
        if (vVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vVar.f16185c;
            for (int i3 = vVar.f16184b; i3 < i2; i3++) {
                i = (i * 31) + vVar.f16183a[i3];
            }
            vVar = vVar.f16188f;
            C6888i.m12436c(vVar);
        } while (vVar != this.f16139g);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r8 != r9) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        r14.f16139g = r6.mo25996a();
        p435n.C8062w.m14927a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r6.f16184b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r1 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0077 A[SYNTHETIC] */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo25911i0() {
        /*
            r14 = this;
            long r0 = r14.f16140h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            n.v r6 = r14.f16139g
            p298d.p344x.p346c.C6888i.m12436c(r6)
            byte[] r7 = r6.f16183a
            int r8 = r6.f16184b
            int r9 = r6.f16185c
        L_0x0016:
            if (r8 >= r9) goto L_0x008e
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0027
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0027
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0027:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0032
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0073
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0073
        L_0x003c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0050:
            n.e r0 = new n.e
            r0.<init>()
            n.e r0 = r0.mo25920o(r4)
            r0.mo25940v0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            java.lang.String r0 = r0.mo25919n0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            r1 = 1
            goto L_0x008e
        L_0x0077:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            java.lang.String r2 = p005b.p291q.p292a.C5266a.m10048v4(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            if (r8 != r9) goto L_0x009a
            n.v r7 = r6.mo25996a()
            r14.f16139g = r7
            p435n.C8062w.m14927a(r6)
            goto L_0x009c
        L_0x009a:
            r6.f16184b = r8
        L_0x009c:
            if (r1 != 0) goto L_0x00a2
            n.v r6 = r14.f16139g
            if (r6 != 0) goto L_0x000b
        L_0x00a2:
            long r1 = r14.f16140h
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f16140h = r1
            return r4
        L_0x00a9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8040e.mo25911i0():long");
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public void mo17030j(C8040e eVar, long j) {
        int i;
        C8061v vVar;
        C8061v vVar2;
        C6888i.m12438e(eVar, "source");
        if (eVar != this) {
            C5266a.m9848N(eVar.f16140h, 0, j);
            while (j > 0) {
                C8061v vVar3 = eVar.f16139g;
                C6888i.m12436c(vVar3);
                int i2 = vVar3.f16185c;
                C8061v vVar4 = eVar.f16139g;
                C6888i.m12436c(vVar4);
                if (j < ((long) (i2 - vVar4.f16184b))) {
                    C8061v vVar5 = this.f16139g;
                    if (vVar5 != null) {
                        C6888i.m12436c(vVar5);
                        vVar = vVar5.f16189g;
                    } else {
                        vVar = null;
                    }
                    if (vVar != null && vVar.f16187e) {
                        if ((((long) vVar.f16185c) + j) - ((long) (vVar.f16186d ? 0 : vVar.f16184b)) <= ((long) 8192)) {
                            C8061v vVar6 = eVar.f16139g;
                            C6888i.m12436c(vVar6);
                            vVar6.mo25999d(vVar, (int) j);
                            eVar.f16140h -= j;
                            this.f16140h += j;
                            return;
                        }
                    }
                    C8061v vVar7 = eVar.f16139g;
                    C6888i.m12436c(vVar7);
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= vVar7.f16185c - vVar7.f16184b) {
                        if (i3 >= 1024) {
                            vVar2 = vVar7.mo25998c();
                        } else {
                            vVar2 = C8062w.m14928b();
                            byte[] bArr = vVar7.f16183a;
                            byte[] bArr2 = vVar2.f16183a;
                            int i4 = vVar7.f16184b;
                            C6790h.m12352g(bArr, bArr2, 0, i4, i4 + i3, 2);
                        }
                        vVar2.f16185c = vVar2.f16184b + i3;
                        vVar7.f16184b += i3;
                        C8061v vVar8 = vVar7.f16189g;
                        C6888i.m12436c(vVar8);
                        vVar8.mo25997b(vVar2);
                        eVar.f16139g = vVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                C8061v vVar9 = eVar.f16139g;
                C6888i.m12436c(vVar9);
                long j2 = (long) (vVar9.f16185c - vVar9.f16184b);
                eVar.f16139g = vVar9.mo25996a();
                C8061v vVar10 = this.f16139g;
                if (vVar10 == null) {
                    this.f16139g = vVar9;
                    vVar9.f16189g = vVar9;
                    vVar9.f16188f = vVar9;
                } else {
                    C6888i.m12436c(vVar10);
                    C8061v vVar11 = vVar10.f16189g;
                    C6888i.m12436c(vVar11);
                    vVar11.mo25997b(vVar9);
                    C8061v vVar12 = vVar9.f16189g;
                    if (vVar12 != vVar9) {
                        C6888i.m12436c(vVar12);
                        if (vVar12.f16187e) {
                            int i5 = vVar9.f16185c - vVar9.f16184b;
                            C8061v vVar13 = vVar9.f16189g;
                            C6888i.m12436c(vVar13);
                            int i6 = 8192 - vVar13.f16185c;
                            C8061v vVar14 = vVar9.f16189g;
                            C6888i.m12436c(vVar14);
                            if (vVar14.f16186d) {
                                i = 0;
                            } else {
                                C8061v vVar15 = vVar9.f16189g;
                                C6888i.m12436c(vVar15);
                                i = vVar15.f16184b;
                            }
                            if (i5 <= i6 + i) {
                                C8061v vVar16 = vVar9.f16189g;
                                C6888i.m12436c(vVar16);
                                vVar9.mo25999d(vVar16, i5);
                                vVar9.mo25996a();
                                C8062w.m14927a(vVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                eVar.f16140h -= j2;
                this.f16140h += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: j0 */
    public String mo25913j0(Charset charset) {
        C6888i.m12438e(charset, "charset");
        return mo25915l0(this.f16140h, charset);
    }

    /* renamed from: k0 */
    public InputStream mo25914k0() {
        return new C8041a(this);
    }

    /* renamed from: l0 */
    public String mo25915l0(long j, Charset charset) {
        C6888i.m12438e(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED))) {
            throw new IllegalArgumentException(C0843a.m448i("byteCount: ", j).toString());
        } else if (this.f16140h < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C8061v vVar = this.f16139g;
            C6888i.m12436c(vVar);
            int i2 = vVar.f16184b;
            if (((long) i2) + j > ((long) vVar.f16185c)) {
                return new String(mo25888G(j), charset);
            }
            int i3 = (int) j;
            String str = new String(vVar.f16183a, i2, i3, charset);
            int i4 = vVar.f16184b + i3;
            vVar.f16184b = i4;
            this.f16140h -= j;
            if (i4 == vVar.f16185c) {
                this.f16139g = vVar.mo25996a();
                C8062w.m14927a(vVar);
            }
            return str;
        }
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8042f mo25916m(String str, int i, int i2) {
        mo25883A0(str, i, i2);
        return this;
    }

    /* renamed from: m0 */
    public int mo25917m0(C8054q qVar) {
        C6888i.m12438e(qVar, "options");
        int c = C8037a.m14746c(this, qVar, false);
        if (c == -1) {
            return -1;
        }
        skip((long) qVar.f16166g[c].mo25959l());
        return c;
    }

    /* renamed from: n */
    public long mo25918n(C8030a0 a0Var) {
        C6888i.m12438e(a0Var, "source");
        long j = 0;
        while (true) {
            long T = a0Var.mo17031T(this, (long) 8192);
            if (T == -1) {
                return j;
            }
            j += T;
        }
    }

    /* renamed from: n0 */
    public String mo25919n0() {
        return mo25915l0(this.f16140h, C7685a.f15210a);
    }

    /* renamed from: o0 */
    public String mo25921o0(long j) {
        return mo25915l0(j, C7685a.f15210a);
    }

    /* renamed from: p */
    public C8044h mo25922p(long j) {
        if (!(j >= 0 && j <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED))) {
            throw new IllegalArgumentException(C0843a.m448i("byteCount: ", j).toString());
        } else if (this.f16140h < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C8044h(mo25888G(j));
        } else {
            C8044h q0 = mo25925q0((int) j);
            skip(j);
            return q0;
        }
    }

    /* renamed from: p0 */
    public int mo25923p0() {
        byte b;
        int i;
        byte b2;
        if (this.f16140h != 0) {
            byte N = mo25891N(0);
            int i2 = 1;
            if ((N & 128) == 0) {
                b2 = N & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((N & 224) == 192) {
                b2 = N & 31;
                i = 2;
                b = 128;
            } else if ((N & 240) == 224) {
                b2 = N & 15;
                i = 3;
                b = 2048;
            } else if ((N & 248) == 240) {
                b2 = N & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f16140h >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte N2 = mo25891N(j2);
                    if ((N2 & 192) == 128) {
                        b2 = (b2 << 6) | (N2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            StringBuilder v = C0843a.m461v("size < ", i, ": ");
            v.append(this.f16140h);
            v.append(" (to read code point prefixed 0x");
            v.append(C5266a.m10048v4(N));
            v.append(')');
            throw new EOFException(v.toString());
        }
        throw new EOFException();
    }

    /* renamed from: q */
    public final long mo25924q() {
        long j = this.f16140h;
        if (j == 0) {
            return 0;
        }
        C8061v vVar = this.f16139g;
        C6888i.m12436c(vVar);
        C8061v vVar2 = vVar.f16189g;
        C6888i.m12436c(vVar2);
        int i = vVar2.f16185c;
        if (i < 8192 && vVar2.f16187e) {
            j -= (long) (i - vVar2.f16184b);
        }
        return j;
    }

    /* renamed from: q0 */
    public final C8044h mo25925q0(int i) {
        if (i == 0) {
            return C8044h.f16142j;
        }
        C5266a.m9848N(this.f16140h, 0, (long) i);
        C8061v vVar = this.f16139g;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C6888i.m12436c(vVar);
            int i5 = vVar.f16185c;
            int i6 = vVar.f16184b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                vVar = vVar.f16188f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C8061v vVar2 = this.f16139g;
        int i7 = 0;
        while (i2 < i) {
            C6888i.m12436c(vVar2);
            bArr[i7] = vVar2.f16183a;
            i2 += vVar2.f16185c - vVar2.f16184b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = vVar2.f16184b;
            vVar2.f16186d = true;
            i7++;
            vVar2 = vVar2.f16188f;
        }
        return new C8063x(bArr, iArr);
    }

    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8042f mo25926r(int i) {
        mo25945y0(i);
        return this;
    }

    /* renamed from: r0 */
    public final C8061v mo25927r0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C8061v vVar = this.f16139g;
            if (vVar == null) {
                C8061v b = C8062w.m14928b();
                this.f16139g = b;
                b.f16189g = b;
                b.f16188f = b;
                return b;
            }
            C6888i.m12436c(vVar);
            C8061v vVar2 = vVar.f16189g;
            C6888i.m12436c(vVar2);
            if (vVar2.f16185c + i <= 8192 && vVar2.f16187e) {
                return vVar2;
            }
            C8061v b2 = C8062w.m14928b();
            vVar2.mo25997b(b2);
            return b2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public int read(ByteBuffer byteBuffer) {
        C6888i.m12438e(byteBuffer, "sink");
        C8061v vVar = this.f16139g;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f16185c - vVar.f16184b);
        byteBuffer.put(vVar.f16183a, vVar.f16184b, min);
        int i = vVar.f16184b + min;
        vVar.f16184b = i;
        this.f16140h -= (long) min;
        if (i == vVar.f16185c) {
            this.f16139g = vVar.mo25996a();
            C8062w.m14927a(vVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i, int i2) {
        C6888i.m12438e(bArr, "sink");
        C5266a.m9848N((long) bArr.length, (long) i, (long) i2);
        C8061v vVar = this.f16139g;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i2, vVar.f16185c - vVar.f16184b);
        byte[] bArr2 = vVar.f16183a;
        int i3 = vVar.f16184b;
        C6790h.m12350f(bArr2, bArr, i, i3, i3 + min);
        int i4 = vVar.f16184b + min;
        vVar.f16184b = i4;
        this.f16140h -= (long) min;
        if (i4 != vVar.f16185c) {
            return min;
        }
        this.f16139g = vVar.mo25996a();
        C8062w.m14927a(vVar);
        return min;
    }

    public byte readByte() {
        if (this.f16140h != 0) {
            C8061v vVar = this.f16139g;
            C6888i.m12436c(vVar);
            int i = vVar.f16184b;
            int i2 = vVar.f16185c;
            int i3 = i + 1;
            byte b = vVar.f16183a[i];
            this.f16140h--;
            if (i3 == i2) {
                this.f16139g = vVar.mo25996a();
                C8062w.m14927a(vVar);
            } else {
                vVar.f16184b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (this.f16140h >= 4) {
            C8061v vVar = this.f16139g;
            C6888i.m12436c(vVar);
            int i = vVar.f16184b;
            int i2 = vVar.f16185c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & ExifInterface.MARKER) << 24) | ((readByte() & ExifInterface.MARKER) << 16) | ((readByte() & ExifInterface.MARKER) << 8) | (readByte() & ExifInterface.MARKER);
            }
            byte[] bArr = vVar.f16183a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i3] & ExifInterface.MARKER) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & ExifInterface.MARKER) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & ExifInterface.MARKER);
            this.f16140h -= 4;
            if (i6 == i2) {
                this.f16139g = vVar.mo25996a();
                C8062w.m14927a(vVar);
            } else {
                vVar.f16184b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (this.f16140h >= 2) {
            C8061v vVar = this.f16139g;
            C6888i.m12436c(vVar);
            int i = vVar.f16184b;
            int i2 = vVar.f16185c;
            if (i2 - i < 2) {
                return (short) (((readByte() & ExifInterface.MARKER) << 8) | (readByte() & ExifInterface.MARKER));
            }
            byte[] bArr = vVar.f16183a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & ExifInterface.MARKER) << 8) | (bArr[i3] & ExifInterface.MARKER);
            this.f16140h -= 2;
            if (i4 == i2) {
                this.f16139g = vVar.mo25996a();
                C8062w.m14927a(vVar);
            } else {
                vVar.f16184b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s0 */
    public C8040e mo25933s0(C8044h hVar) {
        C6888i.m12438e(hVar, "byteString");
        hVar.mo25953A(this, 0, hVar.mo25959l());
        return this;
    }

    public void skip(long j) {
        while (j > 0) {
            C8061v vVar = this.f16139g;
            if (vVar != null) {
                int min = (int) Math.min(j, (long) (vVar.f16185c - vVar.f16184b));
                long j2 = (long) min;
                this.f16140h -= j2;
                j -= j2;
                int i = vVar.f16184b + min;
                vVar.f16184b = i;
                if (i == vVar.f16185c) {
                    this.f16139g = vVar.mo25996a();
                    C8062w.m14927a(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public boolean mo25935t(long j) {
        return this.f16140h >= j;
    }

    /* renamed from: t0 */
    public C8040e mo25936t0(byte[] bArr) {
        C6888i.m12438e(bArr, "source");
        mo25938u0(bArr, 0, bArr.length);
        return this;
    }

    public String toString() {
        long j = this.f16140h;
        if (j <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            return mo25925q0((int) j).toString();
        }
        StringBuilder u = C0843a.m460u("size > Int.MAX_VALUE: ");
        u.append(this.f16140h);
        throw new IllegalStateException(u.toString().toString());
    }

    /* renamed from: u0 */
    public C8040e mo25938u0(byte[] bArr, int i, int i2) {
        C6888i.m12438e(bArr, "source");
        long j = (long) i2;
        C5266a.m9848N((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C8061v r0 = mo25927r0(1);
            int min = Math.min(i3 - i, 8192 - r0.f16185c);
            int i4 = i + min;
            C6790h.m12350f(bArr, r0.f16183a, r0.f16185c, i, i4);
            r0.f16185c += min;
            i = i4;
        }
        this.f16140h += j;
        return this;
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8042f mo25939v(int i) {
        mo25943x0(i);
        return this;
    }

    /* renamed from: v0 */
    public C8040e mo25940v0(int i) {
        C8061v r0 = mo25927r0(1);
        byte[] bArr = r0.f16183a;
        int i2 = r0.f16185c;
        r0.f16185c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f16140h++;
        return this;
    }

    /* renamed from: w0 */
    public C8040e mo25920o(long j) {
        if (j == 0) {
            mo25940v0(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C8061v r0 = mo25927r0(i);
            byte[] bArr = r0.f16183a;
            int i2 = r0.f16185c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = C8037a.f16135a[(int) (15 & j)];
                j >>>= 4;
            }
            r0.f16185c += i;
            this.f16140h += (long) i;
        }
        return this;
    }

    public int write(ByteBuffer byteBuffer) {
        C6888i.m12438e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C8061v r0 = mo25927r0(1);
            int min = Math.min(i, 8192 - r0.f16185c);
            byteBuffer.get(r0.f16183a, r0.f16185c, min);
            i -= min;
            r0.f16185c += min;
        }
        this.f16140h += (long) remaining;
        return remaining;
    }

    /* renamed from: x0 */
    public C8040e mo25943x0(int i) {
        C8061v r0 = mo25927r0(4);
        byte[] bArr = r0.f16183a;
        int i2 = r0.f16185c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        r0.f16185c = i5 + 1;
        this.f16140h += 4;
        return this;
    }

    /* renamed from: y */
    public String mo25944y() {
        return mo25896U(RecyclerView.FOREVER_NS);
    }

    /* renamed from: y0 */
    public C8040e mo25945y0(int i) {
        C8061v r0 = mo25927r0(2);
        byte[] bArr = r0.f16183a;
        int i2 = r0.f16185c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        r0.f16185c = i3 + 1;
        this.f16140h += 2;
        return this;
    }

    /* renamed from: z */
    public final C8040e mo25946z(C8040e eVar, long j, long j2) {
        C6888i.m12438e(eVar, "out");
        C5266a.m9848N(this.f16140h, j, j2);
        if (j2 != 0) {
            eVar.f16140h += j2;
            C8061v vVar = this.f16139g;
            while (true) {
                C6888i.m12436c(vVar);
                int i = vVar.f16185c;
                int i2 = vVar.f16184b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                vVar = vVar.f16188f;
            }
            while (j2 > 0) {
                C6888i.m12436c(vVar);
                C8061v c = vVar.mo25998c();
                int i3 = c.f16184b + ((int) j);
                c.f16184b = i3;
                c.f16185c = Math.min(i3 + ((int) j2), c.f16185c);
                C8061v vVar2 = eVar.f16139g;
                if (vVar2 == null) {
                    c.f16189g = c;
                    c.f16188f = c;
                    eVar.f16139g = c;
                } else {
                    C6888i.m12436c(vVar2);
                    C8061v vVar3 = vVar2.f16189g;
                    C6888i.m12436c(vVar3);
                    vVar3.mo25997b(c);
                }
                j2 -= (long) (c.f16185c - c.f16184b);
                vVar = vVar.f16188f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: z0 */
    public C8040e mo25947z0(String str) {
        C6888i.m12438e(str, "string");
        mo25883A0(str, 0, str.length());
        return this;
    }
}
