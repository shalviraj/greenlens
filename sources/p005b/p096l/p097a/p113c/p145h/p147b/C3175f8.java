package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p096l.p097a.p113c.p119b.p125o.C1956a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.f8 */
public final class C3175f8 extends C3111a4 {

    /* renamed from: c */
    public final C3163e8 f5520c;

    /* renamed from: d */
    public C3170f3 f5521d;

    /* renamed from: e */
    public volatile Boolean f5522e;

    /* renamed from: f */
    public final C3232l f5523f;

    /* renamed from: g */
    public final C3351v8 f5524g;

    /* renamed from: h */
    public final List<Runnable> f5525h = new ArrayList();

    /* renamed from: i */
    public final C3232l f5526i;

    public C3175f8(C3281p4 p4Var) {
        super(p4Var);
        this.f5524g = new C3351v8(p4Var.f5855n);
        this.f5520c = new C3163e8(this);
        this.f5523f = new C3273o7(this, p4Var);
        this.f5526i = new C3295q7(this, p4Var);
    }

    /* renamed from: q */
    public static void m5974q(C3175f8 f8Var, ComponentName componentName) {
        f8Var.mo14126h();
        if (f8Var.f5521d != null) {
            f8Var.f5521d = null;
            f8Var.f5638a.mo14329d().f5807n.mo14415b("Disconnected from device MeasurementService", componentName);
            f8Var.mo14126h();
            f8Var.mo14217l();
        }
    }

    /* renamed from: k */
    public final boolean mo14067k() {
        return false;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14217l() {
        mo14126h();
        mo14065i();
        if (!mo14227w()) {
            if (mo14219n()) {
                C3163e8 e8Var = this.f5520c;
                e8Var.f5497c.mo14126h();
                Context context = e8Var.f5497c.f5638a.f5842a;
                synchronized (e8Var) {
                    if (e8Var.f5495a) {
                        e8Var.f5497c.f5638a.mo14329d().f5807n.mo14414a("Connection attempt already in progress");
                    } else if (e8Var.f5496b == null || (!e8Var.f5496b.mo12207o() && !e8Var.f5496b.mo12198a())) {
                        e8Var.f5496b = new C3225k3(context, Looper.getMainLooper(), e8Var, e8Var);
                        e8Var.f5497c.f5638a.mo14329d().f5807n.mo14414a("Connecting to remote service");
                        e8Var.f5495a = true;
                        Objects.requireNonNull(e8Var.f5496b, "null reference");
                        e8Var.f5496b.mo12214v();
                    } else {
                        e8Var.f5497c.f5638a.mo14329d().f5807n.mo14414a("Already awaiting connection attempt");
                    }
                }
            } else if (!this.f5638a.f5848g.mo14205z()) {
                C3281p4 p4Var = this.f5638a;
                C3165ea eaVar = p4Var.f5847f;
                List<ResolveInfo> queryIntentServices = p4Var.f5842a.getPackageManager().queryIntentServices(new Intent().setClassName(this.f5638a.f5842a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.f5638a.mo14329d().f5799f.mo14414a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                C3281p4 p4Var2 = this.f5638a;
                Context context2 = p4Var2.f5842a;
                C3165ea eaVar2 = p4Var2.f5847f;
                intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                C3163e8 e8Var2 = this.f5520c;
                e8Var2.f5497c.mo14126h();
                Context context3 = e8Var2.f5497c.f5638a.f5842a;
                C1956a b = C1956a.m2685b();
                synchronized (e8Var2) {
                    if (e8Var2.f5495a) {
                        e8Var2.f5497c.f5638a.mo14329d().f5807n.mo14414a("Connection attempt already in progress");
                    } else {
                        e8Var2.f5497c.f5638a.mo14329d().f5807n.mo14414a("Using local app measurement service");
                        e8Var2.f5495a = true;
                        C3163e8 e8Var3 = e8Var2.f5497c.f5520c;
                        Objects.requireNonNull(b);
                        context3.getClass().getName();
                        b.mo12288c(context3, intent, e8Var3, 129);
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final Boolean mo14218m() {
        return this.f5522e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0116  */
    @androidx.annotation.WorkerThread
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14219n() {
        /*
            r8 = this;
            r8.mo14126h()
            r8.mo14065i()
            java.lang.Boolean r0 = r8.f5522e
            if (r0 != 0) goto L_0x0136
            r8.mo14126h()
            r8.mo14065i()
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            r0.mo14126h()
            android.content.SharedPreferences r1 = r0.mo14143o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo14143o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0130
        L_0x003f:
            b.l.a.c.h.b.p4 r4 = r8.f5638a
            b.l.a.c.h.b.ea r5 = r4.f5847f
            b.l.a.c.h.b.g3 r4 = r4.mo14457b()
            r4.mo14065i()
            int r4 = r4.f5542j
            if (r4 != r1) goto L_0x0050
            goto L_0x00fb
        L_0x0050:
            b.l.a.c.h.b.p4 r4 = r8.f5638a
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()
            b.l.a.c.h.b.m3 r4 = r4.f5807n
            java.lang.String r5 = "Checking service availability"
            r4.mo14414a(r5)
            b.l.a.c.h.b.p4 r4 = r8.f5638a
            b.l.a.c.h.b.q9 r4 = r4.mo14467t()
            java.util.Objects.requireNonNull(r4)
            b.l.a.c.b.f r5 = p005b.p096l.p097a.p113c.p119b.C1763f.f3113b
            b.l.a.c.h.b.p4 r4 = r4.f5638a
            android.content.Context r4 = r4.f5842a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.mo12004b(r4, r6)
            if (r4 == 0) goto L_0x00ee
            if (r4 == r1) goto L_0x00e0
            r5 = 2
            if (r4 == r5) goto L_0x00bc
            r0 = 3
            if (r4 == r0) goto L_0x00ad
            r0 = 9
            if (r4 == r0) goto L_0x00a2
            r0 = 18
            if (r4 == r0) goto L_0x0097
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5802i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo14415b(r4, r1)
            goto L_0x00ba
        L_0x0097:
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5802i
            java.lang.String r3 = "Service updating"
            goto L_0x00f8
        L_0x00a2:
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5802i
            java.lang.String r1 = "Service invalid"
            goto L_0x00b7
        L_0x00ad:
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5802i
            java.lang.String r1 = "Service disabled"
        L_0x00b7:
            r0.mo14414a(r1)
        L_0x00ba:
            r1 = r3
            goto L_0x00fc
        L_0x00bc:
            b.l.a.c.h.b.p4 r4 = r8.f5638a
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()
            b.l.a.c.h.b.m3 r4 = r4.f5806m
            java.lang.String r5 = "Service container out of date"
            r4.mo14414a(r5)
            b.l.a.c.h.b.p4 r4 = r8.f5638a
            b.l.a.c.h.b.q9 r4 = r4.mo14467t()
            int r4 = r4.mo14522M()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00d8
            goto L_0x00fc
        L_0x00d8:
            if (r0 != 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r1 = r3
        L_0x00dc:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x00fc
        L_0x00e0:
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.String r4 = "Service missing"
            r0.mo14414a(r4)
            goto L_0x00fc
        L_0x00ee:
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.String r3 = "Service available"
        L_0x00f8:
            r0.mo14414a(r3)
        L_0x00fb:
            r3 = r1
        L_0x00fc:
            if (r3 != 0) goto L_0x0116
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            boolean r0 = r0.mo14205z()
            if (r0 == 0) goto L_0x0116
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo14414a(r1)
            goto L_0x012f
        L_0x0116:
            if (r1 == 0) goto L_0x012f
            b.l.a.c.h.b.p4 r0 = r8.f5638a
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            r0.mo14126h()
            android.content.SharedPreferences r0 = r0.mo14143o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x012f:
            r1 = r3
        L_0x0130:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f5522e = r0
        L_0x0136:
            java.lang.Boolean r0 = r8.f5522e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3175f8.mo14219n():boolean");
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo14220o() {
        mo14126h();
        mo14065i();
        C3163e8 e8Var = this.f5520c;
        if (e8Var.f5496b != null && (e8Var.f5496b.mo12198a() || e8Var.f5496b.mo12207o())) {
            e8Var.f5496b.mo12199b();
        }
        e8Var.f5496b = null;
        try {
            C1956a b = C1956a.m2685b();
            Context context = this.f5638a.f5842a;
            C3163e8 e8Var2 = this.f5520c;
            Objects.requireNonNull(b);
            context.unbindService(e8Var2);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f5521d = null;
    }

    @WorkerThread
    /* renamed from: p */
    public final boolean mo14221p() {
        mo14126h();
        mo14065i();
        if (!this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5415w0)) {
            return false;
        }
        return !mo14219n() || this.f5638a.mo14467t().mo14522M() >= C3134c3.f5417x0.mo14064a(null).intValue();
    }

    /* renamed from: r */
    public final boolean mo14222r() {
        C3165ea eaVar = this.f5638a.f5847f;
        return true;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo14223s() {
        mo14126h();
        C3351v8 v8Var = this.f5524g;
        Objects.requireNonNull((C1959c) v8Var.f6025a);
        v8Var.f6026b = SystemClock.elapsedRealtime();
        C3232l lVar = this.f5523f;
        C3166f fVar = this.f5638a.f5848g;
        lVar.mo14386b(C3134c3.f5353J.mo14064a(null).longValue());
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo14224t(Runnable runnable) {
        mo14126h();
        if (mo14227w()) {
            runnable.run();
            return;
        }
        int size = this.f5525h.size();
        C3281p4 p4Var = this.f5638a;
        C3166f fVar = p4Var.f5848g;
        if (((long) size) >= 1000) {
            p4Var.mo14329d().f5799f.mo14414a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f5525h.add(runnable);
        this.f5526i.mo14386b(60000);
        mo14217l();
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo14225u() {
        mo14126h();
        this.f5638a.mo14329d().f5807n.mo14415b("Processing queued up service tasks", Integer.valueOf(this.f5525h.size()));
        for (Runnable run : this.f5525h) {
            try {
                run.run();
            } catch (Exception e) {
                this.f5638a.mo14329d().f5799f.mo14415b("Task exception while flushing queue", e);
            }
        }
        this.f5525h.clear();
        this.f5526i.mo14387c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b9  */
    @androidx.annotation.WorkerThread
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p145h.p147b.C3352v9 mo14226v(boolean r37) {
        /*
            r36 = this;
            r1 = r36
            b.l.a.c.h.b.p4 r0 = r1.f5638a
            b.l.a.c.h.b.ea r2 = r0.f5847f
            b.l.a.c.h.b.g3 r2 = r0.mo14457b()
            r3 = 0
            r5 = 1
            r0 = 0
            if (r37 == 0) goto L_0x00c6
            b.l.a.c.h.b.p4 r6 = r1.f5638a
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()
            b.l.a.c.h.b.p4 r7 = r6.f5638a
            b.l.a.c.h.b.c4 r7 = r7.mo14464q()
            b.l.a.c.h.b.z3 r7 = r7.f5424d
            if (r7 != 0) goto L_0x0022
            goto L_0x00c6
        L_0x0022:
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.c4 r6 = r6.mo14464q()
            b.l.a.c.h.b.z3 r6 = r6.f5424d
            b.l.a.c.h.b.c4 r7 = r6.f6144e
            r7.mo14126h()
            b.l.a.c.h.b.c4 r7 = r6.f6144e
            r7.mo14126h()
            b.l.a.c.h.b.c4 r7 = r6.f6144e
            android.content.SharedPreferences r7 = r7.mo14143o()
            java.lang.String r8 = r6.f6140a
            long r7 = r7.getLong(r8, r3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0049
            r6.mo14641a()
            r7 = r3
            goto L_0x005d
        L_0x0049:
            b.l.a.c.h.b.c4 r9 = r6.f6144e
            b.l.a.c.h.b.p4 r9 = r9.f5638a
            b.l.a.c.b.p.b r9 = r9.f5855n
            b.l.a.c.b.p.c r9 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r9
            java.util.Objects.requireNonNull(r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L_0x005d:
            long r9 = r6.f6143d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            long r9 = r9 + r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x006e
            r6.mo14641a()
        L_0x006c:
            r6 = r0
            goto L_0x009c
        L_0x006e:
            b.l.a.c.h.b.c4 r7 = r6.f6144e
            android.content.SharedPreferences r7 = r7.mo14143o()
            java.lang.String r8 = r6.f6142c
            java.lang.String r7 = r7.getString(r8, r0)
            b.l.a.c.h.b.c4 r8 = r6.f6144e
            android.content.SharedPreferences r8 = r8.mo14143o()
            java.lang.String r9 = r6.f6141b
            long r8 = r8.getLong(r9, r3)
            r6.mo14641a()
            if (r7 == 0) goto L_0x009a
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.<init>(r7, r8)
            goto L_0x009c
        L_0x009a:
            android.util.Pair<java.lang.String, java.lang.Long> r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3135c4.f5422x
        L_0x009c:
            if (r6 == 0) goto L_0x00c6
            android.util.Pair<java.lang.String, java.lang.Long> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3135c4.f5422x
            if (r6 != r7) goto L_0x00a3
            goto L_0x00c6
        L_0x00a3:
            java.lang.Object r0 = r6.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r0.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + r5
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = ":"
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m456q(r9, r0, r7, r6)
        L_0x00c6:
            r17 = r0
            r2.mo14126h()
            b.l.a.c.h.b.v9 r35 = new b.l.a.c.h.b.v9
            java.lang.String r7 = r2.mo14241m()
            java.lang.String r8 = r2.mo14242n()
            r2.mo14065i()
            java.lang.String r9 = r2.f5536d
            r2.mo14065i()
            int r0 = r2.f5537e
            long r10 = (long) r0
            r2.mo14065i()
            java.lang.String r0 = r2.f5538f
            java.lang.String r6 = "null reference"
            java.util.Objects.requireNonNull(r0, r6)
            java.lang.String r12 = r2.f5538f
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            r0.mo14193n()
            r2.mo14065i()
            r2.mo14126h()
            long r13 = r2.f5539g
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            r3 = 0
            if (r0 != 0) goto L_0x0180
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.q9 r4 = r0.mo14467t()
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            android.content.Context r0 = r0.f5842a
            java.lang.String r13 = r0.getPackageName()
            r4.mo14126h()
            p005b.p006a.p007a.p024o.C0823f.m376j(r13)
            android.content.pm.PackageManager r14 = r0.getPackageManager()
            java.security.MessageDigest r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6335B()
            r18 = -1
            if (r15 != 0) goto L_0x012e
            b.l.a.c.h.b.p4 r0 = r4.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.String r4 = "Could not get MD5 instance"
            r0.mo14414a(r4)
            goto L_0x017c
        L_0x012e:
            if (r14 == 0) goto L_0x017a
            boolean r13 = r4.mo14520K(r0, r13)     // Catch:{ NameNotFoundException -> 0x016c }
            if (r13 != 0) goto L_0x017a
            b.l.a.c.b.q.a r0 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r0)     // Catch:{ NameNotFoundException -> 0x016c }
            b.l.a.c.h.b.p4 r13 = r4.f5638a     // Catch:{ NameNotFoundException -> 0x016c }
            android.content.Context r13 = r13.f5842a     // Catch:{ NameNotFoundException -> 0x016c }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x016c }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.mo12294b(r13, r14)     // Catch:{ NameNotFoundException -> 0x016c }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x016c }
            if (r0 == 0) goto L_0x015e
            int r13 = r0.length     // Catch:{ NameNotFoundException -> 0x016c }
            if (r13 <= 0) goto L_0x015e
            r0 = r0[r3]     // Catch:{ NameNotFoundException -> 0x016c }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x016c }
            byte[] r0 = r15.digest(r0)     // Catch:{ NameNotFoundException -> 0x016c }
            long r18 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6336C(r0)     // Catch:{ NameNotFoundException -> 0x016c }
            goto L_0x017c
        L_0x015e:
            b.l.a.c.h.b.p4 r0 = r4.f5638a     // Catch:{ NameNotFoundException -> 0x016c }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ NameNotFoundException -> 0x016c }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ NameNotFoundException -> 0x016c }
            java.lang.String r13 = "Could not get signatures"
            r0.mo14414a(r13)     // Catch:{ NameNotFoundException -> 0x016c }
            goto L_0x017c
        L_0x016c:
            r0 = move-exception
            b.l.a.c.h.b.p4 r4 = r4.f5638a
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()
            b.l.a.c.h.b.m3 r4 = r4.f5799f
            java.lang.String r13 = "Package name not found"
            r4.mo14415b(r13, r0)
        L_0x017a:
            r18 = 0
        L_0x017c:
            r13 = r18
            r2.f5539g = r13
        L_0x0180:
            r15 = r13
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            boolean r18 = r0.mo14460j()
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            boolean r0 = r0.f5436p
            r19 = r0 ^ 1
            r2.mo14126h()
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            boolean r0 = r0.mo14460j()
            if (r0 != 0) goto L_0x019e
            goto L_0x0216
        L_0x019e:
            b.l.a.c.e.i.hb r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2814hb.f4823h
            b.l.a.c.e.i.ib r0 = r0.mo13235a()
            r0.mo13408a()
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5389j0
            r13 = 0
            boolean r0 = r0.mo14197r(r13, r4)
            if (r0 == 0) goto L_0x01c2
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.String r3 = "Disabled IID for tests."
        L_0x01be:
            r0.mo14414a(r3)
            goto L_0x0216
        L_0x01c2:
            b.l.a.c.h.b.p4 r0 = r2.f5638a     // Catch:{ ClassNotFoundException -> 0x0216 }
            android.content.Context r0 = r0.f5842a     // Catch:{ ClassNotFoundException -> 0x0216 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0216 }
            java.lang.String r4 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0216 }
            if (r0 != 0) goto L_0x01d3
            goto L_0x0216
        L_0x01d3:
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x020b }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r4[r3] = r13     // Catch:{ Exception -> 0x020b }
            java.lang.String r13 = "getInstance"
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r13, r4)     // Catch:{ Exception -> 0x020b }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x020b }
            b.l.a.c.h.b.p4 r13 = r2.f5638a     // Catch:{ Exception -> 0x020b }
            android.content.Context r13 = r13.f5842a     // Catch:{ Exception -> 0x020b }
            r5[r3] = r13     // Catch:{ Exception -> 0x020b }
            r13 = 0
            java.lang.Object r4 = r4.invoke(r13, r5)     // Catch:{ Exception -> 0x020b }
            if (r4 != 0) goto L_0x01ef
            goto L_0x0216
        L_0x01ef:
            java.lang.String r5 = "getFirebaseInstanceId"
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0200 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r13)     // Catch:{ Exception -> 0x0200 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0200 }
            java.lang.Object r0 = r0.invoke(r4, r3)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0200 }
            goto L_0x0217
        L_0x0200:
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5804k
            java.lang.String r3 = "Failed to retrieve Firebase Instance Id"
            goto L_0x01be
        L_0x020b:
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5803j
            java.lang.String r3 = "Failed to obtain Firebase Analytics instance"
            goto L_0x01be
        L_0x0216:
            r0 = 0
        L_0x0217:
            r20 = r0
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.c4 r3 = r0.mo14464q()
            b.l.a.c.h.b.y3 r3 = r3.f5425e
            long r3 = r3.mo14633a()
            r13 = 0
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x022e
            long r3 = r0.f5841H
            goto L_0x0234
        L_0x022e:
            long r13 = r0.f5841H
            long r3 = java.lang.Math.min(r13, r3)
        L_0x0234:
            r23 = r3
            r2.mo14065i()
            int r0 = r2.f5542j
            b.l.a.c.h.b.p4 r3 = r2.f5638a
            b.l.a.c.h.b.f r3 = r3.f5848g
            boolean r26 = r3.mo14201v()
            b.l.a.c.h.b.p4 r3 = r2.f5638a
            b.l.a.c.h.b.c4 r3 = r3.mo14464q()
            r3.mo14126h()
            android.content.SharedPreferences r3 = r3.mo14143o()
            java.lang.String r4 = "deferred_analytics_collection"
            r5 = 0
            boolean r27 = r3.getBoolean(r4, r5)
            r2.mo14065i()
            java.lang.String r3 = r2.f5544l
            b.l.a.c.h.b.p4 r4 = r2.f5638a
            b.l.a.c.h.b.f r4 = r4.f5848g
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.mo14199t(r5)
            if (r4 != 0) goto L_0x026a
            r4 = 0
            goto L_0x0274
        L_0x026a:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0274:
            r29 = r4
            long r4 = r2.f5540h
            java.util.List<java.lang.String> r13 = r2.f5541i
            p005b.p096l.p097a.p113c.p131e.p140i.C3007w9.m5549b()
            b.l.a.c.h.b.p4 r14 = r2.f5638a
            b.l.a.c.h.b.f r14 = r14.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5385h0
            r21 = r13
            r13 = 0
            boolean r1 = r14.mo14197r(r13, r1)
            if (r1 == 0) goto L_0x0297
            r2.mo14065i()
            java.lang.String r1 = r2.f5545m
            java.util.Objects.requireNonNull(r1, r6)
            java.lang.String r1 = r2.f5545m
            goto L_0x0298
        L_0x0297:
            r1 = 0
        L_0x0298:
            r33 = r1
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.p4 r1 = r2.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5411u0
            r13 = 0
            boolean r1 = r1.mo14197r(r13, r6)
            if (r1 == 0) goto L_0x02b9
            b.l.a.c.h.b.p4 r1 = r2.f5638a
            b.l.a.c.h.b.c4 r1 = r1.mo14464q()
            b.l.a.c.h.b.g r1 = r1.mo14147s()
            java.lang.String r1 = r1.mo14232c()
            goto L_0x02bb
        L_0x02b9:
            java.lang.String r1 = ""
        L_0x02bb:
            r34 = r1
            r13 = 39065(0x9899, double:1.93007E-319)
            r1 = r21
            r21 = 0
            r6 = r35
            r25 = r0
            r28 = r3
            r30 = r4
            r32 = r1
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (java.lang.String) r12, (long) r13, (long) r15, (java.lang.String) r17, (boolean) r18, (boolean) r19, (java.lang.String) r20, (long) r21, (long) r23, (int) r25, (boolean) r26, (boolean) r27, (java.lang.String) r28, (java.lang.Boolean) r29, (long) r30, (java.util.List<java.lang.String>) r32, (java.lang.String) r33, (java.lang.String) r34)
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3175f8.mo14226v(boolean):b.l.a.c.h.b.v9");
    }

    @WorkerThread
    /* renamed from: w */
    public final boolean mo14227w() {
        mo14126h();
        mo14065i();
        return this.f5521d != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v59, resolved type: int} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:76|77|78|79) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:91|92|93|94) */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x023e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0240, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0242, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0244, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0245, code lost:
        r17 = r7;
        r16 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x024b, code lost:
        r17 = r7;
        r16 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0254, code lost:
        r17 = r7;
        r16 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x026f, code lost:
        if (r5.inTransaction() != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0271, code lost:
        r5.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0284, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x029b, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02b9, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02ce, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02cf, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02d2, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02d7, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x01ba, code lost:
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r9.f5638a.mo14329d().f5799f.mo14414a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0128, code lost:
        r17 = r17;
        r17 = r17;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r14.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r9.f5638a.mo14329d().f5799f.mo14414a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r9.f5638a.mo14329d().f5799f.mo14414a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0184 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x023a A[SYNTHETIC, Splitter:B:140:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0242 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x026b A[SYNTHETIC, Splitter:B:165:0x026b] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x023d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x02c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x02c1 A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14228x(p005b.p096l.p097a.p113c.p145h.p147b.C3170f3 r28, p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a r29, p005b.p096l.p097a.p113c.p145h.p147b.C3352v9 r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r27.mo14126h()
            r27.mo14065i()
            r27.mo14222r()
            b.l.a.c.h.b.p4 r0 = r1.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            r5 = 100
            r6 = 0
            r0 = r5
            r7 = r6
        L_0x001a:
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r8) goto L_0x036d
            if (r0 != r5) goto L_0x036d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            b.l.a.c.h.b.p4 r0 = r1.f5638a
            b.l.a.c.h.b.i3 r9 = r0.mo14469v()
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "Error reading entries from local database"
            r9.mo14126h()
            boolean r0 = r9.f5598d
            if (r0 == 0) goto L_0x0037
            goto L_0x005a
        L_0x0037:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            b.l.a.c.h.b.p4 r0 = r9.f5638a
            android.content.Context r0 = r0.f5842a
            java.lang.String r14 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r14)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x02ec
            r14 = 5
            r15 = r6
            r12 = r14
        L_0x004f:
            if (r15 >= r14) goto L_0x02db
            r14 = 1
            android.database.sqlite.SQLiteDatabase r5 = r9.mo14266n()     // Catch:{ SQLiteFullException -> 0x02a1, SQLiteDatabaseLockedException -> 0x028b, SQLiteException -> 0x0261, all -> 0x025c }
            if (r5 != 0) goto L_0x005e
            r9.f5598d = r14     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
        L_0x005a:
            r17 = r7
            goto L_0x02ea
        L_0x005e:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
            java.lang.String r0 = "3"
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r10}     // Catch:{ all -> 0x0231 }
            java.lang.String r19 = "type=?"
            java.lang.String[] r20 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0231 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid desc"
            java.lang.String r24 = "1"
            r16 = r5
            android.database.Cursor r14 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0231 }
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x022a }
            r25 = -1
            if (r0 == 0) goto L_0x008d
            long r16 = r14.getLong(r6)     // Catch:{ all -> 0x022a }
            r14.close()     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
            goto L_0x0092
        L_0x008d:
            r14.close()     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
            r16 = r25
        L_0x0092:
            int r0 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "rowid<?"
            r14 = 1
            java.lang.String[] r6 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            r16 = 0
            r6[r16] = r14     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            r19 = r0
            r20 = r6
            goto L_0x00c1
        L_0x00a8:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x0268
        L_0x00af:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x0250
        L_0x00b6:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x0259
        L_0x00bd:
            r19 = 0
            r20 = 0
        L_0x00c1:
            java.lang.String r0 = "type"
            java.lang.String r6 = "entry"
            java.lang.String[] r18 = new java.lang.String[]{r10, r0, r6}     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            java.lang.String r17 = "messages"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r6 = 100
            java.lang.String r24 = java.lang.Integer.toString(r6)     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            r16 = r5
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
        L_0x00dd:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteFullException -> 0x021e, SQLiteDatabaseLockedException -> 0x0218, SQLiteException -> 0x0212 }
            if (r0 == 0) goto L_0x01d1
            r14 = 0
            long r25 = r6.getLong(r14)     // Catch:{ SQLiteFullException -> 0x021e, SQLiteDatabaseLockedException -> 0x0218, SQLiteException -> 0x0212 }
            r14 = 1
            int r0 = r6.getInt(r14)     // Catch:{ SQLiteFullException -> 0x021e, SQLiteDatabaseLockedException -> 0x0218, SQLiteException -> 0x0212 }
            r14 = 2
            r16 = r10
            byte[] r10 = r6.getBlob(r14)     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0 }
            if (r0 != 0) goto L_0x0131
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0 }
            int r0 = r10.length     // Catch:{ b -> 0x0119, all -> 0x0115 }
            r17 = r7
            r7 = 0
            r14.unmarshall(r10, r7, r0)     // Catch:{ b -> 0x011b }
            r14.setDataPosition(r7)     // Catch:{ b -> 0x011b }
            android.os.Parcelable$Creator<b.l.a.c.h.b.s> r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3309s.CREATOR     // Catch:{ b -> 0x011b }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ b -> 0x011b }
            b.l.a.c.h.b.s r0 = (p005b.p096l.p097a.p113c.p145h.p147b.C3309s) r0     // Catch:{ b -> 0x011b }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            if (r0 == 0) goto L_0x01ba
            goto L_0x0197
        L_0x0113:
            r0 = move-exception
            goto L_0x012d
        L_0x0115:
            r0 = move-exception
            r17 = r7
            goto L_0x012d
        L_0x0119:
            r17 = r7
        L_0x011b:
            b.l.a.c.h.b.p4 r0 = r9.f5638a     // Catch:{ all -> 0x0113 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0113 }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = "Failed to load event from local database"
            r0.mo14414a(r7)     // Catch:{ all -> 0x0113 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x01ba
        L_0x012d:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x0131:
            r17 = r7
            r7 = 1
            if (r0 != r7) goto L_0x0168
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            int r0 = r10.length     // Catch:{ b -> 0x0150 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ b -> 0x0150 }
            r7.setDataPosition(r14)     // Catch:{ b -> 0x0150 }
            android.os.Parcelable$Creator<b.l.a.c.h.b.m9> r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3253m9.CREATOR     // Catch:{ b -> 0x0150 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ b -> 0x0150 }
            b.l.a.c.h.b.m9 r0 = (p005b.p096l.p097a.p113c.p145h.p147b.C3253m9) r0     // Catch:{ b -> 0x0150 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x0161
        L_0x014e:
            r0 = move-exception
            goto L_0x0164
        L_0x0150:
            b.l.a.c.h.b.p4 r0 = r9.f5638a     // Catch:{ all -> 0x014e }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x014e }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ all -> 0x014e }
            java.lang.String r10 = "Failed to load user property from local database"
            r0.mo14414a(r10)     // Catch:{ all -> 0x014e }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            r0 = 0
        L_0x0161:
            if (r0 == 0) goto L_0x01ba
            goto L_0x0197
        L_0x0164:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x0168:
            if (r0 != r14) goto L_0x019f
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            int r0 = r10.length     // Catch:{ b -> 0x0184 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ b -> 0x0184 }
            r7.setDataPosition(r14)     // Catch:{ b -> 0x0184 }
            android.os.Parcelable$Creator<b.l.a.c.h.b.b> r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3118b.CREATOR     // Catch:{ b -> 0x0184 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ b -> 0x0184 }
            b.l.a.c.h.b.b r0 = (p005b.p096l.p097a.p113c.p145h.p147b.C3118b) r0     // Catch:{ b -> 0x0184 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x0195
        L_0x0182:
            r0 = move-exception
            goto L_0x019b
        L_0x0184:
            b.l.a.c.h.b.p4 r0 = r9.f5638a     // Catch:{ all -> 0x0182 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0182 }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "Failed to load conditional user property from local database"
            r0.mo14414a(r10)     // Catch:{ all -> 0x0182 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            r0 = 0
        L_0x0195:
            if (r0 == 0) goto L_0x01ba
        L_0x0197:
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x01ba
        L_0x019b:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x019f:
            r7 = 3
            if (r0 != r7) goto L_0x01ad
            b.l.a.c.h.b.p4 r0 = r9.f5638a     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            java.lang.String r7 = "Skipping app launch break"
            goto L_0x01b7
        L_0x01ad:
            b.l.a.c.h.b.p4 r0 = r9.f5638a     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            java.lang.String r7 = "Unknown record type in local database"
        L_0x01b7:
            r0.mo14414a(r7)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x01ba:
            r10 = r16
            r7 = r17
            goto L_0x00dd
        L_0x01c0:
            r0 = move-exception
            r17 = r7
            goto L_0x01cb
        L_0x01c4:
            r17 = r7
            goto L_0x021c
        L_0x01c7:
            r0 = move-exception
            r17 = r7
            goto L_0x01ce
        L_0x01cb:
            r10 = 0
            goto L_0x0269
        L_0x01ce:
            r10 = 0
            goto L_0x025a
        L_0x01d1:
            r17 = r7
            r16 = r10
            r7 = 1
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            java.lang.String r7 = java.lang.Long.toString(r25)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            r10 = 0
            r0[r10] = r7     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            java.lang.String r7 = "messages"
            java.lang.String r14 = "rowid <= ?"
            int r0 = r5.delete(r7, r14, r0)     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            int r7 = r13.size()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            if (r0 >= r7) goto L_0x01fa
            b.l.a.c.h.b.p4 r0 = r9.f5638a     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            java.lang.String r7 = "Fewer entries removed from local database than expected"
            r0.mo14414a(r7)     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
        L_0x01fa:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            r6.close()
            r5.close()
            goto L_0x02ee
        L_0x0208:
            r0 = move-exception
            goto L_0x0269
        L_0x020b:
            r0 = move-exception
            goto L_0x025a
        L_0x020e:
            r0 = move-exception
            goto L_0x01cb
        L_0x0210:
            r0 = move-exception
            goto L_0x01ce
        L_0x0212:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01cb
        L_0x0218:
            r17 = r7
            r16 = r10
        L_0x021c:
            r10 = 0
            goto L_0x0251
        L_0x021e:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01ce
        L_0x0224:
            r0 = move-exception
            goto L_0x00a8
        L_0x0227:
            r0 = move-exception
            goto L_0x00b6
        L_0x022a:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            goto L_0x0238
        L_0x0231:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            r14 = 0
        L_0x0238:
            if (r14 == 0) goto L_0x023d
            r14.close()     // Catch:{ SQLiteFullException -> 0x0240, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023e, all -> 0x0242 }
        L_0x023d:
            throw r0     // Catch:{ SQLiteFullException -> 0x0240, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023e, all -> 0x0242 }
        L_0x023e:
            r0 = move-exception
            goto L_0x0268
        L_0x0240:
            r0 = move-exception
            goto L_0x0259
        L_0x0242:
            r0 = move-exception
            goto L_0x025e
        L_0x0244:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            goto L_0x0268
        L_0x024b:
            r17 = r7
            r16 = r10
            r10 = r6
        L_0x0250:
            r6 = 0
        L_0x0251:
            r7 = r11
            goto L_0x0293
        L_0x0253:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
        L_0x0259:
            r6 = 0
        L_0x025a:
            r7 = r11
            goto L_0x02a9
        L_0x025c:
            r0 = move-exception
            r5 = 0
        L_0x025e:
            r12 = 0
            goto L_0x02d0
        L_0x0261:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            r5 = 0
        L_0x0268:
            r6 = 0
        L_0x0269:
            if (r5 == 0) goto L_0x0274
            boolean r7 = r5.inTransaction()     // Catch:{ all -> 0x02ce }
            if (r7 == 0) goto L_0x0274
            r5.endTransaction()     // Catch:{ all -> 0x02ce }
        L_0x0274:
            b.l.a.c.h.b.p4 r7 = r9.f5638a     // Catch:{ all -> 0x02ce }
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()     // Catch:{ all -> 0x02ce }
            b.l.a.c.h.b.m3 r7 = r7.f5799f     // Catch:{ all -> 0x02ce }
            r7.mo14415b(r11, r0)     // Catch:{ all -> 0x02ce }
            r7 = 1
            r9.f5598d = r7     // Catch:{ all -> 0x02ce }
            if (r6 == 0) goto L_0x0287
            r6.close()
        L_0x0287:
            r7 = r11
            if (r5 == 0) goto L_0x02c1
            goto L_0x02be
        L_0x028b:
            r17 = r7
            r16 = r10
            r10 = r6
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x0293:
            long r10 = (long) r12
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x02ce }
            int r12 = r12 + 20
            if (r6 == 0) goto L_0x029e
            r6.close()
        L_0x029e:
            if (r5 == 0) goto L_0x02c1
            goto L_0x02be
        L_0x02a1:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x02a9:
            b.l.a.c.h.b.p4 r10 = r9.f5638a     // Catch:{ all -> 0x02ce }
            b.l.a.c.h.b.o3 r10 = r10.mo14329d()     // Catch:{ all -> 0x02ce }
            b.l.a.c.h.b.m3 r10 = r10.f5799f     // Catch:{ all -> 0x02ce }
            r10.mo14415b(r7, r0)     // Catch:{ all -> 0x02ce }
            r10 = 1
            r9.f5598d = r10     // Catch:{ all -> 0x02ce }
            if (r6 == 0) goto L_0x02bc
            r6.close()
        L_0x02bc:
            if (r5 == 0) goto L_0x02c1
        L_0x02be:
            r5.close()
        L_0x02c1:
            int r15 = r15 + 1
            r11 = r7
            r10 = r16
            r7 = r17
            r5 = 100
            r6 = 0
            r14 = 5
            goto L_0x004f
        L_0x02ce:
            r0 = move-exception
            r12 = r6
        L_0x02d0:
            if (r12 == 0) goto L_0x02d5
            r12.close()
        L_0x02d5:
            if (r5 == 0) goto L_0x02da
            r5.close()
        L_0x02da:
            throw r0
        L_0x02db:
            r17 = r7
            b.l.a.c.h.b.p4 r0 = r9.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5802i
            java.lang.String r5 = "Failed to read events from database in reasonable time"
            r0.mo14414a(r5)
        L_0x02ea:
            r12 = 0
            goto L_0x02ef
        L_0x02ec:
            r17 = r7
        L_0x02ee:
            r12 = r13
        L_0x02ef:
            if (r12 == 0) goto L_0x02fa
            r8.addAll(r12)
            int r0 = r12.size()
            r5 = r0
            goto L_0x02fb
        L_0x02fa:
            r5 = 0
        L_0x02fb:
            r6 = 100
            if (r3 == 0) goto L_0x0304
            if (r5 >= r6) goto L_0x0304
            r8.add(r3)
        L_0x0304:
            int r7 = r8.size()
            r9 = 0
        L_0x0309:
            if (r9 >= r7) goto L_0x0366
            java.lang.Object r0 = r8.get(r9)
            b.l.a.c.b.m.v.a r0 = (p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a) r0
            boolean r10 = r0 instanceof p005b.p096l.p097a.p113c.p145h.p147b.C3309s
            if (r10 == 0) goto L_0x0327
            b.l.a.c.h.b.s r0 = (p005b.p096l.p097a.p113c.p145h.p147b.C3309s) r0     // Catch:{ RemoteException -> 0x031b }
            r2.mo14167Y0(r0, r4)     // Catch:{ RemoteException -> 0x031b }
            goto L_0x0363
        L_0x031b:
            r0 = move-exception
            b.l.a.c.h.b.p4 r10 = r1.f5638a
            b.l.a.c.h.b.o3 r10 = r10.mo14329d()
            b.l.a.c.h.b.m3 r10 = r10.f5799f
            java.lang.String r11 = "Failed to send event to the service"
            goto L_0x0352
        L_0x0327:
            boolean r10 = r0 instanceof p005b.p096l.p097a.p113c.p145h.p147b.C3253m9
            if (r10 == 0) goto L_0x033d
            b.l.a.c.h.b.m9 r0 = (p005b.p096l.p097a.p113c.p145h.p147b.C3253m9) r0     // Catch:{ RemoteException -> 0x0331 }
            r2.mo14166W0(r0, r4)     // Catch:{ RemoteException -> 0x0331 }
            goto L_0x0363
        L_0x0331:
            r0 = move-exception
            b.l.a.c.h.b.p4 r10 = r1.f5638a
            b.l.a.c.h.b.o3 r10 = r10.mo14329d()
            b.l.a.c.h.b.m3 r10 = r10.f5799f
            java.lang.String r11 = "Failed to send user property to the service"
            goto L_0x0352
        L_0x033d:
            boolean r10 = r0 instanceof p005b.p096l.p097a.p113c.p145h.p147b.C3118b
            if (r10 == 0) goto L_0x0356
            b.l.a.c.h.b.b r0 = (p005b.p096l.p097a.p113c.p145h.p147b.C3118b) r0     // Catch:{ RemoteException -> 0x0347 }
            r2.mo14158B0(r0, r4)     // Catch:{ RemoteException -> 0x0347 }
            goto L_0x0363
        L_0x0347:
            r0 = move-exception
            b.l.a.c.h.b.p4 r10 = r1.f5638a
            b.l.a.c.h.b.o3 r10 = r10.mo14329d()
            b.l.a.c.h.b.m3 r10 = r10.f5799f
            java.lang.String r11 = "Failed to send conditional user property to the service"
        L_0x0352:
            r10.mo14415b(r11, r0)
            goto L_0x0363
        L_0x0356:
            b.l.a.c.h.b.p4 r0 = r1.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            r0.mo14414a(r10)
        L_0x0363:
            int r9 = r9 + 1
            goto L_0x0309
        L_0x0366:
            int r7 = r17 + 1
            r0 = r5
            r5 = r6
            r6 = 0
            goto L_0x001a
        L_0x036d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3175f8.mo14228x(b.l.a.c.h.b.f3, b.l.a.c.b.m.v.a, b.l.a.c.h.b.v9):void");
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo14229y(C3118b bVar) {
        boolean z;
        mo14126h();
        mo14065i();
        C3281p4 p4Var = this.f5638a;
        C3165ea eaVar = p4Var.f5847f;
        C3203i3 v = p4Var.mo14469v();
        byte[] L = v.f5638a.mo14467t().mo14521L(bVar);
        if (L.length > 131072) {
            v.f5638a.mo14329d().f5800g.mo14414a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = v.mo14267o(2, L);
        }
        C3118b bVar2 = new C3118b(bVar);
        mo14224t(new C3339u7(this, mo14226v(true), z, bVar2, bVar));
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo14230z(AtomicReference<String> atomicReference) {
        mo14126h();
        mo14065i();
        mo14224t(new C3218j7(this, atomicReference, mo14226v(false)));
    }
}
