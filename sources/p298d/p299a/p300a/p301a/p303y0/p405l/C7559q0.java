package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.q0 */
public final class C7559q0 {

    /* renamed from: c */
    public static final C7560a f14999c = new C7560a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C7564s0 f15000a;

    /* renamed from: b */
    public final boolean f15001b;

    /* renamed from: d.a.a.a.y0.l.q0$a */
    public static final class C7560a {
        public C7560a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C7559q0(C7564s0 s0Var, boolean z) {
        C6888i.m12438e(s0Var, "reportStrategy");
        this.f15000a = s0Var;
        this.f15001b = z;
    }

    /* renamed from: a */
    public final void mo25173a(C6060h hVar, C6060h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((C6055c) it.next()).getFqName());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            C6055c cVar = (C6055c) it2.next();
            if (hashSet.contains(cVar.getFqName())) {
                this.f15000a.mo25179a(cVar);
            }
        }
    }

    /* renamed from: b */
    public final C7489j0 mo25174b(C7489j0 j0Var, C6060h hVar) {
        if (C5266a.m10046v2(j0Var)) {
            return j0Var;
        }
        boolean v2 = C5266a.m10046v2(j0Var);
        C6060h annotations = j0Var.getAnnotations();
        if (!v2) {
            annotations = C5266a.m9907Y(hVar, annotations);
        }
        return C5266a.m9774A3(j0Var, (List) null, annotations, 1);
    }

    /* renamed from: c */
    public final C7489j0 mo25175c(C7562r0 r0Var, C6060h hVar, boolean z, int i, boolean z2) {
        C7580w0 d = mo25176d(new C7584y0(C7484h1.INVARIANT, r0Var.f15004b.mo23436l()), r0Var, (C6248w0) null, i);
        C7452c0 a = d.mo25161a();
        C6888i.m12437d(a, "expandedProjection.type");
        C7489j0 C = C5266a.m9782C(a);
        if (C5266a.m10046v2(C)) {
            return C;
        }
        d.mo25162b();
        mo25173a(C.getAnnotations(), hVar);
        C7489j0 l = C7460d1.m13446l(mo25174b(C, hVar), z);
        C6888i.m12437d(l, "expandedType.combineAnnotations(annotations).let { TypeUtils.makeNullableIfNeeded(it, isNullable) }");
        if (!z2) {
            return l;
        }
        C7455d0 d0Var = C7455d0.f14869a;
        C7567t0 typeConstructor = r0Var.f15004b.getTypeConstructor();
        C6888i.m12437d(typeConstructor, "descriptor.typeConstructor");
        return C7544m0.m13703e(l, C7455d0.m13433h(hVar, typeConstructor, r0Var.f15005c, z, C7277h.C7280b.f14521b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02b9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0 mo25176d(p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0 r17, p298d.p299a.p300a.p301a.p303y0.p405l.C7562r0 r18, p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0 r19, int r20) {
        /*
            r16 = this;
            r6 = r16
            r7 = r18
            r0 = r19
            r8 = r20
            d.a.a.a.y0.l.h1 r1 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.INVARIANT
            d.a.a.a.y0.b.v0 r2 = r7.f15004b
            r3 = 100
            if (r8 > r3) goto L_0x02d8
            boolean r2 = r17.mo25163c()
            java.lang.String r3 = "makeStarProjection(typeParameterDescriptor!!)"
            if (r2 == 0) goto L_0x0023
        L_0x0018:
            p298d.p344x.p346c.C6888i.m12436c(r19)
            d.a.a.a.y0.l.w0 r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13447m(r19)
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            return r0
        L_0x0023:
            d.a.a.a.y0.l.c0 r2 = r17.mo25161a()
            java.lang.String r4 = "underlyingProjection.type"
            p298d.p344x.p346c.C6888i.m12437d(r2, r4)
            d.a.a.a.y0.l.t0 r4 = r2.mo24887V()
            java.lang.String r5 = "constructor"
            p298d.p344x.p346c.C6888i.m12438e(r4, r5)
            d.a.a.a.y0.b.h r4 = r4.getDeclarationDescriptor()
            boolean r5 = r4 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0
            r9 = 0
            if (r5 == 0) goto L_0x0047
            java.util.Map<d.a.a.a.y0.b.w0, d.a.a.a.y0.l.w0> r5 = r7.f15006d
            java.lang.Object r4 = r5.get(r4)
            d.a.a.a.y0.l.w0 r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r4
            goto L_0x0048
        L_0x0047:
            r4 = r9
        L_0x0048:
            if (r4 != 0) goto L_0x0231
            d.a.a.a.y0.l.c0 r0 = r17.mo25161a()
            d.a.a.a.y0.l.g1 r0 = r0.mo25056Y()
            boolean r2 = p005b.p291q.p292a.C5266a.m10034t2(r0)
            if (r2 == 0) goto L_0x0059
            goto L_0x008b
        L_0x0059:
            d.a.a.a.y0.l.j0 r10 = p005b.p291q.p292a.C5266a.m9782C(r0)
            boolean r0 = p005b.p291q.p292a.C5266a.m10046v2(r10)
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            d.a.a.a.y0.l.m1.b r2 = p298d.p299a.p300a.p301a.p303y0.p405l.p409m1.C7546b.f14984g
            boolean r2 = p005b.p291q.p292a.C5266a.m9942e0(r10, r2)
            if (r2 != 0) goto L_0x0071
            goto L_0x008b
        L_0x0071:
            d.a.a.a.y0.l.t0 r2 = r10.mo24887V()
            d.a.a.a.y0.b.h r3 = r2.getDeclarationDescriptor()
            java.util.List r4 = r2.getParameters()
            r4.size()
            java.util.List r4 = r10.mo24886U()
            r4.size()
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0
            if (r4 == 0) goto L_0x008f
        L_0x008b:
            r0 = r17
            goto L_0x0230
        L_0x008f:
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0
            r5 = 0
            if (r4 == 0) goto L_0x016c
            d.a.a.a.y0.b.v0 r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0) r3
            boolean r0 = r7.mo25178a(r3)
            if (r0 == 0) goto L_0x00b6
            d.a.a.a.y0.l.s0 r0 = r6.f15000a
            r0.mo25181c(r3)
            d.a.a.a.y0.l.y0 r0 = new d.a.a.a.y0.l.y0
            d.a.a.a.y0.f.d r2 = r3.getName()
            java.lang.String r3 = "Recursive type alias: "
            java.lang.String r2 = p298d.p344x.p346c.C6888i.m12444k(r3, r2)
            d.a.a.a.y0.l.j0 r2 = p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.m13783d(r2)
            r0.<init>(r1, r2)
            goto L_0x0230
        L_0x00b6:
            java.util.List r0 = r10.mo24886U()
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            int r11 = p005b.p291q.p292a.C5266a.m9892V(r0, r1)
            r4.<init>(r11)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c9:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00f2
            java.lang.Object r11 = r0.next()
            int r12 = r5 + 1
            if (r5 < 0) goto L_0x00ee
            d.a.a.a.y0.l.w0 r11 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r11
            java.util.List r13 = r2.getParameters()
            java.lang.Object r5 = r13.get(r5)
            d.a.a.a.y0.b.w0 r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r5
            int r13 = r8 + 1
            d.a.a.a.y0.l.w0 r5 = r6.mo25176d(r11, r7, r5, r13)
            r4.add(r5)
            r5 = r12
            goto L_0x00c9
        L_0x00ee:
            p298d.p334t.C6790h.m12333T()
            throw r9
        L_0x00f2:
            java.lang.String r0 = "typeAliasDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            java.lang.String r0 = "arguments"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            d.a.a.a.y0.l.t0 r0 = r3.getTypeConstructor()
            java.util.List r0 = r0.getParameters()
            java.lang.String r2 = "typeAliasDescriptor.typeConstructor.parameters"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = p005b.p291q.p292a.C5266a.m9892V(r0, r1)
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0116:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x012a
            java.lang.Object r1 = r0.next()
            d.a.a.a.y0.b.w0 r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r1
            d.a.a.a.y0.b.w0 r1 = r1.getOriginal()
            r2.add(r1)
            goto L_0x0116
        L_0x012a:
            java.util.List r0 = p298d.p334t.C6790h.m12353g0(r2, r4)
            java.util.Map r5 = p298d.p334t.C6790h.m12338Y(r0)
            d.a.a.a.y0.l.r0 r9 = new d.a.a.a.y0.l.r0
            r11 = 0
            r0 = r9
            r1 = r18
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            d.a.a.a.y0.b.f1.h r2 = r10.getAnnotations()
            boolean r3 = r10.mo23566W()
            int r4 = r8 + 1
            r5 = 0
            r0 = r16
            r1 = r9
            d.a.a.a.y0.l.j0 r0 = r0.mo25175c(r1, r2, r3, r4, r5)
            d.a.a.a.y0.l.j0 r1 = r6.mo25177e(r10, r7, r8)
            boolean r2 = p005b.p291q.p292a.C5266a.m10034t2(r0)
            if (r2 == 0) goto L_0x015c
            goto L_0x0160
        L_0x015c:
            d.a.a.a.y0.l.j0 r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7544m0.m13703e(r0, r1)
        L_0x0160:
            d.a.a.a.y0.l.y0 r1 = new d.a.a.a.y0.l.y0
            d.a.a.a.y0.l.h1 r2 = r17.mo25162b()
            r1.<init>(r2, r0)
            r0 = r1
            goto L_0x0230
        L_0x016c:
            d.a.a.a.y0.l.j0 r2 = r6.mo25177e(r10, r7, r8)
            d.a.a.a.y0.l.b1 r3 = p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1.m13402d(r2)
            java.lang.String r4 = "create(substitutedType)"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            java.util.List r4 = r2.mo24886U()
            java.util.Iterator r4 = r4.iterator()
        L_0x0181:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0227
            java.lang.Object r7 = r4.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L_0x0223
            d.a.a.a.y0.l.w0 r7 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r7
            boolean r11 = r7.mo25163c()
            if (r11 != 0) goto L_0x0220
            d.a.a.a.y0.l.c0 r11 = r7.mo25161a()
            java.lang.String r12 = "substitutedArgument.type"
            p298d.p344x.p346c.C6888i.m12437d(r11, r12)
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            d.a.a.a.y0.l.m1.a r13 = p298d.p299a.p300a.p301a.p303y0.p405l.p409m1.C7545a.f14983g
            boolean r11 = p005b.p291q.p292a.C5266a.m9942e0(r11, r13)
            if (r11 != 0) goto L_0x0220
            java.util.List r11 = r10.mo24886U()
            java.lang.Object r11 = r11.get(r5)
            d.a.a.a.y0.l.w0 r11 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r11
            d.a.a.a.y0.l.t0 r13 = r10.mo24887V()
            java.util.List r13 = r13.getParameters()
            java.lang.Object r5 = r13.get(r5)
            d.a.a.a.y0.b.w0 r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r5
            boolean r13 = r6.f15001b
            if (r13 == 0) goto L_0x0220
            d.a.a.a.y0.l.s0 r13 = r6.f15000a
            d.a.a.a.y0.l.c0 r11 = r11.mo25161a()
            java.lang.String r14 = "unsubstitutedArgument.type"
            p298d.p344x.p346c.C6888i.m12437d(r11, r14)
            d.a.a.a.y0.l.c0 r7 = r7.mo25161a()
            p298d.p344x.p346c.C6888i.m12437d(r7, r12)
            java.lang.String r12 = "typeParameter"
            p298d.p344x.p346c.C6888i.m12437d(r5, r12)
            java.lang.String r12 = "reportStrategy"
            p298d.p344x.p346c.C6888i.m12438e(r13, r12)
            java.lang.String r12 = "unsubstitutedArgument"
            p298d.p344x.p346c.C6888i.m12438e(r11, r12)
            java.lang.String r12 = "typeArgument"
            p298d.p344x.p346c.C6888i.m12438e(r7, r12)
            java.lang.String r12 = "typeParameterDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r5, r12)
            java.lang.String r12 = "substitutor"
            p298d.p344x.p346c.C6888i.m12438e(r3, r12)
            java.util.List r12 = r5.getUpperBounds()
            java.util.Iterator r12 = r12.iterator()
        L_0x01ff:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0220
            java.lang.Object r14 = r12.next()
            d.a.a.a.y0.l.c0 r14 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r14
            d.a.a.a.y0.l.c0 r14 = r3.mo25052i(r14, r1)
            java.lang.String r15 = "substitutor.safeSubstitute(bound, Variance.INVARIANT)"
            p298d.p344x.p346c.C6888i.m12437d(r14, r15)
            d.a.a.a.y0.l.j1.d r15 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d.f14926a
            boolean r15 = r15.mo25128d(r7, r14)
            if (r15 != 0) goto L_0x01ff
            r13.mo25182d(r14, r11, r7, r5)
            goto L_0x01ff
        L_0x0220:
            r5 = r8
            goto L_0x0181
        L_0x0223:
            p298d.p334t.C6790h.m12333T()
            throw r9
        L_0x0227:
            d.a.a.a.y0.l.y0 r0 = new d.a.a.a.y0.l.y0
            d.a.a.a.y0.l.h1 r1 = r17.mo25162b()
            r0.<init>(r1, r2)
        L_0x0230:
            return r0
        L_0x0231:
            boolean r5 = r4.mo25163c()
            if (r5 == 0) goto L_0x0239
            goto L_0x0018
        L_0x0239:
            d.a.a.a.y0.l.c0 r3 = r4.mo25161a()
            d.a.a.a.y0.l.g1 r3 = r3.mo25056Y()
            d.a.a.a.y0.l.h1 r4 = r4.mo25162b()
            java.lang.String r5 = "argument.projectionKind"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            d.a.a.a.y0.l.h1 r5 = r17.mo25162b()
            java.lang.String r8 = "underlyingProjection.projectionKind"
            p298d.p344x.p346c.C6888i.m12437d(r5, r8)
            if (r5 != r4) goto L_0x0256
            goto L_0x0264
        L_0x0256:
            if (r5 != r1) goto L_0x0259
            goto L_0x0264
        L_0x0259:
            if (r4 != r1) goto L_0x025d
            r4 = r5
            goto L_0x0264
        L_0x025d:
            d.a.a.a.y0.l.s0 r5 = r6.f15000a
            d.a.a.a.y0.b.v0 r8 = r7.f15004b
            r5.mo25180b(r8, r0, r3)
        L_0x0264:
            if (r0 != 0) goto L_0x0267
            goto L_0x026b
        L_0x0267:
            d.a.a.a.y0.l.h1 r9 = r19.mo23137j()
        L_0x026b:
            if (r9 != 0) goto L_0x026e
            r9 = r1
        L_0x026e:
            java.lang.String r5 = "typeParameterDescriptor?.variance ?: Variance.INVARIANT"
            p298d.p344x.p346c.C6888i.m12437d(r9, r5)
            if (r9 != r4) goto L_0x0276
            goto L_0x0283
        L_0x0276:
            if (r9 != r1) goto L_0x0279
            goto L_0x0283
        L_0x0279:
            if (r4 != r1) goto L_0x027c
            goto L_0x0284
        L_0x027c:
            d.a.a.a.y0.l.s0 r1 = r6.f15000a
            d.a.a.a.y0.b.v0 r5 = r7.f15004b
            r1.mo25180b(r5, r0, r3)
        L_0x0283:
            r1 = r4
        L_0x0284:
            d.a.a.a.y0.b.f1.h r0 = r2.getAnnotations()
            d.a.a.a.y0.b.f1.h r4 = r3.getAnnotations()
            r6.mo25173a(r0, r4)
            boolean r0 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7566t
            if (r0 == 0) goto L_0x02b9
            d.a.a.a.y0.l.t r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7566t) r3
            d.a.a.a.y0.b.f1.h r0 = r2.getAnnotations()
            boolean r2 = p005b.p291q.p292a.C5266a.m10046v2(r3)
            d.a.a.a.y0.b.f1.h r4 = r3.getAnnotations()
            if (r2 == 0) goto L_0x02a4
            goto L_0x02a8
        L_0x02a4:
            d.a.a.a.y0.b.f1.h r4 = p005b.p291q.p292a.C5266a.m9907Y(r0, r4)
        L_0x02a8:
            java.lang.String r0 = "newAnnotations"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            d.a.a.a.y0.l.t r0 = new d.a.a.a.y0.l.t
            d.a.a.a.y0.l.j0 r2 = r3.f15030i
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r2 = p005b.p291q.p292a.C5266a.m9955g1(r2)
            r0.<init>(r2, r4)
            goto L_0x02d2
        L_0x02b9:
            d.a.a.a.y0.l.j0 r0 = p005b.p291q.p292a.C5266a.m9782C(r3)
            boolean r3 = r2.mo23566W()
            d.a.a.a.y0.l.j0 r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13446l(r0, r3)
            java.lang.String r3 = "makeNullableIfNeeded(this, fromType.isMarkedNullable)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            d.a.a.a.y0.b.f1.h r2 = r2.getAnnotations()
            d.a.a.a.y0.l.j0 r0 = r6.mo25174b(r0, r2)
        L_0x02d2:
            d.a.a.a.y0.l.y0 r2 = new d.a.a.a.y0.l.y0
            r2.<init>(r1, r0)
            return r2
        L_0x02d8:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            d.a.a.a.y0.f.d r1 = r2.getName()
            java.lang.String r2 = "Too deep recursion while expanding type alias "
            java.lang.String r1 = p298d.p344x.p346c.C6888i.m12444k(r2, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.C7559q0.mo25176d(d.a.a.a.y0.l.w0, d.a.a.a.y0.l.r0, d.a.a.a.y0.b.w0, int):d.a.a.a.y0.l.w0");
    }

    /* renamed from: e */
    public final C7489j0 mo25177e(C7489j0 j0Var, C7562r0 r0Var, int i) {
        C7567t0 V = j0Var.mo24887V();
        List<C7580w0> U = j0Var.mo24886U();
        ArrayList arrayList = new ArrayList(C5266a.m9892V(U, 10));
        int i2 = 0;
        for (T next : U) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C7580w0 w0Var = (C7580w0) next;
                C7580w0 d = mo25176d(w0Var, r0Var, V.getParameters().get(i2), i + 1);
                if (!d.mo25163c()) {
                    d = new C7584y0(d.mo25162b(), C7460d1.m13445k(d.mo25161a(), w0Var.mo25161a().mo23566W()));
                }
                arrayList.add(d);
                i2 = i3;
            } else {
                C6790h.m12333T();
                throw null;
            }
        }
        return C5266a.m9774A3(j0Var, arrayList, (C6060h) null, 2);
    }
}
