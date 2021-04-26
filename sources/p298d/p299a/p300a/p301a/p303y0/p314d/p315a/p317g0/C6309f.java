package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0;

import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6111i0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.d.a.g0.f */
public class C6309f extends C6111i0 implements C6305b {

    /* renamed from: i */
    public static final C6019a.C6020a<C6030b1> f12407i = new C6310a();

    /* renamed from: g */
    public C6311b f12408g;

    /* renamed from: h */
    public final boolean f12409h;

    /* renamed from: d.a.a.a.y0.d.a.g0.f$a */
    public static class C6310a implements C6019a.C6020a<C6030b1> {
    }

    /* renamed from: d.a.a.a.y0.d.a.g0.f$b */
    public enum C6311b {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: g */
        public final boolean f12415g;

        /* renamed from: h */
        public final boolean f12416h;

        /* access modifiers changed from: public */
        C6311b(boolean z, boolean z2) {
            this.f12415g = z;
            this.f12416h = z2;
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 17 || i == 20) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 12) {
            objArr[1] = "initialize";
        } else if (i == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 17 || i == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6309f(C6206k kVar, C6232q0 q0Var, C6060h hVar, C6717d dVar, C6023b.C6024a aVar, C6234r0 r0Var, boolean z) {
        super(kVar, q0Var, hVar, dVar, aVar, r0Var);
        if (kVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (aVar == null) {
            $$$reportNull$$$0(3);
            throw null;
        } else if (r0Var != null) {
            this.f12408g = null;
            this.f12409h = z;
        } else {
            $$$reportNull$$$0(4);
            throw null;
        }
    }

    /* renamed from: x */
    public static C6309f m11296x(C6206k kVar, C6060h hVar, C6717d dVar, C6234r0 r0Var, boolean z) {
        if (kVar == null) {
            $$$reportNull$$$0(5);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(7);
            throw null;
        } else if (r0Var != null) {
            return new C6309f(kVar, (C6232q0) null, hVar, dVar, C6023b.C6024a.DECLARATION, r0Var, z);
        } else {
            $$$reportNull$$$0(8);
            throw null;
        }
    }

    public C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        if (kVar == null) {
            $$$reportNull$$$0(13);
            throw null;
        } else if (aVar == null) {
            $$$reportNull$$$0(14);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(15);
            throw null;
        } else if (r0Var != null) {
            C6232q0 q0Var = (C6232q0) vVar;
            if (dVar == null) {
                dVar = getName();
            }
            C6309f fVar = new C6309f(kVar, q0Var, hVar, dVar, aVar, r0Var, this.f12409h);
            C6311b bVar = this.f12408g;
            fVar.mo23463z(bVar.f12415g, bVar.f12416h);
            return fVar;
        } else {
            $$$reportNull$$$0(16);
            throw null;
        }
    }

    public boolean hasStableParameterNames() {
        return this.f12408g.f12415g;
    }

    public boolean hasSynthesizedParameterNames() {
        return this.f12408g.f12416h;
    }

    /* renamed from: i */
    public C6305b mo23461i(C7452c0 c0Var, List list, C7452c0 c0Var2, C6768j jVar) {
        C6213n0 n0Var;
        if (c0Var2 != null) {
            List<C6030b1> k0 = C5266a.m9978k0(list, getValueParameters(), this);
            if (c0Var == null) {
                n0Var = null;
            } else {
                Objects.requireNonNull(C6060h.f11920d);
                n0Var = C5266a.m10032t0(this, c0Var, C6060h.C6061a.f11922b);
            }
            C6309f fVar = (C6309f) newCopyBuilder().mo23294g(k0).mo23305r(c0Var2).mo23311x(n0Var).mo23293f().mo23303p().mo23292e();
            if (jVar != null) {
                fVar.putInUserDataMap((C6019a.C6020a) jVar.f13681g, jVar.f13682h);
            }
            if (fVar != null) {
                return fVar;
            }
            $$$reportNull$$$0(20);
            throw null;
        }
        $$$reportNull$$$0(19);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r5.f15046b.mo25278a(r6) == false) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6111i0 initialize(p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0 r2, p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0 r3, java.util.List<? extends p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0> r4, java.util.List<p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1> r5, p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0 r6, p298d.p299a.p300a.p301a.p303y0.p304b.C6251y r7, p298d.p299a.p300a.p301a.p303y0.p304b.C6233r r8, java.util.Map<? extends p298d.p299a.p300a.p301a.p303y0.p304b.C6019a.C6020a<?>, ?> r9) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L_0x00ac
            if (r5 == 0) goto L_0x00a6
            if (r8 == 0) goto L_0x00a0
            d.a.a.a.y0.b.h1.i0 r2 = super.initialize(r2, r3, r4, r5, r6, r7, r8, r9)
            d.a.a.a.y0.m.l r3 = p298d.p299a.p300a.p301a.p303y0.p411m.C7605l.f15056a
            java.lang.String r4 = "functionDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r2, r4)
            java.util.List r3 = r3.mo25200a()
            java.util.Iterator r3 = r3.iterator()
        L_0x001a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0098
            java.lang.Object r5 = r3.next()
            d.a.a.a.y0.m.g r5 = (p298d.p299a.p300a.p301a.p303y0.p411m.C7597g) r5
            java.util.Objects.requireNonNull(r5)
            p298d.p344x.p346c.C6888i.m12438e(r2, r4)
            d.a.a.a.y0.f.d r6 = r5.f15045a
            r7 = 0
            if (r6 == 0) goto L_0x003e
            d.a.a.a.y0.f.d r6 = r2.getName()
            d.a.a.a.y0.f.d r8 = r5.f15045a
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r8)
            if (r6 != 0) goto L_0x003e
            goto L_0x0066
        L_0x003e:
            d.c0.d r6 = r5.f15046b
            if (r6 == 0) goto L_0x0058
            d.a.a.a.y0.f.d r6 = r2.getName()
            java.lang.String r6 = r6.mo23886e()
            java.lang.String r8 = "functionDescriptor.name.asString()"
            p298d.p344x.p346c.C6888i.m12437d(r6, r8)
            d.c0.d r8 = r5.f15046b
            boolean r6 = r8.mo25278a(r6)
            if (r6 != 0) goto L_0x0058
            goto L_0x0066
        L_0x0058:
            java.util.Collection<d.a.a.a.y0.f.d> r6 = r5.f15047c
            if (r6 == 0) goto L_0x0068
            d.a.a.a.y0.f.d r8 = r2.getName()
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x0068
        L_0x0066:
            r6 = r7
            goto L_0x0069
        L_0x0068:
            r6 = 1
        L_0x0069:
            if (r6 != 0) goto L_0x006c
            goto L_0x001a
        L_0x006c:
            p298d.p344x.p346c.C6888i.m12438e(r2, r4)
            d.a.a.a.y0.m.b[] r3 = r5.f15049e
            int r4 = r3.length
        L_0x0072:
            if (r7 >= r4) goto L_0x0084
            r6 = r3[r7]
            int r7 = r7 + 1
            java.lang.String r6 = r6.mo25196a(r2)
            if (r6 == 0) goto L_0x0072
            d.a.a.a.y0.m.c$b r3 = new d.a.a.a.y0.m.c$b
            r3.<init>(r6)
            goto L_0x009a
        L_0x0084:
            d.x.b.l<d.a.a.a.y0.b.v, java.lang.String> r3 = r5.f15048d
            java.lang.Object r3 = r3.invoke(r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0095
            d.a.a.a.y0.m.c$b r4 = new d.a.a.a.y0.m.c$b
            r4.<init>(r3)
            r3 = r4
            goto L_0x009a
        L_0x0095:
            d.a.a.a.y0.m.c$c r3 = p298d.p299a.p300a.p301a.p303y0.p411m.C7590c.C7593c.f15041b
            goto L_0x009a
        L_0x0098:
            d.a.a.a.y0.m.c$a r3 = p298d.p299a.p300a.p301a.p303y0.p411m.C7590c.C7591a.f15040b
        L_0x009a:
            boolean r3 = r3.f15039a
            r1.setOperator(r3)
            return r2
        L_0x00a0:
            r2 = 11
            $$$reportNull$$$0(r2)
            throw r0
        L_0x00a6:
            r2 = 10
            $$$reportNull$$$0(r2)
            throw r0
        L_0x00ac:
            r2 = 9
            $$$reportNull$$$0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f.initialize(d.a.a.a.y0.b.n0, d.a.a.a.y0.b.n0, java.util.List, java.util.List, d.a.a.a.y0.l.c0, d.a.a.a.y0.b.y, d.a.a.a.y0.b.r, java.util.Map):d.a.a.a.y0.b.h1.i0");
    }

    /* renamed from: z */
    public void mo23463z(boolean z, boolean z2) {
        this.f12408g = z ? z2 ? C6311b.STABLE_SYNTHESIZED : C6311b.STABLE_DECLARED : z2 ? C6311b.NON_STABLE_SYNTHESIZED : C6311b.NON_STABLE_DECLARED;
    }
}
