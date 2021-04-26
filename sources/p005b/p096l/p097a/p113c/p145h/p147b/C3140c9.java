package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.c9 */
public final class C3140c9 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3231k9 f5452g;

    /* renamed from: h */
    public final /* synthetic */ C3220j9 f5453h;

    public C3140c9(C3220j9 j9Var, C3231k9 k9Var) {
        this.f5453h = j9Var;
        this.f5452g = k9Var;
    }

    public final void run() {
        C3220j9 j9Var = this.f5453h;
        j9Var.mo14331f().mo14126h();
        C3210j jVar = new C3210j(j9Var);
        jVar.mo14647k();
        j9Var.f5650c = jVar;
        C3166f G = j9Var.mo14341G();
        C3204i4 i4Var = j9Var.f5648a;
        Objects.requireNonNull(i4Var, "null reference");
        G.f5500c = i4Var;
        C3186g8 g8Var = new C3186g8(j9Var);
        g8Var.mo14647k();
        j9Var.f5656i = g8Var;
        C3153da daVar = new C3153da(j9Var);
        daVar.mo14647k();
        j9Var.f5653f = daVar;
        C3349v6 v6Var = new C3349v6(j9Var);
        v6Var.mo14647k();
        j9Var.f5655h = v6Var;
        C3373x8 x8Var = new C3373x8(j9Var);
        x8Var.mo14647k();
        j9Var.f5652e = x8Var;
        j9Var.f5651d = new C3346v3(j9Var);
        if (j9Var.f5663p != j9Var.f5664q) {
            j9Var.mo14329d().f5799f.mo14416c("Not all upload components initialized", Integer.valueOf(j9Var.f5663p), Integer.valueOf(j9Var.f5664q));
        }
        j9Var.f5659l = true;
        C3220j9 j9Var2 = this.f5453h;
        j9Var2.mo14331f().mo14126h();
        C3210j jVar2 = j9Var2.f5650c;
        C3220j9.m6111F(jVar2);
        jVar2.mo14306l();
        if (j9Var2.f5656i.f5561i.mo14633a() == 0) {
            C3379y3 y3Var = j9Var2.f5656i.f5561i;
            Objects.requireNonNull((C1959c) j9Var2.mo14330e());
            y3Var.mo14634b(System.currentTimeMillis());
        }
        j9Var2.mo14336A();
    }
}
