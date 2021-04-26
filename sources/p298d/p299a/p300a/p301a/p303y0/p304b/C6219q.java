package p298d.p299a.p300a.p301a.p303y0.p304b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6036d1;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6115k0;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7295d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7297f;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p411m.C7602j;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.q */
public class C6219q {

    /* renamed from: a */
    public static final C6233r f12241a;

    /* renamed from: b */
    public static final C6233r f12242b;

    /* renamed from: c */
    public static final C6233r f12243c;

    /* renamed from: d */
    public static final C6233r f12244d;

    /* renamed from: e */
    public static final C6233r f12245e;

    /* renamed from: f */
    public static final C6233r f12246f;

    /* renamed from: g */
    public static final C6233r f12247g;

    /* renamed from: h */
    public static final C6233r f12248h;

    /* renamed from: i */
    public static final C6233r f12249i;

    /* renamed from: j */
    public static final Map<C6233r, Integer> f12250j;

    /* renamed from: k */
    public static final C6233r f12251k;

    /* renamed from: l */
    public static final C7295d f12252l = new C6220a();

    /* renamed from: m */
    public static final C7295d f12253m = new C6221b();
    @Deprecated

    /* renamed from: n */
    public static final C7295d f12254n = new C6222c();

    /* renamed from: o */
    public static final C7602j f12255o;

    /* renamed from: p */
    public static final Map<C6050e1, C6233r> f12256p = new HashMap();

    /* renamed from: d.a.a.a.y0.b.q$a */
    public static class C6220a implements C7295d {
        /* renamed from: a */
        public C7452c0 mo23429a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$b */
    public static class C6221b implements C7295d {
        /* renamed from: a */
        public C7452c0 mo23429a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$c */
    public static class C6222c implements C7295d {
        /* renamed from: a */
        public C7452c0 mo23429a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$d */
    public static class C6223d extends C6217p {
        public C6223d(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11200e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            C6206k kVar2;
            if (oVar == null) {
                m11200e(1);
                throw null;
            } else if (kVar != null) {
                if (C7193g.m13045y(oVar)) {
                    if (kVar != null) {
                        if (C7193g.m13026f(kVar) != C6237s0.f12258a) {
                            return C6219q.m11192d(oVar, kVar);
                        }
                    } else {
                        m11200e(0);
                        throw null;
                    }
                }
                if (oVar instanceof C6157j) {
                    C6152i containingDeclaration = ((C6157j) oVar).getContainingDeclaration();
                    if (C7193g.m13042v(containingDeclaration) && C7193g.m13045y(containingDeclaration) && (kVar instanceof C6157j) && C7193g.m13045y(kVar.getContainingDeclaration()) && C6219q.m11192d(oVar, kVar)) {
                        return true;
                    }
                }
                C6206k kVar3 = oVar;
                while (kVar3 != null) {
                    C6206k containingDeclaration2 = kVar3.getContainingDeclaration();
                    if ((containingDeclaration2 instanceof C6046e) && !C7193g.m13036p(containingDeclaration2)) {
                        kVar2 = containingDeclaration2;
                        break;
                    }
                    boolean z = containingDeclaration2 instanceof C6032c0;
                    kVar3 = containingDeclaration2;
                    if (z) {
                        kVar2 = containingDeclaration2;
                        break;
                    }
                }
                kVar2 = kVar3;
                if (kVar2 == null) {
                    return false;
                }
                while (kVar != null) {
                    if (kVar2 == kVar) {
                        return true;
                    }
                    if (!(kVar instanceof C6032c0)) {
                        kVar = kVar.getContainingDeclaration();
                    } else if (!(kVar2 instanceof C6032c0) || !((C6032c0) kVar2).getFqName().equals(((C6032c0) kVar).getFqName()) || !C7193g.m13024d(kVar).equals(C7193g.m13024d(kVar2))) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            } else {
                m11200e(2);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$e */
    public static class C6224e extends C6217p {
        public C6224e(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11202e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            C6206k j;
            if (oVar == null) {
                m11202e(0);
                throw null;
            } else if (kVar != null) {
                if (C6219q.f12241a.mo23430c(dVar, oVar, kVar)) {
                    if (dVar == C6219q.f12253m) {
                        return true;
                    }
                    if (!(dVar == C6219q.f12252l || (j = C7193g.m13030j(oVar, C6046e.class)) == null || !(dVar instanceof C7297f))) {
                        return ((C7297f) dVar).mo24923e().getOriginal().equals(j.getOriginal());
                    }
                }
                return false;
            } else {
                m11202e(1);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$f */
    public static class C6225f extends C6217p {
        public C6225f(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11204e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
            if (p005b.p291q.p292a.C5266a.m10034t2(r0) == false) goto L_0x007c;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo23430c(p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7295d r7, p298d.p299a.p300a.p301a.p303y0.p304b.C6214o r8, p298d.p299a.p300a.p301a.p303y0.p304b.C6206k r9) {
            /*
                r6 = this;
                java.lang.Class<d.a.a.a.y0.b.e> r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6046e.class
                r1 = 0
                r2 = 0
                if (r8 == 0) goto L_0x0091
                r3 = 1
                if (r9 == 0) goto L_0x008d
                d.a.a.a.y0.b.k r4 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13030j(r8, r0)
                d.a.a.a.y0.b.e r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r4
                d.a.a.a.y0.b.k r9 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13031k(r9, r0, r2)
                d.a.a.a.y0.b.e r9 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r9
                if (r9 != 0) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 == 0) goto L_0x002f
                boolean r5 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13036p(r4)
                if (r5 == 0) goto L_0x002f
                d.a.a.a.y0.b.k r4 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13030j(r4, r0)
                d.a.a.a.y0.b.e r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r4
                if (r4 == 0) goto L_0x002f
                boolean r4 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13043w(r9, r4)
                if (r4 == 0) goto L_0x002f
                return r3
            L_0x002f:
                d.a.a.a.y0.b.o r4 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13020A(r8)
                d.a.a.a.y0.b.k r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13030j(r4, r0)
                d.a.a.a.y0.b.e r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r0
                if (r0 != 0) goto L_0x003c
                return r2
            L_0x003c:
                boolean r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13043w(r9, r0)
                if (r0 == 0) goto L_0x0084
                if (r4 == 0) goto L_0x007f
                d.a.a.a.y0.i.z.n.d r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12254n
                if (r7 != r0) goto L_0x0049
                goto L_0x007c
            L_0x0049:
                boolean r0 = r4 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6023b
                if (r0 != 0) goto L_0x004e
                goto L_0x007b
            L_0x004e:
                boolean r0 = r4 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6157j
                if (r0 == 0) goto L_0x0053
                goto L_0x007b
            L_0x0053:
                d.a.a.a.y0.i.z.n.d r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12253m
                if (r7 != r0) goto L_0x0058
                goto L_0x007b
            L_0x0058:
                d.a.a.a.y0.i.z.n.d r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12252l
                if (r7 == r0) goto L_0x007c
                if (r7 != 0) goto L_0x005f
                goto L_0x007c
            L_0x005f:
                boolean r0 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7296e
                if (r0 == 0) goto L_0x006b
                r0 = r7
                d.a.a.a.y0.i.z.n.e r0 = (p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7296e) r0
                d.a.a.a.y0.l.c0 r0 = r0.mo24927b()
                goto L_0x006f
            L_0x006b:
                d.a.a.a.y0.l.c0 r0 = r7.mo23429a()
            L_0x006f:
                boolean r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13044x(r0, r9)
                if (r1 != 0) goto L_0x007b
                boolean r0 = p005b.p291q.p292a.C5266a.m10034t2(r0)
                if (r0 == 0) goto L_0x007c
            L_0x007b:
                r2 = r3
            L_0x007c:
                if (r2 == 0) goto L_0x0084
                return r3
            L_0x007f:
                r7 = 2
                m11204e(r7)
                throw r1
            L_0x0084:
                d.a.a.a.y0.b.k r9 = r9.getContainingDeclaration()
                boolean r7 = r6.mo23430c(r7, r8, r9)
                return r7
            L_0x008d:
                m11204e(r3)
                throw r1
            L_0x0091:
                m11204e(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.C6225f.mo23430c(d.a.a.a.y0.i.z.n.d, d.a.a.a.y0.b.o, d.a.a.a.y0.b.k):boolean");
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$g */
    public static class C6226g extends C6217p {
        public C6226g(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11206e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11206e(0);
                throw null;
            } else if (kVar != null) {
                if (!C7193g.m13024d(kVar).mo23092k(C7193g.m13024d(oVar))) {
                    return false;
                }
                return C6219q.f12255o.mo25199a(oVar, kVar);
            } else {
                m11206e(1);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$h */
    public static class C6227h extends C6217p {
        public C6227h(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11208e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11208e(0);
                throw null;
            } else if (kVar != null) {
                return true;
            } else {
                m11208e(1);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$i */
    public static class C6228i extends C6217p {
        public C6228i(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11210e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11210e(0);
                throw null;
            } else if (kVar == null) {
                m11210e(1);
                throw null;
            } else {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$j */
    public static class C6229j extends C6217p {
        public C6229j(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11212e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11212e(0);
                throw null;
            } else if (kVar == null) {
                m11212e(1);
                throw null;
            } else {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$k */
    public static class C6230k extends C6217p {
        public C6230k(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11214e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11214e(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                m11214e(1);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.b.q$l */
    public static class C6231l extends C6217p {
        public C6231l(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11216e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11216e(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                m11216e(1);
                throw null;
            }
        }
    }

    static {
        Class<C7602j> cls = C7602j.class;
        C6223d dVar = new C6223d(C6036d1.C6041e.f11883c);
        f12241a = dVar;
        C6224e eVar = new C6224e(C6036d1.C6042f.f11884c);
        f12242b = eVar;
        C6225f fVar = new C6225f(C6036d1.C6043g.f11885c);
        f12243c = fVar;
        C6226g gVar = new C6226g(C6036d1.C6038b.f11880c);
        f12244d = gVar;
        C6227h hVar = new C6227h(C6036d1.C6044h.f11886c);
        f12245e = hVar;
        C6228i iVar = new C6228i(C6036d1.C6040d.f11882c);
        f12246f = iVar;
        C6229j jVar = new C6229j(C6036d1.C6037a.f11879c);
        f12247g = jVar;
        C6230k kVar = new C6230k(C6036d1.C6039c.f11881c);
        f12248h = kVar;
        C6231l lVar = new C6231l(C6036d1.C6045i.f11887c);
        f12249i = lVar;
        Collections.unmodifiableSet(C6790h.m12327N(dVar, eVar, gVar, iVar));
        HashMap m3 = C5266a.m9993m3(4);
        m3.put(eVar, 0);
        m3.put(dVar, 0);
        m3.put(gVar, 1);
        m3.put(fVar, 1);
        m3.put(hVar, 2);
        f12250j = Collections.unmodifiableMap(m3);
        f12251k = hVar;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        f12255o = it.hasNext() ? (C7602j) it.next() : C7602j.C7603a.f15054a;
        m11195g(dVar);
        m11195g(eVar);
        m11195g(fVar);
        m11195g(gVar);
        m11195g(hVar);
        m11195g(iVar);
        m11195g(jVar);
        m11195g(kVar);
        m11195g(lVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m11189a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 16 ? 3 : 2)];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 16 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static Integer m11190b(C6233r rVar, C6233r rVar2) {
        if (rVar == null) {
            m11189a(12);
            throw null;
        } else if (rVar2 != null) {
            C6888i.m12438e(rVar2, "visibility");
            Integer a = rVar.mo23426a().mo23158a(rVar2.mo23426a());
            if (a != null) {
                return a;
            }
            C6888i.m12438e(rVar, "visibility");
            Integer a2 = rVar2.mo23426a().mo23158a(rVar.mo23426a());
            if (a2 != null) {
                return Integer.valueOf(-a2.intValue());
            }
            return null;
        } else {
            m11189a(13);
            throw null;
        }
    }

    /* renamed from: c */
    public static C6214o m11191c(C7295d dVar, C6214o oVar, C6206k kVar) {
        C6214o c;
        if (oVar == null) {
            m11189a(8);
            throw null;
        } else if (kVar != null) {
            C6206k original = oVar.getOriginal();
            while (true) {
                C6214o oVar2 = (C6214o) original;
                if (oVar2 != null && oVar2.getVisibility() != f12246f) {
                    if (!oVar2.getVisibility().mo23430c(dVar, oVar2, kVar)) {
                        return oVar2;
                    }
                    original = C7193g.m13030j(oVar2, C6214o.class);
                }
            }
            if (!(oVar instanceof C6115k0) || (c = m11191c(dVar, ((C6115k0) oVar).mo23259w(), kVar)) == null) {
                return null;
            }
            return c;
        } else {
            m11189a(9);
            throw null;
        }
    }

    /* renamed from: d */
    public static boolean m11192d(C6206k kVar, C6206k kVar2) {
        if (kVar != null) {
            C6237s0 f = C7193g.m13026f(kVar2);
            if (f != C6237s0.f12258a) {
                return f.equals(C7193g.m13026f(kVar));
            }
            return false;
        }
        m11189a(6);
        throw null;
    }

    /* renamed from: e */
    public static boolean m11193e(C6233r rVar) {
        if (rVar != null) {
            return rVar == f12241a || rVar == f12242b;
        }
        m11189a(14);
        throw null;
    }

    /* renamed from: f */
    public static boolean m11194f(C6214o oVar, C6206k kVar) {
        if (kVar != null) {
            return m11191c(f12253m, oVar, kVar) == null;
        }
        m11189a(3);
        throw null;
    }

    /* renamed from: g */
    public static void m11195g(C6233r rVar) {
        f12256p.put(((C6217p) rVar).f12239a, rVar);
    }

    /* renamed from: h */
    public static C6233r m11196h(C6050e1 e1Var) {
        if (e1Var != null) {
            C6233r rVar = f12256p.get(e1Var);
            if (rVar != null) {
                return rVar;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + e1Var);
        }
        m11189a(15);
        throw null;
    }
}
