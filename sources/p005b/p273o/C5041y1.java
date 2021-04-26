package p005b.p273o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;
import p005b.p273o.C4908n;
import p005b.p273o.p274w4.C5011a;
import p005b.p273o.p274w4.C5015e;
import p005b.p273o.p274w4.p275f.C5016a;
import p005b.p273o.p274w4.p275f.C5019c;

/* renamed from: b.o.y1 */
public class C5041y1 {

    /* renamed from: a */
    public C5015e f9744a;

    /* renamed from: b */
    public C5043b f9745b;

    /* renamed from: c */
    public C4882j1 f9746c;

    /* renamed from: b.o.y1$a */
    public class C5042a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ List f9747g;

        public C5042a(List list) {
            this.f9747g = list;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            C5043b bVar = C5041y1.this.f9745b;
            List list = this.f9747g;
            Objects.requireNonNull((C4857i2.C4859b) bVar);
            if (C4857i2.f9378w == null) {
                C4857i2.m8933a(C4857i2.C4868k.WARN, "OneSignal onSessionEnding called before init!", (Throwable) null);
            }
            C4953r1 r1Var = C4857i2.f9378w;
            if (r1Var != null) {
                C4857i2.m8933a(C4857i2.C4868k.DEBUG, "OneSignal cleanOutcomes for session", (Throwable) null);
                r1Var.f9558a = C4835f2.m8866p();
                r1Var.mo16685a();
            }
            C4908n a = C4908n.m9005a();
            C4908n.C4910b bVar2 = C4908n.C4910b.END_SESSION;
            if (!a.mo16642b(list, bVar2)) {
                for (C4908n.C4912d next : a.f9475b) {
                    Objects.requireNonNull(next);
                    if (C4857i2.m8950r() != null) {
                        next.mo16645i(bVar2);
                    }
                }
            }
        }
    }

    /* renamed from: b.o.y1$b */
    public interface C5043b {
    }

    public C5041y1(@NonNull C5043b bVar, C5015e eVar, C4882j1 j1Var) {
        this.f9745b = bVar;
        this.f9744a = eVar;
        this.f9746c = j1Var;
    }

    /* renamed from: a */
    public final void mo16792a(C4857i2.C4863f fVar, @Nullable String str) {
        C5016a aVar;
        ((C4856i1) this.f9746c).mo16609a("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + fVar);
        C5015e eVar = this.f9744a;
        Objects.requireNonNull(eVar);
        C5011a d = fVar.equals(C4857i2.C4863f.NOTIFICATION_CLICK) ? eVar.mo16769d() : null;
        List<C5011a> b = this.f9744a.mo16767b(fVar);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (d != null) {
            C5016a e = d.mo16753e();
            C5019c cVar = C5019c.DIRECT;
            if (str == null) {
                str = d.f9686e;
            }
            C5016a aVar2 = e;
            z = mo16796e(d, cVar, str, (JSONArray) null);
            aVar = aVar2;
        } else {
            aVar = null;
        }
        if (z) {
            ((C4856i1) this.f9746c).mo16609a("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + b);
            arrayList.add(aVar);
            Iterator it = ((ArrayList) b).iterator();
            while (it.hasNext()) {
                C5011a aVar3 = (C5011a) it.next();
                if (aVar3.f9684c.mo16777i()) {
                    arrayList.add(aVar3.mo16753e());
                    aVar3.mo16762l();
                }
            }
        }
        ((C4856i1) this.f9746c).mo16609a("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        Iterator it2 = ((ArrayList) b).iterator();
        while (it2.hasNext()) {
            C5011a aVar4 = (C5011a) it2.next();
            if (aVar4.f9684c.equals(C5019c.UNATTRIBUTED)) {
                JSONArray j = aVar4.mo16760j();
                if (j.length() > 0 && !fVar.equals(C4857i2.C4863f.APP_CLOSE)) {
                    C5016a e2 = aVar4.mo16753e();
                    if (mo16796e(aVar4, C5019c.INDIRECT, (String) null, j)) {
                        arrayList.add(e2);
                    }
                }
            }
        }
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        StringBuilder u = C0843a.m460u("Trackers after update attempt: ");
        u.append(this.f9744a.mo16766a().toString());
        C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
        mo16795d(arrayList);
    }

    @NonNull
    /* renamed from: b */
    public List<C5016a> mo16793b() {
        C5015e eVar = this.f9744a;
        Objects.requireNonNull(eVar);
        ArrayList arrayList = new ArrayList();
        for (C5011a e : eVar.f9690a.values()) {
            arrayList.add(e.mo16753e());
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo16794c(@NonNull String str) {
        ((C4856i1) this.f9746c).mo16609a(C0843a.m451l("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: ", str));
        mo16796e(this.f9744a.mo16768c(), C5019c.DIRECT, str, (JSONArray) null);
    }

    /* renamed from: d */
    public final void mo16795d(List<C5016a> list) {
        C4882j1 j1Var = this.f9746c;
        ((C4856i1) j1Var).mo16609a("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new C5042a(list), "OS_END_CURRENT_SESSION").start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        if (r0 != false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16796e(@androidx.annotation.NonNull p005b.p273o.p274w4.C5011a r8, @androidx.annotation.NonNull p005b.p273o.p274w4.p275f.C5019c r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable org.json.JSONArray r11) {
        /*
            r7 = this;
            b.o.w4.f.c r0 = r8.f9684c
            boolean r0 = r9.equals(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000c
            goto L_0x0079
        L_0x000c:
            b.o.w4.f.c r0 = r8.f9684c
            boolean r3 = r0.mo16777i()
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = r8.f9686e
            if (r3 == 0) goto L_0x001f
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x001f
            goto L_0x0079
        L_0x001f:
            boolean r0 = r0.mo16778k()
            if (r0 == 0) goto L_0x007b
            org.json.JSONArray r0 = r8.f9685d
            if (r0 == 0) goto L_0x007b
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x007b
            org.json.JSONArray r0 = r8.f9685d
            if (r0 != 0) goto L_0x0036
            if (r11 != 0) goto L_0x0036
            goto L_0x0070
        L_0x0036:
            if (r0 == 0) goto L_0x0076
            if (r11 != 0) goto L_0x003b
            goto L_0x0076
        L_0x003b:
            int r3 = r0.length()
            int r4 = r11.length()
            if (r3 == r4) goto L_0x0046
            goto L_0x0076
        L_0x0046:
            r3 = r2
        L_0x0047:
            int r4 = r0.length()     // Catch:{ JSONException -> 0x0072 }
            if (r3 >= r4) goto L_0x0070
            r4 = r2
        L_0x004e:
            int r5 = r11.length()     // Catch:{ JSONException -> 0x0072 }
            if (r4 >= r5) goto L_0x0076
            java.lang.Object r5 = r0.get(r3)     // Catch:{ JSONException -> 0x0072 }
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2870y0(r5)     // Catch:{ JSONException -> 0x0072 }
            java.lang.Object r6 = r11.get(r4)     // Catch:{ JSONException -> 0x0072 }
            java.lang.Object r6 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2870y0(r6)     // Catch:{ JSONException -> 0x0072 }
            boolean r5 = r5.equals(r6)     // Catch:{ JSONException -> 0x0072 }
            if (r5 == 0) goto L_0x006d
            int r3 = r3 + 1
            goto L_0x0047
        L_0x006d:
            int r4 = r4 + 1
            goto L_0x004e
        L_0x0070:
            r0 = r1
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0076:
            r0 = r2
        L_0x0077:
            if (r0 != 0) goto L_0x007b
        L_0x0079:
            r0 = r1
            goto L_0x007c
        L_0x007b:
            r0 = r2
        L_0x007c:
            if (r0 != 0) goto L_0x007f
            return r2
        L_0x007f:
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.DEBUG
            java.lang.String r2 = "OSChannelTracker changed: "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            java.lang.String r3 = r8.mo16755f()
            r2.append(r3)
            java.lang.String r3 = "\nfrom:\ninfluenceType: "
            r2.append(r3)
            b.o.w4.f.c r3 = r8.f9684c
            r2.append(r3)
            java.lang.String r3 = ", directNotificationId: "
            r2.append(r3)
            java.lang.String r4 = r8.f9686e
            r2.append(r4)
            java.lang.String r4 = ", indirectNotificationIds: "
            r2.append(r4)
            org.json.JSONArray r5 = r8.f9685d
            r2.append(r5)
            java.lang.String r5 = "\nto:\ninfluenceType: "
            r2.append(r5)
            r2.append(r9)
            r2.append(r3)
            r2.append(r10)
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r3 = 0
            p005b.p273o.C4857i2.m8933a(r0, r2, r3)
            r8.f9684c = r9
            r8.f9686e = r10
            r8.f9685d = r11
            r8.mo16750b()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Trackers changed to: "
            r8.append(r9)
            b.o.w4.e r9 = r7.f9744a
            java.util.List r9 = r9.mo16766a()
            java.lang.String r9 = r9.toString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            p005b.p273o.C4857i2.m8933a(r0, r8, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C5041y1.mo16796e(b.o.w4.a, b.o.w4.f.c, java.lang.String, org.json.JSONArray):boolean");
    }
}
