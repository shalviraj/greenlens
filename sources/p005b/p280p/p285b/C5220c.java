package p005b.p280p.p285b;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;

/* renamed from: b.p.b.c */
public final class C5220c {

    /* renamed from: a */
    public final boolean f10261a;

    /* renamed from: b */
    public final boolean f10262b;

    /* renamed from: c */
    public final int f10263c;

    /* renamed from: d */
    public final int f10264d;

    /* renamed from: e */
    public final boolean f10265e;

    /* renamed from: f */
    public final boolean f10266f;

    /* renamed from: g */
    public final boolean f10267g;

    /* renamed from: h */
    public final int f10268h;

    /* renamed from: i */
    public final int f10269i;

    /* renamed from: j */
    public final boolean f10270j;

    /* renamed from: k */
    public final boolean f10271k;

    /* renamed from: l */
    public String f10272l;

    /* renamed from: b.p.b.c$b */
    public static final class C5222b {

        /* renamed from: a */
        public boolean f10273a;

        /* renamed from: b */
        public int f10274b = -1;

        /* renamed from: c */
        public boolean f10275c;

        /* renamed from: a */
        public C5220c mo17130a() {
            return new C5220c(this, (C5221a) null);
        }
    }

    static {
        C5222b bVar = new C5222b();
        bVar.f10273a = true;
        bVar.mo17130a();
        C5222b bVar2 = new C5222b();
        bVar2.f10275c = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        long seconds = timeUnit.toSeconds((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        }
        bVar2.f10274b = i;
        bVar2.mo17130a();
    }

    public C5220c(C5222b bVar, C5221a aVar) {
        this.f10261a = bVar.f10273a;
        this.f10262b = false;
        this.f10263c = -1;
        this.f10264d = -1;
        this.f10265e = false;
        this.f10266f = false;
        this.f10267g = false;
        this.f10268h = bVar.f10274b;
        this.f10269i = -1;
        this.f10270j = bVar.f10275c;
        this.f10271k = false;
    }

    public C5220c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f10261a = z;
        this.f10262b = z2;
        this.f10263c = i;
        this.f10264d = i2;
        this.f10265e = z3;
        this.f10266f = z4;
        this.f10267g = z5;
        this.f10268h = i3;
        this.f10269i = i4;
        this.f10270j = z6;
        this.f10271k = z7;
        this.f10272l = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p280p.p285b.C5220c m9687a(p005b.p280p.p285b.C5242n r21) {
        /*
            r0 = r21
            int r1 = r21.mo17156d()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
        L_0x0018:
            if (r6 >= r1) goto L_0x0131
            java.lang.String r2 = r0.mo17154b(r6)
            java.lang.String r4 = r0.mo17157e(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r8 = r4
            goto L_0x0038
        L_0x002f:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x012a
        L_0x0037:
            r7 = 0
        L_0x0038:
            r2 = 0
        L_0x0039:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x012a
            java.lang.String r3 = "=,;"
            int r3 = p005b.p273o.C4805c3.m8821t(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0097
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0097
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0064
            goto L_0x0097
        L_0x0064:
            int r3 = r3 + 1
            int r0 = p005b.p273o.C4805c3.m8822u(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0087
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0087
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p005b.p273o.C4805c3.m8821t(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009b
        L_0x0087:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p005b.p273o.C4805c3.m8821t(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009b
        L_0x0097:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009b:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a7
            r5 = -1
            r9 = 1
            goto L_0x0125
        L_0x00a7:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b3
            r5 = -1
            r10 = 1
            goto L_0x0125
        L_0x00b3:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c1
            r5 = -1
            int r11 = p005b.p273o.C4805c3.m8815n(r0, r5)
            goto L_0x0125
        L_0x00c1:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00cf
            r5 = -1
            int r12 = p005b.p273o.C4805c3.m8815n(r0, r5)
            goto L_0x0125
        L_0x00cf:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00da
            r5 = -1
            r13 = 1
            goto L_0x0125
        L_0x00da:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e5
            r5 = -1
            r14 = 1
            goto L_0x0125
        L_0x00e5:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f0
            r5 = -1
            r15 = 1
            goto L_0x0125
        L_0x00f0:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0101
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p005b.p273o.C4805c3.m8815n(r0, r2)
            r5 = -1
            goto L_0x0125
        L_0x0101:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010f
            r5 = -1
            int r17 = p005b.p273o.C4805c3.m8815n(r0, r5)
            goto L_0x0125
        L_0x010f:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011b
            r18 = 1
            goto L_0x0125
        L_0x011b:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r19 = 1
        L_0x0125:
            r0 = r21
            r2 = r3
            goto L_0x0039
        L_0x012a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r21
            goto L_0x0018
        L_0x0131:
            if (r7 != 0) goto L_0x0136
            r20 = 0
            goto L_0x0138
        L_0x0136:
            r20 = r8
        L_0x0138:
            b.p.b.c r0 = new b.p.b.c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.C5220c.m9687a(b.p.b.n):b.p.b.c");
    }

    public String toString() {
        String str = this.f10272l;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f10261a) {
                sb.append("no-cache, ");
            }
            if (this.f10262b) {
                sb.append("no-store, ");
            }
            if (this.f10263c != -1) {
                sb.append("max-age=");
                sb.append(this.f10263c);
                sb.append(", ");
            }
            if (this.f10264d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f10264d);
                sb.append(", ");
            }
            if (this.f10265e) {
                sb.append("private, ");
            }
            if (this.f10266f) {
                sb.append("public, ");
            }
            if (this.f10267g) {
                sb.append("must-revalidate, ");
            }
            if (this.f10268h != -1) {
                sb.append("max-stale=");
                sb.append(this.f10268h);
                sb.append(", ");
            }
            if (this.f10269i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f10269i);
                sb.append(", ");
            }
            if (this.f10270j) {
                sb.append("only-if-cached, ");
            }
            if (this.f10271k) {
                sb.append("no-transform, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f10272l = str;
        }
        return str;
    }
}
