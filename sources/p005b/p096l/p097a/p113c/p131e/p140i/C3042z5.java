package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.z5 */
public class C3042z5 {

    /* renamed from: a */
    public volatile C2913p6 f5184a;

    /* renamed from: b */
    public volatile C2937r4 f5185b;

    static {
        C2726b5.m4589a();
    }

    /* renamed from: a */
    public final int mo14004a() {
        if (this.f5185b != null) {
            return ((C2924q4) this.f5185b).f4949i.length;
        }
        if (this.f5184a != null) {
            return this.f5184a.mo13540b();
        }
        return 0;
    }

    /* renamed from: b */
    public final C2937r4 mo14005b() {
        if (this.f5185b != null) {
            return this.f5185b;
        }
        synchronized (this) {
            if (this.f5185b != null) {
                C2937r4 r4Var = this.f5185b;
                return r4Var;
            }
            this.f5185b = this.f5184a == null ? C2937r4.f4977h : this.f5184a.mo13370a();
            C2937r4 r4Var2 = this.f5185b;
            return r4Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14006c(p005b.p096l.p097a.p113c.p131e.p140i.C2913p6 r2) {
        /*
            r1 = this;
            b.l.a.c.e.i.p6 r0 = r1.f5184a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            b.l.a.c.e.i.p6 r0 = r1.f5184a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f5184a = r2     // Catch:{ x5 -> 0x0011 }
            b.l.a.c.e.i.r4 r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2937r4.f4977h     // Catch:{ x5 -> 0x0011 }
            r1.f5185b = r0     // Catch:{ x5 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f5184a = r2     // Catch:{ all -> 0x001b }
            b.l.a.c.e.i.r4 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2937r4.f4977h     // Catch:{ all -> 0x001b }
            r1.f5185b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C3042z5.mo14006c(b.l.a.c.e.i.p6):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3042z5)) {
            return false;
        }
        C3042z5 z5Var = (C3042z5) obj;
        C2913p6 p6Var = this.f5184a;
        C2913p6 p6Var2 = z5Var.f5184a;
        if (p6Var == null && p6Var2 == null) {
            return mo14005b().equals(z5Var.mo14005b());
        }
        if (p6Var != null && p6Var2 != null) {
            return p6Var.equals(p6Var2);
        }
        if (p6Var != null) {
            z5Var.mo14006c(p6Var.mo13483d());
            return p6Var.equals(z5Var.f5184a);
        }
        mo14006c(p6Var2.mo13483d());
        return this.f5184a.equals(p6Var2);
    }

    public int hashCode() {
        return 1;
    }
}
