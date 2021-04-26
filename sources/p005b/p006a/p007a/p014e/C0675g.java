package p005b.p006a.p007a.p014e;

import android.content.Context;
import android.widget.RelativeLayout;
import com.appfoundry.previewer.activities.BravoActivity;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p038f.p039a.C0849e;
import p005b.p096l.p097a.p113c.p150j.C3418c;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p185o.C3924q;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.e.g */
public final class C0675g<TResult> implements C3418c<C3924q> {

    /* renamed from: a */
    public final /* synthetic */ BravoActivity f373a;

    /* renamed from: b */
    public final /* synthetic */ RelativeLayout f374b;

    /* renamed from: b.a.a.e.g$a */
    public static final class C0676a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C0675g f375g;

        public C0676a(C0675g gVar) {
            this.f375g = gVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f375g.f374b;
            if (relativeLayout != null) {
                C0758q.m240e(relativeLayout);
            }
        }
    }

    public C0675g(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
        this.f373a = bravoActivity;
        this.f374b = relativeLayout;
    }

    /* renamed from: c */
    public final void mo10462c(C3428h<C3924q> hVar) {
        C6888i.m12438e(hVar, "task");
        String str = null;
        if (hVar.mo14692n()) {
            C0849e.m546u0();
            C3924q j = hVar.mo14688j();
            if (j != null) {
                str = j.f7197a;
            }
            if (str != null) {
                C0817f fVar = C0817f.f641b;
                StringBuilder sb = new StringBuilder();
                Context a = C0849e.m505a();
                C6888i.m12437d(a, "appContext()");
                sb.append(a.getPackageName());
                sb.append(C0823f.m332B());
                sb.append("firebase_id_token");
                C0817f.m298f(sb.toString(), str);
            }
            BravoActivity bravoActivity = this.f373a;
            int i = BravoActivity.f10754o;
            bravoActivity.mo18421t(str);
            return;
        }
        this.f373a.runOnUiThread(new C0676a(this));
        Object[] objArr = new Object[1];
        Exception i2 = hVar.mo14687i();
        objArr[0] = i2 != null ? i2.getLocalizedMessage() : null;
        C8091a.f16272d.mo26044b("getIdToken:failure %s", objArr);
        BravoActivity bravoActivity2 = this.f373a;
        Exception i3 = hVar.mo14687i();
        if (i3 != null) {
            str = i3.getLocalizedMessage();
        }
        C0849e.m483H0(bravoActivity2, "getIdToken failed", str, 0, 4);
    }
}
