package p005b.p280p.p285b.p286a0.p290m;

import javax.security.auth.x500.X500Principal;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.p.b.a0.m.c */
public final class C5215c {

    /* renamed from: a */
    public final String f10251a;

    /* renamed from: b */
    public final int f10252b;

    /* renamed from: c */
    public int f10253c;

    /* renamed from: d */
    public int f10254d;

    /* renamed from: e */
    public int f10255e;

    /* renamed from: f */
    public int f10256f;

    /* renamed from: g */
    public char[] f10257g;

    public C5215c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f10251a = name;
        this.f10252b = name.length();
    }

    /* renamed from: a */
    public final int mo17123a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f10252b) {
            char[] cArr = this.f10257g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                StringBuilder u = C0843a.m460u("Malformed DN: ");
                u.append(this.f10251a);
                throw new IllegalStateException(u.toString());
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                StringBuilder u2 = C0843a.m460u("Malformed DN: ");
                u2.append(this.f10251a);
                throw new IllegalStateException(u2.toString());
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        StringBuilder u3 = C0843a.m460u("Malformed DN: ");
        u3.append(this.f10251a);
        throw new IllegalStateException(u3.toString());
    }

    /* renamed from: b */
    public final char mo17124b() {
        int i;
        int i2 = this.f10253c + 1;
        this.f10253c = i2;
        if (i2 != this.f10252b) {
            char[] cArr = this.f10257g;
            char c = cArr[i2];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a = mo17123a(i2);
                                this.f10253c++;
                                if (a >= 128) {
                                    if (a < 192 || a > 247) {
                                        return '?';
                                    }
                                    if (a <= 223) {
                                        a &= 31;
                                        i = 1;
                                    } else if (a <= 239) {
                                        i = 2;
                                        a &= 15;
                                    } else {
                                        i = 3;
                                        a &= 7;
                                    }
                                    for (int i3 = 0; i3 < i; i3++) {
                                        int i4 = this.f10253c + 1;
                                        this.f10253c = i4;
                                        if (i4 == this.f10252b || this.f10257g[i4] != '\\') {
                                            return '?';
                                        }
                                        int i5 = i4 + 1;
                                        this.f10253c = i5;
                                        int a2 = mo17123a(i5);
                                        this.f10253c++;
                                        if ((a2 & 192) != 128) {
                                            return '?';
                                        }
                                        a = (a << 6) + (a2 & 63);
                                    }
                                }
                                return (char) a;
                        }
                }
            }
            return cArr[i2];
        }
        StringBuilder u = C0843a.m460u("Unexpected end of DN: ");
        u.append(this.f10251a);
        throw new IllegalStateException(u.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo17125c() {
        /*
            r7 = this;
        L_0x0000:
            int r0 = r7.f10253c
            int r1 = r7.f10252b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r7.f10257g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r7.f10253c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r7.f10254d = r0
        L_0x0019:
            int r0 = r0 + 1
            r7.f10253c = r0
            int r0 = r7.f10253c
            int r1 = r7.f10252b
            r3 = 61
            if (r0 >= r1) goto L_0x0030
            char[] r4 = r7.f10257g
            char r5 = r4[r0]
            if (r5 == r3) goto L_0x0030
            char r4 = r4[r0]
            if (r4 == r2) goto L_0x0030
            goto L_0x0019
        L_0x0030:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00ce
            r7.f10255e = r0
            char[] r1 = r7.f10257g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x006d
        L_0x003c:
            int r0 = r7.f10253c
            int r1 = r7.f10252b
            if (r0 >= r1) goto L_0x0051
            char[] r5 = r7.f10257g
            char r6 = r5[r0]
            if (r6 == r3) goto L_0x0051
            char r5 = r5[r0]
            if (r5 != r2) goto L_0x0051
            int r0 = r0 + 1
            r7.f10253c = r0
            goto L_0x003c
        L_0x0051:
            char[] r5 = r7.f10257g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005a
            if (r0 == r1) goto L_0x005a
            goto L_0x006d
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r2 = r7.f10251a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006d:
            int r0 = r7.f10253c
        L_0x006f:
            int r0 = r0 + 1
            r7.f10253c = r0
            int r0 = r7.f10253c
            int r1 = r7.f10252b
            if (r0 >= r1) goto L_0x0080
            char[] r1 = r7.f10257g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x0080
            goto L_0x006f
        L_0x0080:
            int r0 = r7.f10255e
            int r1 = r7.f10254d
            int r0 = r0 - r1
            r2 = 4
            if (r0 <= r2) goto L_0x00c1
            char[] r0 = r7.f10257g
            int r3 = r1 + 3
            char r3 = r0[r3]
            r4 = 46
            if (r3 != r4) goto L_0x00c1
            char r3 = r0[r1]
            r4 = 79
            if (r3 == r4) goto L_0x009e
            char r3 = r0[r1]
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 != r4) goto L_0x00c1
        L_0x009e:
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 73
            if (r3 == r4) goto L_0x00ae
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 105(0x69, float:1.47E-43)
            if (r3 != r4) goto L_0x00c1
        L_0x00ae:
            int r3 = r1 + 2
            char r3 = r0[r3]
            r4 = 68
            if (r3 == r4) goto L_0x00be
            int r3 = r1 + 2
            char r0 = r0[r3]
            r3 = 100
            if (r0 != r3) goto L_0x00c1
        L_0x00be:
            int r1 = r1 + r2
            r7.f10254d = r1
        L_0x00c1:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r7.f10257g
            int r2 = r7.f10254d
            int r3 = r7.f10255e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r2 = r7.f10251a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p290m.C5215c.mo17125c():java.lang.String");
    }
}
