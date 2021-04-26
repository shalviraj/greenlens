package p005b.p096l.p232f.p261z.p264e;

/* renamed from: b.l.f.z.e.c */
public class C4687c implements C4691g {
    /* renamed from: f */
    public static void m8622f(C4692h hVar, StringBuilder sb) {
        char charAt = sb.charAt(0);
        int charAt2 = (sb.charAt(1) * '(') + (charAt * 1600) + sb.charAt(2) + 1;
        hVar.f8922e.append(new String(new char[]{(char) (charAt2 / 256), (char) (charAt2 % 256)}));
        sb.delete(0, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r2 != 1) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16371a(p005b.p096l.p232f.p261z.p264e.C4692h r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.mo16385d()
            if (r1 == 0) goto L_0x0071
            char r1 = r9.mo16383b()
            int r2 = r9.f8923f
            r3 = 1
            int r2 = r2 + r3
            r9.f8923f = r2
            int r1 = r8.mo16373c(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.mo16382a()
            int r5 = r5 + r2
            r9.mo16387f(r5)
            b.l.f.z.e.j r2 = r9.f8925h
            int r2 = r2.f8933b
            int r2 = r2 - r5
            boolean r5 = r9.mo16385d()
            if (r5 != 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L_0x0044
            if (r2 == r7) goto L_0x0044
            r6 = r8
            goto L_0x0050
        L_0x0044:
            r6 = r8
        L_0x0045:
            int r7 = r0.length()
            int r7 = r7 % r4
            if (r7 != r3) goto L_0x0072
            if (r1 > r4) goto L_0x0050
            if (r2 == r3) goto L_0x0072
        L_0x0050:
            int r1 = r6.mo16372b(r9, r0, r5, r1)
            goto L_0x0045
        L_0x0055:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L_0x0005
            java.lang.String r1 = r9.f8918a
            int r2 = r9.f8923f
            int r3 = r8.mo16374d()
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2866x0(r1, r2, r3)
            int r2 = r8.mo16374d()
            if (r1 == r2) goto L_0x0005
            r1 = 0
            r9.f8924g = r1
        L_0x0071:
            r6 = r8
        L_0x0072:
            r6.mo16375e(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p261z.p264e.C4687c.mo16371a(b.l.f.z.e.h):void");
    }

    /* renamed from: b */
    public final int mo16372b(C4692h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f8923f--;
        int c = mo16373c(hVar.mo16383b(), sb2);
        hVar.f8925h = null;
        return c;
    }

    /* renamed from: c */
    public int mo16373c(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    if (c <= '/') {
                        sb.append(1);
                        i = c - '!';
                    } else if (c <= '@') {
                        sb.append(1);
                        i = (c - ':') + 15;
                    } else if (c <= '_') {
                        sb.append(1);
                        i = (c - '[') + 22;
                    } else if (c <= 127) {
                        sb.append(2);
                        i = c - '`';
                    } else {
                        sb.append("\u0001\u001e");
                        return mo16373c((char) (c - 128), sb) + 2;
                    }
                    c = (char) i;
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'A') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }

    /* renamed from: d */
    public int mo16374d() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r8.mo16385d() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r8.mo16385d() != false) goto L_0x0067;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16375e(p005b.p096l.p232f.p261z.p264e.C4692h r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.mo16382a()
            int r4 = r4 + r0
            r8.mo16387f(r4)
            b.l.f.z.e.j r0 = r8.f8925h
            int r0 = r0.f8933b
            int r0 = r0 - r4
            r4 = 2
            r5 = 0
            r6 = 254(0xfe, float:3.56E-43)
            if (r3 != r4) goto L_0x0034
            r9.append(r5)
        L_0x0023:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x002d
            m8622f(r8, r9)
            goto L_0x0023
        L_0x002d:
            boolean r9 = r8.mo16385d()
            if (r9 == 0) goto L_0x006c
            goto L_0x0067
        L_0x0034:
            if (r0 != r2) goto L_0x0053
            if (r3 != r2) goto L_0x0053
        L_0x0038:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0042
            m8622f(r8, r9)
            goto L_0x0038
        L_0x0042:
            boolean r9 = r8.mo16385d()
            if (r9 == 0) goto L_0x004d
            java.lang.StringBuilder r9 = r8.f8922e
            r9.append(r6)
        L_0x004d:
            int r9 = r8.f8923f
            int r9 = r9 - r2
            r8.f8923f = r9
            goto L_0x006c
        L_0x0053:
            if (r3 != 0) goto L_0x006f
        L_0x0055:
            int r2 = r9.length()
            if (r2 < r1) goto L_0x005f
            m8622f(r8, r9)
            goto L_0x0055
        L_0x005f:
            if (r0 > 0) goto L_0x0067
            boolean r9 = r8.mo16385d()
            if (r9 == 0) goto L_0x006c
        L_0x0067:
            java.lang.StringBuilder r9 = r8.f8922e
            r9.append(r6)
        L_0x006c:
            r8.f8924g = r5
            return
        L_0x006f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p261z.p264e.C4687c.mo16375e(b.l.f.z.e.h, java.lang.StringBuilder):void");
    }
}
