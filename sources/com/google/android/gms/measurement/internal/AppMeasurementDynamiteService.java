package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p129c.C1984d;
import p005b.p096l.p097a.p113c.p131e.p140i.C2733bc;
import p005b.p096l.p097a.p113c.p131e.p140i.C2758d9;
import p005b.p096l.p097a.p113c.p131e.p140i.C2761dc;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;
import p005b.p096l.p097a.p113c.p131e.p140i.C2983ub;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;
import p005b.p096l.p097a.p113c.p145h.p147b.C3116a9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3134c3;
import p005b.p096l.p097a.p113c.p145h.p147b.C3137c6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3166f;
import p005b.p096l.p097a.p113c.p145h.p147b.C3184g6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3195h6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3206i6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3217j6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3228k6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3281p4;
import p005b.p096l.p097a.p113c.p145h.p147b.C3282p5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3283p6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3287q;
import p005b.p096l.p097a.p113c.p145h.p147b.C3294q6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3297q9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3304r5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3308r9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3309s;
import p005b.p096l.p097a.p113c.p145h.p147b.C3319s9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3326t5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3330t9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3341u9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3348v5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3371x6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3381y5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3392z5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3393z6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3394z7;

@DynamiteApi
public class AppMeasurementDynamiteService extends C2983ub {

    /* renamed from: a */
    public C3281p4 f11364a = null;
    @GuardedBy("listenerMap")

    /* renamed from: b */
    public final Map<Integer, C3282p5> f11365b = new ArrayMap();

    public void beginAdUnitExposure(@RecentlyNonNull String str, long j) {
        mo18932k();
        this.f11364a.mo14458g().mo14135i(str, j);
    }

    public void clearConditionalUserProperty(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        mo18932k();
        this.f11364a.mo14466s().mo14506r(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        s.mo14065i();
        s.f5638a.mo14331f().mo14420q(new C3228k6(s, (Boolean) null));
    }

    public void endAdUnitExposure(@RecentlyNonNull String str, long j) {
        mo18932k();
        this.f11364a.mo14458g().mo14136j(str, j);
    }

    public void generateEventId(C3035yb ybVar) {
        mo18932k();
        long d0 = this.f11364a.mo14467t().mo14534d0();
        mo18932k();
        this.f11364a.mo14467t().mo14526Q(ybVar, d0);
    }

    public void getAppInstanceId(C3035yb ybVar) {
        mo18932k();
        this.f11364a.mo14331f().mo14420q(new C3381y5(this, ybVar));
    }

    public void getCachedAppInstanceId(C3035yb ybVar) {
        mo18932k();
        mo18932k();
        this.f11364a.mo14467t().mo14525P(ybVar, this.f11364a.mo14466s().f5897g.get());
    }

    public void getConditionalUserProperties(String str, String str2, C3035yb ybVar) {
        mo18932k();
        this.f11364a.mo14331f().mo14420q(new C3308r9(this, ybVar, str, str2));
    }

    public void getCurrentScreenClass(C3035yb ybVar) {
        mo18932k();
        C3371x6 x6Var = this.f11364a.mo14466s().f5638a.mo14472y().f5509c;
        String str = x6Var != null ? x6Var.f6093b : null;
        mo18932k();
        this.f11364a.mo14467t().mo14525P(ybVar, str);
    }

    public void getCurrentScreenName(C3035yb ybVar) {
        mo18932k();
        C3371x6 x6Var = this.f11364a.mo14466s().f5638a.mo14472y().f5509c;
        String str = x6Var != null ? x6Var.f6092a : null;
        mo18932k();
        this.f11364a.mo14467t().mo14525P(ybVar, str);
    }

    public void getGmpAppId(C3035yb ybVar) {
        mo18932k();
        String s = this.f11364a.mo14466s().mo14507s();
        mo18932k();
        this.f11364a.mo14467t().mo14525P(ybVar, s);
    }

    public void getMaxUserProperties(String str, C3035yb ybVar) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        Objects.requireNonNull(s);
        C0823f.m376j(str);
        C3166f fVar = s.f5638a.f5848g;
        mo18932k();
        this.f11364a.mo14467t().mo14527R(ybVar, 25);
    }

    public void getTestFlag(C3035yb ybVar, int i) {
        mo18932k();
        if (i == 0) {
            C3297q9 t = this.f11364a.mo14467t();
            C3294q6 s = this.f11364a.mo14466s();
            Objects.requireNonNull(s);
            AtomicReference atomicReference = new AtomicReference();
            t.mo14525P(ybVar, (String) s.f5638a.mo14331f().mo14421r(atomicReference, 15000, "String test flag value", new C3184g6(s, atomicReference)));
        } else if (i == 1) {
            C3297q9 t2 = this.f11364a.mo14467t();
            C3294q6 s2 = this.f11364a.mo14466s();
            Objects.requireNonNull(s2);
            AtomicReference atomicReference2 = new AtomicReference();
            t2.mo14526Q(ybVar, ((Long) s2.f5638a.mo14331f().mo14421r(atomicReference2, 15000, "long test flag value", new C3195h6(s2, atomicReference2))).longValue());
        } else if (i == 2) {
            C3297q9 t3 = this.f11364a.mo14467t();
            C3294q6 s3 = this.f11364a.mo14466s();
            Objects.requireNonNull(s3);
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) s3.f5638a.mo14331f().mo14421r(atomicReference3, 15000, "double test flag value", new C3217j6(s3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                ybVar.mo13602Y(bundle);
            } catch (RemoteException e) {
                t3.f5638a.mo14329d().f5802i.mo14415b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            C3297q9 t4 = this.f11364a.mo14467t();
            C3294q6 s4 = this.f11364a.mo14466s();
            Objects.requireNonNull(s4);
            AtomicReference atomicReference4 = new AtomicReference();
            t4.mo14527R(ybVar, ((Integer) s4.f5638a.mo14331f().mo14421r(atomicReference4, 15000, "int test flag value", new C3206i6(s4, atomicReference4))).intValue());
        } else if (i == 4) {
            C3297q9 t5 = this.f11364a.mo14467t();
            C3294q6 s5 = this.f11364a.mo14466s();
            Objects.requireNonNull(s5);
            AtomicReference atomicReference5 = new AtomicReference();
            t5.mo14529T(ybVar, ((Boolean) s5.f5638a.mo14331f().mo14421r(atomicReference5, 15000, "boolean test flag value", new C3137c6(s5, atomicReference5))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C3035yb ybVar) {
        mo18932k();
        this.f11364a.mo14331f().mo14420q(new C3394z7(this, ybVar, str, str2, z));
    }

    public void initForTests(@RecentlyNonNull Map map) {
        mo18932k();
    }

    public void initialize(C1980b bVar, C2775ec ecVar, long j) {
        C3281p4 p4Var = this.f11364a;
        if (p4Var == null) {
            Context context = (Context) C1984d.m2900n(bVar);
            Objects.requireNonNull(context, "null reference");
            this.f11364a = C3281p4.m6272h(context, ecVar, Long.valueOf(j));
            return;
        }
        p4Var.mo14329d().f5802i.mo14414a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(C3035yb ybVar) {
        mo18932k();
        this.f11364a.mo14331f().mo14420q(new C3319s9(this, ybVar));
    }

    @EnsuresNonNull({"scion"})
    /* renamed from: k */
    public final void mo18932k() {
        if (this.f11364a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void logEvent(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle, boolean z, boolean z2, long j) {
        mo18932k();
        this.f11364a.mo14466s().mo14496D(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C3035yb ybVar, long j) {
        Bundle bundle2;
        mo18932k();
        C0823f.m376j(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f11364a.mo14331f().mo14420q(new C3393z6(this, ybVar, new C3309s(str2, new C3287q(bundle), "app", j), str));
    }

    public void logHealthData(int i, @RecentlyNonNull String str, @RecentlyNonNull C1980b bVar, @RecentlyNonNull C1980b bVar2, @RecentlyNonNull C1980b bVar3) {
        mo18932k();
        Object obj = null;
        Object n = bVar == null ? null : C1984d.m2900n(bVar);
        Object n2 = bVar2 == null ? null : C1984d.m2900n(bVar2);
        if (bVar3 != null) {
            obj = C1984d.m2900n(bVar3);
        }
        this.f11364a.mo14329d().mo14445u(i, true, false, str, n, n2, obj);
    }

    public void onActivityCreated(@RecentlyNonNull C1980b bVar, @RecentlyNonNull Bundle bundle, long j) {
        mo18932k();
        C3283p6 p6Var = this.f11364a.mo14466s().f5893c;
        if (p6Var != null) {
            this.f11364a.mo14466s().mo14510w();
            p6Var.onActivityCreated((Activity) C1984d.m2900n(bVar), bundle);
        }
    }

    public void onActivityDestroyed(@RecentlyNonNull C1980b bVar, long j) {
        mo18932k();
        C3283p6 p6Var = this.f11364a.mo14466s().f5893c;
        if (p6Var != null) {
            this.f11364a.mo14466s().mo14510w();
            p6Var.onActivityDestroyed((Activity) C1984d.m2900n(bVar));
        }
    }

    public void onActivityPaused(@RecentlyNonNull C1980b bVar, long j) {
        mo18932k();
        C3283p6 p6Var = this.f11364a.mo14466s().f5893c;
        if (p6Var != null) {
            this.f11364a.mo14466s().mo14510w();
            p6Var.onActivityPaused((Activity) C1984d.m2900n(bVar));
        }
    }

    public void onActivityResumed(@RecentlyNonNull C1980b bVar, long j) {
        mo18932k();
        C3283p6 p6Var = this.f11364a.mo14466s().f5893c;
        if (p6Var != null) {
            this.f11364a.mo14466s().mo14510w();
            p6Var.onActivityResumed((Activity) C1984d.m2900n(bVar));
        }
    }

    public void onActivitySaveInstanceState(C1980b bVar, C3035yb ybVar, long j) {
        mo18932k();
        C3283p6 p6Var = this.f11364a.mo14466s().f5893c;
        Bundle bundle = new Bundle();
        if (p6Var != null) {
            this.f11364a.mo14466s().mo14510w();
            p6Var.onActivitySaveInstanceState((Activity) C1984d.m2900n(bVar), bundle);
        }
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f11364a.mo14329d().f5802i.mo14415b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@RecentlyNonNull C1980b bVar, long j) {
        mo18932k();
        if (this.f11364a.mo14466s().f5893c != null) {
            this.f11364a.mo14466s().mo14510w();
            Activity activity = (Activity) C1984d.m2900n(bVar);
        }
    }

    public void onActivityStopped(@RecentlyNonNull C1980b bVar, long j) {
        mo18932k();
        if (this.f11364a.mo14466s().f5893c != null) {
            this.f11364a.mo14466s().mo14510w();
            Activity activity = (Activity) C1984d.m2900n(bVar);
        }
    }

    public void performAction(Bundle bundle, C3035yb ybVar, long j) {
        mo18932k();
        ybVar.mo13602Y((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C2733bc bcVar) {
        Object obj;
        mo18932k();
        synchronized (this.f11365b) {
            obj = this.f11365b.get(Integer.valueOf(bcVar.mo13255e()));
            if (obj == null) {
                obj = new C3341u9(this, bcVar);
                this.f11365b.put(Integer.valueOf(bcVar.mo13255e()), obj);
            }
        }
        C3294q6 s = this.f11364a.mo14466s();
        s.mo14065i();
        if (!s.f5895e.add(obj)) {
            s.f5638a.mo14329d().f5802i.mo14414a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        s.f5897g.set((Object) null);
        s.f5638a.mo14331f().mo14420q(new C3392z5(s, j));
    }

    public void setConditionalUserProperty(@RecentlyNonNull Bundle bundle, long j) {
        mo18932k();
        if (bundle == null) {
            this.f11364a.mo14329d().f5799f.mo14414a("Conditional user property must not be null");
        } else {
            this.f11364a.mo14466s().mo14505q(bundle, j);
        }
    }

    public void setConsent(@RecentlyNonNull Bundle bundle, long j) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        C2980u8.m5384b();
        if (s.f5638a.f5848g.mo14197r((String) null, C3134c3.f5411u0)) {
            C2758d9.f4686h.mo13235a().mo13300a();
            if (!s.f5638a.f5848g.mo14197r((String) null, C3134c3.f5347D0) || TextUtils.isEmpty(s.f5638a.mo14457b().mo14242n())) {
                s.mo14511x(bundle, 0, j);
            } else {
                s.f5638a.mo14329d().f5804k.mo14414a("Using developer consent only; google app id found");
            }
        }
    }

    public void setConsentThirdParty(@RecentlyNonNull Bundle bundle, long j) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        C2980u8.m5384b();
        if (s.f5638a.f5848g.mo14197r((String) null, C3134c3.f5413v0)) {
            s.mo14511x(bundle, -20, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r0 <= 100) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r0 <= 100) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(@androidx.annotation.RecentlyNonNull p005b.p096l.p097a.p113c.p129c.C1980b r3, @androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.mo18932k()
            b.l.a.c.h.b.p4 r6 = r2.f11364a
            b.l.a.c.h.b.f7 r6 = r6.mo14472y()
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p129c.C1984d.m2900n(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            b.l.a.c.h.b.p4 r7 = r6.f5638a
            b.l.a.c.h.b.f r7 = r7.f5848g
            boolean r7 = r7.mo14202w()
            if (r7 != 0) goto L_0x0028
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5804k
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
        L_0x0023:
            r3.mo14414a(r4)
            goto L_0x00ee
        L_0x0028:
            b.l.a.c.h.b.x6 r7 = r6.f5509c
            if (r7 != 0) goto L_0x0037
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5804k
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            goto L_0x0023
        L_0x0037:
            java.util.Map<android.app.Activity, b.l.a.c.h.b.x6> r0 = r6.f5512f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x004a
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5804k
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            goto L_0x0023
        L_0x004a:
            if (r5 != 0) goto L_0x0056
            java.lang.Class r5 = r3.getClass()
            java.lang.String r0 = "Activity"
            java.lang.String r5 = r6.mo14214q(r5, r0)
        L_0x0056:
            java.lang.String r0 = r7.f6093b
            boolean r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6339G(r0, r5)
            java.lang.String r7 = r7.f6092a
            boolean r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6339G(r7, r4)
            if (r0 == 0) goto L_0x0072
            if (r7 != 0) goto L_0x0067
            goto L_0x0072
        L_0x0067:
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5804k
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            goto L_0x0023
        L_0x0072:
            r7 = 100
            if (r4 == 0) goto L_0x009d
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0087
            int r0 = r4.length()
            b.l.a.c.h.b.p4 r1 = r6.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            if (r0 > r7) goto L_0x0087
            goto L_0x009d
        L_0x0087:
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5804k
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
        L_0x0099:
            r3.mo14415b(r5, r4)
            goto L_0x00ee
        L_0x009d:
            if (r5 == 0) goto L_0x00c3
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00b0
            int r0 = r5.length()
            b.l.a.c.h.b.p4 r1 = r6.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            if (r0 > r7) goto L_0x00b0
            goto L_0x00c3
        L_0x00b0:
            b.l.a.c.h.b.p4 r3 = r6.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5804k
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            goto L_0x0099
        L_0x00c3:
            b.l.a.c.h.b.p4 r7 = r6.f5638a
            b.l.a.c.h.b.o3 r7 = r7.mo14329d()
            b.l.a.c.h.b.m3 r7 = r7.f5807n
            if (r4 != 0) goto L_0x00d0
            java.lang.String r0 = "null"
            goto L_0x00d1
        L_0x00d0:
            r0 = r4
        L_0x00d1:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.mo14416c(r1, r0, r5)
            b.l.a.c.h.b.x6 r7 = new b.l.a.c.h.b.x6
            b.l.a.c.h.b.p4 r0 = r6.f5638a
            b.l.a.c.h.b.q9 r0 = r0.mo14467t()
            long r0 = r0.mo14534d0()
            r7.<init>(r4, r5, r0)
            java.util.Map<android.app.Activity, b.l.a.c.h.b.x6> r4 = r6.f5512f
            r4.put(r3, r7)
            r4 = 1
            r6.mo14209l(r3, r7, r4)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(b.l.a.c.c.b, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        s.mo14065i();
        s.f5638a.mo14331f().mo14420q(new C3326t5(s, z));
    }

    public void setDefaultEventParameters(@RecentlyNonNull Bundle bundle) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        s.f5638a.mo14331f().mo14420q(new C3304r5(s, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(C2733bc bcVar) {
        mo18932k();
        C3330t9 t9Var = new C3330t9(this, bcVar);
        if (this.f11364a.mo14331f().mo14418o()) {
            this.f11364a.mo14466s().mo14504p(t9Var);
        } else {
            this.f11364a.mo14331f().mo14420q(new C3116a9(this, t9Var));
        }
    }

    public void setInstanceIdProvider(C2761dc dcVar) {
        mo18932k();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        Boolean valueOf = Boolean.valueOf(z);
        s.mo14065i();
        s.f5638a.mo14331f().mo14420q(new C3228k6(s, valueOf));
    }

    public void setMinimumSessionDuration(long j) {
        mo18932k();
    }

    public void setSessionTimeoutDuration(long j) {
        mo18932k();
        C3294q6 s = this.f11364a.mo14466s();
        s.f5638a.mo14331f().mo14420q(new C3348v5(s, j));
    }

    public void setUserId(@RecentlyNonNull String str, long j) {
        mo18932k();
        if (!this.f11364a.f5848g.mo14197r((String) null, C3134c3.f5343B0) || str == null || str.length() != 0) {
            this.f11364a.mo14466s().mo14499G((String) null, "_id", str, true, j);
        } else {
            this.f11364a.mo14329d().f5802i.mo14414a("User ID must be non-empty");
        }
    }

    public void setUserProperty(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull C1980b bVar, boolean z, long j) {
        mo18932k();
        this.f11364a.mo14466s().mo14499G(str, str2, C1984d.m2900n(bVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C2733bc bcVar) {
        Object remove;
        mo18932k();
        synchronized (this.f11365b) {
            remove = this.f11365b.remove(Integer.valueOf(bcVar.mo13255e()));
        }
        if (remove == null) {
            remove = new C3341u9(this, bcVar);
        }
        C3294q6 s = this.f11364a.mo14466s();
        s.mo14065i();
        if (!s.f5895e.remove(remove)) {
            s.f5638a.mo14329d().f5802i.mo14414a("OnEventListener had not been registered");
        }
    }
}
