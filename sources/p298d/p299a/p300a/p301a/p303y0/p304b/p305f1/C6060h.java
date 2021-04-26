package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import java.util.Iterator;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p334t.C6797o;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.a.a.a.y0.b.f1.h */
public interface C6060h extends Iterable<C6055c>, C6875a {

    /* renamed from: d */
    public static final C6061a f11920d = C6061a.f11921a;

    /* renamed from: d.a.a.a.y0.b.f1.h$a */
    public static final class C6061a {

        /* renamed from: a */
        public static final /* synthetic */ C6061a f11921a = new C6061a();

        /* renamed from: b */
        public static final C6060h f11922b = new C6062a();

        /* renamed from: d.a.a.a.y0.b.f1.h$a$a */
        public static final class C6062a implements C6060h {
            public boolean isEmpty() {
                return true;
            }

            public Iterator<C6055c> iterator() {
                return C6797o.f13712g;
            }

            /* renamed from: j */
            public C6055c mo23168j(C6714b bVar) {
                C6888i.m12438e(bVar, "fqName");
                return null;
            }

            public String toString() {
                return "EMPTY";
            }

            /* renamed from: v */
            public boolean mo23169v(C6714b bVar) {
                return C5266a.m9909Y1(this, bVar);
            }
        }

        /* renamed from: a */
        public final C6060h mo23170a(List<? extends C6055c> list) {
            C6888i.m12438e(list, "annotations");
            return list.isEmpty() ? f11922b : new C6063i(list);
        }
    }

    boolean isEmpty();

    /* renamed from: j */
    C6055c mo23168j(C6714b bVar);

    /* renamed from: v */
    boolean mo23169v(C6714b bVar);
}
