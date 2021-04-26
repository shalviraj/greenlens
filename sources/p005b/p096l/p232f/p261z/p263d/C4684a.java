package p005b.p096l.p232f.p261z.p263d;

import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4658b;
import p005b.p096l.p232f.p258y.p259k.C4667a;

/* renamed from: b.l.f.z.d.a */
public final class C4684a {

    /* renamed from: a */
    public final C4658b f8912a;

    /* renamed from: b */
    public final C4667a f8913b;

    public C4684a(C4658b bVar) {
        this.f8912a = bVar;
        this.f8913b = new C4667a(bVar, 10, bVar.f8787g / 2, bVar.f8788h / 2);
    }

    /* renamed from: b */
    public static C4625s m8616b(C4625s sVar, float f, float f2) {
        float f3 = sVar.f8708a;
        float f4 = sVar.f8709b;
        return new C4625s(f3 < f ? f3 - 1.0f : f3 + 1.0f, f4 < f2 ? f4 - 1.0f : f4 + 1.0f);
    }

    /* renamed from: c */
    public static C4625s m8617c(C4625s sVar, C4625s sVar2, int i) {
        float f = sVar2.f8708a;
        float f2 = sVar.f8708a;
        float f3 = (float) (i + 1);
        float f4 = sVar2.f8709b;
        float f5 = sVar.f8709b;
        return new C4625s(f2 + ((f - f2) / f3), f5 + ((f4 - f5) / f3));
    }

    /* renamed from: a */
    public final boolean mo16369a(C4625s sVar) {
        float f = sVar.f8708a;
        if (f < 0.0f) {
            return false;
        }
        C4658b bVar = this.f8912a;
        if (f >= ((float) bVar.f8787g)) {
            return false;
        }
        float f2 = sVar.f8709b;
        return f2 > 0.0f && f2 < ((float) bVar.f8788h);
    }

    /* renamed from: d */
    public final int mo16370d(C4625s sVar, C4625s sVar2) {
        C4625s sVar3 = sVar;
        C4625s sVar4 = sVar2;
        int i = (int) sVar3.f8708a;
        int i2 = (int) sVar3.f8709b;
        int i3 = (int) sVar4.f8708a;
        int i4 = (int) sVar4.f8709b;
        int i5 = 0;
        int i6 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            int i7 = i;
            i = i2;
            i2 = i7;
            int i8 = i3;
            i3 = i4;
            i4 = i8;
        }
        int abs = Math.abs(i3 - i);
        int abs2 = Math.abs(i4 - i2);
        int i9 = (-abs) / 2;
        int i10 = i2 < i4 ? 1 : -1;
        if (i >= i3) {
            i6 = -1;
        }
        boolean b = this.f8912a.mo16333b(z ? i2 : i, z ? i : i2);
        while (i != i3) {
            boolean b2 = this.f8912a.mo16333b(z ? i2 : i, z ? i : i2);
            if (b2 != b) {
                i5++;
                b = b2;
            }
            i9 += abs2;
            if (i9 > 0) {
                if (i2 == i4) {
                    break;
                }
                i2 += i10;
                i9 -= abs;
            }
            i += i6;
        }
        return i5;
    }
}
