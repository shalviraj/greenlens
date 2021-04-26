package p298d.p299a.p300a.p301a.p303y0.p405l.p406j1;

import java.util.Collection;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7237o;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7443a0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7465f;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7577v0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7530d;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7532f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7536j;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7537k;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7538l;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7539m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7542p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.l.j1.b */
public class C7491b extends C7465f implements C7492c {

    /* renamed from: e */
    public final boolean f14922e;

    /* renamed from: f */
    public final boolean f14923f;

    /* renamed from: g */
    public final boolean f14924g;

    /* renamed from: h */
    public final C7495e f14925h;

    public C7491b(boolean z, boolean z2, boolean z3, C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        this.f14922e = z;
        this.f14923f = z2;
        this.f14924g = z3;
        this.f14925h = eVar;
    }

    public C7491b(boolean z, boolean z2, boolean z3, C7495e eVar, int i) {
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? true : z3;
        eVar = (i & 8) != 0 ? C7495e.C7496a.f14927a : eVar;
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        this.f14922e = z;
        this.f14923f = z2;
        this.f14924g = z3;
        this.f14925h = eVar;
    }

    /* renamed from: F */
    public boolean mo25077F() {
        return this.f14922e;
    }

    /* renamed from: H */
    public boolean mo25079H() {
        return this.f14923f;
    }

    /* renamed from: I */
    public C7534h mo25080I(C7534h hVar) {
        C6888i.m12438e(hVar, "type");
        if (hVar instanceof C7452c0) {
            Objects.requireNonNull(C7504k.f14945b);
            return C7504k.C7505a.f14947b.mo25148h(((C7452c0) hVar).mo25056Y());
        }
        throw new IllegalArgumentException(C5266a.m9983l(hVar).toString());
    }

    /* renamed from: J */
    public C7534h mo25081J(C7534h hVar) {
        C6888i.m12438e(hVar, "type");
        if (hVar instanceof C7452c0) {
            return this.f14925h.mo25135g((C7452c0) hVar);
        }
        throw new IllegalArgumentException(C5266a.m9983l(hVar).toString());
    }

    /* renamed from: K */
    public C7465f.C7466a mo25082K(C7535i iVar) {
        C6888i.m12438e(iVar, "type");
        C6888i.m12438e(this, "<this>");
        C6888i.m12438e(iVar, "type");
        if (iVar instanceof C7489j0) {
            return new C7490a(this, C7577v0.f15028b.mo25186a((C7452c0) iVar).mo25194c());
        }
        throw new IllegalArgumentException(C5266a.m9983l(iVar).toString());
    }

    /* renamed from: L */
    public boolean mo24884L(C7567t0 t0Var, C7567t0 t0Var2) {
        C6888i.m12438e(t0Var, "a");
        C6888i.m12438e(t0Var2, "b");
        return t0Var instanceof C7237o ? ((C7237o) t0Var).mo24901b(t0Var2) : t0Var2 instanceof C7237o ? ((C7237o) t0Var2).mo24901b(t0Var) : C6888i.m12434a(t0Var, t0Var2);
    }

    /* renamed from: M */
    public C7536j mo25099M(C7535i iVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(iVar, "receiver");
        if (iVar instanceof C7489j0) {
            return (C7536j) iVar;
        }
        throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i mo25100N(p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i r23, p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7528b r24) {
        /*
            r22 = this;
            r0 = r23
            r8 = r24
            java.lang.String r1 = "this"
            r9 = r22
            p298d.p344x.p346c.C6888i.m12438e(r9, r1)
            java.lang.String r1 = "type"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            java.lang.String r2 = "status"
            p298d.p344x.p346c.C6888i.m12438e(r8, r2)
            boolean r3 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0
            if (r3 == 0) goto L_0x01ce
            r10 = r0
            d.a.a.a.y0.l.j0 r10 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0) r10
            p298d.p344x.p346c.C6888i.m12438e(r10, r1)
            p298d.p344x.p346c.C6888i.m12438e(r8, r2)
            d.a.a.a.y0.l.h1 r11 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.INVARIANT
            java.util.List r0 = r10.mo24886U()
            int r0 = r0.size()
            d.a.a.a.y0.l.t0 r1 = r10.mo24887V()
            java.util.List r1 = r1.getParameters()
            int r1 = r1.size()
            r12 = 0
            if (r0 == r1) goto L_0x003c
            goto L_0x006b
        L_0x003c:
            java.util.List r13 = r10.mo24886U()
            boolean r0 = r13 instanceof java.util.Collection
            r14 = 0
            r1 = 1
            if (r0 == 0) goto L_0x004d
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x004d
            goto L_0x0069
        L_0x004d:
            java.util.Iterator r0 = r13.iterator()
        L_0x0051:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r0.next()
            d.a.a.a.y0.l.w0 r2 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r2
            d.a.a.a.y0.l.h1 r2 = r2.mo25162b()
            if (r2 != r11) goto L_0x0065
            r2 = r1
            goto L_0x0066
        L_0x0065:
            r2 = r14
        L_0x0066:
            if (r2 != 0) goto L_0x0051
            r1 = r14
        L_0x0069:
            if (r1 == 0) goto L_0x006f
        L_0x006b:
            r18 = r12
            goto L_0x01b4
        L_0x006f:
            d.a.a.a.y0.l.t0 r0 = r10.mo24887V()
            java.util.List r0 = r0.getParameters()
            java.lang.String r1 = "type.constructor.parameters"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            java.util.List r0 = p298d.p334t.C6790h.m12353g0(r13, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r1 = 10
            int r1 = p005b.p291q.p292a.C5266a.m9892V(r0, r1)
            r15.<init>(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r16 = r0.iterator()
        L_0x0091:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = r16.next()
            d.j r0 = (p298d.C6768j) r0
            A r1 = r0.f13681g
            r3 = r1
            d.a.a.a.y0.l.w0 r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r3
            B r0 = r0.f13682h
            r6 = r0
            d.a.a.a.y0.b.w0 r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r6
            d.a.a.a.y0.l.h1 r0 = r3.mo25162b()
            if (r0 != r11) goto L_0x00ae
            goto L_0x00fe
        L_0x00ae:
            boolean r0 = r3.mo25163c()
            if (r0 != 0) goto L_0x00c7
            d.a.a.a.y0.l.h1 r0 = r3.mo25162b()
            d.a.a.a.y0.l.h1 r1 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.IN_VARIANCE
            if (r0 != r1) goto L_0x00c7
            d.a.a.a.y0.l.c0 r0 = r3.mo25161a()
            d.a.a.a.y0.l.g1 r0 = r0.mo25056Y()
            r17 = r0
            goto L_0x00c9
        L_0x00c7:
            r17 = r12
        L_0x00c9:
            d.a.a.a.y0.l.j1.g r18 = new d.a.a.a.y0.l.j1.g
            java.lang.String r0 = "parameter"
            p298d.p344x.p346c.C6888i.m12437d(r6, r0)
            java.lang.String r0 = "captureStatus"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)
            java.lang.String r0 = "projection"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            java.lang.String r0 = "typeParameter"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            d.a.a.a.y0.l.j1.i r19 = new d.a.a.a.y0.l.j1.i
            r20 = 0
            r5 = 0
            r7 = 6
            r4 = 0
            r2 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            r5 = 0
            r6 = 0
            r7 = 56
            r0 = r18
            r1 = r24
            r3 = r17
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            d.a.a.a.y0.l.w0 r3 = p005b.p291q.p292a.C5266a.m9794E(r18)
        L_0x00fe:
            r15.add(r3)
            goto L_0x0091
        L_0x0102:
            d.a.a.a.y0.l.v0$a r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7577v0.f15028b
            d.a.a.a.y0.l.t0 r1 = r10.mo24887V()
            d.a.a.a.y0.l.z0 r0 = r0.mo25187b(r1, r15)
            d.a.a.a.y0.l.b1 r0 = r0.mo25194c()
            int r1 = r13.size()
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x01b2
        L_0x0118:
            int r2 = r14 + 1
            java.lang.Object r3 = r13.get(r14)
            d.a.a.a.y0.l.w0 r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r3
            java.lang.Object r4 = r15.get(r14)
            d.a.a.a.y0.l.w0 r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r4
            d.a.a.a.y0.l.h1 r5 = r3.mo25162b()
            if (r5 != r11) goto L_0x012e
            goto L_0x01ac
        L_0x012e:
            d.a.a.a.y0.l.t0 r5 = r10.mo24887V()
            java.util.List r5 = r5.getParameters()
            java.lang.Object r5 = r5.get(r14)
            d.a.a.a.y0.b.w0 r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r5
            java.util.List r5 = r5.getUpperBounds()
            java.lang.String r6 = "type.constructor.parameters[index].upperBounds"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x014e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0171
            java.lang.Object r7 = r5.next()
            d.a.a.a.y0.l.c0 r7 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r7
            d.a.a.a.y0.l.j1.k$a r8 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k.f14945b
            java.util.Objects.requireNonNull(r8)
            d.a.a.a.y0.l.j1.l r8 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k.C7505a.f14947b
            d.a.a.a.y0.l.c0 r7 = r0.mo25052i(r7, r11)
            d.a.a.a.y0.l.g1 r7 = r7.mo25056Y()
            d.a.a.a.y0.l.g1 r7 = r8.mo25148h(r7)
            r6.add(r7)
            goto L_0x014e
        L_0x0171:
            boolean r5 = r3.mo25163c()
            if (r5 != 0) goto L_0x0195
            d.a.a.a.y0.l.h1 r5 = r3.mo25162b()
            d.a.a.a.y0.l.h1 r7 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.OUT_VARIANCE
            if (r5 != r7) goto L_0x0195
            d.a.a.a.y0.l.j1.k$a r5 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k.f14945b
            java.util.Objects.requireNonNull(r5)
            d.a.a.a.y0.l.j1.l r5 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k.C7505a.f14947b
            d.a.a.a.y0.l.c0 r3 = r3.mo25161a()
            d.a.a.a.y0.l.g1 r3 = r3.mo25056Y()
            d.a.a.a.y0.l.g1 r3 = r5.mo25148h(r3)
            r6.add(r3)
        L_0x0195:
            d.a.a.a.y0.l.c0 r3 = r4.mo25161a()
            d.a.a.a.y0.l.j1.g r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g) r3
            d.a.a.a.y0.l.j1.i r3 = r3.f14930i
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "supertypes"
            p298d.p344x.p346c.C6888i.m12438e(r6, r4)
            d.a.a.a.y0.l.j1.j r4 = new d.a.a.a.y0.l.j1.j
            r4.<init>(r6)
            r3.f14937b = r4
        L_0x01ac:
            if (r2 <= r1) goto L_0x01af
            goto L_0x01b2
        L_0x01af:
            r14 = r2
            goto L_0x0118
        L_0x01b2:
            r18 = r15
        L_0x01b4:
            if (r18 != 0) goto L_0x01b7
            goto L_0x01cd
        L_0x01b7:
            d.a.a.a.y0.l.d0 r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0.f14869a
            d.a.a.a.y0.b.f1.h r16 = r10.getAnnotations()
            d.a.a.a.y0.l.t0 r17 = r10.mo24887V()
            boolean r19 = r10.mo23566W()
            r20 = 0
            r21 = 16
            d.a.a.a.y0.l.j0 r12 = p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0.m13432g(r16, r17, r18, r19, r20, r21)
        L_0x01cd:
            return r12
        L_0x01ce:
            java.lang.String r1 = "ClassicTypeSystemContext couldn't handle: "
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m425A(r1, r0, r2)
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m457r(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b.mo25100N(d.a.a.a.y0.l.l1.i, d.a.a.a.y0.l.l1.b):d.a.a.a.y0.l.l1.i");
    }

    /* renamed from: O */
    public C7539m mo25101O(C7538l lVar, int i) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(lVar, "receiver");
        C6248w0 w0Var = ((C7567t0) lVar).getParameters().get(i);
        C6888i.m12437d(w0Var, "this.parameters[index]");
        return w0Var;
    }

    /* renamed from: P */
    public C7542p mo25102P(C7539m mVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(mVar, "receiver");
        if (mVar instanceof C6248w0) {
            C7484h1 j = ((C6248w0) mVar).mo23137j();
            C6888i.m12437d(j, "this.variance");
            return C5266a.m9960h0(j);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C6902w.m12460a(mVar.getClass())).toString());
    }

    /* renamed from: Q */
    public boolean mo25103Q(C7538l lVar) {
        return C5266a.m10022r2(this, lVar);
    }

    /* renamed from: R */
    public boolean mo25104R(C7534h hVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(hVar, "receiver");
        if (hVar instanceof C7452c0) {
            return C5266a.m10046v2((C7452c0) hVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: S */
    public boolean mo25105S(C7538l lVar) {
        return C5266a.m10070z2(this, lVar);
    }

    /* renamed from: T */
    public boolean mo25106T(C7538l lVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            return lVar instanceof C7443a0;
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: U */
    public boolean mo25107U(C7535i iVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(iVar, "receiver");
        if (iVar instanceof C7489j0) {
            return false;
        }
        throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
    }

    /* renamed from: V */
    public int mo25108V(C7538l lVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            return ((C7567t0) lVar).getParameters().size();
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: W */
    public Collection<C7534h> mo25109W(C7538l lVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            Collection<C7452c0> supertypes = ((C7567t0) lVar).getSupertypes();
            C6888i.m12437d(supertypes, "this.supertypes");
            return supertypes;
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: a */
    public C7535i mo25110a(C7534h hVar) {
        return C5266a.m9788D(this, hVar);
    }

    /* renamed from: b */
    public int mo25111b(C7534h hVar) {
        return C5266a.m10025s(this, hVar);
    }

    /* renamed from: c */
    public C7538l mo25112c(C7535i iVar) {
        return C5266a.m9823I4(this, iVar);
    }

    /* renamed from: d */
    public boolean mo25113d(C7535i iVar) {
        return C5266a.m9779B2(this, iVar);
    }

    /* renamed from: e */
    public C7535i mo25114e(C7535i iVar, boolean z) {
        return C5266a.m9859O4(this, iVar, z);
    }

    /* renamed from: f */
    public boolean mo25059f(C7538l lVar) {
        return C5266a.m10064y2(this, lVar);
    }

    /* renamed from: g */
    public C7534h mo25060g(C7534h hVar) {
        return C5266a.m9862P1(this, hVar);
    }

    /* renamed from: h */
    public C7534h mo25061h(C7539m mVar) {
        return C5266a.m9856O1(this, mVar);
    }

    /* renamed from: i */
    public C7535i mo25115i(C7532f fVar) {
        return C5266a.m9835K4(this, fVar);
    }

    /* renamed from: j */
    public C7537k mo25116j(C7534h hVar, int i) {
        return C5266a.m9937d1(this, hVar, i);
    }

    /* renamed from: m */
    public C7542p mo25117m(C7537k kVar) {
        return C5266a.m9889U1(this, kVar);
    }

    /* renamed from: o */
    public boolean mo25118o(C7534h hVar) {
        return C5266a.m9797E2(this, hVar);
    }

    /* renamed from: p */
    public C7539m mo25062p(C7538l lVar) {
        return C5266a.m9874R1(this, lVar);
    }

    /* renamed from: q */
    public boolean mo25119q(C7537k kVar) {
        return C5266a.m9821I2(this, kVar);
    }

    /* renamed from: r */
    public C7532f mo25120r(C7534h hVar) {
        return C5266a.m10061y(this, hVar);
    }

    /* renamed from: s */
    public C7530d mo25121s(C7535i iVar) {
        return C5266a.m10043v(this, iVar);
    }

    /* renamed from: t */
    public boolean mo25122t(C7535i iVar, C7535i iVar2) {
        return C5266a.m9938d2(this, iVar, iVar2);
    }

    /* renamed from: u */
    public C7534h mo25123u(C7537k kVar) {
        return C5266a.m9868Q1(this, kVar);
    }

    /* renamed from: v */
    public boolean mo25124v(C7538l lVar, C7538l lVar2) {
        C6888i.m12438e(lVar, "c1");
        C6888i.m12438e(lVar2, "c2");
        if (!(lVar instanceof C7567t0)) {
            throw new IllegalArgumentException(C5266a.m9983l(lVar).toString());
        } else if (lVar2 instanceof C7567t0) {
            return mo24884L((C7567t0) lVar, (C7567t0) lVar2);
        } else {
            throw new IllegalArgumentException(C5266a.m9983l(lVar2).toString());
        }
    }

    /* renamed from: w */
    public C7534h mo25063w(C7534h hVar) {
        return C5266a.m9951f3(this, hVar);
    }

    /* renamed from: x */
    public C7535i mo25125x(C7532f fVar) {
        return C5266a.m9921a3(this, fVar);
    }

    /* renamed from: y */
    public boolean mo25126y(C7535i iVar) {
        return C5266a.m9803F2(this, iVar);
    }
}
