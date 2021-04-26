package p005b.p096l.p180d.p191q.p192f.p202m;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4001c0;
import p005b.p096l.p180d.p191q.p192f.p195g.C4026n0;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4188a;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4189b;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4190c;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4191d;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4192e;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4193f;
import p005b.p096l.p180d.p191q.p192f.p202m.p204k.C4194a;

/* renamed from: b.l.d.q.f.m.e */
public class C4183e implements C4184f {

    /* renamed from: a */
    public final Context f7758a;

    /* renamed from: b */
    public final C4193f f7759b;

    /* renamed from: c */
    public final C4185g f7760c;

    /* renamed from: d */
    public final C4026n0 f7761d;

    /* renamed from: e */
    public final C4179a f7762e;

    /* renamed from: f */
    public final C4194a f7763f;

    /* renamed from: g */
    public final C4001c0 f7764g;

    /* renamed from: h */
    public final AtomicReference<C4191d> f7765h;

    /* renamed from: i */
    public final AtomicReference<C3429i<C4188a>> f7766i = new AtomicReference<>(new C3429i());

    public C4183e(Context context, C4193f fVar, C4026n0 n0Var, C4185g gVar, C4179a aVar, C4194a aVar2, C4001c0 c0Var) {
        C4026n0 n0Var2 = n0Var;
        AtomicReference<C4191d> atomicReference = new AtomicReference<>();
        this.f7765h = atomicReference;
        this.f7758a = context;
        this.f7759b = fVar;
        this.f7761d = n0Var2;
        this.f7760c = gVar;
        this.f7762e = aVar;
        this.f7763f = aVar2;
        this.f7764g = c0Var;
        JSONObject jSONObject = new JSONObject();
        atomicReference.set(new C4192e(C4180b.m7719b(n0Var2, 3600, jSONObject), (C4188a) null, new C4190c(jSONObject.optInt("max_custom_exception_events", 8), 4), new C4189b(jSONObject.optBoolean("collect_reports", true)), 0, 3600));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4192e mo15783a(p005b.p096l.p180d.p191q.p192f.p202m.C4181c r10) {
        /*
            r9 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 6
            r2 = 0
            b.l.d.q.f.m.c r3 = p005b.p096l.p180d.p191q.p192f.p202m.C4181c.SKIP_CACHE_LOOKUP     // Catch:{ Exception -> 0x0068 }
            boolean r3 = r3.equals(r10)     // Catch:{ Exception -> 0x0068 }
            if (r3 != 0) goto L_0x0076
            b.l.d.q.f.m.a r3 = r9.f7762e     // Catch:{ Exception -> 0x0068 }
            org.json.JSONObject r3 = r3.mo15781b()     // Catch:{ Exception -> 0x0068 }
            if (r3 == 0) goto L_0x0060
            b.l.d.q.f.m.g r4 = r9.f7760c     // Catch:{ Exception -> 0x0068 }
            b.l.d.q.f.m.j.e r4 = r4.mo15786a(r3)     // Catch:{ Exception -> 0x0068 }
            if (r4 == 0) goto L_0x0052
            java.lang.String r5 = "Loaded cached settings: "
            r9.mo15785c(r3, r5)     // Catch:{ Exception -> 0x0068 }
            b.l.d.q.f.g.n0 r3 = r9.f7761d     // Catch:{ Exception -> 0x0068 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ Exception -> 0x0068 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0068 }
            b.l.d.q.f.m.c r3 = p005b.p096l.p180d.p191q.p192f.p202m.C4181c.IGNORE_CACHE_EXPIRATION     // Catch:{ Exception -> 0x0068 }
            boolean r10 = r3.equals(r10)     // Catch:{ Exception -> 0x0068 }
            if (r10 != 0) goto L_0x0046
            long r7 = r4.f7773d     // Catch:{ Exception -> 0x0068 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x003a
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            b.l.d.q.f.b r10 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "Cached settings have expired."
            r10.mo15499e(r3)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0076
        L_0x0046:
            b.l.d.q.f.b r10 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = "Returning cached settings."
            r10.mo15499e(r2)     // Catch:{ Exception -> 0x004f }
            r2 = r4
            goto L_0x0076
        L_0x004f:
            r10 = move-exception
            r2 = r4
            goto L_0x0069
        L_0x0052:
            b.l.d.q.f.b r10 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "Failed to parse cached settings data."
            boolean r10 = r10.mo15495a(r1)     // Catch:{ Exception -> 0x0068 }
            if (r10 == 0) goto L_0x0076
            android.util.Log.e(r0, r3, r2)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0076
        L_0x0060:
            b.l.d.q.f.b r10 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "No cached settings data found."
            r10.mo15496b(r3)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0076
        L_0x0068:
            r10 = move-exception
        L_0x0069:
            b.l.d.q.f.b r3 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            boolean r1 = r3.mo15495a(r1)
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "Failed to get cached settings"
            android.util.Log.e(r0, r1, r10)
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p202m.C4183e.mo15783a(b.l.d.q.f.m.c):b.l.d.q.f.m.j.e");
    }

    /* renamed from: b */
    public C4191d mo15784b() {
        return this.f7765h.get();
    }

    /* renamed from: c */
    public final void mo15785c(JSONObject jSONObject, String str) {
        C3982b bVar = C3982b.f7289a;
        StringBuilder u = C0843a.m460u(str);
        u.append(jSONObject.toString());
        bVar.mo15496b(u.toString());
    }
}
