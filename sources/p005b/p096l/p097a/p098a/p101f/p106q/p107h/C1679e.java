package p005b.p096l.p097a.p098a.p101f.p106q.p107h;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: b.l.a.a.f.q.h.e */
public final /* synthetic */ class C1679e implements Runnable {

    /* renamed from: g */
    public final JobInfoSchedulerService f2961g;

    /* renamed from: h */
    public final JobParameters f2962h;

    public C1679e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f2961g = jobInfoSchedulerService;
        this.f2962h = jobParameters;
    }

    public void run() {
        JobInfoSchedulerService jobInfoSchedulerService = this.f2961g;
        JobParameters jobParameters = this.f2962h;
        int i = JobInfoSchedulerService.f11192g;
        jobInfoSchedulerService.jobFinished(jobParameters, false);
    }
}
