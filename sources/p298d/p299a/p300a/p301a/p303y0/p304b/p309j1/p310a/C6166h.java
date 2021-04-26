package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7391p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.a.h */
public final class C6166h implements C7391p {

    /* renamed from: b */
    public static final C6166h f12183b = new C6166h();

    /* renamed from: a */
    public void mo23334a(C6046e eVar, List<String> list) {
        C6888i.m12438e(eVar, "descriptor");
        C6888i.m12438e(list, "unresolvedSuperClasses");
        StringBuilder u = C0843a.m460u("Incomplete hierarchy for class ");
        u.append(eVar.getName());
        u.append(", unresolved classes ");
        u.append(list);
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: b */
    public void mo23335b(C6023b bVar) {
        C6888i.m12438e(bVar, "descriptor");
        throw new IllegalStateException(C6888i.m12444k("Cannot infer visibility for ", bVar));
    }
}
