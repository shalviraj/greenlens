package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6548k;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p402e0.C7315a;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p402e0.C7319d;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.b.j1.a.f */
public final class C6164f implements C6548k {

    /* renamed from: a */
    public final ClassLoader f12180a;

    /* renamed from: b */
    public final C7319d f12181b = new C7319d();

    public C6164f(ClassLoader classLoader) {
        C6888i.m12438e(classLoader, "classLoader");
        this.f12180a = classLoader;
    }

    /* renamed from: a */
    public C6548k.C6549a mo23330a(C6420g gVar) {
        C6888i.m12438e(gVar, "javaClass");
        C6714b fqName = gVar.getFqName();
        String b = fqName == null ? null : fqName.mo23862b();
        if (b == null) {
            return null;
        }
        return mo23333d(b);
    }

    /* renamed from: b */
    public InputStream mo23331b(C6714b bVar) {
        C6888i.m12438e(bVar, "packageFqName");
        if (!bVar.mo23871i(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        return this.f12181b.mo24945a(C7315a.f14580m.mo24944a(bVar));
    }

    /* renamed from: c */
    public C6548k.C6549a mo23332c(C6713a aVar) {
        C6888i.m12438e(aVar, "classId");
        String b = aVar.mo23858i().mo23862b();
        C6888i.m12437d(b, "relativeClassName.asString()");
        String u = C7694h.m13943u(b, '.', '$', false, 4);
        if (!aVar.mo23856h().mo23864d()) {
            u = aVar.mo23856h() + '.' + u;
        }
        return mo23333d(u);
    }

    /* renamed from: d */
    public final C6548k.C6549a mo23333d(String str) {
        C6163e f;
        Class<?> G4 = C5266a.m9811G4(this.f12180a, str);
        if (G4 == null || (f = C6163e.m11056f(G4)) == null) {
            return null;
        }
        return new C6548k.C6549a.C6551b(f, (byte[]) null, 2);
    }
}
