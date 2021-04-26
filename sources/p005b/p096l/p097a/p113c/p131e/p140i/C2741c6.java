package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Collections;
import java.util.List;

/* renamed from: b.l.a.c.e.i.c6 */
public final class C2741c6 extends C2769e6 {

    /* renamed from: c */
    public static final Class<?> f4670c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* renamed from: a */
    public final void mo13266a(Object obj, long j) {
        Object obj2;
        List list = (List) C3005w7.m5537m(obj, j);
        if (list instanceof C2727b6) {
            obj2 = ((C2727b6) list).mo13227f();
        } else if (!f4670c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C2991v6) || !(list instanceof C2977u5)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C2977u5 u5Var = (C2977u5) list;
                if (u5Var.mo13385a()) {
                    u5Var.mo13386b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C3005w7.f5113e.mo13804p(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: b.l.a.c.e.i.a6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: b.l.a.c.e.i.a6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: b.l.a.c.e.i.a6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo13267b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2727b6
            if (r2 == 0) goto L_0x0020
            b.l.a.c.e.i.a6 r1 = new b.l.a.c.e.i.a6
            r1.<init>((int) r0)
            goto L_0x0069
        L_0x0020:
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2991v6
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2977u5
            if (r2 == 0) goto L_0x0030
            b.l.a.c.e.i.u5 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2977u5) r1
            b.l.a.c.e.i.u5 r0 = r1.mo13230h(r0)
        L_0x002e:
            r1 = r0
            goto L_0x0069
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x0069
        L_0x0036:
            java.lang.Class<?> r2 = f4670c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0051
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x004f:
            r1 = r2
            goto L_0x0069
        L_0x0051:
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2940r7
            if (r2 == 0) goto L_0x006f
            b.l.a.c.e.i.a6 r2 = new b.l.a.c.e.i.a6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            b.l.a.c.e.i.r7 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2940r7) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x004f
        L_0x0069:
            b.l.a.c.e.i.v7 r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r0.mo13804p(r5, r7, r1)
            goto L_0x008a
        L_0x006f:
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2991v6
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2977u5
            if (r2 == 0) goto L_0x008a
            r2 = r1
            b.l.a.c.e.i.u5 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2977u5) r2
            boolean r3 = r2.mo13385a()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            b.l.a.c.e.i.u5 r0 = r2.mo13230h(r1)
            goto L_0x002e
        L_0x008a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0099
            if (r2 <= 0) goto L_0x0099
            r1.addAll(r6)
        L_0x0099:
            if (r0 > 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            b.l.a.c.e.i.v7 r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r0.mo13804p(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2741c6.mo13267b(java.lang.Object, java.lang.Object, long):void");
    }
}
