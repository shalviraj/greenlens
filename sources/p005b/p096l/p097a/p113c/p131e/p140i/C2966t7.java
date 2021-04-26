package p005b.p096l.p097a.p113c.p131e.p140i;

import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.i.t7 */
public final class C2966t7 extends C2992v7 {
    public C2966t7(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo13748a(Object obj, long j, byte b) {
        if (C3005w7.f5117i) {
            C3005w7.m5527c(obj, j, b);
        } else {
            C3005w7.m5528d(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo13749b(Object obj, long j) {
        return C3005w7.f5117i ? C3005w7.m5541q(obj, j) : C3005w7.m5542r(obj, j);
    }

    /* renamed from: c */
    public final void mo13750c(Object obj, long j, boolean z) {
        if (C3005w7.f5117i) {
            C3005w7.m5527c(obj, j, z);
        } else {
            C3005w7.m5528d(obj, j, z ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo13751d(Object obj, long j) {
        return Float.intBitsToFloat(mo13799k(obj, j));
    }

    /* renamed from: e */
    public final void mo13752e(Object obj, long j, float f) {
        mo13800l(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final double mo13753f(Object obj, long j) {
        return Double.longBitsToDouble(mo13801m(obj, j));
    }

    /* renamed from: g */
    public final void mo13754g(Object obj, long j, double d) {
        mo13802n(obj, j, Double.doubleToLongBits(d));
    }
}
