package p005b.p096l.p232f.p258y;

import java.util.Arrays;

/* renamed from: b.l.f.y.b */
public final class C4658b implements Cloneable {

    /* renamed from: g */
    public final int f8787g;

    /* renamed from: h */
    public final int f8788h;

    /* renamed from: i */
    public final int f8789i;

    /* renamed from: j */
    public final int[] f8790j;

    public C4658b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f8787g = i;
        this.f8788h = i2;
        int i3 = (i + 31) / 32;
        this.f8789i = i3;
        this.f8790j = new int[(i3 * i2)];
    }

    public C4658b(int i, int i2, int i3, int[] iArr) {
        this.f8787g = i;
        this.f8788h = i2;
        this.f8789i = i3;
        this.f8790j = iArr;
    }

    /* renamed from: a */
    public void mo16332a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f8789i);
        int[] iArr = this.f8790j;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: b */
    public boolean mo16333b(int i, int i2) {
        return ((this.f8790j[(i / 32) + (i2 * this.f8789i)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: c */
    public int[] mo16334c() {
        int length = this.f8790j.length - 1;
        while (length >= 0 && this.f8790j[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f8789i;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f8790j[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public Object clone() {
        return new C4658b(this.f8787g, this.f8788h, this.f8789i, (int[]) this.f8790j.clone());
    }

    /* renamed from: d */
    public C4657a mo16336d(int i, C4657a aVar) {
        int i2 = aVar.f8786h;
        int i3 = this.f8787g;
        if (i2 < i3) {
            aVar = new C4657a(i3);
        } else {
            int length = aVar.f8785g.length;
            for (int i4 = 0; i4 < length; i4++) {
                aVar.f8785g[i4] = 0;
            }
        }
        int i5 = i * this.f8789i;
        for (int i6 = 0; i6 < this.f8789i; i6++) {
            aVar.f8785g[(i6 << 5) / 32] = this.f8790j[i5 + i6];
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4658b)) {
            return false;
        }
        C4658b bVar = (C4658b) obj;
        return this.f8787g == bVar.f8787g && this.f8788h == bVar.f8788h && this.f8789i == bVar.f8789i && Arrays.equals(this.f8790j, bVar.f8790j);
    }

    /* renamed from: f */
    public int[] mo16338f() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f8790j;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f8789i;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: g */
    public void mo16339g(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f8789i);
        int[] iArr = this.f8790j;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: h */
    public void mo16340h(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f8788h || i5 > this.f8787g) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f8789i * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f8790j;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public int hashCode() {
        int i = this.f8787g;
        return Arrays.hashCode(this.f8790j) + (((((((i * 31) + i) * 31) + this.f8788h) * 31) + this.f8789i) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f8787g + 1) * this.f8788h);
        for (int i = 0; i < this.f8788h; i++) {
            for (int i2 = 0; i2 < this.f8787g; i2++) {
                sb.append(mo16333b(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
