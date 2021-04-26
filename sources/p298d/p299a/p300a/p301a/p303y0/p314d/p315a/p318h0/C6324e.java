package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6286c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6417d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7436h;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p414b0.C7662e;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7678r;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.d.a.h0.e */
public final class C6324e implements C6060h {

    /* renamed from: g */
    public final C6328g f12451g;

    /* renamed from: h */
    public final C6417d f12452h;

    /* renamed from: i */
    public final boolean f12453i;

    /* renamed from: j */
    public final C7436h<C6412a, C6055c> f12454j;

    /* renamed from: d.a.a.a.y0.d.a.h0.e$a */
    public static final class C6325a extends C6890k implements C6862l<C6412a, C6055c> {

        /* renamed from: g */
        public final /* synthetic */ C6324e f12455g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6325a(C6324e eVar) {
            super(1);
            this.f12455g = eVar;
        }

        public Object invoke(Object obj) {
            C6412a aVar = (C6412a) obj;
            C6888i.m12438e(aVar, "annotation");
            C6286c cVar = C6286c.f12379a;
            C6324e eVar = this.f12455g;
            return cVar.mo23457b(aVar, eVar.f12451g, eVar.f12453i);
        }
    }

    public C6324e(C6328g gVar, C6417d dVar, boolean z) {
        C6888i.m12438e(gVar, "c");
        C6888i.m12438e(dVar, "annotationOwner");
        this.f12451g = gVar;
        this.f12452h = dVar;
        this.f12453i = z;
        this.f12454j = gVar.f12460a.f12428a.mo25026i(new C6325a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6324e(C6328g gVar, C6417d dVar, boolean z, int i) {
        this(gVar, dVar, (i & 4) != 0 ? false : z);
    }

    public boolean isEmpty() {
        return this.f12452h.getAnnotations().isEmpty() && !this.f12452h.mo23346q();
    }

    public Iterator<C6055c> iterator() {
        C7668h<C6055c> h = C7679s.m13900h(C7679s.m13898f(C6790h.m12346d(this.f12452h.getAnnotations()), this.f12454j), C6286c.f12379a.mo23456a(StandardNames.FqNames.deprecated, this.f12452h, this.f12451g));
        C6888i.m12438e(h, "$this$filterNotNull");
        return new C7662e.C7663a((C7662e) C7679s.m13896d(h, C7678r.f15198g));
    }

    /* renamed from: j */
    public C6055c mo23168j(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        C6412a j = this.f12452h.mo23344j(bVar);
        C6055c invoke = j == null ? null : this.f12454j.invoke(j);
        return invoke == null ? C6286c.f12379a.mo23456a(bVar, this.f12452h, this.f12451g) : invoke;
    }

    /* renamed from: v */
    public boolean mo23169v(C6714b bVar) {
        return C5266a.m9909Y1(this, bVar);
    }
}
