package p005b.p096l.p097a.p113c.p131e.p136e;

import java.io.OutputStream;

/* renamed from: b.l.a.c.e.e.sm */
public final class C2485sm extends C2509tm {

    /* renamed from: d */
    public final byte[] f4294d;

    /* renamed from: e */
    public final int f4295e;

    /* renamed from: f */
    public int f4296f;

    /* renamed from: g */
    public int f4297g;

    /* renamed from: h */
    public final OutputStream f4298h;

    public C2485sm(OutputStream outputStream, int i) {
        super((C2413pm) null);
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.f4294d = new byte[max];
            this.f4295e = max;
            this.f4298h = outputStream;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* renamed from: A */
    public final void mo12993A(int i) {
        if (this.f4295e - this.f4296f < i) {
            mo12994B();
        }
    }

    /* renamed from: B */
    public final void mo12994B() {
        this.f4298h.write(this.f4294d, 0, this.f4296f);
        this.f4296f = 0;
    }

    /* renamed from: C */
    public final void mo12995C(int i) {
        if (C2509tm.f4330c) {
            long j = (long) this.f4296f;
            while ((i & -128) != 0) {
                byte[] bArr = this.f4294d;
                int i2 = this.f4296f;
                this.f4296f = i2 + 1;
                C2272k1.m3632n(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f4294d;
            int i3 = this.f4296f;
            this.f4296f = i3 + 1;
            C2272k1.m3632n(bArr2, (long) i3, (byte) i);
            this.f4297g += (int) (((long) this.f4296f) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f4294d;
            int i4 = this.f4296f;
            this.f4296f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f4297g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f4294d;
        int i5 = this.f4296f;
        this.f4296f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f4297g++;
    }

    /* renamed from: D */
    public final void mo12996D(long j) {
        if (C2509tm.f4330c) {
            long j2 = (long) this.f4296f;
            while ((j & -128) != 0) {
                byte[] bArr = this.f4294d;
                int i = this.f4296f;
                this.f4296f = i + 1;
                C2272k1.m3632n(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f4294d;
            int i2 = this.f4296f;
            this.f4296f = i2 + 1;
            C2272k1.m3632n(bArr2, (long) i2, (byte) ((int) j));
            this.f4297g += (int) (((long) this.f4296f) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f4294d;
            int i3 = this.f4296f;
            this.f4296f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f4297g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f4294d;
        int i4 = this.f4296f;
        this.f4296f = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f4297g++;
    }

    /* renamed from: E */
    public final void mo12997E(int i) {
        byte[] bArr = this.f4294d;
        int i2 = this.f4296f;
        int i3 = i2 + 1;
        this.f4296f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f4296f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f4296f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f4296f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f4297g += 4;
    }

    /* renamed from: F */
    public final void mo12998F(long j) {
        byte[] bArr = this.f4294d;
        int i = this.f4296f;
        int i2 = i + 1;
        this.f4296f = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.f4296f = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.f4296f = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.f4296f = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.f4296f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f4296f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f4296f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f4296f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f4297g += 8;
    }

    /* renamed from: G */
    public final void mo12999G(byte[] bArr, int i, int i2) {
        int i3 = this.f4295e;
        int i4 = this.f4296f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.f4294d, i4, i2);
            this.f4296f += i2;
        } else {
            System.arraycopy(bArr, 0, this.f4294d, i4, i5);
            i2 -= i5;
            this.f4296f = this.f4295e;
            this.f4297g += i5;
            mo12994B();
            if (i2 <= this.f4295e) {
                System.arraycopy(bArr, i5, this.f4294d, 0, i2);
                this.f4296f = i2;
            } else {
                this.f4298h.write(bArr, i5, i2);
            }
        }
        this.f4297g += i2;
    }

    /* renamed from: a */
    public final void mo12688a(byte[] bArr, int i, int i2) {
        mo12999G(bArr, 0, i2);
    }

    /* renamed from: i */
    public final void mo12933i(int i, int i2) {
        mo12945u((i << 3) | i2);
    }

    /* renamed from: j */
    public final void mo12934j(int i, int i2) {
        mo12993A(20);
        mo12995C(i << 3);
        if (i2 >= 0) {
            mo12995C(i2);
        } else {
            mo12996D((long) i2);
        }
    }

    /* renamed from: k */
    public final void mo12935k(int i, int i2) {
        mo12993A(20);
        mo12995C(i << 3);
        mo12995C(i2);
    }

    /* renamed from: l */
    public final void mo12936l(int i, int i2) {
        mo12993A(14);
        mo12995C((i << 3) | 5);
        mo12997E(i2);
    }

    /* renamed from: m */
    public final void mo12937m(int i, long j) {
        mo12993A(20);
        mo12995C(i << 3);
        mo12996D(j);
    }

    /* renamed from: n */
    public final void mo12938n(int i, long j) {
        mo12993A(18);
        mo12995C((i << 3) | 1);
        mo12998F(j);
    }

    /* renamed from: o */
    public final void mo12939o(int i, boolean z) {
        mo12993A(11);
        mo12995C(i << 3);
        byte[] bArr = this.f4294d;
        int i2 = this.f4296f;
        this.f4296f = i2 + 1;
        bArr[i2] = z ? (byte) 1 : 0;
        this.f4297g++;
    }

    /* renamed from: p */
    public final void mo12940p(int i, String str) {
        int i2;
        int i3;
        mo12945u((i << 3) | 2);
        try {
            int length = str.length() * 3;
            int b = C2509tm.m4203b(length);
            int i4 = b + length;
            int i5 = this.f4295e;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int c = C2344n1.m3790c(str, bArr, 0, length);
                mo12945u(c);
                mo12999G(bArr, 0, c);
                return;
            }
            if (i4 > i5 - this.f4296f) {
                mo12994B();
            }
            int b2 = C2509tm.m4203b(str.length());
            i2 = this.f4296f;
            if (b2 == b) {
                int i6 = i2 + b2;
                this.f4296f = i6;
                int c2 = C2344n1.m3790c(str, this.f4294d, i6, this.f4295e - i6);
                this.f4296f = i2;
                i3 = (c2 - i2) - b2;
                mo12995C(i3);
                this.f4296f = c2;
            } else {
                i3 = C2344n1.m3789b(str);
                mo12995C(i3);
                this.f4296f = C2344n1.m3790c(str, this.f4294d, this.f4296f, i3);
            }
            this.f4297g += i3;
        } catch (C2320m1 e) {
            this.f4297g -= this.f4296f - i2;
            this.f4296f = i2;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C2461rm(e2);
        } catch (C2320m1 e3) {
            mo13020g(str, e3);
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
        if (this.f4296f == this.f4295e) {
            mo12994B();
        }
        byte[] bArr = this.f4294d;
        int i = this.f4296f;
        this.f4296f = i + 1;
        bArr[i] = b;
        this.f4297g++;
    }

    /* renamed from: t */
    public final void mo12944t(int i) {
        if (i >= 0) {
            mo12993A(5);
            mo12995C(i);
            return;
        }
        mo12947w((long) i);
    }

    /* renamed from: u */
    public final void mo12945u(int i) {
        mo12993A(5);
        mo12995C(i);
    }

    /* renamed from: v */
    public final void mo12946v(int i) {
        mo12993A(4);
        mo12997E(i);
    }

    /* renamed from: w */
    public final void mo12947w(long j) {
        mo12993A(10);
        mo12996D(j);
    }

    /* renamed from: x */
    public final void mo12948x(long j) {
        mo12993A(8);
        mo12998F(j);
    }
}
