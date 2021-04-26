package p005b.p096l.p097a.p098a.p101f.p106q.p107h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p098a.C1584b;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1680f;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1700c;
import p005b.p096l.p097a.p098a.p101f.p111t.C1742a;

@RequiresApi(api = 21)
/* renamed from: b.l.a.a.f.q.h.d */
public class C1678d implements C1695r {

    /* renamed from: a */
    public final Context f2958a;

    /* renamed from: b */
    public final C1700c f2959b;

    /* renamed from: c */
    public final C1680f f2960c;

    public C1678d(Context context, C1700c cVar, C1680f fVar) {
        this.f2958a = context;
        this.f2959b = cVar;
        this.f2960c = fVar;
    }

    /* renamed from: a */
    public void mo11874a(C1640h hVar, int i) {
        mo11875b(hVar, i, false);
    }

    /* renamed from: b */
    public void mo11875b(C1640h hVar, int i, boolean z) {
        boolean z2;
        C1640h hVar2 = hVar;
        int i2 = i;
        ComponentName componentName = new ComponentName(this.f2958a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f2958a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f2958a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(hVar.mo11808b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C1742a.m2277a(hVar.mo11810d())).array());
        if (hVar.mo11809c() != null) {
            adler32.update(hVar.mo11809c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                C0823f.m402w("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", hVar2);
                return;
            }
        }
        long R = this.f2959b.mo11901R(hVar2);
        C1680f fVar = this.f2960c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        C1584b d = hVar.mo11810d();
        String str = "JobInfoScheduler";
        builder.setMinimumLatency(fVar.mo11877b(d, R, i2));
        Set<C1680f.C1683b> c = fVar.mo11861c().get(d).mo11866c();
        if (c.contains(C1680f.C1683b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c.contains(C1680f.C1683b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c.contains(C1680f.C1683b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", hVar.mo11808b());
        persistableBundle.putInt("priority", C1742a.m2277a(hVar.mo11810d()));
        if (hVar.mo11809c() != null) {
            persistableBundle.putString(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, Base64.encodeToString(hVar.mo11809c(), 0));
        }
        builder.setExtras(persistableBundle);
        C0823f.m404x(str, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", hVar2, Integer.valueOf(value), Long.valueOf(this.f2960c.mo11877b(hVar.mo11810d(), R, i2)), Long.valueOf(R), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }
}
