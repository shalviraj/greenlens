package p005b.p096l.p232f.p258y;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: b.l.f.y.c */
public final class C4659c {

    /* renamed from: a */
    public final byte[] f8791a;

    /* renamed from: b */
    public int f8792b;

    /* renamed from: c */
    public int f8793c;

    public C4659c(byte[] bArr) {
        this.f8791a = bArr;
    }

    /* renamed from: a */
    public int mo16343a() {
        return ((this.f8791a.length - this.f8792b) * 8) - this.f8793c;
    }

    /* renamed from: b */
    public int mo16344b(int i) {
        if (i <= 0 || i > 32 || i > mo16343a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f8793c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f8791a;
            int i6 = this.f8792b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = i2 + i4;
            this.f8793c = i8;
            if (i8 == 8) {
                this.f8793c = 0;
                this.f8792b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f8791a;
            int i10 = this.f8792b;
            b = (bArr2[i10] & ExifInterface.MARKER) | i9;
            this.f8792b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f8791a[this.f8792b]) >> i11);
        this.f8793c += i;
        return i12;
    }
}
