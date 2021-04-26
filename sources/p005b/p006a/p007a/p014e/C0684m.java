package p005b.p006a.p007a.p014e;

import android.content.Intent;
import com.appfoundry.previewer.activities.BravoActivity;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import java.util.Objects;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p151d.p152a.p161g.C3626b;
import p005b.p096l.p097a.p151d.p152a.p161g.C3627c;
import p005b.p096l.p097a.p151d.p152a.p163i.C3634a;
import p005b.p096l.p097a.p151d.p152a.p163i.C3638e;
import p005b.p096l.p097a.p151d.p152a.p163i.C3640g;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;
import p005b.p096l.p097a.p151d.p152a.p163i.C3651r;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.e.m */
public final class C0684m<ResultT> implements C3634a<ReviewInfo> {

    /* renamed from: a */
    public final /* synthetic */ BravoActivity f384a;

    /* renamed from: b */
    public final /* synthetic */ C3627c f385b;

    /* renamed from: c */
    public final /* synthetic */ int f386c;

    public C0684m(BravoActivity bravoActivity, C3627c cVar, int i) {
        this.f384a = bravoActivity;
        this.f385b = cVar;
        this.f386c = i;
    }

    /* renamed from: a */
    public final void mo10468a(C3651r<ReviewInfo> rVar) {
        C6888i.m12438e(rVar, "request");
        if (rVar.mo14938g()) {
            ReviewInfo f = rVar.mo14937f();
            C6888i.m12437d(f, "request.result");
            C3627c cVar = this.f385b;
            BravoActivity bravoActivity = this.f384a;
            Objects.requireNonNull(cVar);
            Intent intent = new Intent(bravoActivity, PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", f.mo14917a());
            intent.putExtra("window_flags", bravoActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
            C3647n nVar = new C3647n();
            intent.putExtra("result_receiver", new C3626b(cVar.f6692b, nVar));
            bravoActivity.startActivity(intent);
            C3651r<ResultT> rVar2 = nVar.f6722a;
            C6888i.m12437d(rVar2, "manager.launchReviewFlow(this, reviewInfo)");
            C0681j jVar = new C0681j(this);
            Executor executor = C3638e.f6702a;
            rVar2.f6725b.mo14926a(new C3640g(executor, jVar));
            rVar2.mo14936e();
            rVar2.mo14933b(executor, new C0682k(this));
            rVar2.mo14934c(executor, new C0683l(this));
        }
    }
}
