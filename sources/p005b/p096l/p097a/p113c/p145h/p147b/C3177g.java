package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;

/* renamed from: b.l.a.c.h.b.g */
public final class C3177g {

    /* renamed from: c */
    public static final C3177g f5529c = new C3177g((Boolean) null, (Boolean) null);

    /* renamed from: a */
    public final Boolean f5530a;

    /* renamed from: b */
    public final Boolean f5531b;

    public C3177g(Boolean bool, Boolean bool2) {
        this.f5530a = bool;
        this.f5531b = bool2;
    }

    /* renamed from: a */
    public static C3177g m5990a(Bundle bundle) {
        return bundle == null ? f5529c : new C3177g(m5995k(bundle.getString("ad_storage")), m5995k(bundle.getString("analytics_storage")));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p097a.p113c.p145h.p147b.C3177g m5991b(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0038
            int r1 = r7.length()
            r2 = 49
            r3 = 48
            r4 = 3
            if (r1 < r4) goto L_0x001e
            r1 = 2
            char r1 = r7.charAt(r1)
            if (r1 == r3) goto L_0x001b
            if (r1 == r2) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x001f
        L_0x001b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            int r5 = r7.length()
            r6 = 4
            if (r5 < r6) goto L_0x0035
            char r7 = r7.charAt(r4)
            if (r7 == r3) goto L_0x0032
            if (r7 == r2) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L_0x0034
        L_0x0032:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L_0x0034:
            r0 = r7
        L_0x0035:
            r7 = r0
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r7 = r0
        L_0x0039:
            b.l.a.c.h.b.g r1 = new b.l.a.c.h.b.g
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5991b(java.lang.String):b.l.a.c.h.b.g");
    }

    /* renamed from: g */
    public static Boolean m5992g(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: i */
    public static boolean m5993i(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: j */
    public static final int m5994j(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: k */
    public static Boolean m5995k(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final String mo14232c() {
        StringBuilder sb = new StringBuilder("G1");
        Boolean bool = this.f5530a;
        char c = '1';
        sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        Boolean bool2 = this.f5531b;
        if (bool2 == null) {
            c = '-';
        } else if (!bool2.booleanValue()) {
            c = '0';
        }
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: d */
    public final boolean mo14233d() {
        Boolean bool = this.f5530a;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: e */
    public final boolean mo14234e() {
        Boolean bool = this.f5531b;
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3177g)) {
            return false;
        }
        C3177g gVar = (C3177g) obj;
        return m5994j(this.f5530a) == m5994j(gVar.f5530a) && m5994j(this.f5531b) == m5994j(gVar.f5531b);
    }

    /* renamed from: f */
    public final boolean mo14236f(C3177g gVar) {
        Boolean bool = this.f5530a;
        Boolean bool2 = Boolean.FALSE;
        if (bool == bool2 && gVar.f5530a != bool2) {
            return true;
        }
        if (this.f5531b == bool2) {
            return gVar.f5531b != bool2;
        }
        return false;
    }

    /* renamed from: h */
    public final C3177g mo14237h(C3177g gVar) {
        return new C3177g(m5992g(this.f5530a, gVar.f5530a), m5992g(this.f5531b, gVar.f5531b));
    }

    public final int hashCode() {
        return m5994j(this.f5531b) + ((m5994j(this.f5530a) + 527) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f5530a;
        String str = "denied";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? str : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f5531b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str = "granted";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
