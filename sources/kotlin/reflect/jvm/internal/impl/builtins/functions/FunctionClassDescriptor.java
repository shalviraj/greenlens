package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6242u0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6087b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6121m0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7446b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7584y0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p333a0.C6758d;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p334t.C6804v;
import p298d.p344x.p346c.C6888i;

public final class FunctionClassDescriptor extends C6087b {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C6713a functionClassId = new C6713a(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, C6717d.m12270l("Function"));
    /* access modifiers changed from: private */
    public static final C6713a kFunctionClassId = new C6713a(StandardNames.KOTLIN_REFLECT_FQ_NAME, C6717d.m12270l("KFunction"));
    private final int arity;
    /* access modifiers changed from: private */
    public final C6032c0 containingDeclaration;
    private final FunctionClassKind functionKind;
    private final FunctionClassScope memberScope;
    /* access modifiers changed from: private */
    public final List<C6248w0> parameters;
    /* access modifiers changed from: private */
    public final C7441m storageManager;
    private final FunctionTypeConstructor typeConstructor = new FunctionTypeConstructor(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class FunctionTypeConstructor extends C7446b {
        public final /* synthetic */ FunctionClassDescriptor this$0;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = {1, 3, 2, 4};

            static {
                FunctionClassKind.values();
                FunctionClassKind functionClassKind = FunctionClassKind.Function;
                FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
                FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
                FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FunctionTypeConstructor(FunctionClassDescriptor functionClassDescriptor) {
            super(functionClassDescriptor.storageManager);
            C6888i.m12438e(functionClassDescriptor, "this$0");
            this.this$0 = functionClassDescriptor;
        }

        public Collection<C7452c0> computeSupertypes() {
            List<C6713a> list;
            List<T> list2;
            int ordinal = this.this$0.getFunctionKind().ordinal();
            if (ordinal == 0 || ordinal == 1) {
                list = C5266a.m9910Y2(FunctionClassDescriptor.functionClassId);
            } else if (ordinal == 2) {
                list = C6790h.m12314A(FunctionClassDescriptor.kFunctionClassId, new C6713a(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, FunctionClassKind.Function.numberedClassName(this.this$0.getArity())));
            } else if (ordinal == 3) {
                list = C6790h.m12314A(FunctionClassDescriptor.kFunctionClassId, new C6713a(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE, FunctionClassKind.SuspendFunction.numberedClassName(this.this$0.getArity())));
            } else {
                throw new C6766h();
            }
            C6021a0 containingDeclaration = this.this$0.containingDeclaration.getContainingDeclaration();
            ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
            for (C6713a aVar : list) {
                C6046e N0 = C5266a.m9849N0(containingDeclaration, aVar);
                if (N0 != null) {
                    List<C6248w0> parameters = getParameters();
                    int size = N0.getTypeConstructor().getParameters().size();
                    C6888i.m12438e(parameters, "$this$takeLast");
                    if (size >= 0) {
                        if (size == 0) {
                            list2 = C6798p.f13713g;
                        } else {
                            int size2 = parameters.size();
                            if (size >= size2) {
                                list2 = C6790h.m12337X(parameters);
                            } else if (size == 1) {
                                list2 = C5266a.m9910Y2(C6790h.m12371y(parameters));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (parameters instanceof RandomAccess) {
                                    for (int i = size2 - size; i < size2; i++) {
                                        arrayList2.add(parameters.get(i));
                                    }
                                } else {
                                    ListIterator<C6248w0> listIterator = parameters.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                list2 = arrayList2;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(C5266a.m9892V(list2, 10));
                        for (T defaultType : list2) {
                            arrayList3.add(new C7584y0(defaultType.getDefaultType()));
                        }
                        C7455d0 d0Var = C7455d0.f14869a;
                        Objects.requireNonNull(C6060h.f11920d);
                        arrayList.add(C7455d0.m13430e(C6060h.C6061a.f11922b, N0, arrayList3));
                    } else {
                        throw new IllegalArgumentException(C0843a.m445f("Requested element count ", size, " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + aVar + " not found").toString());
                }
            }
            return C6790h.m12337X(arrayList);
        }

        public FunctionClassDescriptor getDeclarationDescriptor() {
            return this.this$0;
        }

        public List<C6248w0> getParameters() {
            return this.this$0.parameters;
        }

        public C6242u0 getSupertypeLoopChecker() {
            return C6242u0.C6243a.f12261a;
        }

        public boolean isDenotable() {
            return true;
        }

        public String toString() {
            return getDeclarationDescriptor().toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(C7441m mVar, C6032c0 c0Var, FunctionClassKind functionClassKind, int i) {
        super(mVar, functionClassKind.numberedClassName(i));
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(c0Var, "containingDeclaration");
        C6888i.m12438e(functionClassKind, "functionKind");
        this.storageManager = mVar;
        this.containingDeclaration = c0Var;
        this.functionKind = functionClassKind;
        this.arity = i;
        this.memberScope = new FunctionClassScope(mVar, this);
        ArrayList arrayList = new ArrayList();
        C6758d dVar = new C6758d(1, i);
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(dVar, 10));
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            _init_$typeParameter(arrayList, this, C7484h1.IN_VARIANCE, C6888i.m12444k("P", Integer.valueOf(((C6804v) it).nextInt())));
            arrayList2.add(C6777r.f13694a);
        }
        _init_$typeParameter(arrayList, this, C7484h1.OUT_VARIANCE, "R");
        this.parameters = C6790h.m12337X(arrayList);
    }

    private static final void _init_$typeParameter(ArrayList<C6248w0> arrayList, FunctionClassDescriptor functionClassDescriptor, C7484h1 h1Var, String str) {
        Objects.requireNonNull(C6060h.f11920d);
        arrayList.add(C6121m0.m10978W(functionClassDescriptor, C6060h.C6061a.f11922b, false, h1Var, C6717d.m12270l(str), arrayList.size(), functionClassDescriptor.storageManager));
    }

    public C6060h getAnnotations() {
        Objects.requireNonNull(C6060h.f11920d);
        return C6060h.C6061a.f11922b;
    }

    public final int getArity() {
        return this.arity;
    }

    public Void getCompanionObjectDescriptor() {
        return null;
    }

    public List<C6034d> getConstructors() {
        return C6798p.f13713g;
    }

    public C6032c0 getContainingDeclaration() {
        return this.containingDeclaration;
    }

    public List<C6248w0> getDeclaredTypeParameters() {
        return this.parameters;
    }

    public final FunctionClassKind getFunctionKind() {
        return this.functionKind;
    }

    public C6051f getKind() {
        return C6051f.INTERFACE;
    }

    public C6251y getModality() {
        return C6251y.ABSTRACT;
    }

    public List<C6046e> getSealedSubclasses() {
        return C6798p.f13713g;
    }

    public C6234r0 getSource() {
        C6234r0 r0Var = C6234r0.f12257a;
        C6888i.m12437d(r0Var, "NO_SOURCE");
        return r0Var;
    }

    public C7277h.C7280b getStaticScope() {
        return C7277h.C7280b.f14521b;
    }

    public C7567t0 getTypeConstructor() {
        return this.typeConstructor;
    }

    public FunctionClassScope getUnsubstitutedMemberScope(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return this.memberScope;
    }

    public Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public C6233r getVisibility() {
        C6233r rVar = C6219q.f12245e;
        C6888i.m12437d(rVar, "PUBLIC");
        return rVar;
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

    public boolean isExternal() {
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
        String e = getName().mo23886e();
        C6888i.m12437d(e, "name.asString()");
        return e;
    }
}
