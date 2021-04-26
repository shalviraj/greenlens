package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Map;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.a */
public final class C3106a implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f5241g;

    /* renamed from: h */
    public final /* synthetic */ long f5242h;

    /* renamed from: i */
    public final /* synthetic */ C3133c2 f5243i;

    public C3106a(C3133c2 c2Var, String str, long j) {
        this.f5243i = c2Var;
        this.f5241g = str;
        this.f5242h = j;
    }

    public final void run() {
        Map map;
        Object valueOf;
        C3133c2 c2Var = this.f5243i;
        String str = this.f5241g;
        long j = this.f5242h;
        c2Var.mo14126h();
        C0823f.m376j(str);
        if (c2Var.f5338c.isEmpty()) {
            c2Var.f5339d = j;
        }
        Integer num = c2Var.f5338c.get(str);
        if (num != null) {
            map = c2Var.f5338c;
            valueOf = Integer.valueOf(num.intValue() + 1);
        } else if (c2Var.f5338c.size() >= 100) {
            c2Var.f5638a.mo14329d().f5802i.mo14414a("Too many ads visible");
            return;
        } else {
            c2Var.f5338c.put(str, 1);
            map = c2Var.f5337b;
            valueOf = Long.valueOf(j);
        }
        map.put(str, valueOf);
    }
}
