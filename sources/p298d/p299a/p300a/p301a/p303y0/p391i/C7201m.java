package p298d.p299a.p300a.p301a.p303y0.p391i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6214o;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7194h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7506l;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7644m;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.m */
public class C7201m {

    /* renamed from: c */
    public static final List<C7194h> f14430c;

    /* renamed from: d */
    public static final C7201m f14431d;

    /* renamed from: e */
    public static final C7493d.C7494a f14432e;

    /* renamed from: a */
    public final C7495e f14433a;

    /* renamed from: b */
    public final C7493d.C7494a f14434b;

    /* renamed from: d.a.a.a.y0.i.m$a */
    public static class C7202a implements C7493d.C7494a {
        /* renamed from: b */
        public static /* synthetic */ void m13081b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo24869a(C7567t0 t0Var, C7567t0 t0Var2) {
            if (t0Var == null) {
                m13081b(0);
                throw null;
            } else if (t0Var2 != null) {
                return t0Var.equals(t0Var2);
            } else {
                m13081b(1);
                throw null;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.i.m$b */
    public static class C7203b implements C6862l<C6023b, C6019a> {
        public Object invoke(Object obj) {
            return (C6023b) obj;
        }
    }

    /* renamed from: d.a.a.a.y0.i.m$c */
    public static class C7204c {

        /* renamed from: b */
        public static final C7204c f14435b = new C7204c(C7205a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        public final C7205a f14436a;

        /* renamed from: d.a.a.a.y0.i.m$c$a */
        public enum C7205a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public C7204c(C7205a aVar, String str) {
            if (str != null) {
                this.f14436a = aVar;
            } else {
                m13083a(4);
                throw null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void m13083a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r1
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13083a(int):void");
        }

        /* renamed from: b */
        public static C7204c m13084b(String str) {
            return new C7204c(C7205a.CONFLICT, str);
        }

        /* renamed from: d */
        public static C7204c m13085d(String str) {
            return new C7204c(C7205a.INCOMPATIBLE, str);
        }

        /* renamed from: c */
        public C7205a mo24883c() {
            C7205a aVar = this.f14436a;
            if (aVar != null) {
                return aVar;
            }
            m13083a(5);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.i.m$d */
    public class C7206d extends C7491b {

        /* renamed from: i */
        public final Map<C7567t0, C7567t0> f14441i;

        public C7206d(Map<C7567t0, C7567t0> map) {
            super(true, true, true, C7201m.this.f14433a);
            this.f14441i = map;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r3.equals(r5) != false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
            if (r1.equals(r6) != false) goto L_0x0036;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo24884L(p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0 r5, p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0 r6) {
            /*
                r4 = this;
                r0 = 1
                boolean r1 = super.mo24884L(r5, r6)
                r2 = 0
                if (r1 != 0) goto L_0x003d
                d.a.a.a.y0.i.m r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.this
                d.a.a.a.y0.l.j1.d$a r1 = r1.f14434b
                boolean r1 = r1.mo24869a(r5, r6)
                if (r1 == 0) goto L_0x0013
                goto L_0x0036
            L_0x0013:
                java.util.Map<d.a.a.a.y0.l.t0, d.a.a.a.y0.l.t0> r1 = r4.f14441i
                if (r1 != 0) goto L_0x0018
                goto L_0x0038
            L_0x0018:
                java.lang.Object r1 = r1.get(r5)
                d.a.a.a.y0.l.t0 r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0) r1
                java.util.Map<d.a.a.a.y0.l.t0, d.a.a.a.y0.l.t0> r3 = r4.f14441i
                java.lang.Object r3 = r3.get(r6)
                d.a.a.a.y0.l.t0 r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0) r3
                if (r1 == 0) goto L_0x002e
                boolean r6 = r1.equals(r6)
                if (r6 != 0) goto L_0x0036
            L_0x002e:
                if (r3 == 0) goto L_0x0038
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L_0x0038
            L_0x0036:
                r5 = r0
                goto L_0x0039
            L_0x0038:
                r5 = r2
            L_0x0039:
                if (r5 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r0 = r2
            L_0x003d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7206d.mo24884L(d.a.a.a.y0.l.t0, d.a.a.a.y0.l.t0):boolean");
        }
    }

    static {
        Class<C7194h> cls = C7194h.class;
        f14430c = C6790h.m12337X(ServiceLoader.load(cls, cls.getClassLoader()));
        C7202a aVar = new C7202a();
        f14432e = aVar;
        f14431d = new C7201m(aVar, C7495e.C7496a.f14927a);
    }

    public C7201m(C7493d.C7494a aVar, C7495e eVar) {
        if (aVar == null) {
            m13062a(4);
            throw null;
        } else if (eVar != null) {
            this.f14434b = aVar;
            this.f14433a = eVar;
        } else {
            m13062a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13062a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 93 || i3 == 96 || i3 == 101)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
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
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 93 || i3 == 96 || i3 == 101)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
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
        switch (i3) {
            case 1:
            case 2:
            case 5:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "axioms";
                break;
            case 6:
            case 7:
                objArr[0] = "candidateSet";
                break;
            case 8:
                objArr[0] = "transformFirst";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 11:
                objArr[0] = "f";
                break;
            case 12:
                objArr[0] = "g";
                break;
            case 13:
            case 15:
                objArr[0] = "descriptor";
                break;
            case 16:
                objArr[0] = "result";
                break;
            case 17:
            case 20:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 18:
            case 21:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 41:
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeChecker";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i3 == 9 || i3 == 10) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 14) {
            if (i3 != 19) {
                if (i3 == 93) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 96) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 101) {
                    switch (i3) {
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            switch (i3) {
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                    objArr[1] = "isOverridableByWithoutExternalConditions";
                                    break;
                                default:
                                    switch (i3) {
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                            objArr[1] = "selectMostSpecificMember";
                                            break;
                                        default:
                                            switch (i3) {
                                                case 88:
                                                case 89:
                                                case 90:
                                                    objArr[1] = "determineModalityForFakeOverride";
                                                    break;
                                                default:
                                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
                objArr[2] = "createWithTypeRefiner";
                break;
            case 2:
            case 3:
                objArr[2] = "create";
                break;
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 6:
                objArr[2] = "filterOutOverridden";
                break;
            case 7:
            case 8:
                objArr[2] = "filterOverrides";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 11:
            case 12:
                objArr[2] = "overrides";
                break;
            case 13:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 15:
            case 16:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 17:
            case 18:
            case 20:
            case 21:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeChecker";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerContext";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 93 || i3 == 96 || i3 == 101)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
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

    /* renamed from: c */
    public static void m13063c(C6023b bVar, Set<C6023b> set) {
        if (bVar == null) {
            m13062a(15);
            throw null;
        } else if (set == null) {
            m13062a(16);
            throw null;
        } else if (bVar.getKind().mo23098d()) {
            set.add(bVar);
        } else if (!bVar.getOverriddenDescriptors().isEmpty()) {
            for (C6023b c : bVar.getOverriddenDescriptors()) {
                m13063c(c, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    /* renamed from: d */
    public static List<C7452c0> m13064d(C6019a aVar) {
        C6213n0 extensionReceiverParameter = aVar.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.mo23093a());
        }
        for (C6030b1 a : aVar.getValueParameters()) {
            arrayList.add(a.mo23093a());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2 = r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13065e(java.util.Collection<p298d.p299a.p300a.p301a.p303y0.p304b.C6023b> r16, p298d.p299a.p300a.p301a.p303y0.p304b.C6046e r17, p298d.p299a.p300a.p301a.p303y0.p391i.C7200l r18) {
        /*
            r0 = r16
            r1 = r17
            r6 = r18
            r2 = 0
            if (r0 == 0) goto L_0x01b4
            if (r1 == 0) goto L_0x01ae
            if (r6 == 0) goto L_0x01a8
            if (r1 == 0) goto L_0x01a2
            if (r0 == 0) goto L_0x019c
            d.a.a.a.y0.i.n r3 = new d.a.a.a.y0.i.n
            r3.<init>(r1)
            java.util.List r3 = p298d.p334t.C6790h.m12359m(r0, r3)
            r4 = r3
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0025
            r7 = r0
            goto L_0x0026
        L_0x0025:
            r7 = r3
        L_0x0026:
            d.a.a.a.y0.b.y r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6251y.ABSTRACT
            java.util.Iterator r3 = r7.iterator()
            r5 = 0
            r8 = r5
            r9 = r8
        L_0x002f:
            boolean r10 = r3.hasNext()
            r11 = 1
            if (r10 == 0) goto L_0x006f
            java.lang.Object r10 = r3.next()
            d.a.a.a.y0.b.b r10 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r10
            d.a.a.a.y0.b.y r12 = r10.getModality()
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x006a
            if (r12 == r11) goto L_0x0053
            r10 = 2
            if (r12 == r10) goto L_0x0051
            r10 = 3
            if (r12 == r10) goto L_0x004f
            goto L_0x002f
        L_0x004f:
            r9 = r11
            goto L_0x002f
        L_0x0051:
            r8 = r11
            goto L_0x002f
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Member cannot have SEALED modality: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006a:
            d.a.a.a.y0.b.y r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6251y.FINAL
        L_0x006c:
            r2 = r0
            goto L_0x016d
        L_0x006f:
            boolean r3 = r17.isExpect()
            if (r3 == 0) goto L_0x0085
            d.a.a.a.y0.b.y r3 = r17.getModality()
            if (r3 == r0) goto L_0x0085
            d.a.a.a.y0.b.y r3 = r17.getModality()
            d.a.a.a.y0.b.y r10 = p298d.p299a.p300a.p301a.p303y0.p304b.C6251y.SEALED
            if (r3 == r10) goto L_0x0085
            r3 = r11
            goto L_0x0086
        L_0x0085:
            r3 = r5
        L_0x0086:
            if (r8 == 0) goto L_0x008d
            if (r9 != 0) goto L_0x008d
            d.a.a.a.y0.b.y r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6251y.OPEN
            goto L_0x006c
        L_0x008d:
            if (r8 != 0) goto L_0x00a0
            if (r9 == 0) goto L_0x00a0
            if (r3 == 0) goto L_0x0097
            d.a.a.a.y0.b.y r0 = r17.getModality()
        L_0x0097:
            if (r0 == 0) goto L_0x009a
            goto L_0x006c
        L_0x009a:
            r0 = 90
            m13062a(r0)
            throw r2
        L_0x00a0:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Iterator r9 = r7.iterator()
        L_0x00a9:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00c9
            java.lang.Object r10 = r9.next()
            d.a.a.a.y0.b.b r10 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r10
            if (r10 == 0) goto L_0x00c3
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            m13063c(r10, r12)
            r8.addAll(r12)
            goto L_0x00a9
        L_0x00c3:
            r0 = 13
            m13062a(r0)
            throw r2
        L_0x00c9:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x00fa
            java.util.Iterator r9 = r8.iterator()
            java.lang.Object r9 = r9.next()
            d.a.a.a.y0.b.k r9 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6206k) r9
            d.a.a.a.y0.b.a0 r9 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13138k(r9)
            java.lang.String r10 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r9, r10)
            d.a.a.a.y0.b.z<d.a.a.a.y0.l.j1.m<d.a.a.a.y0.l.j1.e>> r10 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7497f.f14928a
            java.lang.Object r9 = r9.mo23089R(r10)
            d.a.a.a.y0.l.j1.m r9 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7507m) r9
            if (r9 != 0) goto L_0x00ee
            r9 = r2
            goto L_0x00f2
        L_0x00ee:
            T r9 = r9.f14950a
            d.a.a.a.y0.l.j1.e r9 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e) r9
        L_0x00f2:
            if (r9 == 0) goto L_0x00f6
            r9 = r11
            goto L_0x00f7
        L_0x00f6:
            r9 = r5
        L_0x00f7:
            if (r9 == 0) goto L_0x00fa
            r5 = r11
        L_0x00fa:
            int r9 = r8.size()
            if (r9 > r11) goto L_0x0101
            goto L_0x013d
        L_0x0101:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x010a:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x013c
            java.lang.Object r10 = r8.next()
            java.util.Iterator r12 = r9.iterator()
        L_0x0118:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0138
            java.lang.Object r13 = r12.next()
            r14 = r10
            d.a.a.a.y0.b.a r14 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6019a) r14
            d.a.a.a.y0.b.a r13 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6019a) r13
            boolean r15 = m13072q(r14, r13, r5, r11)
            if (r15 == 0) goto L_0x0131
            r12.remove()
            goto L_0x0118
        L_0x0131:
            boolean r13 = m13072q(r13, r14, r5, r11)
            if (r13 == 0) goto L_0x0118
            goto L_0x010a
        L_0x0138:
            r9.add(r10)
            goto L_0x010a
        L_0x013c:
            r8 = r9
        L_0x013d:
            d.a.a.a.y0.b.y r5 = r17.getModality()
            if (r5 == 0) goto L_0x0196
            java.util.Iterator r8 = r8.iterator()
            r9 = r0
        L_0x0148:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x016a
            java.lang.Object r10 = r8.next()
            d.a.a.a.y0.b.b r10 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r10
            if (r3 == 0) goto L_0x015e
            d.a.a.a.y0.b.y r11 = r10.getModality()
            if (r11 != r0) goto L_0x015e
            r10 = r5
            goto L_0x0162
        L_0x015e:
            d.a.a.a.y0.b.y r10 = r10.getModality()
        L_0x0162:
            int r11 = r10.compareTo(r9)
            if (r11 >= 0) goto L_0x0148
            r9 = r10
            goto L_0x0148
        L_0x016a:
            if (r9 == 0) goto L_0x0190
            r2 = r9
        L_0x016d:
            if (r4 == 0) goto L_0x0172
            d.a.a.a.y0.b.r r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12248h
            goto L_0x0174
        L_0x0172:
            d.a.a.a.y0.b.r r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12247g
        L_0x0174:
            r3 = r0
            d.a.a.a.y0.i.m$b r0 = new d.a.a.a.y0.i.m$b
            r0.<init>()
            java.lang.Object r0 = m13074s(r7, r0)
            d.a.a.a.y0.b.b r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r0
            d.a.a.a.y0.b.b$a r4 = p298d.p299a.p300a.p301a.p303y0.p304b.C6023b.C6024a.FAKE_OVERRIDE
            r5 = 0
            r1 = r17
            d.a.a.a.y0.b.b r0 = r0.copy(r1, r2, r3, r4, r5)
            r6.mo23454d(r0, r7)
            r6.mo23273a(r0)
            return
        L_0x0190:
            r0 = 93
            m13062a(r0)
            throw r2
        L_0x0196:
            r0 = 92
            m13062a(r0)
            throw r2
        L_0x019c:
            r0 = 95
            m13062a(r0)
            throw r2
        L_0x01a2:
            r0 = 94
            m13062a(r0)
            throw r2
        L_0x01a8:
            r0 = 85
            m13062a(r0)
            throw r2
        L_0x01ae:
            r0 = 84
            m13062a(r0)
            throw r2
        L_0x01b4:
            r0 = 83
            m13062a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.m13065e(java.util.Collection, d.a.a.a.y0.b.e, d.a.a.a.y0.i.l):void");
    }

    /* renamed from: g */
    public static <H> Collection<H> m13066g(H h, Collection<H> collection, C6862l<H, C6019a> lVar, C6862l<H, C6777r> lVar2) {
        if (h == null) {
            m13062a(97);
            throw null;
        } else if (collection != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h);
            C6019a invoke = lVar.invoke(h);
            Iterator<H> it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                C6019a invoke2 = lVar.invoke(next);
                if (h != next) {
                    C7204c.C7205a j = m13068j(invoke, invoke2);
                    if (j == C7204c.C7205a.OVERRIDABLE) {
                        arrayList.add(next);
                    } else if (j == C7204c.C7205a.CONFLICT) {
                        lVar2.invoke(next);
                    }
                }
                it.remove();
            }
            return arrayList;
        } else {
            m13062a(98);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e A[RETURN] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c m13067i(p298d.p299a.p300a.p301a.p303y0.p304b.C6019a r5, p298d.p299a.p300a.p301a.p303y0.p304b.C6019a r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0085
            if (r6 == 0) goto L_0x007f
            boolean r1 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r1 == 0) goto L_0x000d
            boolean r2 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r2 == 0) goto L_0x0015
        L_0x000d:
            boolean r2 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0
            if (r2 == 0) goto L_0x001c
            boolean r3 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0
            if (r3 != 0) goto L_0x001c
        L_0x0015:
            java.lang.String r5 = "Member kind mismatch"
        L_0x0017:
            d.a.a.a.y0.i.m$c r5 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13085d(r5)
            return r5
        L_0x001c:
            if (r1 != 0) goto L_0x0038
            if (r2 == 0) goto L_0x0021
            goto L_0x0038
        L_0x0021:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "This type of CallableDescriptor cannot be checked for overridability: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x0038:
            d.a.a.a.y0.f.d r1 = r5.getName()
            d.a.a.a.y0.f.d r2 = r6.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "Name mismatch"
            goto L_0x0017
        L_0x0049:
            d.a.a.a.y0.b.n0 r1 = r5.getExtensionReceiverParameter()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0053
            r1 = r2
            goto L_0x0054
        L_0x0053:
            r1 = r3
        L_0x0054:
            d.a.a.a.y0.b.n0 r4 = r6.getExtensionReceiverParameter()
            if (r4 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            if (r1 == r2) goto L_0x0061
            java.lang.String r5 = "Receiver presence mismatch"
            goto L_0x0075
        L_0x0061:
            java.util.List r5 = r5.getValueParameters()
            int r5 = r5.size()
            java.util.List r6 = r6.getValueParameters()
            int r6 = r6.size()
            if (r5 == r6) goto L_0x007a
            java.lang.String r5 = "Value parameter number mismatch"
        L_0x0075:
            d.a.a.a.y0.i.m$c r5 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13085d(r5)
            goto L_0x007b
        L_0x007a:
            r5 = r0
        L_0x007b:
            if (r5 == 0) goto L_0x007e
            return r5
        L_0x007e:
            return r0
        L_0x007f:
            r5 = 39
            m13062a(r5)
            throw r0
        L_0x0085:
            r5 = 38
            m13062a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.m13067i(d.a.a.a.y0.b.a, d.a.a.a.y0.b.a):d.a.a.a.y0.i.m$c");
    }

    /* renamed from: j */
    public static C7204c.C7205a m13068j(C6019a aVar, C6019a aVar2) {
        C7201m mVar = f14431d;
        C7204c.C7205a c = mVar.mo24880l(aVar2, aVar, (C6046e) null).mo24883c();
        C7204c.C7205a c2 = mVar.mo24880l(aVar, aVar2, (C6046e) null).mo24883c();
        C7204c.C7205a aVar3 = C7204c.C7205a.OVERRIDABLE;
        if (c == aVar3 && c2 == aVar3) {
            return aVar3;
        }
        C7204c.C7205a aVar4 = C7204c.C7205a.CONFLICT;
        return (c == aVar4 || c2 == aVar4) ? aVar4 : C7204c.C7205a.INCOMPATIBLE;
    }

    /* renamed from: k */
    public static boolean m13069k(C6019a aVar, C6019a aVar2) {
        if (aVar == null) {
            m13062a(65);
            throw null;
        } else if (aVar2 != null) {
            C7452c0 returnType = aVar.getReturnType();
            C7452c0 returnType2 = aVar2.getReturnType();
            if (!m13071p(aVar, aVar2)) {
                return false;
            }
            C6768j<C7506l, C7491b> f = f14431d.mo24878f(aVar.getTypeParameters(), aVar2.getTypeParameters());
            if (aVar instanceof C6244v) {
                return m13070o(aVar, returnType, aVar2, returnType2, f);
            }
            if (aVar instanceof C6207k0) {
                C6207k0 k0Var = (C6207k0) aVar;
                C6207k0 k0Var2 = (C6207k0) aVar2;
                C6211m0 c = k0Var.mo23217c();
                C6211m0 c2 = k0Var2.mo23217c();
                if (!((c == null || c2 == null) ? true : m13071p(c, c2))) {
                    return false;
                }
                if (k0Var.mo23147o() && k0Var2.mo23147o()) {
                    return ((C7506l) f.f13681g).mo25145e((C7491b) f.f13682h, returnType.mo25056Y(), returnType2.mo25056Y());
                }
                if ((k0Var.mo23147o() || !k0Var2.mo23147o()) && m13070o(aVar, returnType, aVar2, returnType2, f)) {
                    return true;
                }
                return false;
            }
            StringBuilder u = C0843a.m460u("Unexpected callable: ");
            u.append(aVar.getClass());
            throw new IllegalArgumentException(u.toString());
        } else {
            m13062a(66);
            throw null;
        }
    }

    /* renamed from: o */
    public static boolean m13070o(C6019a aVar, C7452c0 c0Var, C6019a aVar2, C7452c0 c0Var2, C6768j<C7506l, C7491b> jVar) {
        if (c0Var == null) {
            m13062a(72);
            throw null;
        } else if (c0Var2 != null) {
            return ((C7506l) jVar.f13681g).mo25146f((C7491b) jVar.f13682h, c0Var.mo25056Y(), c0Var2.mo25056Y());
        } else {
            m13062a(74);
            throw null;
        }
    }

    /* renamed from: p */
    public static boolean m13071p(C6214o oVar, C6214o oVar2) {
        Integer b = C6219q.m11190b(oVar.getVisibility(), oVar2.getVisibility());
        return b == null || b.intValue() >= 0;
    }

    /* renamed from: q */
    public static <D extends C6019a> boolean m13072q(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            m13062a(11);
            throw null;
        } else if (d2 == null) {
            m13062a(12);
            throw null;
        } else if (!d.equals(d2) && C7191e.f14417a.mo24870a(d.getOriginal(), d2.getOriginal(), z, z2)) {
            return true;
        } else {
            C6019a original = d2.getOriginal();
            int i = C7193g.f14418a;
            LinkedHashSet<C6019a> linkedHashSet = new LinkedHashSet<>();
            C7193g.m13022b(d.getOriginal(), linkedHashSet);
            for (C6019a a : linkedHashSet) {
                if (C7191e.f14417a.mo24870a(original, a, z, z2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13073r(p298d.p299a.p300a.p301a.p303y0.p304b.C6023b r6, p298d.p344x.p345b.C6862l<p298d.p299a.p300a.p301a.p303y0.p304b.C6023b, p298d.C6777r> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0118
            java.util.Collection r1 = r6.getOverriddenDescriptors()
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            d.a.a.a.y0.b.b r2 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r2
            d.a.a.a.y0.b.r r3 = r2.getVisibility()
            d.a.a.a.y0.b.r r4 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12247g
            if (r3 != r4) goto L_0x000b
            m13073r(r2, r7)
            goto L_0x000b
        L_0x0023:
            d.a.a.a.y0.b.r r1 = r6.getVisibility()
            d.a.a.a.y0.b.r r2 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12247g
            if (r1 == r2) goto L_0x002c
            return
        L_0x002c:
            java.util.Collection r1 = r6.getOverriddenDescriptors()
            if (r1 == 0) goto L_0x0112
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003b
            d.a.a.a.y0.b.r r2 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12251k
            goto L_0x0088
        L_0x003b:
            java.util.Iterator r2 = r1.iterator()
        L_0x003f:
            r3 = r0
        L_0x0040:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r2.next()
            d.a.a.a.y0.b.b r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r4
            d.a.a.a.y0.b.r r4 = r4.getVisibility()
            if (r3 != 0) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            java.lang.Integer r5 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.m11190b(r4, r3)
            if (r5 != 0) goto L_0x005a
            goto L_0x003f
        L_0x005a:
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x0040
        L_0x0060:
            r3 = r4
            goto L_0x0040
        L_0x0062:
            if (r3 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            java.util.Iterator r2 = r1.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r2.next()
            d.a.a.a.y0.b.b r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r4
            d.a.a.a.y0.b.r r4 = r4.getVisibility()
            java.lang.Integer r4 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.m11190b(r3, r4)
            if (r4 == 0) goto L_0x0085
            int r4 = r4.intValue()
            if (r4 >= 0) goto L_0x0069
        L_0x0085:
            r2 = r0
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            if (r2 != 0) goto L_0x008c
        L_0x008a:
            r2 = r0
            goto L_0x00bb
        L_0x008c:
            d.a.a.a.y0.b.b$a r3 = r6.getKind()
            d.a.a.a.y0.b.b$a r4 = p298d.p299a.p300a.p301a.p303y0.p304b.C6023b.C6024a.FAKE_OVERRIDE
            if (r3 != r4) goto L_0x00b7
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()
            d.a.a.a.y0.b.b r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r3
            d.a.a.a.y0.b.y r4 = r3.getModality()
            d.a.a.a.y0.b.y r5 = p298d.p299a.p300a.p301a.p303y0.p304b.C6251y.ABSTRACT
            if (r4 == r5) goto L_0x0098
            d.a.a.a.y0.b.r r3 = r3.getVisibility()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0098
            goto L_0x008a
        L_0x00b7:
            d.a.a.a.y0.b.r r2 = r2.mo23428d()
        L_0x00bb:
            if (r2 != 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c2
            r7.invoke(r6)
        L_0x00c2:
            d.a.a.a.y0.b.r r1 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12245e
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            boolean r3 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6097e0
            if (r3 == 0) goto L_0x00f6
            r3 = r6
            d.a.a.a.y0.b.h1.e0 r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6097e0) r3
            if (r1 == 0) goto L_0x00f0
            r3.f12021k = r1
            d.a.a.a.y0.b.k0 r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0) r6
            java.util.List r6 = r6.mo23218f()
            java.util.Iterator r6 = r6.iterator()
        L_0x00db:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0111
            java.lang.Object r1 = r6.next()
            d.a.a.a.y0.b.j0 r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6158j0) r1
            if (r2 != 0) goto L_0x00eb
            r3 = r0
            goto L_0x00ec
        L_0x00eb:
            r3 = r7
        L_0x00ec:
            m13073r(r1, r3)
            goto L_0x00db
        L_0x00f0:
            r6 = 16
            p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6097e0.$$$reportNull$$$0(r6)
            throw r0
        L_0x00f6:
            boolean r7 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r
            if (r7 == 0) goto L_0x0100
            d.a.a.a.y0.b.h1.r r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r) r6
            r6.setVisibility(r1)
            goto L_0x0111
        L_0x0100:
            d.a.a.a.y0.b.h1.d0 r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6095d0) r6
            r6.f12015m = r1
            d.a.a.a.y0.b.k0 r7 = r6.mo23200I()
            d.a.a.a.y0.b.r r7 = r7.getVisibility()
            if (r1 == r7) goto L_0x0111
            r7 = 0
            r6.f12009g = r7
        L_0x0111:
            return
        L_0x0112:
            r6 = 107(0x6b, float:1.5E-43)
            m13062a(r6)
            throw r0
        L_0x0118:
            r6 = 105(0x69, float:1.47E-43)
            m13062a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.m13073r(d.a.a.a.y0.b.b, d.x.b.l):void");
    }

    /* renamed from: s */
    public static <H> H m13074s(Collection<H> collection, C6862l<H, C6019a> lVar) {
        H h;
        boolean z;
        if (collection.size() == 1) {
            H n = C6790h.m12360n(collection);
            if (n != null) {
                return n;
            }
            m13062a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        C6888i.m12438e(collection, "$this$map");
        C6888i.m12438e(lVar, "transform");
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(collection, 10));
        for (H invoke : collection) {
            arrayList2.add(lVar.invoke(invoke));
        }
        H n2 = C6790h.m12360n(collection);
        C6019a invoke2 = lVar.invoke(n2);
        for (H next : collection) {
            C6019a invoke3 = lVar.invoke(next);
            if (invoke3 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!m13069k(invoke3, (C6019a) it.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
                if (m13069k(invoke3, invoke2) && !m13069k(invoke2, invoke3)) {
                    n2 = next;
                }
            } else {
                m13062a(69);
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            if (n2 != null) {
                return n2;
            }
            m13062a(79);
            throw null;
        } else if (arrayList.size() == 1) {
            H n3 = C6790h.m12360n(arrayList);
            if (n3 != null) {
                return n3;
            }
            m13062a(80);
            throw null;
        } else {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    h = null;
                    break;
                }
                h = it2.next();
                if (!C5266a.m10058x2(lVar.invoke(h).getReturnType())) {
                    break;
                }
            }
            if (h != null) {
                return h;
            }
            H n4 = C6790h.m12360n(arrayList);
            if (n4 != null) {
                return n4;
            }
            m13062a(82);
            throw null;
        }
    }

    /* renamed from: b */
    public final boolean mo24877b(C7452c0 c0Var, C7452c0 c0Var2, C6768j<C7506l, C7491b> jVar) {
        if (c0Var == null) {
            m13062a(44);
            throw null;
        } else if (c0Var2 == null) {
            m13062a(45);
            throw null;
        } else if (jVar != null) {
            if (C5266a.m10046v2(c0Var) && C5266a.m10046v2(c0Var2)) {
                return true;
            }
            return ((C7506l) jVar.f13681g).mo25145e((C7491b) jVar.f13682h, c0Var.mo25056Y(), c0Var2.mo25056Y());
        } else {
            m13062a(46);
            throw null;
        }
    }

    /* renamed from: f */
    public final C6768j<C7506l, C7491b> mo24878f(List<C6248w0> list, List<C6248w0> list2) {
        C7206d dVar;
        if (list == null) {
            m13062a(40);
            throw null;
        } else if (list2 != null) {
            C7506l lVar = new C7506l(this.f14433a);
            if (list == null) {
                m13062a(42);
                throw null;
            } else if (list2 != null) {
                if (list.isEmpty()) {
                    dVar = new C7206d((Map<C7567t0, C7567t0>) null);
                } else {
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < list.size(); i++) {
                        hashMap.put(list.get(i).getTypeConstructor(), list2.get(i).getTypeConstructor());
                    }
                    dVar = new C7206d(hashMap);
                }
                return new C6768j<>(lVar, dVar);
            } else {
                m13062a(43);
                throw null;
            }
        } else {
            m13062a(41);
            throw null;
        }
    }

    /* renamed from: h */
    public void mo24879h(C6717d dVar, Collection<? extends C6023b> collection, Collection<? extends C6023b> collection2, C6046e eVar, C7200l lVar) {
        Integer b;
        Collection<? extends C6023b> collection3 = collection;
        C6046e eVar2 = eVar;
        C7200l lVar2 = lVar;
        if (dVar == null) {
            m13062a(50);
            throw null;
        } else if (collection3 == null) {
            m13062a(51);
            throw null;
        } else if (collection2 == null) {
            m13062a(52);
            throw null;
        } else if (eVar2 != null) {
            LinkedHashSet<C6023b> linkedHashSet = new LinkedHashSet<>(collection3);
            Iterator<? extends C6023b> it = collection2.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    C6023b bVar = (C6023b) it.next();
                    if (bVar != null) {
                        ArrayList arrayList = new ArrayList(collection.size());
                        C7644m d = C7644m.m13873d();
                        for (C6023b bVar2 : collection) {
                            C7204c.C7205a c = mo24880l(bVar2, bVar, eVar2).mo24883c();
                            boolean z2 = !C6219q.m11193e(bVar2.getVisibility()) && C6219q.m11194f(bVar2, bVar);
                            int ordinal = c.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 2) {
                                    if (z2) {
                                        lVar2.mo24876c(bVar2, bVar);
                                    }
                                }
                            } else if (z2) {
                                d.add(bVar2);
                            }
                            arrayList.add(bVar2);
                        }
                        lVar2.mo23454d(bVar, d);
                        linkedHashSet.removeAll(arrayList);
                    } else {
                        m13062a(57);
                        throw null;
                    }
                } else {
                    if (linkedHashSet.size() >= 2) {
                        C6206k containingDeclaration = ((C6023b) linkedHashSet.iterator().next()).getContainingDeclaration();
                        C6888i.m12438e(linkedHashSet, "$this$all");
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (!Boolean.valueOf(((C6023b) it2.next()).getContainingDeclaration() == containingDeclaration).booleanValue()) {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        for (C6023b singleton : linkedHashSet) {
                            m13065e(Collections.singleton(singleton), eVar2, lVar2);
                        }
                        return;
                    }
                    LinkedList<C6023b> linkedList = new LinkedList<>(linkedHashSet);
                    while (!linkedList.isEmpty()) {
                        C6888i.m12438e(linkedList, "descriptors");
                        linkedList.isEmpty();
                        C6023b bVar3 = null;
                        for (C6023b bVar4 : linkedList) {
                            if (bVar3 == null || ((b = C6219q.m11190b(bVar3.getVisibility(), bVar4.getVisibility())) != null && b.intValue() < 0)) {
                                bVar3 = bVar4;
                            }
                        }
                        C6888i.m12436c(bVar3);
                        m13065e(m13066g(bVar3, linkedList, new C7208o(), new C7209p(lVar2, bVar3)), eVar2, lVar2);
                    }
                    return;
                }
            }
        } else {
            m13062a(53);
            throw null;
        }
    }

    /* renamed from: l */
    public C7204c mo24880l(C6019a aVar, C6019a aVar2, C6046e eVar) {
        if (aVar == null) {
            m13062a(17);
            throw null;
        } else if (aVar2 != null) {
            return mo24881m(aVar, aVar2, eVar, false);
        } else {
            m13062a(18);
            throw null;
        }
    }

    /* renamed from: m */
    public C7204c mo24881m(C6019a aVar, C6019a aVar2, C6046e eVar, boolean z) {
        C7194h.C7195a aVar3 = C7194h.C7195a.CONFLICTS_ONLY;
        if (aVar == null) {
            m13062a(20);
            throw null;
        } else if (aVar2 != null) {
            C7204c n = mo24882n(aVar, aVar2, z);
            boolean z2 = n.mo24883c() == C7204c.C7205a.OVERRIDABLE;
            for (C7194h next : f14430c) {
                if (next.mo23593b() != aVar3 && (!z2 || next.mo23593b() != C7194h.C7195a.SUCCESS_ONLY)) {
                    int ordinal = next.mo23592a(aVar, aVar2, eVar).ordinal();
                    if (ordinal == 0) {
                        z2 = true;
                    } else if (ordinal == 1) {
                        return C7204c.m13084b("External condition failed");
                    } else {
                        if (ordinal == 2) {
                            return C7204c.m13085d("External condition");
                        }
                    }
                }
            }
            if (!z2) {
                return n;
            }
            for (C7194h next2 : f14430c) {
                if (next2.mo23593b() == aVar3) {
                    int ordinal2 = next2.mo23592a(aVar, aVar2, eVar).ordinal();
                    if (ordinal2 == 0) {
                        StringBuilder u = C0843a.m460u("Contract violation in ");
                        u.append(next2.getClass().getName());
                        u.append(" condition. It's not supposed to end with success");
                        throw new IllegalStateException(u.toString());
                    } else if (ordinal2 == 1) {
                        return C7204c.m13084b("External condition failed");
                    } else {
                        if (ordinal2 == 2) {
                            return C7204c.m13085d("External condition");
                        }
                    }
                }
            }
            C7204c cVar = C7204c.f14435b;
            if (cVar != null) {
                return cVar;
            }
            C7204c.m13083a(0);
            throw null;
        } else {
            m13062a(21);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7 A[LOOP:1: B:18:0x0061->B:39:0x00c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00c0 A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c mo24882n(p298d.p299a.p300a.p301a.p303y0.p304b.C6019a r18, p298d.p299a.p300a.p301a.p303y0.p304b.C6019a r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 0
            if (r1 == 0) goto L_0x0169
            if (r2 == 0) goto L_0x0163
            d.a.a.a.y0.i.m$c r4 = m13067i(r18, r19)
            if (r4 == 0) goto L_0x0012
            return r4
        L_0x0012:
            java.util.List r4 = m13064d(r18)
            java.util.List r5 = m13064d(r19)
            java.util.List r6 = r18.getTypeParameters()
            java.util.List r7 = r19.getTypeParameters()
            int r8 = r6.size()
            int r9 = r7.size()
            r10 = 0
            if (r8 == r9) goto L_0x005c
        L_0x002d:
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            java.lang.String r3 = "Type parameter number mismatch"
            if (r10 >= r2) goto L_0x0057
            d.a.a.a.y0.l.j1.d r2 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d.f14926a
            java.lang.Object r1 = r1.get(r10)
            d.a.a.a.y0.l.c0 r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r1
            r6 = r5
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r10)
            d.a.a.a.y0.l.c0 r6 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r6
            boolean r1 = r2.mo25127b(r1, r6)
            if (r1 != 0) goto L_0x0054
            d.a.a.a.y0.i.m$c r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13085d(r3)
            return r1
        L_0x0054:
            int r10 = r10 + 1
            goto L_0x002d
        L_0x0057:
            d.a.a.a.y0.i.m$c r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13084b(r3)
            return r1
        L_0x005c:
            d.j r8 = r0.mo24878f(r6, r7)
            r9 = r10
        L_0x0061:
            int r11 = r6.size()
            if (r9 >= r11) goto L_0x00d6
            java.lang.Object r11 = r6.get(r9)
            d.a.a.a.y0.b.w0 r11 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r11
            java.lang.Object r13 = r7.get(r9)
            d.a.a.a.y0.b.w0 r13 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r13
            if (r11 == 0) goto L_0x00d0
            if (r13 == 0) goto L_0x00ca
            java.util.List r11 = r11.getUpperBounds()
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.List r13 = r13.getUpperBounds()
            r14.<init>(r13)
            int r13 = r11.size()
            int r15 = r14.size()
            if (r13 == r15) goto L_0x008f
            goto L_0x00bb
        L_0x008f:
            java.util.Iterator r11 = r11.iterator()
        L_0x0093:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00bd
            java.lang.Object r13 = r11.next()
            d.a.a.a.y0.l.c0 r13 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r13
            java.util.ListIterator r15 = r14.listIterator()
        L_0x00a3:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00bb
            java.lang.Object r16 = r15.next()
            r12 = r16
            d.a.a.a.y0.l.c0 r12 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r12
            boolean r12 = r0.mo24877b(r13, r12, r8)
            if (r12 == 0) goto L_0x00a3
            r15.remove()
            goto L_0x0093
        L_0x00bb:
            r12 = r10
            goto L_0x00be
        L_0x00bd:
            r12 = 1
        L_0x00be:
            if (r12 != 0) goto L_0x00c7
            java.lang.String r1 = "Type parameter bounds mismatch"
            d.a.a.a.y0.i.m$c r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13085d(r1)
            return r1
        L_0x00c7:
            int r9 = r9 + 1
            goto L_0x0061
        L_0x00ca:
            r1 = 48
            m13062a(r1)
            throw r3
        L_0x00d0:
            r1 = 47
            m13062a(r1)
            throw r3
        L_0x00d6:
            r6 = r10
        L_0x00d7:
            r7 = r4
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r9 = r7.size()
            if (r6 >= r9) goto L_0x00ff
            java.lang.Object r7 = r7.get(r6)
            d.a.a.a.y0.l.c0 r7 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r7
            r9 = r5
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r6)
            d.a.a.a.y0.l.c0 r9 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r9
            boolean r7 = r0.mo24877b(r7, r9, r8)
            if (r7 != 0) goto L_0x00fc
            java.lang.String r1 = "Value parameter type mismatch"
            d.a.a.a.y0.i.m$c r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13085d(r1)
            return r1
        L_0x00fc:
            int r6 = r6 + 1
            goto L_0x00d7
        L_0x00ff:
            boolean r4 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r4 == 0) goto L_0x011e
            boolean r4 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r4 == 0) goto L_0x011e
            r4 = r1
            d.a.a.a.y0.b.v r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r4
            boolean r4 = r4.isSuspend()
            r5 = r2
            d.a.a.a.y0.b.v r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r5
            boolean r5 = r5.isSuspend()
            if (r4 == r5) goto L_0x011e
            java.lang.String r1 = "Incompatible suspendability"
            d.a.a.a.y0.i.m$c r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13084b(r1)
            return r1
        L_0x011e:
            if (r20 == 0) goto L_0x015a
            d.a.a.a.y0.l.c0 r1 = r18.getReturnType()
            d.a.a.a.y0.l.c0 r2 = r19.getReturnType()
            if (r1 == 0) goto L_0x015a
            if (r2 == 0) goto L_0x015a
            boolean r4 = p005b.p291q.p292a.C5266a.m10046v2(r2)
            if (r4 == 0) goto L_0x013a
            boolean r4 = p005b.p291q.p292a.C5266a.m10046v2(r1)
            if (r4 == 0) goto L_0x013a
            r12 = 1
            goto L_0x013b
        L_0x013a:
            r12 = r10
        L_0x013b:
            if (r12 != 0) goto L_0x015a
            A r4 = r8.f13681g
            d.a.a.a.y0.l.j1.l r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7506l) r4
            B r5 = r8.f13682h
            d.a.a.a.y0.l.j1.b r5 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b) r5
            d.a.a.a.y0.l.g1 r2 = r2.mo25056Y()
            d.a.a.a.y0.l.g1 r1 = r1.mo25056Y()
            boolean r1 = r4.mo25146f(r5, r2, r1)
            if (r1 != 0) goto L_0x015a
            java.lang.String r1 = "Return type mismatch"
            d.a.a.a.y0.i.m$c r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13084b(r1)
            return r1
        L_0x015a:
            d.a.a.a.y0.i.m$c r1 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.f14435b
            if (r1 == 0) goto L_0x015f
            return r1
        L_0x015f:
            p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.m13083a(r10)
            throw r3
        L_0x0163:
            r1 = 29
            m13062a(r1)
            throw r3
        L_0x0169:
            r1 = 28
            m13062a(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.mo24882n(d.a.a.a.y0.b.a, d.a.a.a.y0.b.a, boolean):d.a.a.a.y0.i.m$c");
    }
}
