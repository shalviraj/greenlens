package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0;

import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6314i;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6414b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p334t.C6799q;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.d.a.f0.b */
public class C6284b implements C6055c, C6314i {

    /* renamed from: f */
    public static final /* synthetic */ C6736l<Object>[] f12371f = {C6902w.m12462c(new C6896q(C6902w.m12460a(C6284b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    public final C6714b f12372a;

    /* renamed from: b */
    public final C6234r0 f12373b;

    /* renamed from: c */
    public final C7437i f12374c;

    /* renamed from: d */
    public final C6414b f12375d;

    /* renamed from: e */
    public final boolean f12376e;

    /* renamed from: d.a.a.a.y0.d.a.f0.b$a */
    public static final class C6285a extends C6890k implements C6851a<C7489j0> {

        /* renamed from: g */
        public final /* synthetic */ C6328g f12377g;

        /* renamed from: h */
        public final /* synthetic */ C6284b f12378h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6285a(C6328g gVar, C6284b bVar) {
            super(0);
            this.f12377g = gVar;
            this.f12378h = bVar;
        }

        public Object invoke() {
            C7489j0 defaultType = this.f12377g.f12460a.f12442o.getBuiltIns().getBuiltInClassByFqName(this.f12378h.f12372a).getDefaultType();
            C6888i.m12437d(defaultType, "c.module.builtIns.getBuiltInClassByFqName(fqName).defaultType");
            return defaultType;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        r3 = r4.mo23353g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6284b(p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g r3, p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a r4, p298d.p299a.p300a.p301a.p303y0.p331f.C6714b r5) {
        /*
            r2 = this;
            java.lang.String r0 = "c"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            java.lang.String r0 = "fqName"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            r2.<init>()
            r2.f12372a = r5
            r5 = 0
            if (r4 != 0) goto L_0x0014
            r0 = r5
            goto L_0x001c
        L_0x0014:
            d.a.a.a.y0.d.a.h0.c r0 = r3.f12460a
            d.a.a.a.y0.d.a.i0.b r0 = r0.f12437j
            d.a.a.a.y0.d.a.i0.a r0 = r0.mo23336a(r4)
        L_0x001c:
            if (r0 != 0) goto L_0x0025
            d.a.a.a.y0.b.r0 r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0.f12257a
            java.lang.String r1 = "NO_SOURCE"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
        L_0x0025:
            r2.f12373b = r0
            d.a.a.a.y0.d.a.h0.c r0 = r3.f12460a
            d.a.a.a.y0.k.m r0 = r0.f12428a
            d.a.a.a.y0.d.a.f0.b$a r1 = new d.a.a.a.y0.d.a.f0.b$a
            r1.<init>(r3, r2)
            d.a.a.a.y0.k.i r3 = r0.mo25018a(r1)
            r2.f12374c = r3
            if (r4 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            java.util.Collection r3 = r4.mo23353g()
            if (r3 != 0) goto L_0x0041
        L_0x003f:
            r3 = r5
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = p298d.p334t.C6790h.m12362p(r3)
            d.a.a.a.y0.d.a.j0.b r3 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6414b) r3
        L_0x0047:
            r2.f12375d = r3
            if (r4 != 0) goto L_0x004c
            goto L_0x0054
        L_0x004c:
            boolean r3 = r4.mo23351c()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
        L_0x0054:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r5, r3)
            r2.f12376e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6284b.<init>(d.a.a.a.y0.d.a.h0.g, d.a.a.a.y0.d.a.j0.a, d.a.a.a.y0.f.b):void");
    }

    /* renamed from: a */
    public C7452c0 mo23162a() {
        return (C7489j0) C5266a.m9884T1(this.f12374c, f12371f[0]);
    }

    /* renamed from: b */
    public Map<C6717d, C7227g<?>> mo23163b() {
        return C6799q.f13714g;
    }

    /* renamed from: c */
    public boolean mo23455c() {
        return this.f12376e;
    }

    public C6714b getFqName() {
        return this.f12372a;
    }

    public C6234r0 getSource() {
        return this.f12373b;
    }
}
