package p005b.p096l.p232f;

/* renamed from: b.l.f.n */
public final class C4620n extends C4616j {

    /* renamed from: c */
    public final byte[] f8686c;

    /* renamed from: d */
    public final int f8687d;

    /* renamed from: e */
    public final int f8688e;

    public C4620n(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f8686c = bArr;
        this.f8687d = i;
        this.f8688e = i2;
        if (z) {
            int i7 = (i4 * i) + i3;
            int i8 = 0;
            while (i8 < i6) {
                int i9 = (i5 / 2) + i7;
                int i10 = (i7 + i5) - 1;
                int i11 = i7;
                while (i11 < i9) {
                    byte b = bArr[i11];
                    bArr[i11] = bArr[i10];
                    bArr[i10] = b;
                    i11++;
                    i10--;
                }
                i8++;
                i7 += this.f8687d;
            }
        }
    }

    /* renamed from: a */
    public byte[] mo16273a() {
        int i = this.f8680a;
        int i2 = this.f8681b;
        int i3 = this.f8687d;
        if (i == i3 && i2 == this.f8688e) {
            return this.f8686c;
        }
        int i4 = i * i2;
        byte[] bArr = new byte[i4];
        int i5 = (0 * i3) + 0;
        if (i == i3) {
            System.arraycopy(this.f8686c, i5, bArr, 0, i4);
            return bArr;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(this.f8686c, i5, bArr, i6 * i, i);
            i5 += this.f8687d;
        }
        return bArr;
    }

    /* renamed from: b */
    public byte[] mo16274b(int i, byte[] bArr) {
        if (i < 0 || i >= this.f8681b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int i2 = this.f8680a;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.f8686c, ((i + 0) * this.f8687d) + 0, bArr, 0, i2);
        return bArr;
    }
}
