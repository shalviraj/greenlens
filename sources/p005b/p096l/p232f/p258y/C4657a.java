package p005b.p096l.p232f.p258y;

import java.util.Arrays;

/* renamed from: b.l.f.y.a */
public final class C4657a implements Cloneable {

    /* renamed from: g */
    public int[] f8785g;

    /* renamed from: h */
    public int f8786h;

    public C4657a() {
        this.f8786h = 0;
        this.f8785g = new int[1];
    }

    public C4657a(int i) {
        this.f8786h = i;
        this.f8785g = new int[((i + 31) / 32)];
    }

    public C4657a(int[] iArr, int i) {
        this.f8785g = iArr;
        this.f8786h = i;
    }

    /* renamed from: a */
    public void mo16317a(boolean z) {
        mo16321d(this.f8786h + 1);
        if (z) {
            int[] iArr = this.f8785g;
            int i = this.f8786h;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f8786h++;
    }

    /* renamed from: b */
    public void mo16318b(C4657a aVar) {
        int i = aVar.f8786h;
        mo16321d(this.f8786h + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo16317a(aVar.mo16323f(i2));
        }
    }

    /* renamed from: c */
    public void mo16319c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        mo16321d(this.f8786h + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo16317a(z);
            i2--;
        }
    }

    public Object clone() {
        return new C4657a((int[]) this.f8785g.clone(), this.f8786h);
    }

    /* renamed from: d */
    public final void mo16321d(int i) {
        int[] iArr = this.f8785g;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f8785g = iArr2;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4657a)) {
            return false;
        }
        C4657a aVar = (C4657a) obj;
        return this.f8786h == aVar.f8786h && Arrays.equals(this.f8785g, aVar.f8785g);
    }

    /* renamed from: f */
    public boolean mo16323f(int i) {
        return ((1 << (i & 31)) & this.f8785g[i / 32]) != 0;
    }

    /* renamed from: g */
    public int mo16324g(int i) {
        int i2 = this.f8786h;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.f8785g[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f8785g;
            if (i3 == iArr.length) {
                return this.f8786h;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4) + (i3 << 5);
        int i5 = this.f8786h;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: h */
    public int mo16325h(int i) {
        int i2 = this.f8786h;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.f8785g[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f8785g;
            if (i3 == iArr.length) {
                return this.f8786h;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4) + (i3 << 5);
        int i5 = this.f8786h;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8785g) + (this.f8786h * 31);
    }

    /* renamed from: i */
    public int mo16327i() {
        return (this.f8786h + 7) / 8;
    }

    /* renamed from: j */
    public boolean mo16328j(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f8786h) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f8785g[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    /* renamed from: k */
    public void mo16329k() {
        int[] iArr = new int[this.f8785g.length];
        int i = (this.f8786h - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f8785g[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f8786h;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f8785g = iArr;
    }

    /* renamed from: l */
    public void mo16330l(int i) {
        int[] iArr = this.f8785g;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public String toString() {
        int i = this.f8786h;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f8786h; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo16323f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
