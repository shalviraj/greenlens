package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6053a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6268c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6514t;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6521x;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7636i;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7638k;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.k0.l */
public final class C6483l {

    /* renamed from: a */
    public final C6268c f12705a;

    /* renamed from: b */
    public final C7636i f12706b;

    /* renamed from: c */
    public final C6445d f12707c;

    /* renamed from: d.a.a.a.y0.d.a.k0.l$a */
    public static class C6484a {

        /* renamed from: a */
        public final C7452c0 f12708a;

        /* renamed from: b */
        public final boolean f12709b;

        /* renamed from: c */
        public final boolean f12710c;

        public C6484a(C7452c0 c0Var, boolean z, boolean z2) {
            C6888i.m12438e(c0Var, "type");
            this.f12708a = c0Var;
            this.f12709b = z;
            this.f12710c = z2;
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.k0.l$b */
    public final class C6485b {

        /* renamed from: a */
        public final C6053a f12711a;

        /* renamed from: b */
        public final C7452c0 f12712b;

        /* renamed from: c */
        public final Collection<C7452c0> f12713c;

        /* renamed from: d */
        public final boolean f12714d;

        /* renamed from: e */
        public final C6328g f12715e;

        /* renamed from: f */
        public final C6264a f12716f;

        /* renamed from: g */
        public final boolean f12717g;

        /* renamed from: d.a.a.a.y0.d.a.k0.l$b$a */
        public static final class C6486a extends C6890k implements C6862l<C7481g1, Boolean> {

            /* renamed from: g */
            public static final C6486a f12719g = new C6486a();

            public C6486a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C6083h declarationDescriptor = ((C7481g1) obj).mo24887V().getDeclarationDescriptor();
                if (declarationDescriptor == null) {
                    return Boolean.FALSE;
                }
                C6717d name = declarationDescriptor.getName();
                JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                return Boolean.valueOf(C6888i.m12434a(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().mo23868g()) && C6888i.m12434a(C7255a.m13131d(declarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
            }
        }

        /* renamed from: d.a.a.a.y0.d.a.k0.l$b$b */
        public static final class C6487b extends C6890k implements C6862l<Integer, C6448e> {

            /* renamed from: g */
            public final /* synthetic */ C6499u f12720g;

            /* renamed from: h */
            public final /* synthetic */ C6862l<Integer, C6448e> f12721h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6487b(C6499u uVar, C6862l<? super Integer, C6448e> lVar) {
                super(1);
                this.f12720g = uVar;
                this.f12721h = lVar;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                C6448e eVar = this.f12720g.f12743a.get(Integer.valueOf(intValue));
                return eVar == null ? this.f12721h.invoke(Integer.valueOf(intValue)) : eVar;
            }
        }

        public C6485b(C6483l lVar, C6053a aVar, C7452c0 c0Var, Collection<? extends C7452c0> collection, boolean z, C6328g gVar, C6264a aVar2, boolean z2) {
            C6888i.m12438e(lVar, "this$0");
            C6888i.m12438e(c0Var, "fromOverride");
            C6888i.m12438e(collection, "fromOverridden");
            C6888i.m12438e(gVar, "containerContext");
            C6888i.m12438e(aVar2, "containerApplicabilityType");
            C6483l.this = lVar;
            this.f12711a = aVar;
            this.f12712b = c0Var;
            this.f12713c = collection;
            this.f12714d = z;
            this.f12715e = gVar;
            this.f12716f = aVar2;
            this.f12717g = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C6485b(C6053a aVar, C7452c0 c0Var, Collection collection, boolean z, C6328g gVar, C6264a aVar2, boolean z2, int i) {
            this(C6483l.this, aVar, c0Var, collection, z, gVar, aVar2, (i & 64) != 0 ? false : z2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final <T> T m11515d(java.util.List<p298d.p299a.p300a.p301a.p303y0.p331f.C6714b> r3, p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h r4, T r5) {
            /*
                boolean r0 = r3 instanceof java.util.Collection
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x000d
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L_0x000d
                goto L_0x0029
            L_0x000d:
                java.util.Iterator r3 = r3.iterator()
            L_0x0011:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                d.a.a.a.y0.f.b r0 = (p298d.p299a.p300a.p301a.p303y0.p331f.C6714b) r0
                d.a.a.a.y0.b.f1.c r0 = r4.mo23168j(r0)
                if (r0 == 0) goto L_0x0025
                r0 = r1
                goto L_0x0026
            L_0x0025:
                r0 = r2
            L_0x0026:
                if (r0 == 0) goto L_0x0011
                goto L_0x002a
            L_0x0029:
                r1 = r2
            L_0x002a:
                if (r1 == 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r5 = 0
            L_0x002e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6485b.m11515d(java.util.List, d.a.a.a.y0.b.f1.h, java.lang.Object):java.lang.Object");
        }

        /* renamed from: e */
        public static final void m11516e(C6485b bVar, ArrayList<C6497s> arrayList, C7452c0 c0Var, C6328g gVar, C6248w0 w0Var) {
            C6514t tVar;
            C6328g l0 = C5266a.m9984l0(gVar, c0Var.getAnnotations());
            C6521x a = l0.mo23470a();
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f12766a.get(bVar.f12717g ? C6264a.TYPE_PARAMETER_BOUNDS : C6264a.TYPE_USE);
            }
            arrayList.add(new C6497s(c0Var, tVar, w0Var, false));
            List<C7580w0> U = c0Var.mo24886U();
            List<C6248w0> parameters = c0Var.mo24887V().getParameters();
            C6888i.m12437d(parameters, "type.constructor.parameters");
            Iterator it = ((ArrayList) C6790h.m12353g0(U, parameters)).iterator();
            while (it.hasNext()) {
                C6768j jVar = (C6768j) it.next();
                C7580w0 w0Var2 = (C7580w0) jVar.f13681g;
                C6248w0 w0Var3 = (C6248w0) jVar.f13682h;
                if (w0Var2.mo25163c()) {
                    C7452c0 a2 = w0Var2.mo25161a();
                    C6888i.m12437d(a2, "arg.type");
                    arrayList.add(new C6497s(a2, tVar, w0Var3, true));
                } else {
                    C7452c0 a3 = w0Var2.mo25161a();
                    C6888i.m12437d(a3, "arg.type");
                    m11516e(bVar, arrayList, a3, l0, w0Var3);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h mo23582a(p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0 r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6396t
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                d.a.a.a.y0.d.a.h0.l.t r8 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6396t) r8
                java.util.List r0 = r8.getUpperBounds()
                java.lang.String r2 = "upperBounds"
                p298d.p344x.p346c.C6888i.m12437d(r0, r2)
                boolean r3 = r0.isEmpty()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x001a
                goto L_0x0032
            L_0x001a:
                java.util.Iterator r0 = r0.iterator()
            L_0x001e:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0032
                java.lang.Object r3 = r0.next()
                d.a.a.a.y0.l.c0 r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r3
                boolean r3 = p005b.p291q.p292a.C5266a.m10046v2(r3)
                if (r3 != 0) goto L_0x001e
                r0 = r4
                goto L_0x0033
            L_0x0032:
                r0 = r5
            L_0x0033:
                if (r0 == 0) goto L_0x0037
                goto L_0x00b4
            L_0x0037:
                java.util.List r0 = r8.getUpperBounds()
                p298d.p344x.p346c.C6888i.m12437d(r0, r2)
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L_0x0045
                goto L_0x0079
            L_0x0045:
                java.util.Iterator r0 = r0.iterator()
            L_0x0049:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0079
                java.lang.Object r3 = r0.next()
                d.a.a.a.y0.l.c0 r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r3
                d.a.a.a.y0.l.g1 r3 = r3.mo25056Y()
                boolean r6 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7579w
                if (r6 == 0) goto L_0x0060
                d.a.a.a.y0.l.w r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7579w) r3
                goto L_0x0061
            L_0x0060:
                r3 = r1
            L_0x0061:
                if (r3 != 0) goto L_0x0064
                goto L_0x0074
            L_0x0064:
                d.a.a.a.y0.l.j0 r6 = r3.f15029h
                boolean r6 = r6.mo23566W()
                d.a.a.a.y0.l.j0 r3 = r3.f15030i
                boolean r3 = r3.mo23566W()
                if (r6 == r3) goto L_0x0074
                r3 = r5
                goto L_0x0075
            L_0x0074:
                r3 = r4
            L_0x0075:
                if (r3 != 0) goto L_0x0049
                r0 = r4
                goto L_0x007a
            L_0x0079:
                r0 = r5
            L_0x007a:
                if (r0 == 0) goto L_0x007d
                goto L_0x00b4
            L_0x007d:
                java.util.List r8 = r8.getUpperBounds()
                p298d.p344x.p346c.C6888i.m12437d(r8, r2)
                boolean r0 = r8.isEmpty()
                if (r0 == 0) goto L_0x008b
                goto L_0x00ad
            L_0x008b:
                java.util.Iterator r8 = r8.iterator()
            L_0x008f:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x00ad
                java.lang.Object r0 = r8.next()
                d.a.a.a.y0.l.c0 r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r0
                java.lang.String r1 = "it"
                p298d.p344x.p346c.C6888i.m12437d(r0, r1)
                java.lang.String r1 = "<this>"
                p298d.p344x.p346c.C6888i.m12438e(r0, r1)
                boolean r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13441g(r0)
                r0 = r0 ^ r5
                if (r0 == 0) goto L_0x008f
                r4 = r5
            L_0x00ad:
                if (r4 == 0) goto L_0x00b2
                d.a.a.a.y0.d.a.k0.h r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NOT_NULL
                goto L_0x00b4
            L_0x00b2:
                d.a.a.a.y0.d.a.k0.h r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NULLABLE
            L_0x00b4:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6485b.mo23582a(d.a.a.a.y0.b.w0):d.a.a.a.y0.d.a.k0.h");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02bd, code lost:
            if ((r15.f12761c || !p005b.p291q.p292a.C5266a.m9827J2(r14)) != false) goto L_0x02c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0378, code lost:
            if (r5.f12664a == r7) goto L_0x039d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0398, code lost:
            if (p298d.p344x.p346c.C6888i.m12434a(r2, java.lang.Boolean.TRUE) != false) goto L_0x039d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x0422, code lost:
            if ((((r8 == null ? null : r8.mo23130p()) != null) && r12 && r3 == r6) == false) goto L_0x0426;
         */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0294  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x02aa  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x02af  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x02cd  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x02d0  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x02d3  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x02d5  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02db  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x02e4  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0314  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x032f  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x0373  */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x0376  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x037b  */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x03a2  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x03a4  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x03b8 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x03c5  */
        /* JADX WARNING: Removed duplicated region for block: B:203:0x03d0  */
        /* JADX WARNING: Removed duplicated region for block: B:204:0x03d2  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x03d5  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x03d7  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x03ea  */
        /* JADX WARNING: Removed duplicated region for block: B:211:0x03ec  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x03ef  */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x03f1  */
        /* JADX WARNING: Removed duplicated region for block: B:217:0x03f7 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:222:0x0403  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:241:0x0432  */
        /* JADX WARNING: Removed duplicated region for block: B:244:0x043d  */
        /* JADX WARNING: Removed duplicated region for block: B:248:0x0444  */
        /* JADX WARNING: Removed duplicated region for block: B:258:0x0465  */
        /* JADX WARNING: Removed duplicated region for block: B:261:0x046a A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:264:0x0478  */
        /* JADX WARNING: Removed duplicated region for block: B:265:0x047a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x04a0  */
        /* JADX WARNING: Removed duplicated region for block: B:271:0x04a2  */
        /* JADX WARNING: Removed duplicated region for block: B:274:0x04b8  */
        /* JADX WARNING: Removed duplicated region for block: B:277:0x04d6  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x04d9  */
        /* JADX WARNING: Removed duplicated region for block: B:280:0x04db  */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x04e3  */
        /* JADX WARNING: Removed duplicated region for block: B:304:0x0247 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:308:0x0325 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0231  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0244  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6484a mo23583b(p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6499u r30) {
            /*
                r29 = this;
                r0 = r29
                r1 = r30
                java.util.Collection<d.a.a.a.y0.l.c0> r2 = r0.f12713c
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r5 = p005b.p291q.p292a.C5266a.m9892V(r2, r4)
                r3.<init>(r5)
                java.util.Iterator r2 = r2.iterator()
            L_0x0015:
                boolean r5 = r2.hasNext()
                r6 = 1
                r7 = 0
                if (r5 == 0) goto L_0x0031
                java.lang.Object r5 = r2.next()
                d.a.a.a.y0.l.c0 r5 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r5
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r6)
                d.a.a.a.y0.d.a.h0.g r6 = r0.f12715e
                m11516e(r0, r8, r5, r6, r7)
                r3.add(r8)
                goto L_0x0015
            L_0x0031:
                d.a.a.a.y0.l.c0 r2 = r0.f12712b
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r6)
                d.a.a.a.y0.d.a.h0.g r8 = r0.f12715e
                m11516e(r0, r5, r2, r8, r7)
                boolean r2 = r0.f12714d
                if (r2 == 0) goto L_0x0070
                java.util.Collection<d.a.a.a.y0.l.c0> r2 = r0.f12713c
                boolean r9 = r2 instanceof java.util.Collection
                if (r9 == 0) goto L_0x004e
                boolean r9 = r2.isEmpty()
                if (r9 == 0) goto L_0x004e
                goto L_0x006b
            L_0x004e:
                java.util.Iterator r2 = r2.iterator()
            L_0x0052:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x006b
                java.lang.Object r9 = r2.next()
                d.a.a.a.y0.l.c0 r9 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r9
                d.a.a.a.y0.l.j1.d r10 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d.f14926a
                d.a.a.a.y0.l.c0 r11 = r0.f12712b
                boolean r9 = r10.mo25127b(r9, r11)
                r9 = r9 ^ r6
                if (r9 == 0) goto L_0x0052
                r2 = r6
                goto L_0x006c
            L_0x006b:
                r2 = 0
            L_0x006c:
                if (r2 == 0) goto L_0x0070
                r2 = r6
                goto L_0x0071
            L_0x0070:
                r2 = 0
            L_0x0071:
                if (r2 == 0) goto L_0x0075
                r2 = r6
                goto L_0x0079
            L_0x0075:
                int r2 = r5.size()
            L_0x0079:
                d.a.a.a.y0.d.a.k0.e[] r9 = new p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6448e[r2]
                r10 = 0
            L_0x007c:
                java.lang.String r11 = "<this>"
                if (r10 >= r2) goto L_0x0493
                if (r10 != 0) goto L_0x0084
                r12 = r6
                goto L_0x0085
            L_0x0084:
                r12 = 0
            L_0x0085:
                java.lang.Object r13 = r5.get(r10)
                d.a.a.a.y0.d.a.k0.s r13 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6497s) r13
                d.a.a.a.y0.l.c0 r14 = r13.f12735a
                d.a.a.a.y0.d.a.t r15 = r13.f12736b
                d.a.a.a.y0.b.w0 r8 = r13.f12737c
                boolean r13 = r13.f12738d
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r17 = r3.iterator()
            L_0x009c:
                boolean r18 = r17.hasNext()
                if (r18 == 0) goto L_0x00bd
                java.lang.Object r18 = r17.next()
                r6 = r18
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r6 = p298d.p334t.C6790h.m12365s(r6, r10)
                d.a.a.a.y0.d.a.k0.s r6 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6497s) r6
                if (r6 != 0) goto L_0x00b4
                r6 = 0
                goto L_0x00b6
            L_0x00b4:
                d.a.a.a.y0.l.c0 r6 = r6.f12735a
            L_0x00b6:
                if (r6 == 0) goto L_0x00bb
                r7.add(r6)
            L_0x00bb:
                r6 = 1
                goto L_0x009c
            L_0x00bd:
                d.a.a.a.y0.d.a.k0.h r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NULLABLE
                r17 = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r18 = r3
                int r3 = p005b.p291q.p292a.C5266a.m9892V(r7, r4)
                r2.<init>(r3)
                java.util.Iterator r3 = r7.iterator()
            L_0x00d0:
                boolean r19 = r3.hasNext()
                if (r19 == 0) goto L_0x00e8
                java.lang.Object r19 = r3.next()
                r4 = r19
                d.a.a.a.y0.l.c0 r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r4
                d.a.a.a.y0.d.a.k0.e r4 = r0.mo23584c(r4)
                r2.add(r4)
                r4 = 10
                goto L_0x00d0
            L_0x00e8:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r2.iterator()
            L_0x00f1:
                boolean r19 = r4.hasNext()
                if (r19 == 0) goto L_0x010b
                java.lang.Object r19 = r4.next()
                r20 = r4
                r4 = r19
                d.a.a.a.y0.d.a.k0.e r4 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6448e) r4
                d.a.a.a.y0.d.a.k0.f r4 = r4.f12653b
                if (r4 == 0) goto L_0x0108
                r3.add(r4)
            L_0x0108:
                r4 = r20
                goto L_0x00f1
            L_0x010b:
                java.util.Set r3 = p298d.p334t.C6790h.m12349e0(r3)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r19 = r2.iterator()
            L_0x0118:
                boolean r20 = r19.hasNext()
                if (r20 == 0) goto L_0x0132
                java.lang.Object r20 = r19.next()
                r21 = r5
                r5 = r20
                d.a.a.a.y0.d.a.k0.e r5 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6448e) r5
                d.a.a.a.y0.d.a.k0.h r5 = r5.f12652a
                if (r5 == 0) goto L_0x012f
                r4.add(r5)
            L_0x012f:
                r5 = r21
                goto L_0x0118
            L_0x0132:
                r21 = r5
                java.util.Set r4 = p298d.p334t.C6790h.m12349e0(r4)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0141:
                boolean r19 = r7.hasNext()
                if (r19 == 0) goto L_0x016b
                java.lang.Object r19 = r7.next()
                r20 = r7
                r7 = r19
                d.a.a.a.y0.l.c0 r7 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r7
                p298d.p344x.p346c.C6888i.m12438e(r7, r11)
                d.a.a.a.y0.l.c0 r19 = p005b.p291q.p292a.C5266a.m9997n1(r7)
                if (r19 != 0) goto L_0x015b
                goto L_0x015d
            L_0x015b:
                r7 = r19
            L_0x015d:
                d.a.a.a.y0.d.a.k0.e r7 = r0.mo23584c(r7)
                d.a.a.a.y0.d.a.k0.h r7 = r7.f12652a
                if (r7 == 0) goto L_0x0168
                r5.add(r7)
            L_0x0168:
                r7 = r20
                goto L_0x0141
            L_0x016b:
                java.util.Set r5 = p298d.p334t.C6790h.m12349e0(r5)
                d.a.a.a.y0.d.a.k0.h r7 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NOT_NULL
                d.a.a.a.y0.d.a.h0.g r11 = r0.f12715e
                d.a.a.a.y0.d.a.h0.c r11 = r11.f12460a
                d.a.a.a.y0.d.a.h0.d r11 = r11.f12447t
                boolean r11 = r11.mo23466b()
                if (r12 == 0) goto L_0x026f
                r19 = r15
                d.a.a.a.y0.b.f1.a r15 = r0.f12711a
                if (r15 == 0) goto L_0x0264
                boolean r1 = r15 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0
                if (r1 != 0) goto L_0x0264
                if (r11 == 0) goto L_0x0264
                d.a.a.a.y0.b.f1.h r1 = r15.getAnnotations()
                d.a.a.a.y0.d.a.k0.l r15 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.this
                r20 = r9
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x019a:
                boolean r22 = r1.hasNext()
                if (r22 == 0) goto L_0x0255
                r22 = r10
                java.lang.Object r10 = r1.next()
                r23 = r1
                r1 = r10
                d.a.a.a.y0.b.f1.c r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c) r1
                r24 = r2
                d.a.a.a.y0.d.a.c r2 = r15.f12705a
                java.util.Objects.requireNonNull(r2)
                r25 = r15
                java.lang.String r15 = "annotationDescriptor"
                p298d.p344x.p346c.C6888i.m12438e(r1, r15)
                d.a.a.a.y0.b.e r15 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13132e(r1)
                if (r15 != 0) goto L_0x01c4
                r27 = r3
                r26 = r5
                goto L_0x01d9
            L_0x01c4:
                d.a.a.a.y0.b.f1.h r15 = r15.getAnnotations()
                r26 = r5
                d.a.a.a.y0.f.b r5 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z.f12771c
                r27 = r3
                java.lang.String r3 = "TARGET_ANNOTATION"
                p298d.p344x.p346c.C6888i.m12437d(r5, r3)
                d.a.a.a.y0.b.f1.c r3 = r15.mo23168j(r5)
                if (r3 != 0) goto L_0x01db
            L_0x01d9:
                r2 = 0
                goto L_0x022e
            L_0x01db:
                java.util.Map r3 = r3.mo23163b()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x01ec:
                boolean r15 = r3.hasNext()
                if (r15 == 0) goto L_0x020f
                java.lang.Object r15 = r3.next()
                java.util.Map$Entry r15 = (java.util.Map.Entry) r15
                java.lang.Object r15 = r15.getValue()
                d.a.a.a.y0.i.v.g r15 = (p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g) r15
                r28 = r3
                d.a.a.a.y0.d.a.e r3 = new d.a.a.a.y0.d.a.e
                r3.<init>(r2)
                java.util.List r3 = r2.mo23446a(r15, r3)
                p298d.p334t.C6790h.m12342b(r5, r3)
                r3 = r28
                goto L_0x01ec
            L_0x020f:
                java.util.Iterator r2 = r5.iterator()
                r3 = 0
            L_0x0214:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x0229
                java.lang.Object r5 = r2.next()
                d.a.a.a.y0.d.a.a r5 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a) r5
                int r5 = r5.ordinal()
                r15 = 1
                int r5 = r15 << r5
                r3 = r3 | r5
                goto L_0x0214
            L_0x0229:
                d.a.a.a.y0.d.a.c$a r2 = new d.a.a.a.y0.d.a.c$a
                r2.<init>(r1, r3)
            L_0x022e:
                if (r2 != 0) goto L_0x0231
                goto L_0x0241
            L_0x0231:
                java.util.List r1 = r2.mo23450a()
                d.a.a.a.y0.d.a.a r2 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a.TYPE_USE
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L_0x0241
                r1 = 1
                goto L_0x0242
            L_0x0241:
                r1 = 0
            L_0x0242:
                if (r1 == 0) goto L_0x0247
                r9.add(r10)
            L_0x0247:
                r10 = r22
                r1 = r23
                r2 = r24
                r15 = r25
                r5 = r26
                r3 = r27
                goto L_0x019a
            L_0x0255:
                r24 = r2
                r27 = r3
                r26 = r5
                r22 = r10
                d.a.a.a.y0.b.f1.h$a r1 = p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h.f11920d
                d.a.a.a.y0.b.f1.h r1 = r1.mo23170a(r9)
                goto L_0x0285
            L_0x0264:
                r24 = r2
                r27 = r3
                r26 = r5
                r20 = r9
                r22 = r10
                goto L_0x027b
            L_0x026f:
                r24 = r2
                r27 = r3
                r26 = r5
                r20 = r9
                r22 = r10
                r19 = r15
            L_0x027b:
                if (r12 == 0) goto L_0x028e
                d.a.a.a.y0.b.f1.a r1 = r0.f12711a
                if (r1 == 0) goto L_0x028e
                d.a.a.a.y0.b.f1.h r1 = r1.getAnnotations()
            L_0x0285:
                d.a.a.a.y0.b.f1.h r2 = r14.getAnnotations()
                d.a.a.a.y0.b.f1.h r1 = p005b.p291q.p292a.C5266a.m9907Y(r1, r2)
                goto L_0x0292
            L_0x028e:
                d.a.a.a.y0.b.f1.h r1 = r14.getAnnotations()
            L_0x0292:
                if (r12 == 0) goto L_0x02aa
                d.a.a.a.y0.d.a.h0.g r2 = r0.f12715e
                d.a.a.a.y0.d.a.x r2 = r2.mo23470a()
                if (r2 != 0) goto L_0x029e
                r15 = 0
                goto L_0x02ac
            L_0x029e:
                d.a.a.a.y0.d.a.a r3 = r0.f12716f
                java.util.EnumMap<d.a.a.a.y0.d.a.a, d.a.a.a.y0.d.a.t> r2 = r2.f12766a
                java.lang.Object r2 = r2.get(r3)
                r15 = r2
                d.a.a.a.y0.d.a.t r15 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6514t) r15
                goto L_0x02ac
            L_0x02aa:
                r15 = r19
            L_0x02ac:
                if (r15 != 0) goto L_0x02af
                goto L_0x02c0
            L_0x02af:
                boolean r2 = r15.f12761c
                if (r2 != 0) goto L_0x02bc
                boolean r2 = p005b.p291q.p292a.C5266a.m9827J2(r14)
                if (r2 != 0) goto L_0x02ba
                goto L_0x02bc
            L_0x02ba:
                r2 = 0
                goto L_0x02bd
            L_0x02bc:
                r2 = 1
            L_0x02bd:
                if (r2 == 0) goto L_0x02c0
                goto L_0x02c1
            L_0x02c0:
                r15 = 0
            L_0x02c1:
                d.a.a.a.y0.l.t0 r2 = r14.mo24887V()
                d.a.a.a.y0.b.h r2 = r2.getDeclarationDescriptor()
                boolean r3 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0
                if (r3 == 0) goto L_0x02d0
                d.a.a.a.y0.b.w0 r2 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r2
                goto L_0x02d1
            L_0x02d0:
                r2 = 0
            L_0x02d1:
                if (r2 != 0) goto L_0x02d5
                r2 = 0
                goto L_0x02d9
            L_0x02d5:
                d.a.a.a.y0.d.a.k0.h r2 = r0.mo23582a(r2)
            L_0x02d9:
                if (r2 != 0) goto L_0x02e4
                d.j r2 = new d.j
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r5 = 0
                r2.<init>(r5, r3)
                goto L_0x02fa
            L_0x02e4:
                r5 = 0
                d.j r3 = new d.j
                d.a.a.a.y0.d.a.k0.i r9 = new d.a.a.a.y0.d.a.k0.i
                r10 = 0
                r9.<init>(r7, r10)
                if (r2 != r7) goto L_0x02f1
                r2 = 1
                goto L_0x02f2
            L_0x02f1:
                r2 = 0
            L_0x02f2:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r3.<init>(r9, r2)
                r2 = r3
            L_0x02fa:
                A r3 = r2.f13681g
                d.a.a.a.y0.d.a.k0.i r3 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i) r3
                B r2 = r2.f13682h
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                boolean r9 = r0.f12717g
                d.a.a.a.y0.d.a.k0.l r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.this
                java.util.Iterator r16 = r1.iterator()
            L_0x030e:
                boolean r19 = r16.hasNext()
                if (r19 == 0) goto L_0x0325
                java.lang.Object r19 = r16.next()
                r5 = r19
                d.a.a.a.y0.b.f1.c r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c) r5
                d.a.a.a.y0.d.a.k0.i r5 = r10.mo23578b(r5, r11, r9)
                if (r5 == 0) goto L_0x0323
                goto L_0x0326
            L_0x0323:
                r5 = 0
                goto L_0x030e
            L_0x0325:
                r5 = 0
            L_0x0326:
                if (r5 != 0) goto L_0x0329
                goto L_0x032c
            L_0x0329:
                if (r13 != 0) goto L_0x032c
                goto L_0x032d
            L_0x032c:
                r5 = 0
            L_0x032d:
                if (r5 != 0) goto L_0x0373
                if (r3 != 0) goto L_0x0344
                if (r15 != 0) goto L_0x0334
                goto L_0x0338
            L_0x0334:
                d.a.a.a.y0.d.a.k0.i r3 = r15.f12759a
                if (r3 != 0) goto L_0x033a
            L_0x0338:
                r3 = 0
                goto L_0x0344
            L_0x033a:
                d.a.a.a.y0.d.a.k0.i r9 = new d.a.a.a.y0.d.a.k0.i
                d.a.a.a.y0.d.a.k0.h r10 = r3.f12664a
                boolean r3 = r3.f12665b
                r9.<init>(r10, r3)
                r3 = r9
            L_0x0344:
                if (r8 != 0) goto L_0x0348
                r8 = 0
                goto L_0x034c
            L_0x0348:
                d.a.a.a.y0.d.a.k0.h r8 = r0.mo23582a(r8)
            L_0x034c:
                if (r8 != 0) goto L_0x034f
                goto L_0x0374
            L_0x034f:
                if (r3 != 0) goto L_0x0358
                d.a.a.a.y0.d.a.k0.i r3 = new d.a.a.a.y0.d.a.k0.i
                r9 = 0
                r3.<init>(r8, r9)
                goto L_0x0374
            L_0x0358:
                d.a.a.a.y0.d.a.k0.i r9 = new d.a.a.a.y0.d.a.k0.i
                d.a.a.a.y0.d.a.k0.h r3 = r3.f12664a
                d.a.a.a.y0.d.a.k0.h r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.FORCE_FLEXIBILITY
                if (r8 != r10) goto L_0x0361
                goto L_0x0366
            L_0x0361:
                if (r3 != r10) goto L_0x0364
                goto L_0x036c
            L_0x0364:
                if (r8 != r6) goto L_0x0368
            L_0x0366:
                r8 = r3
                goto L_0x036c
            L_0x0368:
                if (r3 != r6) goto L_0x036b
                goto L_0x036c
            L_0x036b:
                r8 = r7
            L_0x036c:
                r3 = 2
                r10 = 0
                r9.<init>(r8, r10, r3)
                r3 = r9
                goto L_0x0374
            L_0x0373:
                r3 = r5
            L_0x0374:
                if (r5 == 0) goto L_0x037b
                d.a.a.a.y0.d.a.k0.h r2 = r5.f12664a
                if (r2 != r7) goto L_0x039b
                goto L_0x039d
            L_0x037b:
                if (r2 != 0) goto L_0x039d
                if (r15 != 0) goto L_0x0381
                r2 = 0
                goto L_0x0392
            L_0x0381:
                d.a.a.a.y0.d.a.k0.i r2 = r15.f12759a
                d.a.a.a.y0.d.a.k0.h r2 = r2.f12664a
                if (r2 != r7) goto L_0x038d
                boolean r2 = r15.f12761c
                if (r2 == 0) goto L_0x038d
                r2 = 1
                goto L_0x038e
            L_0x038d:
                r2 = 0
            L_0x038e:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            L_0x0392:
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r5)
                if (r2 == 0) goto L_0x039b
                goto L_0x039d
            L_0x039b:
                r2 = 0
                goto L_0x039e
            L_0x039d:
                r2 = 1
            L_0x039e:
                d.a.a.a.y0.d.a.k0.e r5 = new d.a.a.a.y0.d.a.k0.e
                if (r3 != 0) goto L_0x03a4
                r7 = 0
                goto L_0x03a6
            L_0x03a4:
                d.a.a.a.y0.d.a.k0.h r7 = r3.f12664a
            L_0x03a6:
                java.util.List<d.a.a.a.y0.f.b> r8 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12323l
                d.a.a.a.y0.d.a.k0.f r9 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6449f.READ_ONLY
                java.lang.Object r8 = m11515d(r8, r1, r9)
                java.util.List<d.a.a.a.y0.f.b> r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12324m
                d.a.a.a.y0.d.a.k0.f r11 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6449f.MUTABLE
                java.lang.Object r1 = m11515d(r10, r1, r11)
                if (r8 == 0) goto L_0x03c3
                if (r1 == 0) goto L_0x03c3
                boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r8, r1)
                if (r10 == 0) goto L_0x03c1
                goto L_0x03c3
            L_0x03c1:
                r8 = 0
                goto L_0x03c6
            L_0x03c3:
                if (r8 != 0) goto L_0x03c6
                r8 = r1
            L_0x03c6:
                d.a.a.a.y0.d.a.k0.f r8 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6449f) r8
                if (r2 == 0) goto L_0x03d2
                boolean r1 = p005b.p291q.p292a.C5266a.m9827J2(r14)
                if (r1 == 0) goto L_0x03d2
                r1 = 1
                goto L_0x03d3
            L_0x03d2:
                r1 = 0
            L_0x03d3:
                if (r3 != 0) goto L_0x03d7
                r2 = 0
                goto L_0x03dd
            L_0x03d7:
                boolean r2 = r3.f12665b
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            L_0x03dd:
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r3)
                r5.<init>(r7, r8, r1, r2)
                r1 = 1
                r2 = r2 ^ r1
                if (r2 == 0) goto L_0x03ec
                r1 = r5
                goto L_0x03ed
            L_0x03ec:
                r1 = 0
            L_0x03ed:
                if (r1 != 0) goto L_0x03f1
                r1 = 0
                goto L_0x03f3
            L_0x03f1:
                d.a.a.a.y0.d.a.k0.h r1 = r1.f12652a
            L_0x03f3:
                boolean r2 = r0.f12714d
                if (r2 == 0) goto L_0x03fb
                if (r12 == 0) goto L_0x03fb
                r2 = 1
                goto L_0x03fc
            L_0x03fb:
                r2 = 0
            L_0x03fc:
                d.a.a.a.y0.d.a.k0.h r3 = p005b.p291q.p292a.C5266a.m9870Q3(r4, r1, r2)
                if (r3 != 0) goto L_0x0403
                goto L_0x0425
            L_0x0403:
                d.a.a.a.y0.b.f1.a r8 = r0.f12711a
                boolean r10 = r8 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1
                if (r10 != 0) goto L_0x040a
                r8 = 0
            L_0x040a:
                d.a.a.a.y0.b.b1 r8 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r8
                if (r8 != 0) goto L_0x0410
                r8 = 0
                goto L_0x0414
            L_0x0410:
                d.a.a.a.y0.l.c0 r8 = r8.mo23130p()
            L_0x0414:
                if (r8 == 0) goto L_0x0418
                r8 = 1
                goto L_0x0419
            L_0x0418:
                r8 = 0
            L_0x0419:
                if (r8 == 0) goto L_0x0421
                if (r12 == 0) goto L_0x0421
                if (r3 != r6) goto L_0x0421
                r6 = 1
                goto L_0x0422
            L_0x0421:
                r6 = 0
            L_0x0422:
                if (r6 != 0) goto L_0x0425
                goto L_0x0426
            L_0x0425:
                r3 = 0
            L_0x0426:
                d.a.a.a.y0.d.a.k0.f r6 = r5.f12653b
                r8 = r27
                java.lang.Object r6 = p005b.p291q.p292a.C5266a.m9864P3(r8, r11, r9, r6, r2)
                d.a.a.a.y0.d.a.k0.f r6 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6449f) r6
                if (r7 != r1) goto L_0x043d
                r1 = r26
                boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r1, r4)
                if (r4 != 0) goto L_0x043b
                goto L_0x043f
            L_0x043b:
                r4 = 0
                goto L_0x0440
            L_0x043d:
                r1 = r26
            L_0x043f:
                r4 = 1
            L_0x0440:
                boolean r5 = r5.f12654c
                if (r5 != 0) goto L_0x0467
                boolean r5 = r24.isEmpty()
                if (r5 == 0) goto L_0x044b
                goto L_0x0461
            L_0x044b:
                java.util.Iterator r5 = r24.iterator()
            L_0x044f:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x0461
                java.lang.Object r8 = r5.next()
                d.a.a.a.y0.d.a.k0.e r8 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6448e) r8
                boolean r8 = r8.f12654c
                if (r8 == 0) goto L_0x044f
                r5 = 1
                goto L_0x0462
            L_0x0461:
                r5 = 0
            L_0x0462:
                if (r5 == 0) goto L_0x0465
                goto L_0x0467
            L_0x0465:
                r5 = 0
                goto L_0x0468
            L_0x0467:
                r5 = 1
            L_0x0468:
                if (r3 != 0) goto L_0x0476
                if (r4 == 0) goto L_0x0476
                d.a.a.a.y0.d.a.k0.h r1 = p005b.p291q.p292a.C5266a.m9870Q3(r1, r7, r2)
                r2 = 1
                d.a.a.a.y0.d.a.k0.e r1 = p005b.p291q.p292a.C5266a.m10068z0(r1, r6, r2, r5)
                goto L_0x047f
            L_0x0476:
                if (r3 != 0) goto L_0x047a
                r1 = 1
                goto L_0x047b
            L_0x047a:
                r1 = 0
            L_0x047b:
                d.a.a.a.y0.d.a.k0.e r1 = p005b.p291q.p292a.C5266a.m10068z0(r3, r6, r1, r5)
            L_0x047f:
                r20[r22] = r1
                int r10 = r22 + 1
                r1 = r30
                r2 = r17
                r3 = r18
                r9 = r20
                r5 = r21
                r4 = 10
                r6 = 1
                r7 = 0
                goto L_0x007c
            L_0x0493:
                r20 = r9
                d.a.a.a.y0.d.a.k0.m r1 = new d.a.a.a.y0.d.a.k0.m
                r2 = r20
                r1.<init>(r2)
                r2 = r30
                if (r2 != 0) goto L_0x04a2
                r3 = 0
                goto L_0x04a7
            L_0x04a2:
                d.a.a.a.y0.d.a.k0.l$b$b r3 = new d.a.a.a.y0.d.a.k0.l$b$b
                r3.<init>(r2, r1)
            L_0x04a7:
                d.a.a.a.y0.l.c0 r2 = r0.f12712b
                d.a.a.a.y0.d.a.k0.l$b$a r4 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6485b.C6486a.f12719g
                boolean r2 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13437c(r2, r4)
                d.a.a.a.y0.d.a.k0.l r4 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.this
                d.a.a.a.y0.d.a.k0.d r4 = r4.f12707c
                d.a.a.a.y0.l.c0 r5 = r0.f12712b
                if (r3 != 0) goto L_0x04b8
                goto L_0x04b9
            L_0x04b8:
                r1 = r3
            L_0x04b9:
                java.util.Objects.requireNonNull(r4)
                p298d.p344x.p346c.C6888i.m12438e(r5, r11)
                java.lang.String r3 = "qualifiers"
                p298d.p344x.p346c.C6888i.m12438e(r1, r3)
                d.a.a.a.y0.l.g1 r3 = r5.mo25056Y()
                r5 = 0
                d.a.a.a.y0.d.a.k0.d$a r1 = r4.mo23563b(r3, r1, r5)
                d.a.a.a.y0.l.c0 r3 = r1.mo23564a()
                boolean r1 = r1.f12648c
                if (r1 == 0) goto L_0x04d6
                goto L_0x04d7
            L_0x04d6:
                r3 = 0
            L_0x04d7:
                if (r3 != 0) goto L_0x04db
                r7 = 0
                goto L_0x04e1
            L_0x04db:
                d.a.a.a.y0.d.a.k0.l$a r7 = new d.a.a.a.y0.d.a.k0.l$a
                r1 = 1
                r7.<init>(r3, r1, r2)
            L_0x04e1:
                if (r7 != 0) goto L_0x04eb
                d.a.a.a.y0.d.a.k0.l$a r7 = new d.a.a.a.y0.d.a.k0.l$a
                d.a.a.a.y0.l.c0 r1 = r0.f12712b
                r3 = 0
                r7.<init>(r1, r3, r2)
            L_0x04eb:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6485b.mo23583b(d.a.a.a.y0.d.a.k0.u):d.a.a.a.y0.d.a.k0.l$a");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6448e mo23584c(p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0 r11) {
            /*
                r10 = this;
                boolean r0 = p005b.p291q.p292a.C5266a.m10058x2(r11)
                if (r0 == 0) goto L_0x0014
                d.a.a.a.y0.l.w r0 = p005b.p291q.p292a.C5266a.m10055x(r11)
                d.j r1 = new d.j
                d.a.a.a.y0.l.j0 r2 = r0.f15029h
                d.a.a.a.y0.l.j0 r0 = r0.f15030i
                r1.<init>(r2, r0)
                goto L_0x0019
            L_0x0014:
                d.j r1 = new d.j
                r1.<init>(r11, r11)
            L_0x0019:
                A r0 = r1.f13681g
                d.a.a.a.y0.l.c0 r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r0
                B r1 = r1.f13682h
                d.a.a.a.y0.l.c0 r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE
                d.a.a.a.y0.d.a.k0.e r9 = new d.a.a.a.y0.d.a.k0.e
                boolean r3 = r0.mo23566W()
                r4 = 0
                if (r3 == 0) goto L_0x0030
                d.a.a.a.y0.d.a.k0.h r3 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NULLABLE
            L_0x002e:
                r5 = r3
                goto L_0x003a
            L_0x0030:
                boolean r3 = r1.mo23566W()
                if (r3 != 0) goto L_0x0039
                d.a.a.a.y0.d.a.k0.h r3 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NOT_NULL
                goto L_0x002e
            L_0x0039:
                r5 = r4
            L_0x003a:
                boolean r0 = r2.isReadOnly((p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r0)
                if (r0 == 0) goto L_0x0043
                d.a.a.a.y0.d.a.k0.f r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6449f.READ_ONLY
                goto L_0x004d
            L_0x0043:
                boolean r0 = r2.isMutable((p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r1)
                if (r0 == 0) goto L_0x004c
                d.a.a.a.y0.d.a.k0.f r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6449f.MUTABLE
                goto L_0x004d
            L_0x004c:
                r0 = r4
            L_0x004d:
                d.a.a.a.y0.l.g1 r11 = r11.mo25056Y()
                boolean r6 = r11 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6450g
                r7 = 0
                r8 = 8
                r3 = r9
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6485b.mo23584c(d.a.a.a.y0.l.c0):d.a.a.a.y0.d.a.k0.e");
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.k0.l$c */
    public static final class C6488c extends C6484a {

        /* renamed from: d */
        public final boolean f12722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6488c(C7452c0 c0Var, boolean z, boolean z2, boolean z3) {
            super(c0Var, z2, z3);
            C6888i.m12438e(c0Var, "type");
            this.f12722d = z;
        }
    }

    public C6483l(C6268c cVar, C7636i iVar, C6445d dVar) {
        C6888i.m12438e(cVar, "annotationTypeQualifierResolver");
        C6888i.m12438e(iVar, "javaTypeEnhancementState");
        C6888i.m12438e(dVar, "typeEnhancement");
        this.f12705a = cVar;
        this.f12706b = iVar;
        this.f12707c = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: d.a.a.a.y0.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: d.a.a.a.y0.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: d.a.a.a.y0.d.a.g0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: d.a.a.a.y0.d.a.g0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: d.a.a.a.y0.b.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: d.a.a.a.y0.b.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: d.a.a.a.y0.b.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: d.a.a.a.y0.b.h1.f0} */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02ff, code lost:
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r7) != false) goto L_0x0305;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0235 A[Catch:{ IllegalArgumentException -> 0x0302 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0241 A[Catch:{ IllegalArgumentException -> 0x0302 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <D extends p298d.p299a.p300a.p301a.p303y0.p304b.C6023b> java.util.Collection<D> mo23577a(p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g r21, java.util.Collection<? extends D> r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r0 = r22
            java.lang.String r1 = "c"
            p298d.p344x.p346c.C6888i.m12438e(r8, r1)
            java.lang.String r1 = "platformSignatures"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r1 = p005b.p291q.p292a.C5266a.m9892V(r0, r10)
            r9.<init>(r1)
            java.util.Iterator r11 = r22.iterator()
        L_0x001f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x046f
            java.lang.Object r0 = r11.next()
            r12 = r0
            d.a.a.a.y0.b.b r12 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r12
            boolean r0 = r12 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6305b
            if (r0 != 0) goto L_0x0031
            goto L_0x004b
        L_0x0031:
            r0 = r12
            d.a.a.a.y0.d.a.g0.b r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6305b) r0
            d.a.a.a.y0.b.b$a r1 = r0.getKind()
            d.a.a.a.y0.b.b$a r2 = p298d.p299a.p300a.p301a.p303y0.p304b.C6023b.C6024a.FAKE_OVERRIDE
            r13 = 1
            if (r1 != r2) goto L_0x004e
            d.a.a.a.y0.b.b r0 = r0.getOriginal()
            java.util.Collection r0 = r0.getOverriddenDescriptors()
            int r0 = r0.size()
            if (r0 != r13) goto L_0x004e
        L_0x004b:
            r4 = r10
            goto L_0x0465
        L_0x004e:
            d.a.a.a.y0.b.f1.h r0 = r12.getAnnotations()
            d.a.a.a.y0.d.a.h0.g r4 = p005b.p291q.p292a.C5266a.m9984l0(r8, r0)
            boolean r0 = r12 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6312g
            r14 = 0
            if (r0 == 0) goto L_0x0079
            r0 = r12
            d.a.a.a.y0.d.a.g0.g r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6312g) r0
            d.a.a.a.y0.b.h1.f0 r1 = r0.f12034x
            if (r1 != 0) goto L_0x0064
            r1 = r14
            goto L_0x006a
        L_0x0064:
            boolean r1 = r1.f12009g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x006a:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x0079
            d.a.a.a.y0.b.h1.f0 r0 = r0.f12034x
            p298d.p344x.p346c.C6888i.m12436c(r0)
            r2 = r0
            goto L_0x007a
        L_0x0079:
            r2 = r12
        L_0x007a:
            r15 = r12
            d.a.a.a.y0.d.a.g0.b r15 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6305b) r15
            d.a.a.a.y0.b.n0 r0 = r15.getExtensionReceiverParameter()
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r0 != 0) goto L_0x0089
            r0 = r14
            goto L_0x008a
        L_0x0089:
            r0 = r2
        L_0x008a:
            d.a.a.a.y0.b.v r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r0
            if (r0 != 0) goto L_0x0090
            r0 = r14
            goto L_0x0098
        L_0x0090:
            d.a.a.a.y0.b.a$a<d.a.a.a.y0.b.b1> r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f.f12407i
            java.lang.Object r0 = r0.getUserData(r1)
            d.a.a.a.y0.b.b1 r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r0
        L_0x0098:
            d.a.a.a.y0.d.a.k0.n r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6490n.f12724g
            d.a.a.a.y0.d.a.k0.l$b r0 = r7.mo23581e(r12, r0, r4, r1)
            d.a.a.a.y0.d.a.k0.l$a r0 = r0.mo23583b(r14)
            r6 = r0
            goto L_0x00a5
        L_0x00a4:
            r6 = r14
        L_0x00a5:
            boolean r0 = r12 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f
            if (r0 == 0) goto L_0x00ad
            r0 = r12
            d.a.a.a.y0.d.a.g0.f r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f) r0
            goto L_0x00ae
        L_0x00ad:
            r0 = r14
        L_0x00ae:
            r5 = 0
            if (r0 != 0) goto L_0x00b2
            goto L_0x00c5
        L_0x00b2:
            d.a.a.a.y0.d.b.s r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6565s.f12856a
            d.a.a.a.y0.b.k r3 = r0.getContainingDeclaration()
            d.a.a.a.y0.b.e r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r3
            r14 = 3
            java.lang.String r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11653b(r0, r5, r5, r14)
            java.lang.String r0 = p005b.p291q.p292a.C5266a.m9901W3(r1, r3, r0)
            if (r0 != 0) goto L_0x00c7
        L_0x00c5:
            r14 = 0
            goto L_0x00d0
        L_0x00c7:
            java.util.Map<java.lang.String, d.a.a.a.y0.d.a.k0.k> r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6453j.f12669d
            java.lang.Object r0 = r1.get(r0)
            d.a.a.a.y0.d.a.k0.k r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6482k) r0
            r14 = r0
        L_0x00d0:
            if (r14 != 0) goto L_0x00d3
            goto L_0x00df
        L_0x00d3:
            java.util.List<d.a.a.a.y0.d.a.k0.u> r0 = r14.f12704b
            r0.size()
            java.util.List r0 = r15.getValueParameters()
            r0.size()
        L_0x00df:
            java.util.List r0 = r2.getValueParameters()
            java.lang.String r1 = "annotationOwnerForMember.valueParameters"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = p005b.p291q.p292a.C5266a.m9892V(r0, r10)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00f5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0366
            java.lang.Object r1 = r0.next()
            d.a.a.a.y0.b.b1 r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r1
            d.a.a.a.y0.d.a.k0.p r13 = new d.a.a.a.y0.d.a.k0.p
            r13.<init>(r1)
            d.a.a.a.y0.d.a.k0.l$b r13 = r7.mo23581e(r12, r1, r4, r13)
            if (r14 != 0) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            java.util.List<d.a.a.a.y0.d.a.k0.u> r10 = r14.f12704b
            if (r10 != 0) goto L_0x0113
        L_0x0111:
            r5 = 0
            goto L_0x011d
        L_0x0113:
            int r5 = r1.mo23128d()
            java.lang.Object r5 = p298d.p334t.C6790h.m12365s(r10, r5)
            d.a.a.a.y0.d.a.k0.u r5 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6499u) r5
        L_0x011d:
            d.a.a.a.y0.d.a.k0.l$a r5 = r13.mo23583b(r5)
            boolean r10 = r5.f12709b
            if (r10 == 0) goto L_0x0128
            d.a.a.a.y0.l.c0 r10 = r5.f12708a
            goto L_0x0131
        L_0x0128:
            d.a.a.a.y0.l.c0 r10 = r1.mo23093a()
            java.lang.String r13 = "p.type"
            p298d.p344x.p346c.C6888i.m12437d(r10, r13)
        L_0x0131:
            java.lang.String r13 = "p"
            p298d.p344x.p346c.C6888i.m12437d(r1, r13)
            java.lang.String r13 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r1, r13)
            r18 = r0
            d.a.a.a.y0.b.f1.h r0 = r1.getAnnotations()
            r19 = r6
            d.a.a.a.y0.f.b r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z.f12786r
            java.lang.String r7 = "DEFAULT_VALUE_FQ_NAME"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            d.a.a.a.y0.b.f1.c r0 = r0.mo23168j(r6)
            if (r0 != 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            d.a.a.a.y0.i.v.g r0 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13129b(r0)
            if (r0 != 0) goto L_0x0159
        L_0x0157:
            r0 = 0
            goto L_0x0160
        L_0x0159:
            boolean r6 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7249w
            if (r6 != 0) goto L_0x015e
            r0 = 0
        L_0x015e:
            d.a.a.a.y0.i.v.w r0 = (p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7249w) r0
        L_0x0160:
            if (r0 != 0) goto L_0x0163
            goto L_0x0169
        L_0x0163:
            T r0 = r0.f14459a
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x017f
        L_0x0169:
            d.a.a.a.y0.b.f1.h r0 = r1.getAnnotations()
            d.a.a.a.y0.f.b r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z.f12787s
            java.lang.String r7 = "DEFAULT_NULL_FQ_NAME"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            boolean r0 = r0.mo23169v(r6)
            if (r0 == 0) goto L_0x017d
            d.a.a.a.y0.d.a.g0.h r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6313h.f12419a
            goto L_0x0185
        L_0x017d:
            r0 = 0
            goto L_0x0185
        L_0x017f:
            d.a.a.a.y0.d.a.g0.j r6 = new d.a.a.a.y0.d.a.g0.j
            r6.<init>(r0)
            r0 = r6
        L_0x0185:
            boolean r6 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6315j
            if (r6 == 0) goto L_0x0315
            d.a.a.a.y0.d.a.g0.j r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6315j) r0
            java.lang.String r0 = r0.f12420a
            p298d.p344x.p346c.C6888i.m12438e(r10, r13)
            java.lang.String r6 = "value"
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)
            d.a.a.a.y0.l.t0 r7 = r10.mo24887V()
            d.a.a.a.y0.b.h r7 = r7.getDeclarationDescriptor()
            boolean r13 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r13 == 0) goto L_0x01da
            d.a.a.a.y0.b.e r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r7
            d.a.a.a.y0.b.f r13 = r7.getKind()
            d.a.a.a.y0.b.f r8 = p298d.p299a.p300a.p301a.p303y0.p304b.C6051f.ENUM_CLASS
            if (r13 != r8) goto L_0x01da
            d.a.a.a.y0.i.z.h r6 = r7.getUnsubstitutedInnerClassesScope()
            d.a.a.a.y0.f.d r0 = p298d.p299a.p300a.p301a.p303y0.p331f.C6717d.m12270l(r0)
            java.lang.String r7 = "identifier(value)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r7)
            d.a.a.a.y0.c.a.d r7 = p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d.FROM_BACKEND
            d.a.a.a.y0.b.h r0 = r6.getContributedClassifier(r0, r7)
            boolean r6 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r6 == 0) goto L_0x01d6
            d.a.a.a.y0.b.e r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r0
            d.a.a.a.y0.b.f r6 = r0.getKind()
            d.a.a.a.y0.b.f r7 = p298d.p299a.p300a.p301a.p303y0.p304b.C6051f.ENUM_ENTRY
            if (r6 != r7) goto L_0x01d6
            d.a.a.a.y0.d.a.n r6 = new d.a.a.a.y0.d.a.n
            r6.<init>(r0)
            r10 = 0
            r13 = 1
            goto L_0x030e
        L_0x01d6:
            r10 = 0
            r13 = 1
            goto L_0x030d
        L_0x01da:
            d.a.a.a.y0.l.c0 r7 = p005b.p291q.p292a.C5266a.m9939d3(r10)
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)
            r6 = 2
            java.lang.String r8 = "0x"
            r10 = 0
            boolean r8 = p298d.p415c0.C7694h.m13910A(r0, r8, r10, r6)
            java.lang.String r13 = "(this as java.lang.String).substring(startIndex)"
            if (r8 != 0) goto L_0x021c
            java.lang.String r8 = "0X"
            boolean r8 = p298d.p415c0.C7694h.m13910A(r0, r8, r10, r6)
            if (r8 == 0) goto L_0x01f6
            goto L_0x021c
        L_0x01f6:
            java.lang.String r8 = "0b"
            boolean r8 = p298d.p415c0.C7694h.m13910A(r0, r8, r10, r6)
            if (r8 != 0) goto L_0x020f
            java.lang.String r8 = "0B"
            boolean r8 = p298d.p415c0.C7694h.m13910A(r0, r8, r10, r6)
            if (r8 == 0) goto L_0x0207
            goto L_0x020f
        L_0x0207:
            d.a.a.a.y0.n.j r6 = new d.a.a.a.y0.n.j
            r8 = 10
            r6.<init>(r0, r8)
            goto L_0x022b
        L_0x020f:
            d.a.a.a.y0.n.j r8 = new d.a.a.a.y0.n.j
            java.lang.String r10 = r0.substring(r6)
            p298d.p344x.p346c.C6888i.m12437d(r10, r13)
            r8.<init>(r10, r6)
            goto L_0x022a
        L_0x021c:
            d.a.a.a.y0.n.j r8 = new d.a.a.a.y0.n.j
            java.lang.String r6 = r0.substring(r6)
            p298d.p344x.p346c.C6888i.m12437d(r6, r13)
            r10 = 16
            r8.<init>(r6, r10)
        L_0x022a:
            r6 = r8
        L_0x022b:
            java.lang.String r8 = r6.f15130a
            int r6 = r6.f15131b
            boolean r10 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBoolean(r7)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r10 == 0) goto L_0x0241
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            r10 = 0
            r13 = 1
            goto L_0x0305
        L_0x0241:
            boolean r10 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isChar(r7)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r10 == 0) goto L_0x0261
            java.lang.String r6 = "$this$singleOrNull"
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0302 }
            int r6 = r0.length()     // Catch:{ IllegalArgumentException -> 0x0302 }
            r13 = 1
            if (r6 != r13) goto L_0x025e
            r10 = 0
            char r0 = r0.charAt(r10)     // Catch:{  }
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch:{  }
            goto L_0x0305
        L_0x025e:
            r10 = 0
            goto L_0x0304
        L_0x0261:
            r10 = 0
            r13 = 1
            boolean r16 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isByte(r7)     // Catch:{  }
            if (r16 == 0) goto L_0x0289
            java.lang.String r0 = "$this$toByteOrNull"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)     // Catch:{  }
            java.lang.Integer r0 = p298d.p415c0.C7694h.m13919J(r8, r6)     // Catch:{  }
            if (r0 == 0) goto L_0x0304
            int r0 = r0.intValue()     // Catch:{  }
            r6 = -128(0xffffffffffffff80, float:NaN)
            if (r0 < r6) goto L_0x0304
            r6 = 127(0x7f, float:1.78E-43)
            if (r0 <= r6) goto L_0x0282
            goto L_0x0304
        L_0x0282:
            byte r0 = (byte) r0     // Catch:{  }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{  }
            goto L_0x0305
        L_0x0289:
            boolean r16 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isShort(r7)     // Catch:{  }
            if (r16 == 0) goto L_0x02ad
            java.lang.String r0 = "$this$toShortOrNull"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)     // Catch:{  }
            java.lang.Integer r0 = p298d.p415c0.C7694h.m13919J(r8, r6)     // Catch:{  }
            if (r0 == 0) goto L_0x0304
            int r0 = r0.intValue()     // Catch:{  }
            r6 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r6) goto L_0x0304
            r6 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r6) goto L_0x02a7
            goto L_0x0304
        L_0x02a7:
            short r0 = (short) r0     // Catch:{  }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{  }
            goto L_0x0305
        L_0x02ad:
            boolean r16 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isInt(r7)     // Catch:{  }
            if (r16 == 0) goto L_0x02b8
            java.lang.Integer r0 = p298d.p415c0.C7694h.m13919J(r8, r6)     // Catch:{  }
            goto L_0x0305
        L_0x02b8:
            boolean r16 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isLong(r7)     // Catch:{  }
            if (r16 == 0) goto L_0x02c3
            java.lang.Long r0 = p298d.p415c0.C7694h.m13920K(r8, r6)     // Catch:{  }
            goto L_0x0305
        L_0x02c3:
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isFloat(r7)     // Catch:{  }
            if (r6 == 0) goto L_0x02df
            java.lang.String r6 = "$this$toFloatOrNull"
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)     // Catch:{  }
            d.c0.d r6 = p298d.p415c0.C7691e.f15228a     // Catch:{ IllegalArgumentException -> 0x0304 }
            boolean r6 = r6.mo25278a(r0)     // Catch:{ IllegalArgumentException -> 0x0304 }
            if (r6 == 0) goto L_0x0304
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ IllegalArgumentException -> 0x0304 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0304 }
            goto L_0x0305
        L_0x02df:
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDouble(r7)     // Catch:{  }
            if (r6 == 0) goto L_0x02fb
            java.lang.String r6 = "$this$toDoubleOrNull"
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)     // Catch:{  }
            d.c0.d r6 = p298d.p415c0.C7691e.f15228a     // Catch:{ IllegalArgumentException -> 0x0304 }
            boolean r6 = r6.mo25278a(r0)     // Catch:{ IllegalArgumentException -> 0x0304 }
            if (r6 == 0) goto L_0x0304
            double r6 = java.lang.Double.parseDouble(r0)     // Catch:{ IllegalArgumentException -> 0x0304 }
            java.lang.Double r0 = java.lang.Double.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x0304 }
            goto L_0x0305
        L_0x02fb:
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r7)     // Catch:{  }
            if (r6 == 0) goto L_0x0304
            goto L_0x0305
        L_0x0302:
            r10 = 0
            r13 = 1
        L_0x0304:
            r0 = 0
        L_0x0305:
            if (r0 == 0) goto L_0x030d
            d.a.a.a.y0.d.a.l r6 = new d.a.a.a.y0.d.a.l
            r6.<init>(r0)
            goto L_0x030e
        L_0x030d:
            r6 = 0
        L_0x030e:
            if (r6 == 0) goto L_0x0313
            r6 = r10
            r10 = r13
            goto L_0x032a
        L_0x0313:
            r6 = r10
            goto L_0x032a
        L_0x0315:
            r6 = 0
            r13 = 1
            d.a.a.a.y0.d.a.g0.h r7 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6313h.f12419a
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r0, r7)
            if (r7 == 0) goto L_0x0324
            boolean r10 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13436b(r10)
            goto L_0x032a
        L_0x0324:
            if (r0 != 0) goto L_0x0360
            boolean r10 = r1.mo23125E()
        L_0x032a:
            if (r10 == 0) goto L_0x0338
            java.util.Collection r0 = r1.getOverriddenDescriptors()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0338
            r10 = r13
            goto L_0x0339
        L_0x0338:
            r10 = r6
        L_0x0339:
            boolean r0 = r5.f12709b
            if (r0 != 0) goto L_0x0346
            boolean r0 = r1.mo23125E()
            if (r10 == r0) goto L_0x0344
            goto L_0x0346
        L_0x0344:
            r0 = r6
            goto L_0x0347
        L_0x0346:
            r0 = r13
        L_0x0347:
            d.a.a.a.y0.d.a.k0.l$c r1 = new d.a.a.a.y0.d.a.k0.l$c
            d.a.a.a.y0.l.c0 r7 = r5.f12708a
            boolean r5 = r5.f12710c
            r1.<init>(r7, r10, r0, r5)
            r3.add(r1)
            r7 = r20
            r8 = r21
            r5 = r6
            r0 = r18
            r6 = r19
            r10 = 10
            goto L_0x00f5
        L_0x0360:
            d.h r0 = new d.h
            r0.<init>()
            throw r0
        L_0x0366:
            r19 = r6
            r6 = r5
            r5 = 1
            boolean r0 = r12 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0
            if (r0 != 0) goto L_0x0370
            r0 = 0
            goto L_0x0371
        L_0x0370:
            r0 = r12
        L_0x0371:
            d.a.a.a.y0.b.k0 r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0) r0
            if (r0 != 0) goto L_0x0377
            r0 = 0
            goto L_0x037f
        L_0x0377:
            boolean r0 = p005b.p291q.p292a.C5266a.m9773A2(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x037f:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r7)
            if (r0 == 0) goto L_0x038a
            d.a.a.a.y0.d.a.a r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a.FIELD
            goto L_0x038c
        L_0x038a:
            d.a.a.a.y0.d.a.a r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a.METHOD_RETURN_TYPE
        L_0x038c:
            r8 = r0
            d.a.a.a.y0.d.a.k0.o r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6491o.f12725g
            r0 = r20
            r1 = r12
            r16 = r3
            r3 = r5
            r17 = r6
            r5 = r8
            r8 = r19
            r6 = r10
            d.a.a.a.y0.d.a.k0.l$b r0 = r0.mo23580d(r1, r2, r3, r4, r5, r6)
            if (r14 != 0) goto L_0x03a3
            r1 = 0
            goto L_0x03a5
        L_0x03a3:
            d.a.a.a.y0.d.a.k0.u r1 = r14.f12703a
        L_0x03a5:
            d.a.a.a.y0.d.a.k0.l$a r0 = r0.mo23583b(r1)
            if (r8 != 0) goto L_0x03ad
            r1 = 0
            goto L_0x03b3
        L_0x03ad:
            boolean r1 = r8.f12710c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x03b3:
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r7)
            if (r1 != 0) goto L_0x03e2
            boolean r1 = r0.f12710c
            if (r1 != 0) goto L_0x03e2
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x03c4
            goto L_0x03da
        L_0x03c4:
            java.util.Iterator r1 = r16.iterator()
        L_0x03c8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03da
            java.lang.Object r2 = r1.next()
            d.a.a.a.y0.d.a.k0.l$c r2 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6488c) r2
            boolean r2 = r2.f12710c
            if (r2 == 0) goto L_0x03c8
            r5 = r13
            goto L_0x03dc
        L_0x03da:
            r5 = r17
        L_0x03dc:
            if (r5 == 0) goto L_0x03df
            goto L_0x03e2
        L_0x03df:
            r5 = r17
            goto L_0x03e3
        L_0x03e2:
            r5 = r13
        L_0x03e3:
            if (r8 != 0) goto L_0x03e7
            r1 = 0
            goto L_0x03ed
        L_0x03e7:
            boolean r1 = r8.f12709b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x03ed:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 != 0) goto L_0x041f
            boolean r1 = r0.f12709b
            if (r1 != 0) goto L_0x041f
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x0400
            goto L_0x0415
        L_0x0400:
            java.util.Iterator r1 = r16.iterator()
        L_0x0404:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0415
            java.lang.Object r2 = r1.next()
            d.a.a.a.y0.d.a.k0.l$c r2 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6488c) r2
            boolean r2 = r2.f12709b
            if (r2 == 0) goto L_0x0404
            goto L_0x0417
        L_0x0415:
            r13 = r17
        L_0x0417:
            if (r13 != 0) goto L_0x041f
            if (r5 == 0) goto L_0x041c
            goto L_0x041f
        L_0x041c:
            r4 = 10
            goto L_0x0465
        L_0x041f:
            if (r5 == 0) goto L_0x042e
            d.a.a.a.y0.b.a$a<java.lang.Object> r1 = p298d.p299a.p300a.p301a.p303y0.p391i.p395w.C7253a.f14474a
            d.a.a.a.y0.d.a.m r2 = new d.a.a.a.y0.d.a.m
            r2.<init>(r12)
            d.j r3 = new d.j
            r3.<init>(r1, r2)
            goto L_0x042f
        L_0x042e:
            r3 = 0
        L_0x042f:
            if (r8 != 0) goto L_0x0433
            r14 = 0
            goto L_0x0435
        L_0x0433:
            d.a.a.a.y0.l.c0 r14 = r8.f12708a
        L_0x0435:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r16
            r4 = 10
            int r5 = p005b.p291q.p292a.C5266a.m9892V(r2, r4)
            r1.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0446:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x045f
            java.lang.Object r5 = r2.next()
            d.a.a.a.y0.d.a.k0.l$c r5 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.C6488c) r5
            d.a.a.a.y0.d.a.g0.k r6 = new d.a.a.a.y0.d.a.g0.k
            d.a.a.a.y0.l.c0 r7 = r5.f12708a
            boolean r5 = r5.f12722d
            r6.<init>(r7, r5)
            r1.add(r6)
            goto L_0x0446
        L_0x045f:
            d.a.a.a.y0.l.c0 r0 = r0.f12708a
            d.a.a.a.y0.d.a.g0.b r12 = r15.mo23461i(r14, r1, r0, r3)
        L_0x0465:
            r9.add(r12)
            r7 = r20
            r8 = r21
            r10 = r4
            goto L_0x001f
        L_0x046f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.mo23577a(d.a.a.a.y0.d.a.h0.g, java.util.Collection):java.util.Collection");
    }

    /* renamed from: b */
    public final C6452i mo23578b(C6055c cVar, boolean z, boolean z2) {
        C6452i c;
        C6888i.m12438e(cVar, "annotationDescriptor");
        C6452i c2 = mo23579c(cVar, z, z2);
        if (c2 != null) {
            return c2;
        }
        C6055c d = this.f12705a.mo23449d(cVar);
        if (d == null) {
            return null;
        }
        C7638k b = this.f12705a.mo23447b(cVar);
        Objects.requireNonNull(b);
        if (!(b == C7638k.IGNORE) && (c = mo23579c(d, z, z2)) != null) {
            return C6452i.m11509a(c, (C6451h) null, b.mo25204d(), 1);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r2.equals("NEVER") == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (r2.equals("MAYBE") == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cb, code lost:
        r10 = new p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i(r1, r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i mo23579c(p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            d.a.a.a.y0.d.a.k0.h r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.FORCE_FLEXIBILITY
            d.a.a.a.y0.d.a.k0.h r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NULLABLE
            d.a.a.a.y0.f.b r2 = r8.getFqName()
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r4 = r8 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6341d
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x001f
            r4 = r8
            d.a.a.a.y0.d.a.h0.l.d r4 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6341d) r4
            boolean r4 = r4.f12495h
            if (r4 != 0) goto L_0x001b
            if (r10 == 0) goto L_0x001f
        L_0x001b:
            if (r9 != 0) goto L_0x001f
            r9 = r6
            goto L_0x0020
        L_0x001f:
            r9 = r5
        L_0x0020:
            d.a.a.a.y0.n.i r10 = r7.f12706b
            d.a.a.a.y0.n.k r10 = r10.f15126e
            d.a.a.a.y0.n.k r4 = p298d.p299a.p300a.p301a.p303y0.p412n.C7638k.IGNORE
            if (r10 != r4) goto L_0x0029
            goto L_0x004a
        L_0x0029:
            d.a.a.a.y0.n.k r4 = p298d.p299a.p300a.p301a.p303y0.p412n.C7638k.WARN
            if (r10 != r4) goto L_0x002e
            r5 = r6
        L_0x002e:
            d.a.a.a.y0.f.b r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12312a
            boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r2, r10)
            if (r10 == 0) goto L_0x003c
            d.a.a.a.y0.d.a.k0.i r10 = new d.a.a.a.y0.d.a.k0.i
            r10.<init>(r1, r5)
            goto L_0x004b
        L_0x003c:
            d.a.a.a.y0.f.b r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12313b
            boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r2, r10)
            if (r10 == 0) goto L_0x004a
            d.a.a.a.y0.d.a.k0.i r10 = new d.a.a.a.y0.d.a.k0.i
            r10.<init>(r0, r5)
            goto L_0x004b
        L_0x004a:
            r10 = r3
        L_0x004b:
            if (r10 != 0) goto L_0x011b
            d.a.a.a.y0.d.a.k0.h r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h.NOT_NULL
            java.util.List<d.a.a.a.y0.f.b> r4 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12315d
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L_0x005e
            d.a.a.a.y0.d.a.k0.i r10 = new d.a.a.a.y0.d.a.k0.i
            r10.<init>(r1, r9)
            goto L_0x0118
        L_0x005e:
            java.util.List<d.a.a.a.y0.f.b> r4 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12318g
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L_0x006d
            d.a.a.a.y0.d.a.k0.i r0 = new d.a.a.a.y0.d.a.k0.i
            r0.<init>(r10, r9)
            goto L_0x00f8
        L_0x006d:
            d.a.a.a.y0.f.b r4 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12316e
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r2, r4)
            if (r4 == 0) goto L_0x00d1
            d.a.a.a.y0.i.v.g r2 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13129b(r8)
            boolean r4 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7232k
            if (r4 == 0) goto L_0x0080
            d.a.a.a.y0.i.v.k r2 = (p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7232k) r2
            goto L_0x0081
        L_0x0080:
            r2 = r3
        L_0x0081:
            if (r2 != 0) goto L_0x008a
            d.a.a.a.y0.d.a.k0.i r0 = new d.a.a.a.y0.d.a.k0.i
            r0.<init>(r10, r9)
            goto L_0x00f8
        L_0x008a:
            d.a.a.a.y0.f.d r2 = r2.f14463c
            java.lang.String r2 = r2.mo23886e()
            int r4 = r2.hashCode()
            switch(r4) {
                case 73135176: goto L_0x00c2;
                case 74175084: goto L_0x00b9;
                case 433141802: goto L_0x00a9;
                case 1933739535: goto L_0x0099;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x0117
        L_0x0099:
            java.lang.String r0 = "ALWAYS"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a3
            goto L_0x0117
        L_0x00a3:
            d.a.a.a.y0.d.a.k0.i r0 = new d.a.a.a.y0.d.a.k0.i
            r0.<init>(r10, r9)
            goto L_0x00f8
        L_0x00a9:
            java.lang.String r10 = "UNKNOWN"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00b3
            goto L_0x0117
        L_0x00b3:
            d.a.a.a.y0.d.a.k0.i r10 = new d.a.a.a.y0.d.a.k0.i
            r10.<init>(r0, r9)
            goto L_0x0118
        L_0x00b9:
            java.lang.String r10 = "NEVER"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00cb
            goto L_0x0117
        L_0x00c2:
            java.lang.String r10 = "MAYBE"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00cb
            goto L_0x0117
        L_0x00cb:
            d.a.a.a.y0.d.a.k0.i r10 = new d.a.a.a.y0.d.a.k0.i
            r10.<init>(r1, r9)
            goto L_0x0118
        L_0x00d1:
            d.a.a.a.y0.f.b r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12319h
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r2, r0)
            if (r0 == 0) goto L_0x00e5
            d.a.a.a.y0.n.i r0 = r7.f12706b
            boolean r0 = r0.f15125d
            if (r0 == 0) goto L_0x00e5
            d.a.a.a.y0.d.a.k0.i r10 = new d.a.a.a.y0.d.a.k0.i
            r10.<init>(r1, r9)
            goto L_0x0118
        L_0x00e5:
            d.a.a.a.y0.f.b r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12320i
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r2, r0)
            if (r0 == 0) goto L_0x00fa
            d.a.a.a.y0.n.i r0 = r7.f12706b
            boolean r0 = r0.f15125d
            if (r0 == 0) goto L_0x00fa
            d.a.a.a.y0.d.a.k0.i r0 = new d.a.a.a.y0.d.a.k0.i
            r0.<init>(r10, r9)
        L_0x00f8:
            r10 = r0
            goto L_0x0118
        L_0x00fa:
            d.a.a.a.y0.f.b r9 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12322k
            boolean r9 = p298d.p344x.p346c.C6888i.m12434a(r2, r9)
            if (r9 == 0) goto L_0x0108
            d.a.a.a.y0.d.a.k0.i r9 = new d.a.a.a.y0.d.a.k0.i
            r9.<init>(r10, r6)
            goto L_0x0115
        L_0x0108:
            d.a.a.a.y0.f.b r9 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6265a0.f12321j
            boolean r9 = p298d.p344x.p346c.C6888i.m12434a(r2, r9)
            if (r9 == 0) goto L_0x0117
            d.a.a.a.y0.d.a.k0.i r9 = new d.a.a.a.y0.d.a.k0.i
            r9.<init>(r1, r6)
        L_0x0115:
            r10 = r9
            goto L_0x0118
        L_0x0117:
            r10 = r3
        L_0x0118:
            if (r10 != 0) goto L_0x011b
            return r3
        L_0x011b:
            boolean r9 = r10.f12665b
            if (r9 != 0) goto L_0x012f
            boolean r9 = r8 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6314i
            if (r9 == 0) goto L_0x012f
            d.a.a.a.y0.d.a.g0.i r8 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6314i) r8
            boolean r8 = r8.mo23455c()
            if (r8 == 0) goto L_0x012f
            d.a.a.a.y0.d.a.k0.i r10 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i.m11509a(r10, r3, r6, r6)
        L_0x012f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l.mo23579c(d.a.a.a.y0.b.f1.c, boolean, boolean):d.a.a.a.y0.d.a.k0.i");
    }

    /* renamed from: d */
    public final C6485b mo23580d(C6023b bVar, C6053a aVar, boolean z, C6328g gVar, C6264a aVar2, C6862l<? super C6023b, ? extends C7452c0> lVar) {
        C6023b bVar2 = bVar;
        C6862l<? super C6023b, ? extends C7452c0> lVar2 = lVar;
        C7452c0 c0Var = (C7452c0) lVar2.invoke(bVar);
        Collection<? extends C6023b> overriddenDescriptors = bVar.getOverriddenDescriptors();
        C6888i.m12437d(overriddenDescriptors, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(overriddenDescriptors, 10));
        for (C6023b bVar3 : overriddenDescriptors) {
            C6888i.m12437d(bVar3, "it");
            arrayList.add((C7452c0) lVar2.invoke(bVar3));
        }
        return new C6485b(aVar, c0Var, arrayList, z, C5266a.m9984l0(gVar, ((C7452c0) lVar2.invoke(bVar)).getAnnotations()), aVar2, false, 64);
    }

    /* renamed from: e */
    public final C6485b mo23581e(C6023b bVar, C6030b1 b1Var, C6328g gVar, C6862l<? super C6023b, ? extends C7452c0> lVar) {
        if (b1Var != null) {
            gVar = C5266a.m9984l0(gVar, b1Var.getAnnotations());
        }
        return mo23580d(bVar, b1Var, false, gVar, C6264a.VALUE_PARAMETER, lVar);
    }
}
