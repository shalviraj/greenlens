package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import p298d.p299a.C6726e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6418e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.g */
public final class C6185g extends C6179d implements C6418e {

    /* renamed from: b */
    public final Object[] f12208b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6185g(C6717d dVar, Object[] objArr) {
        super(dVar);
        C6888i.m12438e(objArr, "values");
        this.f12208b = objArr;
    }

    /* renamed from: c */
    public List<C6179d> mo23374c() {
        Object[] objArr = this.f12208b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C6888i.m12436c(obj);
            C6888i.m12438e(obj, "value");
            Class<?> cls = obj.getClass();
            List<C6726e<? extends Object>> list = C6173b.f12191a;
            C6888i.m12438e(cls, "<this>");
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C6201v((C6717d) null, (Enum) obj) : obj instanceof Annotation ? new C6181e((C6717d) null, (Annotation) obj) : obj instanceof Object[] ? new C6185g((C6717d) null, (Object[]) obj) : obj instanceof Class ? new C6197r((C6717d) null, (Class) obj) : new C6203x((C6717d) null, obj));
        }
        return arrayList;
    }
}
