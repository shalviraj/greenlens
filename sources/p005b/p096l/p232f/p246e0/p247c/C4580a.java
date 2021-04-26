package p005b.p096l.p232f.p246e0.p247c;

import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.e0.c.a */
public final class C4580a {

    /* renamed from: a */
    public final C4658b f8581a;

    /* renamed from: b */
    public C4597j f8582b;

    /* renamed from: c */
    public C4594g f8583c;

    /* renamed from: d */
    public boolean f8584d;

    public C4580a(C4658b bVar) {
        int i = bVar.f8788h;
        if (i < 21 || (i & 3) != 1) {
            throw C4614h.m8506a();
        }
        this.f8581a = bVar;
    }

    /* renamed from: a */
    public final int mo16239a(int i, int i2, int i3) {
        return this.f8584d ? this.f8581a.mo16333b(i2, i) : this.f8581a.mo16333b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* renamed from: b */
    public void mo16240b() {
        int i = 0;
        while (i < this.f8581a.f8787g) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                C4658b bVar = this.f8581a;
                if (i3 >= bVar.f8788h) {
                    break;
                }
                if (bVar.mo16333b(i, i3) != this.f8581a.mo16333b(i3, i)) {
                    this.f8581a.mo16332a(i3, i);
                    this.f8581a.mo16332a(i, i3);
                }
                i3++;
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public C4594g mo16241c() {
        C4594g gVar = this.f8583c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = mo16239a(i3, 8, i2);
        }
        int a = mo16239a(8, 7, mo16239a(8, 8, mo16239a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = mo16239a(8, i4, a);
        }
        int i5 = this.f8581a.f8788h;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = mo16239a(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = mo16239a(i8, 8, i);
        }
        C4594g a2 = C4594g.m8470a(a, i);
        if (a2 == null) {
            a2 = C4594g.m8470a(a ^ 21522, i ^ 21522);
        }
        this.f8583c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C4614h.m8506a();
    }

    /* renamed from: d */
    public C4597j mo16242d() {
        C4597j jVar = this.f8582b;
        if (jVar != null) {
            return jVar;
        }
        int i = this.f8581a.f8788h;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return C4597j.m8475d(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = mo16239a(i7, i6, i5);
            }
        }
        C4597j b = C4597j.m8474b(i5);
        if (b == null || b.mo16251c() != i) {
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = i - 9; i9 >= i3; i9--) {
                    i4 = mo16239a(i8, i9, i4);
                }
            }
            C4597j b2 = C4597j.m8474b(i4);
            if (b2 == null || b2.mo16251c() != i) {
                throw C4614h.m8506a();
            }
            this.f8582b = b2;
            return b2;
        }
        this.f8582b = b;
        return b;
    }

    /* renamed from: e */
    public void mo16243e() {
        if (this.f8583c != null) {
            C4582c cVar = C4582c.values()[this.f8583c.f8607b];
            C4658b bVar = this.f8581a;
            cVar.mo16245e(bVar, bVar.f8788h);
        }
    }
}
