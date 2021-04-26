package p005b.p051h.p052a.p078s;

import android.os.SystemClock;

/* renamed from: b.h.a.s.f */
public final class C1376f {

    /* renamed from: a */
    public static final double f1792a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f1793b = 0;

    /* renamed from: a */
    public static double m1460a(long j) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j)) * f1792a;
    }
}
