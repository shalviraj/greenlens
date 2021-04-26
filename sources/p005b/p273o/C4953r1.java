package p005b.p273o;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;
import p005b.p273o.p274w4.p275f.C5016a;
import p005b.p273o.p274w4.p275f.C5019c;
import p005b.p273o.p276x4.C5026a;
import p005b.p273o.p276x4.C5028c;
import p005b.p273o.p276x4.C5029d;
import p005b.p273o.p276x4.p277j.C5036b;
import p005b.p273o.p276x4.p277j.C5037c;
import p005b.p273o.p276x4.p277j.C5038d;

/* renamed from: b.o.r1 */
public class C4953r1 {

    /* renamed from: a */
    public Set<String> f9558a = C4835f2.m8866p();
    @NonNull

    /* renamed from: b */
    public final C5028c f9559b;
    @NonNull

    /* renamed from: c */
    public final C5041y1 f9560c;

    /* renamed from: b.o.r1$a */
    public class C4954a implements C4982t2 {

        /* renamed from: a */
        public final /* synthetic */ C5036b f9561a;

        /* renamed from: b */
        public final /* synthetic */ C4857i2.C4874q f9562b;

        /* renamed from: c */
        public final /* synthetic */ long f9563c;

        /* renamed from: d */
        public final /* synthetic */ String f9564d;

        /* renamed from: b.o.r1$a$a */
        public class C4955a implements Runnable {
            public C4955a() {
            }

            public void run() {
                C5019c cVar;
                Thread.currentThread().setPriority(10);
                C4954a aVar = C4954a.this;
                aVar.f9561a.f9735d = aVar.f9563c;
                C5029d b = C4953r1.this.f9559b.mo16786b();
                C5036b bVar = C4954a.this.f9561a;
                C5026a aVar2 = b.f9728b;
                C5019c cVar2 = C5019c.INDIRECT;
                C5019c cVar3 = C5019c.DIRECT;
                synchronized (aVar2) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    C5019c cVar4 = C5019c.UNATTRIBUTED;
                    C5037c cVar5 = bVar.f9733b;
                    if (cVar5 != null) {
                        C5038d dVar = cVar5.f9736a;
                        if (dVar != null) {
                            JSONArray jSONArray3 = dVar.f9738a;
                            if (jSONArray3 == null || jSONArray3.length() <= 0) {
                                cVar = cVar4;
                            } else {
                                jSONArray = cVar5.f9736a.f9738a;
                                cVar = cVar3;
                            }
                            JSONArray jSONArray4 = dVar.f9739b;
                            if (jSONArray4 == null || jSONArray4.length() <= 0) {
                                cVar3 = cVar4;
                            } else {
                                jSONArray2 = cVar5.f9736a.f9739b;
                            }
                            cVar4 = cVar3;
                        } else {
                            cVar = cVar4;
                        }
                        C5038d dVar2 = cVar5.f9737b;
                        if (dVar2 != null) {
                            JSONArray jSONArray5 = dVar2.f9738a;
                            if (jSONArray5 != null && jSONArray5.length() > 0) {
                                jSONArray = cVar5.f9737b.f9738a;
                                cVar = cVar2;
                            }
                            JSONArray jSONArray6 = dVar2.f9739b;
                            if (jSONArray6 != null && jSONArray6.length() > 0) {
                                jSONArray2 = cVar5.f9737b.f9739b;
                                cVar4 = cVar;
                            }
                        }
                        cVar2 = cVar4;
                        cVar4 = cVar;
                    } else {
                        cVar2 = cVar4;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("notification_ids", jSONArray.toString());
                    contentValues.put("iam_ids", jSONArray2.toString());
                    contentValues.put("notification_influence_type", cVar4.toString().toLowerCase());
                    contentValues.put("iam_influence_type", cVar2.toString().toLowerCase());
                    contentValues.put("name", bVar.f9732a);
                    contentValues.put(ActivityChooserModel.ATTRIBUTE_WEIGHT, bVar.f9734c);
                    contentValues.put(BasePayload.TIMESTAMP_KEY, Long.valueOf(bVar.f9735d));
                    ((C4783a3) aVar2.f9720b).mo16508H("outcome", (String) null, contentValues);
                }
            }
        }

        public C4954a(C5036b bVar, C4857i2.C4874q qVar, long j, String str) {
            this.f9561a = bVar;
            this.f9562b = qVar;
            this.f9563c = j;
            this.f9564d = str;
        }

        /* renamed from: a */
        public void mo16680a(String str) {
            C4953r1 r1Var = C4953r1.this;
            C5036b bVar = this.f9561a;
            Objects.requireNonNull(r1Var);
            C5037c cVar = bVar.f9733b;
            if (cVar == null || (cVar.f9736a == null && cVar.f9737b == null)) {
                r1Var.mo16685a();
            } else {
                new Thread(new C4965s1(r1Var, bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
            }
            C4857i2.C4874q qVar = this.f9562b;
            if (qVar != null) {
                qVar.mo16618a(C4967s3.m9122a(this.f9561a));
            }
        }

        /* renamed from: b */
        public void mo16681b(int i, String str, Throwable th) {
            new Thread(new C4955a(), "OS_SAVE_OUTCOMES").start();
            C4857i2.C4868k kVar = C4857i2.C4868k.WARN;
            StringBuilder u = C0843a.m460u("Sending outcome with name: ");
            u.append(this.f9564d);
            u.append(" failed with status code: ");
            u.append(i);
            u.append(" and response: ");
            u.append(str);
            u.append("\nOutcome event was cached and will be reattempted on app cold start");
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            C4857i2.C4874q qVar = this.f9562b;
            if (qVar != null) {
                qVar.mo16618a((C4967s3) null);
            }
        }
    }

    public C4953r1(@NonNull C5041y1 y1Var, @NonNull C5028c cVar) {
        this.f9560c = y1Var;
        this.f9559b = cVar;
        C5029d b = cVar.mo16786b();
        Objects.requireNonNull(b.f9728b.f9721c);
        Set<String> g = C4815d3.m8832g(C4815d3.f9230a, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", (Set<String>) null);
        C4882j1 j1Var = b.f9727a;
        ((C4856i1) j1Var).mo16609a("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + g);
        if (g != null) {
            this.f9558a = g;
        }
    }

    /* renamed from: a */
    public final void mo16685a() {
        C5029d b = this.f9559b.mo16786b();
        Set<String> set = this.f9558a;
        C4882j1 j1Var = b.f9727a;
        ((C4856i1) j1Var).mo16609a("OneSignal save unattributedUniqueOutcomeEvents: " + set);
        Objects.requireNonNull(b.f9728b.f9721c);
        C4815d3.m8833h(C4815d3.f9230a, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (p005b.p273o.C4835f2.m8869s("com.huawei.hwid") == false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16686b(@androidx.annotation.NonNull java.lang.String r17, @androidx.annotation.NonNull float r18, @androidx.annotation.NonNull java.util.List<p005b.p273o.p274w4.p275f.C5016a> r19, @androidx.annotation.Nullable p005b.p273o.C4857i2.C4874q r20) {
        /*
            r16 = this;
            r7 = r16
            r3 = r20
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.VERBOSE
            long r1 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r1 / r4
            r1 = 1
            r2 = 0
            java.lang.String r6 = "com.amazon.device.messaging.ADM"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0017 }
            r6 = r1
            goto L_0x0018
        L_0x0017:
            r6 = r2
        L_0x0018:
            r8 = 2
            if (r6 == 0) goto L_0x001d
            r9 = r8
            goto L_0x0058
        L_0x001d:
            boolean r6 = p005b.p273o.C4835f2.m8864n()
            if (r6 == 0) goto L_0x0024
            goto L_0x0057
        L_0x0024:
            boolean r6 = p005b.p273o.C4835f2.m8860j()
            if (r6 == 0) goto L_0x0041
            boolean r6 = p005b.p273o.C4835f2.m8859i()
            if (r6 == 0) goto L_0x0038
            boolean r6 = p005b.p273o.C4835f2.m8862l()
            if (r6 == 0) goto L_0x0038
            r6 = r1
            goto L_0x0039
        L_0x0038:
            r6 = r2
        L_0x0039:
            if (r6 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            boolean r6 = p005b.p273o.C4835f2.m8865o()
            goto L_0x0042
        L_0x0041:
            r6 = r2
        L_0x0042:
            r9 = 13
            if (r6 == 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            boolean r6 = p005b.p273o.C4835f2.m8864n()
            if (r6 == 0) goto L_0x004e
            goto L_0x0057
        L_0x004e:
            java.lang.String r6 = "com.huawei.hwid"
            boolean r6 = p005b.p273o.C4835f2.m8869s(r6)
            if (r6 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r9 = r1
        L_0x0058:
            java.lang.String r10 = p005b.p273o.C4857i2.f9356a
            java.util.Iterator r6 = r19.iterator()
            r11 = 0
            r12 = r11
            r13 = r12
        L_0x0061:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x00af
            java.lang.Object r14 = r6.next()
            b.o.w4.f.a r14 = (p005b.p273o.p274w4.p275f.C5016a) r14
            b.o.w4.f.c r15 = r14.f9693b
            int r15 = r15.ordinal()
            if (r15 == 0) goto L_0x00a3
            if (r15 == r1) goto L_0x0098
            if (r15 == r8) goto L_0x0095
            r1 = 3
            if (r15 == r1) goto L_0x007d
            goto L_0x00ad
        L_0x007d:
            java.lang.String r1 = "Outcomes disabled for channel: "
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            b.o.w4.f.b r2 = r14.f9692a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p005b.p273o.C4857i2.m8933a(r0, r1, r11)
            if (r3 == 0) goto L_0x0094
            r3.mo16618a(r11)
        L_0x0094:
            return
        L_0x0095:
            r1 = 1
            r2 = r1
            goto L_0x00ad
        L_0x0098:
            if (r13 != 0) goto L_0x009f
            b.o.x4.j.d r13 = new b.o.x4.j.d
            r13.<init>()
        L_0x009f:
            r7.mo16687c(r14, r13)
            goto L_0x00ad
        L_0x00a3:
            if (r12 != 0) goto L_0x00aa
            b.o.x4.j.d r12 = new b.o.x4.j.d
            r12.<init>()
        L_0x00aa:
            r7.mo16687c(r14, r12)
        L_0x00ad:
            r1 = 1
            goto L_0x0061
        L_0x00af:
            if (r12 != 0) goto L_0x00c0
            if (r13 != 0) goto L_0x00c0
            if (r2 != 0) goto L_0x00c0
            java.lang.String r1 = "Outcomes disabled for all channels"
            p005b.p273o.C4857i2.m8933a(r0, r1, r11)
            if (r3 == 0) goto L_0x00bf
            r3.mo16618a(r11)
        L_0x00bf:
            return
        L_0x00c0:
            b.o.x4.j.c r0 = new b.o.x4.j.c
            r0.<init>(r12, r13)
            b.o.x4.j.b r8 = new b.o.x4.j.b
            r6 = r17
            r1 = r18
            r8.<init>(r6, r0, r1)
            b.o.r1$a r11 = new b.o.r1$a
            r0 = r11
            r1 = r16
            r2 = r8
            r3 = r20
            r0.<init>(r2, r3, r4, r6)
            b.o.x4.c r0 = r7.f9559b
            b.o.x4.d r0 = r0.mo16786b()
            r0.mo16787a(r10, r9, r8, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4953r1.mo16686b(java.lang.String, float, java.util.List, b.o.i2$q):void");
    }

    /* renamed from: c */
    public final C5038d mo16687c(C5016a aVar, C5038d dVar) {
        int ordinal = aVar.f9692a.ordinal();
        if (ordinal == 0) {
            dVar.f9739b = aVar.f9694c;
        } else if (ordinal == 1) {
            dVar.f9738a = aVar.f9694c;
        }
        return dVar;
    }
}
