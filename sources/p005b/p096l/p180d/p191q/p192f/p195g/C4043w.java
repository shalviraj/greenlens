package p005b.p096l.p180d.p191q.p192f.p195g;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p191q.p192f.C3981a;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p193e.C3987a;
import p005b.p096l.p180d.p191q.p192f.p194f.C3993a;
import p005b.p096l.p180d.p191q.p192f.p196h.C4051b;
import p005b.p096l.p180d.p191q.p192f.p200k.C4175h;
import p005b.p096l.p180d.p191q.p192f.p202m.C4183e;
import p005b.p096l.p180d.p191q.p192f.p202m.C4184f;

/* renamed from: b.l.d.q.f.g.w */
public class C4043w {

    /* renamed from: a */
    public final Context f7422a;

    /* renamed from: b */
    public final C4001c0 f7423b;

    /* renamed from: c */
    public final long f7424c = System.currentTimeMillis();

    /* renamed from: d */
    public C4048y f7425d;

    /* renamed from: e */
    public C4048y f7426e;

    /* renamed from: f */
    public C4032q f7427f;

    /* renamed from: g */
    public final C4012g0 f7428g;

    /* renamed from: h */
    public final C3993a f7429h;

    /* renamed from: i */
    public final C3987a f7430i;

    /* renamed from: j */
    public final ExecutorService f7431j;

    /* renamed from: k */
    public final C4008f f7432k;

    /* renamed from: l */
    public final C3981a f7433l;

    /* renamed from: b.l.d.q.f.g.w$a */
    public class C4044a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C4184f f7434g;

        public C4044a(C4184f fVar) {
            this.f7434g = fVar;
        }

        public void run() {
            C4043w.m7442a(C4043w.this, this.f7434g);
        }
    }

    /* renamed from: b.l.d.q.f.g.w$b */
    public class C4045b implements Callable<Boolean> {
        public C4045b() {
        }

        public Object call() {
            try {
                boolean delete = C4043w.this.f7425d.mo15553b().delete();
                if (!delete) {
                    C3982b.f7289a.mo15500f("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(delete);
            } catch (Exception e) {
                if (C3982b.f7289a.mo15495a(6)) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                }
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: b.l.d.q.f.g.w$c */
    public static final class C4046c implements C4051b.C4053b {

        /* renamed from: a */
        public final C4175h f7437a;

        public C4046c(C4175h hVar) {
            this.f7437a = hVar;
        }
    }

    public C4043w(C3825d dVar, C4012g0 g0Var, C3981a aVar, C4001c0 c0Var, C3993a aVar2, C3987a aVar3, ExecutorService executorService) {
        this.f7423b = c0Var;
        dVar.mo15344a();
        this.f7422a = dVar.f7042a;
        this.f7428g = g0Var;
        this.f7433l = aVar;
        this.f7429h = aVar2;
        this.f7430i = aVar3;
        this.f7431j = executorService;
        this.f7432k = new C4008f(executorService);
    }

    /* renamed from: a */
    public static C3428h m7442a(C4043w wVar, C4184f fVar) {
        C3428h<Void> hVar;
        wVar.f7432k.mo15517a();
        wVar.f7425d.mo15552a();
        C3982b bVar = C3982b.f7289a;
        bVar.mo15499e("Initialization marker file was created.");
        try {
            wVar.f7429h.mo15504a(new C4041u(wVar));
            C4183e eVar = (C4183e) fVar;
            if (!eVar.mo15784b().mo15788b().f7768a) {
                bVar.mo15496b("Collection of crash reports disabled in Crashlytics settings.");
                hVar = C1960d.m2737O(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            } else {
                if (!wVar.f7427f.mo15538e()) {
                    bVar.mo15500f("Previous sessions could not be finalized.");
                }
                hVar = wVar.f7427f.mo15541h(eVar.f7766i.get().f6197a);
            }
        } catch (Exception e) {
            if (C3982b.f7289a.mo15495a(6)) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            hVar = C1960d.m2737O(e);
        } catch (Throwable th) {
            wVar.mo15548c();
            throw th;
        }
        wVar.mo15548c();
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        android.util.Log.e("FirebaseCrashlytics", r1, r6);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15547b(p005b.p096l.p180d.p191q.p192f.p202m.C4184f r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            b.l.d.q.f.g.w$a r1 = new b.l.d.q.f.g.w$a
            r1.<init>(r6)
            java.util.concurrent.ExecutorService r6 = r5.f7431j
            java.util.concurrent.Future r6 = r6.submit(r1)
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r2 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
            r1.mo15496b(r2)
            r1 = 4
            r3 = 6
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0038, ExecutionException -> 0x002c, TimeoutException -> 0x001d }
            r6.get(r1, r4)     // Catch:{ InterruptedException -> 0x0038, ExecutionException -> 0x002c, TimeoutException -> 0x001d }
            goto L_0x0044
        L_0x001d:
            r6 = move-exception
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            boolean r1 = r1.mo15495a(r3)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "Crashlytics timed out during initialization."
        L_0x0028:
            android.util.Log.e(r0, r1, r6)
            goto L_0x0044
        L_0x002c:
            r6 = move-exception
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            boolean r1 = r1.mo15495a(r3)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "Crashlytics encountered a problem during initialization."
            goto L_0x0028
        L_0x0038:
            r6 = move-exception
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            boolean r1 = r1.mo15495a(r3)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "Crashlytics was interrupted during initialization."
            goto L_0x0028
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p195g.C4043w.mo15547b(b.l.d.q.f.m.f):void");
    }

    /* renamed from: c */
    public void mo15548c() {
        this.f7432k.mo15518b(new C4045b());
    }
}
