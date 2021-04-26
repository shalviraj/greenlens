package p298d.p299a.p300a.p301a.p303y0.p390h;

import java.util.ArrayList;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p334t.C6807y;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.h.b */
public interface C7146b {

    /* renamed from: d.a.a.a.y0.h.b$a */
    public static final class C7147a implements C7146b {

        /* renamed from: a */
        public static final C7147a f14294a = new C7147a();

        /* renamed from: a */
        public String mo24785a(C6083h hVar, C7150c cVar) {
            C6888i.m12438e(hVar, "classifier");
            C6888i.m12438e(cVar, "renderer");
            if (hVar instanceof C6248w0) {
                C6717d name = ((C6248w0) hVar).getName();
                C6888i.m12437d(name, "classifier.name");
                return cVar.mo24791v(name, false);
            }
            C6715c g = C7193g.m13027g(hVar);
            C6888i.m12437d(g, "getFqName(classifier)");
            return cVar.mo24790u(g);
        }
    }

    /* renamed from: d.a.a.a.y0.h.b$b */
    public static final class C7148b implements C7146b {

        /* renamed from: a */
        public static final C7148b f14295a = new C7148b();

        /* renamed from: a */
        public String mo24785a(C6083h hVar, C7150c cVar) {
            boolean z;
            C6888i.m12438e(hVar, "classifier");
            C6888i.m12438e(cVar, "renderer");
            if (hVar instanceof C6248w0) {
                C6717d name = ((C6248w0) hVar).getName();
                C6888i.m12437d(name, "classifier.name");
                return cVar.mo24791v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            C6206k kVar = hVar;
            do {
                arrayList.add(kVar.getName());
                C6206k containingDeclaration = kVar.getContainingDeclaration();
                z = containingDeclaration instanceof C6046e;
                kVar = containingDeclaration;
            } while (z);
            C6888i.m12438e(arrayList, "$this$asReversed");
            return C5266a.m10059x3(new C6807y(arrayList));
        }
    }

    /* renamed from: d.a.a.a.y0.h.b$c */
    public static final class C7149c implements C7146b {

        /* renamed from: a */
        public static final C7149c f14296a = new C7149c();

        /* renamed from: a */
        public String mo24785a(C6083h hVar, C7150c cVar) {
            C6888i.m12438e(hVar, "classifier");
            C6888i.m12438e(cVar, "renderer");
            return mo24786b(hVar);
        }

        /* renamed from: b */
        public final String mo24786b(C6083h hVar) {
            String str;
            C6717d name = hVar.getName();
            C6888i.m12437d(name, "descriptor.name");
            String w3 = C5266a.m10053w3(name);
            if (hVar instanceof C6248w0) {
                return w3;
            }
            C6206k containingDeclaration = hVar.getContainingDeclaration();
            C6888i.m12437d(containingDeclaration, "descriptor.containingDeclaration");
            if (containingDeclaration instanceof C6046e) {
                str = mo24786b((C6083h) containingDeclaration);
            } else if (containingDeclaration instanceof C6032c0) {
                C6715c j = ((C6032c0) containingDeclaration).getFqName().mo23872j();
                C6888i.m12437d(j, "descriptor.fqName.toUnsafe()");
                C6888i.m12438e(j, "<this>");
                List<C6717d> g = j.mo23880g();
                C6888i.m12437d(g, "pathSegments()");
                str = C5266a.m10059x3(g);
            } else {
                str = null;
            }
            if (str == null || C6888i.m12434a(str, "")) {
                return w3;
            }
            return str + '.' + w3;
        }
    }

    /* renamed from: a */
    String mo24785a(C6083h hVar, C7150c cVar);
}
