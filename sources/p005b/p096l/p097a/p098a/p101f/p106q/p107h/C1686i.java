package p005b.p096l.p097a.p098a.p101f.p106q.p107h;

import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p102n.C1654g;
import p005b.p096l.p097a.p098a.p101f.p109r.C1733b;

/* renamed from: b.l.a.a.f.q.h.i */
public final /* synthetic */ class C1686i implements C1733b.C1734a {

    /* renamed from: a */
    public final C1689l f2973a;

    /* renamed from: b */
    public final C1654g f2974b;

    /* renamed from: c */
    public final Iterable f2975c;

    /* renamed from: d */
    public final C1640h f2976d;

    /* renamed from: e */
    public final int f2977e;

    public C1686i(C1689l lVar, C1654g gVar, Iterable iterable, C1640h hVar, int i) {
        this.f2973a = lVar;
        this.f2974b = gVar;
        this.f2975c = iterable;
        this.f2976d = hVar;
        this.f2977e = i;
    }

    /* renamed from: a */
    public Object mo11854a() {
        C1689l lVar = this.f2973a;
        C1654g gVar = this.f2974b;
        Iterable iterable = this.f2975c;
        C1640h hVar = this.f2976d;
        int i = this.f2977e;
        if (gVar.mo11835c() == C1654g.C1655a.TRANSIENT_ERROR) {
            lVar.f2984c.mo11903Y(iterable);
            lVar.f2985d.mo11874a(hVar, i + 1);
            return null;
        }
        lVar.f2984c.mo11905l(iterable);
        if (gVar.mo11835c() == C1654g.C1655a.OK) {
            lVar.f2984c.mo11898B(hVar, gVar.mo11834b() + lVar.f2988g.mo11926a());
        }
        if (!lVar.f2984c.mo11902W(hVar)) {
            return null;
        }
        lVar.f2985d.mo11875b(hVar, 1, true);
        return null;
    }
}
