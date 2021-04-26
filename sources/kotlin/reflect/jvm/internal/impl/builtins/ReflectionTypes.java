package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6025b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7554o0;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;
import p298d.p415c0.C7694h;

public final class ReflectionTypes {
    public static final /* synthetic */ C6736l<Object>[] $$delegatedProperties;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ClassLookup kClass$delegate = new ClassLookup(1);
    private final ClassLookup kMutableProperty0$delegate = new ClassLookup(1);
    private final ClassLookup kMutableProperty1$delegate = new ClassLookup(2);
    private final ClassLookup kMutableProperty2$delegate = new ClassLookup(3);
    private final ClassLookup kProperty$delegate = new ClassLookup(1);
    private final ClassLookup kProperty0$delegate = new ClassLookup(1);
    private final ClassLookup kProperty1$delegate = new ClassLookup(2);
    private final ClassLookup kProperty2$delegate = new ClassLookup(3);
    private final C6764f kotlinReflectScope$delegate;
    private final C6025b0 notFoundClasses;

    public static final class ClassLookup {
        private final int numberOfTypeParameters;

        public ClassLookup(int i) {
            this.numberOfTypeParameters = i;
        }

        public final C6046e getValue(ReflectionTypes reflectionTypes, C6736l<?> lVar) {
            C6888i.m12438e(reflectionTypes, "types");
            C6888i.m12438e(lVar, "property");
            return reflectionTypes.find(C7694h.m13923a(lVar.getName()), this.numberOfTypeParameters);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7452c0 createKPropertyStarType(C6021a0 a0Var) {
            C6888i.m12438e(a0Var, "module");
            C6046e N0 = C5266a.m9849N0(a0Var, StandardNames.FqNames.kProperty);
            if (N0 == null) {
                return null;
            }
            C7455d0 d0Var = C7455d0.f14869a;
            Objects.requireNonNull(C6060h.f11920d);
            C6060h hVar = C6060h.C6061a.f11922b;
            List<C6248w0> parameters = N0.getTypeConstructor().getParameters();
            C6888i.m12437d(parameters, "kPropertyClass.typeConstructor.parameters");
            Object P = C6790h.m12329P(parameters);
            C6888i.m12437d(P, "kPropertyClass.typeConstructor.parameters.single()");
            return C7455d0.m13430e(hVar, N0, C5266a.m9910Y2(new C7554o0((C6248w0) P)));
        }
    }

    static {
        Class<ReflectionTypes> cls = ReflectionTypes.class;
        C6736l<Object>[] lVarArr = new C6736l[9];
        lVarArr[1] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        lVarArr[2] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        lVarArr[3] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        lVarArr[4] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        lVarArr[5] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        lVarArr[6] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        lVarArr[7] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        lVarArr[8] = C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        $$delegatedProperties = lVarArr;
    }

    public ReflectionTypes(C6021a0 a0Var, C6025b0 b0Var) {
        C6888i.m12438e(a0Var, "module");
        C6888i.m12438e(b0Var, "notFoundClasses");
        this.notFoundClasses = b0Var;
        this.kotlinReflectScope$delegate = C5266a.m9885T2(C6765g.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(a0Var));
    }

    /* access modifiers changed from: private */
    public final C6046e find(String str, int i) {
        C6717d l = C6717d.m12270l(str);
        C6888i.m12437d(l, "identifier(className)");
        C6083h contributedClassifier = getKotlinReflectScope().getContributedClassifier(l, C6260d.FROM_REFLECTION);
        C6046e eVar = contributedClassifier instanceof C6046e ? (C6046e) contributedClassifier : null;
        return eVar == null ? this.notFoundClasses.mo23099a(new C6713a(StandardNames.KOTLIN_REFLECT_FQ_NAME, l), C5266a.m9910Y2(Integer.valueOf(i))) : eVar;
    }

    private final C7277h getKotlinReflectScope() {
        return (C7277h) this.kotlinReflectScope$delegate.getValue();
    }

    public final C6046e getKClass() {
        return this.kClass$delegate.getValue(this, $$delegatedProperties[1]);
    }
}
