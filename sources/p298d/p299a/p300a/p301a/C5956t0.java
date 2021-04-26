package p298d.p299a.p300a.p301a;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.C5897e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6209l0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6522y;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6604e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.t0 */
public final class C5956t0 {

    /* renamed from: a */
    public static final C6713a f11772a;

    /* renamed from: b */
    public static final C5956t0 f11773b = null;

    static {
        C6713a l = C6713a.m12239l(new C6714b("java.lang.Void"));
        C6888i.m12437d(l, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        f11772a = l;
    }

    /* renamed from: a */
    public static final PrimitiveType m10788a(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(cls.getSimpleName());
        C6888i.m12437d(jvmPrimitiveType, "JvmPrimitiveType.get(simpleName)");
        return jvmPrimitiveType.getPrimitiveType();
    }

    /* renamed from: b */
    public static final C5897e.C5905e m10789b(C6244v vVar) {
        String B1 = C5266a.m9778B1(vVar);
        if (B1 == null) {
            if (vVar instanceof C6209l0) {
                String e = C7255a.m13140m(vVar).getName().mo23886e();
                C6888i.m12437d(e, "descriptor.propertyIfAccessor.name.asString()");
                B1 = C6522y.m11550a(e);
            } else if (vVar instanceof C6211m0) {
                String e2 = C7255a.m13140m(vVar).getName().mo23886e();
                C6888i.m12437d(e2, "descriptor.propertyIfAccessor.name.asString()");
                B1 = C6522y.m11551b(e2);
            } else {
                B1 = vVar.getName().mo23886e();
                C6888i.m12437d(B1, "descriptor.name.asString()");
            }
        }
        return new C5897e.C5905e(new C6604e.C6606b(B1, C6561p.m11653b(vVar, false, false, 1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: d.a.a.a.e$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.C5907f m10790c(p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0 r7) {
        /*
            java.lang.String r0 = "possiblyOverriddenProperty"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            d.a.a.a.y0.b.b r7 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13046z(r7)
            java.lang.String r0 = "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)"
            p298d.p344x.p346c.C6888i.m12437d(r7, r0)
            d.a.a.a.y0.b.k0 r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0) r7
            d.a.a.a.y0.b.k0 r1 = r7.getOriginal()
            java.lang.String r7 = "DescriptorUtils.unwrapFa…rriddenProperty).original"
            p298d.p344x.p346c.C6888i.m12437d(r1, r7)
            boolean r7 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7369k
            r0 = 0
            if (r7 == 0) goto L_0x003d
            r7 = r1
            d.a.a.a.y0.j.b.f0.k r7 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7369k) r7
            d.a.a.a.y0.e.n r2 = r7.f14702C
            d.a.a.a.y0.g.h$f<d.a.a.a.y0.e.n, d.a.a.a.y0.e.a0.a$d> r3 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a.f12909d
            java.lang.String r4 = "JvmProtoBuf.propertySignature"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            java.lang.Object r3 = p005b.p291q.p292a.C5266a.m10009p1(r2, r3)
            d.a.a.a.y0.e.a0.a$d r3 = (p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a.C6590d) r3
            if (r3 == 0) goto L_0x00be
            d.a.a.a.f$c r6 = new d.a.a.a.f$c
            d.a.a.a.y0.e.z.c r4 = r7.f14703D
            d.a.a.a.y0.e.z.e r5 = r7.f14704E
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x003d:
            boolean r7 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6312g
            if (r7 == 0) goto L_0x00be
            r7 = r1
            d.a.a.a.y0.d.a.g0.g r7 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6312g) r7
            d.a.a.a.y0.b.r0 r7 = r7.getSource()
            boolean r2 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a
            if (r2 != 0) goto L_0x004d
            r7 = r0
        L_0x004d:
            d.a.a.a.y0.d.a.i0.a r7 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a) r7
            if (r7 == 0) goto L_0x0056
            d.a.a.a.y0.d.a.j0.l r7 = r7.mo23337b()
            goto L_0x0057
        L_0x0056:
            r7 = r0
        L_0x0057:
            boolean r2 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6202w
            if (r2 == 0) goto L_0x0065
            d.a.a.a.f$a r0 = new d.a.a.a.f$a
            d.a.a.a.y0.b.j1.b.w r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6202w) r7
            java.lang.reflect.Field r7 = r7.f12228a
            r0.<init>(r7)
            goto L_0x0099
        L_0x0065:
            boolean r2 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6205z
            if (r2 == 0) goto L_0x009a
            d.a.a.a.f$b r2 = new d.a.a.a.f$b
            d.a.a.a.y0.b.j1.b.z r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6205z) r7
            java.lang.reflect.Method r7 = r7.f12230a
            d.a.a.a.y0.b.m0 r1 = r1.mo23217c()
            if (r1 == 0) goto L_0x007a
            d.a.a.a.y0.b.r0 r1 = r1.getSource()
            goto L_0x007b
        L_0x007a:
            r1 = r0
        L_0x007b:
            boolean r3 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a
            if (r3 != 0) goto L_0x0080
            r1 = r0
        L_0x0080:
            d.a.a.a.y0.d.a.i0.a r1 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a) r1
            if (r1 == 0) goto L_0x0089
            d.a.a.a.y0.d.a.j0.l r1 = r1.mo23337b()
            goto L_0x008a
        L_0x0089:
            r1 = r0
        L_0x008a:
            boolean r3 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6205z
            if (r3 != 0) goto L_0x008f
            r1 = r0
        L_0x008f:
            d.a.a.a.y0.b.j1.b.z r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6205z) r1
            if (r1 == 0) goto L_0x0095
            java.lang.reflect.Method r0 = r1.f12230a
        L_0x0095:
            r2.<init>(r7, r0)
            r0 = r2
        L_0x0099:
            return r0
        L_0x009a:
            d.a.a.a.l0 r0 = new d.a.a.a.l0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r7)
            r7 = 41
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
        L_0x00be:
            d.a.a.a.y0.b.l0 r7 = r1.mo23216b()
            p298d.p344x.p346c.C6888i.m12436c(r7)
            d.a.a.a.e$e r7 = m10789b(r7)
            d.a.a.a.y0.b.m0 r1 = r1.mo23217c()
            if (r1 == 0) goto L_0x00d3
            d.a.a.a.e$e r0 = m10789b(r1)
        L_0x00d3:
            d.a.a.a.f$d r1 = new d.a.a.a.f$d
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5956t0.m10790c(d.a.a.a.y0.b.k0):d.a.a.a.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0166, code lost:
        if (r0.getValueParameters().isEmpty() != false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0170  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.C5897e m10791d(p298d.p299a.p300a.p301a.p303y0.p304b.C6244v r7) {
        /*
            java.lang.String r0 = "possiblySubstitutedFunction"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            d.a.a.a.y0.b.b r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13046z(r7)
            java.lang.String r1 = "DescriptorUtils.unwrapFa…siblySubstitutedFunction)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            d.a.a.a.y0.b.v r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r0
            d.a.a.a.y0.b.v r0 = r0.getOriginal()
            java.lang.String r1 = "DescriptorUtils.unwrapFa…titutedFunction).original"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7322b
            if (r1 == 0) goto L_0x0077
            r1 = r0
            d.a.a.a.y0.j.b.f0.b r1 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7322b) r1
            d.a.a.a.y0.g.p r2 = r1.mo24956t()
            boolean r3 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p326e.C6643i
            if (r3 == 0) goto L_0x0041
            d.a.a.a.y0.e.a0.b.h r3 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.f13014a
            r4 = r2
            d.a.a.a.y0.e.i r4 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6643i) r4
            d.a.a.a.y0.e.z.c r5 = r1.mo24952S()
            d.a.a.a.y0.e.z.e r6 = r1.mo24950J()
            d.a.a.a.y0.e.a0.b.e$b r3 = r3.mo23731c(r4, r5, r6)
            if (r3 == 0) goto L_0x0041
            d.a.a.a.e$e r7 = new d.a.a.a.e$e
            r7.<init>(r3)
            return r7
        L_0x0041:
            boolean r3 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p326e.C6625d
            if (r3 == 0) goto L_0x0072
            d.a.a.a.y0.e.a0.b.h r3 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.f13014a
            d.a.a.a.y0.e.d r2 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6625d) r2
            d.a.a.a.y0.e.z.c r4 = r1.mo24952S()
            d.a.a.a.y0.e.z.e r1 = r1.mo24950J()
            d.a.a.a.y0.e.a0.b.e$b r1 = r3.mo23729a(r2, r4, r1)
            if (r1 == 0) goto L_0x0072
            d.a.a.a.y0.b.k r7 = r7.getContainingDeclaration()
            java.lang.String r0 = "possiblySubstitutedFunction.containingDeclaration"
            p298d.p344x.p346c.C6888i.m12437d(r7, r0)
            boolean r7 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13050b(r7)
            if (r7 == 0) goto L_0x006c
            d.a.a.a.e$e r7 = new d.a.a.a.e$e
            r7.<init>(r1)
            goto L_0x0071
        L_0x006c:
            d.a.a.a.e$d r7 = new d.a.a.a.e$d
            r7.<init>(r1)
        L_0x0071:
            return r7
        L_0x0072:
            d.a.a.a.e$e r7 = m10789b(r0)
            return r7
        L_0x0077:
            boolean r7 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f
            r1 = 0
            if (r7 == 0) goto L_0x00bd
            r7 = r0
            d.a.a.a.y0.d.a.g0.f r7 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f) r7
            d.a.a.a.y0.b.r0 r7 = r7.getSource()
            boolean r2 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a
            if (r2 != 0) goto L_0x0088
            r7 = r1
        L_0x0088:
            d.a.a.a.y0.d.a.i0.a r7 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a) r7
            if (r7 == 0) goto L_0x0091
            d.a.a.a.y0.d.a.j0.l r7 = r7.mo23337b()
            goto L_0x0092
        L_0x0091:
            r7 = r1
        L_0x0092:
            boolean r2 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6205z
            if (r2 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = r7
        L_0x0098:
            d.a.a.a.y0.b.j1.b.z r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6205z) r1
            if (r1 == 0) goto L_0x00a6
            java.lang.reflect.Method r7 = r1.f12230a
            if (r7 == 0) goto L_0x00a6
            d.a.a.a.e$c r0 = new d.a.a.a.e$c
            r0.<init>(r7)
            return r0
        L_0x00a6:
            d.a.a.a.l0 r7 = new d.a.a.a.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x00bd:
            boolean r7 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6306c
            r2 = 41
            java.lang.String r3 = " ("
            if (r7 == 0) goto L_0x011d
            r7 = r0
            d.a.a.a.y0.d.a.g0.c r7 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6306c) r7
            d.a.a.a.y0.b.r0 r7 = r7.getSource()
            boolean r4 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a
            if (r4 != 0) goto L_0x00d1
            r7 = r1
        L_0x00d1:
            d.a.a.a.y0.d.a.i0.a r7 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p321i0.C6409a) r7
            if (r7 == 0) goto L_0x00d9
            d.a.a.a.y0.d.a.j0.l r1 = r7.mo23337b()
        L_0x00d9:
            boolean r7 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6199t
            if (r7 == 0) goto L_0x00e7
            d.a.a.a.e$b r7 = new d.a.a.a.e$b
            d.a.a.a.y0.b.j1.b.t r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6199t) r1
            java.lang.reflect.Constructor<?> r0 = r1.f12226a
            r7.<init>(r0)
            goto L_0x00fc
        L_0x00e7:
            boolean r7 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6196q
            if (r7 == 0) goto L_0x00fd
            r7 = r1
            d.a.a.a.y0.b.j1.b.q r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6196q) r7
            boolean r4 = r7.mo23401z()
            if (r4 == 0) goto L_0x00fd
            d.a.a.a.e$a r0 = new d.a.a.a.e$a
            java.lang.Class<?> r7 = r7.f12222a
            r0.<init>(r7)
            r7 = r0
        L_0x00fc:
            return r7
        L_0x00fd:
            d.a.a.a.l0 r7 = new d.a.a.a.l0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r7.<init>(r0)
            throw r7
        L_0x011d:
            d.a.a.a.y0.f.d r7 = r0.getName()
            d.a.a.a.y0.f.d r1 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUE_OF
            boolean r7 = r7.equals(r1)
            r1 = 0
            r4 = 1
            if (r7 == 0) goto L_0x0133
            boolean r7 = p005b.p291q.p292a.C5266a.m10040u2(r0)
            if (r7 == 0) goto L_0x0133
            r7 = r4
            goto L_0x0134
        L_0x0133:
            r7 = r1
        L_0x0134:
            if (r7 != 0) goto L_0x0168
            d.a.a.a.y0.f.d r7 = r0.getName()
            d.a.a.a.y0.f.d r5 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUES
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x014a
            boolean r7 = p005b.p291q.p292a.C5266a.m10040u2(r0)
            if (r7 == 0) goto L_0x014a
            r7 = r4
            goto L_0x014b
        L_0x014a:
            r7 = r1
        L_0x014b:
            if (r7 == 0) goto L_0x014e
            goto L_0x0168
        L_0x014e:
            d.a.a.a.y0.f.d r7 = r0.getName()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope$Companion r5 = kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion
            d.a.a.a.y0.f.d r5 = r5.getCLONE_NAME()
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r7, r5)
            if (r7 == 0) goto L_0x0169
            java.util.List r7 = r0.getValueParameters()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0169
        L_0x0168:
            r1 = r4
        L_0x0169:
            if (r1 == 0) goto L_0x0170
            d.a.a.a.e$e r7 = m10789b(r0)
            return r7
        L_0x0170:
            d.a.a.a.l0 r7 = new d.a.a.a.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown origin of "
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5956t0.m10791d(d.a.a.a.y0.b.v):d.a.a.a.e");
    }
}
