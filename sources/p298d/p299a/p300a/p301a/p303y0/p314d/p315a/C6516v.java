package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.HashMap;
import java.util.Map;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6050e1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6214o;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6217p;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.p308i1.C6154a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p308i1.C6155b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p308i1.C6156c;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7295d;

/* renamed from: d.a.a.a.y0.d.a.v */
public class C6516v {

    /* renamed from: a */
    public static final C6233r f12762a;

    /* renamed from: b */
    public static final C6233r f12763b;

    /* renamed from: c */
    public static final C6233r f12764c;

    /* renamed from: d */
    public static final Map<C6050e1, C6233r> f12765d = new HashMap();

    /* renamed from: d.a.a.a.y0.d.a.v$a */
    public static class C6517a extends C6217p {
        public C6517a(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11540e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11540e(0);
                throw null;
            } else if (kVar != null) {
                return C6516v.m11538c(oVar, kVar);
            } else {
                m11540e(1);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.v$b */
    public static class C6518b extends C6217p {
        public C6518b(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11542e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11542e(0);
                throw null;
            } else if (kVar != null) {
                return C6516v.m11537b(dVar, oVar, kVar);
            } else {
                m11542e(1);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.v$c */
    public static class C6519c extends C6217p {
        public C6519c(C6050e1 e1Var) {
            super(e1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m11544e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo23430c(C7295d dVar, C6214o oVar, C6206k kVar) {
            if (oVar == null) {
                m11544e(0);
                throw null;
            } else if (kVar != null) {
                return C6516v.m11537b(dVar, oVar, kVar);
            } else {
                m11544e(1);
                throw null;
            }
        }
    }

    static {
        C6517a aVar = new C6517a(C6154a.f12170c);
        f12762a = aVar;
        C6518b bVar = new C6518b(C6156c.f12172c);
        f12763b = bVar;
        C6519c cVar = new C6519c(C6155b.f12171c);
        f12764c = cVar;
        m11539d(aVar);
        m11539d(bVar);
        m11539d(cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m11536a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static boolean m11537b(C7295d dVar, C6214o oVar, C6206k kVar) {
        if (oVar == null) {
            m11536a(0);
            throw null;
        } else if (kVar == null) {
            m11536a(1);
            throw null;
        } else if (m11538c(C7193g.m13020A(oVar), kVar)) {
            return true;
        } else {
            return C6219q.f12243c.mo23430c(dVar, oVar, kVar);
        }
    }

    /* renamed from: c */
    public static boolean m11538c(C6206k kVar, C6206k kVar2) {
        Class<C6032c0> cls = C6032c0.class;
        if (kVar == null) {
            m11536a(2);
            throw null;
        } else if (kVar2 != null) {
            C6032c0 c0Var = (C6032c0) C7193g.m13031k(kVar, cls, false);
            C6032c0 c0Var2 = (C6032c0) C7193g.m13031k(kVar2, cls, false);
            return (c0Var2 == null || c0Var == null || !c0Var.getFqName().equals(c0Var2.getFqName())) ? false : true;
        } else {
            m11536a(3);
            throw null;
        }
    }

    /* renamed from: d */
    public static void m11539d(C6233r rVar) {
        f12765d.put(((C6217p) rVar).f12239a, rVar);
    }
}
