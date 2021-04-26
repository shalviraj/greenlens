package p005b.p096l.p097a.p113c.p131e.p136e;

import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.e.i1 */
public final class C2223i1 extends C2248j1 {
    public C2223i1(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo12694a(Object obj, long j, byte b) {
        if (C2272k1.f3999i) {
            C2272k1.m3621c(obj, j, b);
        } else {
            C2272k1.m3622d(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo12695b(Object obj, long j) {
        return C2272k1.f3999i ? C2272k1.m3636r(obj, j) : C2272k1.m3637s(obj, j);
    }

    /* renamed from: c */
    public final void mo12696c(Object obj, long j, boolean z) {
        if (C2272k1.f3999i) {
            C2272k1.m3621c(obj, j, z);
        } else {
            C2272k1.m3622d(obj, j, z ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo12697d(Object obj, long j) {
        return Float.intBitsToFloat(mo12727k(obj, j));
    }

    /* renamed from: e */
    public final void mo12698e(Object obj, long j, float f) {
        mo12728l(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final double mo12699f(Object obj, long j) {
        return Double.longBitsToDouble(mo12729m(obj, j));
    }

    /* renamed from: g */
    public final void mo12700g(Object obj, long j, double d) {
        mo12730n(obj, j, Double.doubleToLongBits(d));
    }
}
