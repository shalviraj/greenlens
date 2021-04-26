package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.List;

/* renamed from: b.l.a.c.e.e.p */
public final class C2390p extends C2414q {
    /* renamed from: a */
    public final <L> List<L> mo12861a(Object obj, long j) {
        C2171g gVar = (C2171g) C2272k1.m3631m(obj, j);
        if (gVar.mo12473a()) {
            return gVar;
        }
        int size = gVar.size();
        C2171g h = gVar.mo12494h(size == 0 ? 10 : size + size);
        C2272k1.f3995e.mo12732p(obj, j, h);
        return h;
    }

    /* renamed from: b */
    public final void mo12862b(Object obj, long j) {
        ((C2171g) C2272k1.m3631m(obj, j)).mo12477b();
    }

    /* renamed from: c */
    public final <E> void mo12863c(Object obj, Object obj2, long j) {
        C2171g gVar = (C2171g) C2272k1.m3631m(obj, j);
        C2171g gVar2 = (C2171g) C2272k1.m3631m(obj2, j);
        int size = gVar.size();
        int size2 = gVar2.size();
        if (size > 0 && size2 > 0) {
            if (!gVar.mo12473a()) {
                gVar = gVar.mo12494h(size2 + size);
            }
            gVar.addAll(gVar2);
        }
        if (size > 0) {
            gVar2 = gVar;
        }
        C2272k1.f3995e.mo12732p(obj, j, gVar2);
    }
}
