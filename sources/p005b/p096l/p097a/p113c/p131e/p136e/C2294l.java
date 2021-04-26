package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.l */
public class C2294l {

    /* renamed from: a */
    public volatile C2072c0 f4031a;

    /* renamed from: b */
    public volatile C2317lm f4032b;

    static {
        C2605xm.m4408a();
    }

    /* renamed from: a */
    public final int mo12779a() {
        if (this.f4032b != null) {
            return ((C2293km) this.f4032b).f4030i.length;
        }
        if (this.f4031a != null) {
            return this.f4031a.mo12451o();
        }
        return 0;
    }

    /* renamed from: b */
    public final C2317lm mo12780b() {
        if (this.f4032b != null) {
            return this.f4032b;
        }
        synchronized (this) {
            if (this.f4032b != null) {
                C2317lm lmVar = this.f4032b;
                return lmVar;
            }
            this.f4032b = this.f4031a == null ? C2317lm.f4051h : this.f4031a.mo12441n();
            C2317lm lmVar2 = this.f4032b;
            return lmVar2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12781c(p005b.p096l.p097a.p113c.p131e.p136e.C2072c0 r2) {
        /*
            r1 = this;
            b.l.a.c.e.e.c0 r0 = r1.f4031a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            b.l.a.c.e.e.c0 r0 = r1.f4031a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f4031a = r2     // Catch:{ j -> 0x0011 }
            b.l.a.c.e.e.lm r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.f4051h     // Catch:{ j -> 0x0011 }
            r1.f4032b = r0     // Catch:{ j -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f4031a = r2     // Catch:{ all -> 0x001b }
            b.l.a.c.e.e.lm r2 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.f4051h     // Catch:{ all -> 0x001b }
            r1.f4032b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2294l.mo12781c(b.l.a.c.e.e.c0):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2294l)) {
            return false;
        }
        C2294l lVar = (C2294l) obj;
        C2072c0 c0Var = this.f4031a;
        C2072c0 c0Var2 = lVar.f4031a;
        if (c0Var == null && c0Var2 == null) {
            return mo12780b().equals(lVar.mo12780b());
        }
        if (c0Var != null && c0Var2 != null) {
            return c0Var.equals(c0Var2);
        }
        if (c0Var != null) {
            lVar.mo12781c(c0Var.mo12453q());
            return c0Var.equals(lVar.f4031a);
        }
        mo12781c(c0Var2.mo12453q());
        return this.f4031a.equals(c0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
