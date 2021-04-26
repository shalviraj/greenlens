package p005b.p096l.p232f.p261z.p264e;

import java.util.Arrays;

/* renamed from: b.l.f.z.e.e */
public class C4689e {

    /* renamed from: a */
    public final CharSequence f8914a;

    /* renamed from: b */
    public final int f8915b;

    /* renamed from: c */
    public final int f8916c;

    /* renamed from: d */
    public final byte[] f8917d;

    public C4689e(CharSequence charSequence, int i, int i2) {
        this.f8914a = charSequence;
        this.f8916c = i;
        this.f8915b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f8917d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    public final void mo16378a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f8915b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f8916c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f8914a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        mo16380c(i2, i, z);
    }

    /* renamed from: b */
    public final boolean mo16379b(int i, int i2) {
        return this.f8917d[(i2 * this.f8916c) + i] < 0;
    }

    /* renamed from: c */
    public final void mo16380c(int i, int i2, boolean z) {
        this.f8917d[(i2 * this.f8916c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: d */
    public final void mo16381d(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        mo16378a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        mo16378a(i4, i6, i3, 2);
        int i7 = i - 1;
        mo16378a(i7, i5, i3, 3);
        mo16378a(i7, i6, i3, 4);
        mo16378a(i7, i2, i3, 5);
        mo16378a(i, i5, i3, 6);
        mo16378a(i, i6, i3, 7);
        mo16378a(i, i2, i3, 8);
    }
}
