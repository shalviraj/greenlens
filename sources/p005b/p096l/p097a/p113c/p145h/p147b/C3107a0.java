package p005b.p096l.p097a.p113c.p145h.p147b;

import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.a0 */
public final class C3107a0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f5244g;

    /* renamed from: h */
    public final /* synthetic */ long f5245h;

    /* renamed from: i */
    public final /* synthetic */ C3133c2 f5246i;

    public C3107a0(C3133c2 c2Var, String str, long j) {
        this.f5246i = c2Var;
        this.f5244g = str;
        this.f5245h = j;
    }

    public final void run() {
        C3133c2 c2Var = this.f5246i;
        String str = this.f5244g;
        long j = this.f5245h;
        c2Var.mo14126h();
        C0823f.m376j(str);
        Integer num = c2Var.f5338c.get(str);
        if (num != null) {
            C3371x6 p = c2Var.f5638a.mo14472y().mo14213p(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2Var.f5338c.remove(str);
                Long l = c2Var.f5337b.get(str);
                if (l == null) {
                    c2Var.f5638a.mo14329d().f5799f.mo14414a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    c2Var.f5337b.remove(str);
                    c2Var.mo14139m(str, j - longValue, p);
                }
                if (c2Var.f5338c.isEmpty()) {
                    long j2 = c2Var.f5339d;
                    if (j2 == 0) {
                        c2Var.f5638a.mo14329d().f5799f.mo14414a("First ad exposure time was never set");
                        return;
                    }
                    c2Var.mo14138l(j - j2, p);
                    c2Var.f5339d = 0;
                    return;
                }
                return;
            }
            c2Var.f5338c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2Var.f5638a.mo14329d().f5799f.mo14415b("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
