package p005b.p006a.p007a.p008a;

import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Page;
import p005b.p006a.p007a.p017h.C0726r0;
import p005b.p006a.p007a.p017h.C0727s;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0779j;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p038f.p039a.C0849e;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7821y;
import p437o.p438a.p439a.C8068c;

@C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$getRemotePageWithCoroutines$1", mo24178f = "BravoFragment.kt", mo24179l = {199}, mo24180m = "invokeSuspend")
/* renamed from: b.a.a.a.d */
public final class C0598d extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

    /* renamed from: k */
    public int f219k;

    /* renamed from: l */
    public final /* synthetic */ C0605h f220l;

    /* renamed from: m */
    public final /* synthetic */ boolean f221m;

    /* renamed from: n */
    public final /* synthetic */ RelativeLayout f222n;

    @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$getRemotePageWithCoroutines$1$remoteResponse$1", mo24178f = "BravoFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.a.d$a */
    public static final class C0599a extends C6844h implements C6866p<C7821y, C6824d<? super C0779j>, Object> {

        /* renamed from: k */
        public final /* synthetic */ C0598d f223k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0599a(C0598d dVar, C6824d dVar2) {
            super(2, dVar2);
            this.f223k = dVar;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0599a(this.f223k, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C5266a.m10018q4(obj);
            return C0820c.m311k(this.f223k.f220l.f210g, false, 2);
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            C0598d dVar2 = this.f223k;
            dVar.getContext();
            C5266a.m10018q4(C6777r.f13694a);
            return C0820c.m311k(dVar2.f220l.f210g, false, 2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0598d(C0605h hVar, boolean z, RelativeLayout relativeLayout, C6824d dVar) {
        super(2, dVar);
        this.f220l = hVar;
        this.f221m = z;
        this.f222n = relativeLayout;
    }

    /* renamed from: b */
    public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
        C6888i.m12438e(dVar, "completion");
        return new C0598d(this.f220l, this.f221m, this.f222n, dVar);
    }

    /* renamed from: e */
    public final Object mo10326e(Object obj) {
        FragmentActivity activity;
        C6833a aVar = C6833a.COROUTINE_SUSPENDED;
        int i = this.f219k;
        Page page = null;
        if (i == 0) {
            C5266a.m10018q4(obj);
            C7815w wVar = C7725h0.f15274b;
            C0599a aVar2 = new C0599a(this, (C6824d) null);
            this.f219k = 1;
            obj = C5266a.m9853N4(wVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C5266a.m10018q4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0779j jVar = (C0779j) obj;
        C0605h hVar = this.f220l;
        if (jVar != null) {
            page = jVar.f549a;
        }
        hVar.f210g = page;
        if (page != null) {
            page.f11043k = hVar.f240n;
        }
        if (jVar != null && jVar.f550b) {
            C8068c.m14948b().mo26008g(new C0726r0());
        } else if (page == null) {
            C8068c.m14948b().mo26008g(new C0727s(false, 1));
        } else {
            if (!this.f221m) {
                SwipeRefreshLayout swipeRefreshLayout = hVar.f238l;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setEnabled(true);
                }
                RelativeLayout relativeLayout = this.f222n;
                if (relativeLayout != null) {
                    C0758q.m240e(relativeLayout);
                }
                FragmentActivity activity2 = this.f220l.getActivity();
                if (activity2 != null) {
                    BravoApp.C5403b bVar = BravoApp.f10730N;
                    Fragment r = C0849e.m539r(activity2, BravoApp.f10727K);
                    if (!(r == null || (activity = this.f220l.getActivity()) == null)) {
                        C0849e.m538q0(activity, r);
                    }
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout2 = hVar.f238l;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
            }
            C0605h hVar2 = this.f220l;
            int i2 = C0605h.f235p;
            hVar2.mo10334e();
        }
        return C6777r.f13694a;
    }

    public final Object invoke(Object obj, Object obj2) {
        C6824d dVar = (C6824d) obj2;
        C6888i.m12438e(dVar, "completion");
        return new C0598d(this.f220l, this.f221m, this.f222n, dVar).mo10326e(C6777r.f13694a);
    }
}
