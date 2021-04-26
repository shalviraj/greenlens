package p298d.p299a.p300a.p301a.p303y0.p391i;

import java.util.Collection;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6073g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6212n;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6214o;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6237s0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6719f;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;

/* renamed from: d.a.a.a.y0.i.g */
public class C7193g {

    /* renamed from: a */
    public static final /* synthetic */ int f14418a = 0;

    static {
        new C6714b("kotlin.jvm.JvmName");
    }

    /* renamed from: A */
    public static <D extends C6214o> D m13020A(D d) {
        if (d == null) {
            m13021a(59);
            throw null;
        } else if (d instanceof C6023b) {
            return m13046z((C6023b) d);
        } else {
            if (d != null) {
                return d;
            }
            m13021a(60);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13021a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 32:
            case 33:
            case 34:
            case 55:
            case 56:
            case 57:
            case 59:
            case 77:
            case 90:
            case 92:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 14:
                objArr[0] = "first";
                break;
            case 15:
                objArr[0] = "second";
                break;
            case 16:
            case 17:
                objArr[0] = "aClass";
                break;
            case 18:
                objArr[0] = "kotlinType";
                break;
            case 23:
                objArr[0] = "declarationDescriptor";
                break;
            case 24:
            case 26:
                objArr[0] = "subClass";
                break;
            case 25:
            case 27:
            case 31:
                objArr[0] = "superClass";
                break;
            case 28:
            case 30:
            case 43:
            case 62:
                objArr[0] = "type";
                break;
            case 29:
                objArr[0] = "other";
                break;
            case 35:
                objArr[0] = "classKind";
                break;
            case 36:
            case 37:
            case 39:
            case 42:
            case 46:
            case 52:
            case 63:
            case 64:
            case 65:
            case 72:
            case 73:
                objArr[0] = "classDescriptor";
                break;
            case 44:
                objArr[0] = "typeConstructor";
                break;
            case 53:
                objArr[0] = "innerClassName";
                break;
            case 54:
                objArr[0] = "location";
                break;
            case 61:
                objArr[0] = "variable";
                break;
            case 66:
                objArr[0] = "f";
                break;
            case 68:
                objArr[0] = "current";
                break;
            case 69:
                objArr[0] = "result";
                break;
            case 70:
                objArr[0] = "memberDescriptor";
                break;
            case 74:
            case 75:
            case 76:
                objArr[0] = "annotated";
                break;
            case 80:
            case 82:
            case 85:
            case 87:
                objArr[0] = "scope";
                break;
            case 83:
            case 86:
            case 88:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 20:
                objArr[1] = "getContainingModule";
                break;
            case 38:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 40:
            case 41:
                objArr[1] = "getSuperClassType";
                break;
            case 45:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 58:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 67:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 78:
            case 79:
                objArr[1] = "getContainingSourceFile";
                break;
            case 81:
                objArr[1] = "getAllDescriptors";
                break;
            case 84:
                objArr[1] = "getFunctionByName";
                break;
            case 89:
                objArr[1] = "getPropertyByName";
                break;
            case 91:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "isExtension";
                break;
            case 12:
                objArr[2] = "isOverride";
                break;
            case 13:
                objArr[2] = "isStaticDeclaration";
                break;
            case 14:
            case 15:
                objArr[2] = "areInSameModule";
                break;
            case 16:
            case 17:
                objArr[2] = "getParentOfType";
                break;
            case 18:
            case 21:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 19:
                objArr[2] = "getContainingModule";
                break;
            case 22:
                objArr[2] = "getContainingClass";
                break;
            case 23:
                objArr[2] = "isAncestor";
                break;
            case 24:
            case 25:
                objArr[2] = "isDirectSubclass";
                break;
            case 26:
            case 27:
                objArr[2] = "isSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSameClass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 32:
                objArr[2] = "isAnonymousObject";
                break;
            case 33:
                objArr[2] = "isAnonymousFunction";
                break;
            case 34:
                objArr[2] = "isEnumEntry";
                break;
            case 35:
                objArr[2] = "isKindOf";
                break;
            case 36:
                objArr[2] = "hasAbstractMembers";
                break;
            case 37:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 39:
                objArr[2] = "getSuperClassType";
                break;
            case 42:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 43:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 44:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 46:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 52:
            case 53:
            case 54:
                objArr[2] = "getInnerClassByName";
                break;
            case 55:
                objArr[2] = "isStaticNestedClass";
                break;
            case 56:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 57:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 61:
            case 62:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 63:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 64:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 65:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 66:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 68:
            case 69:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 72:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 73:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 74:
                objArr[2] = "getJvmName";
                break;
            case 75:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 76:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 77:
                objArr[2] = "getContainingSourceFile";
                break;
            case 80:
                objArr[2] = "getAllDescriptors";
                break;
            case 82:
            case 83:
                objArr[2] = "getFunctionByName";
                break;
            case 85:
            case 86:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 87:
            case 88:
                objArr[2] = "getPropertyByName";
                break;
            case 90:
                objArr[2] = "getDirectMember";
                break;
            case 92:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public static <D extends C6019a> void m13022b(D d, Set<D> set) {
        if (d == null) {
            m13021a(68);
            throw null;
        } else if (!set.contains(d)) {
            for (C6019a original : d.getOriginal().getOverriddenDescriptors()) {
                C6019a original2 = original.getOriginal();
                m13022b(original2, set);
                set.add(original2);
            }
        }
    }

    /* renamed from: c */
    public static C6046e m13023c(C7452c0 c0Var) {
        if (c0Var != null) {
            C7567t0 V = c0Var.mo24887V();
            if (V != null) {
                C6046e eVar = (C6046e) V.getDeclarationDescriptor();
                if (eVar != null) {
                    return eVar;
                }
                m13021a(45);
                throw null;
            }
            m13021a(44);
            throw null;
        }
        m13021a(43);
        throw null;
    }

    /* renamed from: d */
    public static C6021a0 m13024d(C6206k kVar) {
        if (kVar != null) {
            C6021a0 e = m13025e(kVar);
            if (e != null) {
                return e;
            }
            m13021a(20);
            throw null;
        }
        m13021a(19);
        throw null;
    }

    /* renamed from: e */
    public static C6021a0 m13025e(C6206k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof C6021a0) {
                    return (C6021a0) kVar;
                }
                if (kVar instanceof C6073g0) {
                    return ((C6073g0) kVar).mo23179F();
                }
                kVar = kVar.getContainingDeclaration();
            }
            return null;
        }
        m13021a(21);
        throw null;
    }

    /* renamed from: f */
    public static C6237s0 m13026f(C6206k kVar) {
        if (kVar != null) {
            if (kVar instanceof C6211m0) {
                kVar = ((C6211m0) kVar).mo23200I();
            }
            if (!(kVar instanceof C6212n)) {
                return C6237s0.f12258a;
            }
            C6237s0 a = ((C6212n) kVar).getSource().mo23318a();
            if (a != null) {
                return a;
            }
            m13021a(78);
            throw null;
        }
        m13021a(77);
        throw null;
    }

    /* renamed from: g */
    public static C6715c m13027g(C6206k kVar) {
        if (kVar != null) {
            C6714b h = m13028h(kVar);
            return h != null ? h.mo23872j() : m13029i(kVar);
        }
        m13021a(2);
        throw null;
    }

    /* renamed from: h */
    public static C6714b m13028h(C6206k kVar) {
        if (kVar == null) {
            m13021a(5);
            throw null;
        } else if ((kVar instanceof C6021a0) || C7570v.m13789j(kVar)) {
            return C6714b.f13613c;
        } else {
            if (kVar instanceof C6073g0) {
                return ((C6073g0) kVar).getFqName();
            }
            if (kVar instanceof C6032c0) {
                return ((C6032c0) kVar).getFqName();
            }
            return null;
        }
    }

    /* renamed from: i */
    public static C6715c m13029i(C6206k kVar) {
        return m13027g(kVar.getContainingDeclaration()).mo23875c(kVar.getName());
    }

    /* renamed from: j */
    public static <D extends C6206k> D m13030j(C6206k kVar, Class<D> cls) {
        return m13031k(kVar, cls, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        if (r3 != false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r1 = r1.getContainingDeclaration();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r1 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2.isInstance(r1) == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return r1;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <D extends p298d.p299a.p300a.p301a.p303y0.p304b.C6206k> D m13031k(D r1, java.lang.Class<D> r2, boolean r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0016
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            if (r3 == 0) goto L_0x000c
        L_0x0008:
            d.a.a.a.y0.b.k r1 = r1.getContainingDeclaration()
        L_0x000c:
            if (r1 == 0) goto L_0x0015
            boolean r3 = r2.isInstance(r1)
            if (r3 == 0) goto L_0x0008
            return r1
        L_0x0015:
            return r0
        L_0x0016:
            r1 = 17
            m13021a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13031k(d.a.a.a.y0.b.k, java.lang.Class, boolean):d.a.a.a.y0.b.k");
    }

    /* renamed from: l */
    public static C6046e m13032l(C6046e eVar) {
        if (eVar != null) {
            for (C7452c0 c : eVar.getTypeConstructor().getSupertypes()) {
                C6046e c2 = m13023c(c);
                if (c2.getKind() != C6051f.INTERFACE) {
                    return c2;
                }
            }
            return null;
        }
        m13021a(42);
        throw null;
    }

    /* renamed from: m */
    public static boolean m13033m(C6206k kVar) {
        return m13039s(kVar, C6051f.ANNOTATION_CLASS);
    }

    /* renamed from: n */
    public static boolean m13034n(C6206k kVar) {
        if (kVar != null) {
            return m13039s(kVar, C6051f.CLASS) && kVar.getName().equals(C6719f.f13626a);
        }
        m13021a(32);
        throw null;
    }

    /* renamed from: o */
    public static boolean m13035o(C6206k kVar) {
        return m13039s(kVar, C6051f.CLASS) || m13037q(kVar);
    }

    /* renamed from: p */
    public static boolean m13036p(C6206k kVar) {
        return m13039s(kVar, C6051f.OBJECT) && ((C6046e) kVar).isCompanionObject();
    }

    /* renamed from: q */
    public static boolean m13037q(C6206k kVar) {
        return m13039s(kVar, C6051f.ENUM_CLASS);
    }

    /* renamed from: r */
    public static boolean m13038r(C6206k kVar) {
        if (kVar != null) {
            return m13039s(kVar, C6051f.ENUM_ENTRY);
        }
        m13021a(34);
        throw null;
    }

    /* renamed from: s */
    public static boolean m13039s(C6206k kVar, C6051f fVar) {
        return (kVar instanceof C6046e) && ((C6046e) kVar).getKind() == fVar;
    }

    /* renamed from: t */
    public static boolean m13040t(C6206k kVar) {
        if (kVar != null) {
            while (true) {
                boolean z = false;
                if (kVar == null) {
                    return false;
                }
                if (m13034n(kVar)) {
                    break;
                }
                if ((kVar instanceof C6214o) && ((C6214o) kVar).getVisibility() == C6219q.f12246f) {
                    z = true;
                }
                if (z) {
                    break;
                }
                kVar = kVar.getContainingDeclaration();
            }
            return true;
        }
        m13021a(1);
        throw null;
    }

    /* renamed from: u */
    public static boolean m13041u(C7452c0 c0Var, C6206k kVar) {
        if (c0Var == null) {
            m13021a(28);
            throw null;
        } else if (kVar != null) {
            C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
            if (declarationDescriptor == null) {
                return false;
            }
            C6206k original = declarationDescriptor.getOriginal();
            return (original instanceof C6083h) && (kVar instanceof C6083h) && ((C6083h) kVar).getTypeConstructor().equals(((C6083h) original).getTypeConstructor());
        } else {
            m13021a(29);
            throw null;
        }
    }

    /* renamed from: v */
    public static boolean m13042v(C6206k kVar) {
        return (m13039s(kVar, C6051f.CLASS) || m13039s(kVar, C6051f.INTERFACE)) && ((C6046e) kVar).getModality() == C6251y.SEALED;
    }

    /* renamed from: w */
    public static boolean m13043w(C6046e eVar, C6046e eVar2) {
        return m13044x(eVar.getDefaultType(), eVar2.getOriginal());
    }

    /* renamed from: x */
    public static boolean m13044x(C7452c0 c0Var, C6206k kVar) {
        if (c0Var == null) {
            m13021a(30);
            throw null;
        } else if (kVar == null) {
            m13021a(31);
            throw null;
        } else if (m13041u(c0Var, kVar)) {
            return true;
        } else {
            for (C7452c0 x : c0Var.mo24887V().getSupertypes()) {
                if (m13044x(x, kVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: y */
    public static boolean m13045y(C6206k kVar) {
        return kVar != null && (kVar.getContainingDeclaration() instanceof C6032c0);
    }

    /* renamed from: z */
    public static <D extends C6023b> D m13046z(D d) {
        if (d != null) {
            while (d.getKind() == C6023b.C6024a.FAKE_OVERRIDE) {
                Collection overriddenDescriptors = d.getOverriddenDescriptors();
                if (!overriddenDescriptors.isEmpty()) {
                    d = (C6023b) overriddenDescriptors.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
                }
            }
            return d;
        }
        m13021a(57);
        throw null;
    }
}
