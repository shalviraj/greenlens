package p005b.p273o;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RequiresApi;
import com.amplitude.api.Constants;
import com.onesignal.SyncJobService;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4794c0;
import p005b.p273o.C4857i2;
import p005b.p273o.C4908n;

/* renamed from: b.o.r3 */
public class C4957r3 {

    /* renamed from: a */
    public static Long f9567a = 0L;

    /* renamed from: b */
    public static boolean f9568b = false;

    /* renamed from: c */
    public static Thread f9569c;

    /* renamed from: b.o.r3$a */
    public static class C4958a extends C4960c {

        /* renamed from: g */
        public Service f9570g;

        public C4958a(Service service) {
            this.f9570g = service;
        }

        /* renamed from: a */
        public void mo16689a() {
            C4857i2.m8933a(C4857i2.C4868k.DEBUG, "LegacySyncRunnable:Stopped", (Throwable) null);
            this.f9570g.stopSelf();
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: b.o.r3$b */
    public static class C4959b extends C4960c {

        /* renamed from: g */
        public JobService f9571g;

        /* renamed from: h */
        public JobParameters f9572h;

        public C4959b(JobService jobService, JobParameters jobParameters) {
            this.f9571g = jobService;
            this.f9572h = jobParameters;
        }

        /* renamed from: a */
        public void mo16689a() {
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            StringBuilder u = C0843a.m460u("LollipopSyncRunnable:JobFinished needsJobReschedule: ");
            u.append(C4957r3.f9568b);
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            boolean z = C4957r3.f9568b;
            C4957r3.f9568b = false;
            this.f9571g.jobFinished(this.f9572h, z);
        }
    }

    /* renamed from: b.o.r3$c */
    public static abstract class C4960c implements Runnable {

        /* renamed from: b.o.r3$c$a */
        public class C4961a implements C4794c0.C4796b {

            /* renamed from: a */
            public final /* synthetic */ BlockingQueue f9573a;

            public C4961a(C4960c cVar, BlockingQueue blockingQueue) {
                this.f9573a = blockingQueue;
            }

            /* renamed from: a */
            public C4794c0.C4800f mo16539a() {
                return C4794c0.C4800f.SYNC_SERVICE;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.o.c0$d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: b.o.c0$d} */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo16540b(p005b.p273o.C4794c0.C4798d r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L_0x0003
                    goto L_0x0008
                L_0x0003:
                    java.lang.Object r2 = new java.lang.Object
                    r2.<init>()
                L_0x0008:
                    java.util.concurrent.BlockingQueue r0 = r1.f9573a
                    r0.offer(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4957r3.C4960c.C4961a.mo16540b(b.o.c0$d):void");
            }
        }

        /* renamed from: a */
        public abstract void mo16689a();

        public final void run() {
            synchronized (C4957r3.class) {
                C4957r3.f9567a = 0L;
            }
            if (C4857i2.m8950r() == null) {
                mo16689a();
                return;
            }
            C4857i2.f9356a = C4857i2.m8949q();
            C4947q3.m9082b().mo16663p();
            C4947q3.m9081a().mo16663p();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                C4794c0.m8788d(C4857i2.f9358c, false, false, new C4961a(this, arrayBlockingQueue));
                Object take = arrayBlockingQueue.take();
                if (take instanceof C4794c0.C4798d) {
                    C4947q3.m9085e((C4794c0.C4798d) take);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C4947q3.m9082b().mo16669y(true);
            C4947q3.m9081a().mo16669y(true);
            C4908n a = C4908n.m9005a();
            Objects.requireNonNull(a);
            if (!C4857i2.f9363h) {
                for (C4908n.C4912d next : a.f9475b) {
                    if (next.mo16649d()) {
                        next.mo16653j();
                    }
                }
            }
            mo16689a();
        }
    }

    @RequiresApi(21)
    /* renamed from: a */
    public static void m9114a(Context context, long j) {
        boolean z;
        boolean z2;
        Thread thread;
        C4857i2.C4868k kVar = C4857i2.C4868k.VERBOSE;
        C4857i2.m8933a(kVar, "scheduleSyncServiceAsJob:atTime: " + j, (Throwable) null);
        Iterator<JobInfo> it = ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (it.next().getId() == 2071862118 && (thread = f9569c) != null && thread.isAlive()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            C4857i2.m8933a(kVar, "scheduleSyncServiceAsJob Scheduler already running!", (Throwable) null);
            f9568b = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(2071862118, new ComponentName(context, SyncJobService.class));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (C1960d.m2695B(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            z = true;
        }
        if (z) {
            builder.setPersisted(true);
        }
        try {
            int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            C4857i2.m8933a(C4857i2.C4868k.INFO, "scheduleSyncServiceAsJob:result: " + schedule, (Throwable) null);
        } catch (NullPointerException e) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    /* renamed from: b */
    public static void m9115b(Context context) {
        C4857i2.m8933a(C4857i2.C4868k.VERBOSE, "scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", (Throwable) null);
        m9116c(context, Constants.EVENT_UPLOAD_PERIOD_MILLIS);
    }

    /* renamed from: c */
    public static synchronized void m9116c(Context context, long j) {
        synchronized (C4957r3.class) {
            if (f9567a.longValue() == 0 || System.currentTimeMillis() + j <= f9567a.longValue()) {
                if (j < 5000) {
                    j = 5000;
                }
                m9114a(context, j);
                f9567a = Long.valueOf(System.currentTimeMillis() + j);
            }
        }
    }
}
