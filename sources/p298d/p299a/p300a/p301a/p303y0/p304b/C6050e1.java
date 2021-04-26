package p298d.p299a.p300a.p301a.p303y0.p304b;

import java.util.Map;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.e1 */
public abstract class C6050e1 {

    /* renamed from: a */
    public final String f11891a;

    /* renamed from: b */
    public final boolean f11892b;

    public C6050e1(String str, boolean z) {
        C6888i.m12438e(str, "name");
        this.f11891a = str;
        this.f11892b = z;
    }

    /* renamed from: a */
    public Integer mo23158a(C6050e1 e1Var) {
        C6888i.m12438e(e1Var, "visibility");
        C6036d1 d1Var = C6036d1.f11877a;
        C6888i.m12438e(this, "first");
        C6888i.m12438e(e1Var, "second");
        if (this == e1Var) {
            return 0;
        }
        Map<C6050e1, Integer> map = C6036d1.f11878b;
        Integer num = map.get(this);
        Integer num2 = map.get(e1Var);
        if (num == null || num2 == null || C6888i.m12434a(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public String mo23152b() {
        return this.f11891a;
    }

    /* renamed from: c */
    public C6050e1 mo23159c() {
        return this;
    }

    public final String toString() {
        return mo23152b();
    }
}
