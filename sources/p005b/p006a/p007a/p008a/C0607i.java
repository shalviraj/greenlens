package p005b.p006a.p007a.p008a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Style;
import p005b.p006a.p007a.p017h.C0726r0;
import p005b.p006a.p007a.p017h.C0727s;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0756o;
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
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7819x0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p416l.p417a.p419u1.C7785l;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.a.i */
public final class C0607i extends AppCompatDialogFragment {

    /* renamed from: g */
    public Page f244g;

    /* renamed from: h */
    public String f245h;

    /* renamed from: i */
    public View f246i;

    @C6840e(mo24177c = "com.appfoundry.previewer.fragments.PopupFragment$getRemotePageWithCoroutines$1", mo24178f = "PopupFragment.kt", mo24179l = {138}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.a.i$a */
    public static final class C0608a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public int f247k;

        /* renamed from: l */
        public final /* synthetic */ C0607i f248l;

        /* renamed from: m */
        public final /* synthetic */ RelativeLayout f249m;

        @C6840e(mo24177c = "com.appfoundry.previewer.fragments.PopupFragment$getRemotePageWithCoroutines$1$remoteResponse$1", mo24178f = "PopupFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: b.a.a.a.i$a$a */
        public static final class C0609a extends C6844h implements C6866p<C7821y, C6824d<? super C0779j>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C0608a f250k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0609a(C0608a aVar, C6824d dVar) {
                super(2, dVar);
                this.f250k = aVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C0609a(this.f250k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                return C0820c.m311k(this.f250k.f248l.f244g, false, 2);
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                C0608a aVar = this.f250k;
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                return C0820c.m311k(aVar.f248l.f244g, false, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0608a(C0607i iVar, RelativeLayout relativeLayout, C6824d dVar) {
            super(2, dVar);
            this.f248l = iVar;
            this.f249m = relativeLayout;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0608a(this.f248l, this.f249m, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C8068c cVar;
            Object obj2;
            C6833a aVar = C6833a.COROUTINE_SUSPENDED;
            int i = this.f247k;
            Float f = null;
            if (i == 0) {
                C5266a.m10018q4(obj);
                C7815w wVar = C7725h0.f15274b;
                C0609a aVar2 = new C0609a(this, (C6824d) null);
                this.f247k = 1;
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
            C0607i iVar = this.f248l;
            Page page = jVar != null ? jVar.f549a : null;
            iVar.f244g = page;
            if (jVar != null && jVar.f550b) {
                cVar = C8068c.m14948b();
                obj2 = new C0726r0();
            } else if (page == null) {
                cVar = C8068c.m14948b();
                obj2 = new C0727s(false, 1);
            } else {
                RelativeLayout relativeLayout = this.f249m;
                if (relativeLayout != null) {
                    C0758q.m240e(relativeLayout);
                }
                C0607i iVar2 = this.f248l;
                View view = iVar2.f246i;
                if (view != null) {
                    Page page2 = iVar2.f244g;
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
            return new C0608a(this.f248l, this.f249m, dVar).mo10326e(C6777r.f13694a);
        }
    }

    /* renamed from: b.a.a.a.i$b */
    public static final class C0610b implements View.OnTouchListener {

        /* renamed from: g */
        public final /* synthetic */ FrameLayout f251g;

        /* renamed from: h */
        public final /* synthetic */ C0607i f252h;

        /* renamed from: b.a.a.a.i$b$a */
        public static final class C0611a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0610b f253g;

            public C0611a(C0610b bVar) {
                this.f253g = bVar;
            }

            public final void run() {
                Dialog dialog = this.f253g.f252h.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }

        public C0610b(FrameLayout frameLayout, C0607i iVar) {
            this.f251g = frameLayout;
            this.f252h = iVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator animate = this.f251g.animate();
            if (!(animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(100)) == null)) {
                duration.start();
            }
            new Handler().postDelayed(new C0611a(this), 50);
            return false;
        }
    }

    /* renamed from: c */
    public final void mo10338c() {
        View view = this.f246i;
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.fragment_loading);
            Page I = C0823f.m340I("state:loading");
            if (I != null) {
                View view2 = this.f246i;
                if (view2 != null) {
                    Page page = this.f244g;
                    C0758q.m245j(view2, I, page != null ? C0744e.m210n(page) : null);
                } else {
                    C6888i.m12446m("pageLayout");
                    throw null;
                }
            } else if (relativeLayout != null) {
                C0758q.m247l(relativeLayout);
            }
            C7815w wVar = C7725h0.f15273a;
            C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(C5266a.m9959h((C7819x0) null, 1, (Object) null))), (C6827f) null, (C7823z) null, new C0608a(this, relativeLayout, (C6824d) null), 3, (Object) null);
            return;
        }
        C6888i.m12446m("pageLayout");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = this.f245h;
        if (str != null && C0756o.m229g(str)) {
            setStyle(1, R.style.CustomDialogTheme);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C6888i.m12438e(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        String str = this.f245h;
        View inflate = layoutInflater.inflate((str == null || !C0756o.m229g(str)) ? R.layout.dialog_fragment_list_simplified : R.layout.dialog_fragment_list_simplified_custom_bg, viewGroup, false);
        C6888i.m12437d(inflate, "inflater.inflate(layoutRes, container, false)");
        this.f246i = inflate;
        Page page = this.f244g;
        C0820c.m303c(page != null ? page.f11035c : null);
        Page page2 = this.f244g;
        if (page2 == null || !C0744e.m188A(page2)) {
            View view = this.f246i;
            if (view != null) {
                Page page3 = this.f244g;
                C0758q.m245j(view, page3, page3 != null ? C0744e.m210n(page3) : null);
            } else {
                C6888i.m12446m("pageLayout");
                throw null;
            }
        } else {
            Page page4 = this.f244g;
            if (page4 == null || !C0744e.m214r(page4)) {
                Page page5 = this.f244g;
                if ((page5 != null ? page5.f11038f : null) != null) {
                    View view2 = this.f246i;
                    if (view2 != null) {
                        C0758q.m245j(view2, page5, page5 != null ? C0744e.m210n(page5) : null);
                    } else {
                        C6888i.m12446m("pageLayout");
                        throw null;
                    }
                }
            }
            mo10338c();
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        String str2 = this.f245h;
        if (str2 != null && C0756o.m229g(str2)) {
            View view3 = this.f246i;
            if (view3 != null) {
                FrameLayout frameLayout = (FrameLayout) view3.findViewById(R.id.popup_parent);
                if (frameLayout != null) {
                    String str3 = this.f245h;
                    C6888i.m12436c(str3);
                    frameLayout.setBackgroundColor(C0756o.m233k(str3));
                    frameLayout.animate().alpha(1.0f).setDuration(300).start();
                    frameLayout.setOnTouchListener(new C0610b(frameLayout, this));
                }
            } else {
                C6888i.m12446m("pageLayout");
                throw null;
            }
        }
        View view4 = this.f246i;
        if (view4 != null) {
            return view4;
        }
        C6888i.m12446m("pageLayout");
        throw null;
    }

    public void onResume() {
        Window window;
        Window window2;
        Window window3;
        WindowManager windowManager;
        Display defaultDisplay;
        super.onResume();
        Page page = this.f244g;
        Style O = C0823f.m346O(page != null ? page.f11050r : null, (Boolean) null, 2);
        if (O != null) {
            Point point = new Point();
            Dialog dialog = getDialog();
            if (!(dialog == null || (window3 = dialog.getWindow()) == null || (windowManager = window3.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getSize(point);
            }
            if (O.f11148i != null && O.f11149j != null) {
                int i = point.x;
                if (this.f245h == null) {
                    Dialog dialog2 = getDialog();
                    if (!(dialog2 == null || (window2 = dialog2.getWindow()) == null)) {
                        float f = (float) i;
                        Float f2 = O.f11148i;
                        C6888i.m12436c(f2);
                        float f3 = (float) 100;
                        window2.setLayout((int) ((f2.floatValue() / f3) * f), (int) ((O.f11149j.floatValue() / f3) * f));
                    }
                    Dialog dialog3 = getDialog();
                    if (dialog3 != null && (window = dialog3.getWindow()) != null) {
                        window.setGravity(17);
                    }
                }
            }
        }
    }
}
