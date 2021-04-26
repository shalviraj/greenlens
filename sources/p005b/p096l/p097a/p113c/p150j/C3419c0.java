package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: b.l.a.c.j.c0 */
public final class C3419c0<TResult> {

    /* renamed from: a */
    public final Object f6185a = new Object();

    /* renamed from: b */
    public Queue<C3417b0<TResult>> f6186b;

    /* renamed from: c */
    public boolean f6187c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f6185a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f6186b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f6187c = false;
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
        r0.mo14673c(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14675a(@androidx.annotation.NonNull p005b.p096l.p097a.p113c.p150j.C3428h<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6185a
            monitor-enter(r0)
            java.util.Queue<b.l.a.c.j.b0<TResult>> r1 = r2.f6186b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f6187c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f6187c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f6185a
            monitor-enter(r1)
            java.util.Queue<b.l.a.c.j.b0<TResult>> r0 = r2.f6186b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            b.l.a.c.j.b0 r0 = (p005b.p096l.p097a.p113c.p150j.C3417b0) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f6187c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo14673c(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p150j.C3419c0.mo14675a(b.l.a.c.j.h):void");
    }

    /* renamed from: b */
    public final void mo14676b(@NonNull C3417b0<TResult> b0Var) {
        synchronized (this.f6185a) {
            if (this.f6186b == null) {
                this.f6186b = new ArrayDeque();
            }
            this.f6186b.add(b0Var);
        }
    }
}
