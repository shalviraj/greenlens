package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;

/* renamed from: b.l.a.c.h.b.b5 */
public final class C3124b5 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3309s f5321g;

    /* renamed from: h */
    public final /* synthetic */ C3352v9 f5322h;

    /* renamed from: i */
    public final /* synthetic */ C3205i5 f5323i;

    public C3124b5(C3205i5 i5Var, C3309s sVar, C3352v9 v9Var) {
        this.f5323i = i5Var;
        this.f5321g = sVar;
        this.f5322h = v9Var;
    }

    public final void run() {
        C3287q qVar;
        C3205i5 i5Var = this.f5323i;
        C3309s sVar = this.f5321g;
        Objects.requireNonNull(i5Var);
        if (!(!"_cmp".equals(sVar.f5937g) || (qVar = sVar.f5938h) == null || qVar.f5876g.size() == 0)) {
            String string = sVar.f5938h.f5876g.getString("_cis");
            if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                i5Var.f5605a.mo14329d().f5805l.mo14415b("Event has been filtered ", sVar.toString());
                sVar = new C3309s("_cmpx", sVar.f5938h, sVar.f5939i, sVar.f5940j);
            }
        }
        this.f5323i.f5605a.mo14360k();
        this.f5323i.f5605a.mo14353S(sVar, this.f5322h);
    }
}
