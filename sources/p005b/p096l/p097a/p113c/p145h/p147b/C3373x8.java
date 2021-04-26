package p005b.p096l.p097a.p113c.p145h.p147b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import p005b.p096l.p097a.p113c.p131e.p140i.C2767e4;

/* renamed from: b.l.a.c.h.b.x8 */
public final class C3373x8 extends C3395z8 {

    /* renamed from: d */
    public final AlarmManager f6104d = ((AlarmManager) this.f5638a.f5842a.getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: e */
    public C3232l f6105e;

    /* renamed from: f */
    public Integer f6106f;

    public C3373x8(C3220j9 j9Var) {
        super(j9Var);
    }

    /* renamed from: j */
    public final boolean mo14178j() {
        AlarmManager alarmManager = this.f6104d;
        if (alarmManager != null) {
            alarmManager.cancel(mo14629p());
        }
        mo14627n();
        return false;
    }

    /* renamed from: l */
    public final void mo14625l() {
        mo14646i();
        this.f5638a.mo14329d().f5807n.mo14414a("Unscheduling upload");
        AlarmManager alarmManager = this.f6104d;
        if (alarmManager != null) {
            alarmManager.cancel(mo14629p());
        }
        mo14626m().mo14387c();
        mo14627n();
    }

    /* renamed from: m */
    public final C3232l mo14626m() {
        if (this.f6105e == null) {
            this.f6105e = new C3362w8(this, this.f6128b.f5658k);
        }
        return this.f6105e;
    }

    @TargetApi(24)
    /* renamed from: n */
    public final void mo14627n() {
        JobScheduler jobScheduler = (JobScheduler) this.f5638a.f5842a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo14628o());
        }
    }

    /* renamed from: o */
    public final int mo14628o() {
        if (this.f6106f == null) {
            String valueOf = String.valueOf(this.f5638a.f5842a.getPackageName());
            this.f6106f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f6106f.intValue();
    }

    /* renamed from: p */
    public final PendingIntent mo14629p() {
        Context context = this.f5638a.f5842a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C2767e4.f4696a);
    }
}
