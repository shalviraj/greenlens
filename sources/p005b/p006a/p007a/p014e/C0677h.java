package p005b.p006a.p007a.p014e;

import android.widget.RelativeLayout;
import com.appfoundry.previewer.activities.BravoActivity;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p021l.C0793h;
import p005b.p038f.p039a.C0849e;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.e.h */
public final class C0677h implements C0793h {

    /* renamed from: a */
    public final /* synthetic */ BravoActivity f376a;

    /* renamed from: b */
    public final /* synthetic */ RelativeLayout f377b;

    /* renamed from: b.a.a.e.h$a */
    public static final class C0678a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C0677h f378g;

        public C0678a(C0677h hVar) {
            this.f378g = hVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f378g.f377b;
            if (relativeLayout != null) {
                C0758q.m240e(relativeLayout);
            }
        }
    }

    /* renamed from: b.a.a.e.h$b */
    public static final class C0679b implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C0677h f379g;

        public C0679b(C0677h hVar) {
            this.f379g = hVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f379g.f377b;
            if (relativeLayout != null) {
                C0758q.m240e(relativeLayout);
            }
        }
    }

    public C0677h(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
        this.f376a = bravoActivity;
        this.f377b = relativeLayout;
    }

    /* renamed from: a */
    public void mo10464a(String str) {
        C8091a.f16272d.mo26044b("AuthHandler: Error logging in: %s", str);
        this.f376a.runOnUiThread(new C0678a(this));
    }

    /* renamed from: b */
    public void mo10465b(C3663f fVar) {
        Object[] objArr = new Object[1];
        objArr[0] = fVar != null ? fVar.getAccessToken() : null;
        C8091a.f16272d.mo26043a("AuthHandler: AuthToken: = %s", objArr);
        C0849e.m546u0();
        C0849e.m544t0(fVar);
        this.f376a.runOnUiThread(new C0679b(this));
        BravoActivity.m10142d(this.f376a);
    }
}
