package p005b.p096l.p097a.p113c.p145h.p147b;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1958b;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p140i.C2752d3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;
import p005b.p096l.p097a.p113c.p131e.p140i.C2806h3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2897o3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2910p3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2923q3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;
import p005b.p096l.p097a.p113c.p131e.p140i.C2987v2;
import p005b.p096l.p097a.p113c.p131e.p140i.C3026y2;

/* renamed from: b.l.a.c.h.b.p4 */
public final class C3281p4 implements C3238l5 {

    /* renamed from: I */
    public static volatile C3281p4 f5833I;

    /* renamed from: A */
    public long f5834A;

    /* renamed from: B */
    public volatile Boolean f5835B;

    /* renamed from: C */
    public Boolean f5836C;

    /* renamed from: D */
    public Boolean f5837D;

    /* renamed from: E */
    public volatile boolean f5838E;

    /* renamed from: F */
    public int f5839F;

    /* renamed from: G */
    public final AtomicInteger f5840G = new AtomicInteger(0);

    /* renamed from: H */
    public final long f5841H;

    /* renamed from: a */
    public final Context f5842a;

    /* renamed from: b */
    public final String f5843b;

    /* renamed from: c */
    public final String f5844c;

    /* renamed from: d */
    public final String f5845d;

    /* renamed from: e */
    public final boolean f5846e;

    /* renamed from: f */
    public final C3165ea f5847f;

    /* renamed from: g */
    public final C3166f f5848g;

    /* renamed from: h */
    public final C3135c4 f5849h;

    /* renamed from: i */
    public final C3269o3 f5850i;

    /* renamed from: j */
    public final C3248m4 f5851j;

    /* renamed from: k */
    public final C3340u8 f5852k;

    /* renamed from: l */
    public final C3297q9 f5853l;

    /* renamed from: m */
    public final C3214j3 f5854m;

    /* renamed from: n */
    public final C1958b f5855n;

    /* renamed from: o */
    public final C3174f7 f5856o;

    /* renamed from: p */
    public final C3294q6 f5857p;

    /* renamed from: q */
    public final C3133c2 f5858q;

    /* renamed from: r */
    public final C3338u6 f5859r;

    /* renamed from: s */
    public final String f5860s;

    /* renamed from: t */
    public C3203i3 f5861t;

    /* renamed from: u */
    public C3175f8 f5862u;

    /* renamed from: v */
    public C3243m f5863v;

    /* renamed from: w */
    public C3181g3 f5864w;

    /* renamed from: x */
    public C3171f4 f5865x;

    /* renamed from: y */
    public boolean f5866y = false;

    /* renamed from: z */
    public Boolean f5867z;

    public C3281p4(C3293q5 q5Var) {
        long j;
        String str;
        C3247m3 m3Var;
        Context context;
        Bundle bundle;
        boolean z = false;
        Context context2 = q5Var.f5883a;
        C3165ea eaVar = new C3165ea();
        this.f5847f = eaVar;
        C1960d.f3518h = eaVar;
        this.f5842a = context2;
        this.f5843b = q5Var.f5884b;
        this.f5844c = q5Var.f5885c;
        this.f5845d = q5Var.f5886d;
        this.f5846e = q5Var.f5890h;
        this.f5835B = q5Var.f5887e;
        this.f5860s = q5Var.f5892j;
        this.f5838E = true;
        C2775ec ecVar = q5Var.f5889g;
        if (!(ecVar == null || (bundle = ecVar.f4712m) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f5836C = (Boolean) obj;
            }
            Object obj2 = ecVar.f4712m.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f5837D = (Boolean) obj2;
            }
        }
        synchronized (C2910p3.f4929f) {
            C2897o3 o3Var = C2910p3.f4930g;
            Context applicationContext = context2.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            if (o3Var == null || o3Var.mo13536a() != applicationContext) {
                C3026y2.m5708c();
                C2923q3.m5103a();
                synchronized (C2752d3.class) {
                    C2752d3 d3Var = C2752d3.f4683c;
                    if (!(d3Var == null || (context = d3Var.f4684a) == null || d3Var.f4685b == null)) {
                        context.getContentResolver().unregisterContentObserver(C2752d3.f4683c.f4685b);
                    }
                    C2752d3.f4683c = null;
                }
                C2910p3.f4930g = new C2987v2(applicationContext, C1960d.m2779b1(new C2806h3(applicationContext)));
                C2910p3.f4931h.incrementAndGet();
            }
        }
        this.f5855n = C1959c.f3510a;
        Long l = q5Var.f5891i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = System.currentTimeMillis();
        }
        this.f5841H = j;
        this.f5848g = new C3166f(this);
        C3135c4 c4Var = new C3135c4(this);
        c4Var.mo14378m();
        this.f5849h = c4Var;
        C3269o3 o3Var2 = new C3269o3(this);
        o3Var2.mo14378m();
        this.f5850i = o3Var2;
        C3297q9 q9Var = new C3297q9(this);
        q9Var.mo14378m();
        this.f5853l = q9Var;
        C3214j3 j3Var = new C3214j3(this);
        j3Var.mo14378m();
        this.f5854m = j3Var;
        this.f5858q = new C3133c2(this);
        C3174f7 f7Var = new C3174f7(this);
        f7Var.mo14066j();
        this.f5856o = f7Var;
        C3294q6 q6Var = new C3294q6(this);
        q6Var.mo14066j();
        this.f5857p = q6Var;
        C3340u8 u8Var = new C3340u8(this);
        u8Var.mo14066j();
        this.f5852k = u8Var;
        C3338u6 u6Var = new C3338u6(this);
        u6Var.mo14378m();
        this.f5859r = u6Var;
        C3248m4 m4Var = new C3248m4(this);
        m4Var.mo14378m();
        this.f5851j = m4Var;
        C2775ec ecVar2 = q5Var.f5889g;
        z = (ecVar2 == null || ecVar2.f4707h == 0) ? true : z;
        if (context2.getApplicationContext() instanceof Application) {
            C3294q6 s = mo14466s();
            if (s.f5638a.f5842a.getApplicationContext() instanceof Application) {
                Application application = (Application) s.f5638a.f5842a.getApplicationContext();
                if (s.f5893c == null) {
                    s.f5893c = new C3283p6(s);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(s.f5893c);
                    application.registerActivityLifecycleCallbacks(s.f5893c);
                    m3Var = s.f5638a.mo14329d().f5807n;
                    str = "Registered activity lifecycle callback";
                }
            }
            m4Var.mo14420q(new C3270o4(this, q5Var));
        }
        m3Var = mo14329d().f5802i;
        str = "Application context is not an Application";
        m3Var.mo14414a(str);
        m4Var.mo14420q(new C3270o4(this, q5Var));
    }

    /* renamed from: h */
    public static C3281p4 m6272h(Context context, C2775ec ecVar, Long l) {
        Bundle bundle;
        if (ecVar != null && (ecVar.f4710k == null || ecVar.f4711l == null)) {
            ecVar = new C2775ec(ecVar.f4706g, ecVar.f4707h, ecVar.f4708i, ecVar.f4709j, (String) null, (String) null, ecVar.f4712m, (String) null);
        }
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (f5833I == null) {
            synchronized (C3281p4.class) {
                if (f5833I == null) {
                    f5833I = new C3281p4(new C3293q5(context, ecVar, l));
                }
            }
        } else if (!(ecVar == null || (bundle = ecVar.f4712m) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Objects.requireNonNull(f5833I, "null reference");
            f5833I.f5835B = Boolean.valueOf(ecVar.f4712m.getBoolean("dataCollectionDefaultEnabled"));
        }
        Objects.requireNonNull(f5833I, "null reference");
        return f5833I;
    }

    /* renamed from: m */
    public static final void m6273m(C3216j5 j5Var) {
        if (j5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: n */
    public static final void m6274n(C3111a4 a4Var) {
        if (a4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!a4Var.f5256b) {
            String valueOf = String.valueOf(a4Var.getClass());
            throw new IllegalStateException(C0843a.m455p(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    /* renamed from: o */
    public static final void m6275o(C3227k5 k5Var) {
        if (k5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!k5Var.mo14376k()) {
            String valueOf = String.valueOf(k5Var.getClass());
            throw new IllegalStateException(C0843a.m455p(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    @Pure
    /* renamed from: A */
    public final C3243m mo14456A() {
        m6275o(this.f5863v);
        return this.f5863v;
    }

    @Pure
    /* renamed from: a */
    public final C3165ea mo14327a() {
        return this.f5847f;
    }

    @Pure
    /* renamed from: b */
    public final C3181g3 mo14457b() {
        m6274n(this.f5864w);
        return this.f5864w;
    }

    @Pure
    /* renamed from: c */
    public final Context mo14328c() {
        return this.f5842a;
    }

    @Pure
    /* renamed from: d */
    public final C3269o3 mo14329d() {
        m6275o(this.f5850i);
        return this.f5850i;
    }

    @Pure
    /* renamed from: e */
    public final C1958b mo14330e() {
        return this.f5855n;
    }

    @Pure
    /* renamed from: f */
    public final C3248m4 mo14331f() {
        m6275o(this.f5851j);
        return this.f5851j;
    }

    @Pure
    /* renamed from: g */
    public final C3133c2 mo14458g() {
        C3133c2 c2Var = this.f5858q;
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @WorkerThread
    /* renamed from: i */
    public final boolean mo14459i() {
        return this.f5835B != null && this.f5835B.booleanValue();
    }

    @WorkerThread
    /* renamed from: j */
    public final boolean mo14460j() {
        return mo14461k() == 0;
    }

    @WorkerThread
    /* renamed from: k */
    public final int mo14461k() {
        mo14331f().mo14126h();
        if (this.f5848g.mo14200u()) {
            return 1;
        }
        Boolean bool = this.f5837D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C2980u8.m5384b();
        if (this.f5848g.mo14197r((String) null, C3134c3.f5411u0)) {
            mo14331f().mo14126h();
            if (!this.f5838E) {
                return 8;
            }
        }
        Boolean q = mo14464q().mo14145q();
        if (q != null) {
            return q.booleanValue() ? 0 : 3;
        }
        C3166f fVar = this.f5848g;
        C3165ea eaVar = fVar.f5638a.f5847f;
        Boolean t = fVar.mo14199t("firebase_analytics_collection_enabled");
        if (t != null) {
            return t.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f5836C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f5848g.mo14197r((String) null, C3134c3.f5363T) || this.f5835B == null || this.f5835B.booleanValue()) ? 0 : 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r8.f5834A) > 1000) goto L_0x0035;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14462l() {
        /*
            r8 = this;
            boolean r0 = r8.f5866y
            if (r0 == 0) goto L_0x00d8
            b.l.a.c.h.b.m4 r0 = r8.mo14331f()
            r0.mo14126h()
            java.lang.Boolean r0 = r8.f5867z
            if (r0 == 0) goto L_0x0035
            long r1 = r8.f5834A
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d1
            b.l.a.c.b.p.b r0 = r8.f5855n
            b.l.a.c.b.p.c r0 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.f5834A
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
        L_0x0035:
            b.l.a.c.b.p.b r0 = r8.f5855n
            b.l.a.c.b.p.c r0 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.f5834A = r0
            b.l.a.c.h.b.q9 r0 = r8.mo14467t()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.mo14516E(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0082
            b.l.a.c.h.b.q9 r0 = r8.mo14467t()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.mo14516E(r3)
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = r8.f5842a
            b.l.a.c.b.q.a r0 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r0)
            boolean r0 = r0.mo12295c()
            if (r0 != 0) goto L_0x0080
            b.l.a.c.h.b.f r0 = r8.f5848g
            boolean r0 = r0.mo14205z()
            if (r0 != 0) goto L_0x0080
            android.content.Context r0 = r8.f5842a
            boolean r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6341X(r0)
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = r8.f5842a
            boolean r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6337D(r0)
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            r0 = r1
            goto L_0x0083
        L_0x0082:
            r0 = r2
        L_0x0083:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.f5867z = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d1
            b.l.a.c.h.b.q9 r0 = r8.mo14467t()
            b.l.a.c.h.b.g3 r3 = r8.mo14457b()
            java.lang.String r3 = r3.mo14242n()
            b.l.a.c.h.b.g3 r4 = r8.mo14457b()
            r4.mo14065i()
            java.lang.String r4 = r4.f5544l
            b.l.a.c.h.b.g3 r5 = r8.mo14457b()
            r5.mo14065i()
            java.lang.String r6 = r5.f5545m
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)
            java.lang.String r5 = r5.f5545m
            boolean r0 = r0.mo14544o(r3, r4, r5)
            if (r0 != 0) goto L_0x00cb
            b.l.a.c.h.b.g3 r0 = r8.mo14457b()
            r0.mo14065i()
            java.lang.String r0 = r0.f5544l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = r2
        L_0x00cb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f5867z = r0
        L_0x00d1:
            java.lang.Boolean r0 = r8.f5867z
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00d8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3281p4.mo14462l():boolean");
    }

    @Pure
    /* renamed from: p */
    public final C3166f mo14463p() {
        return this.f5848g;
    }

    @Pure
    /* renamed from: q */
    public final C3135c4 mo14464q() {
        m6273m(this.f5849h);
        return this.f5849h;
    }

    @Pure
    /* renamed from: r */
    public final C3340u8 mo14465r() {
        m6274n(this.f5852k);
        return this.f5852k;
    }

    @Pure
    /* renamed from: s */
    public final C3294q6 mo14466s() {
        m6274n(this.f5857p);
        return this.f5857p;
    }

    @Pure
    /* renamed from: t */
    public final C3297q9 mo14467t() {
        m6273m(this.f5853l);
        return this.f5853l;
    }

    @Pure
    /* renamed from: u */
    public final C3214j3 mo14468u() {
        m6273m(this.f5854m);
        return this.f5854m;
    }

    @Pure
    /* renamed from: v */
    public final C3203i3 mo14469v() {
        m6274n(this.f5861t);
        return this.f5861t;
    }

    @Pure
    /* renamed from: w */
    public final C3338u6 mo14470w() {
        m6275o(this.f5859r);
        return this.f5859r;
    }

    @Pure
    /* renamed from: x */
    public final boolean mo14471x() {
        return TextUtils.isEmpty(this.f5843b);
    }

    @Pure
    /* renamed from: y */
    public final C3174f7 mo14472y() {
        m6274n(this.f5856o);
        return this.f5856o;
    }

    @Pure
    /* renamed from: z */
    public final C3175f8 mo14473z() {
        m6274n(this.f5862u);
        return this.f5862u;
    }
}
