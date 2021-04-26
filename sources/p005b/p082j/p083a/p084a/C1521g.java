package p005b.p082j.p083a.p084a;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: b.j.a.a.g */
public abstract class C1521g implements Closeable {

    /* renamed from: g */
    public int f2365g;

    /* renamed from: b.j.a.a.g$a */
    public enum C1522a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        

        /* renamed from: g */
        public final boolean f2381g;

        /* renamed from: h */
        public final int f2382h;

        /* access modifiers changed from: public */
        C1522a(boolean z) {
            this.f2382h = 1 << ordinal();
            this.f2381g = z;
        }

        /* renamed from: d */
        public boolean mo11501d(int i) {
            return (i & this.f2382h) != 0;
        }
    }

    public C1521g() {
    }

    public C1521g(int i) {
        this.f2365g = i;
    }

    /* renamed from: H */
    public abstract BigDecimal mo11487H();

    /* renamed from: N */
    public abstract double mo11488N();

    /* renamed from: O */
    public abstract float mo11489O();

    /* renamed from: S */
    public abstract int mo11490S();

    /* renamed from: Z */
    public abstract long mo11491Z();

    public abstract void close();

    /* renamed from: d */
    public abstract BigInteger mo11493d();

    /* renamed from: e */
    public abstract C1519e mo11494e();

    /* renamed from: f0 */
    public abstract String mo11495f0();

    /* renamed from: h0 */
    public boolean mo11496h0(C1522a aVar) {
        return aVar.mo11501d(this.f2365g);
    }

    /* renamed from: l0 */
    public abstract C1525j mo11497l0();

    /* renamed from: n0 */
    public abstract C1521g mo11498n0();

    /* renamed from: q */
    public abstract String mo11499q();

    /* renamed from: z */
    public abstract C1525j mo11500z();
}
