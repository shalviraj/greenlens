package p298d.p299a.p300a.p301a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.C5897e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6522y;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6654n;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.f */
public abstract class C5907f {

    /* renamed from: d.a.a.a.f$a */
    public static final class C5908a extends C5907f {

        /* renamed from: a */
        public final Field f11698a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5908a(Field field) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(field, "field");
            this.f11698a = field;
        }

        /* renamed from: a */
        public String mo23005a() {
            StringBuilder sb = new StringBuilder();
            String name = this.f11698a.getName();
            C6888i.m12437d(name, "field.name");
            sb.append(C6522y.m11550a(name));
            sb.append("()");
            Class<?> type = this.f11698a.getType();
            C6888i.m12437d(type, "field.type");
            sb.append(C6173b.m11074c(type));
            return sb.toString();
        }
    }

    /* renamed from: d.a.a.a.f$b */
    public static final class C5909b extends C5907f {

        /* renamed from: a */
        public final Method f11699a;

        /* renamed from: b */
        public final Method f11700b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5909b(Method method, Method method2) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(method, "getterMethod");
            this.f11699a = method;
            this.f11700b = method2;
        }

        /* renamed from: a */
        public String mo23005a() {
            return C5266a.m9989m(this.f11699a);
        }
    }

    /* renamed from: d.a.a.a.f$c */
    public static final class C5910c extends C5907f {

        /* renamed from: a */
        public final String f11701a;

        /* renamed from: b */
        public final C6207k0 f11702b;

        /* renamed from: c */
        public final C6654n f11703c;

        /* renamed from: d */
        public final C6582a.C6590d f11704d;

        /* renamed from: e */
        public final C6705c f11705e;

        /* renamed from: f */
        public final C6707e f11706f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x009d, code lost:
            r3 = r6.mo23725a(r3.intValue());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5910c(p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0 r3, p298d.p299a.p300a.p301a.p303y0.p326e.C6654n r4, p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a.C6590d r5, p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c r6, p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e r7) {
            /*
                r2 = this;
                java.lang.String r0 = "descriptor"
                p298d.p344x.p346c.C6888i.m12438e(r3, r0)
                java.lang.String r0 = "proto"
                p298d.p344x.p346c.C6888i.m12438e(r4, r0)
                java.lang.String r0 = "signature"
                p298d.p344x.p346c.C6888i.m12438e(r5, r0)
                java.lang.String r0 = "nameResolver"
                p298d.p344x.p346c.C6888i.m12438e(r6, r0)
                java.lang.String r0 = "typeTable"
                p298d.p344x.p346c.C6888i.m12438e(r7, r0)
                r0 = 0
                r2.<init>(r0)
                r2.f11702b = r3
                r2.f11703c = r4
                r2.f11704d = r5
                r2.f11705e = r6
                r2.f11706f = r7
                boolean r0 = r5.mo23703j()
                if (r0 == 0) goto L_0x0056
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                d.a.a.a.y0.e.a0.a$c r4 = r5.f12948k
                java.lang.String r7 = "signature.getter"
                p298d.p344x.p346c.C6888i.m12437d(r4, r7)
                int r4 = r4.f12935i
                java.lang.String r4 = r6.mo23725a(r4)
                r3.append(r4)
                d.a.a.a.y0.e.a0.a$c r4 = r5.f12948k
                p298d.p344x.p346c.C6888i.m12437d(r4, r7)
                int r4 = r4.f12936j
                java.lang.String r4 = r6.mo23725a(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                goto L_0x00f8
            L_0x0056:
                d.a.a.a.y0.e.a0.b.h r5 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.f13014a
                r0 = 1
                d.a.a.a.y0.e.a0.b.e$a r4 = r5.mo23730b(r4, r6, r7, r0)
                if (r4 == 0) goto L_0x00fb
                java.lang.String r5 = r4.f13001a
                java.lang.String r4 = r4.f13002b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r5 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6522y.m11550a(r5)
                r7.append(r5)
                d.a.a.a.y0.b.k r5 = r3.getContainingDeclaration()
                java.lang.String r0 = "descriptor.containingDeclaration"
                p298d.p344x.p346c.C6888i.m12437d(r5, r0)
                d.a.a.a.y0.b.r r0 = r3.getVisibility()
                d.a.a.a.y0.b.r r1 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12244d
                boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
                java.lang.String r1 = "$"
                if (r0 == 0) goto L_0x00be
                boolean r0 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d
                if (r0 == 0) goto L_0x00be
                d.a.a.a.y0.j.b.f0.d r5 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d) r5
                d.a.a.a.y0.e.c r3 = r5.f14594g
                d.a.a.a.y0.g.h$f<d.a.a.a.y0.e.c, java.lang.Integer> r5 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a.f12914i
                java.lang.String r0 = "JvmProtoBuf.classModuleName"
                p298d.p344x.p346c.C6888i.m12437d(r5, r0)
                java.lang.Object r3 = p005b.p291q.p292a.C5266a.m10009p1(r3, r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x00a8
                int r3 = r3.intValue()
                java.lang.String r3 = r6.mo23725a(r3)
                if (r3 == 0) goto L_0x00a8
                goto L_0x00aa
            L_0x00a8:
                java.lang.String r3 = "main"
            L_0x00aa:
                java.lang.StringBuilder r5 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
                d.c0.d r6 = p298d.p299a.p300a.p301a.p303y0.p331f.C6718e.f13625a
                java.lang.String r6 = "name"
                p298d.p344x.p346c.C6888i.m12438e(r3, r6)
                d.c0.d r6 = p298d.p299a.p300a.p301a.p303y0.p331f.C6718e.f13625a
                java.lang.String r0 = "_"
                java.lang.String r3 = r6.mo25279b(r3, r0)
                goto L_0x00e8
            L_0x00be:
                d.a.a.a.y0.b.r r6 = r3.getVisibility()
                d.a.a.a.y0.b.r r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12241a
                boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r0)
                if (r6 == 0) goto L_0x00f0
                boolean r5 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0
                if (r5 == 0) goto L_0x00f0
                d.a.a.a.y0.j.b.f0.k r3 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7369k) r3
                d.a.a.a.y0.j.b.f0.g r3 = r3.f14706G
                boolean r5 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6541g
                if (r5 == 0) goto L_0x00f0
                d.a.a.a.y0.d.b.g r3 = (p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6541g) r3
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r5 = r3.f12835c
                if (r5 == 0) goto L_0x00f0
                java.lang.StringBuilder r5 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
                d.a.a.a.y0.f.d r3 = r3.mo23644d()
                java.lang.String r3 = r3.mo23886e()
            L_0x00e8:
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                goto L_0x00f2
            L_0x00f0:
                java.lang.String r3 = ""
            L_0x00f2:
                java.lang.String r5 = "()"
                java.lang.String r3 = p005b.p035e.p036a.p037a.C0843a.m456q(r7, r3, r5, r4)
            L_0x00f8:
                r2.f11701a = r3
                return
            L_0x00fb:
                d.a.a.a.l0 r4 = new d.a.a.a.l0
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "No field signature for property: "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5907f.C5910c.<init>(d.a.a.a.y0.b.k0, d.a.a.a.y0.e.n, d.a.a.a.y0.e.a0.a$d, d.a.a.a.y0.e.z.c, d.a.a.a.y0.e.z.e):void");
        }

        /* renamed from: a */
        public String mo23005a() {
            return this.f11701a;
        }
    }

    /* renamed from: d.a.a.a.f$d */
    public static final class C5911d extends C5907f {

        /* renamed from: a */
        public final C5897e.C5905e f11707a;

        /* renamed from: b */
        public final C5897e.C5905e f11708b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5911d(C5897e.C5905e eVar, C5897e.C5905e eVar2) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(eVar, "getterSignature");
            this.f11707a = eVar;
            this.f11708b = eVar2;
        }

        /* renamed from: a */
        public String mo23005a() {
            return this.f11707a.f11695a;
        }
    }

    public C5907f(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* renamed from: a */
    public abstract String mo23005a();
}
