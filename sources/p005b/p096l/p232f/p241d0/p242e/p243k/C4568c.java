package p005b.p096l.p232f.p241d0.p242e.p243k;

/* renamed from: b.l.f.d0.e.k.c */
public final class C4568c {

    /* renamed from: a */
    public final C4567b f8542a;

    /* renamed from: b */
    public final int[] f8543b;

    public C4568c(C4567b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f8542a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f8543b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f8543b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f8543b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C4568c mo16226a(C4568c cVar) {
        if (!this.f8542a.equals(cVar.f8542a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo16230e()) {
            return cVar;
        } else {
            if (cVar.mo16230e()) {
                return this;
            }
            int[] iArr = this.f8543b;
            int[] iArr2 = cVar.f8543b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f8542a.mo16221a(iArr2[i - length], iArr[i]);
            }
            return new C4568c(this.f8542a, iArr4);
        }
    }

    /* renamed from: b */
    public int mo16227b(int i) {
        if (i == 0) {
            return mo16228c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f8543b) {
                i2 = this.f8542a.mo16221a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f8543b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C4567b bVar = this.f8542a;
            i3 = bVar.mo16221a(bVar.mo16224d(i, i3), this.f8543b[i4]);
        }
        return i3;
    }

    /* renamed from: c */
    public int mo16228c(int i) {
        int[] iArr = this.f8543b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int mo16229d() {
        return this.f8543b.length - 1;
    }

    /* renamed from: e */
    public boolean mo16230e() {
        return this.f8543b[0] == 0;
    }

    /* renamed from: f */
    public C4568c mo16231f(int i) {
        if (i == 0) {
            return this.f8542a.f8540c;
        }
        if (i == 1) {
            return this;
        }
        int length = this.f8543b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f8542a.mo16224d(this.f8543b[i2], i);
        }
        return new C4568c(this.f8542a, iArr);
    }

    /* renamed from: g */
    public C4568c mo16232g(C4568c cVar) {
        if (!this.f8542a.equals(cVar.f8542a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo16230e() || cVar.mo16230e()) {
            return this.f8542a.f8540c;
        } else {
            int[] iArr = this.f8543b;
            int length = iArr.length;
            int[] iArr2 = cVar.f8543b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C4567b bVar = this.f8542a;
                    iArr3[i4] = bVar.mo16221a(iArr3[i4], bVar.mo16224d(i2, iArr2[i3]));
                }
            }
            return new C4568c(this.f8542a, iArr3);
        }
    }

    /* renamed from: h */
    public C4568c mo16233h() {
        int length = this.f8543b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f8542a.mo16225e(0, this.f8543b[i]);
        }
        return new C4568c(this.f8542a, iArr);
    }

    /* renamed from: i */
    public C4568c mo16234i(C4568c cVar) {
        if (this.f8542a.equals(cVar.f8542a)) {
            return cVar.mo16230e() ? this : mo16226a(cVar.mo16233h());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo16229d() * 8);
        for (int d = mo16229d(); d >= 0; d--) {
            int c = mo16228c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
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
        }
        return sb.toString();
    }
}
