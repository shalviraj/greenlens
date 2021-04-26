package p005b.p082j.p083a.p084a;

import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;
import p005b.p082j.p083a.p084a.p087q.C1543h;

/* renamed from: b.j.a.a.d */
public abstract class C1517d implements Closeable, Flushable {

    /* renamed from: g */
    public C1527l f2345g;

    /* renamed from: b.j.a.a.d$a */
    public enum C1518a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        

        /* renamed from: g */
        public final boolean f2357g;

        /* renamed from: h */
        public final int f2358h;

        /* access modifiers changed from: public */
        C1518a(boolean z) {
            this.f2357g = z;
            this.f2358h = 1 << ordinal();
        }

        /* renamed from: d */
        public static int m1784d() {
            C1518a[] values = values();
            int i = 0;
            for (int i2 = 0; i2 < 10; i2++) {
                C1518a aVar = values[i2];
                if (aVar.f2357g) {
                    i |= aVar.f2358h;
                }
            }
            return i;
        }

        /* renamed from: e */
        public boolean mo11481e(int i) {
            return (i & this.f2358h) != 0;
        }
    }

    /* renamed from: H */
    public abstract void mo11460H(String str);

    /* renamed from: N */
    public abstract void mo11461N();

    /* renamed from: O */
    public abstract void mo11462O(double d);

    /* renamed from: S */
    public abstract void mo11463S(float f);

    /* renamed from: Z */
    public abstract void mo11464Z(int i);

    public abstract void close();

    /* renamed from: d */
    public abstract C1517d mo11466d();

    /* renamed from: e */
    public abstract void mo11467e(boolean z);

    /* renamed from: f0 */
    public abstract void mo11468f0(long j);

    public abstract void flush();

    /* renamed from: h0 */
    public abstract void mo11470h0(BigDecimal bigDecimal);

    /* renamed from: l0 */
    public abstract void mo11471l0(BigInteger bigInteger);

    /* renamed from: n0 */
    public abstract void mo11472n0(char c);

    /* renamed from: o0 */
    public void mo11473o0(C1528m mVar) {
        mo11474p0(((C1543h) mVar).f2472g);
    }

    /* renamed from: p0 */
    public abstract void mo11474p0(String str);

    /* renamed from: q */
    public abstract void mo11475q();

    /* renamed from: q0 */
    public abstract void mo11476q0(char[] cArr, int i, int i2);

    /* renamed from: r0 */
    public abstract void mo11477r0();

    /* renamed from: s0 */
    public abstract void mo11478s0();

    /* renamed from: t0 */
    public abstract void mo11479t0(String str);

    /* renamed from: z */
    public abstract void mo11480z();
}
