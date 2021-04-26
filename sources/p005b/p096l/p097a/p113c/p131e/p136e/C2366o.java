package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Collections;
import java.util.List;

/* renamed from: b.l.a.c.e.e.o */
public final class C2366o extends C2414q {

    /* renamed from: c */
    public static final Class<?> f4132c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: b.l.a.c.e.e.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: b.l.a.c.e.e.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: b.l.a.c.e.e.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L> java.util.List<L> m3855d(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0031
            boolean r1 = r0 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2342n
            if (r1 == 0) goto L_0x0016
            b.l.a.c.e.e.m r0 = new b.l.a.c.e.e.m
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2222i0
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2171g
            if (r1 == 0) goto L_0x0026
            b.l.a.c.e.e.g r0 = (p005b.p096l.p097a.p113c.p131e.p136e.C2171g) r0
            b.l.a.c.e.e.g r6 = r0.mo12494h(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            b.l.a.c.e.e.j1 r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r6.mo12732p(r3, r4, r0)
            goto L_0x008a
        L_0x0031:
            java.lang.Class<?> r1 = f4132c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x0051
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x004a:
            b.l.a.c.e.e.j1 r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r6.mo12732p(r3, r4, r1)
            r0 = r1
            goto L_0x008a
        L_0x0051:
            boolean r1 = r0 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2148f1
            if (r1 == 0) goto L_0x0069
            b.l.a.c.e.e.m r1 = new b.l.a.c.e.e.m
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            b.l.a.c.e.e.f1 r0 = (p005b.p096l.p097a.p113c.p131e.p136e.C2148f1) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            goto L_0x004a
        L_0x0069:
            boolean r1 = r0 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2222i0
            if (r1 == 0) goto L_0x008a
            boolean r1 = r0 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2171g
            if (r1 == 0) goto L_0x008a
            r1 = r0
            b.l.a.c.e.e.g r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2171g) r1
            boolean r2 = r1.mo12473a()
            if (r2 == 0) goto L_0x007b
            goto L_0x008a
        L_0x007b:
            int r0 = r0.size()
            int r0 = r0 + r6
            b.l.a.c.e.e.g r6 = r1.mo12494h(r0)
            b.l.a.c.e.e.j1 r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r0.mo12732p(r3, r4, r6)
            return r6
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2366o.m3855d(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: a */
    public final <L> List<L> mo12861a(Object obj, long j) {
        return m3855d(obj, j, 10);
    }

    /* renamed from: b */
    public final void mo12862b(Object obj, long j) {
        Object obj2;
        List list = (List) C2272k1.m3631m(obj, j);
        if (list instanceof C2342n) {
            obj2 = ((C2342n) list).mo12626f();
        } else if (!f4132c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C2222i0) || !(list instanceof C2171g)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C2171g gVar = (C2171g) list;
                if (gVar.mo12473a()) {
                    gVar.mo12477b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C2272k1.f3995e.mo12732p(obj, j, obj2);
    }

    /* renamed from: c */
    public final <E> void mo12863c(Object obj, Object obj2, long j) {
        List list = (List) C2272k1.m3631m(obj2, j);
        List d = m3855d(obj, j, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        C2272k1.f3995e.mo12732p(obj, j, list);
    }
}
