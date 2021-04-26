package p005b.p273o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;
import p005b.p273o.p274w4.C5015e;
import p005b.p273o.p274w4.p275f.C5016a;

/* renamed from: b.o.n */
public class C4908n {

    /* renamed from: c */
    public static C4908n f9473c;
    @Nullable

    /* renamed from: a */
    public Long f9474a;

    /* renamed from: b */
    public List<C4912d> f9475b = Arrays.asList(new C4912d[]{new C4914e(), new C4911c()});

    /* renamed from: b.o.n$b */
    public enum C4910b {
        BACKGROUND,
        END_SESSION
    }

    /* renamed from: b.o.n$c */
    public static class C4911c extends C4912d {
        public C4911c() {
            super((C4909a) null);
            this.f9479a = 1;
            this.f9480b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        /* renamed from: a */
        public void mo16643a(@NonNull JSONObject jSONObject) {
            C5041y1 y1Var = C4857i2.f9377v;
            ArrayList arrayList = new ArrayList();
            for (String aVar : C4815d3.m8832g(C4815d3.f9230a, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet())) {
                try {
                    arrayList.add(new C5016a(aVar));
                } catch (JSONException e) {
                    C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
                    C4857i2.m8933a(kVar, C4911c.class.getSimpleName() + ": error generation OSInfluence from json object: " + e, (Throwable) null);
                }
            }
            C4882j1 j1Var = y1Var.f9746c;
            StringBuilder u = C0843a.m460u("OneSignal SessionManager addSessionData with influences: ");
            u.append(arrayList.toString());
            ((C4856i1) j1Var).mo16609a(u.toString());
            C5015e eVar = y1Var.f9744a;
            Objects.requireNonNull(eVar);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5016a aVar2 = (C5016a) it.next();
                if (aVar2.f9692a.ordinal() == 1) {
                    eVar.mo16769d().mo16749a(jSONObject, aVar2);
                }
            }
            C4882j1 j1Var2 = y1Var.f9746c;
            ((C4856i1) j1Var2).mo16609a("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
        }

        /* renamed from: e */
        public void mo16644e(List<C5016a> list) {
            HashSet hashSet = new HashSet();
            for (C5016a b : list) {
                try {
                    hashSet.add(b.mo16771b());
                } catch (JSONException e) {
                    C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
                    C4857i2.m8933a(kVar, C4911c.class.getSimpleName() + ": error generation json object OSInfluence: " + e, (Throwable) null);
                }
            }
            C4815d3.m8833h(C4815d3.f9230a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
        }

        /* renamed from: i */
        public void mo16645i(@NonNull C4910b bVar) {
            if (bVar.equals(C4910b.END_SESSION)) {
                mo16653j();
            } else {
                C4957r3.m9115b(C4857i2.f9358c);
            }
        }

        /* renamed from: k */
        public boolean mo16646k(@NonNull List<C5016a> list) {
            for (C5016a aVar : list) {
                if (aVar.f9693b.mo16776e()) {
                    C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
                    C4857i2.m8933a(kVar, C4911c.class.getSimpleName() + ":timeTypeApplies for influences: " + list.toString() + " true", (Throwable) null);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b.o.n$d */
    public static abstract class C4912d {

        /* renamed from: a */
        public long f9479a;
        @NonNull

        /* renamed from: b */
        public String f9480b;
        @Nullable

        /* renamed from: c */
        public Long f9481c = null;
        @NonNull

        /* renamed from: d */
        public final AtomicBoolean f9482d = new AtomicBoolean();

        /* renamed from: b.o.n$d$a */
        public class C4913a extends C4920n3 {
            public C4913a() {
            }

            /* renamed from: a */
            public void mo16563a(int i, String str, Throwable th) {
                C4857i2.m8955w("sending on_focus Failed", i, th, str);
            }

            /* renamed from: b */
            public void mo16564b(String str) {
                C4912d.this.mo16650f(0);
            }
        }

        public C4912d() {
        }

        public C4912d(C4909a aVar) {
        }

        /* renamed from: a */
        public void mo16643a(@NonNull JSONObject jSONObject) {
        }

        @NonNull
        /* renamed from: b */
        public final JSONObject mo16647b(long j) {
            boolean z;
            int i = 1;
            JSONObject put = new JSONObject().put("app_id", C4857i2.m8949q()).put("type", 1).put("state", "ping").put("active_time", j);
            boolean z2 = false;
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                i = 2;
            } else if (!C4835f2.m8864n()) {
                if (C4835f2.m8860j()) {
                    if (C4835f2.m8859i() && C4835f2.m8862l()) {
                        z2 = C4835f2.m8865o();
                    }
                }
                if (z2 || (!C4835f2.m8864n() && C4835f2.m8869s("com.huawei.hwid"))) {
                    i = 13;
                }
            }
            JSONObject put2 = put.put("device_type", i);
            try {
                put2.put("net_type", C4857i2.f9331A.mo16573e());
            } catch (Throwable unused2) {
            }
            return put2;
        }

        /* renamed from: c */
        public final long mo16648c() {
            if (this.f9481c == null) {
                this.f9481c = Long.valueOf(C4815d3.m8829d(C4815d3.f9230a, this.f9480b, 0));
            }
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f9481c, (Throwable) null);
            return this.f9481c.longValue();
        }

        /* renamed from: d */
        public final boolean mo16649d() {
            return mo16648c() >= this.f9479a;
        }

        /* renamed from: e */
        public abstract void mo16644e(List<C5016a> list);

        /* renamed from: f */
        public final void mo16650f(long j) {
            this.f9481c = Long.valueOf(j);
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f9481c, (Throwable) null);
            C4815d3.m8835j(C4815d3.f9230a, this.f9480b, j);
        }

        /* renamed from: g */
        public final void mo16651g(long j) {
            try {
                C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
                C4857i2.m8933a(kVar, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j, (Throwable) null);
                JSONObject b = mo16647b(j);
                mo16643a(b);
                mo16652h(C4857i2.m8950r(), b);
                if (!TextUtils.isEmpty(C4857i2.f9360e)) {
                    mo16652h(C4857i2.m8946n(), mo16647b(j));
                }
            } catch (JSONException e) {
                C4857i2.m8933a(C4857i2.C4868k.ERROR, "Generating on_focus:JSON Failed.", e);
            }
        }

        /* renamed from: h */
        public final void mo16652h(@NonNull String str, @NonNull JSONObject jSONObject) {
            C4913a aVar = new C4913a();
            C4805c3.m8818q("players/" + str + "/on_focus", jSONObject, aVar);
        }

        /* renamed from: i */
        public abstract void mo16645i(@NonNull C4910b bVar);

        @WorkerThread
        /* renamed from: j */
        public void mo16653j() {
            if (!this.f9482d.get()) {
                synchronized (this.f9482d) {
                    this.f9482d.set(true);
                    if (mo16649d()) {
                        mo16651g(mo16648c());
                    }
                    this.f9482d.set(false);
                }
            }
        }

        /* renamed from: k */
        public abstract boolean mo16646k(@NonNull List<C5016a> list);
    }

    /* renamed from: b.o.n$e */
    public static class C4914e extends C4912d {
        public C4914e() {
            super((C4909a) null);
            this.f9479a = 60;
            this.f9480b = "GT_UNSENT_ACTIVE_TIME";
        }

        /* renamed from: e */
        public void mo16644e(List<C5016a> list) {
        }

        /* renamed from: i */
        public void mo16645i(@NonNull C4910b bVar) {
            if (!bVar.equals(C4910b.END_SESSION) && mo16649d()) {
                C4957r3.m9115b(C4857i2.f9358c);
                mo16653j();
            }
        }

        /* renamed from: k */
        public boolean mo16646k(@NonNull List<C5016a> list) {
            for (C5016a aVar : list) {
                if (aVar.f9693b.mo16776e()) {
                    return false;
                }
            }
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, C4914e.class.getSimpleName() + ":timeTypeApplies for influences: " + list.toString() + " true", (Throwable) null);
            return true;
        }
    }

    /* renamed from: a */
    public static synchronized C4908n m9005a() {
        C4908n nVar;
        synchronized (C4908n.class) {
            if (f9473c == null) {
                f9473c = new C4908n();
            }
            nVar = f9473c;
        }
        return nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16642b(@androidx.annotation.NonNull java.util.List<p005b.p273o.p274w4.p275f.C5016a> r12, @androidx.annotation.NonNull p005b.p273o.C4908n.C4910b r13) {
        /*
            r11 = this;
            java.lang.Long r0 = r11.f9474a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x002f
        L_0x0006:
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = r11.f9474a
            long r4 = r0.longValue()
            long r2 = r2 - r4
            double r2 = (double) r2
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r4
            long r2 = (long) r2
            r4 = 1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x002f
            r4 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            r2 = 0
            if (r0 != 0) goto L_0x0034
            return r2
        L_0x0034:
            java.util.List<b.o.n$d> r3 = r11.f9475b
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r3.next()
            b.o.n$d r4 = (p005b.p273o.C4908n.C4912d) r4
            long r6 = r0.longValue()
            boolean r8 = r4.mo16646k(r12)
            if (r8 != 0) goto L_0x0052
            goto L_0x003a
        L_0x0052:
            r4.mo16644e(r12)
            b.o.i2$k r8 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Class r10 = r4.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r9.append(r10)
            java.lang.String r10 = ":addTime with lastFocusTimeInfluences: "
            r9.append(r10)
            java.lang.String r10 = r12.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            p005b.p273o.C4857i2.m8933a(r8, r9, r1)
            long r8 = r4.mo16648c()
            long r8 = r8 + r6
            r4.mo16650f(r8)
            java.lang.String r6 = p005b.p273o.C4857i2.m8950r()
            if (r6 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r5 = r2
        L_0x008a:
            if (r5 != 0) goto L_0x008d
            goto L_0x003a
        L_0x008d:
            r4.mo16645i(r13)
            goto L_0x003a
        L_0x0091:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4908n.mo16642b(java.util.List, b.o.n$b):boolean");
    }
}
