package p005b.p096l.p097a.p151d.p152a.p154b;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* renamed from: b.l.a.d.a.b.n0 */
public final /* synthetic */ class C3523n0 implements C3548u0 {

    /* renamed from: a */
    public final C3551v0 f6486a;

    /* renamed from: b */
    public final String f6487b;

    /* renamed from: c */
    public final int f6488c;

    /* renamed from: d */
    public final long f6489d;

    public C3523n0(C3551v0 v0Var, String str, int i, long j) {
        this.f6486a = v0Var;
        this.f6487b = str;
        this.f6488c = i;
        this.f6489d = j;
    }

    /* renamed from: a */
    public final Object mo14793a() {
        C3551v0 v0Var = this.f6486a;
        String str = this.f6487b;
        int i = this.f6488c;
        long j = this.f6489d;
        Objects.requireNonNull(v0Var);
        C3542s0 s0Var = (C3542s0) ((Map) v0Var.mo14843b(new C3531p0(v0Var, Arrays.asList(new String[]{str})))).get(str);
        if (s0Var == null || C3484d1.m6659e(s0Var.f6554c.f6541c)) {
            C3551v0.f6581g.mo14884b(6, String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        C3544t tVar = v0Var.f6582a;
        if (tVar.mo14818e(str, i, j).exists()) {
            C3544t.m6741h(tVar.mo14818e(str, i, j));
        }
        s0Var.f6554c.f6541c = 4;
        return null;
    }
}
