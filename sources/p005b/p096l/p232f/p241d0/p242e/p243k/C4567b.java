package p005b.p096l.p232f.p241d0.p242e.p243k;

/* renamed from: b.l.f.d0.e.k.b */
public final class C4567b {

    /* renamed from: e */
    public static final C4567b f8537e = new C4567b(929, 3);

    /* renamed from: a */
    public final int[] f8538a;

    /* renamed from: b */
    public final int[] f8539b;

    /* renamed from: c */
    public final C4568c f8540c;

    /* renamed from: d */
    public final C4568c f8541d;

    public C4567b(int i, int i2) {
        this.f8538a = new int[i];
        this.f8539b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f8538a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f8539b[this.f8538a[i5]] = i5;
        }
        this.f8540c = new C4568c(this, new int[]{0});
        this.f8541d = new C4568c(this, new int[]{1});
    }

    /* renamed from: a */
    public int mo16221a(int i, int i2) {
        return (i + i2) % 929;
    }

    /* renamed from: b */
    public C4568c mo16222b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f8540c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C4568c(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo16223c(int i) {
        if (i != 0) {
            return this.f8538a[(929 - this.f8539b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: d */
    public int mo16224d(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f8538a;
        int[] iArr2 = this.f8539b;
        return iArr[(iArr2[i] + iArr2[i2]) % 928];
    }

    /* renamed from: e */
    public int mo16225e(int i, int i2) {
        return ((i + 929) - i2) % 929;
    }
}
