package p005b.p096l.p232f.p246e0.p249e;

import p005b.p096l.p232f.C4628v;
import p005b.p096l.p232f.p246e0.p247c.C4593f;
import p005b.p096l.p232f.p246e0.p247c.C4597j;

/* renamed from: b.l.f.e0.e.c */
public final class C4610c {

    /* renamed from: a */
    public static final int[] f8660a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: a */
    public static C4597j m8496a(int i, C4593f fVar) {
        for (int i2 = 1; i2 <= 40; i2++) {
            C4597j d = C4597j.m8475d(i2);
            if (m8498c(i, d, fVar)) {
                return d;
            }
        }
        throw new C4628v("Data too big");
    }

    /* renamed from: b */
    public static int m8497b(int i) {
        int[] iArr = f8660a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m8498c(int i, C4597j jVar, C4593f fVar) {
        int i2 = jVar.f8627d;
        C4597j.C4599b bVar = jVar.f8626c[fVar.ordinal()];
        return i2 - (bVar.mo16253a() * bVar.f8630a) >= (i + 7) / 8;
    }
}
