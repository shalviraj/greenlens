package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p145h.p147b.C3133c2;
import p005b.p096l.p097a.p113c.p145h.p147b.C3149d6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3161e6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3165ea;
import p005b.p096l.p097a.p113c.p145h.p147b.C3166f;
import p005b.p096l.p097a.p113c.p145h.p147b.C3247m3;
import p005b.p096l.p097a.p113c.p145h.p147b.C3253m9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3281p4;
import p005b.p096l.p097a.p113c.p145h.p147b.C3294q6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3297q9;
import p005b.p096l.p097a.p113c.p145h.p147b.C3305r6;
import p005b.p096l.p097a.p113c.p145h.p147b.C3371x6;

@Deprecated
public class AppMeasurement {

    /* renamed from: c */
    public static volatile AppMeasurement f11358c;

    /* renamed from: a */
    public final C3281p4 f11359a;

    /* renamed from: b */
    public final C3305r6 f11360b;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @RecentlyNonNull
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @RecentlyNonNull
        @Keep
        public String mExpiredEventName;
        @RecentlyNonNull
        @Keep
        public Bundle mExpiredEventParams;
        @RecentlyNonNull
        @Keep
        public String mName;
        @RecentlyNonNull
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @RecentlyNonNull
        @Keep
        public String mTimedOutEventName;
        @RecentlyNonNull
        @Keep
        public Bundle mTimedOutEventParams;
        @RecentlyNonNull
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @RecentlyNonNull
        @Keep
        public String mTriggeredEventName;
        @RecentlyNonNull
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @RecentlyNonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(@NonNull Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            Objects.requireNonNull(bundle, "null reference");
            this.mAppId = (String) C1960d.m2705D1(bundle, "app_id", cls2, null);
            this.mOrigin = (String) C1960d.m2705D1(bundle, "origin", cls2, null);
            this.mName = (String) C1960d.m2705D1(bundle, "name", cls2, null);
            this.mValue = C1960d.m2705D1(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C1960d.m2705D1(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) C1960d.m2705D1(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C1960d.m2705D1(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) C1960d.m2705D1(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C1960d.m2705D1(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) C1960d.m2705D1(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C1960d.m2705D1(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C1960d.m2705D1(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) C1960d.m2705D1(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C1960d.m2705D1(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C1960d.m2705D1(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C1960d.m2705D1(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }

        /* renamed from: a */
        public final Bundle mo18916a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C1960d.m2815k1(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(C3281p4 p4Var) {
        Objects.requireNonNull(p4Var, "null reference");
        this.f11359a = p4Var;
        this.f11360b = null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.RecentlyNonNull
    @androidx.annotation.Keep
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@androidx.annotation.RecentlyNonNull android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f11358c
            if (r0 != 0) goto L_0x005d
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f11358c     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            r1 = 0
            java.lang.String r2 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0032 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            b.l.a.c.h.b.r6 r2 = (p005b.p096l.p097a.p113c.p145h.p147b.C3305r6) r2     // Catch:{  }
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r14.<init>((p005b.p096l.p097a.p113c.p145h.p147b.C3305r6) r2)     // Catch:{ all -> 0x005a }
            f11358c = r14     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x003d:
            b.l.a.c.e.i.ec r13 = new b.l.a.c.e.i.ec     // Catch:{ all -> 0x005a }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005a }
            b.l.a.c.h.b.p4 r14 = p005b.p096l.p097a.p113c.p145h.p147b.C3281p4.m6272h(r14, r13, r1)     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r1.<init>((p005b.p096l.p097a.p113c.p145h.p147b.C3281p4) r14)     // Catch:{ all -> 0x005a }
            f11358c = r1     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r14
        L_0x005d:
            com.google.android.gms.measurement.AppMeasurement r14 = f11358c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(@RecentlyNonNull @Size(min = 1) String str) {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            r6Var.mo14576m(str);
            return;
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        C3133c2 g = this.f11359a.mo14458g();
        Objects.requireNonNull((C1959c) this.f11359a.f5855n);
        g.mo14135i(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public void clearConditionalUserProperty(@RecentlyNonNull @Size(max = 24, min = 1) String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            r6Var.mo14566b(str, str2, bundle);
            return;
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        this.f11359a.mo14466s().mo14506r(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@RecentlyNonNull @Size(min = 1) String str) {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            r6Var.mo14575k(str);
            return;
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        C3133c2 g = this.f11359a.mo14458g();
        Objects.requireNonNull((C1959c) this.f11359a.f5855n);
        g.mo14136j(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public long generateEventId() {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            return r6Var.mo14574j();
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        return this.f11359a.mo14467t().mo14534d0();
    }

    @RecentlyNonNull
    @Keep
    public String getAppInstanceId() {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            return r6Var.mo14570f();
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        return this.f11359a.mo14466s().f5897g.get();
    }

    @RecentlyNonNull
    @WorkerThread
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@RecentlyNonNull String str, @RecentlyNonNull @Size(max = 23, min = 1) String str2) {
        List<Bundle> list;
        C3305r6 r6Var = this.f11360b;
        int i = 0;
        if (r6Var != null) {
            list = r6Var.mo14567c(str, str2);
        } else {
            Objects.requireNonNull(this.f11359a, "null reference");
            C3294q6 s = this.f11359a.mo14466s();
            if (s.f5638a.mo14331f().mo14418o()) {
                s.f5638a.mo14329d().f5799f.mo14414a("Cannot get conditional user properties from analytics worker thread");
                list = new ArrayList<>(0);
            } else {
                C3165ea eaVar = s.f5638a.f5847f;
                if (C3165ea.m5924a()) {
                    s.f5638a.mo14329d().f5799f.mo14414a("Cannot get conditional user properties from main thread");
                    list = new ArrayList<>(0);
                } else {
                    AtomicReference atomicReference = new AtomicReference();
                    s.f5638a.mo14331f().mo14421r(atomicReference, 5000, "get conditional user properties", new C3149d6(s, atomicReference, str, str2));
                    List list2 = (List) atomicReference.get();
                    if (list2 == null) {
                        s.f5638a.mo14329d().f5799f.mo14415b("Timed out waiting for get conditional user properties", (Object) null);
                        list = new ArrayList<>();
                    } else {
                        list = C3297q9.m6340W(list2);
                    }
                }
            }
        }
        if (list != null) {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @RecentlyNonNull
    @Keep
    public String getCurrentScreenClass() {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            return r6Var.mo14571g();
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        C3371x6 x6Var = this.f11359a.mo14466s().f5638a.mo14472y().f5509c;
        if (x6Var != null) {
            return x6Var.f6093b;
        }
        return null;
    }

    @RecentlyNonNull
    @Keep
    public String getCurrentScreenName() {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            return r6Var.mo14577r();
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        C3371x6 x6Var = this.f11359a.mo14466s().f5638a.mo14472y().f5509c;
        if (x6Var != null) {
            return x6Var.f6092a;
        }
        return null;
    }

    @RecentlyNonNull
    @Keep
    public String getGmpAppId() {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            return r6Var.mo14572h();
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        return this.f11359a.mo14466s().mo14507s();
    }

    @WorkerThread
    @Keep
    public int getMaxUserProperties(@RecentlyNonNull @Size(min = 1) String str) {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            return r6Var.mo14569e(str);
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        C3294q6 s = this.f11359a.mo14466s();
        Objects.requireNonNull(s);
        C0823f.m376j(str);
        C3166f fVar = s.f5638a.f5848g;
        return 25;
    }

    @RecentlyNonNull
    @WorkerThread
    @Keep
    public Map<String, Object> getUserProperties(@RecentlyNonNull String str, @RecentlyNonNull @Size(max = 24, min = 1) String str2, boolean z) {
        String str3;
        C3247m3 m3Var;
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            return r6Var.mo14573i(str, str2, z);
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        C3294q6 s = this.f11359a.mo14466s();
        if (s.f5638a.mo14331f().mo14418o()) {
            m3Var = s.f5638a.mo14329d().f5799f;
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            C3165ea eaVar = s.f5638a.f5847f;
            if (C3165ea.m5924a()) {
                m3Var = s.f5638a.mo14329d().f5799f;
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                s.f5638a.mo14331f().mo14421r(atomicReference, 5000, "get user properties", new C3161e6(s, atomicReference, str, str2, z));
                List<C3253m9> list = (List) atomicReference.get();
                if (list == null) {
                    s.f5638a.mo14329d().f5799f.mo14415b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                ArrayMap arrayMap = new ArrayMap(list.size());
                for (C3253m9 m9Var : list) {
                    Object V = m9Var.mo14428V();
                    if (V != null) {
                        arrayMap.put(m9Var.f5751h, V);
                    }
                }
                return arrayMap;
            }
        }
        m3Var.mo14414a(str3);
        return Collections.emptyMap();
    }

    @Keep
    public void logEventInternal(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            r6Var.mo14565a(str, str2, bundle);
            return;
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        this.f11359a.mo14466s().mo14493A(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@RecentlyNonNull ConditionalUserProperty conditionalUserProperty) {
        Objects.requireNonNull(conditionalUserProperty, "null reference");
        C3305r6 r6Var = this.f11360b;
        if (r6Var != null) {
            r6Var.mo14568d(conditionalUserProperty.mo18916a());
            return;
        }
        Objects.requireNonNull(this.f11359a, "null reference");
        C3294q6 s = this.f11359a.mo14466s();
        Bundle a = conditionalUserProperty.mo18916a();
        Objects.requireNonNull((C1959c) s.f5638a.f5855n);
        s.mo14505q(a, System.currentTimeMillis());
    }

    public AppMeasurement(C3305r6 r6Var) {
        Objects.requireNonNull(r6Var, "null reference");
        this.f11360b = r6Var;
        this.f11359a = null;
    }
}
