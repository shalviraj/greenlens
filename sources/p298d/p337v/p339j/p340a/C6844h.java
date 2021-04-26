package p298d.p337v.p339j.p340a;

import p298d.p337v.C6824d;
import p298d.p344x.p346c.C6885f;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.v.j.a.h */
public abstract class C6844h extends C6838c implements C6885f<Object> {

    /* renamed from: j */
    public final int f13775j;

    public C6844h(int i, C6824d<Object> dVar) {
        super(dVar);
        this.f13775j = i;
    }

    public int getArity() {
        return this.f13775j;
    }

    public String toString() {
        if (this.f13765g != null) {
            return super.toString();
        }
        String f = C6902w.f13802a.mo23046f(this);
        C6888i.m12437d(f, "Reflection.renderLambdaToString(this)");
        return f;
    }
}
