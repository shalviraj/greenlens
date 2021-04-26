package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.h */
public final class C6317h extends C6275e0 {

    /* renamed from: m */
    public static final C6317h f12423m = new C6317h();

    /* renamed from: d.a.a.a.y0.d.a.h$a */
    public static final class C6318a extends C6890k implements C6862l<C6023b, Boolean> {
        public C6318a(C6317h hVar) {
            super(1);
        }

        public Object invoke(Object obj) {
            C6023b bVar = (C6023b) obj;
            C6888i.m12438e(bVar, "it");
            C6317h hVar = C6317h.f12423m;
            return Boolean.valueOf(C6790h.m12348e(C6275e0.f12348g, C6561p.m11654c(bVar)));
        }
    }

    /* renamed from: a */
    public static final C6244v m11304a(C6244v vVar) {
        C6888i.m12438e(vVar, "functionDescriptor");
        C6317h hVar = f12423m;
        C6717d name = vVar.getName();
        C6888i.m12437d(name, "functionDescriptor.name");
        if (!hVar.mo23464b(name)) {
            return null;
        }
        return (C6244v) C7255a.m13130c(vVar, false, new C6318a(hVar), 1);
    }

    /* renamed from: b */
    public final boolean mo23464b(C6717d dVar) {
        C6888i.m12438e(dVar, "<this>");
        return C6275e0.f12347f.contains(dVar);
    }
}
