package p421m.p422m0.p426g;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p421m.C7839e0;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C8014u;
import p421m.p422m0.p427h.C7906d;
import p435n.C8030a0;
import p435n.C8040e;
import p435n.C8047j;
import p435n.C8048k;
import p435n.C8064y;

/* renamed from: m.m0.g.c */
public final class C7883c {

    /* renamed from: a */
    public boolean f15659a;

    /* renamed from: b */
    public final C7894i f15660b;

    /* renamed from: c */
    public final C7887e f15661c;

    /* renamed from: d */
    public final C8014u f15662d;

    /* renamed from: e */
    public final C7886d f15663e;

    /* renamed from: f */
    public final C7906d f15664f;

    /* renamed from: m.m0.g.c$a */
    public final class C7884a extends C8047j {

        /* renamed from: h */
        public boolean f15665h;

        /* renamed from: i */
        public long f15666i;

        /* renamed from: j */
        public boolean f15667j;

        /* renamed from: k */
        public final long f15668k;

        /* renamed from: l */
        public final /* synthetic */ C7883c f15669l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7884a(C7883c cVar, C8064y yVar, long j) {
            super(yVar);
            C6888i.m12438e(yVar, "delegate");
            this.f15669l = cVar;
            this.f15668k = j;
        }

        public void close() {
            if (!this.f15667j) {
                this.f15667j = true;
                long j = this.f15668k;
                if (j == -1 || this.f15666i == j) {
                    try {
                        this.f16150g.close();
                        mo25612d((IOException) null);
                    } catch (IOException e) {
                        throw mo25612d(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        /* renamed from: d */
        public final <E extends IOException> E mo25612d(E e) {
            if (this.f15665h) {
                return e;
            }
            this.f15665h = true;
            return this.f15669l.mo25607a(this.f15666i, false, true, e);
        }

        public void flush() {
            try {
                this.f16150g.flush();
            } catch (IOException e) {
                throw mo25612d(e);
            }
        }

        /* renamed from: j */
        public void mo17030j(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "source");
            if (!this.f15667j) {
                long j2 = this.f15668k;
                if (j2 == -1 || this.f15666i + j <= j2) {
                    try {
                        C6888i.m12438e(eVar, "source");
                        this.f16150g.mo17030j(eVar, j);
                        this.f15666i += j;
                    } catch (IOException e) {
                        throw mo25612d(e);
                    }
                } else {
                    StringBuilder u = C0843a.m460u("expected ");
                    u.append(this.f15668k);
                    u.append(" bytes but received ");
                    u.append(this.f15666i + j);
                    throw new ProtocolException(u.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* renamed from: m.m0.g.c$b */
    public final class C7885b extends C8048k {

        /* renamed from: h */
        public long f15670h;

        /* renamed from: i */
        public boolean f15671i = true;

        /* renamed from: j */
        public boolean f15672j;

        /* renamed from: k */
        public boolean f15673k;

        /* renamed from: l */
        public final long f15674l;

        /* renamed from: m */
        public final /* synthetic */ C7883c f15675m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7885b(C7883c cVar, C8030a0 a0Var, long j) {
            super(a0Var);
            C6888i.m12438e(a0Var, "delegate");
            this.f15675m = cVar;
            this.f15674l = j;
            if (j == 0) {
                mo25613d((IOException) null);
            }
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "sink");
            if (!this.f15673k) {
                try {
                    long T = this.f16151g.mo17031T(eVar, j);
                    if (this.f15671i) {
                        this.f15671i = false;
                        C7883c cVar = this.f15675m;
                        C8014u uVar = cVar.f15662d;
                        C7887e eVar2 = cVar.f15661c;
                        Objects.requireNonNull(uVar);
                        C6888i.m12438e(eVar2, NotificationCompat.CATEGORY_CALL);
                    }
                    if (T == -1) {
                        mo25613d((IOException) null);
                        return -1;
                    }
                    long j2 = this.f15670h + T;
                    long j3 = this.f15674l;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f15674l + " bytes but received " + j2);
                        }
                    }
                    this.f15670h = j2;
                    if (j2 == j3) {
                        mo25613d((IOException) null);
                    }
                    return T;
                } catch (IOException e) {
                    throw mo25613d(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f15673k) {
                this.f15673k = true;
                try {
                    super.close();
                    mo25613d((IOException) null);
                } catch (IOException e) {
                    throw mo25613d(e);
                }
            }
        }

        /* renamed from: d */
        public final <E extends IOException> E mo25613d(E e) {
            if (this.f15672j) {
                return e;
            }
            this.f15672j = true;
            if (e == null && this.f15671i) {
                this.f15671i = false;
                C7883c cVar = this.f15675m;
                C8014u uVar = cVar.f15662d;
                C7887e eVar = cVar.f15661c;
                Objects.requireNonNull(uVar);
                C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
            }
            return this.f15675m.mo25607a(this.f15670h, true, false, e);
        }
    }

    public C7883c(C7887e eVar, C8014u uVar, C7886d dVar, C7906d dVar2) {
        C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(uVar, "eventListener");
        C6888i.m12438e(dVar, "finder");
        C6888i.m12438e(dVar2, "codec");
        this.f15661c = eVar;
        this.f15662d = uVar;
        this.f15663e = dVar;
        this.f15664f = dVar2;
        this.f15660b = dVar2.mo25661h();
    }

    /* renamed from: a */
    public final <E extends IOException> E mo25607a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            mo25611e(e);
        }
        if (z2) {
            C8014u uVar = this.f15662d;
            C7887e eVar = this.f15661c;
            if (e != null) {
                uVar.mo25827b(eVar, e);
            } else {
                Objects.requireNonNull(uVar);
                C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
            }
        }
        if (z) {
            if (e != null) {
                this.f15662d.mo25828c(this.f15661c, e);
            } else {
                C8014u uVar2 = this.f15662d;
                C7887e eVar2 = this.f15661c;
                Objects.requireNonNull(uVar2);
                C6888i.m12438e(eVar2, NotificationCompat.CATEGORY_CALL);
            }
        }
        return this.f15661c.mo25626k(this, z2, z, e);
    }

    /* renamed from: b */
    public final C8064y mo25608b(C7839e0 e0Var, boolean z) {
        C6888i.m12438e(e0Var, "request");
        this.f15659a = z;
        C7844g0 g0Var = e0Var.f15531e;
        C6888i.m12436c(g0Var);
        long a = g0Var.mo25542a();
        C8014u uVar = this.f15662d;
        C7887e eVar = this.f15661c;
        Objects.requireNonNull(uVar);
        C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
        return new C7884a(this, this.f15664f.mo25659f(e0Var, a), a);
    }

    /* renamed from: c */
    public final C7850h0.C7851a mo25609c(boolean z) {
        try {
            C7850h0.C7851a g = this.f15664f.mo25660g(z);
            if (g != null) {
                C6888i.m12438e(this, "deferredTrailers");
                g.f15574m = this;
            }
            return g;
        } catch (IOException e) {
            this.f15662d.mo25828c(this.f15661c, e);
            mo25611e(e);
            throw e;
        }
    }

    /* renamed from: d */
    public final void mo25610d() {
        C8014u uVar = this.f15662d;
        C7887e eVar = this.f15661c;
        Objects.requireNonNull(uVar);
        C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 > 1) goto L_0x0028;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25611e(java.io.IOException r6) {
        /*
            r5 = this;
            m.m0.g.d r0 = r5.f15663e
            r0.mo25616c(r6)
            m.m0.h.d r0 = r5.f15664f
            m.m0.g.i r0 = r0.mo25661h()
            m.m0.g.e r1 = r5.f15661c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)     // Catch:{ all -> 0x0056 }
            boolean r2 = r6 instanceof p421m.p422m0.p429j.C7960u     // Catch:{ all -> 0x0056 }
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r2 = r6
            m.m0.j.u r2 = (p421m.p422m0.p429j.C7960u) r2     // Catch:{ all -> 0x0056 }
            m.m0.j.b r2 = r2.f15983g     // Catch:{ all -> 0x0056 }
            m.m0.j.b r4 = p421m.p422m0.p429j.C7922b.REFUSED_STREAM     // Catch:{ all -> 0x0056 }
            if (r2 != r4) goto L_0x002b
            int r6 = r0.f15725m     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f15725m = r6     // Catch:{ all -> 0x0056 }
            if (r6 <= r3) goto L_0x0054
        L_0x0028:
            r0.f15721i = r3     // Catch:{ all -> 0x0056 }
            goto L_0x004f
        L_0x002b:
            m.m0.j.u r6 = (p421m.p422m0.p429j.C7960u) r6     // Catch:{ all -> 0x0056 }
            m.m0.j.b r6 = r6.f15983g     // Catch:{ all -> 0x0056 }
            m.m0.j.b r2 = p421m.p422m0.p429j.C7922b.CANCEL     // Catch:{ all -> 0x0056 }
            if (r6 != r2) goto L_0x0028
            boolean r6 = r1.f15698s     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0028
            goto L_0x0054
        L_0x0038:
            boolean r2 = r0.mo25640j()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0042
            boolean r2 = r6 instanceof p421m.p422m0.p429j.C7921a     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0054
        L_0x0042:
            r0.f15721i = r3     // Catch:{ all -> 0x0056 }
            int r2 = r0.f15724l     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0054
            m.c0 r1 = r1.f15701v     // Catch:{ all -> 0x0056 }
            m.k0 r2 = r0.f15729q     // Catch:{ all -> 0x0056 }
            r0.mo25634d(r1, r2, r6)     // Catch:{ all -> 0x0056 }
        L_0x004f:
            int r6 = r0.f15723k     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f15723k = r6     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)
            return
        L_0x0056:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7883c.mo25611e(java.io.IOException):void");
    }
}
