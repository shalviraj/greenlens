package p005b.p096l.p180d.p191q;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import p005b.p096l.p180d.p190p.C3955g;

/* renamed from: b.l.d.q.b */
public final /* synthetic */ class C3977b implements C3955g {

    /* renamed from: a */
    public final CrashlyticsRegistrar f7284a;

    public C3977b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f7284a = crashlyticsRegistrar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: b.l.d.q.f.e.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: b.l.d.q.f.e.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: b.l.d.q.f.e.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: b.l.d.q.f.e.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: b.l.d.q.f.e.f} */
    /* JADX WARNING: type inference failed for: r4v48, types: [b.l.d.q.f.e.d, b.l.d.q.f.e.b] */
    /* JADX WARNING: type inference failed for: r7v7, types: [b.l.d.q.f.e.b, b.l.d.q.f.e.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x031c A[SYNTHETIC, Splitter:B:68:0x031c] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x040a A[Catch:{ Exception -> 0x041e }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0440  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo15340a(p005b.p096l.p180d.p190p.C3953e r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            com.google.firebase.crashlytics.CrashlyticsRegistrar r2 = r1.f7284a
            java.util.Objects.requireNonNull(r2)
            java.lang.Class<b.l.d.d> r2 = p005b.p096l.p180d.C3825d.class
            java.lang.Object r2 = r0.mo15457a(r2)
            b.l.d.d r2 = (p005b.p096l.p180d.C3825d) r2
            java.lang.Class<b.l.d.q.f.a> r3 = p005b.p096l.p180d.p191q.p192f.C3981a.class
            java.lang.Object r3 = r0.mo15457a(r3)
            b.l.d.q.f.a r3 = (p005b.p096l.p180d.p191q.p192f.C3981a) r3
            java.lang.Class<b.l.d.n.a.a> r4 = p005b.p096l.p180d.p182n.p183a.C3840a.class
            java.lang.Object r4 = r0.mo15457a(r4)
            b.l.d.n.a.a r4 = (p005b.p096l.p180d.p182n.p183a.C3840a) r4
            java.lang.Class<b.l.d.x.e> r5 = p005b.p096l.p180d.p216x.C4290e.class
            java.lang.Object r0 = r0.mo15457a(r5)
            b.l.d.x.e r0 = (p005b.p096l.p180d.p216x.C4290e) r0
            b.l.d.q.f.b r11 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r5 = "Initializing Firebase Crashlytics 17.4.1"
            r6 = 4
            boolean r6 = r11.mo15495a(r6)
            r12 = 0
            if (r6 == 0) goto L_0x003a
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.i(r6, r5, r12)
        L_0x003a:
            r2.mo15344a()
            android.content.Context r14 = r2.f7042a
            java.lang.String r5 = r14.getPackageName()
            b.l.d.q.f.g.g0 r13 = new b.l.d.q.f.g.g0
            r13.<init>(r14, r5, r0)
            b.l.d.q.f.g.c0 r0 = new b.l.d.q.f.g.c0
            r0.<init>(r2)
            if (r3 != 0) goto L_0x0054
            b.l.d.q.f.c r3 = new b.l.d.q.f.c
            r3.<init>()
        L_0x0054:
            r6 = r3
            if (r4 == 0) goto L_0x00a4
            b.l.d.q.f.e.e r3 = new b.l.d.q.f.e.e
            r3.<init>(r4)
            b.l.d.q.a r5 = new b.l.d.q.a
            r5.<init>()
            java.lang.String r7 = "clx"
            b.l.d.n.a.a$a r7 = r4.mo15359b(r7, r5)
            if (r7 != 0) goto L_0x007b
            java.lang.String r7 = "Could not register AnalyticsConnectorListener with Crashlytics origin."
            r11.mo15496b(r7)
            java.lang.String r7 = "crash"
            b.l.d.n.a.a$a r7 = r4.mo15359b(r7, r5)
            if (r7 == 0) goto L_0x007b
            java.lang.String r4 = "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."
            r11.mo15500f(r4)
        L_0x007b:
            if (r7 == 0) goto L_0x0097
            java.lang.String r4 = "Registered Firebase Analytics listener."
            r11.mo15496b(r4)
            b.l.d.q.f.e.d r4 = new b.l.d.q.f.e.d
            r4.<init>()
            b.l.d.q.f.e.c r7 = new b.l.d.q.f.e.c
            r8 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.<init>(r3, r8, r9)
            r5.f7283b = r4
            r5.f7282a = r7
            r8 = r4
            r9 = r7
            goto L_0x00b5
        L_0x0097:
            java.lang.String r4 = "Could not register Firebase Analytics listener; a listener is already registered."
            r11.mo15500f(r4)
            b.l.d.q.f.f.b r4 = new b.l.d.q.f.f.b
            r4.<init>()
            r9 = r3
            r8 = r4
            goto L_0x00b5
        L_0x00a4:
            java.lang.String r3 = "Firebase Analytics is not available."
            r11.mo15496b(r3)
            b.l.d.q.f.f.b r3 = new b.l.d.q.f.f.b
            r3.<init>()
            b.l.d.q.f.e.f r4 = new b.l.d.q.f.e.f
            r4.<init>()
            r8 = r3
            r9 = r4
        L_0x00b5:
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r10 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2817l(r3)
            b.l.d.q.f.g.w r15 = new b.l.d.q.f.g.w
            r3 = r15
            r4 = r2
            r5 = r13
            r7 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.mo15344a()
            b.l.d.l r2 = r2.f7044c
            java.lang.String r2 = r2.f7059b
            java.lang.String r5 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7398f(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mapping file ID is: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r11.mo15496b(r3)
            b.l.d.q.f.o.a r10 = new b.l.d.q.f.o.a
            r10.<init>(r14)
            r3 = 6
            java.lang.String r7 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x044d }
            java.lang.String r6 = r13.mo15523c()     // Catch:{ NameNotFoundException -> 0x044d }
            android.content.pm.PackageManager r4 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x044d }
            r9 = 0
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r7, r9)     // Catch:{ NameNotFoundException -> 0x044d }
            int r8 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x044d }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ NameNotFoundException -> 0x044d }
            java.lang.String r4 = r4.versionName     // Catch:{ NameNotFoundException -> 0x044d }
            if (r4 != 0) goto L_0x0106
            java.lang.String r4 = "0.0"
        L_0x0106:
            r16 = r4
            b.l.d.q.f.g.a r12 = new b.l.d.q.f.g.a     // Catch:{ NameNotFoundException -> 0x044d }
            r3 = r12
            r4 = r2
            r31 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ NameNotFoundException -> 0x0449 }
            java.lang.String r3 = "Installer package name is: "
            java.lang.StringBuilder r3 = p005b.p035e.p036a.p037a.C0843a.m460u(r3)
            java.lang.String r4 = r12.f7298c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r11.mo15499e(r3)
            java.lang.String r3 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2817l(r3)
            b.l.d.q.f.j.b r4 = new b.l.d.q.f.j.b
            r4.<init>()
            java.lang.String r5 = r12.f7300e
            java.lang.String r6 = r12.f7301f
            java.lang.String r7 = r13.mo15523c()
            b.l.d.q.f.g.n0 r8 = new b.l.d.q.f.g.n0
            r8.<init>()
            b.l.d.q.f.m.g r9 = new b.l.d.q.f.m.g
            r9.<init>(r8)
            b.l.d.q.f.m.a r10 = new b.l.d.q.f.m.a
            r10.<init>(r14)
            java.util.Locale r11 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r31] = r2
            r33 = r15
            java.lang.String r15 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r1 = java.lang.String.format(r11, r15, r1)
            b.l.d.q.f.m.k.a r15 = new b.l.d.q.f.m.k.a
            r15.<init>(r1, r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = android.os.Build.MANUFACTURER
            java.lang.String r4 = r13.mo15525e(r4)
            r1[r31] = r4
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r4 = r13.mo15525e(r4)
            r16 = 1
            r1[r16] = r4
            java.lang.String r4 = "%s/%s"
            java.lang.String r17 = java.lang.String.format(r11, r4, r1)
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r18 = r13.mo15525e(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r19 = r13.mo15525e(r1)
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r4 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7398f(r14)
            r1[r31] = r4
            r1[r16] = r2
            r4 = 2
            r1[r4] = r6
            r4 = 3
            r1[r4] = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r16 = r15
            r11 = r31
        L_0x019c:
            r15 = 4
            if (r11 >= r15) goto L_0x01c2
            r15 = r1[r11]
            r20 = r1
            if (r15 == 0) goto L_0x01b9
            java.lang.String r1 = "-"
            r25 = r12
            java.lang.String r12 = ""
            java.lang.String r1 = r15.replace(r1, r12)
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r12)
            r4.add(r1)
            goto L_0x01bb
        L_0x01b9:
            r25 = r12
        L_0x01bb:
            int r11 = r11 + 1
            r1 = r20
            r12 = r25
            goto L_0x019c
        L_0x01c2:
            r25 = r12
            java.util.Collections.sort(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x01d0:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x01e0
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            r1.append(r11)
            goto L_0x01d0
        L_0x01e0:
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x01ef
            java.lang.String r1 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7405m(r1)
            goto L_0x01f0
        L_0x01ef:
            r1 = 0
        L_0x01f0:
            r21 = r1
            if (r7 == 0) goto L_0x01f7
            b.l.d.q.f.g.d0 r1 = p005b.p096l.p180d.p191q.p192f.p195g.C4003d0.APP_STORE
            goto L_0x01f9
        L_0x01f7:
            b.l.d.q.f.g.d0 r1 = p005b.p096l.p180d.p191q.p192f.p195g.C4003d0.DEVELOPER
        L_0x01f9:
            int r1 = r1.f7323g
            b.l.d.q.f.m.j.f r4 = new b.l.d.q.f.m.j.f
            r7 = r33
            r11 = r16
            r15 = r4
            r16 = r2
            r20 = r13
            r22 = r6
            r23 = r5
            r24 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            b.l.d.q.f.m.e r1 = new b.l.d.q.f.m.e
            r13 = r1
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            b.l.d.q.f.m.c r0 = p005b.p096l.p180d.p191q.p192f.p202m.C4181c.USE_CACHE
            android.content.Context r2 = r1.f7758a
            android.content.SharedPreferences r2 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7400h(r2)
            java.lang.String r4 = "existing_instance_identifier"
            java.lang.String r5 = ""
            java.lang.String r2 = r2.getString(r4, r5)
            b.l.d.q.f.m.j.f r4 = r1.f7759b
            java.lang.String r4 = r4.f7779f
            boolean r2 = r2.equals(r4)
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x0259
            b.l.d.q.f.m.j.e r0 = r1.mo15783a(r0)
            if (r0 == 0) goto L_0x0259
            java.util.concurrent.atomic.AtomicReference<b.l.d.q.f.m.j.d> r2 = r1.f7765h
            r2.set(r0)
            java.util.concurrent.atomic.AtomicReference<b.l.a.c.j.i<b.l.d.q.f.m.j.a>> r2 = r1.f7766i
            java.lang.Object r2 = r2.get()
            b.l.a.c.j.i r2 = (p005b.p096l.p097a.p113c.p150j.C3429i) r2
            b.l.d.q.f.m.j.a r0 = r0.f7770a
            r2.mo14702b(r0)
            r0 = 0
            b.l.a.c.j.h r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2740P(r0)
            goto L_0x029e
        L_0x0259:
            b.l.d.q.f.m.c r0 = p005b.p096l.p180d.p191q.p192f.p202m.C4181c.IGNORE_CACHE_EXPIRATION
            b.l.d.q.f.m.j.e r0 = r1.mo15783a(r0)
            if (r0 == 0) goto L_0x0273
            java.util.concurrent.atomic.AtomicReference<b.l.d.q.f.m.j.d> r2 = r1.f7765h
            r2.set(r0)
            java.util.concurrent.atomic.AtomicReference<b.l.a.c.j.i<b.l.d.q.f.m.j.a>> r2 = r1.f7766i
            java.lang.Object r2 = r2.get()
            b.l.a.c.j.i r2 = (p005b.p096l.p097a.p113c.p150j.C3429i) r2
            b.l.d.q.f.m.j.a r0 = r0.f7770a
            r2.mo14702b(r0)
        L_0x0273:
            b.l.d.q.f.g.c0 r0 = r1.f7764g
            b.l.a.c.j.i<java.lang.Void> r2 = r0.f7315g
            b.l.a.c.j.e0<TResult> r2 = r2.f6197a
            java.lang.Object r4 = r0.f7311c
            monitor-enter(r4)
            b.l.a.c.j.i<java.lang.Void> r0 = r0.f7312d     // Catch:{ all -> 0x0446 }
            b.l.a.c.j.e0<TResult> r0 = r0.f6197a     // Catch:{ all -> 0x0446 }
            monitor-exit(r4)     // Catch:{ all -> 0x0446 }
            java.util.concurrent.ExecutorService r4 = p005b.p096l.p180d.p191q.p192f.p195g.C4039s0.f7417a
            b.l.a.c.j.i r4 = new b.l.a.c.j.i
            r4.<init>()
            b.l.d.q.f.g.q0 r5 = new b.l.d.q.f.g.q0
            r5.<init>(r4)
            r2.mo14684f(r5)
            r0.mo14684f(r5)
            b.l.a.c.j.e0<TResult> r0 = r4.f6197a
            b.l.d.q.f.m.d r2 = new b.l.d.q.f.m.d
            r2.<init>(r1)
            b.l.a.c.j.h r0 = r0.mo14693o(r3, r2)
        L_0x029e:
            b.l.d.q.c r2 = new b.l.d.q.c
            r2.<init>()
            r0.mo14685g(r3, r2)
            android.content.Context r0 = r7.f7422a
            java.lang.String r2 = "com.crashlytics.RequireBuildId"
            r4 = 1
            boolean r0 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7396d(r0, r2, r4)
            r2 = r25
            java.lang.String r4 = r2.f7297b
            java.lang.String r5 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            java.lang.String r6 = "FirebaseCrashlytics"
            if (r0 != 0) goto L_0x02c1
            b.l.d.q.f.b r0 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r4 = "Configured not to require a build ID."
            r0.mo15499e(r4)
            goto L_0x02c7
        L_0x02c1:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x02c9
        L_0x02c7:
            r9 = 1
            goto L_0x031a
        L_0x02c9:
            java.lang.String r0 = "."
            android.util.Log.e(r6, r0)
            java.lang.String r4 = ".     |  | "
            android.util.Log.e(r6, r4)
            java.lang.String r4 = ".     |  |"
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r4)
            java.lang.String r8 = ".   \\ |  | /"
            android.util.Log.e(r6, r8)
            java.lang.String r8 = ".    \\    /"
            android.util.Log.e(r6, r8)
            java.lang.String r8 = ".     \\  /"
            android.util.Log.e(r6, r8)
            java.lang.String r8 = ".      \\/"
            android.util.Log.e(r6, r8)
            android.util.Log.e(r6, r0)
            android.util.Log.e(r6, r5)
            android.util.Log.e(r6, r0)
            java.lang.String r8 = ".      /\\"
            android.util.Log.e(r6, r8)
            java.lang.String r8 = ".     /  \\"
            android.util.Log.e(r6, r8)
            java.lang.String r8 = ".    /    \\"
            android.util.Log.e(r6, r8)
            java.lang.String r8 = ".   / |  | \\"
            android.util.Log.e(r6, r8)
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r0)
            r9 = r31
        L_0x031a:
            if (r9 == 0) goto L_0x0440
            b.l.d.q.f.k.h r0 = new b.l.d.q.f.k.h     // Catch:{ Exception -> 0x041e }
            android.content.Context r4 = r7.f7422a     // Catch:{ Exception -> 0x041e }
            r0.<init>(r4)     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.y r4 = new b.l.d.q.f.g.y     // Catch:{ Exception -> 0x041e }
            java.lang.String r5 = "crash_marker"
            r4.<init>(r5, r0)     // Catch:{ Exception -> 0x041e }
            r7.f7426e = r4     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.y r4 = new b.l.d.q.f.g.y     // Catch:{ Exception -> 0x041e }
            java.lang.String r5 = "initialization_marker"
            r4.<init>(r5, r0)     // Catch:{ Exception -> 0x041e }
            r7.f7425d = r4     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.o0 r25 = new b.l.d.q.f.g.o0     // Catch:{ Exception -> 0x041e }
            r25.<init>()     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.w$c r4 = new b.l.d.q.f.g.w$c     // Catch:{ Exception -> 0x041e }
            r4.<init>(r0)     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.h.b r5 = new b.l.d.q.f.h.b     // Catch:{ Exception -> 0x041e }
            android.content.Context r8 = r7.f7422a     // Catch:{ Exception -> 0x041e }
            r5.<init>(r8, r4)     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.n.a r8 = new b.l.d.q.f.n.a     // Catch:{ Exception -> 0x041e }
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 1
            b.l.d.q.f.n.d[] r10 = new p005b.p096l.p180d.p191q.p192f.p205n.C4198d[r10]     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.n.c r11 = new b.l.d.q.f.n.c     // Catch:{ Exception -> 0x041e }
            r12 = 10
            r11.<init>(r12)     // Catch:{ Exception -> 0x041e }
            r10[r31] = r11     // Catch:{ Exception -> 0x041e }
            r8.<init>(r9, r10)     // Catch:{ Exception -> 0x041e }
            android.content.Context r9 = r7.f7422a     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.g0 r10 = r7.f7428g     // Catch:{ Exception -> 0x041e }
            r17 = r9
            r18 = r10
            r19 = r0
            r20 = r2
            r21 = r5
            r22 = r25
            r23 = r8
            r24 = r1
            b.l.d.q.f.g.m0 r28 = p005b.p096l.p180d.p191q.p192f.p195g.C4024m0.m7422a(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.q r8 = new b.l.d.q.f.g.q     // Catch:{ Exception -> 0x041e }
            android.content.Context r9 = r7.f7422a     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.f r10 = r7.f7432k     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.g0 r11 = r7.f7428g     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.c0 r12 = r7.f7423b     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.y r13 = r7.f7426e     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.a r14 = r7.f7433l     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.e.a r15 = r7.f7430i     // Catch:{ Exception -> 0x041e }
            r17 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r0
            r23 = r13
            r24 = r2
            r26 = r5
            r27 = r4
            r29 = r14
            r30 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x041e }
            r7.f7427f = r8     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.y r0 = r7.f7425d     // Catch:{ Exception -> 0x041e }
            java.io.File r0 = r0.mo15553b()     // Catch:{ Exception -> 0x041e }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.f r2 = r7.f7432k     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.x r4 = new b.l.d.q.f.g.x     // Catch:{ Exception -> 0x041e }
            r4.<init>(r7)     // Catch:{ Exception -> 0x041e }
            b.l.a.c.j.h r2 = r2.mo15518b(r4)     // Catch:{ Exception -> 0x041e }
            java.lang.Object r2 = p005b.p096l.p180d.p191q.p192f.p195g.C4039s0.m7441a(r2)     // Catch:{ Exception -> 0x03be }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x03be }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x041e }
            r4.equals(r2)     // Catch:{ Exception -> 0x041e }
        L_0x03be:
            b.l.d.q.f.g.q r2 = r7.f7427f     // Catch:{ Exception -> 0x041e }
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.f r5 = r2.f7392e     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.t r8 = new b.l.d.q.f.g.t     // Catch:{ Exception -> 0x041e }
            r8.<init>(r2)     // Catch:{ Exception -> 0x041e }
            r5.mo15518b(r8)     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.k r5 = new b.l.d.q.f.g.k     // Catch:{ Exception -> 0x041e }
            r5.<init>(r2)     // Catch:{ Exception -> 0x041e }
            b.l.d.q.f.g.b0 r8 = new b.l.d.q.f.g.b0     // Catch:{ Exception -> 0x041e }
            r8.<init>(r5, r1, r4)     // Catch:{ Exception -> 0x041e }
            r2.f7402o = r8     // Catch:{ Exception -> 0x041e }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r8)     // Catch:{ Exception -> 0x041e }
            if (r0 == 0) goto L_0x0415
            android.content.Context r0 = r7.f7422a     // Catch:{ Exception -> 0x041e }
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = r0.checkCallingOrSelfPermission(r2)     // Catch:{ Exception -> 0x041e }
            if (r2 != 0) goto L_0x03eb
            r9 = 1
            goto L_0x03ed
        L_0x03eb:
            r9 = r31
        L_0x03ed:
            if (r9 == 0) goto L_0x0407
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x041e }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x041e }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x041e }
            if (r0 == 0) goto L_0x0404
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ Exception -> 0x041e }
            if (r0 == 0) goto L_0x0404
            goto L_0x0407
        L_0x0404:
            r9 = r31
            goto L_0x0408
        L_0x0407:
            r9 = 1
        L_0x0408:
            if (r9 == 0) goto L_0x0415
            b.l.d.q.f.b r0 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ Exception -> 0x041e }
            java.lang.String r2 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r0.mo15496b(r2)     // Catch:{ Exception -> 0x041e }
            r7.mo15547b(r1)     // Catch:{ Exception -> 0x041e }
            goto L_0x0430
        L_0x0415:
            b.l.d.q.f.b r0 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r2 = "Successfully configured exception handler."
            r0.mo15496b(r2)
            r9 = 1
            goto L_0x0432
        L_0x041e:
            r0 = move-exception
            b.l.d.q.f.b r2 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            r4 = 6
            boolean r2 = r2.mo15495a(r4)
            if (r2 == 0) goto L_0x042d
            java.lang.String r2 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r6, r2, r0)
        L_0x042d:
            r0 = 0
            r7.f7427f = r0
        L_0x0430:
            r9 = r31
        L_0x0432:
            b.l.d.q.d r0 = new b.l.d.q.d
            r0.<init>(r9, r7, r1)
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2829o(r3, r0)
            b.l.d.q.e r0 = new b.l.d.q.e
            r0.<init>(r7)
            goto L_0x045e
        L_0x0440:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0446:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0446 }
            throw r0
        L_0x0449:
            r0 = move-exception
            r12 = 0
            r3 = 6
            goto L_0x044e
        L_0x044d:
            r0 = move-exception
        L_0x044e:
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r2 = "Error retrieving app package info."
            boolean r1 = r1.mo15495a(r3)
            if (r1 == 0) goto L_0x045d
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.e(r1, r2, r0)
        L_0x045d:
            r0 = r12
        L_0x045e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.C3977b.mo15340a(b.l.d.p.e):java.lang.Object");
    }
}
