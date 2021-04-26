package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7584y0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.v.s */
public final class C7242s extends C7227g<C7243a> {

    /* renamed from: d.a.a.a.y0.i.v.s$a */
    public static abstract class C7243a {

        /* renamed from: d.a.a.a.y0.i.v.s$a$a */
        public static final class C7244a extends C7243a {

            /* renamed from: a */
            public final C7452c0 f14472a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7244a(C7452c0 c0Var) {
                super((DefaultConstructorMarker) null);
                C6888i.m12438e(c0Var, "type");
                this.f14472a = c0Var;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7244a) && C6888i.m12434a(this.f14472a, ((C7244a) obj).f14472a);
            }

            public int hashCode() {
                return this.f14472a.hashCode();
            }

            public String toString() {
                StringBuilder u = C0843a.m460u("LocalClass(type=");
                u.append(this.f14472a);
                u.append(')');
                return u.toString();
            }
        }

        /* renamed from: d.a.a.a.y0.i.v.s$a$b */
        public static final class C7245b extends C7243a {

            /* renamed from: a */
            public final C7226f f14473a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7245b(C7226f fVar) {
                super((DefaultConstructorMarker) null);
                C6888i.m12438e(fVar, "value");
                this.f14473a = fVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7245b) && C6888i.m12434a(this.f14473a, ((C7245b) obj).f14473a);
            }

            public int hashCode() {
                return this.f14473a.hashCode();
            }

            public String toString() {
                StringBuilder u = C0843a.m460u("NormalClass(value=");
                u.append(this.f14473a);
                u.append(')');
                return u.toString();
            }
        }

        public C7243a() {
        }

        public C7243a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7242s(C6713a aVar, int i) {
        this(new C7226f(aVar, i));
        C6888i.m12438e(aVar, "classId");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7242s(p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7226f r3) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            d.a.a.a.y0.i.v.s$a$b r1 = new d.a.a.a.y0.i.v.s$a$b
            r1.<init>(r3)
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7242s.<init>(d.a.a.a.y0.i.v.f):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7242s(C7243a aVar) {
        super(aVar);
        C6888i.m12438e(aVar, "value");
    }

    /* renamed from: a */
    public C7452c0 mo24893a(C6021a0 a0Var) {
        C7452c0 c0Var;
        C6888i.m12438e(a0Var, "module");
        C7455d0 d0Var = C7455d0.f14869a;
        Objects.requireNonNull(C6060h.f11920d);
        C6060h hVar = C6060h.C6061a.f11922b;
        C6046e kClass = a0Var.getBuiltIns().getKClass();
        C6888i.m12437d(kClass, "module.builtIns.kClass");
        C6888i.m12438e(a0Var, "module");
        T t = this.f14459a;
        C7243a aVar = (C7243a) t;
        if (aVar instanceof C7243a.C7244a) {
            c0Var = ((C7243a.C7244a) t).f14472a;
        } else if (aVar instanceof C7243a.C7245b) {
            C7226f fVar = ((C7243a.C7245b) t).f14473a;
            C6713a aVar2 = fVar.f14457a;
            int i = fVar.f14458b;
            C6046e N0 = C5266a.m9849N0(a0Var, aVar2);
            if (N0 == null) {
                c0Var = C7570v.m13783d("Unresolved type: " + aVar2 + " (arrayDimensions=" + i + ')');
                C6888i.m12437d(c0Var, "createErrorType(\"Unresolved type: $classId (arrayDimensions=$arrayDimensions)\")");
            } else {
                C7489j0 defaultType = N0.getDefaultType();
                C6888i.m12437d(defaultType, "descriptor.defaultType");
                C7452c0 C3 = C5266a.m9786C3(defaultType);
                for (int i2 = 0; i2 < i; i2++) {
                    C3 = a0Var.getBuiltIns().getArrayType(C7484h1.INVARIANT, C3);
                    C6888i.m12437d(C3, "module.builtIns.getArrayType(Variance.INVARIANT, type)");
                }
                c0Var = C3;
            }
        } else {
            throw new C6766h();
        }
        return C7455d0.m13430e(hVar, kClass, C5266a.m9910Y2(new C7584y0(c0Var)));
    }
}
