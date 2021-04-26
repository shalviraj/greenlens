package p298d.p299a.p300a.p301a;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.regex.Matcher;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p299a.C6729h;
import p298d.p299a.C6730i;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p302x0.C5986h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6158j0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6209l0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6879b;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;
import p298d.p415c0.C7688c;
import p298d.p415c0.C7690d;

/* renamed from: d.a.a.a.c0 */
public abstract class C5885c0<V> extends C5913g<V> implements C6736l<V> {

    /* renamed from: p */
    public static final Object f11666p = new Object();

    /* renamed from: j */
    public final C5941o0<Field> f11667j;

    /* renamed from: k */
    public final C5939n0<C6207k0> f11668k;

    /* renamed from: l */
    public final C5934n f11669l;

    /* renamed from: m */
    public final String f11670m;

    /* renamed from: n */
    public final String f11671n;

    /* renamed from: o */
    public final Object f11672o;

    /* renamed from: d.a.a.a.c0$a */
    public static abstract class C5886a<PropertyType, ReturnType> extends C5913g<ReturnType> implements C6729h<ReturnType>, C6736l.C6737a<PropertyType> {
        /* renamed from: A */
        public abstract C6158j0 mo22999A();

        /* renamed from: B */
        public abstract C5885c0<PropertyType> mo22963B();

        /* renamed from: v */
        public C5934n mo22974v() {
            return mo22963B().f11669l;
        }

        /* renamed from: w */
        public C5986h<?> mo22975w() {
            return null;
        }

        /* renamed from: z */
        public boolean mo22977z() {
            Object obj = mo22963B().f11672o;
            int i = C6879b.f13780m;
            return !C6888i.m12434a(obj, C6879b.C6880a.f13787g);
        }
    }

    /* renamed from: d.a.a.a.c0$b */
    public static abstract class C5887b<V> extends C5886a<V, V> implements C6736l.C6738b<V> {

        /* renamed from: l */
        public static final /* synthetic */ C6736l[] f11673l;

        /* renamed from: j */
        public final C5939n0 f11674j = C5266a.m9905X2(new C5889b(this));

        /* renamed from: k */
        public final C5941o0 f11675k = C5266a.m9895V2(new C5888a(this));

        /* renamed from: d.a.a.a.c0$b$a */
        public static final class C5888a extends C6890k implements C6851a<C5986h<?>> {

            /* renamed from: g */
            public final /* synthetic */ C5887b f11676g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5888a(C5887b bVar) {
                super(0);
                this.f11676g = bVar;
            }

            public Object invoke() {
                return C5266a.m9977k(this.f11676g, true);
            }
        }

        /* renamed from: d.a.a.a.c0$b$b */
        public static final class C5889b extends C6890k implements C6851a<C6209l0> {

            /* renamed from: g */
            public final /* synthetic */ C5887b f11677g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5889b(C5887b bVar) {
                super(0);
                this.f11677g = bVar;
            }

            public Object invoke() {
                C6209l0 b = this.f11677g.mo22963B().mo22976x().mo23216b();
                if (b != null) {
                    return b;
                }
                C6207k0 B = this.f11677g.mo22963B().mo22976x();
                Objects.requireNonNull(C6060h.f11920d);
                return C5266a.m10008p0(B, C6060h.C6061a.f11922b);
            }
        }

        static {
            Class<C5887b> cls = C5887b.class;
            f11673l = new C6736l[]{C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: A */
        public C6158j0 mo22999A() {
            C5939n0 n0Var = this.f11674j;
            C6736l lVar = f11673l[0];
            return (C6209l0) n0Var.invoke();
        }

        public String getName() {
            return C0843a.m454o(C0843a.m460u("<get-"), mo22963B().f11670m, '>');
        }

        /* renamed from: u */
        public C5986h<?> mo22973u() {
            C5941o0 o0Var = this.f11675k;
            C6736l lVar = f11673l[1];
            return (C5986h) o0Var.invoke();
        }

        /* renamed from: x */
        public C6023b mo22976x() {
            C5939n0 n0Var = this.f11674j;
            C6736l lVar = f11673l[0];
            return (C6209l0) n0Var.invoke();
        }
    }

    /* renamed from: d.a.a.a.c0$c */
    public static abstract class C5890c<V> extends C5886a<V, C6777r> implements C6730i.C6731a<V> {

        /* renamed from: l */
        public static final /* synthetic */ C6736l[] f11678l;

        /* renamed from: j */
        public final C5939n0 f11679j = C5266a.m9905X2(new C5892b(this));

        /* renamed from: k */
        public final C5941o0 f11680k = C5266a.m9895V2(new C5891a(this));

        /* renamed from: d.a.a.a.c0$c$a */
        public static final class C5891a extends C6890k implements C6851a<C5986h<?>> {

            /* renamed from: g */
            public final /* synthetic */ C5890c f11681g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5891a(C5890c cVar) {
                super(0);
                this.f11681g = cVar;
            }

            public Object invoke() {
                return C5266a.m9977k(this.f11681g, false);
            }
        }

        /* renamed from: d.a.a.a.c0$c$b */
        public static final class C5892b extends C6890k implements C6851a<C6211m0> {

            /* renamed from: g */
            public final /* synthetic */ C5890c f11682g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5892b(C5890c cVar) {
                super(0);
                this.f11682g = cVar;
            }

            public Object invoke() {
                C6211m0 c = this.f11682g.mo22963B().mo22976x().mo23217c();
                if (c != null) {
                    return c;
                }
                C6207k0 B = this.f11682g.mo22963B().mo22976x();
                Objects.requireNonNull(C6060h.f11920d);
                C6060h hVar = C6060h.C6061a.f11922b;
                return C5266a.m10014q0(B, hVar, hVar);
            }
        }

        static {
            Class<C5890c> cls = C5890c.class;
            f11678l = new C6736l[]{C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: A */
        public C6158j0 mo22999A() {
            C5939n0 n0Var = this.f11679j;
            C6736l lVar = f11678l[0];
            return (C6211m0) n0Var.invoke();
        }

        public String getName() {
            return C0843a.m454o(C0843a.m460u("<set-"), mo22963B().f11670m, '>');
        }

        /* renamed from: u */
        public C5986h<?> mo22973u() {
            C5941o0 o0Var = this.f11680k;
            C6736l lVar = f11678l[1];
            return (C5986h) o0Var.invoke();
        }

        /* renamed from: x */
        public C6023b mo22976x() {
            C5939n0 n0Var = this.f11679j;
            C6736l lVar = f11678l[0];
            return (C6211m0) n0Var.invoke();
        }
    }

    /* renamed from: d.a.a.a.c0$d */
    public static final class C5893d extends C6890k implements C6851a<C6207k0> {

        /* renamed from: g */
        public final /* synthetic */ C5885c0 f11683g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5893d(C5885c0 c0Var) {
            super(0);
            this.f11683g = c0Var;
        }

        public Object invoke() {
            Object obj;
            String str;
            C5885c0 c0Var = this.f11683g;
            C5934n nVar = c0Var.f11669l;
            String str2 = c0Var.f11670m;
            String str3 = c0Var.f11671n;
            Objects.requireNonNull(nVar);
            C6888i.m12438e(str2, "name");
            C6888i.m12438e(str3, "signature");
            C7690d dVar = C5934n.f11746h;
            Objects.requireNonNull(dVar);
            C6888i.m12438e(str3, "input");
            Matcher matcher = dVar.f15227g.matcher(str3);
            C6888i.m12437d(matcher, "nativePattern.matcher(input)");
            C7688c cVar = !matcher.matches() ? null : new C7688c(matcher, str3);
            boolean z = true;
            if (cVar != null) {
                C6888i.m12438e(cVar, "match");
                String str4 = cVar.mo25277a().get(1);
                C6207k0 x = nVar.mo22954x(Integer.parseInt(str4));
                if (x != null) {
                    return x;
                }
                StringBuilder z2 = C0843a.m465z("Local property #", str4, " not found in ");
                z2.append(nVar.mo22949n());
                throw new C5931l0(z2.toString());
            }
            C6717d l = C6717d.m12270l(str2);
            C6888i.m12437d(l, "Name.identifier(name)");
            Collection<C6207k0> A = nVar.mo22937A(l);
            ArrayList arrayList = new ArrayList();
            for (T next : A) {
                C5956t0 t0Var = C5956t0.f11773b;
                if (C6888i.m12434a(C5956t0.m10790c((C6207k0) next).mo23005a(), str3)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        C6233r visibility = ((C6207k0) next2).getVisibility();
                        Object obj2 = linkedHashMap.get(visibility);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(visibility, obj2);
                        }
                        ((List) obj2).add(next2);
                    }
                    C5945q qVar = C5945q.f11761g;
                    C6888i.m12438e(linkedHashMap, "$this$toSortedMap");
                    C6888i.m12438e(qVar, "comparator");
                    TreeMap treeMap = new TreeMap(qVar);
                    treeMap.putAll(linkedHashMap);
                    Collection values = treeMap.values();
                    C6888i.m12437d(values, "properties\n             …                }).values");
                    List list = (List) C6790h.m12370x(values);
                    if (list.size() == 1) {
                        C6888i.m12437d(list, "mostVisibleProperties");
                        obj = C6790h.m12361o(list);
                    } else {
                        C6717d l2 = C6717d.m12270l(str2);
                        C6888i.m12437d(l2, "Name.identifier(name)");
                        String w = C6790h.m12369w(nVar.mo22937A(l2), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C5942p.f11759g, 30);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Property '");
                        sb.append(str2);
                        sb.append("' (JVM signature: ");
                        sb.append(str3);
                        sb.append(") not resolved in ");
                        sb.append(nVar);
                        sb.append(':');
                        if (w.length() != 0) {
                            z = false;
                        }
                        if (z) {
                            str = " no members found";
                        } else {
                            str = 10 + w;
                        }
                        sb.append(str);
                        throw new C5931l0(sb.toString());
                    }
                } else {
                    obj = C6790h.m12329P(arrayList);
                }
                return (C6207k0) obj;
            }
            throw new C5931l0("Property '" + str2 + "' (JVM signature: " + str3 + ") not resolved in " + nVar);
        }
    }

    /* renamed from: d.a.a.a.c0$e */
    public static final class C5894e extends C6890k implements C6851a<Field> {

        /* renamed from: g */
        public final /* synthetic */ C5885c0 f11684g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5894e(C5885c0 c0Var) {
            super(0);
            this.f11684g = c0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
            if (((r5 == null || !r5.getAnnotations().mo23169v(p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6522y.f12768b)) ? r1.getAnnotations().mo23169v(p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6522y.f12768b) : true) != false) goto L_0x0082;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3 A[SYNTHETIC, Splitter:B:38:0x00b3] */
        /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r8 = this;
                d.a.a.a.t0 r0 = p298d.p299a.p300a.p301a.C5956t0.f11773b
                d.a.a.a.c0 r0 = r8.f11684g
                d.a.a.a.y0.b.k0 r0 = r0.mo22976x()
                d.a.a.a.f r0 = p298d.p299a.p300a.p301a.C5956t0.m10790c(r0)
                boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.C5907f.C5910c
                r2 = 0
                if (r1 == 0) goto L_0x00c2
                d.a.a.a.f$c r0 = (p298d.p299a.p300a.p301a.C5907f.C5910c) r0
                d.a.a.a.y0.b.k0 r1 = r0.f11702b
                d.a.a.a.y0.e.a0.b.h r3 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.f13014a
                d.a.a.a.y0.e.n r4 = r0.f11703c
                d.a.a.a.y0.e.z.c r5 = r0.f11705e
                d.a.a.a.y0.e.z.e r6 = r0.f11706f
                r7 = 1
                d.a.a.a.y0.e.a0.b.e$a r3 = r3.mo23730b(r4, r5, r6, r7)
                if (r3 == 0) goto L_0x00d4
                r4 = 0
                if (r1 == 0) goto L_0x00be
                d.a.a.a.y0.b.b$a r5 = r1.getKind()
                d.a.a.a.y0.b.b$a r6 = p298d.p299a.p300a.p301a.p303y0.p304b.C6023b.C6024a.FAKE_OVERRIDE
                if (r5 != r6) goto L_0x0030
                goto L_0x0081
            L_0x0030:
                d.a.a.a.y0.b.k r5 = r1.getContainingDeclaration()
                if (r5 == 0) goto L_0x00ba
                boolean r6 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13036p(r5)
                if (r6 == 0) goto L_0x0052
                d.a.a.a.y0.b.k r6 = r5.getContainingDeclaration()
                boolean r6 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13035o(r6)
                if (r6 == 0) goto L_0x0052
                d.a.a.a.y0.b.e r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r5
                kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping r6 = kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.INSTANCE
                boolean r5 = kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(r6, r5)
                if (r5 != 0) goto L_0x0052
                r5 = r7
                goto L_0x0053
            L_0x0052:
                r5 = r4
            L_0x0053:
                if (r5 == 0) goto L_0x0056
                goto L_0x0082
            L_0x0056:
                d.a.a.a.y0.b.k r5 = r1.getContainingDeclaration()
                boolean r5 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13036p(r5)
                if (r5 == 0) goto L_0x0081
                d.a.a.a.y0.b.s r5 = r1.mo23221y()
                if (r5 == 0) goto L_0x0074
                d.a.a.a.y0.b.f1.h r5 = r5.getAnnotations()
                d.a.a.a.y0.f.b r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6522y.f12768b
                boolean r5 = r5.mo23169v(r6)
                if (r5 == 0) goto L_0x0074
                r5 = r7
                goto L_0x007e
            L_0x0074:
                d.a.a.a.y0.b.f1.h r5 = r1.getAnnotations()
                d.a.a.a.y0.f.b r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6522y.f12768b
                boolean r5 = r5.mo23169v(r6)
            L_0x007e:
                if (r5 == 0) goto L_0x0081
                goto L_0x0082
            L_0x0081:
                r7 = r4
            L_0x0082:
                if (r7 != 0) goto L_0x00a5
                d.a.a.a.y0.e.n r0 = r0.f11703c
                boolean r0 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.m11805d(r0)
                if (r0 == 0) goto L_0x008d
                goto L_0x00a5
            L_0x008d:
                d.a.a.a.y0.b.k r0 = r1.getContainingDeclaration()
                boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
                if (r1 == 0) goto L_0x009c
                d.a.a.a.y0.b.e r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r0
                java.lang.Class r0 = p298d.p299a.p300a.p301a.C5970v0.m10815j(r0)
                goto L_0x00b1
            L_0x009c:
                d.a.a.a.c0 r0 = r8.f11684g
                d.a.a.a.n r0 = r0.f11669l
                java.lang.Class r0 = r0.mo22949n()
                goto L_0x00b1
            L_0x00a5:
                d.a.a.a.c0 r0 = r8.f11684g
                d.a.a.a.n r0 = r0.f11669l
                java.lang.Class r0 = r0.mo22949n()
                java.lang.Class r0 = r0.getEnclosingClass()
            L_0x00b1:
                if (r0 == 0) goto L_0x00d4
                java.lang.String r1 = r3.f13001a     // Catch:{ NoSuchFieldException -> 0x00d4 }
                java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x00d4 }
                goto L_0x00d4
            L_0x00ba:
                p005b.p291q.p292a.C5266a.m9923b(r7)
                throw r2
            L_0x00be:
                p005b.p291q.p292a.C5266a.m9923b(r4)
                throw r2
            L_0x00c2:
                boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.C5907f.C5908a
                if (r1 == 0) goto L_0x00cb
                d.a.a.a.f$a r0 = (p298d.p299a.p300a.p301a.C5907f.C5908a) r0
                java.lang.reflect.Field r2 = r0.f11698a
                goto L_0x00d4
            L_0x00cb:
                boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.C5907f.C5909b
                if (r1 == 0) goto L_0x00d0
                goto L_0x00d4
            L_0x00d0:
                boolean r0 = r0 instanceof p298d.p299a.p300a.p301a.C5907f.C5911d
                if (r0 == 0) goto L_0x00d5
            L_0x00d4:
                return r2
            L_0x00d5:
                d.h r0 = new d.h
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5885c0.C5894e.invoke():java.lang.Object");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5885c0(p298d.p299a.p300a.p301a.C5934n r8, p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)
            java.lang.String r0 = "descriptor"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            d.a.a.a.y0.f.d r0 = r9.getName()
            java.lang.String r3 = r0.mo23886e()
            java.lang.String r0 = "descriptor.name.asString()"
            p298d.p344x.p346c.C6888i.m12437d(r3, r0)
            d.a.a.a.t0 r0 = p298d.p299a.p300a.p301a.C5956t0.f11773b
            d.a.a.a.f r0 = p298d.p299a.p300a.p301a.C5956t0.m10790c(r9)
            java.lang.String r4 = r0.mo23005a()
            d.x.c.b$a r6 = p298d.p344x.p346c.C6879b.C6880a.f13787g
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5885c0.<init>(d.a.a.a.n, d.a.a.a.y0.b.k0):void");
    }

    public C5885c0(C5934n nVar, String str, String str2, C6207k0 k0Var, Object obj) {
        this.f11669l = nVar;
        this.f11670m = str;
        this.f11671n = str2;
        this.f11672o = obj;
        C5941o0<Field> V2 = C5266a.m9895V2(new C5894e(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this.f11667j = V2;
        C5939n0<C6207k0> W2 = C5266a.m9900W2(k0Var, new C5893d(this));
        C6888i.m12437d(W2, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this.f11668k = W2;
    }

    /* renamed from: A */
    public final Field mo22993A() {
        if (mo22976x().mo23213H()) {
            return mo22995D();
        }
        return null;
    }

    /* renamed from: B */
    public C6207k0 mo22976x() {
        C6207k0 invoke = this.f11668k.invoke();
        C6888i.m12437d(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: C */
    public abstract C5887b<V> mo22959C();

    /* renamed from: D */
    public final Field mo22995D() {
        return this.f11667j.invoke();
    }

    public boolean equals(Object obj) {
        C5885c0<?> c = C5970v0.m10808c(obj);
        if (c == null || !C6888i.m12434a(this.f11669l, c.f11669l) || !C6888i.m12434a(this.f11670m, c.f11670m) || !C6888i.m12434a(this.f11671n, c.f11671n) || !C6888i.m12434a(this.f11672o, c.f11672o)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.f11670m;
    }

    public int hashCode() {
        int hashCode = this.f11670m.hashCode();
        return this.f11671n.hashCode() + ((hashCode + (this.f11669l.hashCode() * 31)) * 31);
    }

    public String toString() {
        C5949r0 r0Var = C5949r0.f11765b;
        return C5949r0.m10780d(mo22976x());
    }

    /* renamed from: u */
    public C5986h<?> mo22973u() {
        return mo22959C().mo22973u();
    }

    /* renamed from: v */
    public C5934n mo22974v() {
        return this.f11669l;
    }

    /* renamed from: w */
    public C5986h<?> mo22975w() {
        Objects.requireNonNull(mo22959C());
        return null;
    }

    /* renamed from: z */
    public boolean mo22977z() {
        Object obj = this.f11672o;
        int i = C6879b.f13780m;
        return !C6888i.m12434a(obj, C6879b.C6880a.f13787g);
    }
}
