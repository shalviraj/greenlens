package p298d.p299a.p300a.p301a.p303y0.p405l;

import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6066k;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6069l;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7500i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p410n1.C7550b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p410n1.C7551c;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.b1 */
public class C7448b1 {

    /* renamed from: b */
    public static final C7448b1 f14862b = m13403e(C7586z0.f15038a);

    /* renamed from: a */
    public final C7586z0 f14863a;

    /* renamed from: d.a.a.a.y0.l.b1$a */
    public static final class C7449a extends Exception {
        public C7449a(String str) {
            super(str);
        }
    }

    /* renamed from: d.a.a.a.y0.l.b1$b */
    public enum C7450b {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public C7448b1(C7586z0 z0Var) {
        if (z0Var != null) {
            this.f14863a = z0Var;
        } else {
            m13399a(6);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13399a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 7 || i == 32 || i == 35)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            break;
                        default:
                            switch (i) {
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                    break;
                                default:
                                    switch (i) {
                                        case 38:
                                        case 39:
                                        case 40:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 7 || i == 32 || i == 35)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            break;
                        default:
                            switch (i) {
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                    break;
                                default:
                                    switch (i) {
                                        case 38:
                                        case 39:
                                        case 40:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
            case 10:
            case 11:
            case 12:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 35:
            case 38:
            case 39:
            case 40:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "substitutionContext";
                break;
            case 5:
                objArr[0] = BasePayload.CONTEXT_KEY;
                break;
            case 8:
            case 13:
                objArr[0] = "type";
                break;
            case 9:
            case 14:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 15:
            case 16:
            case 34:
                objArr[0] = "typeProjection";
                break;
            case 17:
            case 26:
                objArr[0] = "originalProjection";
                break;
            case 24:
                objArr[0] = "originalType";
                break;
            case 25:
                objArr[0] = "substituted";
                break;
            case 31:
                objArr[0] = "annotations";
                break;
            case 33:
            case 36:
                objArr[0] = "typeParameterVariance";
                break;
            case 37:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 7) {
            objArr[1] = "getSubstitution";
        } else if (i != 32) {
            if (i != 35) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i) {
                                            case 38:
                                            case 39:
                                            case 40:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i) {
            case 1:
            case 7:
            case 10:
            case 11:
            case 12:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 35:
            case 38:
            case 39:
            case 40:
                break;
            case 2:
            case 3:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 6:
                objArr[2] = "<init>";
                break;
            case 8:
            case 9:
                objArr[2] = "safeSubstitute";
                break;
            case 13:
            case 14:
            case 15:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 17:
                objArr[2] = "unsafeSubstitute";
                break;
            case 24:
            case 25:
            case 26:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 31:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 33:
            case 34:
            case 36:
            case 37:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 7 || i == 32 || i == 35)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            break;
                        default:
                            switch (i) {
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                    break;
                                default:
                                    switch (i) {
                                        case 38:
                                        case 39:
                                        case 40:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static C7484h1 m13400b(C7484h1 h1Var, C7484h1 h1Var2) {
        if (h1Var == null) {
            m13399a(36);
            throw null;
        } else if (h1Var2 != null) {
            C7484h1 h1Var3 = C7484h1.INVARIANT;
            if (h1Var == h1Var3) {
                if (h1Var2 != null) {
                    return h1Var2;
                }
                m13399a(38);
                throw null;
            } else if (h1Var2 == h1Var3) {
                if (h1Var != null) {
                    return h1Var;
                }
                m13399a(39);
                throw null;
            } else if (h1Var != h1Var2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + h1Var + "' and " + "projection kind '" + h1Var2 + "' cannot be combined");
            } else if (h1Var2 != null) {
                return h1Var2;
            } else {
                m13399a(40);
                throw null;
            }
        } else {
            m13399a(37);
            throw null;
        }
    }

    /* renamed from: c */
    public static C7450b m13401c(C7484h1 h1Var, C7484h1 h1Var2) {
        C7484h1 h1Var3 = C7484h1.OUT_VARIANCE;
        C7484h1 h1Var4 = C7484h1.IN_VARIANCE;
        return (h1Var == h1Var4 && h1Var2 == h1Var3) ? C7450b.OUT_IN_IN_POSITION : (h1Var == h1Var3 && h1Var2 == h1Var4) ? C7450b.IN_IN_OUT_POSITION : C7450b.NO_CONFLICT;
    }

    /* renamed from: d */
    public static C7448b1 m13402d(C7452c0 c0Var) {
        if (c0Var != null) {
            return m13403e(C7577v0.f15028b.mo25187b(c0Var.mo24887V(), c0Var.mo24886U()));
        }
        m13399a(5);
        throw null;
    }

    /* renamed from: e */
    public static C7448b1 m13403e(C7586z0 z0Var) {
        return new C7448b1(z0Var);
    }

    /* renamed from: f */
    public static C7448b1 m13404f(C7586z0 z0Var, C7586z0 z0Var2) {
        if (z0Var == null) {
            m13399a(2);
            throw null;
        } else if (z0Var2 != null) {
            C6888i.m12438e(z0Var, "first");
            C6888i.m12438e(z0Var2, "second");
            if (z0Var.mo23540f()) {
                z0Var = z0Var2;
            } else if (!z0Var2.mo23540f()) {
                z0Var = new C7563s(z0Var, z0Var2, (DefaultConstructorMarker) null);
            }
            return m13403e(z0Var);
        } else {
            m13399a(3);
            throw null;
        }
    }

    /* renamed from: j */
    public static String m13405j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C5266a.m9815H2(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* renamed from: g */
    public C7586z0 mo25050g() {
        C7586z0 z0Var = this.f14863a;
        if (z0Var != null) {
            return z0Var;
        }
        m13399a(7);
        throw null;
    }

    /* renamed from: h */
    public boolean mo25051h() {
        return this.f14863a.mo23540f();
    }

    /* renamed from: i */
    public C7452c0 mo25052i(C7452c0 c0Var, C7484h1 h1Var) {
        if (c0Var == null) {
            m13399a(8);
            throw null;
        } else if (mo25051h()) {
            return c0Var;
        } else {
            try {
                C7452c0 a = mo25055m(new C7584y0(h1Var, c0Var), (C6248w0) null, 0).mo25161a();
                if (a != null) {
                    return a;
                }
                m13399a(11);
                throw null;
            } catch (C7449a e) {
                return C7570v.m13783d(e.getMessage());
            }
        }
    }

    /* renamed from: k */
    public C7452c0 mo25053k(C7452c0 c0Var, C7484h1 h1Var) {
        C7584y0 y0Var;
        if (c0Var == null) {
            m13399a(13);
            throw null;
        } else if (h1Var != null) {
            C7580w0 l = mo25054l(new C7584y0(h1Var, mo25050g().mo25172g(c0Var, h1Var)));
            if (this.f14863a.mo25170a() || this.f14863a.mo24892b()) {
                boolean b = this.f14863a.mo24892b();
                if (l == null) {
                    l = null;
                } else if (!l.mo25163c()) {
                    C7452c0 a = l.mo25161a();
                    C6888i.m12437d(a, "typeProjection.type");
                    if (C7460d1.m13437c(a, C7550b.f14988g)) {
                        C7484h1 b2 = l.mo25162b();
                        C6888i.m12437d(b2, "typeProjection.projectionKind");
                        if (b2 == C7484h1.OUT_VARIANCE) {
                            y0Var = new C7584y0(b2, (C7452c0) C5266a.m10019r(a).f14987b);
                        } else if (b) {
                            y0Var = new C7584y0(b2, (C7452c0) C5266a.m10019r(a).f14986a);
                        } else {
                            C7448b1 e = m13403e(new C7551c());
                            C6888i.m12437d(e, "create(object : TypeConstructorSubstitution() {\n        override fun get(key: TypeConstructor): TypeProjection? {\n            val capturedTypeConstructor = key as? CapturedTypeConstructor ?: return null\n            if (capturedTypeConstructor.projection.isStarProjection) {\n                return TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.projection.type)\n            }\n            return capturedTypeConstructor.projection\n        }\n    })");
                            l = e.mo25054l(l);
                        }
                        l = y0Var;
                    }
                }
            }
            if (l == null) {
                return null;
            }
            return l.mo25161a();
        } else {
            m13399a(14);
            throw null;
        }
    }

    /* renamed from: l */
    public C7580w0 mo25054l(C7580w0 w0Var) {
        if (w0Var == null) {
            m13399a(16);
            throw null;
        } else if (mo25051h()) {
            return w0Var;
        } else {
            try {
                return mo25055m(w0Var, (C6248w0) null, 0);
            } catch (C7449a unused) {
                return null;
            }
        }
    }

    /* renamed from: m */
    public final C7580w0 mo25055m(C7580w0 w0Var, C6248w0 w0Var2, int i) {
        C7489j0 j0Var;
        C7448b1 b1Var;
        C6248w0 w0Var3 = w0Var2;
        int i2 = i;
        C7452c0 c0Var = null;
        if (w0Var != null) {
            C7586z0 z0Var = this.f14863a;
            if (i2 > 100) {
                StringBuilder u = C0843a.m460u("Recursion too deep. Most likely infinite loop while substituting ");
                u.append(m13405j(w0Var));
                u.append("; substitution: ");
                u.append(m13405j(z0Var));
                throw new IllegalStateException(u.toString());
            } else if (w0Var.mo25163c()) {
                return w0Var;
            } else {
                C7452c0 a = w0Var.mo25161a();
                if (a instanceof C7464e1) {
                    C7464e1 e1Var = (C7464e1) a;
                    C7481g1 O = e1Var.mo25070O();
                    C7452c0 z = e1Var.mo25071z();
                    C7580w0 m = mo25055m(new C7584y0(w0Var.mo25162b(), O), w0Var3, i2 + 1);
                    return new C7584y0(m.mo25162b(), C5266a.m9865P4(m.mo25161a().mo25056Y(), mo25053k(z, w0Var.mo25162b())));
                }
                if (!C5266a.m10034t2(a) && !(a.mo25056Y() instanceof C7486i0)) {
                    C7580w0 e = this.f14863a.mo23539e(a);
                    if (e == null) {
                        e = null;
                    } else if (a.getAnnotations().mo23169v(StandardNames.FqNames.unsafeVariance)) {
                        C7567t0 V = e.mo25161a().mo24887V();
                        if (V instanceof C7500i) {
                            C7580w0 w0Var4 = ((C7500i) V).f14936a;
                            C7484h1 b = w0Var4.mo25162b();
                            C7450b c = m13401c(w0Var.mo25162b(), b);
                            C7450b bVar = C7450b.OUT_IN_IN_POSITION;
                            if (c == bVar) {
                                e = new C7584y0(w0Var4.mo25161a());
                            } else if (w0Var3 != null && m13401c(w0Var2.mo23137j(), b) == bVar) {
                                e = new C7584y0(w0Var4.mo25161a());
                            }
                        }
                    }
                    C7484h1 b2 = w0Var.mo25162b();
                    int i3 = 0;
                    if (e == null && C5266a.m10058x2(a)) {
                        C6888i.m12438e(a, "<this>");
                        C7481g1 Y = a.mo25056Y();
                        C7547n nVar = Y instanceof C7547n ? (C7547n) Y : null;
                        if (!(nVar == null ? false : nVar.mo23573x())) {
                            C7579w x = C5266a.m10055x(a);
                            int i4 = i2 + 1;
                            C7580w0 m2 = mo25055m(new C7584y0(b2, x.f15029h), w0Var3, i4);
                            C7580w0 m3 = mo25055m(new C7584y0(b2, x.f15030i), w0Var3, i4);
                            C7484h1 b3 = m2.mo25162b();
                            if (m2.mo25161a() == x.f15029h && m3.mo25161a() == x.f15030i) {
                                return w0Var;
                            }
                            return new C7584y0(b3, C7455d0.m13428c(C5266a.m9782C(m2.mo25161a()), C5266a.m9782C(m3.mo25161a())));
                        }
                    }
                    if (!KotlinBuiltIns.isNothing(a) && !C5266a.m10046v2(a)) {
                        if (e != null) {
                            C7450b c2 = m13401c(b2, e.mo25162b());
                            if (!C5266a.m10016q2(a)) {
                                int ordinal = c2.ordinal();
                                if (ordinal == 1) {
                                    return new C7584y0(C7484h1.OUT_VARIANCE, a.mo24887V().getBuiltIns().getNullableAnyType());
                                }
                                if (ordinal == 2) {
                                    throw new C7449a("Out-projection in in-position");
                                }
                            }
                            C6888i.m12438e(a, "<this>");
                            C7481g1 Y2 = a.mo25056Y();
                            C7547n nVar2 = Y2 instanceof C7547n ? (C7547n) Y2 : null;
                            if (nVar2 == null || !nVar2.mo23573x()) {
                                nVar2 = null;
                            }
                            if (e.mo25163c()) {
                                return e;
                            }
                            C7452c0 D = nVar2 != null ? nVar2.mo23565D(e.mo25161a()) : C7460d1.m13445k(e.mo25161a(), a.mo23566W());
                            if (!a.getAnnotations().isEmpty()) {
                                C6060h d = this.f14863a.mo25171d(a.getAnnotations());
                                if (d != null) {
                                    if (d.mo23169v(StandardNames.FqNames.unsafeVariance)) {
                                        d = new C6069l(d, new C7445a1());
                                    }
                                    D = C5266a.m9780B3(D, new C6066k(D.getAnnotations(), d));
                                } else {
                                    m13399a(31);
                                    throw null;
                                }
                            }
                            if (c2 == C7450b.NO_CONFLICT) {
                                b2 = m13400b(b2, e.mo25162b());
                            }
                            return new C7584y0(b2, D);
                        }
                        C7484h1 h1Var = C7484h1.INVARIANT;
                        C7452c0 a2 = w0Var.mo25161a();
                        C7484h1 b4 = w0Var.mo25162b();
                        if (a2.mo24887V().getDeclarationDescriptor() instanceof C6248w0) {
                            return w0Var;
                        }
                        C6888i.m12438e(a2, "<this>");
                        C6888i.m12438e(a2, "<this>");
                        C7481g1 Y3 = a2.mo25056Y();
                        C7442a aVar = Y3 instanceof C7442a ? (C7442a) Y3 : null;
                        if (aVar == null) {
                            j0Var = null;
                        } else {
                            j0Var = aVar.f14857i;
                        }
                        if (j0Var != null) {
                            C7586z0 z0Var2 = this.f14863a;
                            if (!(z0Var2 instanceof C7585z) || !z0Var2.mo24892b()) {
                                b1Var = this;
                            } else {
                                C7585z zVar = (C7585z) this.f14863a;
                                b1Var = new C7448b1(new C7585z(zVar.f15035b, zVar.f15036c, false));
                            }
                            c0Var = b1Var.mo25053k(j0Var, h1Var);
                        }
                        List<C6248w0> parameters = a2.mo24887V().getParameters();
                        List<C7580w0> U = a2.mo24886U();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z2 = false;
                        while (i3 < parameters.size()) {
                            C6248w0 w0Var5 = parameters.get(i3);
                            C7580w0 w0Var6 = U.get(i3);
                            C7580w0 m4 = mo25055m(w0Var6, w0Var5, i2 + 1);
                            int ordinal2 = m13401c(w0Var5.mo23137j(), m4.mo25162b()).ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 == 1 || ordinal2 == 2) {
                                    m4 = C7460d1.m13447m(w0Var5);
                                }
                            } else if (w0Var5.mo23137j() != h1Var && !m4.mo25163c()) {
                                m4 = new C7584y0(h1Var, m4.mo25161a());
                            }
                            if (m4 != w0Var6) {
                                z2 = true;
                            }
                            arrayList.add(m4);
                            i3++;
                            i2 = i;
                        }
                        if (z2) {
                            U = arrayList;
                        }
                        C6060h d2 = this.f14863a.mo25171d(a2.getAnnotations());
                        C6888i.m12438e(a2, "<this>");
                        C6888i.m12438e(U, "newArguments");
                        C6888i.m12438e(d2, "newAnnotations");
                        C7452c0 z3 = C5266a.m10071z3(a2, U, d2, (List) null, 4);
                        if ((z3 instanceof C7489j0) && (c0Var instanceof C7489j0)) {
                            z3 = C7544m0.m13703e((C7489j0) z3, (C7489j0) c0Var);
                        }
                        return new C7584y0(b4, z3);
                    }
                }
                return w0Var;
            }
        } else {
            m13399a(17);
            throw null;
        }
    }
}
