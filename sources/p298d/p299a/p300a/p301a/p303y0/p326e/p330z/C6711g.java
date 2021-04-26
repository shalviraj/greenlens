package p298d.p299a.p300a.p301a.p303y0.p326e.p330z;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6687v;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6692w;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.z.g */
public final class C6711g {

    /* renamed from: b */
    public static final C6712a f13607b = new C6712a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final C6711g f13608c = new C6711g(C6798p.f13713g);

    /* renamed from: a */
    public final List<C6687v> f13609a;

    /* renamed from: d.a.a.a.y0.e.z.g$a */
    public static final class C6712a {
        public C6712a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final C6711g mo23850a(C6692w wVar) {
            C6888i.m12438e(wVar, "table");
            if (wVar.f13520h.size() == 0) {
                C6712a aVar = C6711g.f13607b;
                return C6711g.f13608c;
            }
            List<C6687v> list = wVar.f13520h;
            C6888i.m12437d(list, "table.requirementList");
            return new C6711g(list, (DefaultConstructorMarker) null);
        }
    }

    public C6711g(List<C6687v> list) {
        this.f13609a = list;
    }

    public C6711g(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.f13609a = list;
    }
}
