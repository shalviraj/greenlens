package p298d.p299a.p300a.p301a;

import java.lang.reflect.Field;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.p302x0.C5987i;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.f0 */
public final class C5912f0 extends C6890k implements C6862l<Field, C5987i<? extends Field>> {

    /* renamed from: g */
    public final /* synthetic */ C5885c0.C5886a f11709g;

    /* renamed from: h */
    public final /* synthetic */ boolean f11710h;

    /* renamed from: i */
    public final /* synthetic */ C5906e0 f11711i;

    /* renamed from: j */
    public final /* synthetic */ C5896d0 f11712j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5912f0(C5885c0.C5886a aVar, boolean z, C5906e0 e0Var, C5896d0 d0Var) {
        super(1);
        this.f11709g = aVar;
        this.f11710h = z;
        this.f11711i = e0Var;
        this.f11712j = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13033m(r1) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.m11805d(((p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7369k) r0).f14702C) != false) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p298d.p299a.p300a.p301a.p302x0.C5987i<java.lang.reflect.Field> invoke(java.lang.reflect.Field r5) {
        /*
            r4 = this;
            java.lang.String r0 = "field"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            d.a.a.a.c0$a r0 = r4.f11709g
            d.a.a.a.c0 r0 = r0.mo22963B()
            d.a.a.a.y0.b.k0 r0 = r0.mo22976x()
            d.a.a.a.y0.b.k r1 = r0.getContainingDeclaration()
            java.lang.String r2 = "containingDeclaration"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
            boolean r2 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13036p(r1)
            if (r2 != 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            d.a.a.a.y0.b.k r1 = r1.getContainingDeclaration()
            d.a.a.a.y0.b.f r2 = p298d.p299a.p300a.p301a.p303y0.p304b.C6051f.INTERFACE
            boolean r2 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13039s(r1, r2)
            r3 = 1
            if (r2 != 0) goto L_0x0032
            boolean r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13033m(r1)
            if (r1 == 0) goto L_0x0042
        L_0x0032:
            boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7369k
            if (r1 == 0) goto L_0x0041
            d.a.a.a.y0.j.b.f0.k r0 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7369k) r0
            d.a.a.a.y0.e.n r0 = r0.f14702C
            boolean r0 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.m11805d(r0)
            if (r0 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 != 0) goto L_0x00a7
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x00a7
        L_0x004f:
            d.a.a.a.d0 r0 = r4.f11712j
            boolean r0 = r0.mo23001a()
            if (r0 == 0) goto L_0x0091
            boolean r0 = r4.f11710h
            if (r0 == 0) goto L_0x0071
            d.a.a.a.c0$a r0 = r4.f11709g
            boolean r0 = r0.mo22977z()
            if (r0 == 0) goto L_0x006a
            d.a.a.a.x0.i$e$b r0 = new d.a.a.a.x0.i$e$b
            r0.<init>(r5)
            goto L_0x00ea
        L_0x006a:
            d.a.a.a.x0.i$e$d r0 = new d.a.a.a.x0.i$e$d
            r0.<init>(r5)
            goto L_0x00ea
        L_0x0071:
            d.a.a.a.c0$a r0 = r4.f11709g
            boolean r0 = r0.mo22977z()
            if (r0 == 0) goto L_0x0085
            d.a.a.a.x0.i$f$b r0 = new d.a.a.a.x0.i$f$b
            d.a.a.a.e0 r1 = r4.f11711i
            boolean r1 = r1.mo23004a()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x0085:
            d.a.a.a.x0.i$f$d r0 = new d.a.a.a.x0.i$f$d
            d.a.a.a.e0 r1 = r4.f11711i
            boolean r1 = r1.mo23004a()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x0091:
            boolean r0 = r4.f11710h
            if (r0 == 0) goto L_0x009b
            d.a.a.a.x0.i$e$e r0 = new d.a.a.a.x0.i$e$e
            r0.<init>(r5)
            goto L_0x00ea
        L_0x009b:
            d.a.a.a.x0.i$f$e r0 = new d.a.a.a.x0.i$f$e
            d.a.a.a.e0 r1 = r4.f11711i
            boolean r1 = r1.mo23004a()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x00a7:
            boolean r0 = r4.f11710h
            if (r0 == 0) goto L_0x00c5
            d.a.a.a.c0$a r0 = r4.f11709g
            boolean r0 = r0.mo22977z()
            if (r0 == 0) goto L_0x00bf
            d.a.a.a.x0.i$e$a r0 = new d.a.a.a.x0.i$e$a
            d.a.a.a.c0$a r1 = r4.f11709g
            java.lang.Object r1 = p005b.p291q.p292a.C5266a.m9949f1(r1)
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x00bf:
            d.a.a.a.x0.i$e$c r0 = new d.a.a.a.x0.i$e$c
            r0.<init>(r5)
            goto L_0x00ea
        L_0x00c5:
            d.a.a.a.c0$a r0 = r4.f11709g
            boolean r0 = r0.mo22977z()
            if (r0 == 0) goto L_0x00df
            d.a.a.a.x0.i$f$a r0 = new d.a.a.a.x0.i$f$a
            d.a.a.a.e0 r1 = r4.f11711i
            boolean r1 = r1.mo23004a()
            d.a.a.a.c0$a r2 = r4.f11709g
            java.lang.Object r2 = p005b.p291q.p292a.C5266a.m9949f1(r2)
            r0.<init>(r5, r1, r2)
            goto L_0x00ea
        L_0x00df:
            d.a.a.a.x0.i$f$c r0 = new d.a.a.a.x0.i$f$c
            d.a.a.a.e0 r1 = r4.f11711i
            boolean r1 = r1.mo23004a()
            r0.<init>(r5, r1)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5912f0.invoke(java.lang.reflect.Field):d.a.a.a.x0.i");
    }
}
