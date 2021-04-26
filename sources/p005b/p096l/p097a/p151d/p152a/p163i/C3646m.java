package p005b.p096l.p097a.p151d.p152a.p163i;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: b.l.a.d.a.i.m */
public final class C3646m<ResultT> {

    /* renamed from: a */
    public final Object f6719a = new Object();

    /* renamed from: b */
    public Queue<C3645l<ResultT>> f6720b;

    /* renamed from: c */
    public boolean f6721c;

    /* renamed from: a */
    public final void mo14926a(C3645l<ResultT> lVar) {
        synchronized (this.f6719a) {
            if (this.f6720b == null) {
                this.f6720b = new ArrayDeque();
            }
            this.f6720b.add(lVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f6719a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f6720b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f6721c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo14923a(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14927b(p005b.p096l.p097a.p151d.p152a.p163i.C3651r<ResultT> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6719a
            monitor-enter(r0)
            java.util.Queue<b.l.a.d.a.i.l<ResultT>> r1 = r2.f6720b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f6721c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f6721c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f6719a
            monitor-enter(r1)
            java.util.Queue<b.l.a.d.a.i.l<ResultT>> r0 = r2.f6720b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            b.l.a.d.a.i.l r0 = (p005b.p096l.p097a.p151d.p152a.p163i.C3645l) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f6721c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo14923a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p151d.p152a.p163i.C3646m.mo14927b(b.l.a.d.a.i.r):void");
    }
}
