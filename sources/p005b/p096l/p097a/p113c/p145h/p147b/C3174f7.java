package p005b.p096l.p097a.p113c.p145h.p147b;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.segment.analytics.AnalyticsContext;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.f7 */
public final class C3174f7 extends C3111a4 {

    /* renamed from: c */
    public volatile C3371x6 f5509c;

    /* renamed from: d */
    public C3371x6 f5510d;

    /* renamed from: e */
    public C3371x6 f5511e;

    /* renamed from: f */
    public final Map<Activity, C3371x6> f5512f = new ConcurrentHashMap();
    @GuardedBy("activityLock")

    /* renamed from: g */
    public Activity f5513g;
    @GuardedBy("activityLock")

    /* renamed from: h */
    public volatile boolean f5514h;

    /* renamed from: i */
    public volatile C3371x6 f5515i;

    /* renamed from: j */
    public C3371x6 f5516j;
    @GuardedBy("activityLock")

    /* renamed from: k */
    public boolean f5517k;

    /* renamed from: l */
    public final Object f5518l = new Object();
    @GuardedBy("this")

    /* renamed from: m */
    public String f5519m;

    public C3174f7(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: r */
    public static void m5964r(C3371x6 x6Var, Bundle bundle, boolean z) {
        if (x6Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = x6Var.f6092a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = x6Var.f6093b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", x6Var.f6094c);
                return;
            }
            z = false;
        }
        if (x6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: k */
    public final boolean mo14067k() {
        return false;
    }

    @MainThread
    /* renamed from: l */
    public final void mo14209l(Activity activity, C3371x6 x6Var, boolean z) {
        C3371x6 x6Var2;
        C3371x6 x6Var3 = x6Var;
        C3371x6 x6Var4 = this.f5509c == null ? this.f5510d : this.f5509c;
        if (x6Var3.f6093b == null) {
            x6Var2 = new C3371x6(x6Var3.f6092a, activity != null ? mo14214q(activity.getClass(), "Activity") : null, x6Var3.f6094c, x6Var3.f6096e, x6Var3.f6097f);
        } else {
            x6Var2 = x6Var3;
        }
        this.f5510d = this.f5509c;
        this.f5509c = x6Var2;
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        this.f5638a.mo14331f().mo14420q(new C3114a7(this, x6Var2, x6Var4, SystemClock.elapsedRealtime(), z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6  */
    @androidx.annotation.WorkerThread
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14210m(p005b.p096l.p097a.p113c.p145h.p147b.C3371x6 r19, p005b.p096l.p097a.p113c.p145h.p147b.C3371x6 r20, long r21, boolean r23, android.os.Bundle r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r24
            r18.mo14126h()
            r6 = 1
            if (r23 == 0) goto L_0x0016
            b.l.a.c.h.b.x6 r7 = r0.f5511e
            if (r7 == 0) goto L_0x0016
            r7 = r6
            goto L_0x0017
        L_0x0016:
            r7 = 0
        L_0x0017:
            if (r7 == 0) goto L_0x001e
            b.l.a.c.h.b.x6 r8 = r0.f5511e
            r0.mo14211n(r8, r6, r3)
        L_0x001e:
            r8 = 0
            if (r2 == 0) goto L_0x003d
            long r9 = r2.f6094c
            long r11 = r1.f6094c
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x003d
            java.lang.String r9 = r2.f6093b
            java.lang.String r10 = r1.f6093b
            boolean r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6339G(r9, r10)
            if (r9 == 0) goto L_0x003d
            java.lang.String r9 = r2.f6092a
            java.lang.String r10 = r1.f6092a
            boolean r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6339G(r9, r10)
            if (r9 != 0) goto L_0x0108
        L_0x003d:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            b.l.a.c.h.b.p4 r10 = r0.f5638a
            b.l.a.c.h.b.f r10 = r10.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r11 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5407s0
            boolean r10 = r10.mo14197r(r8, r11)
            if (r10 == 0) goto L_0x0059
            android.os.Bundle r9 = new android.os.Bundle
            if (r5 == 0) goto L_0x0056
            r9.<init>(r5)
            goto L_0x0059
        L_0x0056:
            r9.<init>()
        L_0x0059:
            m5964r(r1, r9, r6)
            if (r2 == 0) goto L_0x0077
            java.lang.String r5 = r2.f6092a
            if (r5 == 0) goto L_0x0067
            java.lang.String r10 = "_pn"
            r9.putString(r10, r5)
        L_0x0067:
            java.lang.String r5 = r2.f6093b
            if (r5 == 0) goto L_0x0070
            java.lang.String r10 = "_pc"
            r9.putString(r10, r5)
        L_0x0070:
            long r12 = r2.f6094c
            java.lang.String r2 = "_pi"
            r9.putLong(r2, r12)
        L_0x0077:
            r12 = 0
            if (r7 == 0) goto L_0x0096
            b.l.a.c.h.b.p4 r2 = r0.f5638a
            b.l.a.c.h.b.u8 r2 = r2.mo14465r()
            b.l.a.c.h.b.s8 r2 = r2.f6003e
            long r14 = r2.f5961b
            long r14 = r3 - r14
            r2.f5961b = r3
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            b.l.a.c.h.b.p4 r2 = r0.f5638a
            b.l.a.c.h.b.q9 r2 = r2.mo14467t()
            r2.mo14524O(r9, r14)
        L_0x0096:
            b.l.a.c.h.b.p4 r2 = r0.f5638a
            b.l.a.c.h.b.f r2 = r2.f5848g
            boolean r2 = r2.mo14197r(r8, r11)
            if (r2 == 0) goto L_0x00b9
            b.l.a.c.h.b.p4 r2 = r0.f5638a
            b.l.a.c.h.b.f r2 = r2.f5848g
            boolean r2 = r2.mo14202w()
            if (r2 != 0) goto L_0x00b1
            r2 = 1
            java.lang.String r4 = "_mst"
            r9.putLong(r4, r2)
        L_0x00b1:
            boolean r2 = r1.f6096e
            if (r6 == r2) goto L_0x00b6
            goto L_0x00b9
        L_0x00b6:
            java.lang.String r2 = "app"
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r2 = "auto"
        L_0x00bb:
            b.l.a.c.h.b.p4 r3 = r0.f5638a
            b.l.a.c.h.b.f r3 = r3.f5848g
            boolean r3 = r3.mo14197r(r8, r11)
            if (r3 == 0) goto L_0x00e6
            b.l.a.c.h.b.p4 r3 = r0.f5638a
            b.l.a.c.b.p.b r3 = r3.f5855n
            b.l.a.c.b.p.c r3 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r3
            java.util.Objects.requireNonNull(r3)
            long r3 = java.lang.System.currentTimeMillis()
            boolean r5 = r1.f6096e
            if (r5 == 0) goto L_0x00dd
            long r5 = r1.f6097f
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x00dd
            r3 = r5
        L_0x00dd:
            b.l.a.c.h.b.p4 r5 = r0.f5638a
            b.l.a.c.h.b.q6 r5 = r5.mo14466s()
            r15 = r3
            r12 = r5
            goto L_0x0100
        L_0x00e6:
            b.l.a.c.h.b.p4 r3 = r0.f5638a
            b.l.a.c.h.b.q6 r3 = r3.mo14466s()
            b.l.a.c.h.b.p4 r4 = r3.f5638a
            r3.mo14126h()
            b.l.a.c.h.b.p4 r4 = r3.f5638a
            b.l.a.c.b.p.b r4 = r4.f5855n
            b.l.a.c.b.p.c r4 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r12 = r3
            r15 = r4
        L_0x0100:
            java.lang.String r14 = "_vs"
            r13 = r2
            r17 = r9
            r12.mo14494B(r13, r14, r15, r17)
        L_0x0108:
            r0.f5511e = r1
            b.l.a.c.h.b.p4 r2 = r0.f5638a
            b.l.a.c.h.b.f r2 = r2.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5407s0
            boolean r2 = r2.mo14197r(r8, r3)
            if (r2 == 0) goto L_0x011c
            boolean r2 = r1.f6096e
            if (r2 == 0) goto L_0x011c
            r0.f5516j = r1
        L_0x011c:
            b.l.a.c.h.b.p4 r2 = r0.f5638a
            b.l.a.c.h.b.f8 r2 = r2.mo14473z()
            r2.mo14126h()
            r2.mo14065i()
            b.l.a.c.h.b.m7 r3 = new b.l.a.c.h.b.m7
            r3.<init>(r2, r1)
            r2.mo14224t(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3174f7.mo14210m(b.l.a.c.h.b.x6, b.l.a.c.h.b.x6, long, boolean, android.os.Bundle):void");
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo14211n(C3371x6 x6Var, boolean z, long j) {
        C3133c2 g = this.f5638a.mo14458g();
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        g.mo14137k(SystemClock.elapsedRealtime());
        if (this.f5638a.mo14465r().f6003e.mo14587a(x6Var != null && x6Var.f6095d, z, j) && x6Var != null) {
            x6Var.f6095d = false;
        }
    }

    @MainThread
    /* renamed from: o */
    public final C3371x6 mo14212o(@NonNull Activity activity) {
        Objects.requireNonNull(activity, "null reference");
        C3371x6 x6Var = this.f5512f.get(activity);
        if (x6Var == null) {
            C3371x6 x6Var2 = new C3371x6((String) null, mo14214q(activity.getClass(), "Activity"), this.f5638a.mo14467t().mo14534d0());
            this.f5512f.put(activity, x6Var2);
            x6Var = x6Var2;
        }
        return (this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5407s0) && this.f5515i != null) ? this.f5515i : x6Var;
    }

    @WorkerThread
    /* renamed from: p */
    public final C3371x6 mo14213p(boolean z) {
        mo14065i();
        mo14126h();
        if (!this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5407s0) || !z) {
            return this.f5511e;
        }
        C3371x6 x6Var = this.f5511e;
        return x6Var != null ? x6Var : this.f5516j;
    }

    /* renamed from: q */
    public final String mo14214q(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        C3166f fVar = this.f5638a.f5848g;
        return length2 > 100 ? str2.substring(0, 100) : str2;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo14215s(String str, C3371x6 x6Var) {
        mo14126h();
        synchronized (this) {
            String str2 = this.f5519m;
            if (str2 == null || str2.equals(str)) {
                this.f5519m = str;
            }
        }
    }

    @MainThread
    /* renamed from: t */
    public final void mo14216t(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f5638a.f5848g.mo14202w() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f5512f.put(activity, new C3371x6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(AnalyticsContext.Device.DEVICE_ID_KEY)));
        }
    }
}
