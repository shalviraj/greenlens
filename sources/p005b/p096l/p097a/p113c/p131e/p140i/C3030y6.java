package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.y6 */
public final class C3030y6 implements C2887n6 {

    /* renamed from: a */
    public final C2913p6 f5170a;

    /* renamed from: b */
    public final String f5171b;

    /* renamed from: c */
    public final Object[] f5172c;

    /* renamed from: d */
    public final int f5173d;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|(3:10|11|12)) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7 = r2.charAt(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("Failed parsing '%s' with charArray.length of %d", new java.lang.Object[]{r0, java.lang.Integer.valueOf(r6.length)}), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = new char[r0.length()];
        r0.getChars(0, r0.length(), r1, 0);
        r2 = new java.lang.String(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3030y6(p005b.p096l.p097a.p113c.p131e.p140i.C2913p6 r5, java.lang.String r6, java.lang.Object[] r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.f5170a = r5
            r4.f5171b = r6
            r4.f5172c = r7
            r5 = 1
            r7 = 0
            char r7 = r6.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x0010 }
            goto L_0x0036
        L_0x0010:
            char[] r6 = r6.toCharArray()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
            char r7 = r0.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x001f }
            r6 = r0
            goto L_0x0036
        L_0x001f:
            int r1 = r0.length()     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            char[] r1 = new char[r1]     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            int r2 = r0.length()     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            r0.getChars(r7, r2, r1, r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            java.lang.String r2 = new java.lang.String     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            r2.<init>(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            char r7 = r2.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x0059, ArrayIndexOutOfBoundsException -> 0x0057 }
            r6 = r2
        L_0x0036:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r7 >= r0) goto L_0x003e
            r4.f5173d = r7
            return
        L_0x003e:
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x0042:
            int r2 = r5 + 1
            char r5 = r6.charAt(r5)
            if (r5 < r0) goto L_0x0052
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r1
            r7 = r7 | r5
            int r1 = r1 + 13
            r5 = r2
            goto L_0x0042
        L_0x0052:
            int r5 = r5 << r1
            r5 = r5 | r7
            r4.f5173d = r5
            return
        L_0x0057:
            r0 = move-exception
            goto L_0x005a
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            r1 = r0
            r0 = r2
            goto L_0x0060
        L_0x005d:
            r1 = move-exception
            goto L_0x0060
        L_0x005f:
            r1 = move-exception
        L_0x0060:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r0
            int r6 = r6.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r5] = r6
            java.lang.String r5 = "Failed parsing '%s' with charArray.length of %d"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r2.<init>(r5, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C3030y6.<init>(b.l.a.c.e.i.p6, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: a */
    public final boolean mo13455a() {
        return (this.f5173d & 2) == 2;
    }

    /* renamed from: b */
    public final C2913p6 mo13456b() {
        return this.f5170a;
    }

    /* renamed from: c */
    public final int mo13457c() {
        return (this.f5173d & 1) == 1 ? 1 : 2;
    }
}
