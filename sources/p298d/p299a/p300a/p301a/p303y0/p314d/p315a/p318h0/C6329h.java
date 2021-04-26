package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6396t;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6437x;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6438y;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7436h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.h0.h */
public final class C6329h implements C6333k {

    /* renamed from: a */
    public final C6328g f12465a;

    /* renamed from: b */
    public final C6206k f12466b;

    /* renamed from: c */
    public final int f12467c;

    /* renamed from: d */
    public final Map<C6437x, Integer> f12468d;

    /* renamed from: e */
    public final C7436h<C6437x, C6396t> f12469e;

    /* renamed from: d.a.a.a.y0.d.a.h0.h$a */
    public static final class C6330a extends C6890k implements C6862l<C6437x, C6396t> {

        /* renamed from: g */
        public final /* synthetic */ C6329h f12470g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6330a(C6329h hVar) {
            super(1);
            this.f12470g = hVar;
        }

        public Object invoke(Object obj) {
            C6437x xVar = (C6437x) obj;
            C6888i.m12438e(xVar, "typeParameter");
            Integer num = this.f12470g.f12468d.get(xVar);
            if (num == null) {
                return null;
            }
            C6329h hVar = this.f12470g;
            int intValue = num.intValue();
            C6328g gVar = hVar.f12465a;
            C6888i.m12438e(gVar, "<this>");
            C6888i.m12438e(hVar, "typeParameterResolver");
            return new C6396t(C5266a.m9984l0(new C6328g(gVar.f12460a, hVar, gVar.f12462c), hVar.f12466b.getAnnotations()), xVar, hVar.f12467c + intValue, hVar.f12466b);
        }
    }

    public C6329h(C6328g gVar, C6206k kVar, C6438y yVar, int i) {
        C6888i.m12438e(gVar, "c");
        C6888i.m12438e(kVar, "containingDeclaration");
        C6888i.m12438e(yVar, "typeParameterOwner");
        this.f12465a = gVar;
        this.f12466b = kVar;
        this.f12467c = i;
        List<C6437x> typeParameters = yVar.getTypeParameters();
        C6888i.m12438e(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f12468d = linkedHashMap;
        this.f12469e = this.f12465a.f12460a.f12428a.mo25026i(new C6330a(this));
    }

    /* renamed from: a */
    public C6248w0 mo23471a(C6437x xVar) {
        C6888i.m12438e(xVar, "javaTypeParameter");
        C6396t invoke = this.f12469e.invoke(xVar);
        return invoke == null ? this.f12465a.f12461b.mo23471a(xVar) : invoke;
    }
}
