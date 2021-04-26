package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.d6 */
public final class C2755d6 extends C2769e6 {
    /* renamed from: a */
    public final void mo13266a(Object obj, long j) {
        ((C2977u5) C3005w7.m5537m(obj, j)).mo13386b();
    }

    /* renamed from: b */
    public final <E> void mo13267b(Object obj, Object obj2, long j) {
        C2977u5 u5Var = (C2977u5) C3005w7.m5537m(obj, j);
        C2977u5 u5Var2 = (C2977u5) C3005w7.m5537m(obj2, j);
        int size = u5Var.size();
        int size2 = u5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!u5Var.mo13385a()) {
                u5Var = u5Var.mo13230h(size2 + size);
            }
            u5Var.addAll(u5Var2);
        }
        if (size > 0) {
            u5Var2 = u5Var;
        }
        C3005w7.f5113e.mo13804p(obj, j, u5Var2);
    }
}
