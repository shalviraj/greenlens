package p005b.p082j.p083a.p084a.p085o;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.math.BigInteger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1520f;
import p005b.p082j.p083a.p084a.C1521g;
import p005b.p082j.p083a.p084a.C1525j;
import p005b.p082j.p083a.p084a.p086p.C1533a;
import p005b.p082j.p083a.p084a.p087q.C1538c;
import p005b.p082j.p083a.p084a.p090t.C1571j;

/* renamed from: b.j.a.a.o.c */
public abstract class C1532c extends C1521g {

    /* renamed from: i */
    public static final byte[] f2431i = new byte[0];

    /* renamed from: j */
    public static final BigInteger f2432j;

    /* renamed from: k */
    public static final BigInteger f2433k;

    /* renamed from: l */
    public static final BigInteger f2434l;

    /* renamed from: m */
    public static final BigInteger f2435m;

    /* renamed from: n */
    public static final BigDecimal f2436n;

    /* renamed from: o */
    public static final BigDecimal f2437o;

    /* renamed from: p */
    public static final BigDecimal f2438p;

    /* renamed from: q */
    public static final BigDecimal f2439q;

    /* renamed from: h */
    public C1525j f2440h;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        f2432j = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        f2433k = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f2434l = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(RecyclerView.FOREVER_NS);
        f2435m = valueOf4;
        f2436n = new BigDecimal(valueOf3);
        f2437o = new BigDecimal(valueOf4);
        f2438p = new BigDecimal(valueOf);
        f2439q = new BigDecimal(valueOf2);
    }

    public C1532c(int i) {
        super(i);
    }

    /* renamed from: o0 */
    public static final String m1829o0(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return C0843a.m445f("(CTRL-CHAR, code ", i, ")");
        }
        if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        }
        return "'" + c + "' (code " + i + ")";
    }

    /* renamed from: A0 */
    public void mo11523A0() {
        mo11524B0(mo11495f0(), C1525j.VALUE_NUMBER_INT);
        throw null;
    }

    /* renamed from: B0 */
    public void mo11524B0(String str, C1525j jVar) {
        throw new C1533a(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{mo11528q0(str), Integer.MIN_VALUE, Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)}), jVar, Integer.TYPE);
    }

    /* renamed from: C0 */
    public void mo11525C0() {
        mo11526D0(mo11495f0());
        throw null;
    }

    /* renamed from: D0 */
    public void mo11526D0(String str) {
        throw new C1533a(this, String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{mo11528q0(str), Long.MIN_VALUE, Long.valueOf(RecyclerView.FOREVER_NS)}), C1525j.VALUE_NUMBER_INT, Long.TYPE);
    }

    /* renamed from: E0 */
    public void mo11527E0(int i, String str) {
        throw new C1520f(this, C0843a.m452m(String.format("Unexpected character (%s) in numeric value", new Object[]{m1829o0(i)}), ": ", str));
    }

    /* renamed from: n0 */
    public C1521g mo11498n0() {
        C1525j jVar = this.f2440h;
        if (jVar != C1525j.START_OBJECT && jVar != C1525j.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            C1525j l0 = mo11497l0();
            if (l0 == null) {
                mo11522p0();
                return this;
            } else if (l0.f2404k) {
                i++;
            } else if (l0.f2405l) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (l0 == C1525j.NOT_AVAILABLE) {
                mo11530s0("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                throw null;
            }
        }
    }

    /* renamed from: p0 */
    public abstract void mo11522p0();

    /* renamed from: q0 */
    public String mo11528q0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    /* renamed from: r0 */
    public String mo11529r0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    /* renamed from: s0 */
    public final void mo11530s0(String str, Object obj) {
        throw new C1520f(this, String.format(str, new Object[]{obj}));
    }

    /* renamed from: t0 */
    public final void mo11531t0(String str, Object obj, Object obj2) {
        throw new C1520f(this, String.format(str, new Object[]{obj, obj2}));
    }

    /* renamed from: u0 */
    public void mo11532u0() {
        StringBuilder u = C0843a.m460u(" in ");
        u.append(this.f2440h);
        mo11533v0(u.toString(), this.f2440h);
        throw null;
    }

    /* renamed from: v0 */
    public void mo11533v0(String str, C1525j jVar) {
        throw new C1538c(this, jVar, C0843a.m451l("Unexpected end-of-input", str));
    }

    /* renamed from: w0 */
    public void mo11534w0(C1525j jVar) {
        mo11533v0(jVar != C1525j.VALUE_STRING ? (jVar == C1525j.VALUE_NUMBER_INT || jVar == C1525j.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value", jVar);
        throw null;
    }

    /* renamed from: x0 */
    public void mo11535x0(int i, String str) {
        if (i >= 0) {
            String format = String.format("Unexpected character (%s)", new Object[]{m1829o0(i)});
            if (str != null) {
                format = C0843a.m452m(format, ": ", str);
            }
            throw new C1520f(this, format);
        }
        mo11532u0();
        throw null;
    }

    /* renamed from: y0 */
    public final void mo11536y0() {
        int i = C1571j.f2643a;
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    /* renamed from: z */
    public C1525j mo11500z() {
        return this.f2440h;
    }

    /* renamed from: z0 */
    public void mo11537z0(int i) {
        StringBuilder u = C0843a.m460u("Illegal character (");
        u.append(m1829o0((char) i));
        u.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw new C1520f(this, u.toString());
    }
}
