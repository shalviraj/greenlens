package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7173i;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7532f;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.w */
public abstract class C7579w extends C7481g1 implements C7532f {

    /* renamed from: h */
    public final C7489j0 f15029h;

    /* renamed from: i */
    public final C7489j0 f15030i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7579w(C7489j0 j0Var, C7489j0 j0Var2) {
        super((DefaultConstructorMarker) null);
        C6888i.m12438e(j0Var, "lowerBound");
        C6888i.m12438e(j0Var2, "upperBound");
        this.f15029h = j0Var;
        this.f15030i = j0Var2;
    }

    /* renamed from: U */
    public List<C7580w0> mo24886U() {
        return mo23548c0().mo24886U();
    }

    /* renamed from: V */
    public C7567t0 mo24887V() {
        return mo23548c0().mo24887V();
    }

    /* renamed from: W */
    public boolean mo23566W() {
        return mo23548c0().mo23566W();
    }

    /* renamed from: c0 */
    public abstract C7489j0 mo23548c0();

    /* renamed from: d0 */
    public abstract String mo23549d0(C7150c cVar, C7173i iVar);

    public C6060h getAnnotations() {
        return mo23548c0().getAnnotations();
    }

    public C7277h getMemberScope() {
        return mo23548c0().getMemberScope();
    }

    public String toString() {
        return C7150c.f14298b.mo24792w(this);
    }
}
