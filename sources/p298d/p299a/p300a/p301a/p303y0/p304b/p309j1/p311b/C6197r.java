package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6421h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.r */
public final class C6197r extends C6179d implements C6421h {

    /* renamed from: b */
    public final Class<?> f12223b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6197r(C6717d dVar, Class<?> cls) {
        super(dVar);
        C6888i.m12438e(cls, "klass");
        this.f12223b = cls;
    }

    /* renamed from: e */
    public C6436w mo23402e() {
        Class<?> cls = this.f12223b;
        C6888i.m12438e(cls, "type");
        if (cls.isPrimitive()) {
            return new C6178c0(cls);
        }
        if ((cls instanceof GenericArrayType) || cls.isArray()) {
            return new C6187h(cls);
        }
        return cls instanceof WildcardType ? new C6186g0((WildcardType) cls) : new C6198s(cls);
    }
}
