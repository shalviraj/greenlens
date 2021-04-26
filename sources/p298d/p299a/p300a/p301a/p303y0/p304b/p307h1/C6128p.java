package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7199k;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7201m;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7281i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7435g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7543m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;

/* renamed from: d.a.a.a.y0.b.h1.p */
public class C6128p extends C6112j {

    /* renamed from: j */
    public final C7567t0 f12106j;

    /* renamed from: k */
    public final C7277h f12107k;

    /* renamed from: l */
    public final C7437i<Set<C6717d>> f12108l;

    /* renamed from: m */
    public final C6060h f12109m;

    /* renamed from: d.a.a.a.y0.b.h1.p$a */
    public class C6129a extends C7281i {

        /* renamed from: b */
        public final C7435g<C6717d, Collection<? extends C6232q0>> f12110b;

        /* renamed from: c */
        public final C7435g<C6717d, Collection<? extends C6207k0>> f12111c;

        /* renamed from: d */
        public final C7437i<Collection<C6206k>> f12112d;

        /* renamed from: d.a.a.a.y0.b.h1.p$a$a */
        public class C6130a implements C6862l<C6717d, Collection<? extends C6232q0>> {
            public C6130a(C6128p pVar) {
            }

            public Object invoke(Object obj) {
                C6717d dVar = (C6717d) obj;
                C6129a aVar = C6129a.this;
                Objects.requireNonNull(aVar);
                if (dVar != null) {
                    return aVar.mo23268c(dVar, aVar.mo23267b().getContributedFunctions(dVar, C6260d.FOR_NON_TRACKED_SCOPE));
                }
                C6129a.m10997a(8);
                throw null;
            }
        }

        /* renamed from: d.a.a.a.y0.b.h1.p$a$b */
        public class C6131b implements C6862l<C6717d, Collection<? extends C6207k0>> {
            public C6131b(C6128p pVar) {
            }

            public Object invoke(Object obj) {
                C6717d dVar = (C6717d) obj;
                C6129a aVar = C6129a.this;
                Objects.requireNonNull(aVar);
                if (dVar != null) {
                    return aVar.mo23268c(dVar, aVar.mo23267b().getContributedVariables(dVar, C6260d.FOR_NON_TRACKED_SCOPE));
                }
                C6129a.m10997a(4);
                throw null;
            }
        }

        /* renamed from: d.a.a.a.y0.b.h1.p$a$c */
        public class C6132c implements C6851a<Collection<C6206k>> {
            public C6132c(C6128p pVar) {
            }

            public Object invoke() {
                C6129a aVar = C6129a.this;
                Objects.requireNonNull(aVar);
                HashSet hashSet = new HashSet();
                for (C6717d dVar : (Set) C6128p.this.f12108l.invoke()) {
                    if (dVar != null) {
                        Collection collection = (Collection) ((C7417e.C7431m) aVar.f12110b).invoke(dVar);
                        if (collection != null) {
                            hashSet.addAll(collection);
                            Collection collection2 = (Collection) ((C7417e.C7431m) aVar.f12111c).invoke(dVar);
                            if (collection2 != null) {
                                hashSet.addAll(collection2);
                            } else {
                                C6129a.m10997a(3);
                                throw null;
                            }
                        } else {
                            C6129a.m10997a(7);
                            throw null;
                        }
                    } else {
                        C6129a.m10997a(5);
                        throw null;
                    }
                }
                return hashSet;
            }
        }

        /* renamed from: d.a.a.a.y0.b.h1.p$a$d */
        public class C6133d extends C7199k {

            /* renamed from: a */
            public final /* synthetic */ Set f12117a;

            public C6133d(C6129a aVar, Set set) {
                this.f12117a = set;
            }

            /* renamed from: f */
            public static /* synthetic */ void m11000f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* renamed from: a */
            public void mo23273a(C6023b bVar) {
                if (bVar != null) {
                    C7201m.m13073r(bVar, (C6862l<C6023b, C6777r>) null);
                    this.f12117a.add(bVar);
                    return;
                }
                m11000f(0);
                throw null;
            }

            /* renamed from: e */
            public void mo23274e(C6023b bVar, C6023b bVar2) {
            }
        }

        public C6129a(C7441m mVar) {
            this.f12110b = mVar.mo25025h(new C6130a(C6128p.this));
            this.f12111c = mVar.mo25025h(new C6131b(C6128p.this));
            this.f12112d = mVar.mo25018a(new C6132c(C6128p.this));
        }

        /* renamed from: a */
        public static /* synthetic */ void m10997a(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: b */
        public final C7277h mo23267b() {
            C7277h memberScope = C6128p.this.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
            if (memberScope != null) {
                return memberScope;
            }
            m10997a(9);
            throw null;
        }

        /* renamed from: c */
        public final <D extends C6023b> Collection<? extends D> mo23268c(C6717d dVar, Collection<? extends D> collection) {
            if (dVar == null) {
                m10997a(10);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C7201m.f14431d.mo24879h(dVar, collection, Collections.emptySet(), C6128p.this, new C6133d(this, linkedHashSet));
                return linkedHashSet;
            } else {
                m10997a(11);
                throw null;
            }
        }

        public Set<C6717d> getClassifierNames() {
            Set<C6717d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m10997a(18);
            throw null;
        }

        public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
            if (dVar == null) {
                m10997a(13);
                throw null;
            } else if (lVar != null) {
                Collection<C6206k> collection = (Collection) this.f12112d.invoke();
                if (collection != null) {
                    return collection;
                }
                m10997a(15);
                throw null;
            } else {
                m10997a(14);
                throw null;
            }
        }

        public Collection<? extends C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m10997a(5);
                throw null;
            } else if (bVar != null) {
                Collection<? extends C6232q0> collection = (Collection) ((C7417e.C7431m) this.f12110b).invoke(dVar);
                if (collection != null) {
                    return collection;
                }
                m10997a(7);
                throw null;
            } else {
                m10997a(6);
                throw null;
            }
        }

        public Collection<? extends C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
            if (dVar == null) {
                m10997a(1);
                throw null;
            } else if (bVar != null) {
                Collection<? extends C6207k0> collection = (Collection) ((C7417e.C7431m) this.f12111c).invoke(dVar);
                if (collection != null) {
                    return collection;
                }
                m10997a(3);
                throw null;
            } else {
                m10997a(2);
                throw null;
            }
        }

        public Set<C6717d> getFunctionNames() {
            Set<C6717d> set = (Set) C6128p.this.f12108l.invoke();
            if (set != null) {
                return set;
            }
            m10997a(17);
            throw null;
        }

        public Set<C6717d> getVariableNames() {
            Set<C6717d> set = (Set) C6128p.this.f12108l.invoke();
            if (set != null) {
                return set;
            }
            m10997a(19);
            throw null;
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6128p(C7441m mVar, C6046e eVar, C7452c0 c0Var, C6717d dVar, C7437i<Set<C6717d>> iVar, C6060h hVar, C6234r0 r0Var) {
        super(mVar, eVar, dVar, r0Var, false);
        if (mVar == null) {
            $$$reportNull$$$0(6);
            throw null;
        } else if (c0Var == null) {
            $$$reportNull$$$0(8);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(9);
            throw null;
        } else if (iVar == null) {
            $$$reportNull$$$0(10);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(11);
            throw null;
        } else if (r0Var != null) {
            this.f12109m = hVar;
            this.f12106j = new C7543m(this, Collections.emptyList(), Collections.singleton(c0Var), mVar);
            this.f12107k = new C6129a(mVar);
            this.f12108l = iVar;
        } else {
            $$$reportNull$$$0(12);
            throw null;
        }
    }

    /* renamed from: x */
    public static C6128p m10996x(C7441m mVar, C6046e eVar, C6717d dVar, C7437i<Set<C6717d>> iVar, C6060h hVar, C6234r0 r0Var) {
        if (mVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (eVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (iVar == null) {
            $$$reportNull$$$0(3);
            throw null;
        } else if (r0Var != null) {
            return new C6128p(mVar, eVar, eVar.getDefaultType(), dVar, iVar, hVar, r0Var);
        } else {
            $$$reportNull$$$0(5);
            throw null;
        }
    }

    public C6060h getAnnotations() {
        C6060h hVar = this.f12109m;
        if (hVar != null) {
            return hVar;
        }
        $$$reportNull$$$0(21);
        throw null;
    }

    public C6046e getCompanionObjectDescriptor() {
        return null;
    }

    public Collection<C6034d> getConstructors() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    public List<C6248w0> getDeclaredTypeParameters() {
        List<C6248w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(22);
        throw null;
    }

    public C6051f getKind() {
        return C6051f.ENUM_ENTRY;
    }

    public C6251y getModality() {
        return C6251y.FINAL;
    }

    public Collection<C6046e> getSealedSubclasses() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(23);
        throw null;
    }

    public C7277h getStaticScope() {
        C7277h.C7280b bVar = C7277h.C7280b.f14521b;
        if (bVar != null) {
            return bVar;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    public C7567t0 getTypeConstructor() {
        C7567t0 t0Var = this.f12106j;
        if (t0Var != null) {
            return t0Var;
        }
        $$$reportNull$$$0(17);
        throw null;
    }

    public C7277h getUnsubstitutedMemberScope(C7495e eVar) {
        if (eVar != null) {
            C7277h hVar = this.f12107k;
            if (hVar != null) {
                return hVar;
            }
            $$$reportNull$$$0(14);
            throw null;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    public C6034d getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public C6233r getVisibility() {
        C6233r rVar = C6219q.f12245e;
        if (rVar != null) {
            return rVar;
        }
        $$$reportNull$$$0(20);
        throw null;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isFun() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isInner() {
        return false;
    }

    public boolean isValue() {
        return false;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("enum entry ");
        u.append(getName());
        return u.toString();
    }
}
