package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.IOException;
import java.io.OutputStream;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.a.a.a.y0.g.e */
public final class C7089e {

    /* renamed from: a */
    public final byte[] f14177a;

    /* renamed from: b */
    public final int f14178b;

    /* renamed from: c */
    public int f14179c;

    /* renamed from: d */
    public int f14180d = 0;

    /* renamed from: e */
    public final OutputStream f14181e;

    /* renamed from: d.a.a.a.y0.g.e$a */
    public static class C7090a extends IOException {
        public C7090a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public C7089e(OutputStream outputStream, byte[] bArr) {
        this.f14181e = outputStream;
        this.f14177a = bArr;
        this.f14179c = 0;
        this.f14178b = bArr.length;
    }

    /* renamed from: a */
    public static int m12723a(C7085c cVar) {
        return cVar.size() + m12729g(cVar.size());
    }

    /* renamed from: b */
    public static int m12724b(int i, int i2) {
        return m12731i(i) + m12726d(i2);
    }

    /* renamed from: c */
    public static int m12725c(int i, int i2) {
        return m12726d(i2) + m12731i(i);
    }

    /* renamed from: d */
    public static int m12726d(int i) {
        if (i >= 0) {
            return m12729g(i);
        }
        return 10;
    }

    /* renamed from: e */
    public static int m12727e(int i, C7117p pVar) {
        int i2 = m12731i(i);
        int a = pVar.mo23683a();
        return i2 + m12729g(a) + a;
    }

    /* renamed from: f */
    public static int m12728f(C7117p pVar) {
        int a = pVar.mo23683a();
        return m12729g(a) + a;
    }

    /* renamed from: g */
    public static int m12729g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: h */
    public static int m12730h(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: i */
    public static int m12731i(int i) {
        return m12729g((i << 3) | 0);
    }

    /* renamed from: k */
    public static C7089e m12732k(OutputStream outputStream, int i) {
        return new C7089e(outputStream, new byte[i]);
    }

    /* renamed from: A */
    public void mo24643A(int i, int i2) {
        mo24658y((i << 3) | i2);
    }

    /* renamed from: j */
    public void mo24644j() {
        if (this.f14181e != null) {
            mo24645l();
        }
    }

    /* renamed from: l */
    public final void mo24645l() {
        OutputStream outputStream = this.f14181e;
        if (outputStream != null) {
            outputStream.write(this.f14177a, 0, this.f14179c);
            this.f14179c = 0;
            return;
        }
        throw new C7090a();
    }

    /* renamed from: m */
    public void mo24646m(C7085c cVar) {
        mo24658y(cVar.size());
        mo24654u(cVar);
    }

    /* renamed from: n */
    public void mo24647n(int i, int i2) {
        mo24658y((i << 3) | 0);
        if (i2 >= 0) {
            mo24658y(i2);
        } else {
            mo24659z((long) i2);
        }
    }

    /* renamed from: o */
    public void mo24648o(int i) {
        if (i >= 0) {
            mo24658y(i);
        } else {
            mo24659z((long) i);
        }
    }

    /* renamed from: p */
    public void mo24649p(int i, int i2) {
        mo24658y((i << 3) | 0);
        if (i2 >= 0) {
            mo24658y(i2);
        } else {
            mo24659z((long) i2);
        }
    }

    /* renamed from: q */
    public void mo24650q(int i) {
        if (i >= 0) {
            mo24658y(i);
        } else {
            mo24659z((long) i);
        }
    }

    /* renamed from: r */
    public void mo24651r(int i, C7117p pVar) {
        mo24658y((i << 3) | 2);
        mo24658y(pVar.mo23683a());
        pVar.mo23685d(this);
    }

    /* renamed from: s */
    public void mo24652s(C7117p pVar) {
        mo24658y(pVar.mo23683a());
        pVar.mo23685d(this);
    }

    /* renamed from: t */
    public void mo24653t(int i) {
        byte b = (byte) i;
        if (this.f14179c == this.f14178b) {
            mo24645l();
        }
        byte[] bArr = this.f14177a;
        int i2 = this.f14179c;
        this.f14179c = i2 + 1;
        bArr[i2] = b;
        this.f14180d++;
    }

    /* renamed from: u */
    public void mo24654u(C7085c cVar) {
        int size = cVar.size();
        int i = this.f14178b;
        int i2 = this.f14179c;
        int i3 = i - i2;
        if (i3 >= size) {
            cVar.mo24609n(this.f14177a, 0, i2, size);
            this.f14179c += size;
        } else {
            cVar.mo24609n(this.f14177a, 0, i2, i3);
            int i4 = i3 + 0;
            size -= i3;
            this.f14179c = this.f14178b;
            this.f14180d += i3;
            mo24645l();
            if (size <= this.f14178b) {
                cVar.mo24609n(this.f14177a, i4, 0, size);
                this.f14179c = size;
            } else {
                OutputStream outputStream = this.f14181e;
                if (i4 < 0) {
                    throw new IndexOutOfBoundsException(C0843a.m438N(30, "Source offset < 0: ", i4));
                } else if (size >= 0) {
                    int i5 = i4 + size;
                    if (i5 > cVar.size()) {
                        throw new IndexOutOfBoundsException(C0843a.m438N(39, "Source end offset exceeded: ", i5));
                    } else if (size > 0) {
                        cVar.mo24606K(outputStream, i4, size);
                    }
                } else {
                    throw new IndexOutOfBoundsException(C0843a.m438N(23, "Length < 0: ", size));
                }
            }
        }
        this.f14180d += size;
    }

    /* renamed from: v */
    public void mo24655v(byte[] bArr) {
        int length = bArr.length;
        int i = this.f14178b;
        int i2 = this.f14179c;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, this.f14177a, i2, length);
            this.f14179c += length;
        } else {
            System.arraycopy(bArr, 0, this.f14177a, i2, i3);
            int i4 = i3 + 0;
            length -= i3;
            this.f14179c = this.f14178b;
            this.f14180d += i3;
            mo24645l();
            if (length <= this.f14178b) {
                System.arraycopy(bArr, i4, this.f14177a, 0, length);
                this.f14179c = length;
            } else {
                this.f14181e.write(bArr, i4, length);
            }
        }
        this.f14180d += length;
    }

    /* renamed from: w */
    public void mo24656w(int i) {
        mo24653t(i & 255);
        mo24653t((i >> 8) & 255);
        mo24653t((i >> 16) & 255);
        mo24653t((i >> 24) & 255);
    }

    /* renamed from: x */
    public void mo24657x(long j) {
        mo24653t(((int) j) & 255);
        mo24653t(((int) (j >> 8)) & 255);
        mo24653t(((int) (j >> 16)) & 255);
        mo24653t(((int) (j >> 24)) & 255);
        mo24653t(((int) (j >> 32)) & 255);
        mo24653t(((int) (j >> 40)) & 255);
        mo24653t(((int) (j >> 48)) & 255);
        mo24653t(((int) (j >> 56)) & 255);
    }

    /* renamed from: y */
    public void mo24658y(int i) {
        while ((i & -128) != 0) {
            mo24653t((i & 127) | 128);
            i >>>= 7;
        }
        mo24653t(i);
    }

    /* renamed from: z */
    public void mo24659z(long j) {
        while ((-128 & j) != 0) {
            mo24653t((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo24653t((int) j);
    }
}
