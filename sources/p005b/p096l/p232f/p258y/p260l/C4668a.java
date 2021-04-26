package p005b.p096l.p232f.p258y.p260l;

/* renamed from: b.l.f.y.l.a */
public final class C4668a {

    /* renamed from: h */
    public static final C4668a f8859h = new C4668a(4201, 4096, 1);

    /* renamed from: i */
    public static final C4668a f8860i = new C4668a(1033, 1024, 1);

    /* renamed from: j */
    public static final C4668a f8861j;

    /* renamed from: k */
    public static final C4668a f8862k = new C4668a(19, 16, 1);

    /* renamed from: l */
    public static final C4668a f8863l = new C4668a(285, 256, 0);

    /* renamed from: m */
    public static final C4668a f8864m;

    /* renamed from: n */
    public static final C4668a f8865n;

    /* renamed from: o */
    public static final C4668a f8866o;

    /* renamed from: a */
    public final int[] f8867a;

    /* renamed from: b */
    public final int[] f8868b;

    /* renamed from: c */
    public final C4669b f8869c;

    /* renamed from: d */
    public final C4669b f8870d;

    /* renamed from: e */
    public final int f8871e;

    /* renamed from: f */
    public final int f8872f;

    /* renamed from: g */
    public final int f8873g;

    static {
        C4668a aVar = new C4668a(67, 64, 1);
        f8861j = aVar;
        C4668a aVar2 = new C4668a(301, 256, 1);
        f8864m = aVar2;
        f8865n = aVar2;
        f8866o = aVar;
    }

    public C4668a(int i, int i2, int i3) {
        this.f8872f = i;
        this.f8871e = i2;
        this.f8873g = i3;
        this.f8867a = new int[i2];
        this.f8868b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f8867a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f8868b[this.f8867a[i6]] = i6;
        }
        this.f8869c = new C4669b(this, new int[]{0});
        this.f8870d = new C4669b(this, new int[]{1});
    }

    /* renamed from: a */
    public C4669b mo16350a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f8869c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C4669b(this, iArr);
        }
    }

    /* renamed from: b */
    public int mo16351b(int i) {
        if (i != 0) {
            return this.f8867a[(this.f8871e - this.f8868b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    public int mo16352c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f8867a;
        int[] iArr2 = this.f8868b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f8871e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f8872f) + ',' + this.f8871e + ')';
    }
}
