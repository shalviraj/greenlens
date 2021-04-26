package p005b.p096l.p180d.p216x;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3423e0;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p181a0.C3822h;
import p005b.p096l.p180d.p212u.C4228f;
import p005b.p096l.p180d.p215w.C4284b;
import p005b.p096l.p180d.p216x.C4291f;
import p005b.p096l.p180d.p216x.p217l.C4298a;
import p005b.p096l.p180d.p216x.p218m.C4299a;
import p005b.p096l.p180d.p216x.p218m.C4302b;
import p005b.p096l.p180d.p216x.p218m.C4303c;
import p005b.p096l.p180d.p216x.p218m.C4305d;
import p005b.p096l.p180d.p216x.p219n.C4309b;
import p005b.p096l.p180d.p216x.p219n.C4312c;
import p005b.p096l.p180d.p216x.p219n.C4316f;

/* renamed from: b.l.d.x.d */
public class C4288d implements C4290e {

    /* renamed from: m */
    public static final Object f7944m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f7945n = new C4289a();

    /* renamed from: a */
    public final C3825d f7946a;

    /* renamed from: b */
    public final C4312c f7947b;

    /* renamed from: c */
    public final C4303c f7948c;

    /* renamed from: d */
    public final C4297k f7949d;

    /* renamed from: e */
    public final C4302b f7950e;

    /* renamed from: f */
    public final C4295i f7951f;

    /* renamed from: g */
    public final Object f7952g = new Object();

    /* renamed from: h */
    public final ExecutorService f7953h;

    /* renamed from: i */
    public final ExecutorService f7954i;
    @GuardedBy("this")

    /* renamed from: j */
    public String f7955j;
    @GuardedBy("FirebaseInstallations.this")

    /* renamed from: k */
    public Set<C4298a> f7956k = new HashSet();
    @GuardedBy("lock")

    /* renamed from: l */
    public final List<C4296j> f7957l = new ArrayList();

    /* renamed from: b.l.d.x.d$a */
    public class C4289a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f7958a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f7958a.getAndIncrement())}));
        }
    }

    public C4288d(C3825d dVar, @NonNull C4284b<C3822h> bVar, @NonNull C4284b<C4228f> bVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f7945n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        dVar.mo15344a();
        C4312c cVar = new C4312c(dVar.f7042a, bVar, bVar2);
        C4303c cVar2 = new C4303c(dVar);
        C4297k c = C4297k.m7868c();
        C4302b bVar3 = new C4302b(dVar);
        C4295i iVar = new C4295i();
        this.f7946a = dVar;
        this.f7947b = cVar;
        this.f7948c = cVar2;
        this.f7949d = c;
        this.f7950e = bVar3;
        this.f7951f = iVar;
        this.f7953h = threadPoolExecutor;
        this.f7954i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    @NonNull
    /* renamed from: d */
    public static C4288d m7853d() {
        C3825d c = C3825d.m7208c();
        C0823f.m362c(true, "Null is not a valid value of FirebaseApp.");
        c.mo15344a();
        return (C4288d) c.f7045d.mo15457a(C4290e.class);
    }

    /* renamed from: a */
    public final C4305d mo15892a(@NonNull C4305d dVar) {
        C4316f f;
        C4316f.C4318b bVar;
        C4309b.C4311b bVar2;
        C4291f.C4292a aVar = C4291f.C4292a.UNAVAILABLE;
        C4312c cVar = this.f7947b;
        String b = mo15893b();
        C4299a aVar2 = (C4299a) dVar;
        String str = aVar2.f7971b;
        String e = mo15895e();
        String str2 = aVar2.f7974e;
        if (cVar.f8013d.mo15950a()) {
            URL a = cVar.mo15944a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{e, str}));
            int i = 0;
            while (i <= 1) {
                HttpURLConnection c = cVar.mo15945c(a, b);
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c.setDoOutput(true);
                    cVar.mo15949h(c);
                    int responseCode = c.getResponseCode();
                    cVar.f8013d.mo15951b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f = cVar.mo15947f(c);
                    } else {
                        C4312c.m7909b(c, (String) null, b, e);
                        if (responseCode == 401) {
                            C4316f.C4317a a2 = C4316f.m7925a();
                            bVar = C4316f.C4318b.AUTH_ERROR;
                            bVar2 = (C4309b.C4311b) a2;
                        } else if (responseCode == 404) {
                            C4316f.C4317a a22 = C4316f.m7925a();
                            bVar = C4316f.C4318b.AUTH_ERROR;
                            bVar2 = (C4309b.C4311b) a22;
                        } else if (responseCode == 429) {
                            throw new C4291f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C4291f.C4292a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            C4316f.C4317a a3 = C4316f.m7925a();
                            bVar = C4316f.C4318b.BAD_CONFIG;
                            bVar2 = (C4309b.C4311b) a3;
                        } else {
                            c.disconnect();
                            i++;
                        }
                        bVar2.f8007c = bVar;
                        f = bVar2.mo15942a();
                    }
                    c.disconnect();
                    C4309b bVar3 = (C4309b) f;
                    int ordinal = bVar3.f8004c.ordinal();
                    if (ordinal == 0) {
                        String str3 = bVar3.f8002a;
                        long j = bVar3.f8003b;
                        long b2 = this.f7949d.mo15906b();
                        C4299a.C4301b bVar4 = (C4299a.C4301b) dVar.mo15917j();
                        bVar4.f7980c = str3;
                        bVar4.f7982e = Long.valueOf(j);
                        bVar4.f7983f = Long.valueOf(b2);
                        return bVar4.mo15919a();
                    } else if (ordinal == 1) {
                        C4299a.C4301b bVar5 = (C4299a.C4301b) dVar.mo15917j();
                        bVar5.f7984g = "BAD CONFIG";
                        bVar5.mo15920b(C4303c.C4304a.REGISTER_ERROR);
                        return bVar5.mo15919a();
                    } else if (ordinal == 2) {
                        synchronized (this) {
                            try {
                                this.f7955j = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        C4305d.C4306a j2 = dVar.mo15917j();
                        j2.mo15920b(C4303c.C4304a.NOT_GENERATED);
                        return j2.mo15919a();
                    } else {
                        throw new C4291f("Firebase Installations Service is unavailable. Please try again later.", aVar);
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c.disconnect();
                    throw th2;
                }
            }
            throw new C4291f("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        throw new C4291f("Firebase Installations Service is unavailable. Please try again later.", aVar);
    }

    @Nullable
    /* renamed from: b */
    public String mo15893b() {
        C3825d dVar = this.f7946a;
        dVar.mo15344a();
        return dVar.f7044c.f7058a;
    }

    @VisibleForTesting
    /* renamed from: c */
    public String mo15894c() {
        C3825d dVar = this.f7946a;
        dVar.mo15344a();
        return dVar.f7044c.f7059b;
    }

    @Nullable
    /* renamed from: e */
    public String mo15895e() {
        C3825d dVar = this.f7946a;
        dVar.mo15344a();
        return dVar.f7044c.f7064g;
    }

    /* renamed from: f */
    public final String mo15896f(C4305d dVar) {
        String string;
        C3825d dVar2 = this.f7946a;
        dVar2.mo15344a();
        if (dVar2.f7043b.equals("CHIME_ANDROID_SDK") || this.f7946a.mo15350i()) {
            if (((C4299a) dVar).f7972c == C4303c.C4304a.ATTEMPT_MIGRATION) {
                C4302b bVar = this.f7950e;
                synchronized (bVar.f7986a) {
                    synchronized (bVar.f7986a) {
                        string = bVar.f7986a.getString("|S|id", (String) null);
                    }
                    if (string == null) {
                        string = bVar.mo15923a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f7951f.mo15904a() : string;
            }
        }
        return this.f7951f.mo15904a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0061 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p180d.p216x.p218m.C4305d mo15897g(p005b.p096l.p180d.p216x.p218m.C4305d r24) {
        /*
            r23 = this;
            r1 = r23
            b.l.d.x.f$a r0 = p005b.p096l.p180d.p216x.C4291f.C4292a.UNAVAILABLE
            r2 = r24
            b.l.d.x.m.a r2 = (p005b.p096l.p180d.p216x.p218m.C4299a) r2
            java.lang.String r3 = r2.f7971b
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0069
            int r3 = r3.length()
            r6 = 11
            if (r3 != r6) goto L_0x0069
            b.l.d.x.m.b r3 = r1.f7950e
            android.content.SharedPreferences r6 = r3.f7986a
            monitor-enter(r6)
            java.lang.String[] r7 = p005b.p096l.p180d.p216x.p218m.C4302b.f7985c     // Catch:{ all -> 0x0066 }
            int r8 = r7.length     // Catch:{ all -> 0x0066 }
            r9 = r5
        L_0x001f:
            if (r9 >= r8) goto L_0x0061
            r10 = r7[r9]     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = r3.f7987b     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r12.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r13 = "|T|"
            r12.append(r13)     // Catch:{ all -> 0x0066 }
            r12.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = "|"
            r12.append(r11)     // Catch:{ all -> 0x0066 }
            r12.append(r10)     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x0066 }
            android.content.SharedPreferences r11 = r3.f7986a     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r11.getString(r10, r4)     // Catch:{ all -> 0x0066 }
            if (r10 == 0) goto L_0x0063
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r11 != 0) goto L_0x0063
            java.lang.String r3 = "{"
            boolean r3 = r10.startsWith(r3)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0060
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r3.<init>(r10)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r7 = "token"
            java.lang.String r4 = r3.getString(r7)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0061
        L_0x0060:
            r4 = r10
        L_0x0061:
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0063:
            int r9 = r9 + 1
            goto L_0x001f
        L_0x0066:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x0069:
            b.l.d.x.n.c r3 = r1.f7947b
            java.lang.String r6 = r23.mo15893b()
            java.lang.String r2 = r2.f7971b
            java.lang.String r7 = r23.mo15895e()
            java.lang.String r8 = r23.mo15894c()
            b.l.d.x.n.e r9 = r3.f8013d
            boolean r9 = r9.mo15950a()
            java.lang.String r10 = "Firebase Installations Service is unavailable. Please try again later."
            if (r9 == 0) goto L_0x0175
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r5] = r7
            java.lang.String r12 = "projects/%s/installations"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.net.URL r11 = r3.mo15944a(r11)
            r12 = r5
        L_0x0093:
            if (r12 > r9) goto L_0x016f
            java.net.HttpURLConnection r13 = r3.mo15945c(r11, r6)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r13.setDoOutput(r9)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            if (r4 == 0) goto L_0x00a8
            java.lang.String r14 = "x-goog-fis-android-iid-migration-auth"
            r13.addRequestProperty(r14, r4)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
        L_0x00a8:
            r3.mo15948g(r13, r2, r8)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            int r14 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            b.l.d.x.n.e r15 = r3.f8013d     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r15.mo15951b(r14)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r15 = 200(0xc8, float:2.8E-43)
            if (r14 < r15) goto L_0x00be
            r15 = 300(0x12c, float:4.2E-43)
            if (r14 >= r15) goto L_0x00be
            r15 = r9
            goto L_0x00bf
        L_0x00be:
            r15 = r5
        L_0x00bf:
            if (r15 == 0) goto L_0x00c9
            b.l.d.x.n.d r2 = r3.mo15946e(r13)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r13.disconnect()
            goto L_0x00f8
        L_0x00c9:
            p005b.p096l.p180d.p216x.p219n.C4312c.m7909b(r13, r8, r6, r7)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r15 = 429(0x1ad, float:6.01E-43)
            if (r14 == r15) goto L_0x0158
            r15 = 500(0x1f4, float:7.0E-43)
            if (r14 < r15) goto L_0x00da
            r15 = 600(0x258, float:8.41E-43)
            if (r14 >= r15) goto L_0x00da
            goto L_0x0167
        L_0x00da:
            java.lang.String r14 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r14, r15)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            b.l.d.x.n.d$a r21 = p005b.p096l.p180d.p216x.p219n.C4313d.C4314a.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            b.l.d.x.n.a r14 = new b.l.d.x.n.a     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r22 = 0
            r16 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r13.disconnect()
            r2 = r14
        L_0x00f8:
            b.l.d.x.n.a r2 = (p005b.p096l.p180d.p216x.p219n.C4307a) r2
            b.l.d.x.n.d$a r3 = r2.f8001e
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0120
            if (r3 != r9) goto L_0x0118
            java.lang.String r0 = "BAD CONFIG"
            b.l.d.x.m.d$a r2 = r24.mo15917j()
            b.l.d.x.m.a$b r2 = (p005b.p096l.p180d.p216x.p218m.C4299a.C4301b) r2
            r2.f7984g = r0
            b.l.d.x.m.c$a r0 = p005b.p096l.p180d.p216x.p218m.C4303c.C4304a.REGISTER_ERROR
            r2.mo15920b(r0)
            b.l.d.x.m.d r0 = r2.mo15919a()
            return r0
        L_0x0118:
            b.l.d.x.f r2 = new b.l.d.x.f
            java.lang.String r3 = "Firebase Installations Service is unavailable. Please try again later."
            r2.<init>(r3, r0)
            throw r2
        L_0x0120:
            java.lang.String r0 = r2.f7998b
            java.lang.String r3 = r2.f7999c
            b.l.d.x.k r4 = r1.f7949d
            long r4 = r4.mo15906b()
            b.l.d.x.n.f r6 = r2.f8000d
            java.lang.String r6 = r6.mo15937c()
            b.l.d.x.n.f r2 = r2.f8000d
            long r7 = r2.mo15938d()
            b.l.d.x.m.d$a r2 = r24.mo15917j()
            b.l.d.x.m.a$b r2 = (p005b.p096l.p180d.p216x.p218m.C4299a.C4301b) r2
            r2.f7978a = r0
            b.l.d.x.m.c$a r0 = p005b.p096l.p180d.p216x.p218m.C4303c.C4304a.REGISTERED
            r2.mo15920b(r0)
            r2.f7980c = r6
            r2.f7981d = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.f7982e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.f7983f = r0
            b.l.d.x.m.d r0 = r2.mo15919a()
            return r0
        L_0x0158:
            b.l.d.x.f r14 = new b.l.d.x.f     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            b.l.d.x.f$a r5 = p005b.p096l.p180d.p216x.C4291f.C4292a.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r14.<init>(r15, r5)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            throw r14     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r13.disconnect()
            throw r0
        L_0x0167:
            r13.disconnect()
            int r12 = r12 + 1
            r5 = 0
            goto L_0x0093
        L_0x016f:
            b.l.d.x.f r2 = new b.l.d.x.f
            r2.<init>(r10, r0)
            throw r2
        L_0x0175:
            b.l.d.x.f r2 = new b.l.d.x.f
            r2.<init>(r10, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p216x.C4288d.mo15897g(b.l.d.x.m.d):b.l.d.x.m.d");
    }

    @NonNull
    public C3428h<String> getId() {
        String str;
        C0823f.m374i(mo15894c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0823f.m374i(mo15895e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0823f.m374i(mo15893b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String c = mo15894c();
        Pattern pattern = C4297k.f7968c;
        C0823f.m362c(c.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0823f.m362c(C4297k.f7968c.matcher(mo15893b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        synchronized (this) {
            str = this.f7955j;
        }
        if (str != null) {
            return C1960d.m2740P(str);
        }
        C3429i iVar = new C3429i();
        C4294h hVar = new C4294h(iVar);
        synchronized (this.f7952g) {
            this.f7957l.add(hVar);
        }
        C3423e0<TResult> e0Var = iVar.f6197a;
        this.f7953h.execute(new C4286b(this));
        return e0Var;
    }

    /* renamed from: h */
    public final void mo15899h(Exception exc) {
        synchronized (this.f7952g) {
            Iterator<C4296j> it = this.f7957l.iterator();
            while (it.hasNext()) {
                if (it.next().mo15902a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo15900i(C4305d dVar) {
        synchronized (this.f7952g) {
            Iterator<C4296j> it = this.f7957l.iterator();
            while (it.hasNext()) {
                if (it.next().mo15903b(dVar)) {
                    it.remove();
                }
            }
        }
    }
}
