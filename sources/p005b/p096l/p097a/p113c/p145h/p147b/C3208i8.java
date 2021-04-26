package p005b.p096l.p097a.p113c.p145h.p147b;

import android.app.job.JobParameters;
import java.util.Objects;

/* renamed from: b.l.a.c.h.b.i8 */
public final /* synthetic */ class C3208i8 implements Runnable {

    /* renamed from: g */
    public final C3241l8 f5612g;

    /* renamed from: h */
    public final C3269o3 f5613h;

    /* renamed from: i */
    public final JobParameters f5614i;

    public C3208i8(C3241l8 l8Var, C3269o3 o3Var, JobParameters jobParameters) {
        this.f5612g = l8Var;
        this.f5613h = o3Var;
        this.f5614i = jobParameters;
    }

    public final void run() {
        C3241l8 l8Var = this.f5612g;
        C3269o3 o3Var = this.f5613h;
        JobParameters jobParameters = this.f5614i;
        Objects.requireNonNull(l8Var);
        o3Var.f5807n.mo14414a("AppMeasurementJobService processed last upload request.");
        ((C3230k8) l8Var.f5715a).mo14384c(jobParameters, false);
    }
}
