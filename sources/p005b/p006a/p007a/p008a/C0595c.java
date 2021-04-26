package p005b.p006a.p007a.p008a;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.model.Page;
import p005b.p006a.p007a.p017h.C0726r0;
import p005b.p006a.p007a.p017h.C0727s;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0779j;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p372i.p373a.p374a.p375a.C6999e;
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7819x0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p416l.p417a.p419u1.C7785l;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.a.c */
public final class C0595c extends C6999e {

    /* renamed from: h */
    public Page f213h;

    /* renamed from: i */
    public View f214i;

    @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BlurPopupFragment$getRemotePageWithCoroutines$1", mo24178f = "BlurPopupFragment.kt", mo24179l = {79}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.a.c$a */
    public static final class C0596a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public int f215k;

        /* renamed from: l */
        public final /* synthetic */ C0595c f216l;

        /* renamed from: m */
        public final /* synthetic */ RelativeLayout f217m;

        @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BlurPopupFragment$getRemotePageWithCoroutines$1$remoteResponse$1", mo24178f = "BlurPopupFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: b.a.a.a.c$a$a */
        public static final class C0597a extends C6844h implements C6866p<C7821y, C6824d<? super C0779j>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C0596a f218k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0597a(C0596a aVar, C6824d dVar) {
                super(2, dVar);
                this.f218k = aVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C0597a(this.f218k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                return C0820c.m311k(this.f218k.f216l.f213h, false, 2);
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                C0596a aVar = this.f218k;
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                return C0820c.m311k(aVar.f216l.f213h, false, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0596a(C0595c cVar, RelativeLayout relativeLayout, C6824d dVar) {
            super(2, dVar);
            this.f216l = cVar;
            this.f217m = relativeLayout;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0596a(this.f216l, this.f217m, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C8068c cVar;
            Object obj2;
            C6833a aVar = C6833a.COROUTINE_SUSPENDED;
            int i = this.f215k;
            Float f = null;
            if (i == 0) {
                C5266a.m10018q4(obj);
                C7815w wVar = C7725h0.f15274b;
                C0597a aVar2 = new C0597a(this, (C6824d) null);
                this.f215k = 1;
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
            C0595c cVar2 = this.f216l;
            Page page = jVar != null ? jVar.f549a : null;
            cVar2.f213h = page;
            if (jVar != null && jVar.f550b) {
                cVar = C8068c.m14948b();
                obj2 = new C0726r0();
            } else if (page == null) {
                cVar = C8068c.m14948b();
                obj2 = new C0727s(false, 1);
            } else {
                RelativeLayout relativeLayout = this.f217m;
                if (relativeLayout != null) {
                    C0758q.m240e(relativeLayout);
                }
                C0595c cVar3 = this.f216l;
                View view = cVar3.f214i;
                if (view != null) {
                    Page page2 = cVar3.f213h;
                    if (page2 != null) {
                        f = C0744e.m210n(page2);
                    }
                    C0758q.m245j(view, page2, f);
                    return C6777r.f13694a;
                }
                C6888i.m12446m("pageLayout");
                throw null;
            }
            cVar.mo26008g(obj2);
            return C6777r.f13694a;
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            return new C0596a(this.f216l, this.f217m, dVar).mo10326e(C6777r.f13694a);
        }
    }

    /* renamed from: c */
    public final void mo10331c() {
        View view = this.f214i;
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.fragment_loading);
            Page I = C0823f.m340I("state:loading");
            if (I != null) {
                View view2 = this.f214i;
                if (view2 != null) {
                    Page page = this.f213h;
                    C0758q.m245j(view2, I, page != null ? C0744e.m210n(page) : null);
                } else {
                    C6888i.m12446m("pageLayout");
                    throw null;
                }
            } else if (relativeLayout != null) {
                C0758q.m247l(relativeLayout);
            }
            C7815w wVar = C7725h0.f15273a;
            C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(C5266a.m9959h((C7819x0) null, 1, (Object) null))), (C6827f) null, (C7823z) null, new C0596a(this, relativeLayout, (C6824d) null), 3, (Object) null);
            return;
        }
        C6888i.m12446m("pageLayout");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C6888i.m12438e(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_list_simplified, viewGroup, false);
        C6888i.m12437d(inflate, "inflater.inflate(R.layou…lified, container, false)");
        this.f214i = inflate;
        Page page = this.f213h;
        C0820c.m303c(page != null ? page.f11035c : null);
        Page page2 = this.f213h;
        if (page2 == null || !C0744e.m188A(page2)) {
            View view = this.f214i;
            if (view != null) {
                Page page3 = this.f213h;
                C0758q.m245j(view, page3, page3 != null ? C0744e.m210n(page3) : null);
            } else {
                C6888i.m12446m("pageLayout");
                throw null;
            }
        } else {
            Page page4 = this.f213h;
            if (page4 == null || !C0744e.m214r(page4)) {
                Page page5 = this.f213h;
                if ((page5 != null ? page5.f11038f : null) != null) {
                    View view2 = this.f214i;
                    if (view2 != null) {
                        C0758q.m245j(view2, page5, page5 != null ? C0744e.m210n(page5) : null);
                    } else {
                        C6888i.m12446m("pageLayout");
                        throw null;
                    }
                }
            }
            mo10331c();
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View view3 = this.f214i;
        if (view3 != null) {
            return view3;
        }
        C6888i.m12446m("pageLayout");
        throw null;
    }
}
