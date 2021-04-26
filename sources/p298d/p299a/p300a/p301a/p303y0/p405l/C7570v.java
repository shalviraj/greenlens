package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6073g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6208l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6254z;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6097e0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6114k;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p407k1.C7523a;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.v */
public class C7570v {

    /* renamed from: a */
    public static final C6021a0 f15018a = new C7571a();

    /* renamed from: b */
    public static final C7573c f15019b;

    /* renamed from: c */
    public static final C7489j0 f15020c = m13783d("<LOOP IN SUPERTYPES>");

    /* renamed from: d */
    public static final C7452c0 f15021d;

    /* renamed from: e */
    public static final C6207k0 f15022e;

    /* renamed from: f */
    public static final Set<C6207k0> f15023f;

    /* renamed from: d.a.a.a.y0.l.v$a */
    public static class C7571a implements C6021a0 {
        /* renamed from: x */
        public static /* synthetic */ void m13790x(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 13:
                case 14:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 11:
                    objArr[0] = "visitor";
                    break;
                case 12:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = "getSubPackagesOf";
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 13) {
                objArr[1] = "getOriginal";
            } else if (i != 14) {
                switch (i) {
                    case 8:
                        objArr[1] = "getAllDependencyModules";
                        break;
                    case 9:
                        objArr[1] = "getExpectedByModules";
                        break;
                    case 10:
                        objArr[1] = "getAllExpectedByModules";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                        break;
                }
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 13:
                case 14:
                    break;
                case 2:
                case 3:
                    objArr[2] = "getSubPackagesOf";
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 11:
                    objArr[2] = "accept";
                    break;
                case 12:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: C */
        public List<C6021a0> mo23087C() {
            return C6798p.f13713g;
        }

        /* renamed from: G */
        public C6073g0 mo23088G(C6714b bVar) {
            if (bVar == null) {
                m13790x(7);
                throw null;
            }
            throw new IllegalStateException("Should not be called!");
        }

        /* renamed from: R */
        public <T> T mo23089R(C6254z<T> zVar) {
            if (zVar != null) {
                return null;
            }
            m13790x(0);
            throw null;
        }

        public <R, D> R accept(C6210m<R, D> mVar, D d) {
            if (mVar != null) {
                return null;
            }
            m13790x(11);
            throw null;
        }

        public C6060h getAnnotations() {
            Objects.requireNonNull(C6060h.f11920d);
            C6060h hVar = C6060h.C6061a.f11922b;
            if (hVar != null) {
                return hVar;
            }
            m13790x(1);
            throw null;
        }

        public KotlinBuiltIns getBuiltIns() {
            DefaultBuiltIns instance = DefaultBuiltIns.getInstance();
            if (instance != null) {
                return instance;
            }
            m13790x(14);
            throw null;
        }

        public C6206k getContainingDeclaration() {
            return null;
        }

        public C6717d getName() {
            return C6717d.m12272p("<ERROR MODULE>");
        }

        public C6206k getOriginal() {
            return this;
        }

        public Collection<C6714b> getSubPackagesOf(C6714b bVar, C6862l<? super C6717d, Boolean> lVar) {
            if (bVar != null) {
                return C6798p.f13713g;
            }
            m13790x(2);
            throw null;
        }

        /* renamed from: k */
        public boolean mo23092k(C6021a0 a0Var) {
            if (a0Var != null) {
                return false;
            }
            m13790x(12);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.l.v$b */
    public static class C7572b implements C7567t0 {

        /* renamed from: a */
        public final /* synthetic */ C7573c f15024a;

        /* renamed from: b */
        public final /* synthetic */ String f15025b;

        public C7572b(C7573c cVar, String str) {
            this.f15024a = cVar;
            this.f15025b = str;
        }

        /* renamed from: b */
        public static /* synthetic */ void m13795b(int i) {
            String str = i != 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 3 ? 2 : 3)];
            if (i != 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else {
                objArr[0] = "kotlinTypeRefiner";
            }
            if (i == 1) {
                objArr[1] = "getSupertypes";
            } else if (i == 2) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else if (i != 4) {
                objArr[1] = "getParameters";
            } else {
                objArr[1] = "refine";
            }
            if (i == 3) {
                objArr[2] = "refine";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public KotlinBuiltIns getBuiltIns() {
            DefaultBuiltIns instance = DefaultBuiltIns.getInstance();
            if (instance != null) {
                return instance;
            }
            m13795b(2);
            throw null;
        }

        public C6083h getDeclarationDescriptor() {
            return this.f15024a;
        }

        public List<C6248w0> getParameters() {
            return C6798p.f13713g;
        }

        public Collection<C7452c0> getSupertypes() {
            return C6798p.f13713g;
        }

        public boolean isDenotable() {
            return false;
        }

        public C7567t0 refine(C7495e eVar) {
            if (eVar != null) {
                return this;
            }
            m13795b(3);
            throw null;
        }

        public String toString() {
            return this.f15025b;
        }
    }

    /* renamed from: d.a.a.a.y0.l.v$c */
    public static class C7573c extends C6114k {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 2 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 4:
                case 7:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                case 6:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            if (i == 2) {
                objArr[1] = "substitute";
            } else if (i == 5 || i == 8) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 5:
                case 8:
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C7573c(p298d.p299a.p300a.p301a.p303y0.p331f.C6717d r14) {
            /*
                r13 = this;
                d.a.a.a.y0.b.a0 r1 = p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.m13788i()
                d.a.a.a.y0.b.y r3 = p298d.p299a.p300a.p301a.p303y0.p304b.C6251y.OPEN
                d.a.a.a.y0.b.f r4 = p298d.p299a.p300a.p301a.p303y0.p304b.C6051f.CLASS
                java.util.List r5 = java.util.Collections.emptyList()
                d.a.a.a.y0.b.r0 r12 = p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0.f12257a
                r7 = 0
                d.a.a.a.y0.k.m r8 = p298d.p299a.p300a.p301a.p303y0.p404k.C7417e.f14830e
                r0 = r13
                r2 = r14
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                d.a.a.a.y0.b.f1.h$a r14 = p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h.f11920d
                java.util.Objects.requireNonNull(r14)
                d.a.a.a.y0.b.f1.h r9 = p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h.C6061a.f11922b
                r10 = 1
                if (r9 == 0) goto L_0x0056
                d.a.a.a.y0.b.h1.i r14 = new d.a.a.a.y0.b.h1.i
                r8 = 0
                d.a.a.a.y0.b.b$a r11 = p298d.p299a.p300a.p301a.p303y0.p304b.C6023b.C6024a.DECLARATION
                r6 = r14
                r7 = r13
                r6.<init>(r7, r8, r9, r10, r11, r12)
                java.util.List r0 = java.util.Collections.emptyList()
                d.a.a.a.y0.b.r r1 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12244d
                r14.mo23245D(r0, r1)
                d.a.a.a.y0.f.d r0 = r13.getName()
                java.lang.String r0 = r0.mo23886e()
                d.a.a.a.y0.i.z.h r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.m13781b(r0)
                d.a.a.a.y0.l.u r1 = new d.a.a.a.y0.l.u
                java.lang.String r2 = "<ERROR>"
                d.a.a.a.y0.l.t0 r2 = p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.m13785f(r2, r13)
                r1.<init>(r2, r0)
                r14.setReturnType(r1)
                java.util.Set r1 = java.util.Collections.singleton(r14)
                r13.mo23258x(r0, r1, r14)
                return
            L_0x0056:
                r14 = 5
                p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6110i.$$$reportNull$$$0(r14)
                r14 = 0
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.C7573c.<init>(d.a.a.a.y0.f.d):void");
        }

        public C7277h getMemberScope(C7586z0 z0Var, C7495e eVar) {
            if (z0Var == null) {
                $$$reportNull$$$0(6);
                throw null;
            } else if (eVar != null) {
                StringBuilder u = C0843a.m460u("Error scope for class ");
                u.append(getName());
                u.append(" with arguments: ");
                u.append(z0Var);
                return C7570v.m13781b(u.toString());
            } else {
                $$$reportNull$$$0(7);
                throw null;
            }
        }

        public C6046e substitute(C7448b1 b1Var) {
            if (b1Var != null) {
                return this;
            }
            $$$reportNull$$$0(1);
            throw null;
        }

        /* renamed from: substitute  reason: collision with other method in class */
        public C6208l m15022substitute(C7448b1 b1Var) {
            if (b1Var != null) {
                return this;
            }
            $$$reportNull$$$0(1);
            throw null;
        }

        public String toString() {
            return getName().mo23886e();
        }
    }

    /* renamed from: d.a.a.a.y0.l.v$d */
    public static class C7574d implements C7277h {

        /* renamed from: b */
        public final String f15026b;

        public C7574d(String str, C7571a aVar) {
            if (str != null) {
                this.f15026b = str;
            } else {
                m13796a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13796a(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = "location";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            if (i == 7) {
                objArr[1] = "getContributedVariables";
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = "getContributedFunctions";
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                        break;
                }
            } else {
                objArr[1] = "getContributedDescriptors";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public Set<C6717d> getClassifierNames() {
            Set<C6717d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m13796a(13);
            throw null;
        }

        public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13796a(1);
                throw null;
            } else if (bVar != null) {
                String e = dVar.mo23886e();
                if (e != null) {
                    return new C7573c(C6717d.m12272p("<ERROR CLASS: " + e + ">"));
                }
                C7570v.m13780a(1);
                throw null;
            } else {
                m13796a(2);
                throw null;
            }
        }

        public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
            if (dVar == null) {
                m13796a(16);
                throw null;
            } else if (lVar != null) {
                List emptyList = Collections.emptyList();
                if (emptyList != null) {
                    return emptyList;
                }
                m13796a(18);
                throw null;
            } else {
                m13796a(17);
                throw null;
            }
        }

        public Collection getContributedFunctions(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13796a(8);
                throw null;
            } else if (bVar != null) {
                C7523a aVar = new C7523a(C7570v.f15019b, this);
                aVar.initialize((C6213n0) null, (C6213n0) null, (List<? extends C6248w0>) Collections.emptyList(), (List<C6030b1>) Collections.emptyList(), (C7452c0) C7570v.m13783d("<ERROR FUNCTION RETURN TYPE>"), C6251y.OPEN, C6219q.f12245e);
                Set singleton = Collections.singleton(aVar);
                if (singleton != null) {
                    return singleton;
                }
                m13796a(10);
                throw null;
            } else {
                m13796a(9);
                throw null;
            }
        }

        public Collection getContributedVariables(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13796a(5);
                throw null;
            } else if (bVar != null) {
                Set<C6207k0> set = C7570v.f15023f;
                if (set != null) {
                    return set;
                }
                m13796a(7);
                throw null;
            } else {
                m13796a(6);
                throw null;
            }
        }

        public Set<C6717d> getFunctionNames() {
            Set<C6717d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m13796a(11);
            throw null;
        }

        public Set<C6717d> getVariableNames() {
            Set<C6717d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m13796a(12);
            throw null;
        }

        public void recordLookup(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13796a(14);
                throw null;
            } else if (bVar == null) {
                m13796a(15);
                throw null;
            }
        }

        public String toString() {
            return C0843a.m454o(C0843a.m460u("ErrorScope{"), this.f15026b, '}');
        }
    }

    /* renamed from: d.a.a.a.y0.l.v$e */
    public static class C7575e implements C7277h {

        /* renamed from: b */
        public final String f15027b;

        public C7575e(String str, C7571a aVar) {
            if (str != null) {
                this.f15027b = str;
            } else {
                m13797a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13797a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Set<C6717d> getClassifierNames() {
            throw new IllegalStateException();
        }

        public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13797a(1);
                throw null;
            } else if (bVar == null) {
                m13797a(2);
                throw null;
            } else {
                throw new IllegalStateException(this.f15027b + ", required name: " + dVar);
            }
        }

        public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
            if (dVar == null) {
                m13797a(9);
                throw null;
            } else if (lVar == null) {
                m13797a(10);
                throw null;
            } else {
                throw new IllegalStateException(this.f15027b);
            }
        }

        public Collection<? extends C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13797a(7);
                throw null;
            } else if (bVar == null) {
                m13797a(8);
                throw null;
            } else {
                throw new IllegalStateException(this.f15027b + ", required name: " + dVar);
            }
        }

        public Collection<? extends C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13797a(5);
                throw null;
            } else if (bVar == null) {
                m13797a(6);
                throw null;
            } else {
                throw new IllegalStateException(this.f15027b + ", required name: " + dVar);
            }
        }

        public Set<C6717d> getFunctionNames() {
            throw new IllegalStateException();
        }

        public Set<C6717d> getVariableNames() {
            throw new IllegalStateException();
        }

        public void recordLookup(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m13797a(11);
                throw null;
            } else if (bVar == null) {
                m13797a(12);
                throw null;
            } else {
                throw new IllegalStateException();
            }
        }

        public String toString() {
            return C0843a.m454o(C0843a.m460u("ThrowingScope{"), this.f15027b, '}');
        }
    }

    /* renamed from: d.a.a.a.y0.l.v$f */
    public static class C7576f implements C7567t0 {
        /* renamed from: b */
        public static /* synthetic */ void m13798b(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                    break;
                case 5:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                default:
                    objArr[0] = "descriptor";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 6) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "refine";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    break;
                case 5:
                    objArr[2] = "refine";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns f = C7255a.m13133f((C6206k) null);
            if (f != null) {
                return f;
            }
            m13798b(4);
            throw null;
        }

        public C6083h getDeclarationDescriptor() {
            throw null;
        }

        public List<C6248w0> getParameters() {
            throw null;
        }

        public Collection<C7452c0> getSupertypes() {
            throw null;
        }

        public boolean isDenotable() {
            throw null;
        }

        public C7567t0 refine(C7495e eVar) {
            if (eVar != null) {
                return this;
            }
            m13798b(5);
            throw null;
        }
    }

    static {
        C7573c cVar = new C7573c(C6717d.m12272p("<ERROR CLASS>"));
        f15019b = cVar;
        C7489j0 d = m13783d("<ERROR PROPERTY TYPE>");
        f15021d = d;
        Objects.requireNonNull(C6060h.f11920d);
        C6060h hVar = C6060h.C6061a.f11922b;
        C6251y yVar = C6251y.OPEN;
        C6233r rVar = C6219q.f12245e;
        C6717d p = C6717d.m12272p("<ERROR PROPERTY>");
        C6023b.C6024a aVar = C6023b.C6024a.DECLARATION;
        C6234r0 r0Var = C6234r0.f12257a;
        if (cVar == null) {
            C6097e0.$$$reportNull$$$0(7);
            throw null;
        } else if (hVar == null) {
            C6097e0.$$$reportNull$$$0(8);
            throw null;
        } else if (rVar != null) {
            C6097e0 e0Var = r1;
            C6097e0 e0Var2 = new C6097e0(cVar, (C6207k0) null, hVar, yVar, rVar, true, p, aVar, r0Var, false, false, false, false, false, false);
            C6097e0 e0Var3 = e0Var;
            e0Var3.mo23215V(d, Collections.emptyList(), (C6213n0) null, (C6213n0) null);
            f15022e = e0Var3;
            f15023f = Collections.singleton(e0Var3);
        } else {
            C6097e0.$$$reportNull$$$0(10);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13780a(int i) {
        String str = (i == 4 || i == 6 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 6 || i == 19) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 6 || i == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C7277h m13781b(String str) {
        if (str != null) {
            return m13782c(str, false);
        }
        m13780a(2);
        throw null;
    }

    /* renamed from: c */
    public static C7277h m13782c(String str, boolean z) {
        if (str != null) {
            return z ? new C7575e(str, (C7571a) null) : new C7574d(str, (C7571a) null);
        }
        m13780a(3);
        throw null;
    }

    /* renamed from: d */
    public static C7489j0 m13783d(String str) {
        if (str != null) {
            return m13786g(str, Collections.emptyList());
        }
        m13780a(7);
        throw null;
    }

    /* renamed from: e */
    public static C7567t0 m13784e(String str) {
        if (str != null) {
            return m13785f(C0843a.m452m("[ERROR : ", str, "]"), f15019b);
        }
        m13780a(15);
        throw null;
    }

    /* renamed from: f */
    public static C7567t0 m13785f(String str, C7573c cVar) {
        if (str == null) {
            m13780a(17);
            throw null;
        } else if (cVar != null) {
            return new C7572b(cVar, str);
        } else {
            m13780a(18);
            throw null;
        }
    }

    /* renamed from: g */
    public static C7489j0 m13786g(String str, List<C7580w0> list) {
        if (str == null) {
            m13780a(11);
            throw null;
        } else if (list != null) {
            C7567t0 e = m13784e(str);
            C7277h b = m13781b(str);
            C6888i.m12438e(e, "constructor");
            C6888i.m12438e(b, "memberScope");
            C6888i.m12438e(list, "arguments");
            return new C7568u(e, b, list, false, (String) null, 16);
        } else {
            m13780a(12);
            throw null;
        }
    }

    /* renamed from: h */
    public static C7489j0 m13787h(String str, C7567t0 t0Var) {
        if (str == null) {
            m13780a(9);
            throw null;
        } else if (t0Var != null) {
            return new C7568u(t0Var, m13781b(str));
        } else {
            m13780a(10);
            throw null;
        }
    }

    /* renamed from: i */
    public static C6021a0 m13788i() {
        C6021a0 a0Var = f15018a;
        if (a0Var != null) {
            return a0Var;
        }
        m13780a(19);
        throw null;
    }

    /* renamed from: j */
    public static boolean m13789j(C6206k kVar) {
        if (kVar == null) {
            return false;
        }
        if ((kVar instanceof C7573c) || (kVar.getContainingDeclaration() instanceof C7573c) || kVar == f15018a) {
            return true;
        }
        return false;
    }
}
