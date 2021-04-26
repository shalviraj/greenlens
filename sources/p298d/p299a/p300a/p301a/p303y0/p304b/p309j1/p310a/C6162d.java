package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a;

import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6176b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6196q;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6510r;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6433t;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.b.j1.a.d */
public final class C6162d implements C6510r {

    /* renamed from: a */
    public final ClassLoader f12177a;

    public C6162d(ClassLoader classLoader) {
        C6888i.m12438e(classLoader, "classLoader");
        this.f12177a = classLoader;
    }

    /* renamed from: a */
    public C6433t mo23319a(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        return new C6176b0(bVar);
    }

    /* renamed from: b */
    public C6420g mo23320b(C6510r.C6511a aVar) {
        C6888i.m12438e(aVar, "request");
        C6713a aVar2 = aVar.f12755a;
        C6714b h = aVar2.mo23856h();
        C6888i.m12437d(h, "classId.packageFqName");
        String b = aVar2.mo23858i().mo23862b();
        C6888i.m12437d(b, "classId.relativeClassName.asString()");
        String u = C7694h.m13943u(b, '.', '$', false, 4);
        if (!h.mo23864d()) {
            u = h.mo23862b() + '.' + u;
        }
        Class<?> G4 = C5266a.m9811G4(this.f12177a, u);
        if (G4 != null) {
            return new C6196q(G4);
        }
        return null;
    }

    /* renamed from: c */
    public Set<String> mo23321c(C6714b bVar) {
        C6888i.m12438e(bVar, "packageFqName");
        return null;
    }
}
