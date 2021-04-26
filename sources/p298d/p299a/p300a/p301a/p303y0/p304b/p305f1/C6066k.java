package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p334t.C6790h;
import p298d.p334t.C6795m;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p414b0.C7662e;
import p298d.p414b0.C7664f;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.b.f1.k */
public final class C6066k implements C6060h {

    /* renamed from: g */
    public final List<C6060h> f11929g;

    /* renamed from: d.a.a.a.y0.b.f1.k$a */
    public static final class C6067a extends C6890k implements C6862l<C6060h, C6055c> {

        /* renamed from: g */
        public final /* synthetic */ C6714b f11930g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6067a(C6714b bVar) {
            super(1);
            this.f11930g = bVar;
        }

        public Object invoke(Object obj) {
            C6060h hVar = (C6060h) obj;
            C6888i.m12438e(hVar, "it");
            return hVar.mo23168j(this.f11930g);
        }
    }

    /* renamed from: d.a.a.a.y0.b.f1.k$b */
    public static final class C6068b extends C6890k implements C6862l<C6060h, C7668h<? extends C6055c>> {

        /* renamed from: g */
        public static final C6068b f11931g = new C6068b();

        public C6068b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C6060h hVar = (C6060h) obj;
            C6888i.m12438e(hVar, "it");
            return C6790h.m12346d(hVar);
        }
    }

    public C6066k(List<? extends C6060h> list) {
        C6888i.m12438e(list, "delegates");
        this.f11929g = list;
    }

    public C6066k(C6060h... hVarArr) {
        C6888i.m12438e(hVarArr, "delegates");
        List<C6060h> y4 = C5266a.m10066y4(hVarArr);
        C6888i.m12438e(y4, "delegates");
        this.f11929g = y4;
    }

    public boolean isEmpty() {
        List<C6060h> list = this.f11929g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C6060h isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C6055c> iterator() {
        return new C7664f.C7665a((C7664f) C7679s.m13897e(C6790h.m12346d(this.f11929g), C6068b.f11931g));
    }

    /* renamed from: j */
    public C6055c mo23168j(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        C7668h<R> g = C7679s.m13899g(C6790h.m12346d(this.f11929g), new C6067a(bVar));
        C6888i.m12438e(g, "$this$firstOrNull");
        C7662e.C7663a aVar = (C7662e.C7663a) ((C7662e) g).iterator();
        return (C6055c) (!aVar.hasNext() ? null : aVar.next());
    }

    /* renamed from: v */
    public boolean mo23169v(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        Iterator it = ((C6795m) C6790h.m12346d(this.f11929g)).iterator();
        while (it.hasNext()) {
            if (((C6060h) it.next()).mo23169v(bVar)) {
                return true;
            }
        }
        return false;
    }
}
