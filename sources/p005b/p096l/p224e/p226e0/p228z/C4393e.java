package p005b.p096l.p224e.p226e0.p228z;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.C4469n;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4474s;
import p005b.p096l.p224e.C4475t;
import p005b.p096l.p224e.C4477v;
import p005b.p096l.p224e.p226e0.C4372s;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4459b;

/* renamed from: b.l.e.e0.z.e */
public final class C4393e extends C4457a {

    /* renamed from: A */
    public static final Reader f8124A = new C4394a();

    /* renamed from: B */
    public static final Object f8125B = new Object();

    /* renamed from: w */
    public Object[] f8126w = new Object[32];

    /* renamed from: x */
    public int f8127x = 0;

    /* renamed from: y */
    public String[] f8128y = new String[32];

    /* renamed from: z */
    public int[] f8129z = new int[32];

    /* renamed from: b.l.e.e0.z.e$a */
    public class C4394a extends Reader {
        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C4393e(C4472q qVar) {
        super(f8124A);
        mo16044G0(qVar);
    }

    /* renamed from: h0 */
    private String m8020h0() {
        StringBuilder u = C0843a.m460u(" at path ");
        u.append(mo16047S());
        return u.toString();
    }

    /* renamed from: B0 */
    public void mo16040B0() {
        if (mo16060w0() == C4459b.NAME) {
            mo16056q0();
            this.f8128y[this.f8127x - 2] = "null";
        } else {
            mo16043F0();
            int i = this.f8127x;
            if (i > 0) {
                this.f8128y[i - 1] = "null";
            }
        }
        int i2 = this.f8127x;
        if (i2 > 0) {
            int[] iArr = this.f8129z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: D0 */
    public final void mo16041D0(C4459b bVar) {
        if (mo16060w0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + mo16060w0() + m8020h0());
        }
    }

    /* renamed from: E0 */
    public final Object mo16042E0() {
        return this.f8126w[this.f8127x - 1];
    }

    /* renamed from: F0 */
    public final Object mo16043F0() {
        Object[] objArr = this.f8126w;
        int i = this.f8127x - 1;
        this.f8127x = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: G0 */
    public final void mo16044G0(Object obj) {
        int i = this.f8127x;
        Object[] objArr = this.f8126w;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f8126w = Arrays.copyOf(objArr, i2);
            this.f8129z = Arrays.copyOf(this.f8129z, i2);
            this.f8128y = (String[]) Arrays.copyOf(this.f8128y, i2);
        }
        Object[] objArr2 = this.f8126w;
        int i3 = this.f8127x;
        this.f8127x = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: H */
    public void mo16045H() {
        mo16041D0(C4459b.END_ARRAY);
        mo16043F0();
        mo16043F0();
        int i = this.f8127x;
        if (i > 0) {
            int[] iArr = this.f8129z;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: N */
    public void mo16046N() {
        mo16041D0(C4459b.END_OBJECT);
        mo16043F0();
        mo16043F0();
        int i = this.f8127x;
        if (i > 0) {
            int[] iArr = this.f8129z;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: S */
    public String mo16047S() {
        StringBuilder t = C0843a.m459t('$');
        int i = 0;
        while (i < this.f8127x) {
            Object[] objArr = this.f8126w;
            if (objArr[i] instanceof C4469n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    t.append('[');
                    t.append(this.f8129z[i]);
                    t.append(']');
                }
            } else if (objArr[i] instanceof C4475t) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    t.append('.');
                    String[] strArr = this.f8128y;
                    if (strArr[i] != null) {
                        t.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return t.toString();
    }

    /* renamed from: Z */
    public boolean mo16048Z() {
        C4459b w0 = mo16060w0();
        return (w0 == C4459b.END_OBJECT || w0 == C4459b.END_ARRAY) ? false : true;
    }

    public void close() {
        this.f8126w = new Object[]{f8125B};
        this.f8127x = 1;
    }

    /* renamed from: d */
    public void mo16050d() {
        mo16041D0(C4459b.BEGIN_ARRAY);
        mo16044G0(((C4469n) mo16042E0()).iterator());
        this.f8129z[this.f8127x - 1] = 0;
    }

    /* renamed from: e */
    public void mo16051e() {
        mo16041D0(C4459b.BEGIN_OBJECT);
        mo16044G0(new C4372s.C4374b.C4375a((C4372s.C4374b) ((C4475t) mo16042E0()).entrySet()));
    }

    /* renamed from: l0 */
    public boolean mo16052l0() {
        mo16041D0(C4459b.BOOLEAN);
        boolean r = ((C4477v) mo16043F0()).mo16148r();
        int i = this.f8127x;
        if (i > 0) {
            int[] iArr = this.f8129z;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return r;
    }

    /* renamed from: n0 */
    public double mo16053n0() {
        C4459b w0 = mo16060w0();
        C4459b bVar = C4459b.NUMBER;
        if (w0 == bVar || w0 == C4459b.STRING) {
            C4477v vVar = (C4477v) mo16042E0();
            double doubleValue = vVar.f8320a instanceof Number ? vVar.mo16149u().doubleValue() : Double.parseDouble(vVar.mo16134q());
            if (this.f8254h || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                mo16043F0();
                int i = this.f8127x;
                if (i > 0) {
                    int[] iArr = this.f8129z;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + w0 + m8020h0());
    }

    /* renamed from: o0 */
    public int mo16054o0() {
        C4459b w0 = mo16060w0();
        C4459b bVar = C4459b.NUMBER;
        if (w0 == bVar || w0 == C4459b.STRING) {
            C4477v vVar = (C4477v) mo16042E0();
            int intValue = vVar.f8320a instanceof Number ? vVar.mo16149u().intValue() : Integer.parseInt(vVar.mo16134q());
            mo16043F0();
            int i = this.f8127x;
            if (i > 0) {
                int[] iArr = this.f8129z;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + w0 + m8020h0());
    }

    /* renamed from: p0 */
    public long mo16055p0() {
        C4459b w0 = mo16060w0();
        C4459b bVar = C4459b.NUMBER;
        if (w0 == bVar || w0 == C4459b.STRING) {
            long n = ((C4477v) mo16042E0()).mo16133n();
            mo16043F0();
            int i = this.f8127x;
            if (i > 0) {
                int[] iArr = this.f8129z;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return n;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + w0 + m8020h0());
    }

    /* renamed from: q0 */
    public String mo16056q0() {
        mo16041D0(C4459b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) mo16042E0()).next();
        String str = (String) entry.getKey();
        this.f8128y[this.f8127x - 1] = str;
        mo16044G0(entry.getValue());
        return str;
    }

    /* renamed from: s0 */
    public void mo16057s0() {
        mo16041D0(C4459b.NULL);
        mo16043F0();
        int i = this.f8127x;
        if (i > 0) {
            int[] iArr = this.f8129z;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String toString() {
        return C4393e.class.getSimpleName();
    }

    /* renamed from: u0 */
    public String mo16059u0() {
        C4459b w0 = mo16060w0();
        C4459b bVar = C4459b.STRING;
        if (w0 == bVar || w0 == C4459b.NUMBER) {
            String q = ((C4477v) mo16043F0()).mo16134q();
            int i = this.f8127x;
            if (i > 0) {
                int[] iArr = this.f8129z;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return q;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + w0 + m8020h0());
    }

    /* renamed from: w0 */
    public C4459b mo16060w0() {
        if (this.f8127x == 0) {
            return C4459b.END_DOCUMENT;
        }
        Object E0 = mo16042E0();
        if (E0 instanceof Iterator) {
            boolean z = this.f8126w[this.f8127x - 2] instanceof C4475t;
            Iterator it = (Iterator) E0;
            if (!it.hasNext()) {
                return z ? C4459b.END_OBJECT : C4459b.END_ARRAY;
            }
            if (z) {
                return C4459b.NAME;
            }
            mo16044G0(it.next());
            return mo16060w0();
        } else if (E0 instanceof C4475t) {
            return C4459b.BEGIN_OBJECT;
        } else {
            if (E0 instanceof C4469n) {
                return C4459b.BEGIN_ARRAY;
            }
            if (E0 instanceof C4477v) {
                Object obj = ((C4477v) E0).f8320a;
                if (obj instanceof String) {
                    return C4459b.STRING;
                }
                if (obj instanceof Boolean) {
                    return C4459b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return C4459b.NUMBER;
                }
                throw new AssertionError();
            } else if (E0 instanceof C4474s) {
                return C4459b.NULL;
            } else {
                if (E0 == f8125B) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
}
