package p005b.p273o;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import com.onesignal.RestoreKickoffJobService;
import java.util.Objects;

@RequiresApi(api = 21)
/* renamed from: b.o.b3 */
public abstract class C4789b3 extends JobService {

    /* renamed from: b.o.b3$a */
    public class C4790a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ JobService f9167g;

        /* renamed from: h */
        public final /* synthetic */ JobParameters f9168h;

        public C4790a(JobService jobService, JobParameters jobParameters) {
            this.f9167g = jobService;
            this.f9168h = jobParameters;
        }

        public void run() {
            RestoreKickoffJobService restoreKickoffJobService = (RestoreKickoffJobService) C4789b3.this;
            Objects.requireNonNull(restoreKickoffJobService);
            Thread.currentThread().setPriority(10);
            C4857i2.m8928E(restoreKickoffJobService);
            C4915n0.m9028b(restoreKickoffJobService.getApplicationContext());
            C4789b3.this.jobFinished(this.f9168h, false);
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getExtras() == null) {
            return false;
        }
        new Thread(new C4790a(this, jobParameters), "OS_JOBSERVICE_BASE").start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
