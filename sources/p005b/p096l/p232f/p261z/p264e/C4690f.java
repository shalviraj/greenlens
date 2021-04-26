package p005b.p096l.p232f.p261z.p264e;

/* renamed from: b.l.f.z.e.f */
public final class C4690f implements C4691g {
    /* renamed from: b */
    public static String m8634b(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 8) & 255);
            char c3 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r0.append(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1 != 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r1 != 1) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r11.mo16386e();
        r7 = r11.f8925h.f8933b - r11.mo16382a();
        r8 = r11.mo16384c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r8 <= r7) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r11.mo16387f(r11.mo16382a() + 1);
        r7 = r11.f8925h.f8933b - r11.mo16382a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r8 > r7) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r7 > 2) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        if (r1 > 4) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        r1 = r1 - 1;
        r0 = m8634b(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if ((!r11.mo16385d()) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r1 > 2) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r1 > 2) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        r11.mo16387f(r11.mo16382a() + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        if ((r11.f8925h.f8933b - r11.mo16382a()) < 3) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b2, code lost:
        r11.mo16387f(r11.mo16382a() + r0.length());
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (r2 == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r11.f8925h = null;
        r11.f8923f -= r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        r11.f8922e.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        throw new java.lang.IllegalStateException("Count must not exceed 4");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
        r11.f8924g = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16371a(p005b.p096l.p232f.p261z.p264e.C4692h r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r11.mo16385d()
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            if (r1 == 0) goto L_0x0052
            char r1 = r11.mo16383b()
            r6 = 32
            if (r1 < r6) goto L_0x001c
            r6 = 63
            if (r1 > r6) goto L_0x001c
            goto L_0x0027
        L_0x001c:
            r6 = 64
            if (r1 < r6) goto L_0x004e
            r6 = 94
            if (r1 > r6) goto L_0x004e
            int r1 = r1 + -64
            char r1 = (char) r1
        L_0x0027:
            r0.append(r1)
            int r1 = r11.f8923f
            int r1 = r1 + r2
            r11.f8923f = r1
            int r1 = r0.length()
            if (r1 < r4) goto L_0x0005
            java.lang.String r1 = m8634b(r0, r3)
            java.lang.StringBuilder r6 = r11.f8922e
            r6.append(r1)
            r0.delete(r3, r4)
            java.lang.String r1 = r11.f8918a
            int r6 = r11.f8923f
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2866x0(r1, r6, r4)
            if (r1 == r4) goto L_0x0005
            r11.f8924g = r3
            goto L_0x0052
        L_0x004e:
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2794f0(r1)
            throw r5
        L_0x0052:
            r1 = 31
            r0.append(r1)
            int r1 = r0.length()     // Catch:{ all -> 0x00d9 }
            if (r1 != 0) goto L_0x005f
            goto L_0x00ce
        L_0x005f:
            r6 = 2
            if (r1 != r2) goto L_0x008a
            r11.mo16386e()     // Catch:{ all -> 0x00d9 }
            b.l.f.z.e.j r7 = r11.f8925h     // Catch:{ all -> 0x00d9 }
            int r7 = r7.f8933b     // Catch:{ all -> 0x00d9 }
            int r8 = r11.mo16382a()     // Catch:{ all -> 0x00d9 }
            int r7 = r7 - r8
            int r8 = r11.mo16384c()     // Catch:{ all -> 0x00d9 }
            if (r8 <= r7) goto L_0x0085
            int r7 = r11.mo16382a()     // Catch:{ all -> 0x00d9 }
            int r7 = r7 + r2
            r11.mo16387f(r7)     // Catch:{ all -> 0x00d9 }
            b.l.f.z.e.j r7 = r11.f8925h     // Catch:{ all -> 0x00d9 }
            int r7 = r7.f8933b     // Catch:{ all -> 0x00d9 }
            int r9 = r11.mo16382a()     // Catch:{ all -> 0x00d9 }
            int r7 = r7 - r9
        L_0x0085:
            if (r8 > r7) goto L_0x008a
            if (r7 > r6) goto L_0x008a
            goto L_0x00ce
        L_0x008a:
            if (r1 > r4) goto L_0x00d1
            int r1 = r1 - r2
            java.lang.String r0 = m8634b(r0, r3)     // Catch:{ all -> 0x00d9 }
            boolean r4 = r11.mo16385d()     // Catch:{ all -> 0x00d9 }
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x009b
            if (r1 > r6) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r2 = r3
        L_0x009c:
            if (r1 > r6) goto L_0x00bf
            int r4 = r11.mo16382a()     // Catch:{ all -> 0x00d9 }
            int r4 = r4 + r1
            r11.mo16387f(r4)     // Catch:{ all -> 0x00d9 }
            b.l.f.z.e.j r4 = r11.f8925h     // Catch:{ all -> 0x00d9 }
            int r4 = r4.f8933b     // Catch:{ all -> 0x00d9 }
            int r6 = r11.mo16382a()     // Catch:{ all -> 0x00d9 }
            int r4 = r4 - r6
            r6 = 3
            if (r4 < r6) goto L_0x00bf
            int r2 = r11.mo16382a()     // Catch:{ all -> 0x00d9 }
            int r4 = r0.length()     // Catch:{ all -> 0x00d9 }
            int r2 = r2 + r4
            r11.mo16387f(r2)     // Catch:{ all -> 0x00d9 }
            r2 = r3
        L_0x00bf:
            if (r2 == 0) goto L_0x00c9
            r11.f8925h = r5     // Catch:{ all -> 0x00d9 }
            int r0 = r11.f8923f     // Catch:{ all -> 0x00d9 }
            int r0 = r0 - r1
            r11.f8923f = r0     // Catch:{ all -> 0x00d9 }
            goto L_0x00ce
        L_0x00c9:
            java.lang.StringBuilder r1 = r11.f8922e     // Catch:{ all -> 0x00d9 }
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
        L_0x00ce:
            r11.f8924g = r3
            return
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "Count must not exceed 4"
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            r11.f8924g = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p261z.p264e.C4690f.mo16371a(b.l.f.z.e.h):void");
    }
}
