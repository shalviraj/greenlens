package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6426m;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.v */
public final class C6201v extends C6179d implements C6426m {

    /* renamed from: b */
    public final Enum<?> f12227b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6201v(C6717d dVar, Enum<?> enumR) {
        super(dVar);
        C6888i.m12438e(enumR, "value");
        this.f12227b = enumR;
    }

    /* renamed from: a */
    public C6717d mo23410a() {
        return C6717d.m12270l(this.f12227b.name());
    }

    /* renamed from: d */
    public C6713a mo23411d() {
        Class<?> cls = this.f12227b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C6888i.m12437d(cls, "enumClass");
        return C6173b.m11073b(cls);
    }
}
