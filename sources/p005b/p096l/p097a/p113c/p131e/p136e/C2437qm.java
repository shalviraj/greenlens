package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.qm */
public final class C2437qm extends C2509tm {

    /* renamed from: d */
    public final byte[] f4244d;

    /* renamed from: e */
    public final int f4245e;

    /* renamed from: f */
    public int f4246f;

    public C2437qm(byte[] bArr, int i, int i2) {
        super((C2413pm) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f4244d = bArr;
            this.f4246f = 0;
            this.f4245e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: A */
    public final int mo12932A() {
        return this.f4245e - this.f4246f;
    }

    /* renamed from: a */
    public final void mo12688a(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f4244d, this.f4246f, i2);
            this.f4246f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C2461rm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4246f), Integer.valueOf(this.f4245e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: i */
    public final void mo12933i(int i, int i2) {
        mo12945u((i << 3) | i2);
    }

    /* renamed from: j */
    public final void mo12934j(int i, int i2) {
        mo12945u(i << 3);
        if (i2 >= 0) {
            mo12945u(i2);
        } else {
            mo12947w((long) i2);
        }
    }

    /* renamed from: k */
    public final void mo12935k(int i, int i2) {
        mo12945u(i << 3);
        mo12945u(i2);
    }

    /* renamed from: l */
    public final void mo12936l(int i, int i2) {
        mo12945u((i << 3) | 5);
        mo12946v(i2);
    }

    /* renamed from: m */
    public final void mo12937m(int i, long j) {
        mo12945u(i << 3);
        mo12947w(j);
    }

    /* renamed from: n */
    public final void mo12938n(int i, long j) {
        mo12945u((i << 3) | 1);
        mo12948x(j);
    }

    /* renamed from: o */
    public final void mo12939o(int i, boolean z) {
        mo12945u(i << 3);
        mo12943s(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo12940p(int i, String str) {
        int c;
        mo12945u((i << 3) | 2);
        int i2 = this.f4246f;
        try {
            int b = C2509tm.m4203b(str.length() * 3);
            int b2 = C2509tm.m4203b(str.length());
            if (b2 == b) {
                int i3 = i2 + b2;
                this.f4246f = i3;
                c = C2344n1.m3790c(str, this.f4244d, i3, this.f4245e - i3);
                this.f4246f = i2;
                mo12945u((c - i2) - b2);
            } else {
                mo12945u(C2344n1.m3789b(str));
                byte[] bArr = this.f4244d;
                int i4 = this.f4246f;
                c = C2344n1.m3790c(str, bArr, i4, this.f4245e - i4);
            }
            this.f4246f = c;
        } catch (C2320m1 e) {
            this.f4246f = i2;
            mo13020g(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C2461rm(e2);
        }
    }

    /* renamed from: q */
    public final void mo12941q(int i, C2317lm lmVar) {
        mo12945u((i << 3) | 2);
        mo12945u(lmVar.mo12755l());
        lmVar.mo12772A(this);
    }

    /* renamed from: r */
    public final void mo12942r(int i, C2072c0 c0Var, C2319m0 m0Var) {
        mo12945u((i << 3) | 2);
        C2069bm bmVar = (C2069bm) c0Var;
        int b = bmVar.mo12439b();
        if (b == -1) {
            b = m0Var.mo12556c(bmVar);
            bmVar.mo12440c(b);
        }
        mo12945u(b);
        m0Var.mo12561h(c0Var, this.f4331a);
    }

    /* renamed from: s */
    public final void mo12943s(byte b) {
        try {
            byte[] bArr = this.f4244d;
            int i = this.f4246f;
            this.f4246f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C2461rm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4246f), Integer.valueOf(this.f4245e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo12944t(int i) {
        if (i >= 0) {
            mo12945u(i);
        } else {
            mo12947w((long) i);
        }
    }

    /* renamed from: u */
    public final void mo12945u(int i) {
        if (C2509tm.f4330c) {
            int i2 = C2119dm.f3742a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f4244d;
            int i3 = this.f4246f;
            this.f4246f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f4244d;
            int i4 = this.f4246f;
            this.f4246f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C2461rm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4246f), Integer.valueOf(this.f4245e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo12946v(int i) {
        try {
            byte[] bArr = this.f4244d;
            int i2 = this.f4246f;
            int i3 = i2 + 1;
            this.f4246f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f4246f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f4246f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f4246f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2461rm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4246f), Integer.valueOf(this.f4245e), 1}), e);
        }
    }

    /* renamed from: w */
    public final void mo12947w(long j) {
        if (!C2509tm.f4330c || this.f4245e - this.f4246f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f4244d;
                int i = this.f4246f;
                this.f4246f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f4244d;
                int i2 = this.f4246f;
                this.f4246f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C2461rm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4246f), Integer.valueOf(this.f4245e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f4244d;
                int i3 = this.f4246f;
                this.f4246f = i3 + 1;
                C2272k1.m3632n(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f4244d;
            int i4 = this.f4246f;
            this.f4246f = i4 + 1;
            C2272k1.m3632n(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: x */
    public final void mo12948x(long j) {
        try {
            byte[] bArr = this.f4244d;
            int i = this.f4246f;
            int i2 = i + 1;
            this.f4246f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f4246f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f4246f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f4246f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f4246f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f4246f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f4246f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f4246f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2461rm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4246f), Integer.valueOf(this.f4245e), 1}), e);
        }
    }
}
