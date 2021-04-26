package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.j.b.h */
public final class C7376h {

    /* renamed from: c */
    public static final C7376h f14729c = null;

    /* renamed from: d */
    public static final Set<C6713a> f14730d = C5266a.m9891U3(C6713a.m12239l(StandardNames.FqNames.cloneable.mo23883i()));

    /* renamed from: a */
    public final C7382j f14731a;

    /* renamed from: b */
    public final C6862l<C7377a, C6046e> f14732b;

    /* renamed from: d.a.a.a.y0.j.b.h$a */
    public static final class C7377a {

        /* renamed from: a */
        public final C6713a f14733a;

        /* renamed from: b */
        public final C7320f f14734b;

        public C7377a(C6713a aVar, C7320f fVar) {
            C6888i.m12438e(aVar, "classId");
            this.f14733a = aVar;
            this.f14734b = fVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C7377a) && C6888i.m12434a(this.f14733a, ((C7377a) obj).f14733a);
        }

        public int hashCode() {
            return this.f14733a.hashCode();
        }
    }

    /* renamed from: d.a.a.a.y0.j.b.h$b */
    public static final class C7378b extends C6890k implements C6862l<C7377a, C6046e> {

        /* renamed from: g */
        public final /* synthetic */ C7376h f14735g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7378b(C7376h hVar) {
            super(1);
            this.f14735g = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e8, code lost:
            if (((r11 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7346i) && ((p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7346i) r11).mo24969f().contains(r12)) != false) goto L_0x00ea;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r17
                d.a.a.a.y0.j.b.h$a r0 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7376h.C7377a) r0
                java.lang.String r1 = "key"
                p298d.p344x.p346c.C6888i.m12438e(r0, r1)
                r1 = r16
                d.a.a.a.y0.j.b.h r2 = r1.f14735g
                java.util.Objects.requireNonNull(r2)
                d.a.a.a.y0.f.a r3 = r0.f14733a
                d.a.a.a.y0.j.b.j r4 = r2.f14731a
                java.lang.Iterable<d.a.a.a.y0.b.g1.b> r4 = r4.f14749k
                java.util.Iterator r4 = r4.iterator()
            L_0x001a:
                boolean r5 = r4.hasNext()
                r6 = 0
                if (r5 == 0) goto L_0x002e
                java.lang.Object r5 = r4.next()
                d.a.a.a.y0.b.g1.b r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6076b) r5
                d.a.a.a.y0.b.e r6 = r5.createClass(r3)
                if (r6 != 0) goto L_0x0125
                goto L_0x001a
            L_0x002e:
                java.util.Set<d.a.a.a.y0.f.a> r4 = p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7376h.f14730d
                boolean r4 = r4.contains(r3)
                if (r4 == 0) goto L_0x0038
                goto L_0x00f6
            L_0x0038:
                d.a.a.a.y0.j.b.f r0 = r0.f14734b
                if (r0 != 0) goto L_0x0048
                d.a.a.a.y0.j.b.j r0 = r2.f14731a
                d.a.a.a.y0.j.b.g r0 = r0.f14742d
                d.a.a.a.y0.j.b.f r0 = r0.mo23641a(r3)
                if (r0 != 0) goto L_0x0048
                goto L_0x00f6
            L_0x0048:
                d.a.a.a.y0.e.z.c r4 = r0.f14582a
                d.a.a.a.y0.e.c r5 = r0.f14583b
                d.a.a.a.y0.e.z.a r14 = r0.f14584c
                d.a.a.a.y0.b.r0 r0 = r0.f14585d
                d.a.a.a.y0.f.a r7 = r3.mo23855g()
                java.lang.String r8 = "name"
                java.lang.String r9 = "classId.shortClassName"
                if (r7 == 0) goto L_0x0096
                r10 = 2
                d.a.a.a.y0.b.e r2 = p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7376h.m13289a(r2, r7, r6, r10)
                boolean r7 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d
                if (r7 == 0) goto L_0x0066
                d.a.a.a.y0.j.b.f0.d r2 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d) r2
                goto L_0x0067
            L_0x0066:
                r2 = r6
            L_0x0067:
                if (r2 != 0) goto L_0x006b
                goto L_0x00f6
            L_0x006b:
                d.a.a.a.y0.f.d r3 = r3.mo23859j()
                p298d.p344x.p346c.C6888i.m12437d(r3, r9)
                p298d.p344x.p346c.C6888i.m12438e(r3, r8)
                d.a.a.a.y0.b.o0<d.a.a.a.y0.j.b.f0.d$a> r7 = r2.f14604q
                d.a.a.a.y0.j.b.l r8 = r2.f14601n
                d.a.a.a.y0.j.b.j r8 = r8.f14760a
                d.a.a.a.y0.l.j1.k r8 = r8.f14755q
                d.a.a.a.y0.l.j1.e r8 = r8.mo25144c()
                d.a.a.a.y0.i.z.h r7 = r7.mo23425b(r8)
                d.a.a.a.y0.j.b.f0.d$a r7 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d.C7325a) r7
                java.util.Set r7 = r7.mo24969f()
                boolean r3 = r7.contains(r3)
                if (r3 != 0) goto L_0x0092
                goto L_0x00f6
            L_0x0092:
                d.a.a.a.y0.j.b.l r2 = r2.f14601n
                goto L_0x011a
            L_0x0096:
                d.a.a.a.y0.j.b.j r7 = r2.f14731a
                d.a.a.a.y0.b.d0 r7 = r7.f14744f
                d.a.a.a.y0.f.b r10 = r3.mo23856h()
                java.lang.String r11 = "classId.packageFqName"
                p298d.p344x.p346c.C6888i.m12437d(r10, r11)
                java.util.List r7 = p005b.p291q.p292a.C5266a.m10005o3(r7, r10)
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x00ad:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x00f0
                java.lang.Object r10 = r7.next()
                r11 = r10
                d.a.a.a.y0.b.c0 r11 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0) r11
                boolean r12 = r11 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7387n
                r13 = 0
                r15 = 1
                if (r12 == 0) goto L_0x00ea
                d.a.a.a.y0.j.b.n r11 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7387n) r11
                d.a.a.a.y0.f.d r12 = r3.mo23859j()
                p298d.p344x.p346c.C6888i.m12437d(r12, r9)
                java.util.Objects.requireNonNull(r11)
                p298d.p344x.p346c.C6888i.m12438e(r12, r8)
                d.a.a.a.y0.j.b.o r11 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7388o) r11
                d.a.a.a.y0.i.z.h r11 = r11.getMemberScope()
                boolean r6 = r11 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7346i
                if (r6 == 0) goto L_0x00e7
                d.a.a.a.y0.j.b.f0.i r11 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7346i) r11
                java.util.Set r6 = r11.mo24969f()
                boolean r6 = r6.contains(r12)
                if (r6 == 0) goto L_0x00e7
                r6 = r15
                goto L_0x00e8
            L_0x00e7:
                r6 = r13
            L_0x00e8:
                if (r6 == 0) goto L_0x00eb
            L_0x00ea:
                r13 = r15
            L_0x00eb:
                if (r13 == 0) goto L_0x00ee
                goto L_0x00f1
            L_0x00ee:
                r6 = 0
                goto L_0x00ad
            L_0x00f0:
                r10 = 0
            L_0x00f1:
                r8 = r10
                d.a.a.a.y0.b.c0 r8 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0) r8
                if (r8 != 0) goto L_0x00f8
            L_0x00f6:
                r6 = 0
                goto L_0x0125
            L_0x00f8:
                d.a.a.a.y0.j.b.j r7 = r2.f14731a
                d.a.a.a.y0.e.z.e r10 = new d.a.a.a.y0.e.z.e
                d.a.a.a.y0.e.t r2 = r5.f13106z
                java.lang.String r3 = "classProto.typeTable"
                p298d.p344x.p346c.C6888i.m12437d(r2, r3)
                r10.<init>(r2)
                d.a.a.a.y0.e.z.g$a r2 = p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6711g.f13607b
                d.a.a.a.y0.e.w r3 = r5.f13085B
                java.lang.String r6 = "classProto.versionRequirementTable"
                p298d.p344x.p346c.C6888i.m12437d(r3, r6)
                d.a.a.a.y0.e.z.g r11 = r2.mo23850a(r3)
                r13 = 0
                r9 = r4
                r12 = r14
                d.a.a.a.y0.j.b.l r2 = r7.mo24984a(r8, r9, r10, r11, r12, r13)
            L_0x011a:
                r8 = r2
                d.a.a.a.y0.j.b.f0.d r6 = new d.a.a.a.y0.j.b.f0.d
                r7 = r6
                r9 = r5
                r10 = r4
                r11 = r14
                r12 = r0
                r7.<init>(r8, r9, r10, r11, r12)
            L_0x0125:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7376h.C7378b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C7376h(C7382j jVar) {
        C6888i.m12438e(jVar, "components");
        this.f14731a = jVar;
        this.f14732b = jVar.f14739a.mo25026i(new C7378b(this));
    }

    /* renamed from: a */
    public static C6046e m13289a(C7376h hVar, C6713a aVar, C7320f fVar, int i) {
        int i2 = i & 2;
        Objects.requireNonNull(hVar);
        C6888i.m12438e(aVar, "classId");
        return hVar.f14732b.invoke(new C7377a(aVar, (C7320f) null));
    }
}
