package p298d.p337v.p339j.p340a;

import p298d.p337v.C6824d;
import p298d.p337v.C6825e;
import p298d.p337v.C6827f;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.v.j.a.c */
public abstract class C6838c extends C6836a {

    /* renamed from: h */
    public transient C6824d<Object> f13767h;

    /* renamed from: i */
    public final C6827f f13768i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6838c(C6824d<Object> dVar) {
        super(dVar);
        C6827f context = dVar != null ? dVar.getContext() : null;
        this.f13768i = context;
    }

    public C6838c(C6824d<Object> dVar, C6827f fVar) {
        super(dVar);
        this.f13768i = fVar;
    }

    /* renamed from: f */
    public void mo24174f() {
        C6824d<Object> dVar = this.f13767h;
        if (!(dVar == null || dVar == this)) {
            C6827f fVar = this.f13768i;
            C6888i.m12436c(fVar);
            int i = C6825e.f13750c;
            C6827f.C6828a aVar = fVar.get(C6825e.C6826a.f13751g);
            C6888i.m12436c(aVar);
            ((C6825e) aVar).mo24168e(dVar);
        }
        this.f13767h = C6837b.f13766g;
    }

    public C6827f getContext() {
        C6827f fVar = this.f13768i;
        C6888i.m12436c(fVar);
        return fVar;
    }
}
