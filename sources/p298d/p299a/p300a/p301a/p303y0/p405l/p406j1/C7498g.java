package p298d.p299a.p300a.p301a.p303y0.p405l.p406j1;

import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7528b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7529c;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.j1.g */
public final class C7498g extends C7489j0 implements C7529c {

    /* renamed from: h */
    public final C7528b f14929h;

    /* renamed from: i */
    public final C7500i f14930i;

    /* renamed from: j */
    public final C7481g1 f14931j;

    /* renamed from: k */
    public final C6060h f14932k;

    /* renamed from: l */
    public final boolean f14933l;

    /* renamed from: m */
    public final boolean f14934m;

    public C7498g(C7528b bVar, C7500i iVar, C7481g1 g1Var, C6060h hVar, boolean z, boolean z2) {
        C6888i.m12438e(bVar, "captureStatus");
        C6888i.m12438e(iVar, "constructor");
        C6888i.m12438e(hVar, "annotations");
        this.f14929h = bVar;
        this.f14930i = iVar;
        this.f14931j = g1Var;
        this.f14932k = hVar;
        this.f14933l = z;
        this.f14934m = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7498g(p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7528b r8, p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7500i r9, p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1 r10, p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h r11, boolean r12, boolean r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 8
            if (r0 == 0) goto L_0x000b
            d.a.a.a.y0.b.f1.h$a r11 = p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h.f11920d
            java.util.Objects.requireNonNull(r11)
            d.a.a.a.y0.b.f1.h r11 = p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h.C6061a.f11922b
        L_0x000b:
            r4 = r11
            r11 = r14 & 16
            r0 = 0
            if (r11 == 0) goto L_0x0013
            r5 = r0
            goto L_0x0014
        L_0x0013:
            r5 = r12
        L_0x0014:
            r11 = r14 & 32
            if (r11 == 0) goto L_0x001a
            r6 = r0
            goto L_0x001b
        L_0x001a:
            r6 = r13
        L_0x001b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g.<init>(d.a.a.a.y0.l.l1.b, d.a.a.a.y0.l.j1.i, d.a.a.a.y0.l.g1, d.a.a.a.y0.b.f1.h, boolean, boolean, int):void");
    }

    /* renamed from: U */
    public List<C7580w0> mo24886U() {
        return C6798p.f13713g;
    }

    /* renamed from: V */
    public C7567t0 mo24887V() {
        return this.f14930i;
    }

    /* renamed from: W */
    public boolean mo23566W() {
        return this.f14933l;
    }

    /* renamed from: e0 */
    public C7498g mo23567c0(boolean z) {
        return new C7498g(this.f14929h, this.f14930i, this.f14931j, this.f14932k, z, false, 32);
    }

    /* renamed from: f0 */
    public C7498g mo23546a0(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        C7528b bVar = this.f14929h;
        C7500i b = this.f14930i.refine(eVar);
        C7481g1 g1Var = this.f14931j;
        return new C7498g(bVar, b, g1Var == null ? null : eVar.mo25135g(g1Var).mo25056Y(), this.f14932k, this.f14933l, false, 32);
    }

    /* renamed from: g0 */
    public C7498g mo23568d0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C7498g(this.f14929h, this.f14930i, this.f14931j, hVar, this.f14933l, false, 32);
    }

    public C6060h getAnnotations() {
        return this.f14932k;
    }

    public C7277h getMemberScope() {
        C7277h c = C7570v.m13782c("No member resolution should be done on captured type!", true);
        C6888i.m12437d(c, "createErrorScope(\"No member resolution should be done on captured type!\", true)");
        return c;
    }
}
