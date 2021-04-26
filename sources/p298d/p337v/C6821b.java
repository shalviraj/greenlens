package p298d.p337v;

import p298d.p337v.C6827f;
import p298d.p337v.C6827f.C6828a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.v.b */
public abstract class C6821b<B extends C6827f.C6828a, E extends B> implements C6827f.C6830b<E> {

    /* renamed from: g */
    public final C6827f.C6830b<?> f13745g;

    /* renamed from: h */
    public final C6862l<C6827f.C6828a, E> f13746h;

    public C6821b(C6827f.C6830b<B> bVar, C6862l<? super C6827f.C6828a, ? extends E> lVar) {
        C6888i.m12438e(bVar, "baseKey");
        C6888i.m12438e(lVar, "safeCast");
        this.f13746h = lVar;
        this.f13745g = bVar instanceof C6821b ? ((C6821b) bVar).f13745g : bVar;
    }
}
