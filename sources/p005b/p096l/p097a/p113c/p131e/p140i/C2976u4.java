package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.logging.Level;

/* renamed from: b.l.a.c.e.i.u4 */
public final class C2976u4 extends C3002w4 {

    /* renamed from: d */
    public final byte[] f5066d;

    /* renamed from: e */
    public final int f5067e;

    /* renamed from: f */
    public int f5068f;

    public C2976u4(byte[] bArr, int i, int i2) {
        super((C2963t4) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f5066d = bArr;
            this.f5068f = 0;
            this.f5067e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: d */
    public final void mo13770d(int i, int i2) {
        mo13781o((i << 3) | i2);
    }

    /* renamed from: e */
    public final void mo13771e(int i, int i2) {
        mo13781o(i << 3);
        if (i2 >= 0) {
            mo13781o(i2);
        } else {
            mo13783q((long) i2);
        }
    }

    /* renamed from: f */
    public final void mo13772f(int i, int i2) {
        mo13781o(i << 3);
        mo13781o(i2);
    }

    /* renamed from: g */
    public final void mo13773g(int i, int i2) {
        mo13781o((i << 3) | 5);
        mo13782p(i2);
    }

    /* renamed from: h */
    public final void mo13774h(int i, long j) {
        mo13781o(i << 3);
        mo13783q(j);
    }

    /* renamed from: i */
    public final void mo13775i(int i, long j) {
        mo13781o((i << 3) | 1);
        mo13784r(j);
    }

    /* renamed from: j */
    public final void mo13776j(int i, boolean z) {
        mo13781o(i << 3);
        mo13779m(z ? (byte) 1 : 0);
    }

    /* renamed from: k */
    public final void mo13777k(int i, String str) {
        int c;
        mo13781o((i << 3) | 2);
        int i2 = this.f5068f;
        try {
            int u = C3002w4.m5506u(str.length() * 3);
            int u2 = C3002w4.m5506u(str.length());
            if (u2 == u) {
                int i3 = i2 + u2;
                this.f5068f = i3;
                c = C3044z7.m5740c(str, this.f5066d, i3, this.f5067e - i3);
                this.f5068f = i2;
                mo13781o((c - i2) - u2);
            } else {
                mo13781o(C3044z7.m5739b(str));
                byte[] bArr = this.f5066d;
                int i4 = this.f5068f;
                c = C3044z7.m5740c(str, bArr, i4, this.f5067e - i4);
            }
            this.f5068f = c;
        } catch (C3031y7 e) {
            this.f5068f = i2;
            C3002w4.f5103b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(C2990v5.f5088a);
            try {
                int length = bytes.length;
                mo13781o(length);
                mo13786y(bytes, 0, length);
            } catch (IndexOutOfBoundsException e2) {
                throw new C2989v4(e2);
            } catch (C2989v4 e3) {
                throw e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new C2989v4(e4);
        }
    }

    /* renamed from: l */
    public final void mo13778l(int i, C2937r4 r4Var) {
        mo13781o((i << 3) | 2);
        mo13781o(r4Var.mo13567l());
        r4Var.mo13598w(this);
    }

    /* renamed from: m */
    public final void mo13779m(byte b) {
        try {
            byte[] bArr = this.f5066d;
            int i = this.f5068f;
            this.f5068f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C2989v4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5068f), Integer.valueOf(this.f5067e), 1}), e);
        }
    }

    /* renamed from: n */
    public final void mo13780n(int i) {
        if (i >= 0) {
            mo13781o(i);
        } else {
            mo13783q((long) i);
        }
    }

    /* renamed from: o */
    public final void mo13781o(int i) {
        if (C3002w4.f5104c) {
            int i2 = C2833j4.f4851a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f5066d;
            int i3 = this.f5068f;
            this.f5068f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f5066d;
            int i4 = this.f5068f;
            this.f5068f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C2989v4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5068f), Integer.valueOf(this.f5067e), 1}), e);
        }
    }

    /* renamed from: p */
    public final void mo13782p(int i) {
        try {
            byte[] bArr = this.f5066d;
            int i2 = this.f5068f;
            int i3 = i2 + 1;
            this.f5068f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f5068f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f5068f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f5068f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2989v4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5068f), Integer.valueOf(this.f5067e), 1}), e);
        }
    }

    /* renamed from: q */
    public final void mo13783q(long j) {
        if (!C3002w4.f5104c || this.f5067e - this.f5068f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f5066d;
                int i = this.f5068f;
                this.f5068f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f5066d;
                int i2 = this.f5068f;
                this.f5068f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C2989v4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5068f), Integer.valueOf(this.f5067e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f5066d;
                int i3 = this.f5068f;
                this.f5068f = i3 + 1;
                C3005w7.f5113e.mo13748a(bArr3, C3005w7.f5116h + ((long) i3), (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f5066d;
            int i4 = this.f5068f;
            this.f5068f = i4 + 1;
            C3005w7.f5113e.mo13748a(bArr4, C3005w7.f5116h + ((long) i4), (byte) ((int) j));
        }
    }

    /* renamed from: r */
    public final void mo13784r(long j) {
        try {
            byte[] bArr = this.f5066d;
            int i = this.f5068f;
            int i2 = i + 1;
            this.f5068f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f5068f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f5068f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f5068f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f5068f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f5068f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f5068f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f5068f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2989v4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5068f), Integer.valueOf(this.f5067e), 1}), e);
        }
    }

    /* renamed from: x */
    public final void mo13785x(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f5066d, this.f5068f, i2);
            this.f5068f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C2989v4(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5068f), Integer.valueOf(this.f5067e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: y */
    public final void mo13786y(byte[] bArr, int i, int i2) {
        mo13785x(bArr, 0, i2);
    }

    /* renamed from: z */
    public final int mo13787z() {
        return this.f5067e - this.f5068f;
    }
}
