package p005b.p096l.p232f.p250w.p253f;

import java.util.Objects;

/* renamed from: b.l.f.w.f.f */
public final class C4641f {

    /* renamed from: e */
    public static final C4641f f8745e = new C4641f(C4642g.f8750b, 0, 0, 0);

    /* renamed from: a */
    public final int f8746a;

    /* renamed from: b */
    public final C4642g f8747b;

    /* renamed from: c */
    public final int f8748c;

    /* renamed from: d */
    public final int f8749d;

    public C4641f(C4642g gVar, int i, int i2, int i3) {
        this.f8747b = gVar;
        this.f8746a = i;
        this.f8748c = i2;
        this.f8749d = i3;
    }

    /* renamed from: b */
    public static int m8553b(C4641f fVar) {
        int i = fVar.f8748c;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    /* renamed from: a */
    public C4641f mo16302a(int i) {
        C4642g gVar = this.f8747b;
        int i2 = this.f8746a;
        int i3 = this.f8749d;
        if (i2 == 4 || i2 == 2) {
            int i4 = C4639d.f8739c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            Objects.requireNonNull(gVar);
            C4640e eVar = new C4640e(gVar, i5, i6);
            i3 += i6;
            i2 = 0;
            gVar = eVar;
        }
        int i7 = this.f8748c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        C4641f fVar = new C4641f(gVar, i2, i9, i3 + i8);
        return i9 == 2078 ? fVar.mo16303c(i + 1) : fVar;
    }

    /* renamed from: c */
    public C4641f mo16303c(int i) {
        int i2 = this.f8748c;
        if (i2 == 0) {
            return this;
        }
        C4642g gVar = this.f8747b;
        Objects.requireNonNull(gVar);
        return new C4641f(new C4636a(gVar, i - i2, i2), this.f8746a, 0, this.f8749d);
    }

    /* renamed from: d */
    public boolean mo16304d(C4641f fVar) {
        int i = this.f8749d + (C4639d.f8739c[this.f8746a][fVar.f8746a] >> 16);
        int i2 = this.f8748c;
        int i3 = fVar.f8748c;
        if (i2 < i3) {
            i += m8553b(fVar) - m8553b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= fVar.f8749d;
    }

    /* renamed from: e */
    public C4641f mo16305e(int i, int i2) {
        int i3 = this.f8749d;
        C4642g gVar = this.f8747b;
        int i4 = this.f8746a;
        if (i != i4) {
            int i5 = C4639d.f8739c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            Objects.requireNonNull(gVar);
            i3 += i7;
            gVar = new C4640e(gVar, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        Objects.requireNonNull(gVar);
        return new C4641f(new C4640e(gVar, i2, i8), i, 0, i3 + i8);
    }

    /* renamed from: f */
    public C4641f mo16306f(int i, int i2) {
        C4642g gVar = this.f8747b;
        int i3 = this.f8746a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = C4639d.f8741e[i3][i];
        Objects.requireNonNull(gVar);
        return new C4641f(new C4640e(new C4640e(gVar, i5, i4), i2, 5), this.f8746a, 0, this.f8749d + i4 + 5);
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C4639d.f8738b[this.f8746a], Integer.valueOf(this.f8749d), Integer.valueOf(this.f8748c)});
    }
}
