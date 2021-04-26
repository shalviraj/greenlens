package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.List;
import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.u */
public class C7568u extends C7489j0 {

    /* renamed from: h */
    public final C7567t0 f15011h;

    /* renamed from: i */
    public final C7277h f15012i;

    /* renamed from: j */
    public final List<C7580w0> f15013j;

    /* renamed from: k */
    public final boolean f15014k;

    /* renamed from: l */
    public final String f15015l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7568u(C7567t0 t0Var, C7277h hVar) {
        this(t0Var, hVar, (List) null, false, (String) null, 28);
        C6888i.m12438e(t0Var, "constructor");
        C6888i.m12438e(hVar, "memberScope");
    }

    public C7568u(C7567t0 t0Var, C7277h hVar, List<C7580w0> list, boolean z, String str, int i) {
        list = (i & 4) != 0 ? C6798p.f13713g : list;
        z = (i & 8) != 0 ? false : z;
        String str2 = (i & 16) != 0 ? "???" : null;
        C6888i.m12438e(t0Var, "constructor");
        C6888i.m12438e(hVar, "memberScope");
        C6888i.m12438e(list, "arguments");
        C6888i.m12438e(str2, "presentableName");
        this.f15011h = t0Var;
        this.f15012i = hVar;
        this.f15013j = list;
        this.f15014k = z;
        this.f15015l = str2;
    }

    /* renamed from: U */
    public List<C7580w0> mo24886U() {
        return this.f15013j;
    }

    /* renamed from: V */
    public C7567t0 mo24887V() {
        return this.f15011h;
    }

    /* renamed from: W */
    public boolean mo23566W() {
        return this.f15014k;
    }

    /* renamed from: b0 */
    public C7481g1 mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return this;
    }

    /* renamed from: c0 */
    public C7489j0 mo23567c0(boolean z) {
        return new C7568u(this.f15011h, this.f15012i, this.f15013j, z, (String) null, 16);
    }

    /* renamed from: d0 */
    public C7489j0 mo23568d0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return this;
    }

    /* renamed from: e0 */
    public String mo25090e0() {
        return this.f15015l;
    }

    /* renamed from: f0 */
    public C7568u mo23546a0(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public C6060h getAnnotations() {
        Objects.requireNonNull(C6060h.f11920d);
        return C6060h.C6061a.f11922b;
    }

    public C7277h getMemberScope() {
        return this.f15012i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15011h);
        if (this.f15013j.isEmpty()) {
            str = "";
        } else {
            str = C6790h.m12368v(this.f15013j, ", ", "<", ">", -1, "...", (C6862l) null);
        }
        sb.append(str);
        return sb.toString();
    }
}
