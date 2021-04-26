package p005b.p096l.p232f.p258y.p260l;

import java.util.Objects;

/* renamed from: b.l.f.y.l.b */
public final class C4669b {

    /* renamed from: a */
    public final C4668a f8874a;

    /* renamed from: b */
    public final int[] f8875b;

    public C4669b(C4668a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f8874a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f8875b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f8875b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f8875b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C4669b mo16354a(C4669b bVar) {
        if (!this.f8874a.equals(bVar.f8874a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo16358e()) {
            return bVar;
        } else {
            if (bVar.mo16358e()) {
                return this;
            }
            int[] iArr = this.f8875b;
            int[] iArr2 = bVar.f8875b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = iArr2[i - length] ^ iArr[i];
            }
            return new C4669b(this.f8874a, iArr4);
        }
    }

    /* renamed from: b */
    public int mo16355b(int i) {
        if (i == 0) {
            return mo16356c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f8875b) {
                C4668a aVar = C4668a.f8859h;
                i2 ^= i3;
            }
            return i2;
        }
        int[] iArr = this.f8875b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = this.f8874a.mo16352c(i, i4) ^ this.f8875b[i5];
        }
        return i4;
    }

    /* renamed from: c */
    public int mo16356c(int i) {
        int[] iArr = this.f8875b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int mo16357d() {
        return this.f8875b.length - 1;
    }

    /* renamed from: e */
    public boolean mo16358e() {
        return this.f8875b[0] == 0;
    }

    /* renamed from: f */
    public C4669b mo16359f(int i) {
        if (i == 0) {
            return this.f8874a.f8869c;
        }
        if (i == 1) {
            return this;
        }
        int length = this.f8875b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f8874a.mo16352c(this.f8875b[i2], i);
        }
        return new C4669b(this.f8874a, iArr);
    }

    /* renamed from: g */
    public C4669b mo16360g(C4669b bVar) {
        if (!this.f8874a.equals(bVar.f8874a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo16358e() || bVar.mo16358e()) {
            return this.f8874a.f8869c;
        } else {
            int[] iArr = this.f8875b;
            int length = iArr.length;
            int[] iArr2 = bVar.f8875b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = iArr3[i4] ^ this.f8874a.mo16352c(i2, iArr2[i3]);
                }
            }
            return new C4669b(this.f8874a, iArr3);
        }
    }

    /* renamed from: h */
    public C4669b mo16361h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f8874a.f8869c;
        } else {
            int length = this.f8875b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f8874a.mo16352c(this.f8875b[i3], i2);
            }
            return new C4669b(this.f8874a, iArr);
        }
    }

    public String toString() {
        char c;
        if (mo16358e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(mo16357d() * 8);
        int d = mo16357d();
        while (d >= 0) {
            int c2 = mo16356c(d);
            if (c2 != 0) {
                if (c2 < 0) {
                    sb.append(d == mo16357d() ? "-" : " - ");
                    c2 = -c2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c2 != 1) {
                    C4668a aVar = this.f8874a;
                    Objects.requireNonNull(aVar);
                    if (c2 != 0) {
                        int i = aVar.f8868b[c2];
                        if (i == 0) {
                            c = '1';
                        } else if (i == 1) {
                            c = 'a';
                        } else {
                            sb.append("a^");
                            sb.append(i);
                        }
                        sb.append(c);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
            d--;
        }
        return sb.toString();
    }
}
