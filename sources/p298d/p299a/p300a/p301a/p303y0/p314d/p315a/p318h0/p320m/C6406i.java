package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m;

import java.util.ArrayList;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7486i0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7579w;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.d.a.h0.m.i */
public final class C6406i extends C7579w implements C7486i0 {

    /* renamed from: d.a.a.a.y0.d.a.h0.m.i$a */
    public static final class C6407a extends C6890k implements C6862l<String, CharSequence> {

        /* renamed from: g */
        public static final C6407a f12630g = new C6407a();

        public C6407a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C6888i.m12438e(str, "it");
            return C6888i.m12444k("(raw) ", str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6406i(C7489j0 j0Var, C7489j0 j0Var2) {
        super(j0Var, j0Var2);
        C6888i.m12438e(j0Var, "lowerBound");
        C6888i.m12438e(j0Var2, "upperBound");
        C7493d.f14926a.mo25128d(j0Var, j0Var2);
    }

    public C6406i(C7489j0 j0Var, C7489j0 j0Var2, boolean z) {
        super(j0Var, j0Var2);
        if (!z) {
            C7493d.f14926a.mo25128d(j0Var, j0Var2);
        }
    }

    /* renamed from: f0 */
    public static final List<String> m11430f0(C7150c cVar, C7452c0 c0Var) {
        List<C7580w0> U = c0Var.mo24886U();
        ArrayList arrayList = new ArrayList(C5266a.m9892V(U, 10));
        for (C7580w0 x : U) {
            arrayList.add(cVar.mo24793x(x));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static final String m11431g0(String str, String str2) {
        if (!C7694h.m13925c(str, '<', false, 2)) {
            return str;
        }
        return C7694h.m13916G(str, '<', (String) null, 2) + '<' + str2 + '>' + C7694h.m13915F(str, '>', (String) null, 2);
    }

    /* renamed from: Z */
    public C7481g1 mo23545Z(boolean z) {
        return new C6406i(this.f15029h.mo23545Z(z), this.f15030i.mo23545Z(z));
    }

    /* renamed from: b0 */
    public C7481g1 mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C6406i(this.f15029h.mo23568d0(hVar), this.f15030i.mo23568d0(hVar));
    }

    /* renamed from: c0 */
    public C7489j0 mo23548c0() {
        return this.f15029h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo23549d0(p298d.p299a.p300a.p301a.p303y0.p390h.C7150c r12, p298d.p299a.p300a.p301a.p303y0.p390h.C7173i r13) {
        /*
            r11 = this;
            java.lang.String r0 = "renderer"
            p298d.p344x.p346c.C6888i.m12438e(r12, r0)
            java.lang.String r0 = "options"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            d.a.a.a.y0.l.j0 r0 = r11.f15029h
            java.lang.String r0 = r12.mo24792w(r0)
            d.a.a.a.y0.l.j0 r1 = r11.f15030i
            java.lang.String r1 = r12.mo24792w(r1)
            boolean r13 = r13.mo24847m()
            if (r13 == 0) goto L_0x003b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "raw ("
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = ".."
            r12.append(r13)
            r12.append(r1)
            r13 = 41
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            return r12
        L_0x003b:
            d.a.a.a.y0.l.j0 r13 = r11.f15030i
            java.util.List r13 = r13.mo24886U()
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0050
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r13 = p005b.p291q.p292a.C5266a.m9955g1(r11)
            java.lang.String r12 = r12.mo24789t(r0, r1, r13)
            return r12
        L_0x0050:
            d.a.a.a.y0.l.j0 r13 = r11.f15029h
            java.util.List r13 = m11430f0(r12, r13)
            d.a.a.a.y0.l.j0 r2 = r11.f15030i
            java.util.List r10 = m11430f0(r12, r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            d.a.a.a.y0.d.a.h0.m.i$a r8 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m.C6406i.C6407a.f12630g
            r9 = 30
            java.lang.String r3 = ", "
            r2 = r13
            java.lang.String r2 = p298d.p334t.C6790h.m12369w(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List r13 = p298d.p334t.C6790h.m12353g0(r13, r10)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            boolean r3 = r13.isEmpty()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x007a
            goto L_0x00ad
        L_0x007a:
            java.util.Iterator r13 = r13.iterator()
        L_0x007e:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r13.next()
            d.j r3 = (p298d.C6768j) r3
            A r6 = r3.f13681g
            java.lang.String r6 = (java.lang.String) r6
            B r3 = r3.f13682h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = "out "
            java.lang.String r7 = p298d.p415c0.C7694h.m13941s(r3, r7)
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r7)
            if (r6 != 0) goto L_0x00a9
            java.lang.String r6 = "*"
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r6)
            if (r3 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r3 = r4
            goto L_0x00aa
        L_0x00a9:
            r3 = r5
        L_0x00aa:
            if (r3 != 0) goto L_0x007e
            goto L_0x00ae
        L_0x00ad:
            r4 = r5
        L_0x00ae:
            if (r4 == 0) goto L_0x00b4
            java.lang.String r1 = m11431g0(r1, r2)
        L_0x00b4:
            java.lang.String r13 = m11431g0(r0, r2)
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r13, r1)
            if (r0 == 0) goto L_0x00bf
            return r13
        L_0x00bf:
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r0 = p005b.p291q.p292a.C5266a.m9955g1(r11)
            java.lang.String r12 = r12.mo24789t(r13, r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m.C6406i.mo23549d0(d.a.a.a.y0.h.c, d.a.a.a.y0.h.i):java.lang.String");
    }

    /* renamed from: e0 */
    public C7579w mo23546a0(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return new C6406i((C7489j0) eVar.mo25135g(this.f15029h), (C7489j0) eVar.mo25135g(this.f15030i), true);
    }

    public C7277h getMemberScope() {
        C6083h declarationDescriptor = mo24887V().getDeclarationDescriptor();
        C6046e eVar = declarationDescriptor instanceof C6046e ? (C6046e) declarationDescriptor : null;
        if (eVar != null) {
            C7277h memberScope = eVar.getMemberScope(C6404h.f12623b);
            C6888i.m12437d(memberScope, "classDescriptor.getMemberScope(RawSubstitution)");
            return memberScope;
        }
        throw new IllegalStateException(C6888i.m12444k("Incorrect classifier: ", mo24887V().getDeclarationDescriptor()).toString());
    }
}
