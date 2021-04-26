package p298d.p348y;

import p298d.p299a.C6736l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.y.a */
public abstract class C6906a<V> implements C6907b<Object, V> {

    /* renamed from: a */
    public V f13805a;

    public C6906a(V v) {
        this.f13805a = v;
    }

    /* renamed from: a */
    public void mo24210a(Object obj, C6736l<?> lVar, V v) {
        C6888i.m12438e(lVar, "property");
        if (mo24212c(lVar, this.f13805a, v)) {
            this.f13805a = v;
            C6888i.m12438e(lVar, "property");
        }
    }

    /* renamed from: b */
    public V mo24211b(Object obj, C6736l<?> lVar) {
        C6888i.m12438e(lVar, "property");
        return this.f13805a;
    }

    /* renamed from: c */
    public boolean mo24212c(C6736l<?> lVar, V v, V v2) {
        C6888i.m12438e(lVar, "property");
        return true;
    }
}
