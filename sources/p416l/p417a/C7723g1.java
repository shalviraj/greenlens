package p416l.p417a;

import p005b.p291q.p292a.C5266a;
import p416l.p417a.p419u1.C7785l;

/* renamed from: l.a.g1 */
public abstract class C7723g1 extends C7815w {
    /* renamed from: p0 */
    public abstract C7723g1 mo25387p0();

    /* renamed from: q0 */
    public final String mo25388q0() {
        C7723g1 g1Var;
        C7815w wVar = C7725h0.f15273a;
        C7723g1 g1Var2 = C7785l.f15351b;
        if (this == g1Var2) {
            return "Dispatchers.Main";
        }
        try {
            g1Var = g1Var2.mo25387p0();
        } catch (UnsupportedOperationException unused) {
            g1Var = null;
        }
        if (this == g1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String q0 = mo25388q0();
        if (q0 != null) {
            return q0;
        }
        return getClass().getSimpleName() + '@' + C5266a.m10027s1(this);
    }
}
