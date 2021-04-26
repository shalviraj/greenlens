package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.b.b */
public final class C6529b implements C6552l.C6556d {

    /* renamed from: a */
    public final /* synthetic */ C6524a<A, C> f12799a;

    /* renamed from: b */
    public final /* synthetic */ HashMap<C6560o, List<A>> f12800b;

    /* renamed from: c */
    public final /* synthetic */ HashMap<C6560o, C> f12801c;

    /* renamed from: d.a.a.a.y0.d.b.b$a */
    public final class C6530a extends C6531b implements C6552l.C6557e {

        /* renamed from: d */
        public final /* synthetic */ C6529b f12802d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6530a(C6529b bVar, C6560o oVar) {
            super(bVar, oVar);
            C6888i.m12438e(bVar, "this$0");
            C6888i.m12438e(oVar, "signature");
            this.f12802d = bVar;
        }

        /* renamed from: c */
        public C6552l.C6553a mo23622c(int i, C6713a aVar, C6234r0 r0Var) {
            C6888i.m12438e(aVar, "classId");
            C6888i.m12438e(r0Var, "source");
            C6560o oVar = this.f12803a;
            C6888i.m12438e(oVar, "signature");
            C6560o oVar2 = new C6560o(oVar.f12853a + '@' + i, (DefaultConstructorMarker) null);
            List list = this.f12802d.f12800b.get(oVar2);
            if (list == null) {
                list = new ArrayList();
                this.f12802d.f12800b.put(oVar2, list);
            }
            return C6524a.m11553k(this.f12802d.f12799a, aVar, r0Var, list);
        }
    }

    /* renamed from: d.a.a.a.y0.d.b.b$b */
    public class C6531b implements C6552l.C6555c {

        /* renamed from: a */
        public final C6560o f12803a;

        /* renamed from: b */
        public final ArrayList<A> f12804b = new ArrayList<>();

        /* renamed from: c */
        public final /* synthetic */ C6529b f12805c;

        public C6531b(C6529b bVar, C6560o oVar) {
            C6888i.m12438e(bVar, "this$0");
            C6888i.m12438e(oVar, "signature");
            this.f12805c = bVar;
            this.f12803a = oVar;
        }

        /* renamed from: a */
        public void mo23618a() {
            if (!this.f12804b.isEmpty()) {
                this.f12805c.f12800b.put(this.f12803a, this.f12804b);
            }
        }

        /* renamed from: b */
        public C6552l.C6553a mo23619b(C6713a aVar, C6234r0 r0Var) {
            C6888i.m12438e(aVar, "classId");
            C6888i.m12438e(r0Var, "source");
            return C6524a.m11553k(this.f12805c.f12799a, aVar, r0Var, this.f12804b);
        }
    }

    public C6529b(C6524a<A, C> aVar, HashMap<C6560o, List<A>> hashMap, HashMap<C6560o, C> hashMap2) {
        this.f12799a = aVar;
        this.f12800b = hashMap;
        this.f12801c = hashMap2;
    }

    /* renamed from: a */
    public C6552l.C6555c mo23620a(C6717d dVar, String str, Object obj) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(str, "desc");
        String e = dVar.mo23886e();
        C6888i.m12437d(e, "name.asString()");
        C6888i.m12438e(e, "name");
        C6888i.m12438e(str, "desc");
        return new C6531b(this, new C6560o(e + '#' + str, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public C6552l.C6557e mo23621b(C6717d dVar, String str) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(str, "desc");
        String e = dVar.mo23886e();
        C6888i.m12437d(e, "name.asString()");
        C6888i.m12438e(e, "name");
        C6888i.m12438e(str, "desc");
        return new C6530a(this, new C6560o(C6888i.m12444k(e, str), (DefaultConstructorMarker) null));
    }
}
