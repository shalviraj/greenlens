package p005b.p096l.p232f.p241d0.p242e;

import p005b.p096l.p232f.C4625s;

/* renamed from: b.l.f.d0.e.f */
public final class C4561f {

    /* renamed from: a */
    public final C4555a f8527a;

    /* renamed from: b */
    public final C4562g[] f8528b;

    /* renamed from: c */
    public C4557c f8529c;

    /* renamed from: d */
    public final int f8530d;

    public C4561f(C4555a aVar, C4557c cVar) {
        this.f8527a = aVar;
        int i = aVar.f8497a;
        this.f8530d = i;
        this.f8529c = cVar;
        this.f8528b = new C4562g[(i + 2)];
    }

    /* renamed from: b */
    public static int m8402b(int i, int i2, C4558d dVar) {
        if (dVar.mo16211a()) {
            return i2;
        }
        if (!(i != -1 && dVar.f8514c == (i % 3) * 3)) {
            return i2 + 1;
        }
        dVar.f8516e = i;
        return 0;
    }

    /* renamed from: a */
    public final void mo16214a(C4562g gVar) {
        C4625s sVar;
        C4625s sVar2;
        if (gVar != null) {
            C4563h hVar = (C4563h) gVar;
            C4555a aVar = this.f8527a;
            C4558d[] dVarArr = hVar.f8532b;
            for (C4558d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.mo16212b();
                }
            }
            hVar.mo16220d(dVarArr, aVar);
            C4557c cVar = hVar.f8531a;
            boolean z = hVar.f8533c;
            if (z) {
                sVar = cVar.f8504b;
            } else {
                sVar = cVar.f8506d;
            }
            if (z) {
                sVar2 = cVar.f8505c;
            } else {
                sVar2 = cVar.f8507e;
            }
            int b = hVar.mo16217b((int) sVar.f8709b);
            int b2 = hVar.mo16217b((int) sVar2.f8709b);
            int i = -1;
            int i2 = 0;
            int i3 = 1;
            while (b < b2) {
                if (dVarArr[b] != null) {
                    C4558d dVar2 = dVarArr[b];
                    int i4 = dVar2.f8516e;
                    int i5 = i4 - i;
                    if (i5 == 0) {
                        i2++;
                    } else {
                        if (i5 == 1) {
                            i3 = Math.max(i3, i2);
                        } else if (i5 < 0 || i4 >= aVar.f8501e || i5 > b) {
                            dVarArr[b] = null;
                        } else {
                            if (i3 > 2) {
                                i5 *= i3 - 2;
                            }
                            boolean z2 = i5 >= b;
                            for (int i6 = 1; i6 <= i5 && !z2; i6++) {
                                z2 = dVarArr[b - i6] != null;
                            }
                            if (z2) {
                                dVarArr[b] = null;
                            }
                        }
                        i = dVar2.f8516e;
                        i2 = 1;
                    }
                }
                b++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            b.l.f.d0.e.g[] r0 = r10.f8528b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f8530d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = r1
        L_0x0013:
            b.l.f.d0.e.d[] r5 = r2.f8532b     // Catch:{ all -> 0x0074 }
            int r5 = r5.length     // Catch:{ all -> 0x0074 }
            if (r4 >= r5) goto L_0x006c
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0074 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0074 }
            r6[r1] = r7     // Catch:{ all -> 0x0074 }
            r0.format(r5, r6)     // Catch:{ all -> 0x0074 }
            r5 = r1
        L_0x0026:
            int r6 = r10.f8530d     // Catch:{ all -> 0x0074 }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x0062
            b.l.f.d0.e.g[] r6 = r10.f8528b     // Catch:{ all -> 0x0074 }
            r8 = r6[r5]     // Catch:{ all -> 0x0074 }
            java.lang.String r9 = "    |   "
            if (r8 != 0) goto L_0x003a
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
            r0.format(r9, r6)     // Catch:{ all -> 0x0074 }
            goto L_0x005f
        L_0x003a:
            r6 = r6[r5]     // Catch:{ all -> 0x0074 }
            b.l.f.d0.e.d[] r6 = r6.f8532b     // Catch:{ all -> 0x0074 }
            r6 = r6[r4]     // Catch:{ all -> 0x0074 }
            if (r6 != 0) goto L_0x0048
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
            r0.format(r9, r6)     // Catch:{ all -> 0x0074 }
            goto L_0x005f
        L_0x0048:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0074 }
            int r9 = r6.f8516e     // Catch:{ all -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0074 }
            r7[r1] = r9     // Catch:{ all -> 0x0074 }
            int r6 = r6.f8515d     // Catch:{ all -> 0x0074 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0074 }
            r7[r3] = r6     // Catch:{ all -> 0x0074 }
            r0.format(r8, r7)     // Catch:{ all -> 0x0074 }
        L_0x005f:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0062:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
            r0.format(r5, r6)     // Catch:{ all -> 0x0074 }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x006c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0074 }
            r0.close()
            return r1
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x007f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p241d0.p242e.C4561f.toString():java.lang.String");
    }
}
