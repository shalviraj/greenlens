package p005b.p096l.p232f.p241d0.p242e;

/* renamed from: b.l.f.d0.e.g */
public class C4562g {

    /* renamed from: a */
    public final C4557c f8531a;

    /* renamed from: b */
    public final C4558d[] f8532b;

    public C4562g(C4557c cVar) {
        this.f8531a = new C4557c(cVar);
        this.f8532b = new C4558d[((cVar.f8511i - cVar.f8510h) + 1)];
    }

    /* renamed from: a */
    public final C4558d mo16216a(int i) {
        C4558d dVar;
        C4558d dVar2;
        C4558d dVar3 = this.f8532b[i - this.f8531a.f8510h];
        if (dVar3 != null) {
            return dVar3;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int i3 = i - this.f8531a.f8510h;
            int i4 = i3 - i2;
            if (i4 >= 0 && (dVar2 = this.f8532b[i4]) != null) {
                return dVar2;
            }
            int i5 = i3 + i2;
            C4558d[] dVarArr = this.f8532b;
            if (i5 < dVarArr.length && (dVar = dVarArr[i5]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo16217b(int i) {
        return i - this.f8531a.f8510h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            b.l.f.d0.e.d[] r1 = r11.f8532b     // Catch:{ all -> 0x0050 }
            int r2 = r1.length     // Catch:{ all -> 0x0050 }
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x000b:
            if (r4 >= r2) goto L_0x0048
            r6 = r1[r4]     // Catch:{ all -> 0x0050 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0050 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0050 }
            r7[r3] = r5     // Catch:{ all -> 0x0050 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0050 }
            r5 = r8
            goto L_0x0045
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0050 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0050 }
            r9[r3] = r5     // Catch:{ all -> 0x0050 }
            int r5 = r6.f8516e     // Catch:{ all -> 0x0050 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0050 }
            r9[r7] = r5     // Catch:{ all -> 0x0050 }
            r5 = 2
            int r6 = r6.f8515d     // Catch:{ all -> 0x0050 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0050 }
            r9[r5] = r6     // Catch:{ all -> 0x0050 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0050 }
            r5 = r10
        L_0x0045:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0048:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0050 }
            r0.close()
            return r1
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p241d0.p242e.C4562g.toString():java.lang.String");
    }
}
