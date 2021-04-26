package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.List;
import java.util.Objects;

/* renamed from: b.l.a.c.h.b.g3 */
public final class C3181g3 extends C3111a4 {

    /* renamed from: c */
    public String f5535c;

    /* renamed from: d */
    public String f5536d;

    /* renamed from: e */
    public int f5537e;

    /* renamed from: f */
    public String f5538f;

    /* renamed from: g */
    public long f5539g;

    /* renamed from: h */
    public final long f5540h;

    /* renamed from: i */
    public List<String> f5541i;

    /* renamed from: j */
    public int f5542j;

    /* renamed from: k */
    public String f5543k;

    /* renamed from: l */
    public String f5544l;

    /* renamed from: m */
    public String f5545m;

    public C3181g3(C3281p4 p4Var, long j) {
        super(p4Var);
        this.f5540h = j;
    }

    /* renamed from: k */
    public final boolean mo14067k() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0113 A[Catch:{ IllegalStateException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115 A[Catch:{ IllegalStateException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012b A[SYNTHETIC, Splitter:B:56:0x012b] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165 A[Catch:{ IllegalStateException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018a A[Catch:{ IllegalStateException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ef A[SYNTHETIC, Splitter:B:93:0x01ef] */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14240l() {
        /*
            r13 = this;
            b.l.a.c.h.b.p4 r0 = r13.f5638a
            android.content.Context r0 = r0.f5842a
            java.lang.String r0 = r0.getPackageName()
            b.l.a.c.h.b.p4 r1 = r13.f5638a
            android.content.Context r1 = r1.f5842a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "unknown"
            java.lang.String r3 = "Unknown"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x002d
            b.l.a.c.h.b.p4 r7 = r13.f5638a
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()
            b.l.a.c.h.b.m3 r7 = r7.f5799f
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo14415b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            b.l.a.c.h.b.p4 r7 = r13.f5638a
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()
            b.l.a.c.h.b.m3 r7 = r7.f5799f
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo14415b(r9, r8)
        L_0x0043:
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0051
            r2 = r6
        L_0x0051:
            b.l.a.c.h.b.p4 r7 = r13.f5638a     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.Context r7 = r7.f5842a     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r3
        L_0x0071:
            java.lang.String r3 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r4 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r3
            r3 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r3
        L_0x007a:
            b.l.a.c.h.b.p4 r8 = r13.f5638a
            b.l.a.c.h.b.o3 r8 = r8.mo14329d()
            b.l.a.c.h.b.m3 r8 = r8.f5799f
            java.lang.Object r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo14416c(r10, r9, r3)
            r3 = r7
        L_0x008c:
            r13.f5535c = r0
            r13.f5538f = r2
            r13.f5536d = r3
            r13.f5537e = r4
            r2 = 0
            r13.f5539g = r2
            b.l.a.c.h.b.p4 r2 = r13.f5638a
            java.lang.String r2 = r2.f5843b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00b1
            b.l.a.c.h.b.p4 r2 = r13.f5638a
            java.lang.String r2 = r2.f5844c
            java.lang.String r4 = "am"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00b1
            r2 = r3
            goto L_0x00b2
        L_0x00b1:
            r2 = r5
        L_0x00b2:
            b.l.a.c.h.b.p4 r4 = r13.f5638a
            int r4 = r4.mo14461k()
            b.l.a.c.h.b.p4 r7 = r13.f5638a
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()
            switch(r4) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00db;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00c2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00ed
        L_0x00c2:
            b.l.a.c.h.b.m3 r7 = r7.f5805l
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x00e9
        L_0x00c7:
            b.l.a.c.h.b.m3 r7 = r7.f5804k
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x00e9
        L_0x00cc:
            b.l.a.c.h.b.m3 r7 = r7.f5807n
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x00e9
        L_0x00d1:
            b.l.a.c.h.b.m3 r7 = r7.f5805l
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x00e9
        L_0x00d6:
            b.l.a.c.h.b.m3 r7 = r7.f5805l
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x00e9
        L_0x00db:
            b.l.a.c.h.b.m3 r7 = r7.f5807n
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x00e9
        L_0x00e0:
            b.l.a.c.h.b.m3 r7 = r7.f5805l
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x00e9
        L_0x00e5:
            b.l.a.c.h.b.m3 r7 = r7.f5807n
            java.lang.String r8 = "App measurement collection enabled"
        L_0x00e9:
            r7.mo14414a(r8)
            goto L_0x00f2
        L_0x00ed:
            b.l.a.c.h.b.m3 r7 = r7.f5805l
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto L_0x00e9
        L_0x00f2:
            r13.f5543k = r6
            r13.f5544l = r6
            r13.f5545m = r6
            b.l.a.c.h.b.p4 r7 = r13.f5638a
            b.l.a.c.h.b.ea r8 = r7.f5847f
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = r7.f5843b
            r13.f5544l = r2
        L_0x0102:
            r2 = 0
            android.content.Context r8 = r7.f5842a     // Catch:{ IllegalStateException -> 0x01a7 }
            java.lang.String r7 = r7.f5860s     // Catch:{ IllegalStateException -> 0x01a7 }
            java.lang.String r9 = "google_app_id"
            java.lang.String r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3360w6.m6446a(r8, r9, r7)     // Catch:{ IllegalStateException -> 0x01a7 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r3 == r8) goto L_0x0115
            r8 = r7
            goto L_0x0116
        L_0x0115:
            r8 = r6
        L_0x0116:
            r13.f5543k = r8     // Catch:{ IllegalStateException -> 0x01a7 }
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()     // Catch:{ IllegalStateException -> 0x01a7 }
            b.l.a.c.h.b.p4 r8 = r13.f5638a     // Catch:{ IllegalStateException -> 0x01a7 }
            b.l.a.c.h.b.f r8 = r8.f5848g     // Catch:{ IllegalStateException -> 0x01a7 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5385h0     // Catch:{ IllegalStateException -> 0x01a7 }
            boolean r8 = r8.mo14197r(r2, r9)     // Catch:{ IllegalStateException -> 0x01a7 }
            java.lang.String r9 = "admob_app_id"
            java.lang.String r10 = "null reference"
            if (r8 == 0) goto L_0x0165
            b.l.a.c.h.b.p4 r8 = r13.f5638a     // Catch:{ IllegalStateException -> 0x01a7 }
            android.content.Context r11 = r8.f5842a     // Catch:{ IllegalStateException -> 0x01a7 }
            java.lang.String r8 = r8.f5860s     // Catch:{ IllegalStateException -> 0x01a7 }
            java.util.Objects.requireNonNull(r11, r10)     // Catch:{ IllegalStateException -> 0x01a7 }
            android.content.res.Resources r10 = r11.getResources()     // Catch:{ IllegalStateException -> 0x01a7 }
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r12 != 0) goto L_0x013f
            goto L_0x0143
        L_0x013f:
            java.lang.String r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2795f1(r11)     // Catch:{ IllegalStateException -> 0x01a7 }
        L_0x0143:
            java.lang.String r11 = "ga_app_id"
            java.lang.String r11 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2715G1(r11, r10, r8)     // Catch:{ IllegalStateException -> 0x01a7 }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r3 == r12) goto L_0x0150
            r6 = r11
        L_0x0150:
            r13.f5545m = r6     // Catch:{ IllegalStateException -> 0x01a7 }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r3 == 0) goto L_0x015e
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r3 != 0) goto L_0x0188
        L_0x015e:
            java.lang.String r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2715G1(r9, r10, r8)     // Catch:{ IllegalStateException -> 0x01a7 }
        L_0x0162:
            r13.f5544l = r3     // Catch:{ IllegalStateException -> 0x01a7 }
            goto L_0x0188
        L_0x0165:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r3 != 0) goto L_0x0188
            b.l.a.c.h.b.p4 r3 = r13.f5638a     // Catch:{ IllegalStateException -> 0x01a7 }
            android.content.Context r6 = r3.f5842a     // Catch:{ IllegalStateException -> 0x01a7 }
            java.lang.String r3 = r3.f5860s     // Catch:{ IllegalStateException -> 0x01a7 }
            java.util.Objects.requireNonNull(r6, r10)     // Catch:{ IllegalStateException -> 0x01a7 }
            android.content.res.Resources r7 = r6.getResources()     // Catch:{ IllegalStateException -> 0x01a7 }
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r8 != 0) goto L_0x017f
            goto L_0x0183
        L_0x017f:
            java.lang.String r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2795f1(r6)     // Catch:{ IllegalStateException -> 0x01a7 }
        L_0x0183:
            java.lang.String r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2715G1(r9, r7, r3)     // Catch:{ IllegalStateException -> 0x01a7 }
            goto L_0x0162
        L_0x0188:
            if (r4 != 0) goto L_0x01b9
            b.l.a.c.h.b.p4 r3 = r13.f5638a     // Catch:{ IllegalStateException -> 0x01a7 }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ IllegalStateException -> 0x01a7 }
            b.l.a.c.h.b.m3 r3 = r3.f5807n     // Catch:{ IllegalStateException -> 0x01a7 }
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f5535c     // Catch:{ IllegalStateException -> 0x01a7 }
            java.lang.String r7 = r13.f5543k     // Catch:{ IllegalStateException -> 0x01a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01a7 }
            if (r7 == 0) goto L_0x01a1
            java.lang.String r7 = r13.f5544l     // Catch:{ IllegalStateException -> 0x01a7 }
            goto L_0x01a3
        L_0x01a1:
            java.lang.String r7 = r13.f5543k     // Catch:{ IllegalStateException -> 0x01a7 }
        L_0x01a3:
            r3.mo14416c(r4, r6, r7)     // Catch:{ IllegalStateException -> 0x01a7 }
            goto L_0x01b9
        L_0x01a7:
            r3 = move-exception
            b.l.a.c.h.b.p4 r4 = r13.f5638a
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()
            b.l.a.c.h.b.m3 r4 = r4.f5799f
            java.lang.Object r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r4.mo14416c(r6, r0, r3)
        L_0x01b9:
            r13.f5541i = r2
            b.l.a.c.h.b.p4 r0 = r13.f5638a
            b.l.a.c.h.b.ea r3 = r0.f5847f
            b.l.a.c.h.b.f r0 = r0.f5848g
            java.util.Objects.requireNonNull(r0)
            java.lang.String r3 = "analytics.safelisted_events"
            p005b.p006a.p007a.p024o.C0823f.m376j(r3)
            android.os.Bundle r4 = r0.mo14198s()
            if (r4 != 0) goto L_0x01dd
            b.l.a.c.h.b.p4 r3 = r0.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5799f
            java.lang.String r4 = "Failed to load metadata: Metadata bundle is null"
            r3.mo14414a(r4)
            goto L_0x01e3
        L_0x01dd:
            boolean r6 = r4.containsKey(r3)
            if (r6 != 0) goto L_0x01e5
        L_0x01e3:
            r3 = r2
            goto L_0x01ed
        L_0x01e5:
            int r3 = r4.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x01ed:
            if (r3 == 0) goto L_0x0215
            b.l.a.c.h.b.p4 r4 = r0.f5638a     // Catch:{ NotFoundException -> 0x0207 }
            android.content.Context r4 = r4.f5842a     // Catch:{ NotFoundException -> 0x0207 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ NotFoundException -> 0x0207 }
            int r3 = r3.intValue()     // Catch:{ NotFoundException -> 0x0207 }
            java.lang.String[] r3 = r4.getStringArray(r3)     // Catch:{ NotFoundException -> 0x0207 }
            if (r3 != 0) goto L_0x0202
            goto L_0x0215
        L_0x0202:
            java.util.List r2 = java.util.Arrays.asList(r3)     // Catch:{ NotFoundException -> 0x0207 }
            goto L_0x0215
        L_0x0207:
            r3 = move-exception
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.String r4 = "Failed to load string array from metadata: resource not found"
            r0.mo14415b(r4, r3)
        L_0x0215:
            if (r2 != 0) goto L_0x0218
            goto L_0x024b
        L_0x0218:
            int r0 = r2.size()
            if (r0 != 0) goto L_0x022c
            b.l.a.c.h.b.p4 r0 = r13.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5804k
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo14414a(r2)
            goto L_0x024d
        L_0x022c:
            java.util.Iterator r0 = r2.iterator()
        L_0x0230:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x024b
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            b.l.a.c.h.b.p4 r4 = r13.f5638a
            b.l.a.c.h.b.q9 r4 = r4.mo14467t()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo14538i0(r6, r3)
            if (r3 != 0) goto L_0x0230
            goto L_0x024d
        L_0x024b:
            r13.f5541i = r2
        L_0x024d:
            if (r1 == 0) goto L_0x025a
            b.l.a.c.h.b.p4 r0 = r13.f5638a
            android.content.Context r0 = r0.f5842a
            boolean r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2826n0(r0)
            r13.f5542j = r0
            return
        L_0x025a:
            r13.f5542j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3181g3.mo14240l():void");
    }

    /* renamed from: m */
    public final String mo14241m() {
        mo14065i();
        Objects.requireNonNull(this.f5535c, "null reference");
        return this.f5535c;
    }

    /* renamed from: n */
    public final String mo14242n() {
        mo14065i();
        Objects.requireNonNull(this.f5543k, "null reference");
        return this.f5543k;
    }
}
