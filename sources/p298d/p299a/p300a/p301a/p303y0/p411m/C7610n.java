package p298d.p299a.p300a.p301a.p303y0.p411m;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.m.n */
public abstract class C7610n implements C7589b {

    /* renamed from: a */
    public final String f15095a;

    /* renamed from: b */
    public final C6862l<KotlinBuiltIns, C7452c0> f15096b;

    /* renamed from: c */
    public final String f15097c;

    /* renamed from: d.a.a.a.y0.m.n$a */
    public static final class C7611a extends C7610n {

        /* renamed from: d */
        public static final C7611a f15098d = new C7611a();

        /* renamed from: d.a.a.a.y0.m.n$a$a */
        public static final class C7612a extends C6890k implements C6862l<KotlinBuiltIns, C7452c0> {

            /* renamed from: g */
            public static final C7612a f15099g = new C7612a();

            public C7612a() {
                super(1);
            }

            public Object invoke(Object obj) {
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                C6888i.m12438e(kotlinBuiltIns, "<this>");
                C7489j0 booleanType = kotlinBuiltIns.getBooleanType();
                C6888i.m12437d(booleanType, "booleanType");
                return booleanType;
            }
        }

        public C7611a() {
            super("Boolean", C7612a.f15099g, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: d.a.a.a.y0.m.n$b */
    public static final class C7613b extends C7610n {

        /* renamed from: d */
        public static final C7613b f15100d = new C7613b();

        /* renamed from: d.a.a.a.y0.m.n$b$a */
        public static final class C7614a extends C6890k implements C6862l<KotlinBuiltIns, C7452c0> {

            /* renamed from: g */
            public static final C7614a f15101g = new C7614a();

            public C7614a() {
                super(1);
            }

            public Object invoke(Object obj) {
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                C6888i.m12438e(kotlinBuiltIns, "<this>");
                C7489j0 intType = kotlinBuiltIns.getIntType();
                C6888i.m12437d(intType, "intType");
                return intType;
            }
        }

        public C7613b() {
            super("Int", C7614a.f15101g, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: d.a.a.a.y0.m.n$c */
    public static final class C7615c extends C7610n {

        /* renamed from: d */
        public static final C7615c f15102d = new C7615c();

        /* renamed from: d.a.a.a.y0.m.n$c$a */
        public static final class C7616a extends C6890k implements C6862l<KotlinBuiltIns, C7452c0> {

            /* renamed from: g */
            public static final C7616a f15103g = new C7616a();

            public C7616a() {
                super(1);
            }

            public Object invoke(Object obj) {
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                C6888i.m12438e(kotlinBuiltIns, "<this>");
                C7489j0 unitType = kotlinBuiltIns.getUnitType();
                C6888i.m12437d(unitType, "unitType");
                return unitType;
            }
        }

        public C7615c() {
            super("Unit", C7616a.f15103g, (DefaultConstructorMarker) null);
        }
    }

    public C7610n(String str, C6862l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.f15095a = str;
        this.f15096b = lVar;
        this.f15097c = C6888i.m12444k("must return ", str);
    }

    /* renamed from: a */
    public String mo25196a(C6244v vVar) {
        return C5266a.m9992m2(this, vVar);
    }

    /* renamed from: b */
    public boolean mo25197b(C6244v vVar) {
        C6888i.m12438e(vVar, "functionDescriptor");
        return C6888i.m12434a(vVar.getReturnType(), this.f15096b.invoke(C7255a.m13133f(vVar)));
    }

    public String getDescription() {
        return this.f15097c;
    }
}
