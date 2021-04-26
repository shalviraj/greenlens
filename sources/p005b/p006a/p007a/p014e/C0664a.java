package p005b.p006a.p007a.p014e;

import com.appfoundry.previewer.activities.BravoActivity;
import com.google.android.play.core.install.InstallState;
import p005b.p096l.p097a.p151d.p152a.p157d.C3571b;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.e.a */
public final class C0664a implements C3571b {

    /* renamed from: a */
    public final /* synthetic */ BravoActivity.C5409c f355a;

    public C0664a(BravoActivity.C5409c cVar) {
        this.f355a = cVar;
    }

    /* renamed from: a */
    public void mo10457a(Object obj) {
        BravoActivity bravoActivity;
        int i;
        InstallState installState = (InstallState) obj;
        C6888i.m12438e(installState, "installState");
        if (installState.mo14873c() == 4) {
            BravoActivity bravoActivity2 = this.f355a.f10766g;
            int i2 = BravoActivity.f10754o;
            bravoActivity2.mo18420s().mo14731e(this);
            this.f355a.f10766g.f10760l = true;
            return;
        }
        if (installState.mo14873c() == 11) {
            bravoActivity = this.f355a.f10766g;
            i = 99;
        } else if (installState.mo14873c() == 2) {
            BravoActivity bravoActivity3 = this.f355a.f10766g;
            if (bravoActivity3.f10760l) {
                BravoActivity.m10144f(bravoActivity3, 98);
                this.f355a.f10766g.f10760l = false;
                return;
            }
            return;
        } else if (installState.mo14873c() == 5) {
            bravoActivity = this.f355a.f10766g;
            i = 500;
        } else {
            C8091a.f16272d.mo26043a("InstallStateUpdatedListener: state: %s", Integer.valueOf(installState.mo14873c()));
            return;
        }
        BravoActivity.m10144f(bravoActivity, i);
    }
}
