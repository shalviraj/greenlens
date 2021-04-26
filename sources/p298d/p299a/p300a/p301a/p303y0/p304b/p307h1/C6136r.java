package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6033c1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7293b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7586z0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;

/* renamed from: d.a.a.a.y0.b.h1.r */
public abstract class C6136r extends C6122n implements C6244v {
    /* access modifiers changed from: private */
    public C6213n0 dispatchReceiverParameter;
    private C6213n0 extensionReceiverParameter;
    private boolean hasStableParameterNames;
    private boolean hasSynthesizedParameterNames;
    private C6244v initialSignatureDescriptor;
    private boolean isActual;
    private boolean isExpect;
    private boolean isExternal;
    private boolean isHiddenForResolutionEverywhereBesideSupercalls;
    private boolean isHiddenToOvercomeSignatureClash;
    private boolean isInfix;
    private boolean isInline;
    private boolean isOperator;
    private boolean isSuspend;
    private boolean isTailrec;
    private final C6023b.C6024a kind;
    private volatile C6851a<Collection<C6244v>> lazyOverriddenFunctionsTask;
    private C6251y modality;
    private final C6244v original;
    private Collection<? extends C6244v> overriddenFunctions;
    private List<C6248w0> typeParameters;
    private C7452c0 unsubstitutedReturnType;
    private List<C6030b1> unsubstitutedValueParameters;
    public Map<C6019a.C6020a<?>, Object> userDataMap;
    private C6233r visibility;

    /* renamed from: d.a.a.a.y0.b.h1.r$a */
    public class C6137a implements C6851a<Collection<C6244v>> {

        /* renamed from: g */
        public final /* synthetic */ C7448b1 f12121g;

        public C6137a(C7448b1 b1Var) {
            this.f12121g = b1Var;
        }

        public Object invoke() {
            C7639l lVar = new C7639l();
            for (C6244v substitute : C6136r.this.getOverriddenDescriptors()) {
                lVar.add(substitute.substitute(this.f12121g));
            }
            return lVar;
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.r$b */
    public static class C6138b implements C6851a<List<C6033c1>> {

        /* renamed from: g */
        public final /* synthetic */ List f12123g;

        public C6138b(List list) {
            this.f12123g = list;
        }

        public Object invoke() {
            return this.f12123g;
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.r$c */
    public class C6139c implements C6244v.C6245a<C6244v> {

        /* renamed from: a */
        public C7586z0 f12124a;

        /* renamed from: b */
        public C6206k f12125b;

        /* renamed from: c */
        public C6251y f12126c;

        /* renamed from: d */
        public C6233r f12127d;

        /* renamed from: e */
        public C6244v f12128e;

        /* renamed from: f */
        public C6023b.C6024a f12129f;

        /* renamed from: g */
        public List<C6030b1> f12130g;

        /* renamed from: h */
        public C6213n0 f12131h;

        /* renamed from: i */
        public C6213n0 f12132i;

        /* renamed from: j */
        public C7452c0 f12133j;

        /* renamed from: k */
        public C6717d f12134k;

        /* renamed from: l */
        public boolean f12135l;

        /* renamed from: m */
        public boolean f12136m;

        /* renamed from: n */
        public boolean f12137n;

        /* renamed from: o */
        public boolean f12138o;

        /* renamed from: p */
        public boolean f12139p;

        /* renamed from: q */
        public List<C6248w0> f12140q;

        /* renamed from: r */
        public C6060h f12141r;

        /* renamed from: s */
        public boolean f12142s;

        /* renamed from: t */
        public Map<C6019a.C6020a<?>, Object> f12143t;

        /* renamed from: u */
        public Boolean f12144u;

        /* renamed from: v */
        public boolean f12145v;

        /* renamed from: w */
        public final /* synthetic */ C6136r f12146w;

        public C6139c(C6136r rVar, C7586z0 z0Var, C6206k kVar, C6251y yVar, C6233r rVar2, C6023b.C6024a aVar, List<C6030b1> list, C6213n0 n0Var, C7452c0 c0Var, C6717d dVar) {
            if (z0Var == null) {
                m11006a(0);
                throw null;
            } else if (kVar == null) {
                m11006a(1);
                throw null;
            } else if (yVar == null) {
                m11006a(2);
                throw null;
            } else if (rVar2 == null) {
                m11006a(3);
                throw null;
            } else if (aVar == null) {
                m11006a(4);
                throw null;
            } else if (list == null) {
                m11006a(5);
                throw null;
            } else if (c0Var != null) {
                this.f12146w = rVar;
                this.f12128e = null;
                this.f12132i = rVar.dispatchReceiverParameter;
                this.f12135l = true;
                this.f12136m = false;
                this.f12137n = false;
                this.f12138o = false;
                this.f12139p = rVar.isHiddenToOvercomeSignatureClash();
                this.f12140q = null;
                this.f12141r = null;
                this.f12142s = rVar.isHiddenForResolutionEverywhereBesideSupercalls();
                this.f12143t = new LinkedHashMap();
                this.f12144u = null;
                this.f12145v = false;
                this.f12124a = z0Var;
                this.f12125b = kVar;
                this.f12126c = yVar;
                this.f12127d = rVar2;
                this.f12129f = aVar;
                this.f12130g = list;
                this.f12131h = n0Var;
                this.f12133j = c0Var;
                this.f12134k = null;
            } else {
                m11006a(6);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m11006a(int i) {
            String str;
            int i2;
            Throwable th;
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = "parameters";
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                    objArr[1] = "setModality";
                    break;
                case 12:
                    objArr[1] = "setVisibility";
                    break;
                case 14:
                    objArr[1] = "setKind";
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = "setName";
                    break;
                case 19:
                    objArr[1] = "setValueParameters";
                    break;
                case 21:
                    objArr[1] = "setTypeParameters";
                    break;
                case 23:
                    objArr[1] = "setReturnType";
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 35:
                    objArr[1] = "setSubstitution";
                    break;
                case 37:
                    objArr[1] = "putUserData";
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i) {
                case 7:
                    objArr[2] = "setOwner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = "setModality";
                    break;
                case 11:
                    objArr[2] = "setVisibility";
                    break;
                case 13:
                    objArr[2] = "setKind";
                    break;
                case 16:
                    objArr[2] = "setName";
                    break;
                case 18:
                    objArr[2] = "setValueParameters";
                    break;
                case 20:
                    objArr[2] = "setTypeParameters";
                    break;
                case 22:
                    objArr[2] = "setReturnType";
                    break;
                case 32:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 34:
                    objArr[2] = "setSubstitution";
                    break;
                case 36:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        /* renamed from: e */
        public C6244v mo23292e() {
            return this.f12146w.doSubstitute(this);
        }

        /* renamed from: f */
        public C6244v.C6245a mo23293f() {
            this.f12138o = true;
            return this;
        }

        /* renamed from: g */
        public C6244v.C6245a mo23294g(List list) {
            this.f12130g = list;
            return this;
        }

        /* renamed from: h */
        public C6244v.C6245a mo23295h(C7586z0 z0Var) {
            if (z0Var != null) {
                this.f12124a = z0Var;
                return this;
            }
            m11006a(34);
            throw null;
        }

        /* renamed from: i */
        public C6244v.C6245a mo23296i(List list) {
            this.f12140q = list;
            return this;
        }

        /* renamed from: j */
        public C6244v.C6245a mo23297j(C6233r rVar) {
            if (rVar != null) {
                this.f12127d = rVar;
                return this;
            }
            m11006a(11);
            throw null;
        }

        /* renamed from: k */
        public C6244v.C6245a mo23298k(C6206k kVar) {
            if (kVar != null) {
                this.f12125b = kVar;
                return this;
            }
            m11006a(7);
            throw null;
        }

        /* renamed from: l */
        public C6244v.C6245a mo23299l() {
            this.f12139p = true;
            return this;
        }

        /* renamed from: m */
        public C6244v.C6245a mo23300m(C6251y yVar) {
            if (yVar != null) {
                this.f12126c = yVar;
                return this;
            }
            m11006a(9);
            throw null;
        }

        /* renamed from: n */
        public C6244v.C6245a mo23301n(C6023b.C6024a aVar) {
            if (aVar != null) {
                this.f12129f = aVar;
                return this;
            }
            m11006a(13);
            throw null;
        }

        /* renamed from: o */
        public C6244v.C6245a mo23302o(C6213n0 n0Var) {
            this.f12132i = n0Var;
            return this;
        }

        /* renamed from: p */
        public C6244v.C6245a mo23303p() {
            this.f12137n = true;
            return this;
        }

        /* renamed from: q */
        public C6244v.C6245a mo23304q(C6060h hVar) {
            if (hVar != null) {
                this.f12141r = hVar;
                return this;
            }
            m11006a(32);
            throw null;
        }

        /* renamed from: r */
        public C6244v.C6245a mo23305r(C7452c0 c0Var) {
            if (c0Var != null) {
                this.f12133j = c0Var;
                return this;
            }
            m11006a(22);
            throw null;
        }

        /* renamed from: s */
        public C6244v.C6245a mo23306s(C6717d dVar) {
            if (dVar != null) {
                this.f12134k = dVar;
                return this;
            }
            m11006a(16);
            throw null;
        }

        /* renamed from: t */
        public C6244v.C6245a mo23307t(C6023b bVar) {
            this.f12128e = (C6244v) bVar;
            return this;
        }

        /* renamed from: u */
        public C6244v.C6245a mo23308u() {
            this.f12142s = true;
            return this;
        }

        /* renamed from: v */
        public C6244v.C6245a mo23309v(boolean z) {
            this.f12135l = z;
            return this;
        }

        /* renamed from: w */
        public C6244v.C6245a mo23310w() {
            this.f12136m = true;
            return this;
        }

        /* renamed from: x */
        public C6244v.C6245a mo23311x(C6213n0 n0Var) {
            this.f12131h = n0Var;
            return this;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 26:
            case 28:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 27:
            case 29:
                objArr[0] = "substitutor";
                break;
            case 23:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 8:
                objArr[1] = "initialize";
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "newCopyBuilder";
                break;
            case 24:
                objArr[1] = "copy";
                break;
            case 25:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
                objArr[2] = "initialize";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "newCopyBuilder";
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6136r(C6206k kVar, C6244v vVar, C6060h hVar, C6717d dVar, C6023b.C6024a aVar, C6234r0 r0Var) {
        super(kVar, hVar, dVar, r0Var);
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (hVar == null) {
            $$$reportNull$$$0(1);
        }
        if (dVar == null) {
            $$$reportNull$$$0(2);
        }
        if (aVar == null) {
            $$$reportNull$$$0(3);
        }
        if (r0Var == null) {
            $$$reportNull$$$0(4);
        }
        this.visibility = C6219q.f12249i;
        this.isOperator = false;
        this.isInfix = false;
        this.isExternal = false;
        this.isInline = false;
        this.isTailrec = false;
        this.isExpect = false;
        this.isActual = false;
        this.isHiddenToOvercomeSignatureClash = false;
        this.isHiddenForResolutionEverywhereBesideSupercalls = false;
        this.isSuspend = false;
        this.hasStableParameterNames = true;
        this.hasSynthesizedParameterNames = false;
        this.overriddenFunctions = null;
        this.lazyOverriddenFunctionsTask = null;
        this.initialSignatureDescriptor = null;
        this.userDataMap = null;
        this.original = vVar == null ? this : vVar;
        this.kind = aVar;
    }

    private C6234r0 getSourceToUseForCopy(boolean z, C6244v vVar) {
        C6234r0 r0Var;
        if (z) {
            if (vVar == null) {
                vVar = getOriginal();
            }
            r0Var = vVar.getSource();
        } else {
            r0Var = C6234r0.f12257a;
        }
        if (r0Var == null) {
            $$$reportNull$$$0(25);
        }
        return r0Var;
    }

    public static List<C6030b1> getSubstitutedValueParameters(C6244v vVar, List<C6030b1> list, C7448b1 b1Var) {
        if (list == null) {
            $$$reportNull$$$0(26);
        }
        if (b1Var == null) {
            $$$reportNull$$$0(27);
        }
        return getSubstitutedValueParameters(vVar, list, b1Var, false, false, (boolean[]) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r6v3, types: [d.a.a.a.y0.b.h1.n0$a] */
    /* JADX WARNING: type inference failed for: r6v4, types: [d.a.a.a.y0.b.h1.n0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1> getSubstitutedValueParameters(p298d.p299a.p300a.p301a.p303y0.p304b.C6244v r19, java.util.List<p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1> r20, p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1 r21, boolean r22, boolean r23, boolean[] r24) {
        /*
            r0 = r21
            if (r20 != 0) goto L_0x0009
            r1 = 28
            $$$reportNull$$$0(r1)
        L_0x0009:
            if (r0 != 0) goto L_0x0010
            r1 = 29
            $$$reportNull$$$0(r1)
        L_0x0010:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r20.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r20.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00cb
            java.lang.Object r3 = r2.next()
            d.a.a.a.y0.b.b1 r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r3
            d.a.a.a.y0.l.c0 r4 = r3.mo23093a()
            d.a.a.a.y0.l.h1 r5 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.IN_VARIANCE
            d.a.a.a.y0.l.c0 r12 = r0.mo25053k(r4, r5)
            d.a.a.a.y0.l.c0 r4 = r3.mo23130p()
            r6 = 0
            if (r4 != 0) goto L_0x003c
            r5 = r6
            goto L_0x0040
        L_0x003c:
            d.a.a.a.y0.l.c0 r5 = r0.mo25053k(r4, r5)
        L_0x0040:
            if (r12 != 0) goto L_0x0043
            return r6
        L_0x0043:
            d.a.a.a.y0.l.c0 r7 = r3.mo23093a()
            if (r12 != r7) goto L_0x004b
            if (r4 == r5) goto L_0x0051
        L_0x004b:
            if (r24 == 0) goto L_0x0051
            r4 = 0
            r7 = 1
            r24[r4] = r7
        L_0x0051:
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6123n0.C6124a
            if (r4 == 0) goto L_0x0068
            r4 = r3
            d.a.a.a.y0.b.h1.n0$a r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6123n0.C6124a) r4
            d.f r4 = r4.f12103n
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            d.a.a.a.y0.b.h1.r$b r7 = new d.a.a.a.y0.b.h1.r$b
            r7.<init>(r4)
            r18 = r7
            goto L_0x006a
        L_0x0068:
            r18 = r6
        L_0x006a:
            if (r22 == 0) goto L_0x006e
            r8 = r6
            goto L_0x006f
        L_0x006e:
            r8 = r3
        L_0x006f:
            int r9 = r3.mo23128d()
            d.a.a.a.y0.b.f1.h r10 = r3.getAnnotations()
            d.a.a.a.y0.f.d r11 = r3.getName()
            boolean r13 = r3.mo23125E()
            boolean r14 = r3.mo23129g()
            boolean r15 = r3.mo23126N()
            if (r23 == 0) goto L_0x008e
            d.a.a.a.y0.b.r0 r3 = r3.getSource()
            goto L_0x0090
        L_0x008e:
            d.a.a.a.y0.b.r0 r3 = p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0.f12257a
        L_0x0090:
            java.lang.String r4 = "containingDeclaration"
            r7 = r19
            p298d.p344x.p346c.C6888i.m12438e(r7, r4)
            java.lang.String r4 = "annotations"
            p298d.p344x.p346c.C6888i.m12438e(r10, r4)
            java.lang.String r4 = "name"
            p298d.p344x.p346c.C6888i.m12438e(r11, r4)
            java.lang.String r4 = "outType"
            p298d.p344x.p346c.C6888i.m12438e(r12, r4)
            java.lang.String r4 = "source"
            p298d.p344x.p346c.C6888i.m12438e(r3, r4)
            if (r18 != 0) goto L_0x00ba
            d.a.a.a.y0.b.h1.n0 r4 = new d.a.a.a.y0.b.h1.n0
            r6 = r4
            r7 = r19
            r16 = r5
            r17 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00c6
        L_0x00ba:
            d.a.a.a.y0.b.h1.n0$a r4 = new d.a.a.a.y0.b.h1.n0$a
            r6 = r4
            r7 = r19
            r16 = r5
            r17 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00c6:
            r1.add(r4)
            goto L_0x001d
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r.getSubstitutedValueParameters(d.a.a.a.y0.b.v, java.util.List, d.a.a.a.y0.l.b1, boolean, boolean, boolean[]):java.util.List");
    }

    private void performOverriddenLazyCalculationIfNeeded() {
        C6851a<Collection<C6244v>> aVar = this.lazyOverriddenFunctionsTask;
        if (aVar != null) {
            this.overriddenFunctions = aVar.invoke();
            this.lazyOverriddenFunctionsTask = null;
        }
    }

    private void setHiddenForResolutionEverywhereBesideSupercalls(boolean z) {
        this.isHiddenForResolutionEverywhereBesideSupercalls = z;
    }

    private void setHiddenToOvercomeSignatureClash(boolean z) {
        this.isHiddenToOvercomeSignatureClash = z;
    }

    private void setInitialSignatureDescriptor(C6244v vVar) {
        this.initialSignatureDescriptor = vVar;
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        return mVar.mo22982c(this, d);
    }

    public C6244v copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        C6244v e = newCopyBuilder().mo23298k(kVar).mo23300m(yVar).mo23297j(rVar).mo23301n(aVar).mo23309v(z).mo23292e();
        if (e == null) {
            $$$reportNull$$$0(24);
        }
        return e;
    }

    public abstract C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var);

    public C6244v doSubstitute(C6139c cVar) {
        C6109h0 h0Var;
        C6213n0 n0Var;
        C7452c0 k;
        C6851a<Collection<C6244v>> aVar;
        C6139c cVar2 = cVar;
        if (cVar2 == null) {
            $$$reportNull$$$0(23);
        }
        boolean[] zArr = new boolean[1];
        C6060h Y = cVar2.f12141r != null ? C5266a.m9907Y(getAnnotations(), cVar2.f12141r) : getAnnotations();
        C6206k kVar = cVar2.f12125b;
        C6244v vVar = cVar2.f12128e;
        C6136r createSubstitutedCopy = createSubstitutedCopy(kVar, vVar, cVar2.f12129f, cVar2.f12134k, Y, getSourceToUseForCopy(cVar2.f12137n, vVar));
        List<C6248w0> list = cVar2.f12140q;
        if (list == null) {
            list = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        C7448b1 k4 = C5266a.m9982k4(list, cVar2.f12124a, createSubstitutedCopy, arrayList, zArr);
        if (k4 == null) {
            return null;
        }
        C6213n0 n0Var2 = cVar2.f12131h;
        if (n0Var2 != null) {
            C7452c0 k2 = k4.mo25053k(n0Var2.mo23093a(), C7484h1.IN_VARIANCE);
            if (k2 == null) {
                return null;
            }
            C6109h0 h0Var2 = new C6109h0(createSubstitutedCopy, new C7293b(createSubstitutedCopy, k2, cVar2.f12131h.getValue()), cVar2.f12131h.getAnnotations());
            zArr[0] = (k2 != cVar2.f12131h.mo23093a()) | zArr[0];
            h0Var = h0Var2;
        } else {
            h0Var = null;
        }
        C6213n0 n0Var3 = cVar2.f12132i;
        if (n0Var3 != null) {
            C6213n0 substitute = n0Var3.substitute(k4);
            if (substitute == null) {
                return null;
            }
            zArr[0] = zArr[0] | (substitute != cVar2.f12132i);
            n0Var = substitute;
        } else {
            n0Var = null;
        }
        List<C6030b1> substitutedValueParameters = getSubstitutedValueParameters(createSubstitutedCopy, cVar2.f12130g, k4, cVar2.f12138o, cVar2.f12137n, zArr);
        if (substitutedValueParameters == null || (k = k4.mo25053k(cVar2.f12133j, C7484h1.OUT_VARIANCE)) == null) {
            return null;
        }
        zArr[0] = zArr[0] | (k != cVar2.f12133j);
        if (!zArr[0] && cVar2.f12145v) {
            return this;
        }
        C7448b1 b1Var = k4;
        createSubstitutedCopy.initialize(h0Var, n0Var, arrayList, substitutedValueParameters, k, cVar2.f12126c, cVar2.f12127d);
        createSubstitutedCopy.setOperator(this.isOperator);
        createSubstitutedCopy.setInfix(this.isInfix);
        createSubstitutedCopy.setExternal(this.isExternal);
        createSubstitutedCopy.setInline(this.isInline);
        createSubstitutedCopy.setTailrec(this.isTailrec);
        createSubstitutedCopy.setSuspend(this.isSuspend);
        createSubstitutedCopy.setExpect(this.isExpect);
        createSubstitutedCopy.setActual(this.isActual);
        createSubstitutedCopy.setHasStableParameterNames(this.hasStableParameterNames);
        createSubstitutedCopy.setHiddenToOvercomeSignatureClash(cVar2.f12139p);
        createSubstitutedCopy.setHiddenForResolutionEverywhereBesideSupercalls(cVar2.f12142s);
        Boolean bool = cVar2.f12144u;
        createSubstitutedCopy.setHasSynthesizedParameterNames(bool != null ? bool.booleanValue() : this.hasSynthesizedParameterNames);
        if (!cVar2.f12143t.isEmpty() || this.userDataMap != null) {
            Map map = cVar2.f12143t;
            Map<C6019a.C6020a<?>, Object> map2 = this.userDataMap;
            if (map2 != null) {
                for (Map.Entry next : map2.entrySet()) {
                    if (!map.containsKey(next.getKey())) {
                        map.put(next.getKey(), next.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                map = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            }
            createSubstitutedCopy.userDataMap = map;
        }
        if (cVar2.f12136m || getInitialSignatureDescriptor() != null) {
            createSubstitutedCopy.setInitialSignatureDescriptor((getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : this).substitute(b1Var));
        }
        if (cVar2.f12135l && !getOriginal().getOverriddenDescriptors().isEmpty()) {
            if (cVar2.f12124a.mo23540f()) {
                aVar = this.lazyOverriddenFunctionsTask;
                if (aVar == null) {
                    createSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                }
            } else {
                aVar = new C6137a(b1Var);
            }
            createSubstitutedCopy.lazyOverriddenFunctionsTask = aVar;
        }
        return createSubstitutedCopy;
    }

    public C6213n0 getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    public C6213n0 getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    public C6244v getInitialSignatureDescriptor() {
        return this.initialSignatureDescriptor;
    }

    public C6023b.C6024a getKind() {
        C6023b.C6024a aVar = this.kind;
        if (aVar == null) {
            $$$reportNull$$$0(19);
        }
        return aVar;
    }

    public C6251y getModality() {
        C6251y yVar = this.modality;
        if (yVar == null) {
            $$$reportNull$$$0(13);
        }
        return yVar;
    }

    public C6244v getOriginal() {
        C6244v vVar = this.original;
        C6244v original2 = vVar == this ? this : vVar.getOriginal();
        if (original2 == null) {
            $$$reportNull$$$0(18);
        }
        return original2;
    }

    public Collection<? extends C6244v> getOverriddenDescriptors() {
        performOverriddenLazyCalculationIfNeeded();
        Collection<? extends C6244v> collection = this.overriddenFunctions;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            $$$reportNull$$$0(12);
        }
        return collection;
    }

    public C7452c0 getReturnType() {
        return this.unsubstitutedReturnType;
    }

    public List<C6248w0> getTypeParameters() {
        List<C6248w0> list = this.typeParameters;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public <V> V getUserData(C6019a.C6020a<V> aVar) {
        Map map = this.userDataMap;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public List<C6030b1> getValueParameters() {
        List<C6030b1> list = this.unsubstitutedValueParameters;
        if (list == null) {
            $$$reportNull$$$0(17);
        }
        return list;
    }

    public C6233r getVisibility() {
        C6233r rVar = this.visibility;
        if (rVar == null) {
            $$$reportNull$$$0(14);
        }
        return rVar;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }

    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames;
    }

    public C6136r initialize(C6213n0 n0Var, C6213n0 n0Var2, List<? extends C6248w0> list, List<C6030b1> list2, C7452c0 c0Var, C6251y yVar, C6233r rVar) {
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (list2 == null) {
            $$$reportNull$$$0(6);
        }
        if (rVar == null) {
            $$$reportNull$$$0(7);
        }
        this.typeParameters = C6790h.m12337X(list);
        this.unsubstitutedValueParameters = C6790h.m12337X(list2);
        this.unsubstitutedReturnType = c0Var;
        this.modality = yVar;
        this.visibility = rVar;
        this.extensionReceiverParameter = n0Var;
        this.dispatchReceiverParameter = n0Var2;
        int i = 0;
        int i2 = 0;
        while (i2 < list.size()) {
            C6248w0 w0Var = (C6248w0) list.get(i2);
            if (w0Var.mo23132d() == i2) {
                i2++;
            } else {
                throw new IllegalStateException(w0Var + " index is " + w0Var.mo23132d() + " but position is " + i2);
            }
        }
        while (i < list2.size()) {
            C6030b1 b1Var = list2.get(i);
            if (b1Var.mo23128d() == i + 0) {
                i++;
            } else {
                throw new IllegalStateException(b1Var + "index is " + b1Var.mo23128d() + " but position is " + i);
            }
        }
        return this;
    }

    public boolean isActual() {
        return this.isActual;
    }

    public boolean isExpect() {
        return this.isExpect;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.isHiddenForResolutionEverywhereBesideSupercalls;
    }

    public boolean isHiddenToOvercomeSignatureClash() {
        return this.isHiddenToOvercomeSignatureClash;
    }

    public boolean isInfix() {
        if (this.isInfix) {
            return true;
        }
        for (C6244v isInfix2 : getOriginal().getOverriddenDescriptors()) {
            if (isInfix2.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.isInline;
    }

    public boolean isOperator() {
        if (this.isOperator) {
            return true;
        }
        for (C6244v isOperator2 : getOriginal().getOverriddenDescriptors()) {
            if (isOperator2.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.isSuspend;
    }

    public boolean isTailrec() {
        return this.isTailrec;
    }

    public C6139c newCopyBuilder(C7448b1 b1Var) {
        if (b1Var == null) {
            $$$reportNull$$$0(22);
        }
        return new C6139c(this, b1Var.mo25050g(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getExtensionReceiverParameter(), getReturnType(), (C6717d) null);
    }

    public C6244v.C6245a<? extends C6244v> newCopyBuilder() {
        C6139c newCopyBuilder = newCopyBuilder(C7448b1.f14862b);
        if (newCopyBuilder == null) {
            $$$reportNull$$$0(21);
        }
        return newCopyBuilder;
    }

    public <V> void putInUserDataMap(C6019a.C6020a<V> aVar, Object obj) {
        if (this.userDataMap == null) {
            this.userDataMap = new LinkedHashMap();
        }
        this.userDataMap.put(aVar, obj);
    }

    public void setActual(boolean z) {
        this.isActual = z;
    }

    public void setExpect(boolean z) {
        this.isExpect = z;
    }

    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = z;
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = z;
    }

    public void setInfix(boolean z) {
        this.isInfix = z;
    }

    public void setInline(boolean z) {
        this.isInline = z;
    }

    public void setOperator(boolean z) {
        this.isOperator = z;
    }

    public void setOverriddenDescriptors(Collection<? extends C6023b> collection) {
        if (collection == null) {
            $$$reportNull$$$0(15);
        }
        this.overriddenFunctions = collection;
        Iterator<? extends C6023b> it = collection.iterator();
        while (it.hasNext()) {
            if (((C6244v) it.next()).isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.isHiddenForResolutionEverywhereBesideSupercalls = true;
                return;
            }
        }
    }

    public void setReturnType(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(10);
        }
        this.unsubstitutedReturnType = c0Var;
    }

    public void setSuspend(boolean z) {
        this.isSuspend = z;
    }

    public void setTailrec(boolean z) {
        this.isTailrec = z;
    }

    public void setVisibility(C6233r rVar) {
        if (rVar == null) {
            $$$reportNull$$$0(9);
        }
        this.visibility = rVar;
    }

    public C6244v substitute(C7448b1 b1Var) {
        if (b1Var == null) {
            $$$reportNull$$$0(20);
        }
        if (b1Var.mo25051h()) {
            return this;
        }
        C6139c newCopyBuilder = newCopyBuilder(b1Var);
        C6244v original2 = getOriginal();
        Objects.requireNonNull(newCopyBuilder);
        newCopyBuilder.f12128e = original2;
        newCopyBuilder.f12137n = true;
        newCopyBuilder.f12145v = true;
        return newCopyBuilder.mo23292e();
    }
}
