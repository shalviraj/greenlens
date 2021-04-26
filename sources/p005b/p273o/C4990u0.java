package p005b.p273o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplitude.api.DeviceInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4802c2;
import p005b.p273o.C4857i2;
import p005b.p273o.C4935p0;
import p005b.p273o.C4968s4;
import p005b.p273o.C4979t0;
import p005b.p273o.p274w4.C5011a;

/* renamed from: b.o.u0 */
public class C4990u0 implements C4935p0.C4936a, C4802c2.C4804b {

    /* renamed from: n */
    public static ArrayList<String> f9641n = new C4993c();

    /* renamed from: o */
    public static final Object f9642o = new Object();

    /* renamed from: a */
    public C4822e2 f9643a;

    /* renamed from: b */
    public C4802c2 f9644b;

    /* renamed from: c */
    public C4842g1 f9645c;
    @NonNull

    /* renamed from: d */
    public ArrayList<C4964s0> f9646d = new ArrayList<>();
    @NonNull

    /* renamed from: e */
    public final Set<String> f9647e;
    @NonNull

    /* renamed from: f */
    public final Set<String> f9648f;
    @NonNull

    /* renamed from: g */
    public final Set<String> f9649g;
    @NonNull

    /* renamed from: h */
    public final ArrayList<C4964s0> f9650h;
    @NonNull

    /* renamed from: i */
    public List<C4964s0> f9651i;

    /* renamed from: j */
    public C4821e1 f9652j = null;

    /* renamed from: k */
    public boolean f9653k = false;
    @Nullable

    /* renamed from: l */
    public Date f9654l = null;

    /* renamed from: m */
    public int f9655m = 0;

    /* renamed from: b.o.u0$a */
    public class C4991a extends C4920n3 {

        /* renamed from: a */
        public final /* synthetic */ C4964s0 f9656a;

        public C4991a(C4964s0 s0Var) {
            this.f9656a = s0Var;
        }

        /* renamed from: a */
        public void mo16563a(int i, String str, Throwable th) {
            boolean z;
            C4990u0 u0Var;
            int i2;
            C4990u0.this.f9653k = false;
            C4990u0.m9147d("html", i, str);
            int[] iArr = C4835f2.f9290a;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                } else if (i == iArr[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z || (i2 = u0Var.f9655m) >= 3) {
                C4990u0 u0Var2 = C4990u0.this;
                u0Var2.f9655m = 0;
                u0Var2.mo16734q(this.f9656a, true);
                return;
            }
            (u0Var = C4990u0.this).f9655m = i2 + 1;
            u0Var.mo16738u(this.f9656a);
        }

        /* renamed from: b */
        public void mo16564b(String str) {
            C4990u0.this.f9655m = 0;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("html");
                double optDouble = jSONObject.optDouble("display_duration");
                C4964s0 s0Var = this.f9656a;
                s0Var.f9582f = optDouble;
                C5041y1 y1Var = C4857i2.f9377v;
                String str2 = s0Var.f9577a;
                C4882j1 j1Var = y1Var.f9746c;
                ((C4856i1) j1Var).mo16609a("OneSignal SessionManager onInAppMessageReceived messageId: " + str2);
                C5011a c = y1Var.f9744a.mo16768c();
                c.mo16764n(str2);
                c.mo16762l();
                C4968s4.m9127i(this.f9656a, string);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b.o.u0$b */
    public class C4992b extends C4920n3 {
        public C4992b() {
        }

        /* renamed from: a */
        public void mo16563a(int i, String str, Throwable th) {
            C4990u0.m9147d("html", i, str);
            C4990u0.this.mo16724g((C4964s0) null);
        }

        /* renamed from: b */
        public void mo16564b(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("html");
                C4964s0 s0Var = new C4964s0(true);
                s0Var.f9582f = jSONObject.optDouble("display_duration");
                C4968s4.m9127i(s0Var, string);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b.o.u0$c */
    public static class C4993c extends ArrayList<String> {
        public C4993c() {
            add(DeviceInfo.OS_NAME);
            add("app");
            add("all");
        }
    }

    /* renamed from: b.o.u0$d */
    public class C4994d implements C4857i2.C4873p {

        /* renamed from: a */
        public final /* synthetic */ C4964s0 f9659a;

        /* renamed from: b */
        public final /* synthetic */ List f9660b;

        public C4994d(C4964s0 s0Var, List list) {
            this.f9659a = s0Var;
            this.f9660b = list;
        }
    }

    public C4990u0(C4783a3 a3Var) {
        Set<String> p = C4835f2.m8866p();
        this.f9647e = p;
        this.f9650h = new ArrayList<>();
        Set<String> p2 = C4835f2.m8866p();
        this.f9648f = p2;
        Set<String> p3 = C4835f2.m8866p();
        this.f9649g = p3;
        this.f9643a = new C4822e2(this);
        this.f9644b = new C4802c2(this);
        String str = C4815d3.f9230a;
        Set<String> g = C4815d3.m8832g(str, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
        if (g != null) {
            p.addAll(g);
        }
        Set<String> g2 = C4815d3.m8832g(str, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
        if (g2 != null) {
            p2.addAll(g2);
        }
        Set<String> g3 = C4815d3.m8832g(str, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set<String>) null);
        if (g3 != null) {
            p3.addAll(g3);
        }
        mo16729l(a3Var);
    }

    /* renamed from: c */
    public static void m9146c(String str, String str2) {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        C4857i2.m8933a(kVar, "Successful post for in-app message " + str + " request: " + str2, (Throwable) null);
    }

    /* renamed from: d */
    public static void m9147d(String str, int i, String str2) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        C4857i2.m8933a(kVar, "Encountered a " + i + " error while attempting in-app message " + str + " request: " + str2, (Throwable) null);
    }

    @Nullable
    /* renamed from: x */
    public static String m9148x(@NonNull C4964s0 s0Var) {
        String b = C4835f2.m8854b();
        Iterator<String> it = f9641n.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (s0Var.f9578b.containsKey(next)) {
                HashMap hashMap = s0Var.f9578b.get(next);
                if (!hashMap.containsKey(b)) {
                    b = "default";
                }
                return (String) hashMap.get(b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo16675a() {
        C4857i2.m8933a(C4857i2.C4868k.DEBUG, "messageTriggerConditionChanged called", (Throwable) null);
        mo16727j();
    }

    /* renamed from: b */
    public void mo16546b() {
        mo16722e();
    }

    /* renamed from: e */
    public final void mo16722e() {
        synchronized (this.f9650h) {
            if (!this.f9644b.mo16545a()) {
                C4857i2.m8933a(C4857i2.C4868k.WARN, "In app message not showing due to system condition not correct", (Throwable) null);
                return;
            }
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, "displayFirstIAMOnQueue: " + this.f9650h, (Throwable) null);
            if (this.f9650h.size() <= 0 || mo16731n()) {
                C4857i2.m8933a(kVar, "In app message is currently showing or there are no IAMs left in the queue!", (Throwable) null);
                return;
            }
            C4857i2.m8933a(kVar, "No IAM showing currently, showing first item in the queue!", (Throwable) null);
            mo16725h(this.f9650h.get(0));
        }
    }

    /* renamed from: f */
    public final void mo16723f(C4964s0 s0Var, List<C4821e1> list) {
        if (list.size() > 0) {
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            StringBuilder u = C0843a.m460u("IAM showing prompts from IAM: ");
            u.append(s0Var.toString());
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            String str = C4968s4.f9596g;
            StringBuilder u2 = C0843a.m460u("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: ");
            u2.append(C4968s4.f9598i);
            C4857i2.m8933a(kVar, u2.toString(), (Throwable) null);
            C4968s4 s4Var = C4968s4.f9598i;
            if (s4Var != null) {
                s4Var.mo16701f((C4968s4.C4974f) null);
            }
            mo16740w(s0Var, list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16724g(@androidx.annotation.Nullable p005b.p273o.C4964s0 r7) {
        /*
            r6 = this;
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.DEBUG
            b.o.y1 r1 = p005b.p273o.C4857i2.f9377v
            b.o.j1 r2 = r1.f9746c
            b.o.i1 r2 = (p005b.p273o.C4856i1) r2
            java.lang.String r3 = "OneSignal SessionManager onDirectInfluenceFromIAMClickFinished"
            r2.mo16609a(r3)
            b.o.w4.e r1 = r1.f9744a
            b.o.w4.a r1 = r1.mo16768c()
            r1.mo16762l()
            b.o.e1 r1 = r6.f9652j
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.String r7 = "Stop evaluateMessageDisplayQueue because prompt is currently displayed"
            p005b.p273o.C4857i2.m8933a(r0, r7, r2)
            return
        L_0x0021:
            r1 = 0
            r6.f9653k = r1
            java.util.ArrayList<b.o.s0> r3 = r6.f9650h
            monitor-enter(r3)
            java.util.ArrayList<b.o.s0> r4 = r6.f9650h     // Catch:{ all -> 0x009f }
            int r4 = r4.size()     // Catch:{ all -> 0x009f }
            if (r4 <= 0) goto L_0x0063
            if (r7 == 0) goto L_0x0040
            java.util.ArrayList<b.o.s0> r4 = r6.f9650h     // Catch:{ all -> 0x009f }
            boolean r7 = r4.contains(r7)     // Catch:{ all -> 0x009f }
            if (r7 != 0) goto L_0x0040
            java.lang.String r7 = "Message already removed from the queue!"
            p005b.p273o.C4857i2.m8933a(r0, r7, r2)     // Catch:{ all -> 0x009f }
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            return
        L_0x0040:
            java.util.ArrayList<b.o.s0> r7 = r6.f9650h     // Catch:{ all -> 0x009f }
            java.lang.Object r7 = r7.remove(r1)     // Catch:{ all -> 0x009f }
            b.o.s0 r7 = (p005b.p273o.C4964s0) r7     // Catch:{ all -> 0x009f }
            java.lang.String r7 = r7.f9577a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r4.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = "In app message with id, "
            r4.append(r5)     // Catch:{ all -> 0x009f }
            r4.append(r7)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = ", dismissed (removed) from the queue!"
            r4.append(r7)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x009f }
            p005b.p273o.C4857i2.m8933a(r0, r7, r2)     // Catch:{ all -> 0x009f }
        L_0x0063:
            java.util.ArrayList<b.o.s0> r7 = r6.f9650h     // Catch:{ all -> 0x009f }
            int r7 = r7.size()     // Catch:{ all -> 0x009f }
            if (r7 <= 0) goto L_0x0095
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r7.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "In app message on queue available: "
            r7.append(r4)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<b.o.s0> r4 = r6.f9650h     // Catch:{ all -> 0x009f }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x009f }
            b.o.s0 r4 = (p005b.p273o.C4964s0) r4     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r4.f9577a     // Catch:{ all -> 0x009f }
            r7.append(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x009f }
            p005b.p273o.C4857i2.m8933a(r0, r7, r2)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<b.o.s0> r7 = r6.f9650h     // Catch:{ all -> 0x009f }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ all -> 0x009f }
            b.o.s0 r7 = (p005b.p273o.C4964s0) r7     // Catch:{ all -> 0x009f }
            r6.mo16725h(r7)     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0095:
            java.lang.String r7 = "In app message dismissed evaluating messages"
            p005b.p273o.C4857i2.m8933a(r0, r7, r2)     // Catch:{ all -> 0x009f }
            r6.mo16727j()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4990u0.mo16724g(b.o.s0):void");
    }

    /* renamed from: h */
    public final void mo16725h(@NonNull C4964s0 s0Var) {
        String str;
        this.f9653k = true;
        String x = m9148x(s0Var);
        if (x == null) {
            C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
            StringBuilder u = C0843a.m460u("Unable to find a variant for in-app message ");
            u.append(s0Var.f9577a);
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            str = null;
        } else {
            StringBuilder u2 = C0843a.m460u("in_app_messages/");
            C0843a.m431G(u2, s0Var.f9577a, "/variants/", x, "/html?app_id=");
            u2.append(C4857i2.f9356a);
            str = u2.toString();
        }
        C4805c3.m8806e(str, new C4991a(s0Var), (String) null);
    }

    /* renamed from: i */
    public void mo16726i(@NonNull String str) {
        this.f9653k = true;
        StringBuilder z = C0843a.m465z("in_app_messages/device_preview?preview_id=", str, "&app_id=");
        z.append(C4857i2.f9356a);
        C4805c3.m8806e(z.toString(), new C4992b(), (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01db, code lost:
        if (r1.mo16562b((java.lang.String) r5, (java.lang.String) r3, r0) != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0235, code lost:
        if (r0 == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014b, code lost:
        if (r5 > r0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a6, code lost:
        if (r10.f9212e != null) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c4, code lost:
        if (((java.util.Collection) r3).contains(r10.f9212e) != false) goto L_0x0237;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023e A[LOOP:2: B:10:0x004e->B:135:0x023e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x023c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16727j() {
        /*
            r22 = this;
            r1 = r22
            b.o.d2$a r0 = p005b.p273o.C4812d2.C4813a.f9215j
            b.o.d2$a r2 = p005b.p273o.C4812d2.C4813a.UNKNOWN
            b.o.i2$k r3 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.lang.String r4 = "Starting evaluateInAppMessages"
            r5 = 0
            p005b.p273o.C4857i2.m8933a(r3, r4, r5)
            java.util.ArrayList<b.o.s0> r4 = r1.f9646d
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03f7
            java.lang.Object r5 = r4.next()
            b.o.s0 r5 = (p005b.p273o.C4964s0) r5
            b.o.e2 r6 = r1.f9643a
            java.util.Objects.requireNonNull(r6)
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r7 = r5.f9579c
            int r7 = r7.size()
            r8 = 1
            if (r7 != 0) goto L_0x0038
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            goto L_0x0276
        L_0x0038:
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r7 = r5.f9579c
            java.util.Iterator r7 = r7.iterator()
        L_0x003e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x026d
            java.lang.Object r9 = r7.next()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x004e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x024e
            java.lang.Object r10 = r9.next()
            b.o.d2 r10 = (p005b.p273o.C4812d2) r10
            b.o.d2$b r11 = p005b.p273o.C4812d2.C4814b.NOT_EQUAL_TO
            b.o.d2$b r12 = p005b.p273o.C4812d2.C4814b.NOT_EXISTS
            b.o.d2$a r13 = r10.f9209b
            if (r13 != r2) goto L_0x0063
            goto L_0x006e
        L_0x0063:
            if (r13 == r0) goto L_0x0184
            b.o.p0 r11 = r6.f9248a
            java.util.Objects.requireNonNull(r11)
            java.lang.Object r12 = r10.f9212e
            if (r12 != 0) goto L_0x007b
        L_0x006e:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r1 = r6
            r19 = r7
            goto L_0x0239
        L_0x007b:
            java.util.ArrayList<java.lang.String> r13 = r11.f9525b
            monitor-enter(r13)
            java.lang.Object r12 = r10.f9212e     // Catch:{ all -> 0x0181 }
            boolean r12 = r12 instanceof java.lang.Number     // Catch:{ all -> 0x0181 }
            if (r12 != 0) goto L_0x0085
            goto L_0x00a8
        L_0x0085:
            b.o.d2$a r12 = r10.f9209b     // Catch:{ all -> 0x0181 }
            int r12 = r12.ordinal()     // Catch:{ all -> 0x0181 }
            if (r12 == 0) goto L_0x009e
            if (r12 == r8) goto L_0x0092
            r14 = 0
            goto L_0x00d1
        L_0x0092:
            java.util.Date r8 = new java.util.Date     // Catch:{ all -> 0x0181 }
            r8.<init>()     // Catch:{ all -> 0x0181 }
            long r14 = r8.getTime()     // Catch:{ all -> 0x0181 }
            java.util.Date r8 = p005b.p273o.C4935p0.f9523c     // Catch:{ all -> 0x0181 }
            goto L_0x00cb
        L_0x009e:
            b.o.u0 r8 = p005b.p273o.C4857i2.m8948p()     // Catch:{ all -> 0x0181 }
            boolean r8 = r8.mo16731n()     // Catch:{ all -> 0x0181 }
            if (r8 == 0) goto L_0x00b6
        L_0x00a8:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x017c
        L_0x00b6:
            b.o.u0 r8 = p005b.p273o.C4857i2.m8948p()     // Catch:{ all -> 0x0181 }
            java.util.Date r8 = r8.f9654l     // Catch:{ all -> 0x0181 }
            if (r8 != 0) goto L_0x00c2
            r14 = 999999(0xf423f, double:4.94065E-318)
            goto L_0x00d1
        L_0x00c2:
            java.util.Date r12 = new java.util.Date     // Catch:{ all -> 0x0181 }
            r12.<init>()     // Catch:{ all -> 0x0181 }
            long r14 = r12.getTime()     // Catch:{ all -> 0x0181 }
        L_0x00cb:
            long r16 = r8.getTime()     // Catch:{ all -> 0x0181 }
            long r14 = r14 - r16
        L_0x00d1:
            java.lang.String r8 = r10.f9208a     // Catch:{ all -> 0x0181 }
            java.lang.Object r12 = r10.f9212e     // Catch:{ all -> 0x0181 }
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ all -> 0x0181 }
            double r16 = r12.doubleValue()     // Catch:{ all -> 0x0181 }
            r18 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r20 = r3
            r21 = r4
            double r3 = r16 * r18
            long r3 = (long) r3     // Catch:{ all -> 0x0181 }
            r16 = r0
            double r0 = (double) r3     // Catch:{ all -> 0x0181 }
            r17 = r5
            r18 = r6
            double r5 = (double) r14     // Catch:{ all -> 0x0181 }
            b.o.d2$b r10 = r10.f9211d     // Catch:{ all -> 0x0181 }
            int r12 = r10.ordinal()     // Catch:{ all -> 0x0181 }
            r19 = r7
            if (r12 == 0) goto L_0x0149
            r7 = 1
            if (r12 == r7) goto L_0x0144
            r7 = 2
            if (r12 == r7) goto L_0x013f
            r7 = 3
            if (r12 == r7) goto L_0x0138
            r7 = 4
            if (r12 == r7) goto L_0x012d
            r7 = 5
            if (r12 == r7) goto L_0x0122
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.ERROR     // Catch:{ all -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0181 }
            r1.<init>()     // Catch:{ all -> 0x0181 }
            java.lang.String r5 = "Attempted to apply an invalid operator on a time-based in-app-message trigger: "
            r1.append(r5)     // Catch:{ all -> 0x0181 }
            java.lang.String r5 = r10.f9229g     // Catch:{ all -> 0x0181 }
            r1.append(r5)     // Catch:{ all -> 0x0181 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0181 }
            r5 = 0
            p005b.p273o.C4857i2.m8933a(r0, r1, r5)     // Catch:{ all -> 0x0181 }
            goto L_0x014f
        L_0x0122:
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x014d
            boolean r0 = p005b.p273o.C4935p0.m9075a(r0, r5)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x014f
            goto L_0x014d
        L_0x012d:
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x014d
            boolean r0 = p005b.p273o.C4935p0.m9075a(r0, r5)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x014f
            goto L_0x014d
        L_0x0138:
            boolean r0 = p005b.p273o.C4935p0.m9075a(r0, r5)     // Catch:{ all -> 0x0181 }
            r0 = r0 ^ 1
            goto L_0x0150
        L_0x013f:
            boolean r0 = p005b.p273o.C4935p0.m9075a(r0, r5)     // Catch:{ all -> 0x0181 }
            goto L_0x0150
        L_0x0144:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x014f
            goto L_0x014d
        L_0x0149:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x014f
        L_0x014d:
            r0 = 1
            goto L_0x0150
        L_0x014f:
            r0 = 0
        L_0x0150:
            if (r0 == 0) goto L_0x015e
            b.o.p0$a r0 = r11.f9524a     // Catch:{ all -> 0x0181 }
            b.o.u0 r0 = (p005b.p273o.C4990u0) r0     // Catch:{ all -> 0x0181 }
            r0.mo16732o(r8)     // Catch:{ all -> 0x0181 }
            monitor-exit(r13)     // Catch:{ all -> 0x0181 }
            r1 = r18
            goto L_0x0237
        L_0x015e:
            long r3 = r3 - r14
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0166
            goto L_0x017c
        L_0x0166:
            java.util.ArrayList<java.lang.String> r0 = r11.f9525b     // Catch:{ all -> 0x0181 }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x016f
            goto L_0x017c
        L_0x016f:
            b.o.o0 r0 = new b.o.o0     // Catch:{ all -> 0x0181 }
            r0.<init>(r11, r8)     // Catch:{ all -> 0x0181 }
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2717H0(r0, r8, r3)     // Catch:{ all -> 0x0181 }
            java.util.ArrayList<java.lang.String> r0 = r11.f9525b     // Catch:{ all -> 0x0181 }
            r0.add(r8)     // Catch:{ all -> 0x0181 }
        L_0x017c:
            monitor-exit(r13)     // Catch:{ all -> 0x0181 }
            r1 = r18
            goto L_0x0239
        L_0x0181:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0181 }
            throw r0
        L_0x0184:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            b.o.d2$b r0 = r10.f9211d
            r1 = r18
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r3 = r1.f9249b
            java.lang.String r4 = r10.f9210c
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L_0x01aa
            if (r0 != r12) goto L_0x01a2
            goto L_0x0237
        L_0x01a2:
            if (r0 != r11) goto L_0x0239
            java.lang.Object r0 = r10.f9212e
            if (r0 == 0) goto L_0x0239
            goto L_0x0237
        L_0x01aa:
            b.o.d2$b r4 = p005b.p273o.C4812d2.C4814b.EXISTS
            if (r0 != r4) goto L_0x01b0
            goto L_0x0237
        L_0x01b0:
            if (r0 != r12) goto L_0x01b4
            goto L_0x0239
        L_0x01b4:
            b.o.d2$b r4 = p005b.p273o.C4812d2.C4814b.CONTAINS
            if (r0 != r4) goto L_0x01c8
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0239
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r0 = r10.f9212e
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0239
            goto L_0x0237
        L_0x01c8:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x01de
            java.lang.Object r5 = r10.f9212e
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x01de
            java.lang.String r5 = (java.lang.String) r5
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = r1.mo16562b(r5, r6, r0)
            if (r5 == 0) goto L_0x01de
            goto L_0x0237
        L_0x01de:
            java.lang.Object r5 = r10.f9212e
            boolean r6 = r5 instanceof java.lang.Number
            if (r6 == 0) goto L_0x01f4
            boolean r6 = r3 instanceof java.lang.Number
            if (r6 == 0) goto L_0x01f4
            java.lang.Number r5 = (java.lang.Number) r5
            r6 = r3
            java.lang.Number r6 = (java.lang.Number) r6
            boolean r5 = r1.mo16561a(r5, r6, r0)
            if (r5 == 0) goto L_0x01f4
            goto L_0x0237
        L_0x01f4:
            java.lang.Object r5 = r10.f9212e
            if (r5 != 0) goto L_0x01f9
            goto L_0x0234
        L_0x01f9:
            java.util.Objects.requireNonNull(r0)
            b.o.d2$b r6 = p005b.p273o.C4812d2.C4814b.EQUAL_TO
            if (r0 == r6) goto L_0x0205
            if (r0 != r11) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r6 = 0
            goto L_0x0206
        L_0x0205:
            r6 = 1
        L_0x0206:
            if (r6 == 0) goto L_0x0215
            java.lang.String r4 = r5.toString()
            java.lang.String r3 = r3.toString()
            boolean r0 = r1.mo16562b(r4, r3, r0)
            goto L_0x0235
        L_0x0215:
            if (r4 == 0) goto L_0x0234
            boolean r4 = r5 instanceof java.lang.Number
            if (r4 == 0) goto L_0x0234
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.String r3 = (java.lang.String) r3
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0234 }
            double r5 = r5.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r0 = r1.mo16561a(r5, r3, r0)
            goto L_0x0235
        L_0x0234:
            r0 = 0
        L_0x0235:
            if (r0 == 0) goto L_0x0239
        L_0x0237:
            r0 = 1
            goto L_0x023a
        L_0x0239:
            r0 = 0
        L_0x023a:
            if (r0 != 0) goto L_0x023e
            r0 = 0
            goto L_0x025a
        L_0x023e:
            r8 = 1
            r6 = r1
            r0 = r16
            r5 = r17
            r7 = r19
            r3 = r20
            r4 = r21
            r1 = r22
            goto L_0x004e
        L_0x024e:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r1 = r6
            r19 = r7
            r0 = 1
        L_0x025a:
            r8 = 1
            if (r0 == 0) goto L_0x025e
            goto L_0x0276
        L_0x025e:
            r6 = r1
            r0 = r16
            r5 = r17
            r7 = r19
            r3 = r20
            r4 = r21
            r1 = r22
            goto L_0x003e
        L_0x026d:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r8 = 0
        L_0x0276:
            if (r8 == 0) goto L_0x03eb
            r1 = r22
            java.util.Set<java.lang.String> r0 = r1.f9647e
            r5 = r17
            java.lang.String r3 = r5.f9577a
            boolean r0 = r0.contains(r3)
            java.util.List<b.o.s0> r3 = r1.f9651i
            int r3 = r3.indexOf(r5)
            if (r0 == 0) goto L_0x03c6
            r0 = -1
            if (r3 == r0) goto L_0x03c6
            java.util.List<b.o.s0> r0 = r1.f9651i
            java.lang.Object r0 = r0.get(r3)
            b.o.s0 r0 = (p005b.p273o.C4964s0) r0
            b.o.f1 r3 = r5.f9581e
            b.o.f1 r4 = r0.f9581e
            java.util.Objects.requireNonNull(r3)
            long r6 = r4.f9285a
            r3.f9285a = r6
            int r4 = r4.f9286b
            r3.f9286b = r4
            boolean r0 = r0.f9583g
            r5.f9583g = r0
            b.o.e2 r0 = r1.f9643a
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r0 = r5.f9579c
            if (r0 == 0) goto L_0x02ec
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02ba
            goto L_0x02ec
        L_0x02ba:
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r0 = r5.f9579c
            java.util.Iterator r0 = r0.iterator()
        L_0x02c0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02e8
            java.lang.Object r3 = r0.next()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x02d0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02c0
            java.lang.Object r4 = r3.next()
            b.o.d2 r4 = (p005b.p273o.C4812d2) r4
            b.o.d2$a r4 = r4.f9209b
            r6 = r16
            if (r4 == r6) goto L_0x02ee
            if (r4 != r2) goto L_0x02e5
            goto L_0x02ee
        L_0x02e5:
            r16 = r6
            goto L_0x02d0
        L_0x02e8:
            r6 = r16
            r0 = 1
            goto L_0x02ef
        L_0x02ec:
            r6 = r16
        L_0x02ee:
            r0 = 0
        L_0x02ef:
            if (r0 == 0) goto L_0x02f6
            boolean r0 = r5.f9583g
            r3 = 1
            r0 = r0 ^ r3
            goto L_0x0310
        L_0x02f6:
            r3 = 1
            boolean r0 = r5.f9583g
            if (r0 != 0) goto L_0x0305
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r0 = r5.f9579c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0305
            r0 = r3
            goto L_0x0306
        L_0x0305:
            r0 = 0
        L_0x0306:
            boolean r4 = r5.f9584h
            if (r4 != 0) goto L_0x030f
            if (r0 == 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r0 = 0
            goto L_0x0310
        L_0x030f:
            r0 = r3
        L_0x0310:
            java.lang.String r4 = "setDataForRedisplay: "
            java.lang.StringBuilder r4 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r7 = r5.toString()
            r4.append(r7)
            java.lang.String r7 = " triggerHasChanged: "
            r4.append(r7)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r7 = 0
            r8 = r20
            p005b.p273o.C4857i2.m8933a(r8, r4, r7)
            if (r0 == 0) goto L_0x03ca
            b.o.f1 r0 = r5.f9581e
            long r9 = r0.f9285a
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x033c
            goto L_0x037a
        L_0x033c:
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            long r11 = r0.f9285a
            long r11 = r9 - r11
            java.lang.String r4 = "OSInAppMessage lastDisplayTime: "
            java.lang.StringBuilder r4 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            long r13 = r0.f9285a
            r4.append(r13)
            java.lang.String r7 = " currentTimeInSeconds: "
            r4.append(r7)
            r4.append(r9)
            java.lang.String r7 = " diffInSeconds: "
            r4.append(r7)
            r4.append(r11)
            java.lang.String r7 = " displayDelay: "
            r4.append(r7)
            long r9 = r0.f9288d
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r7 = 0
            p005b.p273o.C4857i2.m8933a(r8, r4, r7)
            long r9 = r0.f9288d
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x037c
        L_0x037a:
            r0 = r3
            goto L_0x037d
        L_0x037c:
            r0 = 0
        L_0x037d:
            if (r0 == 0) goto L_0x03ca
            b.o.f1 r0 = r5.f9581e
            int r4 = r0.f9286b
            int r0 = r0.f9287c
            if (r4 >= r0) goto L_0x0388
            goto L_0x0389
        L_0x0388:
            r3 = 0
        L_0x0389:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "OSInAppMessage shouldDisplayAgain: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4 = 0
            p005b.p273o.C4857i2.m8933a(r8, r0, r4)
            if (r3 == 0) goto L_0x03ca
            java.lang.String r0 = "setDataForRedisplay message available for redisplay: "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            java.lang.String r3 = r5.f9577a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p005b.p273o.C4857i2.m8933a(r8, r0, r4)
            java.util.Set<java.lang.String> r0 = r1.f9647e
            java.lang.String r3 = r5.f9577a
            r0.remove(r3)
            java.util.Set<java.lang.String> r0 = r1.f9648f
            java.lang.String r3 = r5.f9577a
            r0.remove(r3)
            java.util.Set<java.lang.String> r0 = r5.f9580d
            r0.clear()
            goto L_0x03ca
        L_0x03c6:
            r6 = r16
            r8 = r20
        L_0x03ca:
            java.util.Set<java.lang.String> r0 = r1.f9647e
            java.lang.String r3 = r5.f9577a
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x03f1
            java.util.Date r0 = r5.f9586j
            if (r0 != 0) goto L_0x03da
            r0 = 0
            goto L_0x03e5
        L_0x03da:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.util.Date r3 = r5.f9586j
            boolean r0 = r3.before(r0)
        L_0x03e5:
            if (r0 != 0) goto L_0x03f1
            r1.mo16738u(r5)
            goto L_0x03f1
        L_0x03eb:
            r1 = r22
            r6 = r16
            r8 = r20
        L_0x03f1:
            r0 = r6
            r3 = r8
            r4 = r21
            goto L_0x0014
        L_0x03f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4990u0.mo16727j():void");
    }

    /* renamed from: k */
    public final void mo16728k(@NonNull C4979t0 t0Var) {
        String str = t0Var.f9624c;
        if (str != null && !str.isEmpty()) {
            C4979t0.C4980a aVar = t0Var.f9623b;
            if (aVar == C4979t0.C4980a.BROWSER) {
                C4835f2.m8868r(t0Var.f9624c);
            } else if (aVar == C4979t0.C4980a.IN_APP_WEBVIEW) {
                C1960d.m2874z0(t0Var.f9624c, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r2.isClosed() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r2.isClosed() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[SYNTHETIC, Splitter:B:29:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[SYNTHETIC, Splitter:B:39:0x00bd] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16729l(p005b.p273o.C4783a3 r12) {
        /*
            r11 = this;
            b.o.g1 r0 = r11.f9645c
            if (r0 != 0) goto L_0x000b
            b.o.g1 r0 = new b.o.g1
            r0.<init>(r12)
            r11.f9645c = r0
        L_0x000b:
            b.o.g1 r12 = r11.f9645c
            r11.f9645c = r12
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            r1 = 0
            b.o.a3 r2 = r12.f9300a     // Catch:{ JSONException -> 0x0088, all -> 0x0086 }
            java.lang.String r3 = "in_app_message"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.mo16511S(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x0088, all -> 0x0086 }
            boolean r3 = r2.moveToFirst()     // Catch:{ JSONException -> 0x0084 }
            if (r3 == 0) goto L_0x007d
        L_0x002a:
            java.lang.String r3 = "message_id"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r4 = "click_ids"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r5 = "display_quantity"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ JSONException -> 0x0084 }
            int r5 = r2.getInt(r5)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r6 = "last_display"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ JSONException -> 0x0084 }
            long r6 = r2.getLong(r6)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r8 = "displayed_in_session"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ JSONException -> 0x0084 }
            int r8 = r2.getInt(r8)     // Catch:{ JSONException -> 0x0084 }
            r9 = 1
            if (r8 != r9) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0084 }
            r8.<init>(r4)     // Catch:{ JSONException -> 0x0084 }
            java.util.Set r4 = p005b.p273o.C4835f2.m8867q(r8)     // Catch:{ JSONException -> 0x0084 }
            b.o.s0 r8 = new b.o.s0     // Catch:{ JSONException -> 0x0084 }
            b.o.f1 r10 = new b.o.f1     // Catch:{ JSONException -> 0x0084 }
            r10.<init>(r5, r6)     // Catch:{ JSONException -> 0x0084 }
            r8.<init>(r3, r4, r9, r10)     // Catch:{ JSONException -> 0x0084 }
            r0.add(r8)     // Catch:{ JSONException -> 0x0084 }
            boolean r3 = r2.moveToNext()     // Catch:{ JSONException -> 0x0084 }
            if (r3 != 0) goto L_0x002a
        L_0x007d:
            boolean r3 = r2.isClosed()     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x009d
            goto L_0x009a
        L_0x0084:
            r3 = move-exception
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            goto L_0x00bb
        L_0x0088:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x008b:
            b.o.i2$k r4 = p005b.p273o.C4857i2.C4868k.ERROR     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = "Generating JSONArray from iam click ids:JSON Failed."
            p005b.p273o.C4857i2.m8933a(r4, r5, r3)     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x009d
            boolean r3 = r2.isClosed()     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x009d
        L_0x009a:
            r2.close()     // Catch:{ all -> 0x00c7 }
        L_0x009d:
            monitor-exit(r12)
            r11.f9651i = r0
            b.o.i2$k r12 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.lang.String r0 = "redisplayedInAppMessages: "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            java.util.List<b.o.s0> r2 = r11.f9651i
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            p005b.p273o.C4857i2.m8933a(r12, r0, r1)
            return
        L_0x00b9:
            r0 = move-exception
            r1 = r2
        L_0x00bb:
            if (r1 == 0) goto L_0x00c6
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x00c6
            r1.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c6:
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4990u0.mo16729l(b.o.a3):void");
    }

    /* renamed from: m */
    public void mo16730m() {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        if (!this.f9646d.isEmpty()) {
            StringBuilder u = C0843a.m460u("initWithCachedInAppMessages with already in memory messages: ");
            u.append(this.f9646d);
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            return;
        }
        String f = C4815d3.m8831f(C4815d3.f9230a, "PREFS_OS_CACHED_IAMS", (String) null);
        C4857i2.m8933a(kVar, "initWithCachedInAppMessages: " + f, (Throwable) null);
        if (f != null && !f.isEmpty()) {
            synchronized (f9642o) {
                try {
                    if (this.f9646d.isEmpty()) {
                        mo16737t(new JSONArray(f));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo16731n() {
        return this.f9653k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f A[LOOP:2: B:13:0x005f->B:36:0x005f, LOOP_END, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16732o(java.lang.String r13) {
        /*
            r12 = this;
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "messageDynamicTriggerCompleted called with triggerId: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r2 = 0
            p005b.p273o.C4857i2.m8933a(r0, r1, r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r13)
            java.util.ArrayList<b.o.s0> r13 = r12.f9646d
            java.util.Iterator r13 = r13.iterator()
        L_0x0025:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x00a5
            java.lang.Object r3 = r13.next()
            b.o.s0 r3 = (p005b.p273o.C4964s0) r3
            boolean r4 = r3.f9584h
            if (r4 != 0) goto L_0x0025
            java.util.List<b.o.s0> r4 = r12.f9651i
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0025
            b.o.e2 r4 = r12.f9643a
            java.util.Objects.requireNonNull(r4)
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r4 = r3.f9579c
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x0049
            goto L_0x008c
        L_0x0049:
            java.util.Iterator r4 = r1.iterator()
        L_0x004d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x008c
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r8 = r3.f9579c
            java.util.Iterator r8 = r8.iterator()
        L_0x005f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x004d
            java.lang.Object r9 = r8.next()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x006f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x005f
            java.lang.Object r10 = r9.next()
            b.o.d2 r10 = (p005b.p273o.C4812d2) r10
            java.lang.String r11 = r10.f9210c
            boolean r11 = r7.equals(r11)
            if (r11 != 0) goto L_0x008b
            java.lang.String r10 = r10.f9208a
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x006f
        L_0x008b:
            r5 = r6
        L_0x008c:
            if (r5 == 0) goto L_0x0025
            java.lang.String r4 = "Trigger changed for message: "
            java.lang.StringBuilder r4 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r5 = r3.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            p005b.p273o.C4857i2.m8933a(r0, r4, r2)
            r3.f9584h = r6
            goto L_0x0025
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4990u0.mo16732o(java.lang.String):void");
    }

    /* renamed from: p */
    public void mo16733p(@NonNull C4964s0 s0Var) {
        mo16734q(s0Var, false);
    }

    /* renamed from: q */
    public void mo16734q(@NonNull C4964s0 s0Var, boolean z) {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        if (!s0Var.f9587k) {
            this.f9647e.add(s0Var.f9577a);
            if (!z) {
                C4815d3.m8833h(C4815d3.f9230a, "PREFS_OS_DISPLAYED_IAMS", this.f9647e);
                this.f9654l = new Date();
                C4834f1 f1Var = s0Var.f9581e;
                f1Var.f9285a = System.currentTimeMillis() / 1000;
                f1Var.f9286b++;
                s0Var.f9584h = false;
                s0Var.f9583g = true;
                new Thread(new C4781a1(this, s0Var), "OS_SAVE_IN_APP_MESSAGE").start();
                int indexOf = this.f9651i.indexOf(s0Var);
                if (indexOf != -1) {
                    this.f9651i.set(indexOf, s0Var);
                } else {
                    this.f9651i.add(s0Var);
                }
                StringBuilder u = C0843a.m460u("persistInAppMessageForRedisplay: ");
                u.append(s0Var.toString());
                u.append(" with msg array data: ");
                u.append(this.f9651i.toString());
                C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            }
            StringBuilder u2 = C0843a.m460u("OSInAppMessageController messageWasDismissed dismissedMessages: ");
            u2.append(this.f9647e.toString());
            C4857i2.m8933a(kVar, u2.toString(), (Throwable) null);
        }
        mo16724g(s0Var);
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Throwable, b.o.i2$q] */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x020d, code lost:
        if (r0 == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0227, code lost:
        if (r6.isClosed() == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0229, code lost:
        r6.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0223 A[SYNTHETIC, Splitter:B:128:0x0223] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0266 A[SYNTHETIC, Splitter:B:141:0x0266] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16735r(@androidx.annotation.NonNull p005b.p273o.C4964s0 r27, @androidx.annotation.NonNull org.json.JSONObject r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            b.o.i2$k r3 = p005b.p273o.C4857i2.C4868k.ERROR
            b.o.t0 r4 = new b.o.t0
            r0 = r28
            r4.<init>(r0)
            boolean r0 = r2.f9585i
            r5 = 1
            if (r0 == 0) goto L_0x0014
            r0 = 0
            goto L_0x0017
        L_0x0014:
            r2.f9585i = r5
            r0 = r5
        L_0x0017:
            r4.f9628g = r0
            b.o.i2$g r0 = p005b.p273o.C4857i2.f9338H
            java.util.Objects.requireNonNull(r0)
            java.util.List<b.o.e1> r0 = r4.f9626e
            r1.mo16723f(r2, r0)
            r1.mo16728k(r4)
            java.lang.String r0 = m9148x(r27)
            r6 = 0
            if (r0 != 0) goto L_0x002e
            goto L_0x0086
        L_0x002e:
            java.lang.String r7 = r4.f9622a
            b.o.f1 r8 = r2.f9581e
            boolean r8 = r8.f9289e
            if (r8 == 0) goto L_0x0041
            java.util.Set<java.lang.String> r8 = r2.f9580d
            boolean r8 = r8.contains(r7)
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x0041
            r8 = r5
            goto L_0x0042
        L_0x0041:
            r8 = 0
        L_0x0042:
            if (r8 != 0) goto L_0x004d
            java.util.Set<java.lang.String> r8 = r1.f9649g
            boolean r8 = r8.contains(r7)
            if (r8 == 0) goto L_0x004d
            goto L_0x0086
        L_0x004d:
            java.util.Set<java.lang.String> r8 = r1.f9649g
            r8.add(r7)
            java.util.Set<java.lang.String> r8 = r2.f9580d
            r8.add(r7)
            b.o.y0 r8 = new b.o.y0     // Catch:{ JSONException -> 0x007d }
            r8.<init>(r1, r7, r0, r4)     // Catch:{ JSONException -> 0x007d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x007d }
            r0.<init>()     // Catch:{ JSONException -> 0x007d }
            java.lang.String r7 = "in_app_messages/"
            r0.append(r7)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r7 = r2.f9577a     // Catch:{ JSONException -> 0x007d }
            r0.append(r7)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r7 = "/click"
            r0.append(r7)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x007d }
            b.o.z0 r7 = new b.o.z0     // Catch:{ JSONException -> 0x007d }
            r7.<init>(r1, r4)     // Catch:{ JSONException -> 0x007d }
            p005b.p273o.C4805c3.m8817p(r0, r8, r7)     // Catch:{ JSONException -> 0x007d }
            goto L_0x0086
        L_0x007d:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = "Unable to execute in-app message action HTTP request due to invalid JSON"
            p005b.p273o.C4857i2.m8933a(r3, r0, r6)
        L_0x0086:
            b.o.h1 r0 = r4.f9627f
            if (r0 == 0) goto L_0x00c0
            org.json.JSONObject r7 = r0.f9318a
            if (r7 == 0) goto L_0x0091
            p005b.p273o.C4857i2.m8927D(r7, r6)
        L_0x0091:
            org.json.JSONArray r0 = r0.f9319b
            if (r0 == 0) goto L_0x00c0
            java.lang.String r7 = "deleteTags()"
            boolean r7 = p005b.p273o.C4857i2.m8930G(r7)
            if (r7 == 0) goto L_0x009e
            goto L_0x00c0
        L_0x009e:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r8 = 0
        L_0x00a4:
            int r9 = r0.length()     // Catch:{ all -> 0x00ba }
            if (r8 >= r9) goto L_0x00b6
            java.lang.String r9 = r0.getString(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r10 = ""
            r7.put(r9, r10)     // Catch:{ all -> 0x00ba }
            int r8 = r8 + 1
            goto L_0x00a4
        L_0x00b6:
            p005b.p273o.C4857i2.m8927D(r7, r6)     // Catch:{ all -> 0x00ba }
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            java.lang.String r7 = "Failed to generate JSON for deleteTags."
            p005b.p273o.C4857i2.m8933a(r3, r7, r0)
        L_0x00c0:
            java.lang.String r0 = r2.f9577a
            java.util.List<b.o.d1> r2 = r4.f9625d
            b.o.y1 r4 = p005b.p273o.C4857i2.f9377v
            r4.mo16794c(r0)
            b.o.r1 r4 = p005b.p273o.C4857i2.f9378w
            if (r4 != 0) goto L_0x00d4
            java.lang.String r0 = "Make sure OneSignal.init is called first"
            p005b.p273o.C4857i2.m8933a(r3, r0, r6)
            goto L_0x02c1
        L_0x00d4:
            java.util.Iterator r2 = r2.iterator()
        L_0x00d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r0 = r2.next()
            b.o.d1 r0 = (p005b.p273o.C4811d1) r0
            java.lang.String r3 = r0.f9205a
            boolean r7 = r0.f9207c
            if (r7 == 0) goto L_0x029f
            b.o.y1 r0 = r4.f9560c
            java.util.List r0 = r0.mo16793b()
            b.o.i2$k r7 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00fd:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x012b
            java.lang.Object r9 = r0.next()
            b.o.w4.f.a r9 = (p005b.p273o.p274w4.p275f.C5016a) r9
            b.o.w4.f.c r10 = r9.f9693b
            b.o.w4.f.c r11 = p005b.p273o.p274w4.p275f.C5019c.DISABLED
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00fd
            java.lang.String r10 = "Outcomes disabled for channel: "
            java.lang.StringBuilder r10 = p005b.p035e.p036a.p037a.C0843a.m460u(r10)
            b.o.w4.f.b r11 = r9.f9692a
            java.lang.String r11 = r11.f9701g
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            p005b.p273o.C4857i2.m8933a(r7, r10, r6)
            r8.remove(r9)
            goto L_0x00fd
        L_0x012b:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "Unique Outcome disabled for current session"
            r28 = r2
            goto L_0x028f
        L_0x0137:
            java.util.Iterator r0 = r8.iterator()
        L_0x013b:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0151
            java.lang.Object r9 = r0.next()
            b.o.w4.f.a r9 = (p005b.p273o.p274w4.p275f.C5016a) r9
            b.o.w4.f.c r9 = r9.f9693b
            boolean r9 = r9.mo16776e()
            if (r9 == 0) goto L_0x013b
            r0 = r5
            goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            if (r0 == 0) goto L_0x0273
            b.o.x4.c r0 = r4.f9559b
            b.o.x4.d r9 = r0.mo16786b()
            b.o.x4.a r10 = r9.f9728b
            monitor-enter(r10)
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0270 }
            r11.<init>()     // Catch:{ all -> 0x0270 }
            java.util.Iterator r0 = r8.iterator()     // Catch:{ JSONException -> 0x0219, all -> 0x0216 }
        L_0x0166:
            boolean r12 = r0.hasNext()     // Catch:{ JSONException -> 0x0212 }
            if (r12 == 0) goto L_0x0205
            java.lang.Object r12 = r0.next()     // Catch:{ JSONException -> 0x0212 }
            b.o.w4.f.a r12 = (p005b.p273o.p274w4.p275f.C5016a) r12     // Catch:{ JSONException -> 0x0212 }
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0212 }
            r13.<init>()     // Catch:{ JSONException -> 0x0212 }
            org.json.JSONArray r14 = r12.f9694c     // Catch:{ JSONException -> 0x0212 }
            if (r14 != 0) goto L_0x0181
            r27 = r0
            r28 = r2
            goto L_0x01f5
        L_0x0181:
            r5 = 0
        L_0x0182:
            int r15 = r14.length()     // Catch:{ JSONException -> 0x0200 }
            if (r5 >= r15) goto L_0x01e0
            java.lang.String r15 = r14.getString(r5)     // Catch:{ JSONException -> 0x0200 }
            r27 = r0
            b.o.w4.f.b r0 = r12.f9692a     // Catch:{ JSONException -> 0x0200 }
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ JSONException -> 0x01db }
            java.lang.String r19 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r28 = r2
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ JSONException -> 0x01d9 }
            r16 = 0
            r2[r16] = r15     // Catch:{ JSONException -> 0x01d7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x01d7 }
            r25 = 1
            r2[r25] = r0     // Catch:{ JSONException -> 0x01d3 }
            r0 = 2
            r2[r0] = r3     // Catch:{ JSONException -> 0x01d3 }
            b.o.z2 r0 = r10.f9720b     // Catch:{ JSONException -> 0x01d3 }
            java.lang.String r17 = "cached_unique_outcome"
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r24 = "1"
            r16 = r0
            b.o.a3 r16 = (p005b.p273o.C4783a3) r16     // Catch:{ JSONException -> 0x01d3 }
            r18 = r1
            r20 = r2
            android.database.Cursor r6 = r16.mo16512Z(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x01d3 }
            int r0 = r6.getCount()     // Catch:{ JSONException -> 0x01d3 }
            if (r0 != 0) goto L_0x01ca
            r13.put(r15)     // Catch:{ JSONException -> 0x01d3 }
        L_0x01ca:
            int r5 = r5 + 1
            r1 = r26
            r0 = r27
            r2 = r28
            goto L_0x0182
        L_0x01d3:
            r0 = move-exception
            r5 = r25
            goto L_0x021e
        L_0x01d7:
            r0 = move-exception
            goto L_0x01de
        L_0x01d9:
            r0 = move-exception
            goto L_0x0203
        L_0x01db:
            r0 = move-exception
            r28 = r2
        L_0x01de:
            r5 = 1
            goto L_0x021e
        L_0x01e0:
            r27 = r0
            r28 = r2
            r1 = 1
            int r0 = r13.length()     // Catch:{ JSONException -> 0x01fd }
            if (r0 <= 0) goto L_0x01f4
            b.o.w4.f.a r0 = r12.mo16770a()     // Catch:{ JSONException -> 0x01fd }
            r0.f9694c = r13     // Catch:{ JSONException -> 0x01fd }
            r11.add(r0)     // Catch:{ JSONException -> 0x01fd }
        L_0x01f4:
            r5 = r1
        L_0x01f5:
            r1 = r26
            r0 = r27
            r2 = r28
            goto L_0x0166
        L_0x01fd:
            r0 = move-exception
        L_0x01fe:
            r5 = r1
            goto L_0x021e
        L_0x0200:
            r0 = move-exception
            r28 = r2
        L_0x0203:
            r1 = 1
            goto L_0x01fe
        L_0x0205:
            r28 = r2
            if (r6 == 0) goto L_0x022c
            boolean r0 = r6.isClosed()     // Catch:{ all -> 0x0270 }
            if (r0 != 0) goto L_0x022c
            goto L_0x0229
        L_0x0210:
            r0 = move-exception
            goto L_0x0263
        L_0x0212:
            r0 = move-exception
            r28 = r2
            goto L_0x021e
        L_0x0216:
            r0 = move-exception
            r1 = 0
            goto L_0x0264
        L_0x0219:
            r0 = move-exception
            r28 = r2
            r1 = 0
            r6 = r1
        L_0x021e:
            r0.printStackTrace()     // Catch:{ all -> 0x0210 }
            if (r6 == 0) goto L_0x022c
            boolean r0 = r6.isClosed()     // Catch:{ all -> 0x0270 }
            if (r0 != 0) goto L_0x022c
        L_0x0229:
            r6.close()     // Catch:{ all -> 0x0270 }
        L_0x022c:
            monitor-exit(r10)
            b.o.j1 r0 = r9.f9727a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OneSignal getNotCachedUniqueOutcome influences: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            b.o.i1 r0 = (p005b.p273o.C4856i1) r0
            r0.mo16609a(r1)
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x024c
            goto L_0x024d
        L_0x024c:
            r11 = 0
        L_0x024d:
            if (r11 != 0) goto L_0x025d
            java.lang.String r0 = "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            java.lang.String r1 = r8.toString()
            r0.append(r1)
            goto L_0x0288
        L_0x025d:
            r0 = 0
            r6 = 0
            r4.mo16686b(r3, r0, r11, r6)
            goto L_0x02bb
        L_0x0263:
            r1 = r6
        L_0x0264:
            if (r1 == 0) goto L_0x026f
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0270 }
            if (r2 != 0) goto L_0x026f
            r1.close()     // Catch:{ all -> 0x0270 }
        L_0x026f:
            throw r0     // Catch:{ all -> 0x0270 }
        L_0x0270:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0273:
            r28 = r2
            java.util.Set<java.lang.String> r0 = r4.f9558a
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0293
            java.lang.String r0 = "Measure endpoint will not send because unique outcome already sent for: \nSession: "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            b.o.w4.f.c r1 = p005b.p273o.p274w4.p275f.C5019c.UNATTRIBUTED
            r0.append(r1)
        L_0x0288:
            java.lang.String r1 = "\nOutcome name: "
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m455p(r0, r1, r3)
            r6 = 0
        L_0x028f:
            p005b.p273o.C4857i2.m8933a(r7, r0, r6)
            goto L_0x02bb
        L_0x0293:
            r0 = 0
            java.util.Set<java.lang.String> r1 = r4.f9558a
            r1.add(r3)
            r1 = 0
            r4.mo16686b(r3, r1, r8, r0)
            r6 = r0
            goto L_0x02bb
        L_0x029f:
            r28 = r2
            r1 = 0
            float r0 = r0.f9206b
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b2
            b.o.y1 r1 = r4.f9560c
            java.util.List r1 = r1.mo16793b()
            r4.mo16686b(r3, r0, r1, r6)
            goto L_0x02bb
        L_0x02b2:
            b.o.y1 r0 = r4.f9560c
            java.util.List r0 = r0.mo16793b()
            r4.mo16686b(r3, r1, r0, r6)
        L_0x02bb:
            r1 = r26
            r2 = r28
            goto L_0x00d8
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4990u0.mo16735r(b.o.s0, org.json.JSONObject):void");
    }

    /* renamed from: s */
    public void mo16736s(@NonNull C4964s0 s0Var, @NonNull JSONObject jSONObject) {
        boolean z;
        C4979t0 t0Var = new C4979t0(jSONObject);
        if (s0Var.f9585i) {
            z = false;
        } else {
            z = true;
            s0Var.f9585i = true;
        }
        t0Var.f9628g = z;
        Objects.requireNonNull(C4857i2.f9338H);
        mo16723f(s0Var, t0Var.f9626e);
        mo16728k(t0Var);
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        if (t0Var.f9627f != null) {
            StringBuilder u = C0843a.m460u("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: ");
            u.append(t0Var.f9627f.toString());
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
        }
        if (t0Var.f9625d.size() > 0) {
            StringBuilder u2 = C0843a.m460u("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: ");
            u2.append(t0Var.f9625d.toString());
            C4857i2.m8933a(kVar, u2.toString(), (Throwable) null);
        }
    }

    /* renamed from: t */
    public final void mo16737t(@NonNull JSONArray jSONArray) {
        synchronized (f9642o) {
            ArrayList<C4964s0> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(new C4964s0(jSONArray.getJSONObject(i)));
            }
            this.f9646d = arrayList;
        }
        mo16727j();
    }

    /* renamed from: u */
    public final void mo16738u(@NonNull C4964s0 s0Var) {
        synchronized (this.f9650h) {
            if (!this.f9650h.contains(s0Var)) {
                this.f9650h.add(s0Var);
                C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
                C4857i2.m8933a(kVar, "In app message with id, " + s0Var.f9577a + ", added to the queue", (Throwable) null);
            }
            mo16722e();
        }
    }

    /* renamed from: v */
    public void mo16739v(@NonNull JSONArray jSONArray) {
        C4815d3.m8833h(C4815d3.f9230a, "PREFS_OS_CACHED_IAMS", jSONArray.toString());
        for (C4964s0 s0Var : this.f9651i) {
            s0Var.f9583g = false;
        }
        mo16737t(jSONArray);
    }

    /* renamed from: w */
    public final void mo16740w(C4964s0 s0Var, List<C4821e1> list) {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        Iterator<C4821e1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4821e1 next = it.next();
            if (!next.f9247a) {
                this.f9652j = next;
                break;
            }
        }
        if (this.f9652j != null) {
            StringBuilder u = C0843a.m460u("IAM prompt to handle: ");
            u.append(this.f9652j.toString());
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            C4821e1 e1Var = this.f9652j;
            e1Var.f9247a = true;
            e1Var.mo16544b(new C4994d(s0Var, list));
            return;
        }
        StringBuilder u2 = C0843a.m460u("No IAM prompt to handle, dismiss message: ");
        u2.append(s0Var.f9577a);
        C4857i2.m8933a(kVar, u2.toString(), (Throwable) null);
        mo16733p(s0Var);
    }
}
