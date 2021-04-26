package p298d.p299a.p300a.p301a.p303y0.p405l.p407k1;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6111i0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7586z0;

/* renamed from: d.a.a.a.y0.l.k1.a */
public class C7523a extends C6111i0 {

    /* renamed from: d.a.a.a.y0.l.k1.a$a */
    public class C7524a implements C6244v.C6245a<C6232q0> {
        public C7524a() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m13646a(int i) {
            String str;
            int i2;
            Throwable th;
            int i3 = i;
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                    break;
                case 2:
                    objArr[0] = "modality";
                    break;
                case 4:
                    objArr[0] = "visibility";
                    break;
                case 6:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 11:
                case 17:
                    objArr[0] = "parameters";
                    break;
                case 13:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = "userDataKey";
                    break;
                case 19:
                    objArr[0] = "type";
                    break;
                case 29:
                    objArr[0] = "additionalAnnotations";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i3 == 1) {
                objArr[1] = "setOwner";
            } else if (i3 == 3) {
                objArr[1] = "setModality";
            } else if (i3 == 5) {
                objArr[1] = "setVisibility";
            } else if (i3 == 10) {
                objArr[1] = "setName";
            } else if (i3 == 12) {
                objArr[1] = "setValueParameters";
            } else if (i3 == 14) {
                objArr[1] = "setSubstitution";
            } else if (i3 == 16) {
                objArr[1] = "putUserData";
            } else if (i3 == 18) {
                objArr[1] = "setTypeParameters";
            } else if (i3 == 30) {
                objArr[1] = "setAdditionalAnnotations";
            } else if (i3 == 7) {
                objArr[1] = "setKind";
            } else if (i3 != 8) {
                switch (i3) {
                    case 20:
                        objArr[1] = "setReturnType";
                        break;
                    case 21:
                        objArr[1] = "setExtensionReceiverParameter";
                        break;
                    case 22:
                        objArr[1] = "setDispatchReceiverParameter";
                        break;
                    case 23:
                        objArr[1] = "setOriginal";
                        break;
                    case 24:
                        objArr[1] = "setSignatureChange";
                        break;
                    case 25:
                        objArr[1] = "setPreserveSourceElement";
                        break;
                    case 26:
                        objArr[1] = "setDropOriginalInContainingParts";
                        break;
                    case 27:
                        objArr[1] = "setHiddenToOvercomeSignatureClash";
                        break;
                    case 28:
                        objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                        break;
                }
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    break;
                case 2:
                    objArr[2] = "setModality";
                    break;
                case 4:
                    objArr[2] = "setVisibility";
                    break;
                case 6:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setName";
                    break;
                case 11:
                    objArr[2] = "setValueParameters";
                    break;
                case 13:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "putUserData";
                    break;
                case 17:
                    objArr[2] = "setTypeParameters";
                    break;
                case 19:
                    objArr[2] = "setReturnType";
                    break;
                case 29:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: e */
        public C6244v mo23292e() {
            return C7523a.this;
        }

        /* renamed from: f */
        public C6244v.C6245a<C6232q0> mo23293f() {
            return this;
        }

        /* renamed from: g */
        public C6244v.C6245a<C6232q0> mo23294g(List<C6030b1> list) {
            return this;
        }

        /* renamed from: h */
        public C6244v.C6245a<C6232q0> mo23295h(C7586z0 z0Var) {
            if (z0Var != null) {
                return this;
            }
            m13646a(13);
            throw null;
        }

        /* renamed from: i */
        public C6244v.C6245a<C6232q0> mo23296i(List<C6248w0> list) {
            return this;
        }

        /* renamed from: j */
        public C6244v.C6245a<C6232q0> mo23297j(C6233r rVar) {
            if (rVar != null) {
                return this;
            }
            m13646a(4);
            throw null;
        }

        /* renamed from: k */
        public C6244v.C6245a<C6232q0> mo23298k(C6206k kVar) {
            if (kVar != null) {
                return this;
            }
            m13646a(0);
            throw null;
        }

        /* renamed from: l */
        public C6244v.C6245a<C6232q0> mo23299l() {
            return this;
        }

        /* renamed from: m */
        public C6244v.C6245a<C6232q0> mo23300m(C6251y yVar) {
            if (yVar != null) {
                return this;
            }
            m13646a(2);
            throw null;
        }

        /* renamed from: n */
        public C6244v.C6245a<C6232q0> mo23301n(C6023b.C6024a aVar) {
            if (aVar != null) {
                return this;
            }
            m13646a(6);
            throw null;
        }

        /* renamed from: o */
        public C6244v.C6245a<C6232q0> mo23302o(C6213n0 n0Var) {
            return this;
        }

        /* renamed from: p */
        public C6244v.C6245a<C6232q0> mo23303p() {
            return this;
        }

        /* renamed from: q */
        public C6244v.C6245a<C6232q0> mo23304q(C6060h hVar) {
            if (hVar != null) {
                return this;
            }
            m13646a(29);
            throw null;
        }

        /* renamed from: r */
        public C6244v.C6245a<C6232q0> mo23305r(C7452c0 c0Var) {
            if (c0Var != null) {
                return this;
            }
            m13646a(19);
            throw null;
        }

        /* renamed from: s */
        public C6244v.C6245a<C6232q0> mo23306s(C6717d dVar) {
            if (dVar != null) {
                return this;
            }
            m13646a(9);
            throw null;
        }

        /* renamed from: t */
        public C6244v.C6245a<C6232q0> mo23307t(C6023b bVar) {
            return this;
        }

        /* renamed from: u */
        public C6244v.C6245a<C6232q0> mo23308u() {
            return this;
        }

        /* renamed from: v */
        public C6244v.C6245a<C6232q0> mo23309v(boolean z) {
            return this;
        }

        /* renamed from: w */
        public C6244v.C6245a<C6232q0> mo23310w() {
            return this;
        }

        /* renamed from: x */
        public C6244v.C6245a<C6232q0> mo23311x(C6213n0 n0Var) {
            return this;
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
                break;
            case 8:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 6) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 6:
            case 7:
                break;
            case 8:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7523a(C6046e eVar, C7570v.C7574d dVar) {
        super(eVar, (C6232q0) null, C6060h.C6061a.f11922b, C6717d.m12272p("<ERROR FUNCTION>"), C6023b.C6024a.DECLARATION, C6234r0.f12257a);
        if (eVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (dVar != null) {
            Objects.requireNonNull(C6060h.f11920d);
        } else {
            $$$reportNull$$$0(1);
            throw null;
        }
    }

    public C6023b copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        return this;
    }

    /* renamed from: copy  reason: collision with other method in class */
    public C6232q0 m15020copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        return this;
    }

    /* renamed from: copy  reason: collision with other method in class */
    public C6244v m15021copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        return this;
    }

    public C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        if (kVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (aVar == null) {
            $$$reportNull$$$0(3);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(4);
            throw null;
        } else if (r0Var != null) {
            return this;
        } else {
            $$$reportNull$$$0(5);
            throw null;
        }
    }

    public <V> V getUserData(C6019a.C6020a<V> aVar) {
        return null;
    }

    public boolean isSuspend() {
        return false;
    }

    public C6244v.C6245a<? extends C6232q0> newCopyBuilder() {
        return new C7524a();
    }

    public void setOverriddenDescriptors(Collection<? extends C6023b> collection) {
        if (collection == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
    }
}
